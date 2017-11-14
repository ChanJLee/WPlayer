package com.chan.xplay.clock;

import android.os.SystemClock;

/**
 * Created by chan on 2017/11/13.
 */

public class MediaClock {
	private long mTimestamp;

	public MediaClock() {
		mTimestamp = SystemClock.elapsedRealtime();
	}

	public long elapse() {
		long timestamp = SystemClock.elapsedRealtime();
		long result = timestamp - mTimestamp;
		mTimestamp = timestamp;
		return result;
	}
}
