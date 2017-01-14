
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._;import controllers._;import play.api.templates.PlayMagic._;import play.api.i18n._;import play.api.mvc._;import play.api.data._;import views.html._;

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to Play!</h1>
""")))}),format.raw/*5.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Jan 14 14:07:50 KST 2017
                  SOURCE: C:/dev/workspace/studyapp/app/views/index.scala.html
                  HASH: 85a5b300e07750f76b8319932489b222fefbdc7e
                  MATRIX: 521->1|617->3|647->8|678->31|717->33|747->37|804->65
                  LINES: 14->1|19->1|21->3|21->3|21->3|22->4|23->5
                  -- GENERATED --
              */
          