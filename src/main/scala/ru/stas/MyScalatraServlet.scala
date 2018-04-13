package ru.stas

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

  get("/test") {
    <h1>Hello, world!</h1>
  }

}
