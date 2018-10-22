package org.andika.recyclerku;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    Context context;
    public ArrayList<ItemModel> itemModels;

    public ItemAdapter(Context context) {
        this.context = context;
    }

    public ItemAdapter(ArrayList<ItemModel> itemModels) {
        this.itemModels = itemModels;
    }

    public Context getContext() {
        return context;
    }

    public ArrayList<ItemModel> getItemModels() {
        return itemModels;
    }

    public void setItemModels(ArrayList<ItemModel> itemModels) {
        this.itemModels = itemModels;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_container, parent, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.text.setText(getItemModels().get(position).getText());
        holder.desc.setText(getItemModels().get(position).getText());

        Glide.with(context)
                .load(getItemModels().get(position).getImage())
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return getItemModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView text, desc;

        public ViewHolder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            text = itemView.findViewById(R.id.text);
            desc = itemView.findViewById(R.id.desc);
        }
    }
}
