package com.example.tmmimdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PasswordPattern extends AppCompatActivity {

    private EditText password_ET;
    private Button click_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_pattern);

        password_ET = findViewById(R.id.password_ET);
        click_Btn = findViewById(R.id.click_Btn);

        String blockCharacters = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        InputFilter filter = new InputFilter() {

            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

                if (source != null && blockCharacters.contains(("" + source))) {
                    return "";
                }
                return null;
            }
        };

        password_ET.setFilters(new InputFilter[] { filter });

        String password = password_ET.getText().toString();

        click_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PasswordPattern.this, "Pass: "+password, Toast.LENGTH_LONG).show();
            }
        });


//        if(password.matches("^(?=.*[_.()$&@]).*$")){
//            Toast.makeText(PasswordPattern.this, "Success", Toast.LENGTH_SHORT).show();
//        }
//
//        else{
//            Toast.makeText(PasswordPattern.this, "Please Give Only Special Char", Toast.LENGTH_SHORT).show();
//        }
    }
}