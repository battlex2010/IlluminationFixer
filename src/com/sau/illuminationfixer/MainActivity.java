package com.sau.illuminationfixer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
	@Override
	 public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.main);
	  startService(new Intent(this,LightService.class));
	  startService(new Intent(this,Control.class));
	  
	  }
}