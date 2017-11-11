package com.chan.wplayer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import com.chan.xplay.WPlayer;

public class MainActivity extends AppCompatActivity {

	private WPlayer mWPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		SurfaceView surfaceView = (SurfaceView) findViewById(R.id.surface_view);
		mWPlayer = new WPlayer();
		mWPlayer.setSurface(surfaceView);

		findViewById(R.id.play).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mWPlayer.play(Uri.parse("file:///android_asset/remix.mp4"));
			}
		});
	}
}
