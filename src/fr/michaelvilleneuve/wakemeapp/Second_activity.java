package fr.michaelvilleneuve.wakemeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class Second_activity extends ActionBarActivity {
	private ImageButton imageButton1;
	private TimePicker timePicker1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_activity);
		setTitle("Accueil");
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		String password = "test"; 
		 if (message == password) {
			 TextView textView = new TextView(this);
			 message = message .concat(" vous êtes désormais connecté");
			    textView.setTextSize(20);
			    textView.setText(message);

			    // Set the text view as the activity layout
			    setContentView(textView);
		 }
		 else {
			 
			    imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
			    imageButton1.setVisibility(View.VISIBLE);
			    timePicker1 = (TimePicker) findViewById(R.id.timePicker1);
			    timePicker1.setVisibility(View.VISIBLE);
		 }

	}
    public void openAlarm() {
    	Intent intent = new Intent(this, Alarm_activity.class);
    	startActivity(intent);
    }
    public void openAccount() {
    	Intent intent = new Intent(this, Account_activity.class);
    	startActivity(intent);
    }
    public void openList() {
    	Intent intent = new Intent(this, List_activity.class);
    	startActivity(intent);
    }
    public void openSettings() {
    	Intent intent = new Intent(this, Settings_activity.class);
    	startActivity(intent);
    }
    public void openSearch() {
    	Intent intent = new Intent(this, Search_activity.class);
    	startActivity(intent);
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second_activity, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
        case R.id.item1:
            openAlarm();
            return true;
        case R.id.item2:
            openAccount();
            return true;
        case R.id.item3:
            openList();
            return true;
        case R.id.item4:
            openSettings();
            return true;
        case R.id.item5:
            openSearch();
            return true;
        default:
            return super.onOptionsItemSelected(item);
    }
	}
}
