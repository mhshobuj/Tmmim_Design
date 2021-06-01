package com.example.tmmimdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.jem.rubberpicker.RubberRangePicker

class PriceRangeSeekBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_price_range_seek_bar)
        val rubberRangePickerStartValue = findViewById<TextView>(R.id.rubberRangePickerStartValue)
        val rubberRangePickerEndValue = findViewById<TextView>(R.id.rubberRangePickerEndValue)

        val rubberRangePicker = RubberRangePicker(this)
        rubberRangePicker.setMin(10)
        rubberRangePicker.setMax(865)


        val startThumbValue = rubberRangePicker.getCurrentStartValue()
        rubberRangePicker.setCurrentStartValue(startThumbValue + 10)
        val endThumbValue = rubberRangePicker.getCurrentEndValue()
        rubberRangePicker.setCurrentEndValue(endThumbValue + 10)
//        rubberRangePicker.setOnRubberRangePickerChangeListener(object: RubberRangePicker.OnRubberRangePickerChangeListener{
//            override fun onProgressChanged(rangePicker: RubberRangePicker, startValue: Int, endValue: Int, fromUser: Boolean) {}
//            override fun onStartTrackingTouch(rangePicker: RubberRangePicker, isStartThumb: Boolean) {}
//            override fun onStopTrackingTouch(rangePicker: RubberRangePicker, isStartThumb: Boolean) {}
//        })

        rubberRangePicker.setOnRubberRangePickerChangeListener(object: RubberRangePicker.OnRubberRangePickerChangeListener{
            override fun onProgressChanged(rangePicker: RubberRangePicker, startValue: Int, endValue: Int, fromUser: Boolean) {
                rubberRangePickerStartValue.text = startValue.toString()
                rubberRangePickerEndValue.text = endValue.toString()
            }
            override fun onStartTrackingTouch(rangePicker: RubberRangePicker, isStartThumb: Boolean) {}
            override fun onStopTrackingTouch(rangePicker: RubberRangePicker, isStartThumb: Boolean) {}
        })
    }
}