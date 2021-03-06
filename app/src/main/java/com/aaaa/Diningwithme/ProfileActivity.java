package com.aaaa.Diningwithme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_profile);
		
		TextView user = (TextView)this.findViewById(R.id.username);
		user.setText(MainActivity.user_name);
		user.setGravity(Gravity.CENTER_HORIZONTAL);
		
		Button b_profile = (Button)this.findViewById(R.id.profile_p);
		b_profile.getBackground().setAlpha(00);
		
		Button invitation = (Button)this.findViewById(R.id.invitation);
		invitation.getBackground().setAlpha(00);
		
		Button application = (Button)this.findViewById(R.id.application);
		application.getBackground().setAlpha(00);
		
		Button history = (Button)this.findViewById(R.id.history);
		history.getBackground().setAlpha(00);
		
		Button notification = (Button)this.findViewById(R.id.notification);
		notification.getBackground().setAlpha(00);
		
		Button setting = (Button)this.findViewById(R.id.setting);
		setting.getBackground().setAlpha(00);
		
		b_profile.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(ProfileActivity.this, PersoninfoActivity.class));
				
			}
		});
		
		
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
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
