package com.example.julian.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public String toastMessage(String appName){
        String toastText = "This button will launch my " + appName + " app!";
        return toastText ;
    }

    public void displayToast(String appName){
        Toast toast = Toast.makeText(getApplicationContext(),toastMessage(appName),Toast.LENGTH_SHORT);
        toast.show();
    }


    public void showToast(View view){
        switch (view.getId()){
            case R.id.media_streamer:
                displayToast("Spotify Streamer");
                break;

            case R.id.super_duo1:
                displayToast("Scores App");
                break;

            case R.id.super_duo2:
                displayToast("Library App");
                break;

            case R.id.ant_terminator:
                displayToast("Build it Bigger");
                break;

            case R.id.materialize:
                displayToast("XYZ Reader");
                break;

            case R.id.capstone:
                displayToast("Capstone");
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
