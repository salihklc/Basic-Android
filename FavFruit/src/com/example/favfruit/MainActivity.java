package com.example.favfruit;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView display=(TextView) findViewById(R.id.display);
        final CheckBox elma = (CheckBox) findViewById(R.id.elma);
        final CheckBox armut = (CheckBox) findViewById(R.id.armut);
        final CheckBox muz = (CheckBox) findViewById(R.id.muz);
        final CheckBox kiraz = (CheckBox) findViewById(R.id.kiraz);
        final CheckBox viþne = (CheckBox) findViewById(R.id.visne);
        final CheckBox portakal = (CheckBox) findViewById(R.id.portakal);
        final CheckBox mandalina = (CheckBox) findViewById(R.id.mandalina);
        final CheckBox nar = (CheckBox) findViewById(R.id.nar);
        final CheckBox ananas = (CheckBox) findViewById(R.id.ananas);
        final CheckBox ayva = (CheckBox) findViewById(R.id.ayva);
        
        OnCheckedChangeListener mylistener = new OnCheckedChangeListener() {
			String meyve="";
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(elma.isChecked()){
					meyve+=" elma";
				}
				if(armut.isChecked()){
					meyve+=" armut";
				}
				
				if(viþne.isChecked()){
					meyve+=" viþne";
				}
				if(kiraz.isChecked()){
					meyve+=" kiraz";
				}
				if(portakal.isChecked()){
					meyve+=" portakal";
				}
				if(mandalina.isChecked()){
					meyve+=" mandalina";
				}
				if(ananas.isChecked()){
					meyve+=" ananas";
				}
				if(ayva.isChecked()){
					meyve+=" ayva";
				}
				if(nar.isChecked()){
					meyve+=" nar";
				}
				if(muz.isChecked()){
					meyve+=" muz";
				}
				if(true){
					display.setText("Ben "+meyve+" meyveleri seviyorum ");
					meyve="";
				}
				if(!elma.isChecked() && !armut.isChecked() && !viþne.isChecked() && !kiraz.isChecked() && !portakal.isChecked() && !mandalina.isChecked() && !ananas.isChecked() && !ayva.isChecked() && !nar.isChecked() && !muz.isChecked()){
					
					display.setText("Ben MEYVE SEVMÝYORUM !!");
				}
				
			}
		};
      ayva.setOnCheckedChangeListener(mylistener);  
      armut.setOnCheckedChangeListener(mylistener);
      viþne.setOnCheckedChangeListener(mylistener);
      portakal.setOnCheckedChangeListener(mylistener);
      elma.setOnCheckedChangeListener(mylistener);
      mandalina.setOnCheckedChangeListener(mylistener);
      kiraz.setOnCheckedChangeListener(mylistener);
      muz.setOnCheckedChangeListener(mylistener);
      nar.setOnCheckedChangeListener(mylistener);
      ananas.setOnCheckedChangeListener(mylistener);
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
