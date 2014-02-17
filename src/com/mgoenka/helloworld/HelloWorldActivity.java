package com.mgoenka.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class HelloWorldActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_world);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hello_world, menu);
		return true;
	}
	
	public void onGoodbye(View v) {
		TextView tv = (TextView)findViewById(R.id.textView1);
		tv.setText(getString(R.string.goodbye));
	}

}
