package facade


import scala.scalajs.js
import js.annotation._
import js.|
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.raw.{HTMLElement, HTMLImageElement}

package importedjs {

  package Konva {


    object Types {
      type Container = String | HTMLElement | js.Any
    }

    @js.native
    @JSName("Konva.Util")
    class Util extends js.Object {

    }

    @js.native
    @JSName("Konva.Util")
    object Util extends js.Object {
      def getRandomColor(): String = js.native

      def getRGB(color: String): String = js.native
    }

    @js.native
    @JSName("Konva.Easings")
    class Easings extends js.Object {
    }

    @js.native
    @JSName("Konva.Easings")
    object Easings extends js.Object {
      def BackEaseIn(): js.Dynamic = js.native

      def BackEaseInOut(): js.Dynamic = js.native

      def BackEaseOut(): js.Dynamic = js.native

      def BounceEaseIn(): js.Dynamic = js.native

      def BounceEaseInOut(): js.Dynamic = js.native

      def BounceEaseOut(): js.Dynamic = js.native

      def EaseIn(): js.Dynamic = js.native

      def EaseInOut(): js.Dynamic = js.native

      def EaseOut(): js.Dynamic = js.native

      def ElasticEaseIn(): js.Dynamic = js.native

      def ElasticEaseInOut(): js.Dynamic = js.native

      def ElasticEaseOut(): js.Dynamic = js.native

      def Linear(): js.Dynamic = js.native

      def StrongEaseIn(): js.Dynamic = js.native

      def StrongEaseInOut(): js.Dynamic = js.native

      def StrongEaseOut(): js.Dynamic = js.native
    }

    @js.native
    @JSName("Konva.Filter")
    class Filter extends js.Object {
    }

    @js.native
    @JSName("Konva.Filters")
    class Filters extends js.Object {
    }

    @js.native
    @JSName("Konva.Filters")
    object Filters extends js.Object {
      def Blur(imageData: js.Any): Filter = js.native

      def Brighten(imageData: js.Any): Filter = js.native

      def Emboss(imageData: js.Any): Filter = js.native

      def Enhance(imageData: js.Any): Filter = js.native

      def Grayscale(imageData: js.Any): Filter = js.native

      def HSV(imageData: js.Any): Filter = js.native

      def Invert(imageData: js.Any): Filter = js.native

      def Mask(imageData: js.Any): Filter = js.native

      def Noise(imageData: js.Any): Filter = js.native

      def Pixelate(imageData: js.Any): Filter = js.native

      def Posterize(imageData: js.Any): Filter = js.native

      def RGB(imageData: js.Any): Filter = js.native

      def RGA(imageData: js.Any): Filter = js.native

      def Sepia(imageData: js.Any): Filter = js.native

      def Solarize(imageData: js.Any): Filter = js.native

      def Threshold(imageData: js.Any): Filter = js.native
    }

    @js.native
    @JSName("Konva.Animation")
    class Animation protected() extends js.Object {
      def this(func: js.Function, layers: js.Array[Layer] = ???) = this()

      //      def this(func: js.Function, layer: Layer = ???) = this() <- removed default value (see the line below)
      def this(func: js.Function, layer: Layer) = this()

      def addLayer(layer: Layer): Boolean = js.native

      def getLayers(): js.Array[Layer] = js.native

      def isRunning(): Boolean = js.native

      def setLayers(layers: js.Array[Layer]): Animation = js.native

      def setLayers(layer: Layer): Animation = js.native

      def start(): Animation = js.native

      def stop(): Animation = js.native
    }

    @js.native
    trait NodeConfig extends js.Object {
      var x: Double = js.native
      var y: Double = js.native
      var width: Double = js.native
      var height: Double = js.native
      var visible: Boolean = js.native
      var listening: Boolean = js.native
      var id: String = js.native
      var name: String = js.native
      var opacity: Number = js.native
      var scale: Vector2d = js.native
      var scaleX: Double = js.native
      var scaleY: Double = js.native
      var rotation: Double = js.native
      var rotationDeg: Double = js.native
      var offset: Vector2d = js.native
      var offsetX: Double = js.native
      var offsetY: Double = js.native
      var draggable: Boolean = js.native
      var dragBoundFunc: js.Function = js.native
    }

    @js.native
    trait SizeConfig extends js.Object {
      var x: Double = js.native
      var y: Double = js.native
      var width: Double = js.native
      var height: Double = js.native
    }

    @js.native
    trait ToDataURLConfig extends SizeConfig {
      var callback: js.Function = js.native
      var mimeType: String = js.native
      var quality: Double = js.native
    }

    @js.native
    trait CacheConfig extends SizeConfig {
      var drawBorder: Boolean = js.native
    }

    @js.native
    trait ClearConfig extends SizeConfig {
    }

    @js.native
    @JSName("Konva.Node")
    class Node protected() extends js.Object {
      def this(config: NodeConfig) = this()

      def blue(): Double = js.native

      def blue(blue: Double): Node = js.native

      def brightness(): Double = js.native

      def brightness(brightness: Double): Node = js.native

      def blurRadius(): Double = js.native

      def blurRadius(radius: Double): Node = js.native

      def cache(config: CacheConfig = ???): Node = js.native

      def clearCache(): Node = js.native

      def clear(bounds: ClearConfig = ???): Node = js.native

      def clone(attrs: NodeConfig = ???): Node = js.native

      def destroy(): Unit = js.native

      def dragBoundFunc(): js.Function = js.native

      def dragBoundFunc(dragBoundFunc: js.Function): Node = js.native

      def draggable(): Boolean = js.native

      def draggable(draggable: Boolean): Node = js.native

      def draw(): Node = js.native

      def embossBlend(): Boolean = js.native

      def embossBlend(embossBlend: Boolean): Node = js.native

      def embossDirection(): String = js.native

      def embossDirection(embossDirection: String): Node = js.native

      def embossStrength(): Double = js.native

      def embossStrength(level: Double): Node = js.native

      def embossWhiteLevel(): Double = js.native

      def embossWhiteLevel(embossWhiteLevel: Double): Node = js.native

      def enhance(): Double = js.native

      def enhance(enhance: Double): Node = js.native

      def filters(): js.Array[Filter] = js.native

      def filters(filters: Filter): Node = js.native

      def fire(eventType: String, evt: js.Any = ???, bubble: Boolean = ???): Node = js.native

      def getAbsoluteOpacity(): Double = js.native

      def getAbsolutePosition(): Vector2d = js.native

      def getAbsoluteTransform(): Transform = js.native

      def getAbsoluteZIndex(): Double = js.native

      def getAncestors(): Collection = js.native

      def getAttr(attr: String): js.Dynamic = js.native

      def getAttrs(): NodeConfig = js.native

      def getCanvas(): Canvas = js.native

      def getClassName(): String = js.native

      def getClientRect(): SizeConfig = js.native

      def getContext(): Context = js.native

      def getDepth(): Double = js.native

      def getHeight(): Double = js.native

      def getHitCanvas(): Canvas = js.native

      def getLayer(): Layer = js.native

      def getParent(): Container = js.native

      def getSize(): js.Any = js.native

      def getStage(): Stage = js.native

      def getTransform(): Transform = js.native

      def getType(): String = js.native

      def getWidth(): Double = js.native

      def getZIndex(): Double = js.native

      def green(): Double = js.native

      def green(green: Double): Node = js.native

      def height(): Double = js.native

      def height(height: Double): Node = js.native

      def hide(): Unit = js.native

      def hue(): Double = js.native

      def hue(hue: Double): Node = js.native

      def id(): String = js.native

      def id(id: String): Node = js.native

      def isDragging(): Boolean = js.native

      def isListening(): Boolean = js.native

      def isVisible(): Boolean = js.native

      def kaleidoscopeAngle(): Double = js.native

      def kaleidoscopeAngle(kaleidoscopeAngle: Double): Node = js.native

      def kaleidoscopePower(): Double = js.native

      def kaleidoscopePower(kaleidoscopePower: Double): Node = js.native

      def levels(): Double = js.native

      def levels(levels: Double): Node = js.native

      def listening(): js.Dynamic = js.native

      def listening(listening: Boolean): Node = js.native

      def listening(listening: String): Node = js.native

      def move(move: Vector2d): Node = js.native

      def moveDown(): Boolean = js.native

      def moveTo(newContainer: Container): Node = js.native

      def moveToBottom(): Boolean = js.native

      def moveToTop(): Boolean = js.native

      def moveUp(): Boolean = js.native

      def name(): String = js.native

      def name(name: String): Node = js.native

      def noise(): Double = js.native

      def noise(noise: Double): Node = js.native

      def off(evtStr: String): Node = js.native

      def offset(): Vector2d = js.native

      def offset(offset: Vector2d): Node = js.native

      def offsetX(): Double = js.native

      def offsetX(offsetX: Double): Node = js.native

      def offsetY(): Double = js.native

      def offsetY(offsetY: Double): Node = js.native

      def on(evtStr: String, handler: js.Function): Node = js.native

      def opacity(): Double = js.native

      def opacity(opacity: Double): Node = js.native

      def pixelSize(): Double = js.native

      def pixelSize(pixelSize: Double): Node = js.native

      def position(): Vector2d = js.native

      def position(position: Vector2d): Node = js.native

      def red(): Double = js.native

      def red(red: Double): Node = js.native

      def remove(): Node = js.native

      def rotate(theta: Double): Node = js.native

      def rotation(): Double = js.native

      def rotation(rotation: Double): Node = js.native

      def saturation(): Double = js.native

      def saturation(saturation: Double): Node = js.native

      def scale(): Vector2d = js.native

      def scale(scale: Vector2d): Node = js.native

      def scaleX(): Double = js.native

      def scaleX(scaleX: Double): Node = js.native

      def scaleY(): Double = js.native

      def scaleY(scaleY: Double): Node = js.native

      def setAbsolutePosition(pos: Vector2d): Node = js.native

      def setAttr(attr: String, `val`: js.Any): Node = js.native

      def setAttrs(attrs: NodeConfig): Unit = js.native

      def setId(id: String): Node = js.native

      def setSize(size: js.Any): Node = js.native

      def setZIndex(zIndex: Double): Unit = js.native

      def shouldDrawHit(): Boolean = js.native

      def show(): Node = js.native

      def skew(): Vector2d = js.native

      def skew(skew: Vector2d): Node = js.native

      def skewX(): Double = js.native

      def skewX(skewX: Double): Node = js.native

      def skewY(): Double = js.native

      def skewY(skewY: Double): Node = js.native

      def startDrag(): Unit = js.native

      def stopDrag(): Unit = js.native

      def threshold(): Double = js.native

      def threshold(threshold: Double): Node = js.native

      def toDataURL(config: ToDataURLConfig): String = js.native

      def toImage(config: ToDataURLConfig): HTMLImageElement = js.native

      def toJSON(): String = js.native

      def toObject(): js.Dynamic = js.native

      def transformsEnabled(): String = js.native

      def transformsEnabled(transformsEnabled: String): Node = js.native

      def value(): Double = js.native

      def value(value: Double): Node = js.native

      def visible(): js.Dynamic = js.native

      def visible(visible: Boolean): Node = js.native

      def visible(visible: String): Node = js.native

      def width(): Double = js.native

      def width(width: Double): Node = js.native

      def x(): Double = js.native

      def x(x: Double): Node = js.native

      def y(): Double = js.native

      def y(y: Double): Node = js.native
    }

    @js.native
    @JSName("Konva.Node")
    object Node extends js.Object {
      def create[T](data: js.Any, container: HTMLElement = ???): T = js.native
    }

    @js.native
    trait ContainerConfig extends NodeConfig {
      var clearBeforeDraw: Boolean = js.native
      var clipFunc: js.Function = js.native
    }

    @js.native
    @JSName("Konva.Container")
    class Container protected() extends Node {
      def this(params: ContainerConfig = ???) = this()

      def add(child: Node): Container = js.native

      def getChildren(filterfunc: js.Function = ???): Collection = js.native

      def clip(): SizeConfig = js.native

      def clip(clip: SizeConfig): Container = js.native

      def clipHeight(): Double = js.native

      def clipHeight(clipHeight: Double): Container = js.native

      def clipWidth(): Double = js.native

      def clipWidth(clipWidth: Double): Container = js.native

      def clipX(): Double = js.native

      def clipX(clipX: Double): Container = js.native

      def clipY(): Double = js.native

      def clipY(clipY: Double): Container = js.native

      def destroyChildren(): Unit = js.native

      def find(selector: String = ???): Collection = js.native

      def getAllIntersections(pos: Vector2d): js.Array[Node] = js.native

      def hasChildren(): Boolean = js.native

      def removeChildren(): Unit = js.native
    }

    @js.native
    trait ShapeConfig extends NodeConfig {
      var fill: String = js.native
      var fillPatternImage: HTMLImageElement = js.native
      var fillPatternX: Double = js.native
      var fillPatternY: Double = js.native
      var fillPatternOffset: Vector2d = js.native
      var fillPatternOffsetX: Double = js.native
      var fillPatternOffsetY: Double = js.native
      var fillPatternScale: Vector2d = js.native
      var fillPatternScaleX: Double = js.native
      var fillPatternScaleY: Double = js.native
      var fillPatternRotation: Double = js.native
      var fillPatternRepeat: String = js.native
      var fillLinearGradientStartPoint: Vector2d = js.native
      var fillLinearGradientStartPointX: Double = js.native
      var fillLinearGradientStartPointY: Double = js.native
      var fillLinearGradientEndPoint: Vector2d = js.native
      var fillLinearGradientEndPointX: Double = js.native
      var fillLinearGradientEndPointY: Double = js.native
      var fillLinearGradientColorStops: js.Array[String] = js.native
      var fillLinearRadialStartPoint: Vector2d = js.native
      var fillLinearRadialStartPointX: Double = js.native
      var fillLinearRadialStartPointY: Double = js.native
      var fillLinearRadialEndPoint: Vector2d = js.native
      var fillLinearRadialEndPointX: Double = js.native
      var fillLinearRadialEndPointY: Double = js.native
      var fillRadialGradientStartRadius: Double = js.native
      var fillRadialGradientEndRadius: Double = js.native
      var fillRadialGradientColorStops: js.Array[String] = js.native
      var fillEnabled: Boolean = js.native
      var fillPriority: String = js.native
      var stroke: String = js.native
      var strokeWidth: Double = js.native
      var strokeScaleEnabled: Boolean = js.native
      var strokeEnabled: Boolean = js.native
      var lineJoin: String = js.native
      var lineCap: String = js.native
      var sceneFunc: js.Function1[Context, Unit] = js.native
      var hitFunc: js.Function1[Context, Unit] = js.native
      var drawFunc: js.Function1[Context, Unit] = js.native
      var shadowColor: String = js.native
      var shadowBlur: Double = js.native
      var shadowOffset: Vector2d = js.native
      var shadowOffsetX: Double = js.native
      var shadowOffsetY: Double = js.native
      var shadowOpacity: Double = js.native
      var shadowEnabled: Boolean = js.native
      var dash: js.Array[Double] = js.native
      var dashEnabled: Boolean = js.native
    }

    @js.native
    @JSName("Konva.Shape")
    class Shape protected() extends Node {
      def this(ShapeConfig: ShapeConfig) = this()

      def dash(): js.Array[Double] = js.native

      def dash(dash: js.Array[Double]): Shape = js.native

      def dashEnabled(): Boolean = js.native

      def dashEnabled(dashEnabled: Boolean): Shape = js.native

      def drawHitFromCache(alphaThreshold: Double): Shape = js.native

      def fill(): String = js.native

      def fill(fill: String): Shape = js.native

      def fillEnabled(): Boolean = js.native

      def fillEnabled(fillEnabled: Boolean): Shape = js.native

      def fillLinearGradientColorStops(): js.Array[String] = js.native

      def fillLinearGradientColorStops(colors: js.Array[String]): Shape = js.native

      def fillLinearGradientStartPoint(): Vector2d = js.native

      def fillLinearGradientStartPoint(point: Vector2d): Vector2d = js.native

      def fillLinearGradientStartPointX(): Double = js.native

      def fillLinearGradientStartPointX(x: Double): Shape = js.native

      def fillLinearGradientStartPointY(): Double = js.native

      def fillLinearGradientStartPointY(y: Double): Shape = js.native

      def fillLinearGradientEndPoint(): Vector2d = js.native

      def fillLinearGradientEndPoint(point: Vector2d): Shape = js.native

      def fillLinearGradientEndPointX(): Double = js.native

      def fillLinearGradientEndPointX(x: Double): Shape = js.native

      def fillLinearGradientEndPointY(): Double = js.native

      def fillLinearGradientEndPointY(y: Double): Shape = js.native

      def fillLinearRadialStartPoint(): Vector2d = js.native

      def fillLinearRadialStartPoint(point: Vector2d): Shape = js.native

      def fillLinearRadialStartPointX(): Double = js.native

      def fillLinearRadialStartPointX(x: Double): Shape = js.native

      def fillLinearRadialStartPointY(): Double = js.native

      def fillLinearRadialStartPointY(y: Double): Shape = js.native

      def fillLinearRadialEndPoint(): Vector2d = js.native

      def fillLinearRadialEndPoint(point: Vector2d): Vector2d = js.native

      def fillLinearRadialEndPointX(): Double = js.native

      def fillLinearRadialEndPointX(x: Double): Shape = js.native

      def fillLinearRadialEndPointY(): Double = js.native

      def fillLinearRadialEndPointY(y: Double): Shape = js.native

      def fillPatternImage(): HTMLImageElement = js.native

      def fillPatternImage(image: HTMLImageElement): Shape = js.native

      def fillRadialGradientStartRadius(): Double = js.native

      def fillRadialGradientStartRadius(radius: Double): Shape = js.native

      def fillRadialGradientEndRadius(): Double = js.native

      def fillRadialGradientEndRadius(radius: Double): Shape = js.native

      def fillRadialGradientColorStops(): js.Array[String] = js.native

      def fillRadialGradientColorStops(color: js.Array[String]): Shape = js.native

      def fillPatternOffset(): Vector2d = js.native

      def fillPatternOffset(offset: Vector2d): Shape = js.native

      def fillPatternOffsetX(): Double = js.native

      def fillPatternOffsetX(x: Double): Shape = js.native

      def fillPatternOffsetY(): Double = js.native

      def fillPatternOffsetY(y: Double): Shape = js.native

      def fillPatternRepeat(): String = js.native

      def fillPatternRepeat(repeat: String): Shape = js.native

      def fillPatternRotation(): Double = js.native

      def fillPatternRotation(rotation: Double): Shape = js.native

      def fillPatternScale(): Vector2d = js.native

      def fillPatternScale(scale: Vector2d): Shape = js.native

      def fillPatternScaleX(): Double = js.native

      def fillPatternScaleX(x: Double): Shape = js.native

      def fillPatternScaleY(): Double = js.native

      def fillPatternScaleY(y: Double): Shape = js.native

      def fillPatternX(): Double = js.native

      def fillPatternX(x: Double): Double = js.native

      def fillPatternY(): Double = js.native

      def fillPatternY(y: Double): Shape = js.native

      def fillPriority(): String = js.native

      def fillPriority(priority: String): Shape = js.native

      def hasFill(): Boolean = js.native

      def hasShadow(): Boolean = js.native

      def hasStroke(): Boolean = js.native

      def hitFunc(): js.Function = js.native

      def hitFunc(func: js.Function): Shape = js.native

      def intersects(point: Vector2d): Boolean = js.native

      def lineCap(): String = js.native

      def lineCap(lineCap: String): Shape = js.native

      def lineJoin(): String = js.native

      def lineJoin(lineJoin: String): Shape = js.native

      def sceneFunc(): js.Function = js.native

      def sceneFunc(func: js.Function1[Context, js.Any]): Shape = js.native

      def shadowColor(): String = js.native

      def shadowColor(shadowColor: String): Shape = js.native

      def shadowEnabled(): Boolean = js.native

      def shadowEnabled(shadowEnabled: Boolean): Shape = js.native

      def shadowOffset(): Vector2d = js.native

      def shadowOffset(shadowOffset: Vector2d): Shape = js.native

      def shadowOffsetX(): Double = js.native

      def shadowOffsetX(shadowOffsetX: Double): Shape = js.native

      def shadowOffsetY(): Double = js.native

      def shadowOffsetY(shadowOffsetY: Double): Shape = js.native

      def shadowOpacity(): Double = js.native

      def shadowOpacity(shadowOpacity: Double): Shape = js.native

      def shadowBlur(): Double = js.native

      def shadowBlur(blur: Double): Shape = js.native

      def stroke(): String = js.native

      def stroke(stroke: String): Shape = js.native

      def strokeEnabled(): Boolean = js.native

      def strokeEnabled(strokeEnabled: Boolean): Shape = js.native

      def strokeScaleEnabled(): Boolean = js.native

      def strokeScaleEnabled(strokeScaleEnabled: Boolean): Shape = js.native

      def strokeHitEnabled(): Boolean = js.native

      def strokeHitEnabled(strokeHitEnabled: Boolean): Shape = js.native

      def strokeWidth(): Double = js.native

      def strokeWidth(strokeWidth: Double): Shape = js.native
    }

    @js.native
    trait StageConfig extends ContainerConfig {
      var container: Types.Container = js.native
    }

    object StageConfig {
      def apply(container: js.Any,
                x: Int = 0,
                y: Int = 0,
                width: Int,
                height: Int): StageConfig = {
        js.Dynamic.literal(container = container, x = x, y = y, width = width, height = height).asInstanceOf[StageConfig]
      }
    }


    @js.native
    @JSName("Konva.Stage")
    class Stage protected() extends Container {
      def this(StageConfig: StageConfig) = this()

      def add(layer: Layer): Stage = js.native

      def batchDraw(): Unit = js.native

      def container(): HTMLElement = js.native

      override def destroy(): Unit = js.native

      def drawHit(): Unit = js.native

      def getIntersection(pos: Vector2d): Shape = js.native

      def getLayers(): js.Array[Layer] = js.native

      def getPointerPosition(): Vector2d = js.native

      def setContainer(con: HTMLElement): Unit = js.native

      def setHeight(height: Double): Unit = js.native

      def setWidth(width: Double): Unit = js.native
    }

    @js.native
    trait LayerConfig extends ContainerConfig {
      //      override var clearBeforeDraw: Boolean = js.native
    }

    @js.native
    @JSName("Konva.Layer")
    class Layer protected() extends Container {
      def this(config: LayerConfig = ???) = this()

      def getIntersection(pos: Vector2d): Shape = js.native

      def enableHitGraph(): Layer = js.native

      def disableHitGraph(): Layer = js.native

      def clearBeforeDraw(): Boolean = js.native

      def clearBeforeDraw(`val`: Boolean): Layer = js.native

      def hitGraphEnabled(): Boolean = js.native

      def hitGraphEnabled(`val`: Boolean): Layer = js.native

      def batchDraw(): Unit = js.native

      def drawScene(): Unit = js.native
    }

    @js.native
    @JSName("Konva.Group")
    class Group extends Container {
    }

    @js.native
    trait CanvasConfig extends js.Object {
      var width: Double = js.native
      var height: Double = js.native
      var pixelRatio: Double = js.native
    }

    @js.native
    @JSName("Konva.Canvas")
    class Canvas protected() extends js.Object {
      def this(CanvasConfig: CanvasConfig) = this()

      def getContext(): CanvasRenderingContext2D = js.native

      def getHeight(): Double = js.native

      def getWidth(): Double = js.native

      def getPixelRatio(): Double = js.native

      def setHeight(`val`: Double): Unit = js.native

      def setWidth(`val`: Double): Unit = js.native

      def setPixelRatio(`val`: Double): Unit = js.native

      def setSize(size: js.Any): Unit = js.native

      def toDataURL(mimeType: String, quality: Double): String = js.native

      var _canvas: HTMLElement = js.native
    }

    @js.native
    @JSName("Konva.Context")
    class Context extends js.Object {
      def clear(bounds: ClearConfig = ???): Context = js.native

      def clearTrace(): Unit = js.native

      def fillShape(shape: Shape): Unit = js.native

      def fillStrokeShape(shape: Shape): Unit = js.native

      def getCanvas(): Canvas = js.native

      def getTrace(relaxed: Boolean): String = js.native

      def reset(): Unit = js.native

      def moveTo(x: Double, y: Double): Unit = js.native

      def lineTo(x: Double, y: Double): Unit = js.native

      def beginPath(): Unit = js.native

      def setAttr(attr: String, value: js.Any): Unit = js.native

      def closePath(): Unit = js.native

      def strokeShape(shape: Shape): Unit = js.native
    }

    @js.native
    @JSName("Konva.Tween")
    class Tween protected() extends js.Object {
      def this(params: js.Any) = this()

      def destroy(): Unit = js.native

      def finish(): Tween = js.native

      def pause(): Tween = js.native

      def play(): Tween = js.native

      def reset(): Tween = js.native

      def reverse(): Tween = js.native

      def seek(t: Double): Tween = js.native
    }

    @js.native
    trait RingConfig extends ShapeConfig {
      var innerRadius: Double = js.native
      var outerRadius: Double = js.native
      var clockwise: Boolean = js.native
    }

    @js.native
    @JSName("Konva.Ring")
    class Ring protected() extends Shape {
      def this(RingConfig: RingConfig) = this()

      def angle(): Double = js.native

      def angle(angle: Double): Ring = js.native

      def innerRadius(): Double = js.native

      def innerRadius(innerRadius: Double): Ring = js.native

      def outerRadius(): Double = js.native

      def outerRadius(outerRadius: Double): Ring = js.native
    }

    @js.native
    trait ArcConfig extends RingConfig {
      var angle: Double = js.native
    }

    @js.native
    @JSName("Konva.Arc")
    class Arc protected() extends Shape {
      def this(ArcConfig: ArcConfig) = this()

      def clockwise(): Boolean = js.native

      def clockwise(clockwise: Boolean): Arc = js.native
    }

    @js.native
    trait CircleConfig extends ShapeConfig {
      var radius: Double = js.native
    }

    object CircleConfig {
      def apply(x: Int = ???,
                y: Int = ???,
                radius: Int,
                fill: String = ???,
                stroke: String = ???,
                strokeWidth: Int = ???): CircleConfig = {
        js.Dynamic.literal(x = x,
          y = y,
          radius = radius,
          fill = fill,
          stroke = stroke,
          strokeWidth = strokeWidth).asInstanceOf[CircleConfig]

      }
    }

    //////////////////////
    trait AjaxOptions extends js.Object {
      val url: String = js.native
      val success: js.Function0[Unit] = js.native
    }

    object AjaxOptions {
      def apply(url: String, success: js.Function0[Unit]): AjaxOptions = {
        js.Dynamic.literal(url = url, success = success).asInstanceOf[AjaxOptions]
      }
    }

    //////////////////////


    @js.native
    @JSName("Konva.Circle")
    class Circle protected() extends Shape {
      def this(CircleConfig: CircleConfig) = this()

      def radius(): Double = js.native

      def radius(radius: Double): Circle = js.native
    }

    @js.native
    trait EllipseConfig extends ShapeConfig {
      var radius: js.Any = js.native
    }

    @js.native
    @JSName("Konva.Ellipse")
    class Ellipse protected() extends Shape {
      def this(EllipseConfig: EllipseConfig) = this()

      def radius(): js.Dynamic = js.native

      def radius(radius: js.Any): Ellipse = js.native

      def radiusX(): Double = js.native

      def radiusX(radiusX: Double): Ellipse = js.native

      def radiusY(): Double = js.native

      def radiusY(radiusY: Double): Ellipse = js.native
    }

    @js.native
    trait ImageConfig extends ShapeConfig {
      var image: HTMLImageElement = js.native
      var crop: SizeConfig = js.native
    }

    @js.native
    @JSName("Konva.Image")
    class Image protected() extends Shape {
      def this(ImageConfig: ImageConfig) = this()

      def image(): HTMLImageElement = js.native

      def image(image: HTMLImageElement): Image = js.native

      def crop(): SizeConfig = js.native

      def crop(crop: SizeConfig): Image = js.native

      def cropX(): Double = js.native

      def cropX(cropX: Double): Image = js.native

      def cropY(): Double = js.native

      def cropY(cropY: Double): Image = js.native

      def cropWidth(): Double = js.native

      def cropWidth(cropWidth: Double): Image = js.native

      def cropHeight(): Double = js.native

      def cropHeight(cropHeight: Double): Image = js.native
    }

    @js.native
    trait LineConfig extends ShapeConfig {
      var points: js.Array[Double] = js.native
      var tension: Double = js.native
      var closed: Boolean = js.native
    }

    @js.native
    @JSName("Konva.Line")
    class Line protected() extends Shape {
      def this(LineConfig: LineConfig) = this()

      def closed(): Boolean = js.native

      def closed(closed: Boolean): Line = js.native

      def tension(): Double = js.native

      def tension(tension: Double): Line = js.native

      def points(): js.Array[Double] = js.native

      def points(points: js.Array[Double]): Line = js.native
    }

    @js.native
    trait RectConfig extends ShapeConfig {
      var cornerRadius: Double = js.native
    }

    @js.native
    @JSName("Konva.Rect")
    class Rect protected() extends Shape {
      def this(RectConfig: RectConfig) = this()

      def cornerRadius(): Double = js.native

      def cornerRadius(cornerRadius: Double): Rect = js.native
    }

    @js.native
    trait SpriteConfig extends ShapeConfig {
      var animation: String = js.native
      var animations: js.Any = js.native
      var frameIndex: Double = js.native
      var image: HTMLImageElement = js.native
    }

    @js.native
    @JSName("Konva.Sprite")
    class Sprite protected() extends Shape {
      def this(SpriteConfig: SpriteConfig) = this()

      def start(): Unit = js.native

      def stop(): Unit = js.native

      def animation(): String = js.native

      def animation(`val`: String): Sprite = js.native

      def animations(): js.Dynamic = js.native

      def animations(`val`: js.Any): Sprite = js.native

      def frameIndex(): Double = js.native

      def frameIndex(`val`: Double): Sprite = js.native

      def image(): HTMLImageElement = js.native

      def image(image: HTMLImageElement): Sprite = js.native

      def frameRate(): Double = js.native

      def frameRate(frameRate: Double): Sprite = js.native
    }

    @js.native
    trait TextConfig extends ShapeConfig {
      var text: String = js.native
      var fontFamily: String = js.native
      var fontSize: Double = js.native
      var fontStyle: String = js.native
      var align: String = js.native
      var padding: Double = js.native
      var lineHeight: Double = js.native
      var wrap: String = js.native
    }

    @js.native
    @JSName("Konva.Text")
    class Text protected() extends Shape {
      def this(TextConfig: TextConfig) = this()

      def getTextWidth(): Double = js.native

      def getTextHeight(): Double = js.native

      def text(): String = js.native

      def text(text: String): Text = js.native

      def fontFamily(): String = js.native

      def fontFamily(fontFamily: String): Text = js.native

      def fontSize(): Double = js.native

      def fontSize(fontSize: Double): Text = js.native

      def fontStyle(): String = js.native

      def fontStyle(fontStyle: String): Text = js.native

      def fontVariant(): String = js.native

      def fontVariant(fontVariant: String): Text = js.native

      def align(): String = js.native

      def align(align: String): Text = js.native

      def padding(): Double = js.native

      def padding(padding: Double): Text = js.native

      def lineHeight(): Double = js.native

      def lineHeight(lineHeight: Double): Text = js.native

      def wrap(): String = js.native

      def wrap(wrap: String): Text = js.native
    }

    @js.native
    trait WedgeConfig extends ShapeConfig {
      var angle: Double = js.native
      var radius: Double = js.native
      var clockwise: Boolean = js.native
    }

    @js.native
    @JSName("Konva.Wedge")
    class Wedge protected() extends Shape {
      def this(WedgeConfig: WedgeConfig) = this()

      def angle(): Double = js.native

      def angle(angle: Double): Wedge = js.native

      def radius(): Double = js.native

      def radius(radius: Double): Wedge = js.native

      def clockwise(): Boolean = js.native

      def clockwise(clockwise: Boolean): Wedge = js.native
    }

    @js.native
    trait TagConfig extends ShapeConfig {
      var pointerDirection: String = js.native
      var pointerWidth: Double = js.native
      var pointerHeight: Double = js.native
      var cornerRadius: Double = js.native
    }

    @js.native
    @JSName("Konva.Tag")
    class Tag protected() extends Shape {
      def this(config: TagConfig) = this()

      def pointerDirection(): String = js.native

      def pointerDirection(pointerDirection: String): Tag = js.native

      def pointerWidth(): Double = js.native

      def pointerWidth(pointerWidth: Double): Tag = js.native

      def pointerHeight(): Double = js.native

      def pointerHeight(pointerHeight: Double): Tag = js.native

      def cornerRadius(): Double = js.native

      def cornerRadius(cornerRadius: Double): Tag = js.native
    }

    @js.native
    trait LabelInterface extends ContainerConfig {
    }

    @js.native
    @JSName("Konva.Label")
    class Label protected() extends Group {
      def this(LabelInterface: LabelInterface) = this()

      def getText(): Text = js.native

      def getTag(): Rect = js.native
    }

    @js.native
    trait PathConfig extends ShapeConfig {
      var data: String = js.native
    }

    @js.native
    @JSName("Konva.Path")
    class Path protected() extends Shape {
      def this(PathConfig: PathConfig) = this()

      def data(): String = js.native

      def data(data: String): Path = js.native
    }

    @js.native
    trait RegularPolygonConfig extends ShapeConfig {
      var sides: Double = js.native
      var radius: Double = js.native
    }

    @js.native
    @JSName("Konva.RegularPolygon")
    class RegularPolygon protected() extends Shape {
      def this(RegularPolygonConfig: RegularPolygonConfig) = this()

      def sides(): Double = js.native

      def sides(sides: Double): RegularPolygon = js.native

      def radius(): Double = js.native

      def radius(radius: Double): RegularPolygon = js.native
    }

    @js.native
    trait StarConfig extends ShapeConfig {
      var numPoints: Double = js.native
      var innerRadius: Double = js.native
      var outerRadius: Double = js.native
    }

    @js.native
    @JSName("Konva.Star")
    class Star protected() extends Shape {
      def this(StarConfig: StarConfig) = this()

      def numPoints(): Double = js.native

      def numPoints(numPoints: Double): Star = js.native

      def innerRadius(): Double = js.native

      def innerRadius(innerRadius: Double): Star = js.native

      def outerRadius(): Double = js.native

      def outerRadius(outerRadius: Double): Star = js.native
    }

    @js.native
    trait TextPathConfig extends ShapeConfig {
      var text: String = js.native
      var data: String = js.native
      var fontFamily: String = js.native
      var fontSize: Double = js.native
      var fontStyle: String = js.native
    }

    @js.native
    @JSName("Konva.TextPath")
    class TextPath protected() extends Shape {
      def this(TextPathConfig: TextPathConfig) = this()

      def getTextWidth(): Double = js.native

      def getTextHeight(): Double = js.native

      def setText(text: String): Unit = js.native

      def text(): String = js.native

      def text(text: String): Path = js.native

      def fontFamily(): String = js.native

      def fontFamily(fontFamily: String): Path = js.native

      def fontSize(): Double = js.native

      def fontSize(fontSize: Double): Path = js.native

      def fontStyle(): String = js.native

      def fontStyle(fontStyle: String): Path = js.native
    }

    @js.native
    @JSName("Konva.Collection")
    class Collection extends js.Object {
      @JSBracketAccess
      def apply(i: Double): js.Any = js.native

      @JSBracketAccess
      def update(i: Double, v: js.Any): Unit = js.native

      def each(f: js.Function1[Node, Unit]): Unit = js.native

      def toArray(): js.Array[js.Any] = js.native

      var length: Double = js.native
    }

    @js.native
    @JSName("Konva.Collection")
    object Collection extends js.Object {
      def toCollection(arr: js.Array[js.Any]): Collection = js.native
    }

    @js.native
    @JSName("Konva.Transform")
    class Transform extends js.Object {
      def getMatrix(): js.Array[js.Any] = js.native

      def getTranslation(): Vector2d = js.native

      def invert(): Unit = js.native

      def multiply(matrix: js.Array[js.Any]): Unit = js.native

      def rotate(deg: Double): Unit = js.native

      def scale(x: Double, y: Number): Unit = js.native

      def setAbsolutePosition(): Unit = js.native

      def skew(x: Double, y: Number): Unit = js.native

      def translate(x: Double, y: Number): Unit = js.native
    }

    @js.native
    trait Vector2d extends js.Object {
      var x: Double = js.native
      var y: Double = js.native
    }

    @JSName("Konva")
    @js.native
    object Konva extends js.Object {
      var pixelRatio: Double = js.native
      var dragDistance: Double = js.native
      var isDragging: js.Function0[Boolean] = js.native
      var isDragReady: js.Function0[Boolean] = js.native
      var DD: js.Any = js.native
    }

  }

}
