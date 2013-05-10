package com.example.proj3;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
	
	Button btnRules, btnPlay;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_main);
    	btnRules = (Button) findViewById(R.id.btnRules);
    	btnPlay = (Button) findViewById(R.id.btnPlay);
    	
    	btnRules.setOnClickListener(new ButtonListener());
    	btnPlay.setOnClickListener(new ButtonListener());
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    private class ButtonListener implements OnClickListener
    {
    	

		@Override
		public void onClick(View V) {
			if (V.getId() == R.id.btnRules) {
				startActivity(new Intent(MainActivity.this, Rules.class));
			} else if (V.getId() == R.id.btnPlay) {
				
			}
			
		}
    	
    }

    
}
