package com.study.train.aidl;

import android.os.RemoteException;

import com.study.train.IMyAidlInterface;

public class AidlImpl extends IMyAidlInterface.Stub {

    @Override
    public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble,
            String aString) throws RemoteException {
    }

    @Override
    public void setName(String name) throws RemoteException {
    }

    @Override
    public void setSex(String sex) throws RemoteException {
    }

    @Override
    public void setAge(int age) throws RemoteException {
    }

    @Override
    public String getPerson() throws RemoteException {
        return null;
    }
}
