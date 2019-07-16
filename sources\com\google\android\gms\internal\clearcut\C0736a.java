package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.clearcut.a reason: case insensitive filesystem */
public class C0736a implements IInterface {
    private final IBinder a;
    private final String b;

    protected C0736a(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel C() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, Parcel parcel) throws RemoteException {
        try {
            this.a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
