import kotlin.math.abs
class Rect(var x: Int, var y: Int, var width: Int, var height: Int) : Movable, Figure(0) {
    var color: Int = -1 // при объявлении каждое поле нужно инициализировать

    lateinit var name: String
    constructor(rect: Rect) : this(rect.x, rect.y, rect.width, rect.height)

    override fun show_location() {
        print(x)
        print(" ")
        println(y)
    }

    override fun mover(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun area(): Float {
        return (width*height).toFloat() // требуется явное приведение к вещественному числу
    }

    override fun resize(zoom: Int) {
        width=width*zoom
        height=height*zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val saver=width
        val x_diff=abs(x-centerX)
        val y_diff=abs(y-centerY)
        width=height
        height=saver
        if(direction==RotateDirection.Clockwise) {
            x=centerX-y_diff
            y=centerY+x_diff
        }
        else
        {
            x=centerX+y_diff
            y=centerY-x_diff
        }

    }
}