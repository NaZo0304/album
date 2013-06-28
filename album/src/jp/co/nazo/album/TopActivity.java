package jp.co.nazo.album;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class TopActivity extends FragmentActivity {
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_top);
		
		Button btnCreateAlbum = (Button)findViewById(R.id.btnCreateAlbum);
		btnCreateAlbum.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(TopActivity.this, CreateAlbumSettingActivity.class));
			}
		});
		
		ListView historyListView = (ListView)findViewById(R.id.listViewHistory);
		String[] data = {"ぱぱさん釣りアルバム", "ままさん旅行アルバム", "ゲームプレイアルバム", "日常アルバム"}; 
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.row_data, data);
		historyListView.setAdapter(arrayAdapter);
		
		ListView myAlbumListView = (ListView)findViewById(R.id.listViewMyAlbum);
		String[] dataAlbum = {"箱根旅行日記", "らいにゃそ日記", "料理日記"}; 
		ArrayAdapter<String> albumAdapter = new ArrayAdapter<String>(this, R.layout.row_data, dataAlbum);
		myAlbumListView.setAdapter(albumAdapter);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    // メニューアイテムを追加します
	    menu.add(Menu.NONE, Menu.FIRST + 1, Menu.NONE, "プロフィール編集");
	    menu.add(Menu.NONE, Menu.FIRST + 4, Menu.NONE, "ログアウト");
	    return super.onCreateOptionsMenu(menu);
	}
	
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean ret = true;
        switch (item.getItemId()) {
        default:
            ret = super.onOptionsItemSelected(item);
            break;
        case Menu.FIRST + 1:
			startActivity(new Intent(TopActivity.this, ProfileActivity.class));
            break;
        case Menu.FIRST + 2:
            break;
        case Menu.FIRST + 3:
            break;
        case Menu.FIRST + 4:
			startActivity(new Intent(TopActivity.this, MainActivity.class));
            break;
        }
        return ret;
    }
}
