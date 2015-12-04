package com.demo.volumebuttondemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class VolumeKeyPressReceiver extends BroadcastReceiver {
    public VolumeKeyPressReceiver() {
    }

    // in emulator test using following commands
    /*
        adb shell input keyevent 24
        adb shell input keyevent 25
     */

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION")) {
            Toast.makeText(context, "this is not shown"     , Toast.LENGTH_SHORT).show();
            int newVolume = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
            int oldVolume = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", 0);
            if (newVolume != oldVolume) {
//                Intent i = new Intent();
//                i.setClass(context, YourActivity.class);
//                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                context.startActivity(i);
//                Toast.makeText(context, "this is not shown"     , Toast.LENGTH_SHORT).show();
            }
        }
    }
}
