
import scala.scalajs.js
import js.annotation._
import js.|

package importedjs {

  import importedjs.Snap.Paper
  import importedjs.mina.AnimationDescriptor
  import org.scalajs.dom.raw.SVGElement

  package mina {

@js.native
trait MinaAnimation extends js.Object {
  var id: String = js.native
  var duration: js.Function = js.native
  var easing: js.Function = js.native
  var speed: js.Function = js.native
  var status: js.Function = js.native
  var stop: js.Function = js.native
}

@js.native
trait AnimationDescriptor extends js.Object {
  var id: String = js.native
  var start: Double = js.native
  var end: Double = js.native
  var b: Double = js.native
  var s: Double = js.native
  var dur: Double = js.native
  var spd: Double = js.native
  def get(): Double = js.native
  def set(slave: Double): Double = js.native
  def easing(input: Double): Double = js.native
  def status(): Double = js.native
  def status(newStatus: Double): Unit = js.native
  def speed(): Double = js.native
  def speed(newSpeed: Double): Unit = js.native
  def duration(): Double = js.native
  def duration(newDuration: Double): Unit = js.native
  def stop(): Unit = js.native
  def pause(): Unit = js.native
  def resume(): Unit = js.native
  def update(): Unit = js.native
}

@JSName("mina")
@js.native
object Mina extends js.Object {
  def backin(n: Double): Double = js.native
  def backout(n: Double): Double = js.native
  def bounce(n: Double): Double = js.native
  def easein(n: Double): Double = js.native
  def easeinout(n: Double): Double = js.native
  def easeout(n: Double): Double = js.native
  def elastic(n: Double): Double = js.native
  def getById(id: String): AnimationDescriptor = js.native
  def linear(n: Double): Double = js.native
  def time(): Double = js.native
}

}

package Snap {

  import org.scalajs.dom.{XMLHttpRequest, MouseEvent}
  import org.scalajs.dom.raw.{SVGMatrix, HTMLElement}

  import scala.scalajs.js.annotation.JSName

  @js.native
trait RGB extends js.Object {
  var r: Double = js.native
  var g: Double = js.native
  var b: Double = js.native
  var hex: String = js.native
}

@js.native
trait HSB extends js.Object {
  var h: Double = js.native
  var s: Double = js.native
  var b: Double = js.native
}

@js.native
trait RGBHSB extends js.Object {
  var r: Double = js.native
  var g: Double = js.native
  var b: Double = js.native
  var hex: String = js.native
  var error: Boolean = js.native
  var h: Double = js.native
  var s: Double = js.native
  var v: Double = js.native
  var l: Double = js.native
}

@js.native
trait HSL extends js.Object {
  var h: Double = js.native
  var s: Double = js.native
  var l: Double = js.native
}

@js.native
trait BBox extends js.Object {
  var cx: Double = js.native
  var cy: Double = js.native
  var h: Double = js.native
  var height: Double = js.native
  var path: Double = js.native
  var r0: Double = js.native
  var r1: Double = js.native
  var r2: Double = js.native
  var vb: String = js.native
  var w: Double = js.native
  var width: Double = js.native
  var x2: Double = js.native
  var x: Double = js.native
  var y2: Double = js.native
  var y: Double = js.native
}

@js.native
trait TransformationDescriptor extends js.Object {
  var string: String = js.native
  var globalMatrix: Matrix = js.native
  var localMatrix: Matrix = js.native
  var diffMatrix: Matrix = js.native
  var global: String = js.native
  var local: String = js.native
  @JSName("toString")
  def toStringJS(): String = js.native
}

@js.native
trait Animation extends js.Object {
  var attr: js.Dictionary[String | Double | Boolean | js.Any] = js.native
  var duration: Double = js.native
  var easing: js.Function1[Double, Double] = js.native
  var callback: js.Function0[Unit] = js.native
}

@js.native
trait Element extends js.Object {
  def add(el: Element): Element = js.native
  def addClass(value: String): Element = js.native
  def after(el: Element): Element = js.native
  def align(el: Element, way: String): Element = js.native
  def animate(animation: js.Any): Element = js.native
  def animate(attrs: js.Dictionary[String | Double | Boolean | js.Any], duration: Double, easing: js.Function1[Double, Double] = ???, callback: js.Function0[Unit] = ???): Element = js.native
  def append(el: Element): Element = js.native
  def appendTo(el: Element): Element = js.native
  def asPX(attr: String, value: String = ???): Double = js.native
  def attr(param: String): String = js.native
  def attr(params: js.Dictionary[String | Double | Boolean | js.Any]): Element = js.native
  def before(el: Element): Element = js.native
  def children(): js.Array[Element] = js.native
  @JSName("clone")
  def cloneJS(): Element = js.native
  def data(key: String, value: js.Any = ???): js.Dynamic = js.native
  def getAlign(el: Element, way: String): String = js.native
  def getBBox(): BBox = js.native
  def getPointAtLength(length: Double): js.Any = js.native
  def getSubpath(from: Double, to: Double): String = js.native
  def getTotalLength(): Double = js.native
  def hasClass(value: String): Boolean = js.native
  def inAnim(): js.Array[js.Any] = js.native
  def innerSVG(): String = js.native
  def insertAfter(el: Element): Element = js.native
  def insertBefore(el: Element): Element = js.native
  def marker(x: Double, y: Double, width: Double, height: Double, refX: Double, refY: Double): Element = js.native
  var node: HTMLElement = js.native
  def outerSVG(): String = js.native
  def parent(): Element = js.native
  def pattern(x: js.Any, y: js.Any, width: js.Any, height: js.Any): Element = js.native
  def prepend(el: Element): Element = js.native
  def prependTo(el: Element): Element = js.native
  def remove(): Element = js.native
  def removeClass(value: String): Element = js.native
  def removeData(key: String = ???): Element = js.native
  def select(query: String): Element = js.native
  def stop(): Element = js.native
  def toDefs(): Element = js.native
  def toJSON(): js.Dynamic = js.native
  def toggleClass(value: String, flag: Boolean): Element = js.native
  def toPattern(x: Double, y: Double, width: Double, height: Double): Object = js.native
  def toPattern(x: String, y: String, width: String, height: String): Object = js.native
  @JSName("toString")
  def toStringJS(): String = js.native
  def transform(): TransformationDescriptor = js.native
  def transform(tstr: String): Element = js.native
  var `type`: String = js.native
  def use(): Object = js.native
  def selectAll(): Set = js.native
  def selectAll(query: String): Set = js.native
  def click(handler: js.Function1[MouseEvent, Unit], thisArg: js.Any = ???): Element = js.native
  def dblclick(handler: js.Function1[MouseEvent, Unit], thisArg: js.Any = ???): Element = js.native
  def mousedown(handler: js.Function1[MouseEvent, Unit], thisArg: js.Any = ???): Element = js.native
  def mousemove(handler: js.Function1[MouseEvent, Unit], thisArg: js.Any = ???): Element = js.native
  def mouseout(handler: js.Function1[MouseEvent, Unit], thisArg: js.Any = ???): Element = js.native
  def mouseover(handler: js.Function1[MouseEvent, Unit], thisArg: js.Any = ???): Element = js.native
  def mouseup(handler: js.Function1[MouseEvent, Unit], thisArg: js.Any = ???): Element = js.native
  def touchstart(handler: js.Function1[MouseEvent, Unit], thisArg: js.Any = ???): Element = js.native
  def touchmove(handler: js.Function1[MouseEvent, Unit], thisArg: js.Any = ???): Element = js.native
  def touchend(handler: js.Function1[MouseEvent, Unit], thisArg: js.Any = ???): Element = js.native
  def touchcancel(handler: js.Function1[MouseEvent, Unit], thisArg: js.Any = ???): Element = js.native
  def unclick(handler: js.Function1[MouseEvent, Unit] = ???): Element = js.native
  def undblclick(handler: js.Function1[MouseEvent, Unit]): Element = js.native
  def unmousedown(handler: js.Function1[MouseEvent, Unit]): Element = js.native
  def unmousemove(handler: js.Function1[MouseEvent, Unit]): Element = js.native
  def unmouseout(handler: js.Function1[MouseEvent, Unit]): Element = js.native
  def unmouseover(handler: js.Function1[MouseEvent, Unit]): Element = js.native
  def unmouseup(handler: js.Function1[MouseEvent, Unit]): Element = js.native
  def untouchstart(handler: js.Function1[MouseEvent, Unit]): Element = js.native
  def untouchmove(handler: js.Function1[MouseEvent, Unit]): Element = js.native
  def untouchend(handler: js.Function1[MouseEvent, Unit]): Element = js.native
  def untouchcancel(handler: js.Function1[MouseEvent, Unit]): Element = js.native
  def hover(hoverInHandler: js.Function1[MouseEvent, Unit], hoverOutHandler: js.Function1[MouseEvent, Unit], thisArg: js.Any = ???): Element = js.native
  def hoverJS(hoverInHandler: js.Function1[MouseEvent, Unit], hoverOutHandler: js.Function1[MouseEvent, Unit], inThisArg: js.Any = ???, outThisArg: js.Any = ???): Element = js.native
  def unhover(hoverInHandler: js.Function1[MouseEvent, Unit], hoverOutHandler: js.Function1[MouseEvent, Unit]): Element = js.native
  def drag(): Element = js.native
  def drag(onMove: js.Function5[Double, Double, Double, Double, MouseEvent, Unit], onStart: js.Function3[Double, Double, MouseEvent, Unit], onEnd: js.Function1[MouseEvent, Unit], moveThisArg: js.Any = ???, startThisArg: js.Any = ???, endThisArg: js.Any = ???): Element = js.native
  def undrag(onMove: js.Function3[Double, Double, MouseEvent, Unit], onStart: js.Function3[Double, Double, MouseEvent, Unit], onEnd: js.Function1[MouseEvent, Unit]): Element = js.native
  def undrag(): Element = js.native
}

@js.native
trait Fragment extends js.Object {
  def select(query: String): Element = js.native
  def selectAll(query: String = ???): Set = js.native
}

@js.native
trait Matrix extends js.Object {
  def add(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix = js.native
  def add(matrix: Matrix): Matrix = js.native
  @JSName("clone")
  def cloneJS(): Matrix = js.native
  def determinant(): Double = js.native
  def invert(): Matrix = js.native
  def rotate(a: Double, x: Double = ???, y: Double = ???): Matrix = js.native
  def scale(x: Double, y: Double = ???, cx: Double = ???, cy: Double = ???): Matrix = js.native
  def split(): ExplicitTransform = js.native
  def toTransformString(): String = js.native
  def translate(x: Double, y: Double): Matrix = js.native
  def x(x: Double, y: Double): Double = js.native
  def y(x: Double, y: Double): Double = js.native
}

@js.native
trait ExplicitTransform extends js.Object {
  var dx: Double = js.native
  var dy: Double = js.native
  var scalex: Double = js.native
  var scaley: Double = js.native
  var shear: Double = js.native
  var rotate: Double = js.native
  var isSimple: Boolean = js.native
}

@js.native
trait Paper extends Element {
  def clear(): Unit = js.native
  def el(name: String, attr: Object): Element = js.native
  def filter(filstr: String): Element = js.native
  def gradient(gradient: String): js.Dynamic = js.native
  def g(varargs: js.Any = ???): js.Dynamic = js.native
  def group(els: js.Any*): js.Dynamic = js.native
  def mask(varargs: js.Any): Object = js.native
  def ptrn(x: Double, y: Double, width: Double, height: Double, vbx: Double, vby: Double, vbw: Double, vbh: Double): Object = js.native
  def svg(x: Double, y: Double, width: Double, height: Double, vbx: Double, vby: Double, vbw: Double, vbh: Double): Object = js.native
  def toDataUrl(): String = js.native
  @JSName("toString")
  override def toStringJS(): String = js.native
  def use(id: String = ???): Object = js.native
  def useJs(id: Element = ???): Object = js.native
  def circle(x: Double, y: Double, r: Double): Element = js.native
  def ellipse(x: Double, y: Double, rx: Double, ry: Double): Element = js.native
  def image(src: String, x: Double, y: Double, width: Double, height: Double): Element = js.native
  def line(x1: Double, y1: Double, x2: Double, y2: Double): Element = js.native
  def path(pathString: String = ???): Element = js.native
  def polygon(varargs: js.Array[js.Any]): Element = js.native
  def polyline(varargs: js.Array[js.Any]): Element = js.native
  def rect(x: Double, y: Double, width: Double, height: Double, rx: Double = ???, ry: Double = ???): Element = js.native
  def text(x: Double, y: Double, text: String | Double): Element = js.native
  def text(x: Double, y: Double, text: js.Array[String | Double]): Element = js.native
}

@js.native
trait Set extends js.Object {
  def animate(attrs: js.Dictionary[String | Double | Boolean | js.Any], duration: Double, easing: js.Function1[Double, Double] = ???, callback: js.Function0[Unit] = ???): Element = js.native
  def animate(params: js.Any*): Element = js.native
  def attr(params: js.Dictionary[String | Double | Boolean | js.Any]): Element = js.native
  def attr(param: String): String = js.native
  def bind(attr: String, callback: js.Function): Set = js.native
  def bind(attr: String, element: Element): Set = js.native
  def bind(attr: String, element: Element, eattr: String): Set = js.native
  def clear(): Set = js.native
  def exclude(element: Element): Boolean = js.native
  def forEach(callback: js.Function, thisArg: Object = ???): Set = js.native
  def pop(): Element = js.native
  def push(el: Element): Element = js.native
  def push(els: js.Array[Element]): Element = js.native
  def splice(index: Double, count: Double, insertion: js.Array[Object] = ???): js.Array[Element] = js.native
}

@js.native
trait Filter extends js.Object {
  def blur(x: Double, y: Double = ???): String = js.native
  def brightness(amount: Double): String = js.native
  def contrast(amount: Double): String = js.native
  def grayscale(amount: Double): String = js.native
  def hueRotate(angle: Double): String = js.native
  def invert(amount: Double): String = js.native
  def saturate(amount: Double): String = js.native
  def sepia(amount: Double): String = js.native
  def shadow(dx: Double, dy: Double, blur: Double, color: String, opacity: Double): String = js.native
  def shadow(dx: Double, dy: Double, color: String, opacity: Double): String = js.native
  def shadow(dx: Double, dy: Double, opacity: Double): String = js.native
}

@js.native
trait Path extends js.Object {
  def bezierBBox(args: Double*): BBox = js.native
  def bezierBBox(bez: js.Array[Double]): BBox = js.native
  def findDotsAtSegment(p1x: Double, p1y: Double, c1x: Double, c1y: Double, c2x: Double, c2y: Double, p2x: Double, p2y: Double, t: Double): Object = js.native
  def getBBox(path: String): BBox = js.native
  def getPointAtLength(path: String, length: Double): Object = js.native
  def getSubpath(path: String, from: Double, to: Double): String = js.native
  def getTotalLength(path: String): Double = js.native
  def intersection(path1: String, path2: String): js.Array[IntersectionDot] = js.native
  def isBBoxIntersect(bbox1: BBox, bbox2: BBox): Boolean = js.native
  def isPointInside(path: String, x: Double, y: Double): Boolean = js.native
  def isPointInsideBBox(bbox: BBox, x: Double, y: Double): Boolean = js.native
  def map(path: String, matrix: Matrix): String = js.native
  def map(path: String, matrix: Object): String = js.native
  def toAbsolute(path: String): js.Array[js.Any] = js.native
  def toCubic(pathString: String): js.Array[js.Any] = js.native
  def toCubic(pathString: js.Array[String]): js.Array[js.Any] = js.native
  def toRelative(path: String): js.Array[js.Any] = js.native
}

@js.native
trait IntersectionDot extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
  var t1: Double = js.native
  var t2: Double = js.native
  var segment1: Double = js.native
  var segment2: Double = js.native
  var bez1: js.Array[Double] = js.native
  var bez2: js.Array[Double] = js.native
}

@JSName("Snap")
@js.native
object Snap extends js.Object {
  var filter: Filter = js.native
  var path: Path = js.native
  def Matrix(): Unit = js.native
  def matrix(): Matrix = js.native
  def matrix(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix = js.native
  def matrix(svgMatrix: SVGMatrix): Matrix = js.native
  def ajax(url: String, postData: String, callback: js.Function, scope: Object = ???): XMLHttpRequest = js.native
  def ajaxJS(url: String, postData: Object, callback: js.Function, scope: Object = ???): XMLHttpRequest = js.native
  def ajaxJS1(url: String, callback: js.Function, scope: Object = ???): XMLHttpRequest = js.native
  def format(token: String, json: Object): String = js.native
  def fragment(varargs: js.Any): Fragment = js.native
  def getElementByPoint(x: Double, y: Double): Element = js.native
  def is(o: js.Any, `type`: String): Boolean = js.native
  def load(url: String, callback: js.Function, scope: Object = ???): Unit = js.native
  def plugin(f: js.Function): Unit = js.native
  def select(query: String): Element = js.native
  def selectAll(query: String): js.Dynamic = js.native
  def snapTo(values: js.Array[Double], value: Double, tolerance: Double = ???): Double = js.native
  def animate(from: Double | js.Array[Double], to: Double | js.Array[Double], updater: js.Function1[Double, Unit], duration: Double, easing: js.Function1[Double, Double] = ???, callback: js.Function0[Unit] = ???): mina.MinaAnimation = js.native
  def animation(attr: Object, duration: Double, easing: js.Function1[Double, Double] = ???, callback: js.Function0[Unit] = ???): Animation = js.native
  def color(clr: String): RGBHSB = js.native
  def getRGB(color: String): RGB = js.native
  def hsb(h: Double, s: Double, b: Double): HSB = js.native
  def hsl(h: Double, s: Double, l: Double): HSL = js.native
  def rgb(r: Double, g: Double, b: Double): RGB = js.native
  def hsb2rgb(h: Double, s: Double, v: Double): RGB = js.native
  def hsl2rgb(h: Double, s: Double, l: Double): RGB = js.native
  def rgb2hsb(r: Double, g: Double, b: Double): HSB = js.native
  def rgb2hsl(r: Double, g: Double, b: Double): HSL = js.native
  def angle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double = ???, y3: Double = ???): Double = js.native
  def rad(deg: Double): Double = js.native
  def deg(rad: Double): Double = js.native
  def sin(angle: Double): Double = js.native
  def cos(angle: Double): Double = js.native
  def tan(angle: Double): Double = js.native
  def asin(angle: Double): Double = js.native
  def acos(angle: Double): Double = js.native
  def atan(angle: Double): Double = js.native
  def atan2(angle: Double): Double = js.native
  def len(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def len2(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def parse(svg: String): Fragment = js.native
  def parsePathString(pathString: String): js.Array[js.Any] = js.native
  def parsePathString(pathString: js.Array[String]): js.Array[js.Any] = js.native
  def parseTransformString(TString: String): js.Array[js.Any] = js.native
  def parseTransformString(TString: js.Array[String]): js.Array[js.Any] = js.native
  def closest(x: Double, y: Double, X: Double, Y: Double): Boolean = js.native
}

}

@js.native
object Importedjs extends js.GlobalScope {
  def mina(a: Double,
           A: Double,
           b: Double,
           B: Double,
           get: js.Function,
           set: js.Function,
           easing: js.Function1[Double, Double] = ???): AnimationDescriptor = js.native

  def Snap(width: Double | String, height: Double | String): Paper = js.native
  def Snap(query: String): Paper = js.native
  def Snap(DOM: SVGElement): Paper = js.native
}

}
