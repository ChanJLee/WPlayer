package com.chan.xplay;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.chan.xplay.extracter.Mp4Extractor;

import javax.sql.DataSource;

/**
 * Created by chan on 2017/11/11.
 */

public class WPlayer {
	private Surface mSurface;
	private Context mContext;

	public WPlayer(Context context) {
		mContext = context;
	}

	public void setSurface(SurfaceView surfaceView) {
		surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
			@Override
			public void surfaceCreated(SurfaceHolder holder) {
				setSurface(holder.getSurface());
			}

			@Override
			public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

			}

			@Override
			public void surfaceDestroyed(SurfaceHolder holder) {

			}
		});
	}

	public void setSurface(Surface surface) {
		mSurface = surface;
	}

	public void play(Uri uri) {
		if (mSurface == null) {
			return;
		}

		Mp4Extractor extracter = new Mp4Extractor(mContext, uri);
	}
}
