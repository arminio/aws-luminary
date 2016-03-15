package example.d3

import example.d3.domain.Vpcs
import org.singlespaced.d3js.Ops._
import org.singlespaced.d3js.d3
import org.singlespaced.d3js.selection.Update
import upickle.default._

import scala.scalajs.js
import scala.scalajs.js.JSON
import scala.scalajs.js.annotation.JSExport

@JSExport
object ScalaJSExample {

  @JSExport
  def main(): Unit = {

    println(s"write(true: Boolean): ${write(true: Boolean)}")

    /**
      * Adapted from http://thecodingtutorials.blogspot.ch/2012/07/introduction-to-d3.html
      */
    val graphHeight = 450

    //The width of each bar.
    val barWidth = 80

    //The distance between each bar.
    val barSeparation = 10

    //The maximum value of the data.
    val maxData = 50

    //The actual horizontal distance from drawing one bar rectangle to drawing the next.
    val horizontalBarDistance = barWidth + barSeparation

    //The value to multiply each bar's value by to get its height.
    val barHeightMultiplier = graphHeight / maxData;

    //Color for start
    val c = d3.rgb("DarkSlateBlue")

    val rectXFun = (d: Int,
                    i: Int) => i * horizontalBarDistance
    val rectXFunVpc = (d: Vpcs,
                       i: Int) => {
      println(s"rectXFunVpc i:$i")
      i * 30
    }

    val rectYFun = (d: Int) => graphHeight - d * barHeightMultiplier
    val rectYFunVpc = (d: Vpcs) => graphHeight - barHeightMultiplier

    val rectHeightFun = (d: Int) => d * barHeightMultiplier
    val rectColorFun = (d: Vpcs,
                        i: Int) => c.brighter(i * 0.52).toString

    val svg = d3.select("body").append("svg").attr("width", "100%").attr("height", "450px")

    //    val sel = svg.selectAll("rect").data(js.Array(8, 22, 31, 36, 48, 17, 25))
    //    sel.enter()
    //      .append("rect")
    //      .attr("x", rectXFun)
    //      .attr("y", rectYFun)
    //      .attr("width", barWidth)
    //      .attr("height", rectHeightFun)
    //      .style("fill", rectColorFun)
    //
    //
    //    val selCircle = svg.selectAll("circle").data(js.Array(18, 12, 13, 13, 14, 117, 25))
    //    selCircle.enter().append("circle") // attach a circle
    //      .attr("cx", (d: Int) => d * 1.40) // position the x-centre
    //      .attr("cy", (d: Int) => d * 1.1) // position the y-centre
    //      .attr("r", (d: Int) => d / 2) // set the radius
    //      .style("stroke-opacity", .2) // set the stroke opacity
    //      .style("stroke", "red") // set the line colour
    //      .style("fill", rectColorFun);


    //
    //
    //
    //    val f = (e: Any, json: Any) => {
    //
    //      val jsonAsString: String = JSON.stringify(json.asInstanceOf[js.Any])
    //      println(s"jsonAsString: $jsonAsString")
    //      val pickledJson = read[domain.DescribeVpcsObject](jsonAsString)
    //      println(s"pickledJson:$pickledJson")
    //    }

    d3.json(
      "jsons/vpcs.json", callback = (e: Any, json: Any) => {

        val jsonAsString: String = JSON.stringify(json.asInstanceOf[js.Any])
        println(s"jsonAsString: $jsonAsString")
        val pickledJson = read[domain.DescribeVpcsObject](jsonAsString)
        println(s"pickledJson:$pickledJson")

        val dataArray: js.Array[Vpcs] = pickledJson.Vpcs.asInstanceOf[js.Array[Vpcs]]
        println(s"dataArray:$dataArray")

        println(s"oh my.....")
//        print(s"oh my dataArray: ${dataArray.size}.")
        println(s"oh my.not")

        val sel: Update[Vpcs] = svg.selectAll("rect").data(dataArray)
//        val sel: Update[Int] = svg.selectAll("rect").data(js.Array(8, 22, 31, 36, 48, 17, 25))
        sel.enter()
          .append("rect")
          .attr("x", 50)
          .attr("y", 20)
          .attr("width", 20)
          .attr("height", 10)
//          .style("fill", rectColorFun)

        print()

      }
    )

    //    println(DebugJs inspectObject jsonData)
    //      root = json;
    //      root.fixed = true;
    //      root.x = w / 2;
    //      root.y = h / 4;
    //
    //
    //      // Build the path
    //      var defs = vis.insert("svg:defs")
    //        .data(["end"]);
    //
    //
    //      defs.enter().append("svg:path")
    //        .attr("d", "M0,-5L10,0L0,5");
    //
    //      update();
    //    });

  }


}
