package jp.co.nazo.album;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class UserSettingActivity extends FragmentActivity{

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_user_setting);

		Button btnComplete = (Button)findViewById(R.id.btnComplete);
		btnComplete.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(UserSettingActivity.this, TopActivity.class));
			}
		});
	}
}
