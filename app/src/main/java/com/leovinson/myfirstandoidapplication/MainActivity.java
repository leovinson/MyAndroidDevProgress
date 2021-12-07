package com.leovinson.myfirstandoidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOnClick(View view) {

        TextView txtView = findViewById(R.id.lblFirstName);
        EditText editTxt = findViewById(R.id.txtFirstName);

        TextView txtView2 = findViewById(R.id.lblLastName);
        EditText editTxt2 = findViewById(R.id.txtLastName);

        TextView txtView3 = findViewById(R.id.lblEmail);
        EditText editTxt3 = findViewById(R.id.txtEmail);

        txtView.setText(editTxt.getText().toString());
        txtView2.setText(editTxt2.getText().toString());
        txtView3.setText(editTxt3.getText().toString());
    }
}