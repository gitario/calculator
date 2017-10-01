package com.bisagrasoxidadasyloshijosdelbergantin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//Prueba

public class MainActivity extends AppCompatActivity {

    TextView tv_screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_screen = (TextView) findViewById(R.id.tv_screen);
        setListeners();
    }

    protected void setListeners() {
        Button btn_0 = (Button) findViewById(R.id.btn_0);
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_screen.append("0");
            }
        });
    }
}
