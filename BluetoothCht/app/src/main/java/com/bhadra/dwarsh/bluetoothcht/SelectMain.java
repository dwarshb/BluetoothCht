package com.bhadra.dwarsh.bluetoothcht;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectMain extends AppCompatActivity {

    protected Button mblt,mbeac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_main);
        findViewById(R.id.bluetooth).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent blu = new Intent(SelectMain.this,MainActivity.class);
                startActivity(blu);
            }
        });
        findViewById(R.id.beacon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beac = new Intent(SelectMain.this,BeaconMonitoring.class);
                startActivity(beac);
            }
        });
    }
}
