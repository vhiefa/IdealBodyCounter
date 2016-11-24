package com.vhiefa.idealbodycounter;

import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hitungBMI (View view){
        EditText input_tinggi = (EditText) findViewById(R.id.edittxt_mainactivity_tinggi);
        EditText input_berat = (EditText) findViewById(R.id.edittxt_mainactivity_berat);
        float nilai_tinggi = Integer.parseInt (input_tinggi.getText().toString());
        float nilai_berat = Integer.parseInt (input_berat.getText().toString());

        Float BMI = rumusBMI(nilai_tinggi,nilai_berat);

        String kategori = kategoriBMI(BMI);
        String isi_hasil = BMI+ " / " +kategori;
        TampilkanHasil(isi_hasil);
    }

    //method untuk Rumus menghitung BMI
    public Float rumusBMI(float t, float b){
        return b/((t/100)*(t/100));
    }

    //method untuk menampilkan hasil
    public void TampilkanHasil(String isi_hasil){
        TextView hasil = (TextView) findViewById(R.id.txt_mainactivity_hasilBMI);
        hasil.setText(isi_hasil);
    }

    public String kategoriBMI(Float BMI){
        if (BMI< 18){
            return "Kurus";
        } else if (BMI >=18 && BMI < 25){
            return "Normal";
        } else if (BMI <= 25 && BMI <27){
            return "Kegemukan";
        } else {
            return "Obesitas";
        }
    }


}
