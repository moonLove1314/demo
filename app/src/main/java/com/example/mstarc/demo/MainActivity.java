package com.example.mstarc.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {
	
	private Location loc_now = new Location(36.1823, 120.420769, "");
	private Location loc_end = new Location(30.862644, 103.663077, "");

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.other).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		NativeDialog msgDialog = new NativeDialog(this, loc_now, loc_end);
		msgDialog.show();
	}
}
