package com.example.kieran.tictactoe;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainScreen extends Activity {

    TextView[] board;
    int playerTurn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        board = new TextView[] {(TextView) findViewById(R.id.zero), (TextView) findViewById(R.id.one),
                (TextView) findViewById(R.id.two), (TextView) findViewById(R.id.three),
                (TextView) findViewById(R.id.four), (TextView) findViewById(R.id.five),
                (TextView) findViewById(R.id.six), (TextView) findViewById(R.id.seven),
                (TextView) findViewById(R.id.eight)};
        playerTurn = 1;
    }

    public void pickSquare(View view){
        TextView currentSquare = (TextView) findViewById(view.getId());
        if(playerTurn == 1){
            currentSquare.setText("X");
            currentSquare.setTextColor(Color.RED);
            playerTurn = 2;
        }
        else{
            currentSquare.setText("O");
            currentSquare.setTextColor(Color.DKGRAY);
            playerTurn = 1;
        }

    }

    public void newGame(View view){
        for(int i = 0; i < board.length; i++){
            board[i].setText(" ");
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
