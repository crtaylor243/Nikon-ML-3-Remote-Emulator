package com.rasputin243.nikon.remote;


import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class StartRemote extends Activity implements OnClickListener {
    Button btnSingleShutter;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
     // Get button views
        btnSingleShutter = (Button) findViewById(R.id.btnModeSingle);        
        btnSingleShutter.setOnClickListener(this);
     }


	@Override
	public void onClick(View v) {
		// Single shutter exposure
    	MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.singleshutterlivephase);
		
		
		AudioManager mAudioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
		int maxVolume = mAudioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
		mAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC, maxVolume, AudioManager.FLAG_SHOW_UI);

    	mediaPlayer.start();
	}
    
}
