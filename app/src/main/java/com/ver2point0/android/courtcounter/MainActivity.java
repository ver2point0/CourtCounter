package com.ver2point0.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add 3 points to Team A score
     */
    public void addThreePoints(View view) {
        displayForTeamA(3);
    }

    /**
     * Add 2 points to Team A score
     */
    public void addTwoPoints(View view) {
        displayForTeamA(2);
    }

    /**
     * Add 1 point to Team A score
     */
    public void addOnePoint(View view) {
        displayForTeamA(1);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
