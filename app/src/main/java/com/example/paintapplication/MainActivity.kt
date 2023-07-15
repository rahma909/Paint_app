package com.example.paintapplication

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.example.paintapplication.paintView.Companion.colorList
import com.example.paintapplication.paintView.Companion.currentBrush
import com.example.paintapplication.paintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path=Path()
        var paintBrush=Paint()
    }


    lateinit var redBtn:ImageButton
    lateinit var yellowBtn:ImageButton
    lateinit var blueBtn:ImageButton
    lateinit var blackBtn:ImageButton
    lateinit var grayBtn:ImageButton
    lateinit var greenBtn:ImageButton
    lateinit var replyBtn:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        redBtn=findViewById(R.id.red_color)
        yellowBtn=findViewById(R.id.yellow_color)
        blueBtn=findViewById(R.id.blue_color)
        blackBtn=findViewById(R.id.black_color)
        grayBtn=findViewById(R.id.gray_color)
        greenBtn=findViewById(R.id.green_color)
        replyBtn=findViewById(R.id.reply_color)


        redBtn.setOnClickListener{
            Toast.makeText(this,"RED",Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.RED
            currentColor(paintBrush.color)
        }
        yellowBtn.setOnClickListener{
            Toast.makeText(this,"YELLOW",Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.YELLOW
            currentColor(paintBrush.color)
        }
        blueBtn.setOnClickListener{
            Toast.makeText(this,"BLUE",Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.BLUE
            currentColor(paintBrush.color)
        }
        blackBtn.setOnClickListener{
            Toast.makeText(this,"BLACK",Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.BLACK
            currentColor(paintBrush.color)
        }
        grayBtn.setOnClickListener{
            Toast.makeText(this,"GRAY",Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.LTGRAY
            currentColor(paintBrush.color)
        }
        greenBtn.setOnClickListener{
            Toast.makeText(this,"GREEN",Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.GREEN
            currentColor(paintBrush.color)
        }
        replyBtn.setOnClickListener{
            Toast.makeText(this,"Clear all",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }

    }
    private fun currentColor(color:Int){
        currentBrush=color
        path=Path()
    }
}