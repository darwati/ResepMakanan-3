package com.bintang.ferry.resepmakanan;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ferry on 04/10/2017.
 */

public class myAdapter extends RecyclerView.Adapter<myAdapter.myHolder> {

    private Context context;

    private ArrayList<ListResep>listResep;

    public myAdapter(Context context, ArrayList<ListResep> listResep){
        this.context = context;
        this.listResep = listResep;
    }

    @Override
    public myAdapter.myHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu,parent,false);
        return new myHolder(view);
    }

    @Override
    public void onBindViewHolder(myAdapter.myHolder holder, final int position) {
        holder.gambarResep.setImageResource(listResep.get(position).getGambarResep());
        holder.judulResep.setText(listResep.get(position).getJudulResep());
        holder.deskripsiResep.setText(listResep.get(position).getDeskripsiResep());
        holder.judulResep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent judulresep = new Intent(context,DetailResep.class);
                judulresep.putExtra("judul",listResep.get(position).getJudulDetail());
                judulresep.putExtra("gambar",listResep.get(position).getGambarDetail());
                judulresep.putExtra("deskripsi",listResep.get(position).getDetailResep());
                context.startActivity(judulresep);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listResep.size();
    }

    public class myHolder extends RecyclerView.ViewHolder {
        ImageView gambarResep;
        TextView judulResep;
        TextView deskripsiResep;
        public myHolder(View itemView) {
            super(itemView);
            gambarResep = (ImageView)itemView.findViewById(R.id.gambar);
            judulResep = (TextView)itemView.findViewById(R.id.judul);
            deskripsiResep = (TextView)itemView.findViewById(R.id.rincian);
        }
    }

}
