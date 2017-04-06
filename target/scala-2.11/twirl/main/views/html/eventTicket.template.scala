
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object eventTicket_Scope0 {
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

class eventTicket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.Ticket],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tickets: List[models.Ticket],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.56*/("""

"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("Tickets",user)/*6.22*/ {_display_(Seq[Any](format.raw/*6.24*/("""
    """),format.raw/*7.5*/("""<!--..CONTENT..-->
    <div class="container" id = "seatingplans">
        <div class="row well">
            <div class="col-lg-5 col-md-5 col-sm-6 col-xs-12">
                <img src="http://placehold.it/400x250/000/fff" alt="">
            </div>

            <div class="col-lg-7 col-md-7 col-sm-6 col-xs-12" id = "eventInfo">
                <h1>Event name</h1>
                <p>Location here : </p>
                <p>Date/time here : </p>
                <p>Description here : </p>
            </div>
        </div>

        <div class="row well" id="tickets">
            <div class="col-lg-8 col-md-8 col-sm-6 col-xs-12">
                <div class="row">
                    <h1>  </h1>
                    """),_display_(/*26.22*/if(user.getRole.equals("admin"))/*26.54*/ {_display_(Seq[Any](format.raw/*26.56*/("""
                        """),format.raw/*27.25*/("""<a href=""""),_display_(/*27.35*/routes/*27.41*/.HomeController.addTicket()),format.raw/*27.68*/("""" class="btn btn-success btn-lg round">Add ticket</a>
                    """)))}),format.raw/*28.22*/("""
                    """),format.raw/*29.21*/("""<br>
                    <br>
                </div>
                <br>
                </div>

                <div id="products" class="row list-group">
                """),_display_(/*36.18*/for(t <- tickets) yield /*36.35*/ {_display_(Seq[Any](format.raw/*36.37*/("""
                    """),format.raw/*37.21*/("""<div class="item  col-xs-4 col-lg-4">
                        <div class="thumbnail">

                            <h1>"""),_display_(/*40.34*/t/*40.35*/.getTicketType),format.raw/*40.49*/("""</h1>
                            <div class="caption">
                                <p class="group inner list-group-item-text">
                                """),_display_(/*43.34*/t/*43.35*/.getPrice),format.raw/*43.44*/("""

                                """),format.raw/*45.33*/("""</p>
                                    <!-- Edit Ticket -->
                                <div class="row">
                                    <div class="col-xs-12 col-md-6">

                                    """),_display_(/*50.38*/if(user.getRole.equals("admin"))/*50.70*/ {_display_(Seq[Any](format.raw/*50.72*/("""
                                        """),format.raw/*51.41*/("""<a href=""""),_display_(/*51.51*/routes/*51.57*/.HomeController.updateTicket(t.getTicketID)),format.raw/*51.100*/("""" class = "btn-xs btn-danger">

                                            <span class="glyphicon glyphicon-pencil"></span></a>
                                    """)))}),format.raw/*54.38*/("""

                                    """),format.raw/*56.37*/("""</div>


                                </div>
                                <!-- Delete Ticket -->
                                <div class="row">
                                    <div class="col-xs-12 col-md-6">

                                    """),_display_(/*64.38*/if(user.getRole.equals("admin"))/*64.70*/ {_display_(Seq[Any](format.raw/*64.72*/("""
                                        """),format.raw/*65.41*/("""<a href=""""),_display_(/*65.51*/routes/*65.57*/.HomeController.deleteTicket(t.getTicketID)),format.raw/*65.100*/("""" class = "btn-xs btn-danger"
                                        onclick="return confirmDel();">
                                            <span class="glyphicon glyphicon-trash"></span></a>
                                    """)))}),format.raw/*68.38*/("""

                                    """),format.raw/*70.37*/("""</div>


                                </div>
                            <!-- Delete Ticket -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            """)))}),format.raw/*80.14*/("""


            """),format.raw/*83.13*/("""<script>
                    function confirmDel()"""),format.raw/*84.42*/("""{"""),format.raw/*84.43*/("""
                        """),format.raw/*85.25*/("""return confirm('Are you sure?');
                    """),format.raw/*86.21*/("""}"""),format.raw/*86.22*/("""
            """),format.raw/*87.13*/("""</script>

                <!--END CONTENT-->
""")))}))
      }
    }
  }

  def render(tickets:List[models.Ticket],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(tickets,user)

  def f:((List[models.Ticket],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (tickets,user) => apply(tickets,user)

  def ref: this.type = this

}


}

/**/
object eventTicket extends eventTicket_Scope0.eventTicket
              /*
                  -- GENERATED --
                  DATE: Thu Apr 06 13:27:47 BST 2017
                  SOURCE: C:/Users/Jay/Desktop/TicketStore/app/views/eventTicket.scala.html
                  HASH: 4e1266b836e90b4205620b12632526eea8e364b6
                  MATRIX: 788->1|952->55|982->77|1012->82|1040->102|1079->104|1111->110|1878->850|1919->882|1959->884|2013->910|2050->920|2065->926|2113->953|2220->1029|2270->1051|2478->1232|2511->1249|2551->1251|2601->1273|2751->1396|2761->1397|2796->1411|2992->1580|3002->1581|3032->1590|3096->1626|3347->1850|3388->1882|3428->1884|3498->1926|3535->1936|3550->1942|3615->1985|3815->2154|3883->2194|4178->2462|4219->2494|4259->2496|4329->2538|4366->2548|4381->2554|4446->2597|4715->2835|4783->2875|5071->3132|5117->3150|5196->3201|5225->3202|5279->3228|5361->3282|5390->3283|5432->3297
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|56->26|56->26|56->26|57->27|57->27|57->27|57->27|58->28|59->29|66->36|66->36|66->36|67->37|70->40|70->40|70->40|73->43|73->43|73->43|75->45|80->50|80->50|80->50|81->51|81->51|81->51|81->51|84->54|86->56|94->64|94->64|94->64|95->65|95->65|95->65|95->65|98->68|100->70|110->80|113->83|114->84|114->84|115->85|116->86|116->86|117->87
                  -- GENERATED --
              */
          