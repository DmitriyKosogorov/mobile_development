import kotlin.math.abs

class Circle(var x: Int, var y: Int, var radius:Int) : Movable,Figure(0) {

    constructor(circle:Circle) : this(circle.x, circle.y, circle.radius)

    override fun show_location() {
        print(x)
        print(" ")
        println(y)
    }

    override fun area(): Float {
        return  (3.1415*this.radius*this.radius).toFloat();
    }

    override fun resize(zoom: Int) {
        this.radius=this.radius*zoom
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

    override fun mover(dx: Int, dy: Int) {
        x+=dx
        y+=dy
    }
}