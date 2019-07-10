package com.example.recyclerviewdemoclass;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    private List<Model> listData;
    private Context context;
    private int layout;

    public Adapter(List<Model> listData, Context context, int layout) {
        this.listData = listData;
        this.context = context;
        this.layout = layout;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.item_view, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.titleText.setText(listData.get(position).title);
        holder.descriptionText.setText(listData.get(position).description);
        Picasso.get().load(listData.get(position).image).into(holder.iconImage);

        holder.cardId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, ViewDetails.class)
                        .putExtra("id", listData.get(position)));
            }
        });

        holder.cardId.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}
