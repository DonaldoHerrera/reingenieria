package com.google.android.gms.cast.framework.media;

import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

public interface A extends IInterface {
    int[] o() throws RemoteException;

    List<NotificationAction> v() throws RemoteException;
}
