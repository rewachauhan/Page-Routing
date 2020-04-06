package com.example.basicactivity;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class BasicActivity extends Activity {
	Button bt;
	EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        et1=(EditText) findViewById(R.id.editText1);
        et2=(EditText) findViewById(R.id.editText2);
        bt=(Button) findViewById(R.id.button1);
        bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String s;
				s=et1.getText().toString();
				double b=Double.parseDouble(et2.getText().toString());
				double da=0,hra=0,other=0,gs=0;
				da=b*0.6;
				hra=b*0.5;
				other=b*0.4;
				gs=(b+da)-(hra+other);
				Intent i=new Intent(BasicActivity.this,Basic2Activity.class);
				String d;
				d=String.valueOf(gs).toString();
				i.putExtra("name", s);
				i.putExtra("total", d);
				startActivity(i);
				
				
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.basic, menu);
        return true;
    }
    
}
