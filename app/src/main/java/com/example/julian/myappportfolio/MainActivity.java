package com.example.julian.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public String toastMessage(String appName){
        String toastText = getString(R.string.toast_message_start) + " " + appName + " " + getString(R.string.toast_message_end);
        return toastText ;
    }

    public void displayToast(String appName){
        Toast toast = Toast.makeText(this, toastMessage(appName),Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToast(View view){
        switch (view.getId()){
            case R.id.media_streamer:
                displayToast(getString(R.string.media_streamer));
                break;

            case R.id.super_duo1:
                displayToast(getString(R.string.super_duo1));
                break;

            case R.id.super_duo2:
                displayToast(getString(R.string.super_duo2));
                break;

            case R.id.ant_terminator:
                displayToast(getString(R.string.ant_terminator));
                break;

            case R.id.materialize:
                displayToast(getString(R.string.materialize));
                break;

            case R.id.capstone:
                displayToast(getString(R.string.capstone));
                break;
        }
    }
}
