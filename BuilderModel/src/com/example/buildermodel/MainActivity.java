package com.example.buildermodel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tv = (TextView)findViewById(R.id.tv);
		
		Builder builder = new MacBuilder();
		Director pcdirDirector = new Director(builder);
		pcdirDirector.construct("因特尔主板", "Retia显示器");
		tv.setText("Computer Info ："+builder.creteComputer().toString());
		System.out.println("Computer Info ："+builder.creteComputer().toString());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
