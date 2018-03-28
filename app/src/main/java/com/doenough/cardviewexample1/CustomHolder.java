package com.doenough.cardviewexample1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class CustomHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView textView;

    public CustomHolder(Context context, View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.text1);
        itemView.setOnClickListener(this);
    }

    public void bindCustom(Custom custom) {
        textView.setText(custom.getName());
    }


    @Override
    public void onClick(View view) {

    }
}
