package com.example.arifsanii.ngehemat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button harian,mingguan,bulanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        harian =findViewById(R.id.harian);
        mingguan = findViewById(R.id.mingguan);
        bulanan = findViewById(R.id.bulanan);

        harian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent harian = new Intent(MainActivity.this,harian.class);
                startActivity(harian);
            }
        });

        mingguan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mingguan = new Intent(MainActivity.this,mingguan.class);
                startActivity(mingguan);
            }
        });

        bulanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bulanan = new Intent(MainActivity.this,bulanan.class);
                startActivity(bulanan);
            }
        });
    }
}
