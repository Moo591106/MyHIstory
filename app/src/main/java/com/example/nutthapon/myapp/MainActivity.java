package com.example.nutthapon.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ShowText(View view) {
        String msg ="ไม่สามารถดูข้อมูลได้!";
        Toast toast =Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.show();
    }
}
