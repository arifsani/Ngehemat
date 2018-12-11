package com.example.arifsanii.ngehemat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class bulanan extends AppCompatActivity  {
    EditText makanan,transportasi,pulsa,kebutuhanlain;
    Button jumlah,hapus;
    TextView hasil;
    Spinner jumlah_hari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulanan);

        makanan = findViewById(R.id.makanan);
        transportasi = findViewById(R.id.transportasi);
        pulsa = findViewById(R.id.pulsa);
        kebutuhanlain = findViewById(R.id.kebutuhanlain);
        jumlah = findViewById(R.id.jumlah);
        hapus = findViewById(R.id.hapus);
        hasil = findViewById(R.id.hasil);
        jumlah_hari = findViewById(R.id.jumlah_hari);

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makanan.setText("");
                transportasi.setText("");
                pulsa.setText("");
                kebutuhanlain.setText("");
                hasil.setText("");
            }
        });
        jumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a1 = makanan.getText().toString();
                String b1 = transportasi.getText().toString();
                String c1 = pulsa.getText().toString();
                String d1 = kebutuhanlain.getText().toString();
                if (a1.matches("")){
                    Toast.makeText(bulanan.this,"Isi kolom makanan",Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (b1.matches("")){
                    Toast.makeText(bulanan.this,"Isi kolom transportasi",Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (c1.matches("")){
                    Toast.makeText(bulanan.this,"Isi kolom pulsa",Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (d1.matches("")){
                    Toast.makeText(bulanan.this,"Isi kolom kebutuhan lain",Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    int a = Integer.parseInt(a1);
                    int b = Integer.parseInt(b1);
                    int c = Integer.parseInt(c1);
                    int d = Integer.parseInt(d1);
                    int e = Integer.parseInt(jumlah_hari.getSelectedItem().toString());
                    int jumlah = (a+b+c+d)*e;
                    Hitung output = new Hitung();
                    hasil.setText("Pengeluaran Bulanan Anda : Rp." + output.hitungbulanan(jumlah) + ",00-");

                }
            }
        });
    }
}
