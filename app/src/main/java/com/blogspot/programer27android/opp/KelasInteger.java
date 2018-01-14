package com.blogspot.programer27android.opp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KelasInteger extends AppCompatActivity {
//buat variable umum yang dapat diakses kelas turunannya
    String no1,no2;
    EditText tx,tx2;
    TextView tv;
    Double d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas_integer);
//      defauld data
        Double a=2.5;
        Double b=2.5;
        int c=5;
//      inisialisasi variable dan
//      implementtasi hitungan dengan defauld data
        d =a+b*c;
//      menghubungkan id
        tx=(EditText) findViewById(R.id.angka);
        tx2= (EditText) findViewById(R.id.angka2);
        tv= (TextView) findViewById(R.id.hasil);
        Button bt = (Button) findViewById(R.id.hitung);
//      metode onclick pada button
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              didalam onclick terdapat implementasi
//              object dari kelas string
                no1=tx.getText().toString();
                no2=tx2.getText().toString();
                Double d1=Double.parseDouble(no1);
                int d2= Integer.parseInt(no2);
//              mulai menghitung
                Double a=d1*d2+d;
//              tampilkan pada view hasil
                tv.setText("Hasil"+ a);
            }
        });
    }
}
//ada tiga lagi
//long
//byte
//short
