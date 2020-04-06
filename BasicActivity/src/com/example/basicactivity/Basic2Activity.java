package com.example.basicactivity;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class Basic2Activity extends Activity {
	TextView tv1,tv2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_basic2);
	String s=getIntent().getStringExtra("total");
	String s1=getIntent().getStringExtra("name");
		
	tv1=(TextView) findViewById(R.id.textView2);
	tv2=(TextView) findViewById(R.id.textView4);
		tv1.setText(s1);
		tv2.setText(s);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.basic2, menu);
		return true;
	}

}
