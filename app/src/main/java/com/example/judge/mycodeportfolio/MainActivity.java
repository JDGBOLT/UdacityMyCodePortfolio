package com.example.judge.mycodeportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void displayToast(CharSequence text) {
       Toast.makeText(getApplicationContext(), "This button will launch the " + text + "!",
               Toast.LENGTH_SHORT).show();
    }
    public void onStreamerClicked(View view) {
        displayToast(getString(R.string.media_streamer));
    }
    public void onSuperDuo1Clicked(View view) {
        displayToast(getString(R.string.super_duo1));
    }
    public void onSuperDuo2Clicked(View view) {
        displayToast(getString(R.string.super_duo2));
    }
    public void onAntTerminatorClicked(View view) {
        displayToast(getString(R.string.ant_terminator));
    }
    public void onMaterializeClicked(View view) {
        displayToast(getString(R.string.materialize));
    }
    public void onCapstoneClicked(View view) {
        displayToast(getString(R.string.capstone));
    }
}
