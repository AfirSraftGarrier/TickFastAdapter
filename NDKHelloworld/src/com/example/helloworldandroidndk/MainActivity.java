package com.example.helloworldandroidndk;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// helloLog("This will log to LogCat via the native call.");
		System.out.println(stringTestNdk());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public native String stringTestNdk();

	public native String stringTestNdk2();

	static {
		System.loadLibrary("HelloworldAndroidNDK");
	}

}
