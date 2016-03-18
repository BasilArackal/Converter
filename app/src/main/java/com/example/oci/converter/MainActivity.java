package com.example.oci.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText dollar = (EditText) findViewById(R.id.editText);
        int usd =Integer.parseInt(dollar.getText().toString());
        int rs = usd*65;
        Toast.makeText(this, "Rs: "+ rs, Toast.LENGTH_LONG).show();

    }
}
