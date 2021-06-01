package com.example.tmmimdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button custom_calendar, scroll_custom_calendar, custom_price_range_bar, planning_tools_UI,
    password_pattern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        custom_calendar = findViewById(R.id.custom_calendar);
        scroll_custom_calendar = findViewById(R.id.scroll_custom_calendar);
        custom_price_range_bar = findViewById(R.id.custom_price_range_bar);
        planning_tools_UI = findViewById(R.id.planning_tools_UI);
        password_pattern = findViewById(R.id.password_pattern);

        custom_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CustomCalendar.class);
                startActivity(intent);
            }
        });

        scroll_custom_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ScrollCustomCalendar.class);
                startActivity(intent);
            }
        });
        custom_price_range_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RangeSeekBar.class);
                startActivity(intent);
            }
        });

        planning_tools_UI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlaningToolsUI.class);
                startActivity(intent);
            }
        });

        password_pattern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PasswordPattern.class);
                startActivity(intent);
            }
        });
    }
}