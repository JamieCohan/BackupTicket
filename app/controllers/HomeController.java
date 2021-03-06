package controllers;

import controllers.*;
import models.users.User;
import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;
import java.util.*;
import javax.inject.Inject;
import views.html.*;
// Import models
import models.*;


public class HomeController extends Controller {

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f){
        this.formFactory = f;
    }

    public Result index() {
        return ok(index.render(getUserFromSession()));
    }

    public Result aboutUs() {
        return ok(aboutUs.render(getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addEvent() {

        Form<Event> addEventForm = formFactory.form(Event.class);
        return ok(addEvent.render(addEventForm,getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addEventSubmit(){

        Form<Event> newEventForm = formFactory.form(Event.class).bindFromRequest();

        if(newEventForm.hasErrors()){

            return badRequest(addEvent.render(newEventForm,getUserFromSession()));
        }

        Event newEvent = newEventForm.get();

        newEvent.save();

        flash("success", "Event " + newEvent.getEventName() + " has been created. Do not forget to add Tickets");

        return redirect(controllers.routes.HomeController.events());
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteEvent(Long id){

        Event.find.ref(id).delete();

        flash("success","Event has been deleted");

        return redirect(routes.HomeController.events());
    }


    public Result cart() {
        return ok(cart.render(getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result checkout() {
        return ok(checkout.render(getUserFromSession()));
    }

    public Result contact() {
        return ok(contact.render(getUserFromSession()));
    }

    public Result events() {

        // Get list of events
        List<Event> eventsList = Event.findAll();
        // Render the list events view, passing parameters
        return ok(events.render(eventsList,getUserFromSession()));
    }

    public Result eventTicket() {
        List<Ticket> ticketList = Ticket.findAll();

        return ok(eventTicket.render(ticketList,getUserFromSession()));
    }

    public Result signUp() {
        Form<User> addUserForm = formFactory.form(User.class);
        return ok(signUp.render(addUserForm,getUserFromSession()));
    }

    public Result signUpSubmit(){
        Form<User> newUser = formFactory.form(User.class).bindFromRequest();
        User user = newUser.get();
        user.setRole("user");
        user.save();
        return redirect(routes.LoginController.login());
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addTicket() {

        Form<Ticket> addTicketForm = formFactory.form(Ticket.class);

        return ok(addTicket.render(addTicketForm,getUserFromSession()));

    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addTicketSubmit(){

        Form<Ticket> newTicketForm = formFactory.form(Ticket.class).bindFromRequest();

        if(newTicketForm.hasErrors()){
            return badRequest(addTicket.render(newTicketForm,getUserFromSession()));
        }

        Ticket newTicket = newTicketForm.get();

        if(newTicket.getTicketID() == null) {
            newTicket.save();
        }
        else if (newTicket.getTicketID() !=null){
            newTicket.update();
        }

        flash("success", "Ticket " + newTicket.getTicketType() + "has been created");

        return redirect(controllers.routes.HomeController.index());
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result deleteTicket(Long id){

        Ticket.find.ref(id).delete();

        flash("success","Ticket has been deleted");

        return redirect(routes.HomeController.eventTicket());
    }

    private User getUserFromSession(){
        return User.getUserById(session().get("email"));
    }



    @Transactional
    public Result updateTicket(Long id){

    Ticket t;
    Form<Ticket> ticketForm;

    try {
        t = Ticket.find.byId(id);

        ticketForm = formFactory.form(Ticket.class).fill(t);

    } catch (Exception ex) {
        return badRequest("error");
    }

    return ok(addTicket.render(ticketForm, getUserFromSession()));
}
}
