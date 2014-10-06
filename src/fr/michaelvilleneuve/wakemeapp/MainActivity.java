package fr.michaelvilleneuve.wakemeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	public final static String EXTRA_MESSAGE = "someString";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        // Do something in response to button
    	Intent intent = new Intent(this, Second_activity.class);
    	 EditText editText = (EditText) findViewById(R.id.edit_message);
    	    String message = editText.getText().toString();
    	    intent.putExtra(EXTRA_MESSAGE, message);
    	    startActivity(intent);
    }
    // android:onClick="sendMessage"
    // Liste menu elements
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
        getMenuInflater().inflate(R.menu.main, menu);
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

       // Intent intent = new Intent(this, Second_activity.class);
   	   // startActivity(intent);
    }
}
