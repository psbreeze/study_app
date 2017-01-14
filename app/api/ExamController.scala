package api.exam

import javax.inject._
import play.api._
import play.api.mvc._
import scala.io._
import java.nio.charset._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class ExamController @Inject() extends Controller {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action { implicit request => 
    {
      println("ExamController.Index: " + request)
      var mockJson = "./app/api/exam_mock.json"
      
      implicit val codec = scala.io.Codec("UTF-8")
      codec.onMalformedInput(CodingErrorAction.REPLACE)
      codec.onUnmappableCharacter(CodingErrorAction.REPLACE)

      val source = Source.fromFile(mockJson)
      val lines = try source.mkString finally source.close()

      Ok(lines)
    }
  }
}
