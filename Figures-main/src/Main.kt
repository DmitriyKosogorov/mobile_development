import java.awt.Rectangle

fun main() {

    // интерфейсы удобно использовать в коллекциях
    val figures: Array<Movable>
    val movable: Movable = Rect(0,0,1,1)
    movable.mover(1,1)
    // переменной базового класса
    val f1 = Rect(0,0,2,1)
    val f2 = Circle(0,0,4)
    val f3=Square(0,0,5)
    println("Areas:--------------------------------------")
    println(f1.area())
    println(f2.area())
    println(f3.area())
    println("Areas.resized:------------------------------")
    f1.resize(2)
    f2.resize(3)
    f3.resize(8)
    println(f1.area())
    println(f2.area())
    println(f3.area())
    println("Locations:----------------------------------")
    f1.show_location()
    f2.show_location()
    f3.show_location()
    println("Locations.changed:--------------------------")
    f1.rotate(RotateDirection.Clockwise, 2,4)
    f2.rotate(RotateDirection.CounterClockwise, 8,1)
    f3.rotate(RotateDirection.Clockwise, 3,3)
    f1.show_location()
    f2.show_location()
    f3.show_location()
    println("Moving:-------------------------------------")
    f1.mover(1,2)
    f2.mover(5,-3)
    f3.mover(-2,-1)
    f1.show_location()
    f2.show_location()
    f3.show_location()

}