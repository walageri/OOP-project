//contoh kelas
package com.blogspot.programer27android.opp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/*ini adalah kelas
kelas baru*/
public class KelasString extends AppCompatActivity {

    //sebelumnya kita deklarasi inner kelas dengan object burung dan beserta atribut didalamnya
    public class Burung {
        String nama; //atribut nama
        String warna; //atribut warna
        String sayap; //atribut sayap
        //nama ditentukan saat inisialisasi dengan contruktor
        public Burung(String nama) {
            this.nama = nama;
        }
        //method terbang
        public String terbang(){
            sayap = "mengepak";
        return "Burung : "+nama+" Sedang Terbang sayapnya : "+this.sayap;
        }
        //method tidur
        public String diam(){
            sayap = "diam";
            return "Burung : "+nama+" Sedang Tidur sayapnya : "+this.sayap;
        }
    }
//defauld isi kelas burung
    Burung burungnuri = new Burung("nuri");
    Burung burungmerpati = new Burung("merpati");
    TextView burung,keadaan;
    //String terbang,diam;
//ini adalah methode ocCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //memanggil attribut nama pada object burungnuri dan memberi nilai
        burungnuri.warna = "Merah";
        //memangil method terbang object burungnuri
        burungnuri.terbang();
        burungnuri.diam();
        burungmerpati.warna = "Putih";
        //memangil method terbang object burungmerpati
        burungmerpati.terbang();
        burungmerpati.diam();

        //inisialisasi button.
        ImageButton btnuri=(ImageButton)findViewById(R.id.nuridiam);
        ImageButton btnuriterbang=(ImageButton)findViewById(R.id.nuriterbang);
        ImageButton btmerpatidiam=(ImageButton)findViewById(R.id.merpatidiam);
        ImageButton btmerpatiterbang=(ImageButton)findViewById(R.id.merpatiterbang);
        burung=(TextView)findViewById(R.id.burung);
        keadaan=(TextView)findViewById(R.id.keadaan);
        //methode onclik bt
        btnuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                burung.setText("burung : "+burungnuri.nama+" warnanya : "+burungnuri.warna);
                keadaan.setText(burungnuri.diam());
            }
        });
        btnuriterbang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                burung.setText("burung : "+burungnuri.nama+" warnanya : "+burungnuri.warna);
                keadaan.setText(burungnuri.terbang());
            }
        });
        btmerpatidiam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                burung.setText("burung : "+burungmerpati.nama+" warnanya : "+burungmerpati.warna);
                keadaan.setText(burungmerpati.diam());
            }
        });
        btmerpatiterbang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                burung.setText("burung : "+burungmerpati.nama+" warnanya : "+burungmerpati.warna);
                keadaan.setText(burungmerpati.terbang());
            }
        });
    }
}
