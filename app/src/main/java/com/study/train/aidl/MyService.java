package com.study.train.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MyService extends Service {

    private AidlImpl mAidl = new AidlImpl();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mAidl;
    }
}
