package com.example.retrofit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import retrofit2.http.POST;

/**
 * Created by aruna on 1/1/18.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Contact> contects;

    public RecyclerAdapter(List<Contact> contects) {
        this.contects = contects;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.Name.setText(contects.get(position).getName());
        holder.Email.setText(contects.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return contects.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView Name,Email;
        public MyViewHolder(View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.name);
            Email = itemView.findViewById(R.id.email);
        }
    }
}
