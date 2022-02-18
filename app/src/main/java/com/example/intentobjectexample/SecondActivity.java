package com.example.intentobjectexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(
            getApplicationContext(),
            "We are moved to the second",
            Toast.LENGTH_LONG
        ).show();
    }
}
