interface Transforming {
    fun resize(zoom: Int)

    fun rotate(direction: RotateDirection, centerX: Int, centerY: Int)

    fun show_location()
}

enum class RotateDirection {
    // направление вращения фигуры на 90 градусов
    Clockwise, CounterClockwise
}
