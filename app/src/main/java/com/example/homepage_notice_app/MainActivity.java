package com.example.homepage_notice_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         findViewById(R.id.test_button).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(MainActivity.this, "Hello world", Toast.LENGTH_SHORT).show();
                 Toast.makeText(MainActivity.this, "Hello 3333", Toast.LENGTH_SHORT).show();
                 Toast.makeText(MainActivity.this, "Hello test_없어지진않겠지이이이이이", Toast.LENGTH_SHORT).show();

                 // 안녕하세요
                 int value = 0;
                 for (int i = 0; i < 10; i++) {
                     value++;
                 }










             }
         });

        // ㅎㅇㅎㅇ
    }
}