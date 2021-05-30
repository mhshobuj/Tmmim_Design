package com.example.tmmimdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class PlaningToolsUI extends AppCompatActivity {

    private RelativeLayout checkList_item, guestsList_item,
            guestLandingPage_item, manageQuotations_item, selectedVendors_item;
    private ImageView cancel_IV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planing_tools_ui);

        checkList_item = findViewById(R.id.checkList_item);
        guestsList_item = findViewById(R.id.guestsList_item);
        guestLandingPage_item = findViewById(R.id.guestLandingPage_item);
        manageQuotations_item = findViewById(R.id.manageQuotations_item);
        selectedVendors_item = findViewById(R.id.selectedVendors_item);

        cancel_IV = findViewById(R.id.cancel_IV);

        checkList_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlaningToolsUI.this, "CheckList Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        guestsList_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlaningToolsUI.this, "Guest List Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        guestLandingPage_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlaningToolsUI.this, "Guest Landing Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        manageQuotations_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlaningToolsUI.this, "Manage Quotations Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        selectedVendors_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlaningToolsUI.this, "Selected Vendors Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        cancel_IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}