package com.leovinson.myfirstandoidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOnClick(View view) {

        TextView txtView = findViewById(R.id.txtHello);
        EditText editTxt = findViewById(R.id.txtNameHello);
        String name;
        name = editTxt.getText().toString();

        txtView.setText("Hello" +name);
    }
}