package com.example.kenneth.funfacts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class FunFactsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        // Declare variables
        final TextView factLabel = (TextView) findViewById(R.id.FactsTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactsButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             String[] facts = {

                             "The river Niger is the third largest river in Africa",
                             "Nigeria has the largest no of butterfly species in the world",
                             "Nigeria has the most number of twin births in the world",
                             "7% of the worlds languages are spoken in Nigeria",
                             "Nigeria is the 8th most populus country in the world",
                             "Nigeria is the home of the first black Nobel Laureate",
                             "Third Mainland bridge with a length of 11.8km is the longest bridge in Africa",
                             "Nigeria is Africa's biggest economy"

             };
             String fact = "";
                // randomly select a fact
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(facts.length);
                fact = facts[randomNumber];
                //update label with our dynamic fact
             factLabel.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
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
