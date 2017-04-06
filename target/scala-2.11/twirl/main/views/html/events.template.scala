
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object events_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class events extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.Event],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events: List[models.Event],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""

"""),_display_(/*3.2*/main("Events",user)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""


    """),format.raw/*6.5*/("""<!--..CONTENT..-->
    <div class="container-fluid" id="eventContent">
        <div class="row">
            <div class="col-sm-3">
                <div class="sidebar-nav">
                    <div class="navbar navbar-default" role="navigation">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-navbar-collapse">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <span class="visible-xs navbar-brand">Sidebar menu</span>
                        </div>
                        <div class="navbar-collapse collapse sidebar-navbar-collapse">
                            <ul class="nav navbar-nav">
                                <li class="active"><a href="#"><h3>EVENT CATEGORIES</h3></a></li>
                                <li><a href="#"><h4>Music</h4></a></li>
                                <li><a href="#"><h4>Sports</h4></a></li>
                                <li><a href="#"><h4>Comedy</h4></a></li>
                                <li><a href="#"><h4>Theatre</h4></a></li>
                                <li><a href="#"><h4>Racing</h4></a></li>
                                <li class="active"><a href="#"><h3>BY COUNTRY</h3></a></li>
                                <li><a href="#"><h4>Ireland</h4></a></li>
                                <li><a href="#"><h4>UK</h4></a></li>

                                <li class="active"><a href="#"><h3>BY MONTH</h3></a></li>

                                <li><a href="#"><h4>January</h4></a></li>
                                <li><a href="#"><h4>February</h4></a></li>
                                <li><a href="#"><h4>March</h4></a></li>
                                <li><a href="#"><h4>April</h4></a></li>
                                <li><a href="#"><h4>May</h4></a></li>
                                <li><a href="#"><h4>June</h4></a></li>
                                <li><a href="#"><h4>July</h4></a></li>
                                <li><a href="#"><h4>August</h4></a></li>
                                <li><a href="#"><h4>September</h4></a></li>
                                <li><a href="#"><h4>October</h4></a></li>
                                <li><a href="#"><h4>November</h4></a></li>
                                <li><a href="#"><h4>December</h4></a></li>
                            </ul>
                            <br>
                            <br>
                        </div><!--/.nav-collapse -->
                    </div>
                </div>
            </div>




                <!--Main content--->
            <div class="col-sm-9">
                <div class="row"><br>
                    <strong>Display</strong>

                    <div class="btn-group">
                        <a href="#" id="list" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-th-list">
                        </span>List</a> <a href="#" id="grid" class="btn btn-default btn-sm"><span
                    class="glyphicon glyphicon-th"></span>Grid</a>
                    </div>
                </div>
                <br>

                <div id="products" class="row list-group">
                        <!-- Start of for loop - Fo reach e in events add a row -->
                    """),_display_(/*73.22*/for(e <- events) yield /*73.38*/ {_display_(Seq[Any](format.raw/*73.40*/("""
                        """),format.raw/*74.25*/("""<a href=""""),_display_(/*74.35*/routes/*74.41*/.HomeController.eventTicket()),format.raw/*74.70*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">

                                    <img class="group list-group-image" src="http://placehold.it/400x250/000/fff" alt="" >
                                    <div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*81.42*/e/*81.43*/.getTitle),format.raw/*81.52*/("""</h4>
                                        <p class="group inner list-group-item-text">
                                            """),_display_(/*83.46*/e/*83.47*/.getEventName),format.raw/*83.60*/("""
                                            """),format.raw/*84.45*/("""<br>
                                            """),_display_(/*85.46*/e/*85.47*/.getLocation),format.raw/*85.59*/("""
                                            """),format.raw/*86.45*/("""<br>
                                            """),_display_(/*87.46*/e/*87.47*/.getDate),format.raw/*87.55*/("""
                                            """),format.raw/*88.45*/("""<br>
                                            Starting from €
                                        </p>
                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                                """),_display_(/*93.50*/if(user.getRole.equals("admin"))/*93.82*/ {_display_(Seq[Any](format.raw/*93.84*/("""
                                                    """),format.raw/*94.53*/("""<a href=""""),_display_(/*94.63*/routes/*94.69*/.HomeController.deleteEvent(e.getEventID)),format.raw/*94.110*/("""" class = "btn btn-danger"
                                                    onclick="return confirmDel();">
                                                        <span class="glyphicon glyphicon-trash"></span>
                                                    </a>
                                                """)))}),format.raw/*98.50*/("""
                                            """),format.raw/*99.45*/("""</div>


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>

                    """)))}),format.raw/*108.22*/(""" """),format.raw/*108.23*/("""<!-- End of for loop -->


                    <div class="col-xs-12 col-md-6">

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!--END CONTENT-->

        <!--Script for displaying products in grid/list-->
    <script>
            $(document).ready(function() """),format.raw/*123.42*/("""{"""),format.raw/*123.43*/("""
                """),format.raw/*124.17*/("""$('#list').click(function(event)"""),format.raw/*124.49*/("""{"""),format.raw/*124.50*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*124.122*/("""}"""),format.raw/*124.123*/(""");
                $('#grid').click(function(event)"""),format.raw/*125.49*/("""{"""),format.raw/*125.50*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*125.174*/("""}"""),format.raw/*125.175*/(""");
            """),format.raw/*126.13*/("""}"""),format.raw/*126.14*/(""");</script>

    <!--Script for confirming delete of event-->
    <script>
        function confirmDel()"""),format.raw/*130.30*/("""{"""),format.raw/*130.31*/("""
            """),format.raw/*131.13*/("""return confirm('Are you sure?');
        """),format.raw/*132.9*/("""}"""),format.raw/*132.10*/("""
    """),format.raw/*133.5*/("""</script>
""")))}))
      }
    }
  }

  def render(events:List[models.Event],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(events,user)

  def f:((List[models.Event],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (events,user) => apply(events,user)

  def ref: this.type = this

}


}

/**/
object events extends events_Scope0.events
              /*
                  -- GENERATED --
                  DATE: Thu Apr 06 12:05:28 BST 2017
                  SOURCE: C:/Users/Jay/Desktop/TicketStore/app/views/events.scala.html
                  HASH: 14b10a92777d96987370860952b1217cf9fe69a5
                  MATRIX: 777->1|924->53|954->58|981->77|1020->79|1056->89|4767->3773|4799->3789|4839->3791|4893->3817|4930->3827|4945->3833|4995->3862|5466->4306|5476->4307|5506->4316|5671->4454|5681->4455|5715->4468|5789->4514|5867->4565|5877->4566|5910->4578|5984->4624|6062->4675|6072->4676|6101->4684|6175->4730|6501->5029|6542->5061|6582->5063|6664->5117|6701->5127|6716->5133|6779->5174|7135->5499|7209->5545|7474->5778|7504->5779|7866->6112|7896->6113|7943->6131|8004->6163|8034->6164|8136->6236|8167->6237|8248->6289|8278->6290|8432->6414|8463->6415|8508->6431|8538->6432|8675->6540|8705->6541|8748->6555|8818->6597|8848->6598|8882->6604
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|104->73|104->73|104->73|105->74|105->74|105->74|105->74|112->81|112->81|112->81|114->83|114->83|114->83|115->84|116->85|116->85|116->85|117->86|118->87|118->87|118->87|119->88|124->93|124->93|124->93|125->94|125->94|125->94|125->94|129->98|130->99|139->108|139->108|154->123|154->123|155->124|155->124|155->124|155->124|155->124|156->125|156->125|156->125|156->125|157->126|157->126|161->130|161->130|162->131|163->132|163->132|164->133
                  -- GENERATED --
              */
          