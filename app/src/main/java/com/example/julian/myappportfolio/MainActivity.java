package com.example.julian.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * toastMessage creating text message
     * @param appName apliction name
     * @return toastText app name with beginning and end message.
     */
    public String toastMessage(String appName){
        String toastText = getString(R.string.toast_message_beginning) + " " + appName + " " + getString(R.string.toast_message_end);
        return toastText ;
    }

    /**
     * displayToast create Toast which correct text.
     *
     * @param appName  app Name that will be show in Toast message
     */
    public void displayToast(String appName){
        // Add to cancel Toast if previous toast is still showing and I want to show next.
        if(toast != null){
            toast.cancel();
        }
        toast = Toast.makeText(this, toastMessage(appName),Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * showToast showing choose correct Toast message on button click. 
     * Test
     */
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
