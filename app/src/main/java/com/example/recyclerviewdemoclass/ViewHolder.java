package com.example.recyclerviewdemoclass;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    public CardView cardId;
    public ImageView iconImage;
    public TextView titleText, descriptionText;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        iconImage = (ImageView) itemView.findViewById(R.id.iconImage);
        cardId = (CardView) itemView.findViewById(R.id.cardId);
        titleText = (TextView) itemView.findViewById(R.id.titleText);
        descriptionText = (TextView) itemView.findViewById(R.id.descriptionText);
    }
}
