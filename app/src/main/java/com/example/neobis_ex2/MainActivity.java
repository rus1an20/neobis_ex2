package com.example.neobis_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView contact = findViewById(R.id.contact);
        String con;
        con = "Адрес: Ул.Гоголя 138\nРежим работы: с 9:00 до 22:00\nТел.: 0(703)-333-333\n\n\n\n";
        contact.setText(con);
    }
}