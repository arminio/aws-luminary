package example

import importedjs.Importedjs.Snap
import importedjs.Snap.{Element, Fragment, SnapObj}
import importedjs.mina.MinaObj
import org.scalajs.dom._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal, global => glb}
import scala.scalajs.js.annotation.JSExport
import scala.scalajs.js.{Function1, |}
import scala.util.Random

case class Point(x: Int, y: Int) {
  def +(p: Point) = Point(x + p.x, y + p.y)

  def /(d: Int) = Point(x / d, y / d)
}

@JSExport
object ScalaJSExample {

  type Dict = js.Dictionary[String | Double | Boolean | js.Any]


  val myMatrix = SnapObj.matrix()
  //    myMatrix.scale(4, 2); // play with scaling before and after the rotate
  myMatrix.translate(200, 400);
  // this translate will not be applied to the rotation
  //    myMatrix.rotate(45); // rotate

  //    val myInvertedMatrix = myMatrix.invert();
  val string: String = myMatrix.toTransformString()


  def randomTransformation() = {
    val myMatrix = SnapObj.matrix()
    myMatrix.scale(0.4); // play with scaling before and after the rotate
    myMatrix.translate(Random.nextDouble() * 400, Random.nextDouble() * 700); // this translate will not be applied to the rotation
    //    myMatrix.rotate(45); // rotate

    //    val myInvertedMatrix = myMatrix.invert();
    val transformString: String = myMatrix.toTransformString()

    glb.console.log(transformString)
    transformString
  }

  val s = Snap(1800, 900)

  @JSExport
  def main(): Unit = {
    // Lets create big circle in the middle:
    val g = s.group()

    val c = s.circle(150, 150, 100)
c.drag()
    val hoverover: Function1[MouseEvent, Unit] = (me: MouseEvent) => {
      //      g.attr(js.Dynamic.literal("fill" -> "blue"))
      g.animate(literal("transform" -> "s0.52"),
        1000d,
        (y: Double) => MinaObj.bounce(y))

      c.attr(literal("fill" -> "pink",
        "stroke" -> "yellow",
        "strokeWidth" -> 15))
      println("hoverover")

    }

    val hoverout: Function1[MouseEvent, Unit] = (me: MouseEvent) => {
      g.animate(literal("transform" -> "s1r0,150,150"),
        1000d,
        (y: Double) => MinaObj.bounce(y))

      c.attr(literal("fill" -> "blue",
        "stroke" -> "black",
        "strokeWidth" -> 13))

      println("hoverout")

    }


    loadSvg("svg/aws/box.svg", g)
//    loadSvg("svg/aws/bucketbox.svg", g)
//    c.hover(hoverover, hoverout)


    //    val myMatrix = SnapObj.matrix()
    ////    myMatrix.scale(4, 2); // play with scaling before and after the rotate
    //    myMatrix.translate(200, 200); // this translate will not be applied to the rotation
    //    myMatrix.rotate(45); // rotate

    //    val myInvertedMatrix = myMatrix.invert();


    //    g.animate(literal("transform" -> myMatrix), 3000, (y: Double) => MinaObj.bounce(y));

    //    g.transform(s"t${Random.nextDouble() * 1000},200")

    //    println(string)
    //    c.transform(string)

  }


  private def loadSvg(url: String, g: Element): Unit = {
    SnapObj.load(url,
      (x: Fragment) => {
        val elemId = "#box_g"
        val e = x.select(elemId)
        glb.console.log(x)
        glb.console.log(elemId + " => ")
//        glb.console.log(e.children())



        val e2 = e.transform(randomTransformation)
        s.append(e2)
        e2.drag()
      })
  }
}
