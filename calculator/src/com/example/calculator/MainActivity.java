package com.example.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	String first,second,answer;
	int sayi1,sayi2,sonuc;
	Button plus,minus,div,mult;
	EditText firstNum,secondNum;
	TextView display;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        div = (Button) findViewById(R.id.div);
        mult = (Button) findViewById(R.id.mult);
        firstNum = (EditText) findViewById(R.id.number1);
        secondNum = (EditText) findViewById(R.id.number2);
        display = (TextView) findViewById(R.id.display);
        
        plus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				first=firstNum.getText().toString();
				second=secondNum.getText().toString();
				sayi1=Integer.parseInt(first);
				sayi2=Integer.parseInt(second);
				sonuc=sayi1+sayi2;
				answer = Integer.toString(sonuc);
				display.setText("Answer is : " + answer);
			}
		});
        
        minus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				first=firstNum.getText().toString();
				second=secondNum.getText().toString();
				sayi1=Integer.parseInt(first);
				sayi2=Integer.parseInt(second);
				sonuc=sayi1-sayi2;
				answer = Integer.toString(sonuc);
				display.setText("Answer is : " + answer);
			}
		});
    
        div.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				first=firstNum.getText().toString();
				second=secondNum.getText().toString();
				sayi1=Integer.parseInt(first);
				sayi2=Integer.parseInt(second);
				sonuc=sayi1/sayi2;
				answer = Integer.toString(sonuc);
				display.setText("Answer is : " + answer);
			}
		});
        mult.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				first=firstNum.getText().toString();
				second=secondNum.getText().toString();
				sayi1=Integer.parseInt(first);
				sayi2=Integer.parseInt(second);
				sonuc=sayi1*sayi2;
				answer = Integer.toString(sonuc);
				display.setText("Answer is : " + answer);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
