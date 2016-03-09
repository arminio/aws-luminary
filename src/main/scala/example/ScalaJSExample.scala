package example

import facade.importedjs.Konva._
import org.scalajs.dom
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import scala.util.Random

case class Point(x: Int, y: Int) {
  def +(p: Point) = Point(x + p.x, y + p.y)

  def /(d: Int) = Point(x / d, y / d)
}

@JSExport
object ScalaJSExample {

  @JSExport
  def main(foo: js.Any): Unit = {
    // first we need to create a stage
    val stage = new Stage(StageConfig(
      container = "container", // id of container <div>
      width = 500,
      height = 500
    ))


    // then create layer
    val layer = new Layer();

    // create our shape
    val circle = new Circle(CircleConfig(
      x = (stage.getWidth () / 2).toInt,
      y = (stage.getHeight () / 2).toInt,
      radius = 70,
      fill= "red ",
      stroke = "blue ",
      strokeWidth = 1))


    // add the shape to the layer
    layer.add(circle)

    // add the layer to the stage
    stage.add(layer)
  }

  def mainXXX(canvas: html.Canvas): Unit = {
    val ctx = canvas.getContext("2d")
      .asInstanceOf[dom.CanvasRenderingContext2D]

    var count = 0
    var p = Point(0, 0)
    val corners = Seq(Point(255, 255), Point(0, 255), Point(128, 0))

    def clear() = {
      ctx.fillStyle = "black"
      ctx.fillRect(0, 0, 255, 255)
    }

    def run = for (i <- 0 until 10) {
      if (count % 3000 == 0) clear()
      count += 1
      p = (p + corners(Random.nextInt(3))) / 2

      val height = 512.0 / (255 + p.y)
      val r = (p.x * height).toInt
      val g = ((255 - p.x) * height).toInt
      val b = p.y
      ctx.fillStyle = s"rgb($g, $r, $b)"

      ctx.fillRect(p.x, p.y, 1, 1)
    }

    dom.setInterval(() => run, 50)
  }
}
