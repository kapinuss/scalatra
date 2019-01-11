package scalatra

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

  get("/test") {
    views.html.second
  }

  get("/chapter/:number") {
    views.html.chapter(params("number").toInt)
  }

  get("/article/:number") {
    views.html.article(params("number").toInt)
  }

  get("/new") {
    views.html.delete()
  }

}
