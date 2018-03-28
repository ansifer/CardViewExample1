package com.doenough.cardviewexample1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomHolder> {

    private Context context;
    private ArrayList<Custom> arrayList;

    public CustomAdapter(Context context, ArrayList<Custom> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new CustomHolder(context, view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder holder, int position) {
        Custom custom = arrayList.get(position);
        holder.bindCustom(custom);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
