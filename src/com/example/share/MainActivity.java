package com.example.share;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity{

    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onShareGPlus(View view)
	{
		Intent intent = new Intent(this, ShareActivity.class);
		startActivity(intent);
		
	}
	
	public void onShareGDrive(View view)
	{
		
		
		Intent intent = new Intent(this, GoogleDriveActivity.class);
		intent.setAction(getString(R.string.action_upload_drive));
		startActivity(intent);
		
	}
	


}
