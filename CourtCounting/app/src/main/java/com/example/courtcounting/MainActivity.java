package com.example.courtcounting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA;
    private int scoreTeamB;

    private TextView textScoreTeamA;
    private TextView textScoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreTeamA = scoreTeamB = 0;
        textScoreTeamA = (TextView) this.findViewById(R.id.scoreTeamA);
        textScoreTeamB = (TextView) this.findViewById(R.id.scoreTeamB);
    }

    public void add3PointTeamA(View view)    {
        scoreTeamA += 3;
        updateScoreTeamA();
    }

    public void add2PointTeamA(View view)    {
        scoreTeamA += 2;
        updateScoreTeamA();
    }

    public void add1PointTeamA(View view)    {
        scoreTeamA += 1;
        updateScoreTeamA();
    }

    public void add3PointTeamB(View view)    {
        scoreTeamB += 3;
        updateScoreTeamB();
    }

    public void add2PointTeamB(View view)    {
        scoreTeamB += 2;
        updateScoreTeamB();
    }

    public void add1PointTeamB(View view)    {
        scoreTeamB += 1;
        updateScoreTeamB();
    }

    public void resetScore(View view)    {
        scoreTeamA = scoreTeamB = 0;
        updateScoreTeamA();
        updateScoreTeamB();
    }

    public void updateScoreTeamA()  {
        textScoreTeamA.setText(new String(Integer.toString(scoreTeamA)));
    }

    public void updateScoreTeamB()  {
        textScoreTeamB.setText(new String(Integer.toString(scoreTeamB)));
    }
}
