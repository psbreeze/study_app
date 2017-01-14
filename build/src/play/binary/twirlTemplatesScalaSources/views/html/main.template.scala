
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._;import controllers._;import play.api.templates.PlayMagic._;import play.api.i18n._;import play.api.mvc._;import play.api.data._;import views.html._;

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">

    </head>
    <body>
        """),format.raw/*20.32*/("""
        """),_display_(/*21.10*/content),format.raw/*21.17*/("""

      """),format.raw/*23.7*/("""<script src=""""),_display_(/*23.21*/routes/*23.27*/.Assets.versioned("javascripts/main.js")),format.raw/*23.67*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

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
                  DATE: Sat Jan 14 14:07:50 KST 2017
                  SOURCE: C:/dev/workspace/studyapp/app/views/main.scala.html
                  HASH: 1363d33385e86b76ea25f503d5161128076dd769
                  MATRIX: 790->266|915->296|945->300|1028->408|1065->418|1100->426|1126->431|1216->494|1231->500|1294->541|1383->603|1398->609|1459->648|1526->778|1564->789|1592->796|1629->806|1670->820|1685->826|1746->866
                  LINES: 19->7|24->7|26->9|29->12|30->13|30->13|30->13|31->14|31->14|31->14|32->15|32->15|32->15|36->20|37->21|37->21|39->23|39->23|39->23|39->23
                  -- GENERATED --
              */
          