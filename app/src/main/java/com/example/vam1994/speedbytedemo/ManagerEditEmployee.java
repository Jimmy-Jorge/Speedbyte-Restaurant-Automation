package com.example.vam1994.speedbytedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ManagerEditEmployee extends AppCompatActivity {

    static Button add;
    static Button delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_edit_employee);

        add = (Button)findViewById(R.id.addButton);
        delete = (Button)findViewById(R.id.deleteButton);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ManagerEditEmployee.this, "Item Added", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ManagerEditEmployee.this, ManagerOptions.class);
                startActivity(intent);
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ManagerEditEmployee.this, "Item Deleted", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ManagerEditEmployee.this, ManagerOptions.class);
                startActivity(intent);
            }
        });

    }
}
