package com.example.vam1994.speedbytedemo;
//new version

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//import com.example.vam1994.speedbytedemo.R;

public class MainScreen extends AppCompatActivity {

    static Button customer;
    static Button chef;
    static Button waiter;
    static Button manager;
    static Button busboy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        customer = (Button)findViewById(R.id.customerButton);
        chef = (Button)findViewById(R.id.chefButton);
        waiter = (Button)findViewById(R.id.waiterButton);
        manager = (Button)findViewById(R.id.managerButton);
        busboy = (Button)findViewById(R.id.busboyButton);

        clickCustomer();
        clickChef();
        clickWaiter();
        clickManager();
        clickBusboy();

    }

    private void clickBusboy() {
        busboy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Busboy.class);
                startActivity(intent);
            }
        });
    }

    public void clickCustomer(){
        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, ThreeDiningOptions.class);
                startActivity(intent);
            }
        });
    }


    public void clickChef(){
        chef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Chef.class);
                startActivity(intent);
            }
        });
    }

    public void clickWaiter(){
        waiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Waiter.class);
                startActivity(intent);
            }
        });
    }

    public void clickManager(){
        manager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, ManagerOptions.class);
                startActivity(intent);
            }
        });
    }

}
