package com.example.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.widget.Toast;

public class Alarm extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        MediaPlayer sound = MediaPlayer.create(context, Settings.System.DEFAULT_NOTIFICATION_URI);
        sound.start();
        Toast.makeText(context, "Alarm dzwoni!", Toast.LENGTH_SHORT).show();
    }
}
