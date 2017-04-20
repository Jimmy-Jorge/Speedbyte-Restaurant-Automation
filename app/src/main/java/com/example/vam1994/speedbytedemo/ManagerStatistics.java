package com.example.vam1994.speedbytedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ManagerStatistics extends AppCompatActivity {

    static Button inventory;
    static Button traffic;
    static Button profits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_statistics);

        inventory = (Button)findViewById(R.id.inventoryButton);
        traffic = (Button)findViewById(R.id.trafficButton);
        profits = (Button)findViewById(R.id.profitsButton);

        clickInventory();
        clickTraffic();
        clickProfits();

    }

    public void clickInventory(){
        inventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagerStatistics.this, ManagerInventory.class);
                startActivity(intent);
            }
        });
    }

    public void clickTraffic(){
        traffic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagerStatistics.this, ManagerTraffic.class);
                startActivity(intent);
            }
        });
    }

    public void clickProfits(){
        profits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagerStatistics.this, ManagerProfits.class);
                startActivity(intent);
            }
        });
    }

}
