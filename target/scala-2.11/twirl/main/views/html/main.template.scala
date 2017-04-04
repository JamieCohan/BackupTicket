
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String,user:models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.55*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE HTML>
<title>"""),_display_(/*10.9*/title),format.raw/*10.14*/("""</title>

<head>
    <!-- CSS link -->
    <link rel="stylesheet" href=""""),_display_(/*14.35*/routes/*14.41*/.Assets.versioned("stylesheets/style.css")),format.raw/*14.83*/("""">
    <!-- Bootstrap link -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Javascript link -->
    <script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
<link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
    <div class="container-fluid" id="nav-top">
        <div class="row">
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                <a href=""""),_display_(/*29.27*/routes/*29.33*/.HomeController.index()),format.raw/*29.56*/(""""> <h1 id="logo">TC <span> Events</span></h1></a>
            </div>
            <div class="col-lg-8 col-md-8 col-sm-8 col-xs-8" id="">
                <!--Search bar-->
                <div class="nav navbar-nav navbar-center" id="search">
                    <form class="navbar-form" role="search">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="Search" name="srch-term" id="srch-term">
                            <div class="input-group-btn">
                                <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                            </div>
                        </div>
                    </form>
                </div>
                <!--/Search Bar-->
                <div class="nav navbar-nav navbar-right" id="nav-buttons">
                    """),_display_(/*45.22*/if(user != null)/*45.38*/{_display_(Seq[Any](format.raw/*45.39*/("""
                        """),format.raw/*46.25*/("""<a href=""""),_display_(/*46.35*/routes/*46.41*/.HomeController.cart()),format.raw/*46.63*/("""" class="btn btn-success btn-circle btn-lg"><i class="glyphicon glyphicon-shopping-cart"></i></a>
                        <a href=""""),_display_(/*47.35*/routes/*47.41*/.LoginController.logout()),format.raw/*47.66*/("""" class="btn btn-success btn-lg round"><span class="glyphcon glyphicon-pencil"></span>LOGOUT</a>
                        """),_display_(/*48.26*/if(user.getRole.equals("admin"))/*48.58*/ {_display_(Seq[Any](format.raw/*48.60*/("""
                            """),format.raw/*49.29*/("""<a href=""""),_display_(/*49.39*/routes/*49.45*/.HomeController.addEvent()),format.raw/*49.71*/("""" class="btn btn-success btn-lg round"><i class="glyphicon glyphicon-plus"></i>Add event</a>
                            <a href=""""),_display_(/*50.39*/routes/*50.45*/.HomeController.addTicket()),format.raw/*50.72*/("""" class="btn btn-success btn-lg round"><i class="glyphicon glyphicon-plus"></i>Add ticket</a>
                        """)))}),format.raw/*51.26*/("""
                    """)))}/*52.22*/else/*52.26*/{_display_(Seq[Any](format.raw/*52.27*/("""
                        """),format.raw/*53.25*/("""<a href=""""),_display_(/*53.35*/routes/*53.41*/.LoginController.login()),format.raw/*53.65*/("""" class="btn btn-success btn-circle btn-lg"><i class="glyphicon glyphicon-user"></i>Login</a>
                        <a href=""""),_display_(/*54.35*/routes/*54.41*/.HomeController.signUp()),format.raw/*54.65*/("""" class="btn btn-success btn-lg round"><span class="glyphcon glyphicon-pencil"></span>Sign up</a>
                    """)))}),format.raw/*55.22*/("""
                """),format.raw/*56.17*/("""</div>
            </div>
        </div>
        <div id="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="nav-bottom">
                    <a href=""""),_display_(/*62.31*/routes/*62.37*/.HomeController.index),format.raw/*62.58*/("""">HOME</a>
                    <a href=""""),_display_(/*63.31*/routes/*63.37*/.HomeController.events),format.raw/*63.59*/("""">EVENTS</a>
                    <a href=""""),_display_(/*64.31*/routes/*64.37*/.HomeController.aboutUs),format.raw/*64.60*/("""">ABOUT US</a>
                    <a href=""""),_display_(/*65.31*/routes/*65.37*/.HomeController.contact),format.raw/*65.60*/("""">CONTACT US</a>
                </div>
            </div>
        </div>
    </div>

        """),_display_(/*71.10*/content),format.raw/*71.17*/("""

"""),format.raw/*73.1*/("""<div class="container" id = "footer">
        <div class="row">
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 pull-left">
                <a href=""""),_display_(/*76.27*/routes/*76.33*/.HomeController.index()),format.raw/*76.56*/(""""><h2>TC <span>EVENTS</h2></a>
            </div>
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6" id="icon div">
                <a href="#"><i class="fa fa-3x fa-fw fa-instagram text-inverse pull-right" id="icon"></i></a>
                <a href="#"><i class="fa fa-3x fa-fw fa-twitter text-inverse pull-right" id="icon"></i></a>
                <a href="#"><i class="fa fa-3x fa-fw fa-facebook text-inverse pull-right" id="icon"></i></a>
                <a href="http://github.com/ShaneCotter/TicketStore"><i class="fa fa-3x fa-fw fa-github text-inverse pull-right" id="icon"></i></a>
            </div>
        </div>
    </div>
</body>
  
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Apr 04 11:08:32 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/main.scala.html
                  HASH: 401f600a74b95ad259c7e7a97bbbbd9aecb8291f
                  MATRIX: 1020->260|1168->313|1196->315|1246->339|1272->344|1372->417|1387->423|1450->465|2570->1558|2585->1564|2629->1587|3567->2498|3592->2514|3631->2515|3684->2540|3721->2550|3736->2556|3779->2578|3938->2710|3953->2716|3999->2741|4148->2863|4189->2895|4229->2897|4286->2926|4323->2936|4338->2942|4385->2968|4543->3099|4558->3105|4606->3132|4756->3251|4797->3273|4810->3277|4849->3278|4902->3303|4939->3313|4954->3319|4999->3343|5154->3471|5169->3477|5214->3501|5364->3620|5409->3637|5652->3853|5667->3859|5709->3880|5777->3921|5792->3927|5835->3949|5905->3992|5920->3998|5964->4021|6036->4066|6051->4072|6095->4095|6217->4190|6245->4197|6274->4199|6463->4361|6478->4367|6522->4390
                  LINES: 32->7|37->7|39->9|40->10|40->10|44->14|44->14|44->14|59->29|59->29|59->29|75->45|75->45|75->45|76->46|76->46|76->46|76->46|77->47|77->47|77->47|78->48|78->48|78->48|79->49|79->49|79->49|79->49|80->50|80->50|80->50|81->51|82->52|82->52|82->52|83->53|83->53|83->53|83->53|84->54|84->54|84->54|85->55|86->56|92->62|92->62|92->62|93->63|93->63|93->63|94->64|94->64|94->64|95->65|95->65|95->65|101->71|101->71|103->73|106->76|106->76|106->76
                  -- GENERATED --
              */
          