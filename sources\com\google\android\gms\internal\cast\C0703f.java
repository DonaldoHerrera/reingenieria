package com.google.android.gms.internal.cast;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.cast.f reason: case insensitive filesystem */
public interface C0703f extends IInterface {

    /* renamed from: com.google.android.gms.internal.cast.f$a */
    public static abstract class a extends C0693a implements C0703f {
        public static C0703f a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof C0703f) {
                return (C0703f) queryLocalInterface;
            }
            return new C0707h(iBinder);
        }
    }

    Bitmap a(Uri uri) throws RemoteException;
}
