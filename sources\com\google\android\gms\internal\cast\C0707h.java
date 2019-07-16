package com.google.android.gms.internal.cast;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.cast.h reason: case insensitive filesystem */
public final class C0707h extends C0732w implements C0703f {
    C0707h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    public final Bitmap a(Uri uri) throws RemoteException {
        Parcel C = C();
        V.a(C, (Parcelable) uri);
        Parcel a = a(1, C);
        Bitmap bitmap = (Bitmap) V.a(a, Bitmap.CREATOR);
        a.recycle();
        return bitmap;
    }
}
