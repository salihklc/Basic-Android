package com.example.getlucky;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {

	MediaPlayer ourSong;
	@Override
	protected void onCreate(Bundle SalihTheKing) {
		// TODO Auto-generated method stub
		super.onCreate(SalihTheKing);
		setContentView(R.layout.splash);
		ourSong = MediaPlayer.create(Splash.this, R.raw.daft_punk);
		ourSong.start();
		Thread timer=new Thread(){
			public void run(){
				try{
					sleep(4000);
				} catch (InterruptedException e){
					e.printStackTrace();
				} finally {
					Intent openMainActivity = new Intent("com.exaple.getlucky.MENU");
					startActivity(openMainActivity);
				}
			}	
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
	}
	
}
