package example

import facade.not_good._

import scala.scalajs.js.annotation.JSExport

case class Point(x: Int, y: Int) {
  def +(p: Point) = Point(x + p.x, y + p.y)

  def /(d: Int) = Point(x / d, y / d)
}

//@JSExport
object ScalaJSExample {

  def makeImage(stage: Stage, layer: Layer): Unit = {
//    val image = new Image() {}
//
//    image.on("load", () => {
//      val i = new Image(){}
//      i.x(200)
//      i.y(200)
//      i.image(image)
//      i.width(200)
//      i.width(200)
//    })
//
//
//    image.asInstanceOf[HTMLImageElement].src = "http://konvajs.github.io/assets/yoda.jpg"
//    image


        Image.fromURL("http://konvajs.github.io/assets/yoda.jpg", (i: Image) => {
          println(i.width())
          println(i.height())
          println("o" * 20)
          i.x(stage.getWidth() / 2)
          i.y( stage.getHeight() / 2)
//          println(i.))
          println(i.y())
          layer.add(i)

        }
        )


  }

  @JSExport
  def main(): Unit = {
    val stage: Stage = makeStage


    // then create layer
    val layer = new Layer();

    val circle: Circle = makeCircle(stage)

    // add the shape to the layer
//    layer.add(circle)

    val moved: Node = circle.move(Vector2d(100, 100))
    val wedge: Wedge = makeWedge(moved)

    makeImage(stage, layer )

//    layer.add(wedge)
    // add the layer to the stage
    stage.add(layer)
    println("the end!")
    //    layer.add(move)


  }

  def makeCircle(stage: Stage): Circle = {
    val circleConfig: CircleConfig = CircleConfig(
      x = stage.getWidth() / 2,
      y = stage.getHeight() / 2,
      radius = 60,
      fill = "red",
      stroke = "black",
      strokeWidth = 7)


    // create our shape
    val circle = new Circle(circleConfig)
    circle
  }

  //  def mainXXX(canvas: html.Canvas): Unit = {
  //    val ctx = canvas.getContext("2d")
  //      .asInstanceOf[dom.CanvasRenderingContext2D]
  //
  //    var count = 0
  //    var p = Point(0, 0)
  //    val corners = Seq(Point(255, 255), Point(0, 255), Point(128, 0))
  //
  //    def clear() = {
  //      ctx.fillStyle = "black"
  //      ctx.fillRect(0, 0, 255, 255)
  //    }
  //
  //    def run = for (i <- 0 until 10) {
  //      if (count % 3000 == 0) clear()
  //      count += 1
  //      p = (p + corners(Random.nextInt(3))) / 2
  //
  //      val height = 512.0 / (255 + p.y)
  //      val r = (p.x * height).toInt
  //      val g = ((255 - p.x) * height).toInt
  //      val b = p.y
  //      ctx.fillStyle = s"rgb($g, $r, $b)"
  //
  //      ctx.fillRect(p.x, p.y, 1, 1)
  //    }
  //
  //    dom.setInterval(() => run, 50)
  //  }

  def makeStage: Stage = {
    // first we need to create a stage
    val stage = new Stage(StageConfig(
      container = "container", // id of container <div>
      width = 500,
      height = 500
    ))
    stage
  }

  def makeWedge(moved: Node): Wedge = {
    val wedgeConfig = WedgeConfig(
      radius = 70,
      angle = 60,
      clockwise = false)


    wedgeConfig.x = moved.x()
    wedgeConfig.y = moved.y()
    wedgeConfig.fill = "green"
    wedgeConfig.stroke = "black"
    wedgeConfig.strokeWidth = 4
    wedgeConfig.rotation = -120



    val wedge = new Wedge(wedgeConfig)
    wedge
  }
}
