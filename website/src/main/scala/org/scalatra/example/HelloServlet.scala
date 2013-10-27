package org.scalatra.example

import org.scalatra._
import scalate.ScalateSupport

class HelloServlet extends ScalatraServlet with ScalateSupport {

  get("/") {

    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="/"></a>.
      </body>
    </html>
  }
  
}