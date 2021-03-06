package com.example.complexcalculator2;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	float answer;
	Button add,sub,div,mult,equal,one,two,three,four,five,six,seven,eight,nine,zero,clear,DEL,dot;
	TextView display;
	String sayi1,sayi2;
	float num1,num2;
	String operator;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.minus);
        div = (Button) findViewById(R.id.div);
        mult = (Button) findViewById(R.id.mult);
        equal = (Button) findViewById(R.id.equ);
        clear = (Button) findViewById(R.id.C);
        one = (Button) findViewById(R.id.one);
        two= (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        DEL = (Button) findViewById(R.id.DEL);
        display = (TextView) findViewById(R.id.display);
        dot = (Button) findViewById(R.id.dot);
      
        display.setText("");
     	View.OnClickListener listener= new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch (v.getId()) {
				case R.id.one:
					display.append(""+"1");
					break;
				case R.id.two:
					display.append(""+"2");
					break;
				case R.id.three:
					display.append(""+"3");
					break;
				case R.id.four:
					display.append(""+"4");
					break;
				case R.id.five:
					display.append(""+"5");
					break;
				case R.id.six:
					display.append(""+"6");
					break;
				case R.id.seven:
					display.append(""+"7");
					break;
				case R.id.eight:
					display.append(""+"8");
					break;
				case R.id.nine:
					display.append(""+"9");
					break;
				case R.id.zero:
					display.append(""+"0");
					break;
				case R.id.dot:
					Toast.makeText(getBaseContext(), "Virg�ll� say�larda patl�yordu kald�rd�m hocam ", Toast.LENGTH_LONG).show();
					display.setText("");
					break;
				case R.id.C:
					display.setText("");
					num1=0;
					num2=0;
					sayi1="";
					sayi2="";
					operator="";
					break;
				case R.id.DEL:
					String ugurHoca=display.getText().toString();
					ugurHoca = ugurHoca.substring(0, ugurHoca.length() - 1);
					display.setText(ugurHoca);
					break;
				case R.id.add:
					sayi1=display.getText().toString();
					num1=Integer.parseInt(sayi1);
					operator="+";
					display.setText("");
					break;
				case R.id.minus:
					sayi1=display.getText().toString();
					num1=Integer.parseInt(sayi1);
					display.setText("");
					operator="-";
					break;
				case R.id.div:
					sayi1=display.getText().toString();
					num1=Integer.parseInt(sayi1);
					operator="/";
					display.setText("");
					break;
				case R.id.mult:
					sayi1=display.getText().toString();
					num1=Integer.parseInt(sayi1);
					operator="*";
					display.setText("");
					break;
				case R.id.equ:
					sayi2=display.getText().toString();
					if(sayi2=="+" || sayi2=="*" || sayi2=="/" || sayi2=="-")
						Toast.makeText(getBaseContext(), " HATAA!! ", Toast.LENGTH_LONG).show();
					num2=Integer.parseInt(sayi2);
					if(operator=="+"){
						answer=num1+num2;
						
						display.setText(String.valueOf(answer));
					}
					else if(operator=="-"){
						answer=num1-num2;
						
						display.setText(String.valueOf(answer));
					}
					else if(operator=="*"){
						answer=num1*num2;
						
						display.setText(String.valueOf(answer));
					}
					else if(operator=="/"){
						answer=num1/num2;
						
						display.setText(String.valueOf(answer));
					}
					break;
				default:
					break;
				}
			}
		};
		one.setOnClickListener(listener);
		two.setOnClickListener(listener);
		three.setOnClickListener(listener);
		four.setOnClickListener(listener);
		five.setOnClickListener(listener);
		six.setOnClickListener(listener);
		seven.setOnClickListener(listener);
		eight.setOnClickListener(listener);
		nine.setOnClickListener(listener);
		zero.setOnClickListener(listener);
		DEL.setOnClickListener(listener);
		clear.setOnClickListener(listener);
		add.setOnClickListener(listener);
		div.setOnClickListener(listener);
		mult.setOnClickListener(listener);
		sub.setOnClickListener(listener);
		dot.setOnClickListener(listener);
		equal.setOnClickListener(listener);
        
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
