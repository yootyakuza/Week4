package com.example.apple.week4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.editText1);
        et2 = (EditText)findViewById(R.id.editText2);
        bt1 = (Button)findViewById(R.id.but1);
        bt2 = (Button)findViewById(R.id.but2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a = Double.parseDouble(et1.getText().toString());
                Double b = Double.parseDouble(et2.getText().toString());
                Double result = a + b;

                Intent intent = new Intent(getApplicationContext(),Activity2.class);
                intent.putExtra("result",result);
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geoCode = "google.streetview:cbll=13.7523959,100.4925838&cbp=1,150,,170,-5";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoCode));
                startActivity(intent);
            }
        });
    }
}
