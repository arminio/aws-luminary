package example.d3

import scala.io.Source

object domain {

  case class Tags(
                   Value: String,
                   Key: String
                 )

  case class Vpcs(
                   VpcId: String,
                   InstanceTenancy: String,
                   Tags: List[Tags] = Nil,
                   State: String,
                   DhcpOptionsId: String,
                   CidrBlock: String,
                   IsDefault: Boolean
                 )

  case class DescribeVpcsObject(Vpcs: List[Vpcs])

  def main(args: Array[String]) {
    val fileContents = Source.fromFile("/Users/armin.keyvanloo/work/scala/scala.js/scala-js-d3-example-app/jsons/chicken.json").getLines.mkString

    import upickle.default._
//        println(fileContents)
        val j = read[DescribeVpcsObject](fileContents)
        println(j)
    println(write(1))
  }
}
