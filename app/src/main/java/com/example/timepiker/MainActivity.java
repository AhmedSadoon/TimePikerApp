package com.example.timepiker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showdate(View view) {
        DialogHandler dialogHandler=new DialogHandler();
        dialogHandler.show(getSupportFragmentManager(),"time_Picker");
    }
}
