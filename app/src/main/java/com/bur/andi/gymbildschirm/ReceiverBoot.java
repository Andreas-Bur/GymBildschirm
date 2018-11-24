package com.bur.andi.gymbildschirm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Andi on 12.08.2016.
 */
public class ReceiverBoot extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("Gymbildschirm", "ReceiverBoot.onReceive");
        JobUtil.scheduleJob(context);

    }

}
