package jp.co.nazo.album;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class SelectPictureActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_select_picture);

		GridView listView = (GridView)findViewById(R.id.gridViewSelectPicture);
		listView.setNumColumns(3);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				
			}
		});

		String[] dataAlbum = {"PIC_01", "PIC_02", "PIC_03","PIC_04", "PIC_05", "PIC_06","PIC_07", "PIC_08", "PIC_09","PIC_10", "PIC_11", "PIC_12"}; 
		ArrayAdapter<String> albumAdapter = new ArrayAdapter<String>(this, R.layout.row_data, dataAlbum);
	    listView.setAdapter(albumAdapter);

		Button btnNext = (Button)findViewById(R.id.btnNext);
		btnNext.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(SelectPictureActivity.this, AlbumPreviewActivity.class));
			}
		});
	}
}
