package com.example.vam1994.speedbytedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ManagerOptions extends AppCompatActivity {

    static ImageButton ib;
    static Button editItem;
    static Button editEmployee;
    static Button statistics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_options);

        ib = (ImageButton)findViewById(R.id.messageButton);
        editItem = (Button)findViewById(R.id.editItemButton);
        editEmployee = (Button)findViewById(R.id.trafficButton);
        statistics = (Button)findViewById(R.id.statisticsButton);

        clickMessage();
        clickEditItem();
        clickEditEmployee();
        clickStatistics();


    }


    public void clickMessage(){
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagerOptions.this, Message.class);
                startActivity(intent);
            }
        });
    }

    public void clickEditItem(){
        editItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagerOptions.this, ManagerEditItem.class);
                startActivity(intent);
            }
        });
    }

    public void clickEditEmployee(){
        editEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagerOptions.this, ManagerEditEmployee.class);
                startActivity(intent);
            }
        });
    }

    public void clickStatistics(){
        statistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagerOptions.this, ManagerStatistics.class);
                startActivity(intent);
            }
        });
    }

}
