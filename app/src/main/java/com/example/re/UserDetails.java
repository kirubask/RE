package com.example.re;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.re.Modall.Products;

import java.util.ArrayList;
import java.util.List;


public class UserDetails extends AppCompatActivity {
ImageView img;
EditText usr,edtxt;
Button ad;
ArrayList<Products> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);
        getSupportActionBar().hide();
        img = findViewById(R.id.image_vieww);
        usr = findViewById(R.id.name_btn);
        edtxt = findViewById(R.id.discreption_btn);
        ad = findViewById(R.id.add_btnn);





        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = usr.getText().toString();
                String des = edtxt.getText().toString();

                if (name.length()  <= 0 || des.length() <=0){
                    Toast.makeText(UserDetails.this, "Please Enter value  ", Toast.LENGTH_SHORT).show();
                }
                else{

                    list.add(new Products(name,des,0));


                    SessionData.getInstance().setList(list);
                    Toast.makeText(UserDetails.this, "Added Sucessfully", Toast.LENGTH_SHORT).show();
//                    startActivity(getIntent());
//                    finish();




                }
            }
        });
}
}