package facade


import scala.scalajs.js
import js.annotation._
import js.|

package importedjs {

  import org.scalajs.dom.{DragEvent, Window}
  import org.scalajs.dom.raw.{SVGElement, HTMLElement, SVGDefsElement, SVGSVGElement}

  @js.native
  trait BoundingBox extends js.Object {
    var x: Double = js.native
    var y: Double = js.native
    var x2: Double = js.native
    var y2: Double = js.native
    var width: Double = js.native
    var height: Double = js.native
  }

  @js.native
  trait RaphaelAnimation extends js.Object {
    def delay(delay: Double): RaphaelAnimation = js.native
    def repeat(repeat: Double): RaphaelAnimation = js.native
  }

  @js.native
  trait RaphaelFont extends js.Object {
    var w: Double = js.native
    var face: js.Any = js.native
    var glyphs: js.Any = js.native
  }

  @js.native
  trait RaphaelElement extends js.Object {
    def animate(params: js.Dictionary[js.Any], ms: Double, easing: String = ???, callback: js.Function = ???): RaphaelElement = js.native
    def animate(animation: RaphaelAnimation): RaphaelElement = js.native
    def animateWith(el: RaphaelElement, anim: RaphaelAnimation, params: js.Any, ms: Double, easing: String = ???, callback: js.Function = ???): RaphaelElement = js.native
    def animateWith(el: RaphaelElement, anim: RaphaelAnimation, animation: RaphaelAnimation): RaphaelElement = js.native
    def attr(attrName: String, value: js.Any): RaphaelElement = js.native
    def attr(attrName: String): js.Dynamic = js.native
    def attr(attrNames: js.Array[String]): js.Array[js.Any] = js.native
    def attr(params: js.Any): RaphaelElement = js.native
    def click(handler: js.Function): RaphaelElement = js.native
    @JSName("clone")
    def cloneAK(): RaphaelElement = js.native
    def data(key: String): js.Dynamic = js.native
    def data(key: String, value: js.Any): RaphaelElement = js.native
    def dblclick(handler: js.Function): RaphaelElement = js.native
    def drag(onmove: js.Function5[Double, Double, Double, Double, DragEvent, js.Any], onstart: js.Function3[Double, Double, DragEvent, js.Any], onend: js.Function1[js.Any, js.Any], mcontext: js.Any = ???, scontext: js.Any = ???, econtext: js.Any = ???): RaphaelElement = js.native
    def getBBox(isWithoutTransform: Boolean = false): BoundingBox = js.native
    def glow(glow: js.Any = ???): RaphaelSet = js.native
    def hide(): RaphaelElement = js.native
    def hover(f_in: js.Function, f_out: js.Function, icontext: js.Any = ???, ocontext: js.Any = ???): RaphaelElement = js.native
    var id: String = js.native
    def insertAfter(el: RaphaelElement): RaphaelElement = js.native
    def insertBefore(el: RaphaelElement): RaphaelElement = js.native
    def isPointInside(x: Double, y: Double): Boolean = js.native
    def isVisible(): Boolean = js.native
    var matrix: RaphaelMatrix = js.native
    def mousedown(handler: js.Function): RaphaelElement = js.native
    def mousemove(handler: js.Function): RaphaelElement = js.native
    def mouseout(handler: js.Function): RaphaelElement = js.native
    def mouseover(handler: js.Function): RaphaelElement = js.native
    def mouseup(handler: js.Function): RaphaelElement = js.native
    var next: RaphaelElement = js.native
    var node: SVGElement = js.native
    def onDragOver(f: js.Function): RaphaelElement = js.native
    var paper: RaphaelPaper = js.native
    def pause(anim: RaphaelAnimation = ???): RaphaelElement = js.native
    var prev: RaphaelElement = js.native
    var raphael: RaphaelStatic = js.native
    def remove(): Unit = js.native
    def removeData(key: String = ???): RaphaelElement = js.native
    def resume(anim: RaphaelAnimation = ???): RaphaelElement = js.native
    def setTime(anim: RaphaelAnimation): Unit = js.native
    def setTime(anim: RaphaelAnimation, value: Double): RaphaelElement = js.native
    def show(): RaphaelElement = js.native
    def status(): js.Array[js.Any] = js.native
    def status(anim: RaphaelAnimation): Double = js.native
    def status(anim: RaphaelAnimation, value: Double): RaphaelElement = js.native
    def stop(anim: RaphaelAnimation = ???): RaphaelElement = js.native
    def toBack(): RaphaelElement = js.native
    def toFront(): RaphaelElement = js.native
    def touchcancel(handler: js.Function): RaphaelElement = js.native
    def touchend(handler: js.Function): RaphaelElement = js.native
    def touchmove(handler: js.Function): RaphaelElement = js.native
    def touchstart(handler: js.Function): RaphaelElement = js.native
    def transform(): String = js.native
    def transform(tstr: String): RaphaelElement = js.native
    def unclick(handler: js.Function): RaphaelElement = js.native
    def undblclick(handler: js.Function): RaphaelElement = js.native
    def undrag(): RaphaelElement = js.native
    def unhover(): RaphaelElement = js.native
    def unhover(f_in: js.Function, f_out: js.Function): RaphaelElement = js.native
    def unmousedown(handler: js.Function): RaphaelElement = js.native
    def unmousemove(handler: js.Function): RaphaelElement = js.native
    def unmouseout(handler: js.Function): RaphaelElement = js.native
    def unmouseover(handler: js.Function): RaphaelElement = js.native
    def unmouseup(handler: js.Function): RaphaelElement = js.native
    def untouchcancel(handler: js.Function): RaphaelElement = js.native
    def untouchend(handler: js.Function): RaphaelElement = js.native
    def untouchmove(handler: js.Function): RaphaelElement = js.native
    def untouchstart(handler: js.Function): RaphaelElement = js.native
  }

  @js.native
  trait RaphaelPath extends RaphaelElement {
    def getPointAtLength(length: Double): js.Any = js.native
    def getSubpath(from: Double, to: Double): String = js.native
    def getTotalLength(): Double = js.native
  }

  @js.native
  trait RaphaelSet extends js.Object {
    def clear(): Unit = js.native
    def exclude(element: RaphaelElement): Boolean = js.native
    def forEach(callback: js.Function, thisArg: js.Any = ???): RaphaelSet = js.native
    def pop(): RaphaelElement = js.native
    def push(RaphaelElement: js.Any*): RaphaelSet = js.native
    def splice(index: Double, count: Double): RaphaelSet = js.native
    def splice(index: Double, count: Double, insertion: RaphaelElement*): RaphaelSet = js.native
    var length: Double = js.native
    @JSBracketAccess
    def apply(key: Double): RaphaelElement = js.native
    @JSBracketAccess
    def update(key: Double, v: RaphaelElement): Unit = js.native
    def animate(params: js.Dictionary[js.Any], ms: Double, easing: String = ???, callback: js.Function = ???): RaphaelSet = js.native
    def animate(animation: RaphaelAnimation): RaphaelSet = js.native
    def animateWith(el: RaphaelElement, anim: RaphaelAnimation, params: js.Any, ms: Double, easing: String = ???, callback: js.Function = ???): RaphaelSet = js.native
    def animateWith(el: RaphaelElement, anim: RaphaelAnimation, animation: RaphaelAnimation): RaphaelSet = js.native
    def attr(attrName: String, value: js.Any): RaphaelSet = js.native
    def attr(params: js.Dictionary[js.Any]): RaphaelSet = js.native
    def attr(attrName: String): js.Dynamic = js.native
    def attr(attrNames: js.Array[String]): js.Array[js.Any] = js.native
    def click(handler: js.Function): RaphaelSet = js.native
    @JSName("clone")
    def cloneAK(): RaphaelSet = js.native
    def data(key: String): js.Dynamic = js.native
    def data(key: String, value: js.Any): RaphaelSet = js.native
    def dblclick(handler: js.Function): RaphaelSet = js.native
    def drag(onmove: js.Function5[Double, Double, Double, Double, DragEvent, js.Any], onstart: js.Function3[Double, Double, DragEvent, js.Any], onend: js.Function1[js.Any, js.Any], mcontext: js.Any = ???, scontext: js.Any = ???, econtext: js.Any = ???): RaphaelSet = js.native
    def getBBox(isWithoutTransform: Boolean = false): BoundingBox = js.native
    def glow(glow: js.Any = ???): RaphaelSet = js.native
    def hide(): RaphaelSet = js.native
    def hover(f_in: js.Function, f_out: js.Function, icontext: js.Any = ???, ocontext: js.Any = ???): RaphaelSet = js.native
    var id: String = js.native
    def insertAfter(el: RaphaelElement): RaphaelSet = js.native
    def insertBefore(el: RaphaelElement): RaphaelSet = js.native
    def isPointInside(x: Double, y: Double): Boolean = js.native
    def isVisible(): Boolean = js.native
    var matrix: RaphaelMatrix = js.native
    def mousedown(handler: js.Function): RaphaelSet = js.native
    def mousemove(handler: js.Function): RaphaelSet = js.native
    def mouseout(handler: js.Function): RaphaelSet = js.native
    def mouseover(handler: js.Function): RaphaelSet = js.native
    def mouseup(handler: js.Function): RaphaelSet = js.native
    var next: RaphaelSet = js.native
    def onDragOver(f: js.Function): RaphaelSet = js.native
    var paper: RaphaelPaper = js.native
    def pause(anim: RaphaelAnimation = ???): RaphaelSet = js.native
    var prev: RaphaelSet = js.native
    var raphael: RaphaelStatic = js.native
    def remove(): Unit = js.native
    def removeData(key: String = ???): RaphaelSet = js.native
    def resume(anim: RaphaelAnimation = ???): RaphaelSet = js.native
    def setTime(anim: RaphaelAnimation): Unit = js.native
    def setTime(anim: RaphaelAnimation, value: Double): RaphaelSet = js.native
    def show(): RaphaelSet = js.native
    def status(): js.Array[js.Any] = js.native
    def status(anim: RaphaelAnimation): Double = js.native
    def status(anim: RaphaelAnimation, value: Double): RaphaelSet = js.native
    def stop(anim: RaphaelAnimation = ???): RaphaelSet = js.native
    def toBack(): RaphaelSet = js.native
    def toFront(): RaphaelSet = js.native
    def touchcancel(handler: js.Function): RaphaelSet = js.native
    def touchend(handler: js.Function): RaphaelSet = js.native
    def touchmove(handler: js.Function): RaphaelSet = js.native
    def touchstart(handler: js.Function): RaphaelSet = js.native
    def transform(): String = js.native
    def transform(tstr: String): RaphaelSet = js.native
    def unclick(handler: js.Function): RaphaelSet = js.native
    def undblclick(handler: js.Function): RaphaelSet = js.native
    def undrag(): RaphaelSet = js.native
    def unhover(): RaphaelSet = js.native
    def unhover(f_in: js.Function, f_out: js.Function): RaphaelSet = js.native
    def unmousedown(handler: js.Function): RaphaelSet = js.native
    def unmousemove(handler: js.Function): RaphaelSet = js.native
    def unmouseout(handler: js.Function): RaphaelSet = js.native
    def unmouseover(handler: js.Function): RaphaelSet = js.native
    def unmouseup(handler: js.Function): RaphaelSet = js.native
    def untouchcancel(handler: js.Function): RaphaelSet = js.native
    def untouchend(handler: js.Function): RaphaelSet = js.native
    def untouchmove(handler: js.Function): RaphaelSet = js.native
    def untouchstart(handler: js.Function): RaphaelSet = js.native
  }

  @js.native
  trait RaphaelMatrix extends js.Object {
    def add(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double, matrix: RaphaelMatrix): RaphaelMatrix = js.native
    @JSName("clone")
    def cloneAK(): RaphaelMatrix = js.native
    def invert(): RaphaelMatrix = js.native
    def rotate(a: Double, x: Double, y: Double): Unit = js.native
    def scale(x: Double, y: Double = ???, cx: Double = ???, cy: Double = ???): Unit = js.native
    def split(): js.Any = js.native
    def toTransformString(): String = js.native
    def translate(x: Double, y: Double): Unit = js.native
    def x(x: Double, y: Double): Double = js.native
    def y(x: Double, y: Double): Double = js.native
  }

  @js.native
  trait RaphaelPaper extends js.Object {
    def add(JSON: js.Any): RaphaelSet = js.native
    var bottom: RaphaelElement = js.native
    var canvas: SVGSVGElement = js.native
    def circle(x: Double, y: Double, r: Double): RaphaelElement = js.native
    def clear(): Unit = js.native
    var defs: SVGDefsElement = js.native
    def ellipse(x: Double, y: Double, rx: Double, ry: Double): RaphaelElement = js.native
    def forEach(callback: js.Function1[RaphaelElement, Boolean], thisArg: js.Any = ???): RaphaelPaper = js.native
    def getById(id: Double): RaphaelElement = js.native
    def getElementByPoint(x: Double, y: Double): RaphaelElement = js.native
    def getElementsByPoint(x: Double, y: Double): RaphaelSet = js.native
    def getFont(family: String, weight: String = ???, style: String = ???, stretch: String = ???): RaphaelFont = js.native
    def getFont(family: String, weight: Double = ???, style: String = ???, stretch: String = ???): RaphaelFont = js.native
    var height: Double = js.native
    def image(src: String, x: Double, y: Double, width: Double, height: Double): RaphaelElement = js.native
    def path(pathString: String = ???): RaphaelPath = js.native
    def print(x: Double, y: Double, str: String, font: RaphaelFont, size: Double = ???, origin: String = ???, letter_spacing: Double = ???): RaphaelPath = js.native
    def rect(x: Double, y: Double, width: Double, height: Double, r: Double = ???): RaphaelElement = js.native
    def remove(): Unit = js.native
    def renderfix(): Unit = js.native
    def safari(): Unit = js.native
    def set(elements: js.Array[RaphaelElement] = ???): RaphaelSet = js.native
    def setFinish(): RaphaelSet = js.native
    def setSize(width: Double, height: Double): Unit = js.native
    def setStart(): Unit = js.native
    def setViewBox(x: Double, y: Double, w: Double, h: Double, fit: Boolean): Unit = js.native
    def text(x: Double, y: Double, text: String): RaphaelElement = js.native
    var top: RaphaelElement = js.native
    var width: Double = js.native
  }

  @js.native
  trait RaphaelStatic extends js.Object {
    def apply(container: HTMLElement, width: Double, height: Double, callback: js.Function = ???): RaphaelPaper = js.native
    def apply(container: String, width: Double, height: Double, callback: js.Function = ???): RaphaelPaper = js.native
    def apply(x: Double, y: Double, width: Double, height: Double, callback: js.Function = ???): RaphaelPaper = js.native
    def apply(all: js.Array[js.Any], callback: js.Function = ???): RaphaelPaper = js.native
    def apply(onReadyCallback: js.Function = ???): RaphaelPaper = js.native
    def angle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double = ???, y3: Double = ???): Double = js.native
    def animation(params: js.Any, ms: Double, easing: String = ???, callback: js.Function = ???): RaphaelAnimation = js.native
    def bezierBBox(p1x: Double, p1y: Double, c1x: Double, c1y: Double, c2x: Double, c2y: Double, p2x: Double, p2y: Double): js.Any = js.native
    def bezierBBox(bez: js.Array[js.Any]): js.Any = js.native
    def color(clr: String): js.Any = js.native
    def createUUID(): String = js.native
    def deg(deg: Double): Double = js.native
    var easing_formulas: js.Any = js.native
    var el: js.Any = js.native
    def findDotsAtSegment(p1x: Double, p1y: Double, c1x: Double, c1y: Double, c2x: Double, c2y: Double, p2x: Double, p2y: Double, t: Double): js.Any = js.native
    var fn: js.Any = js.native
    def format(token: String, parameters: js.Any*): String = js.native
//    def fullfill(token: String, json: JSON): String = js.native
    def fullfill(token: String, json: js.Any): String = js.native
    var getColor: js.Any = js.native
    def getPointAtLength(path: String, length: Double): js.Any = js.native
    def getRGB(colour: String): js.Any = js.native
    def getSubpath(path: String, from: Double, to: Double): String = js.native
    def getTotalLength(path: String): Double = js.native
    def hsb(h: Double, s: Double, b: Double): String = js.native
    def hsb2rgb(h: Double, s: Double, v: Double): js.Any = js.native
    def hsl(h: Double, s: Double, l: Double): String = js.native
    def hsl2rgb(h: Double, s: Double, l: Double): js.Any = js.native
    def is(o: js.Any, `type`: String): Boolean = js.native
    def isBBoxIntersect(bbox1: String, bbox2: String): Boolean = js.native
    def isPointInsideBBox(bbox: String, x: Double, y: Double): Boolean = js.native
    def isPointInsidePath(path: String, x: Double, y: Double): Boolean = js.native
    def matrix(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): RaphaelMatrix = js.native
    def ninja(): Unit = js.native
    def parsePathString(pathString: String): js.Array[String] = js.native
    def parsePathString(pathString: js.Array[String]): js.Array[String] = js.native
    def parseTransformString(TString: String): js.Array[String] = js.native
    def parseTransformString(TString: js.Array[String]): js.Array[String] = js.native
    def path2curve(pathString: String): js.Array[String] = js.native
    def path2curve(pathString: js.Array[String]): js.Array[String] = js.native
    def pathBBox(path: String): BoundingBox = js.native
    def pathIntersection(path1: String, path2: String): js.Array[js.Any] = js.native
    def pathToRelative(pathString: String): js.Array[String] = js.native
    def pathToRelative(pathString: js.Array[String]): js.Array[String] = js.native
    def rad(deg: Double): Double = js.native
    def registerFont(font: RaphaelFont): RaphaelFont = js.native
    def rgb(r: Double, g: Double, b: Double): String = js.native
    def rgb2hsb(r: Double, g: Double, b: Double): js.Any = js.native
    def rgb2hsl(r: Double, g: Double, b: Double): js.Any = js.native
    def setWindow(newwin: Window): Unit = js.native
    def snapTo(values: Double, value: Double, tolerance: Double = ???): Double = js.native
    def snapTo(values: js.Array[Double], value: Double, tolerance: Double = ???): Double = js.native
    var st: js.Any = js.native
    var svg: Boolean = js.native
    def toMatrix(path: String, transform: String): RaphaelMatrix = js.native
    def toMatrix(path: String, transform: js.Array[String]): RaphaelMatrix = js.native
    def transformPath(path: String, transform: String): String = js.native
    def transformPath(path: String, transform: js.Array[String]): String = js.native
    var `type`: String = js.native
    var vml: Boolean = js.native
  }

  @js.native
  object Importedjs extends js.GlobalScope {
    var Raphael: RaphaelStatic = js.native
  }

}
