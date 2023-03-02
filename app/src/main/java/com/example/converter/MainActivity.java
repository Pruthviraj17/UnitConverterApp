package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText.getText().toString();
                int kg=Integer.parseInt(s);
                if(kg>=500000000)
                {
                    Toast.makeText(MainActivity.this, "Number reached to maximum value, Please re-enter valid number.", Toast.LENGTH_SHORT).show();
                }
                else {
                    double pnd = 2.205 * kg;
                    textView.setText("This corresponding KG in pound is " + pnd);
                }
            }
        });
    }
}