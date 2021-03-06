/**
 * The MIT License (MIT)
 * Copyright (c) 2012 David Carver
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 * OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF
 * OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package us.nineworlds.serenity.ui.browser.music;

import java.util.ArrayList;
import java.util.List;

import com.jess.ui.TwoWayAdapterView;
import com.jess.ui.TwoWayAdapterView.OnItemSelectedListener;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageSize;

import us.nineworlds.serenity.SerenityApplication;
import us.nineworlds.serenity.core.model.VideoContentInfo;
import us.nineworlds.serenity.core.model.impl.MusicArtistContentInfo;
import us.nineworlds.serenity.core.model.impl.Subtitle;
import us.nineworlds.serenity.core.services.MovieMetaDataRetrievalIntentService;
import us.nineworlds.serenity.ui.listeners.SubtitleSpinnerOnItemSelectedListener;
import us.nineworlds.serenity.ui.views.SerenityMusicImageView;
import us.nineworlds.serenity.ui.views.SerenityPosterImageView;

import us.nineworlds.serenity.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * When a poster is selected, update the information displayed in the browser.
 * 
 * @author dcarver
 * 
 */
public class MusicGridOnItemSelectedListener implements
		OnItemSelectedListener {

	private static Activity context;
	private View previous;

	/**
	 * 
	 */
	public MusicGridOnItemSelectedListener(Activity activity) {
		context = activity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.widget.AdapterView.OnItemSelectedListener#onItemSelected(android
	 * .widget.AdapterView, android.view.View, int, long)
	 */
	public void onItemSelected(TwoWayAdapterView<?> av, View v, int position,
			long id) {

		if (previous != null) {
			previous.setPadding(0, 0, 0, 0);
		}

		previous = v;

		v.setPadding(5, 5, 5, 5);

		createMusicMetaData((SerenityMusicImageView) v);
	}


	private void createMusicMetaData(SerenityMusicImageView v) {
		SerenityMusicImageView mpiv = (SerenityMusicImageView) v;
		MusicArtistContentInfo mi = mpiv.getPosterInfo();
		TextView posterTitle = (TextView) context.findViewById(R.id.musicTitle);
		posterTitle.setText(mi.getTitle());

	}
	
	public void onNothingSelected(TwoWayAdapterView<?> av) {
		if (previous != null) {
			previous.setPadding(0, 0, 0, 0);
			previous.refreshDrawableState();
		}

	}	
}
