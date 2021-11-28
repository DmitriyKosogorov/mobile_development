package com.example.testcanvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View
import java.util.*
import android.widget.Toast


class MyView(context: Context?) : View(context) {
    val p = Paint();
    val r = Random()
    // массив из логических значений  4*4
    val tiles = Array(4) { BooleanArray(4) { r.nextBoolean() } }
    var centerX = 50f
    var centerY = 50f
    val numberer=16
    val dark=Color.BLACK
    val light=Color.WHITE
    var even=false

    fun is_victory():Boolean
    {
        var sum=0
        for(i in tiles)
            for(j in i)
            {
                if(j)
                    sum+=1
            }
        if(sum==0 || sum==numberer)
            return true
        return false
    }

    override fun onDraw(canvas: Canvas?) {

        canvas?.apply {
            drawColor(Color.YELLOW)
            var left=0
            var top=0
            var width=200
            var height=200
            var indx:Int=0
            var indy:Int=0
            for(i in 0..3)
            {
                if(i*210+100<centerX && (i+1)*210+100>centerX)
                    indy=i
                if(i*210+100<centerY && (i+1)*210+100>centerY)
                    indx=i
            }
            if(even==true) {

                for(k in 0..3) {
                    tiles[indx][k] = !(tiles[indx][k])
                    tiles[k][indy] = !(tiles[k][indy])
                }
                tiles[indx][indy]=!(tiles[indx][indy])
            }


            left=100
            top=100
            if(is_victory())
            {
                context.apply{Toast.makeText(context, "Вы победили!", Toast.LENGTH_SHORT).show();}
                for (i in 0..3) {
                    for (j in 0..3) {
                        tiles[i][j]=r.nextBoolean()
                        if (tiles[i][j] == true)
                            p.setColor(Color.BLACK)
                        else
                            p.setColor(Color.WHITE)
                        drawRect(
                            left.toFloat(),
                            top.toFloat(),
                            (left + width).toFloat(),
                            (top + height).toFloat(),
                            p)
                        left = left + width + 20
                    }
                    left = 100
                    top = top + width + 20
                }
            }
            else {
                for (i in 0..3) {
                    for (j in 0..3) {
                        if (tiles[i][j] == true)
                            p.setColor(Color.BLACK)
                        else
                            p.setColor(Color.WHITE)
                        drawRect(
                            left.toFloat(),
                            top.toFloat(),
                            (left + width).toFloat(),
                            (top + height).toFloat(),
                            p
                        )
                        left = left + width + 20
                    }
                    left = 100
                    top = top + width + 20
                }
            }
        }

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        event?.apply {
            if(event.action == MotionEvent.ACTION_DOWN)
            {
                centerX = x; centerY = y
                even=true
            }
            else
                even=false

        }
        invalidate()

        return true
    }
}