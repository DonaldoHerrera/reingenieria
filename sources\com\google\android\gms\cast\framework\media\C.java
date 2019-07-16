package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C0732w;
import java.util.ArrayList;
import java.util.List;

public final class C extends C0732w implements A {
    C(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    public final int[] o() throws RemoteException {
        Parcel a = a(4, C());
        int[] createIntArray = a.createIntArray();
        a.recycle();
        return createIntArray;
    }

    public final List<NotificationAction> v() throws RemoteException {
        Parcel a = a(3, C());
        ArrayList createTypedArrayList = a.createTypedArrayList(NotificationAction.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }
}
