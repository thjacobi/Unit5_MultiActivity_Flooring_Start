package edu.css.cis3334.unit5_multiactivity_flooring_start;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
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

    public void calculateArea(View v) {

        //Find the input values
        final EditText inputWidth = (EditText) findViewById(R.id.etWidth);
        final EditText inputLength = (EditText) findViewById(R.id.etLength);
       // Button btnNextScreen = (Button) findViewById(R.id.btnShowResults);
        final String widthString = inputWidth.getText().toString();
        final String lengthString = inputLength.getText().toString();

        //Cast the input to float when input is not empty
        float width = Float.valueOf(widthString);
        float length = Float.valueOf(lengthString);

        //Calculate flooring area
        float floorArea = width * length;

        //Create output string
        String flooringNeed = ("Width is " + width + " and Length is " + length + "\n\nThe total flooring needed is " + floorArea);

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("area", flooringNeed);
        startActivity(intent);
    }


}
