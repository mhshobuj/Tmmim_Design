package com.example.tmmimdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jem.rubberpicker.RubberRangePicker;

import org.jetbrains.annotations.NotNull;

import kotlin.jvm.internal.Intrinsics;

public class RangeSeekBar extends AppCompatActivity {

    private TextView rubberRangePickerStartValue, rubberRangePickerEndValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_range_seek_bar);

        rubberRangePickerStartValue = findViewById(R.id.rubberRangePickerStartValue);
        rubberRangePickerEndValue = findViewById(R.id.rubberRangePickerEndValue);

        RubberRangePicker rubberRangePicker = new RubberRangePicker((Context)this);

        rubberRangePicker.setMin(0);
        rubberRangePicker.setMax(1000);

        int startThumbValue = rubberRangePicker.getCurrentStartValue();
        rubberRangePicker.setCurrentStartValue(startThumbValue + 10);


        int endThumbValue = rubberRangePicker.getCurrentEndValue();
        rubberRangePicker.setCurrentEndValue(endThumbValue - 10);


        rubberRangePicker.setOnRubberRangePickerChangeListener((RubberRangePicker.OnRubberRangePickerChangeListener)(new RubberRangePicker.OnRubberRangePickerChangeListener() {
            public void onProgressChanged(@NotNull RubberRangePicker rangePicker, int startValue, int endValue, boolean fromUser) {
                Intrinsics.checkNotNullParameter(rangePicker, "rangePicker");
            }

            public void onStartTrackingTouch(@NotNull RubberRangePicker rangePicker, boolean isStartThumb) {
                Intrinsics.checkNotNullParameter(rangePicker, "rangePicker");
            }

            public void onStopTrackingTouch(@NotNull RubberRangePicker rangePicker, boolean isStartThumb) {
                Intrinsics.checkNotNullParameter(rangePicker, "rangePicker");
            }
        }));


        rubberRangePicker.setOnRubberRangePickerChangeListener((RubberRangePicker.OnRubberRangePickerChangeListener)(new RubberRangePicker.OnRubberRangePickerChangeListener() {
            public void onProgressChanged(@NotNull RubberRangePicker rangePicker, int startValue, int endValue, boolean fromUser) {
                Intrinsics.checkNotNullParameter(rangePicker, "rangePicker");

                //TextView startVal = rubberRangePickerStartValue;
                Intrinsics.checkNotNullExpressionValue(rubberRangePickerStartValue, "rubberRangePickerStartValue");
                rubberRangePickerStartValue.setText((CharSequence)String.valueOf(startValue));
                Log.e("Value","StartValueCng "+startValue);

               // TextView endVal = rubberRangePickerEndValue;
                Intrinsics.checkNotNullExpressionValue(rubberRangePickerEndValue, "rubberRangePickerEndValue");
                rubberRangePickerEndValue.setText((CharSequence)String.valueOf(endValue));
                Log.e("Value","EndValueCng "+endValue);
            }

            public void onStartTrackingTouch(@NotNull RubberRangePicker rangePicker, boolean isStartThumb) {
                Intrinsics.checkNotNullParameter(rangePicker, "rangePicker");
            }

            public void onStopTrackingTouch(@NotNull RubberRangePicker rangePicker, boolean isStartThumb) {
                Intrinsics.checkNotNullParameter(rangePicker, "rangePicker");
            }
        }));
    }
}