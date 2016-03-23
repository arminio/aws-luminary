package example

import importedjs.Importedjs
import importedjs.Importedjs.Snap
import importedjs.Snap.{Element, Fragment, SnapObj}
import importedjs.mina.MinaObj
import org.scalajs.dom._
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => glb, literal}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import scala.scalajs.js.|

case class Point(x: Int, y: Int) {
  def +(p: Point) = Point(x + p.x, y + p.y)

  def /(d: Int) = Point(x / d, y / d)
}

@JSExport
object ScalaJSExample {

  type Dict = js.Dictionary[String | Double | Boolean | js.Any]

  @JSExport
  def main(): Unit = {
    val s = Snap(800, 600)
    // Lets create big circle in the middle:
    val g: Element = s.group()

    //    val c = s.circle(150, 150, 100)
    //    c.attr(js.Dynamic.literal(
    //      "fill" -> "#bada55",
    //      "stroke" -> "#000",
    //      "strokeWidth" -> 5))

    //    c.attr(js.Dynamic.literal("fill" -> "red"))
    //     g.append(c)
    val hoverover: js.Function1[MouseEvent, Unit] = (me: MouseEvent) => {
      //      g.attr(js.Dynamic.literal("fill" -> "blue"))
      g.animate(literal("transform" -> "s2r45,150,150"),
        1000d,
        (y: Double) => MinaObj.bounce(y))


      ()
    }
    //    def clicken = (me: MouseEvent) => {
    //      //      g.attr(js.Dynamic.literal("fill" -> "blue"))
    //      glb.console.log("boooooo click")
    //      ()
    //    }
    val hoverout: js.Function1[MouseEvent, Unit] = (me: MouseEvent) => {
      g.animate(literal("transform" -> "s1r0,150,150"),
        1000d,
        (y: Double) => MinaObj.bounce(y))

      ()
    }

    //    c.click(clicken)
    //    c.hover(hoverover, hoverout)

    //    g.hover(hoverover, hoverout)
    //    SnapObj.load("http://www.html5rocks.com/static/demos/svgmobile_fundamentals/images/HTML5-logo.svg",
    SnapObj.load("HTML5-logo.svg",
      (x: Fragment) => {
        glb.console.log(x)
        println(x)
        g.append(x)
        g.attr(literal("scale" -> "2"))
        //        g.click(clicken)

      })
    g.hover(hoverover, hoverout)


  }


}
