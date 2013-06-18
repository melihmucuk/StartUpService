package com.mucuk.startupservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MReceiver extends BroadcastReceiver {   

    @Override
    public void onReceive(Context context, Intent intent) {
     Intent myIntent = new Intent(context, MService.class);
     context.startService(myIntent);
    } 
}