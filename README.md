В начале программа имеет 3 фигуры:
- Прямоугольник с центром в точке (0,0), шириной=2 и высотой=1
- Круг с центром в точке (0,0) и радиусом=4
- Квадрат центром в точке (0,0) и стороной=5

Программа вычисляет площадь данных фигур:
- Прямоугольника, как произведение ширины и высоты (2*1=2)
- Круга, как произведение pi на квадрат радиуса (3,1415 * 4^2 ≈ 50,265472)
- Квадрата, как квадрат стороны (5*5=25)
```
Areas:--------------------------------------
2.0
50.264
25.0
```
Затем программ изменяет размер фигур:
- Прямоугольника – в 2 раза(ширина=4, высота=2)
- Круга – в 3 раза(радиус=12)
- Квадрата – в 8 раз(сторона=40)

Потом программа заново вычисляет размер фигур, чтобы убедиться, что размер изменился:
- Rect.area=4*2=8
- Circle.area=3.1415*12^2 ≈ 452,38924
- Square.area=40^2 = 1600
```
Areas.resized:------------------------------
8.0
452.376
1600.0
```
Затем программа показывает координаты центров фигур(чтобы убедиться, что координаты существуют, и всё ещё находятся в начале координат)
```
Locations:----------------------------------
0 0
0 0
0 0
```
Потом программа поворачивает фигуры вокруг определённой точки:
- Прямоугольник поворачивается на 90° по часовой стрелке вокруг точки(2,4) и перемещается в точку (-2,6). При повороте прямоугольника на 90° его ширина и высота меняются значениями
- Круг поворачивается на 90° против часовой стрелки вокруг точки(8,1)  перемещается в точку(9,-7). Радиус не меняется.
- Квадрат поворачивается на 90° по часовой стрелке вокруг точки(3,3) и перемещается в точку (0,6). Стороны квадрата равны по длине и ничего не меняется при повороте на 90°

Программа выводит положения всех фигур, чтобы можно было убедиться, что фигуры переместились в нужные координаты.
```
Locations.changed:--------------------------
-2 6
9 -7
0 6
```
Наконец, программа просто перемещает фигуры:
- Прямоугольник перемещается на +1 по х и на +2 по у (-1,8)
- Круг перемещается на +5 по х и на -3 по у (14,-10)
- Квадрат перемещается на -2 по х и на -1 по у (-1,8)
И выводит координаты, чтобы можно было убедиться, что фигуры переместились в нужные координаты.
```
Moving:-------------------------------------
-1 8
14 -10
-2 5
```
