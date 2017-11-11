package com.chan.xplay.extracter;

import android.content.Context;
import android.net.Uri;

/**
 * Created by chan on 2017/11/11.
 */

public class Mp4Extractor {
	private Context mContext;
	private Uri mUri;

	public Mp4Extractor(Context context, Uri uri) {
		mContext = context;
		mUri = uri;
	}
}
