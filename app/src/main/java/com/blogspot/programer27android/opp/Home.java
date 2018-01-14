package com.blogspot.programer27android.opp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * Created by gery on 8/16/2017.
 */
public class Home extends MyFunction {
    Button bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        costumtoast(this);
        bt1= (Button) findViewById(R.id.btn1);
        bt2= (Button) findViewById(R.id.btn2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aksesclasss(KelasString.class);
                pesan("Pindah kelas");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,KelasInteger.class));
                finish();
            }
        });
    }
}
