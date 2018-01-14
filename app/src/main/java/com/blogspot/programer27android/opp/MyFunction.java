package com.blogspot.programer27android.opp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by gery on 8/16/2017.
 */

public class MyFunction extends AppCompatActivity {
    public Context context;
    public Context customcontext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=MyFunction.this;
        customcontext=MyFunction.this;}
//    untuk akses kelas
    public void aksesclasss(Class kelastujaun){
        startActivity(new Intent(context,kelastujaun));}
//    untuk Toast
    public void pesan(String isipesan){
        Toast.makeText(context, "Pindah kelas", Toast.LENGTH_SHORT).show();
    }
//    toas kostum
    public void costumtoast(Home tampilanmenu) {
//        layanan untuk popup
        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.toast_custom, null);
        //layoutnya akan merah karena belum ada layout
        //maka kita buatkan layout yang baru dengan cara ALT+Enter
        TextView isipesan = (TextView) v.findViewById(R.id.txtpesan);
        isipesan.setText("pindah kelas");
        Toast t = new Toast(this);
        t.setView(v);
        t.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
        t.setDuration(Toast.LENGTH_SHORT);
        t.show();
    }
}
