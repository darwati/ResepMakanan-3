package com.bintang.ferry.resepmakanan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ferry on 11/10/2017.
 */

public class DetailResep extends AppCompatActivity {
    ImageView GambarDetail;
    TextView DeskripsiDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_resep);
        GambarDetail = (ImageView)findViewById(R.id.gambarDetail);
        DeskripsiDetail = (TextView)findViewById(R.id.deskripsiDetail);

        Intent judulresep = getIntent();

        String JudulDetail = judulresep.getStringExtra("judul");
        getSupportActionBar().setTitle(JudulDetail);
        String DeskripsiDetail1 = judulresep.getStringExtra("deskripsi");
        DeskripsiDetail.setText(DeskripsiDetail1);
        int GambarDetail1 = judulresep.getIntExtra("gambar",0);
        GambarDetail.setImageResource(GambarDetail1);
    }
}
