package example

import importedjs.Importedjs.Snap

import scala.scalajs.js.annotation.JSExport

case class Point(x: Int, y: Int) {
  def +(p: Point) = Point(x + p.x, y + p.y)

  def /(d: Int) = Point(x / d, y / d)
}

@JSExport
object ScalaJSExample {


  @JSExport
  def main(): Unit = {
    val s = Snap(800, 600);
    // Lets create big circle in the middle:
    var bigCircle = s.circle(150, 150, 100);
  }


}
