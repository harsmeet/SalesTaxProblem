package com.app.bonoassignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityDescription extends AppCompatActivity {

    ImageView imageView;
    TextView textView,taxTotal;

    TextView text_action_bottom2;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        taxTotal = findViewById(R.id.tax);
        text_action_bottom2 = findViewById(R.id.text_action_bottom2);

        Bundle extras = getIntent().getExtras();
        String totalPrice = extras.getString("totalPrice");
        String name = extras.getString("tax");

        String category = extras.getString("category");
        String price = extras.getString("price");
        String tax = extras.getString("tax");
        String imported = extras.getString("imported");



        textView.setText("Total Amount:  "+ totalPrice);
        taxTotal.setText("Sales Taxes: "+ name);


        text_action_bottom2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(getBaseContext(),"Receipt Sucessfully Print",Toast.LENGTH_SHORT).show();


            }
        });

    }

}
