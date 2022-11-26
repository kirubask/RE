package com.example.re;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.re.MainActivity;
import com.example.re.Modall.Products;
import com.example.re.R;

import java.util.ArrayList;


public class UserAdapeter extends RecyclerView.Adapter<UserAdapeter.holder> {


    private ArrayList<Products> list = new ArrayList<>();

    public UserAdapeter() {

    }
    public UserAdapeter(MainActivity mainActivity, ArrayList<Products> list) {
        this.list = list;
    }
    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.user_item,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        Products products =list.get(position);
        holder.usr.setText(products.getName());
        holder.ds.setText(products.getDescription());
        holder.img.setImageResource(products.getImageView());
        holder.ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class holder extends RecyclerView.ViewHolder {

        ImageView img;
        EditText usr;
        EditText ds;
        Button ad;

        public holder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image_view);
            usr= itemView.findViewById(R.id.user_name);
            ds = itemView.findViewById(R.id.desription_view);
            ad = itemView.findViewById(R.id.add_btn);

        }
    }
}
