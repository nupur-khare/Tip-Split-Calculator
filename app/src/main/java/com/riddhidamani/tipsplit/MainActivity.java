package com.riddhidamani.tipsplit;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputValue;
    private TextView screenValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputValue = findViewById(R.id.editTextNumberDecimal);
        screenValue = findViewById(R.id.totAmtPerPersonTxt);
    }

    public void getValue(View v) {
        String value = inputValue.getText().toString();
        screenValue.setText(value);
    }

}