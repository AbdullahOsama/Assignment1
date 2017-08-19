package com.example.gamer.assignment1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    Button zero, count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        zero= (Button)findViewById(R.id.button_zero);
        count= (Button)findViewById(R.id.button_count);
    }
    public void zeroClicked(View view){
        if (mShowCount != null){
            mCount = 0;
            mShowCount.setText(Integer.toString(mCount));
            view.setBackgroundColor(Color.GRAY);
            count.setBackgroundColor(Color.MAGENTA);
        }
    }
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
            zero.setBackgroundColor(Color.GREEN);
        }
        if (mCount% 2 == 0 )
            view.setBackgroundColor(Color.MAGENTA);
        else
            view.setBackgroundColor(Color.CYAN);

    }


    public void showToast(View view) {
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(this,"This is a Toast Message", duration);
        toast.show();
    }
}