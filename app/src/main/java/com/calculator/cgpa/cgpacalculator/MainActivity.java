package com.calculator.cgpa.cgpacalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button sumbitBtn;
    private TextView cgpatxtView;
    private EditText grade1edTxt, credit1edTxt, grade2edTxt, credit2edTxt, grade3edTxt, credit3edTxt, grade4edTxt, credit4edTxt, grade5edTxt, credit5edTxt, grade6edTxt, credit6edTxt, grade7edTxt, credit7edTxt, grade8edTxt, credit8edTxt, grade9edTxt, credit9edTxt, grade10edTxt, credit10edTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();

    }

    private void init() {

        sumbitBtn = (Button) findViewById(R.id.submitBtn);
        cgpatxtView = (TextView) findViewById(R.id.cgpatxtView);
        grade1edTxt = (EditText) findViewById(R.id.grade1edTxt);
        grade2edTxt = (EditText) findViewById(R.id.grade2edTxt);
        credit1edTxt = (EditText) findViewById(R.id.credit1edTxt);
        credit2edTxt = (EditText) findViewById(R.id.credit2edTxt);
        grade3edTxt = (EditText) findViewById(R.id.grade3edTxt);
        grade4edTxt = (EditText) findViewById(R.id.grade4edTxt);
        credit3edTxt = (EditText) findViewById(R.id.credit3edTxt);
        credit4edTxt = (EditText) findViewById(R.id.credit4edTxt);
        grade5edTxt = (EditText) findViewById(R.id.grade5edTxt);
        grade6edTxt = (EditText) findViewById(R.id.grade6edTxt);
        credit5edTxt = (EditText) findViewById(R.id.credit5edTxt);
        credit6edTxt = (EditText) findViewById(R.id.credit6edTxt);
        grade7edTxt = (EditText) findViewById(R.id.grade7edTxt);
        grade8edTxt = (EditText) findViewById(R.id.grade8edTxt);
        credit7edTxt = (EditText) findViewById(R.id.credit7edTxt);
        credit8edTxt = (EditText) findViewById(R.id.credit8edTxt);
        grade9edTxt = (EditText) findViewById(R.id.grade9edTxt);
        credit9edTxt = (EditText) findViewById(R.id.credit9edTxt);
        grade10edTxt = (EditText) findViewById(R.id.grade10edTxt);
        credit10edTxt = (EditText) findViewById(R.id.credit10edTxt);


        sumbitBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View vw) {
                String grade1 = grade1edTxt.getText().toString();
                String grade2 = grade2edTxt.getText().toString();
                String credit1 = credit1edTxt.getText().toString();
                String credit2 = credit2edTxt.getText().toString();
                String grade3 = grade3edTxt.getText().toString();
                String grade4 = grade4edTxt.getText().toString();
                String credit3 = credit3edTxt.getText().toString();
                String credit4 = credit4edTxt.getText().toString();
                String grade5 = grade5edTxt.getText().toString();
                String grade6 = grade6edTxt.getText().toString();
                String credit5 = credit5edTxt.getText().toString();
                String credit6 = credit6edTxt.getText().toString();
                String grade7 = grade7edTxt.getText().toString();
                String grade8 = grade8edTxt.getText().toString();
                String credit7 = credit7edTxt.getText().toString();
                String credit8 = credit8edTxt.getText().toString();
                String grade9 = grade9edTxt.getText().toString();
                String grade10 = grade10edTxt.getText().toString();
                String credit9 = credit9edTxt.getText().toString();
                String credit10 = credit10edTxt.getText().toString();

                float totalgrade1 = Float.parseFloat(grade1) * Float.parseFloat(credit1);
                float totalgrade2 = Float.parseFloat(grade2) * Float.parseFloat(credit2);
                float totalgrade3 = Float.parseFloat(grade3) * Float.parseFloat(credit3);
                float totalgrade4 = Float.parseFloat(grade4) * Float.parseFloat(credit4);
                float totalgrade5 = Float.parseFloat(grade5) * Float.parseFloat(credit5);
                float totalgrade6 = Float.parseFloat(grade6) * Float.parseFloat(credit6);
                float totalgrade7 = Float.parseFloat(grade7) * Float.parseFloat(credit7);
                float totalgrade8 = Float.parseFloat(grade8) * Float.parseFloat(credit8);
                float totalgrade9 = Float.parseFloat(grade9) * Float.parseFloat(credit9);
                float totalgrade10 = Float.parseFloat(grade10) * Float.parseFloat(credit10);

                float totalgrades = totalgrade1 + totalgrade2 + totalgrade3 + totalgrade4 + totalgrade5 + totalgrade6 + totalgrade7 + totalgrade8 + totalgrade9 + totalgrade10;
                float totalcredit = Integer.parseInt(credit1) + Integer.parseInt(credit2) + Integer.parseInt(credit3) + Integer.parseInt(credit4) + Integer.parseInt(credit5) + Integer.parseInt(credit6) + Integer.parseInt(credit7) + Integer.parseInt(credit8) + Integer.parseInt(credit9) + Integer.parseInt(credit10);
                float cpga = totalgrades / totalcredit;
                cgpatxtView.setText(String.valueOf(cpga));

            }
        });

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


    @Override
    public void onClick(View v) {


    }
}
