package com.joshbgold.homebuttonreplacement;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import static android.support.v4.app.ActivityCompat.startActivity;

/**
 * Created by Josh Gold starting on 8/6/2017.
 */
public class QuickSettingTileService extends Service {

    public QuickSettingTileService()
    {
    }

    @Nullable
    //@Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    //@Override
    public void onClick()
    {
      //do some stuff, like to the home screen
    }
}