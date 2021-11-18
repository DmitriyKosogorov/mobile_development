import kotlin.math.abs
class Square(var x:Int, var y:Int, var width:Int): Movable, Figure(0)  {
    constructor(square:Square) : this(square.x, square.y, square.width)

    override fun mover(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun show_location() {
        print(x)
        print(" ")
        println(y)
    }

    override fun area(): Float {
        return (width*width).toFloat() // требуется явное приведение к вещественному числу
    }

    override fun resize(zoom: Int) {
        width=width*zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val x_diff= abs(x-centerX)
        val y_diff= abs(y-centerY)

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