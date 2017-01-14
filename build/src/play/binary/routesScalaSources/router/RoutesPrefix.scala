
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/dev/workspace/studyapp/conf/routes
// @DATE:Sat Jan 14 14:07:48 KST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
