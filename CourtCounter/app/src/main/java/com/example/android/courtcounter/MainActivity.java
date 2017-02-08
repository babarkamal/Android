package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int t=0;
    int r=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void dispScoreOfTeamA(int score){
    TextView tv=  (TextView) findViewById(R.id.score_teamA);
   tv.setText(String.valueOf(score));

    }
public void Threepoint(View v){

    t=t+3;
    dispScoreOfTeamA(t);
}

    public void Twopoint(View v){

        t=t+2;
        dispScoreOfTeamA(t);
    }
    public void Freethrow(View v){

        t=t+1;
        dispScoreOfTeamA(t);
    }

    public void dispScoreOfTeamB(int score1){
        TextView tv=  (TextView) findViewById(R.id.score_teamB);
        tv.setText(String.valueOf(score1));

    }
    public void Threepoint1(View v){

        r=r+3;
        dispScoreOfTeamB(r);
    }

    public void Twopoint1(View v){

        r=r+2;
        dispScoreOfTeamB(r);
    }
    public void Freethrow1(View v){

        r=r+1;
        dispScoreOfTeamB(r);
    }

    public void reset(View v){
t=0;
r=0;
dispScoreOfTeamA(t);
dispScoreOfTeamB(r);
Toast.makeText(MainActivity.this,"CLICKED",Toast.LENGTH_SHORT).show();
}
}
