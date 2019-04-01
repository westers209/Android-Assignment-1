package com.example.greenflag;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    TextView textView;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv_item_task);
    }
}
