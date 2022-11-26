package com.example.re;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.re.Modall.Products;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
RecyclerView re;
    ImageView plusbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        plusbtn = findViewById(R.id.plus_btn);
        re = findViewById(R.id.recycler_view);



        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,UserDetails.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onResume() {


        super.onResume();

        re.setLayoutManager(new LinearLayoutManager(this));
        re.setHasFixedSize(true);


        ArrayList<Products> list = SessionData.getInstance().getList();
        UserAdapeter userAdapeter = new UserAdapeter(this,list);
        re.setAdapter(userAdapeter);

    }
}