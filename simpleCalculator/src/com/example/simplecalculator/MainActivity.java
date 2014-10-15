package com.example.simplecalculator;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	
	int answer;
	Button add,sub,div,mult,equal,one,two,three,four,five,six,seven,eight,nine,zero,clear;
	TextView display;
	String sayi1,sayi2;
	int num1,num2;
	String operator;
	AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    add = (Button) findViewById(R.id.add);
    sub = (Button) findViewById(R.id.sub);
    div = (Button) findViewById(R.id.div);
    mult = (Button) findViewById(R.id.mult);
    equal = (Button) findViewById(R.id.equal);
    clear = (Button) findViewById(R.id.clear);
    one = (Button) findViewById(R.id.num1);
    two= (Button) findViewById(R.id.num2);
    three = (Button) findViewById(R.id.num3);
    four = (Button) findViewById(R.id.num4);
    five = (Button) findViewById(R.id.num5);
    six = (Button) findViewById(R.id.num6);
    seven = (Button) findViewById(R.id.num7);
    eight = (Button) findViewById(R.id.num8);
    nine = (Button) findViewById(R.id.num9);
    zero = (Button) findViewById(R.id.num10);
    display = (TextView) findViewById(R.id.calculatorDisplay);
    
one.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if(display.getText().toString()== ""){
				
				display.setText("1");
			}
			else{
				display.append(""+"1");
			}
		}
	});
    
    
two.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if(display.getText().toString()== ""){
				
				display.setText("2");
			}
			else{
				display.append(""+"2");
			}
		}
	});
    

three.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(display.getText().toString()== ""){
			
			display.setText("3");
		}
		else{
			display.append(""+"3");
		}
	}
});


four.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(display.getText().toString()== ""){
			
			display.setText("4");
		}
		else{
			display.append(""+"4");
		}
	}
});


five.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(display.getText().toString()== ""){
			
			display.setText("5");
		}
		else{
			display.append(""+"5");
		}
	}
});

six.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(display.getText().toString()== ""){
			
			display.setText("6");
		}
		else{
			display.append(""+"6");
		}
	}
});


seven.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(display.getText().toString()== ""){
			
			display.setText("7");
		}
		else{
			display.append(""+"7");
		}
	}
});


eight.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(display.getText().toString()== ""){
			
			display.setText("8");
		}
		else{
			display.append(""+"8");
		}
	}
});

nine.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(display.getText().toString()== ""){
			
			display.setText("9");
		}
		else{
			display.append(""+"9");
		}
	}
});


zero.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(display.getText().toString()== ""){
			
			display.setText("0");
		}
		else{
			display.append(""+"0");
		}
	}
});

clear.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		display.setText("");
		sayi1="";
		sayi2="";
		num1=0;
		num2=0;
	}
});


add.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(display.getText().toString()==""){
		
             dlgAlert.setMessage("You haven't any number for adding dude!");
             dlgAlert.setTitle("Error Message...");
             dlgAlert.setPositiveButton("OK", null);
             dlgAlert.setCancelable(true);
             dlgAlert.create().show();

             dlgAlert.setPositiveButton("Ok",
                 new DialogInterface.OnClickListener() {
                     public void onClick(DialogInterface dialog, int which) {
                    	 display.setText("");
                 }
             });
		}
		else{
			sayi1=display.getText().toString();
			num1=Integer.parseInt(sayi1);
			display.append(""+"+");
			operator="+";
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			display.setText("");
		}		
	}
});



sub.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(display.getText().toString()==""){
		
             dlgAlert.setMessage("You haven't any number for subtract dude!");
             dlgAlert.setTitle("Error Message...");
             dlgAlert.setPositiveButton("OK", null);
             dlgAlert.setCancelable(true);
             dlgAlert.create().show();

             dlgAlert.setPositiveButton("Ok",
                 new DialogInterface.OnClickListener() {
                     public void onClick(DialogInterface dialog, int which) {
                    	 display.setText("");
                 }
             });
		}
		else{
			sayi1=display.getText().toString();
			num1=Integer.parseInt(sayi1);
			display.append(""+"-");
			operator="-";
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			display.setText("");
		}		
	}
});

mult.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(display.getText().toString()==""){
		
             dlgAlert.setMessage("You haven't any number for multiply dude!");
             dlgAlert.setTitle("Error Message...");
             dlgAlert.setPositiveButton("OK", null);
             dlgAlert.setCancelable(true);
             dlgAlert.create().show();

             dlgAlert.setPositiveButton("Ok",
                 new DialogInterface.OnClickListener() {
                     public void onClick(DialogInterface dialog, int which) {
                    	 display.setText("");
                 }
             });
		}
		else{
			sayi1=display.getText().toString();
			num1=Integer.parseInt(sayi1);
			display.append(""+"*");
			operator="*";
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			display.setText("");
		}		
	}
});


div.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(display.getText().toString()==""){
		
             dlgAlert.setMessage("You haven't any number for division dude!");
             dlgAlert.setTitle("Error Message...");
             dlgAlert.setPositiveButton("OK", null);
             dlgAlert.setCancelable(true);
             dlgAlert.create().show();

             dlgAlert.setPositiveButton("Ok",
                 new DialogInterface.OnClickListener() {
                     public void onClick(DialogInterface dialog, int which) {
                    	 display.setText("");
                 }
             });
		}
		else{
			sayi1=display.getText().toString();
			num1=Integer.parseInt(sayi1);
			display.append(""+"/");
			operator="/";
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			display.setText("");
		}		
	}
});

equal.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		sayi2=display.getText().toString();
		num2=Integer.parseInt(sayi2);
		
		if(operator=="+")display.setText(num1+num2);
		
		if(operator=="-") display.setText(num1-num2);
		
		if(operator=="*") display.setText(num1*num2);
		
		if(operator=="/") display.setText(num1/num2);
	}
});

    
    //OnCreate Method end here dude !
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
