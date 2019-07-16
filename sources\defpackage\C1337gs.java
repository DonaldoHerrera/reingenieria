package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: gs reason: default package and case insensitive filesystem */
public class C1337gs implements IInterface {
    private final IBinder zaa;
    private final String zab;

    protected C1337gs(IBinder iBinder, String str) {
        this.zaa = iBinder;
        this.zab = str;
    }

    public IBinder asBinder() {
        return this.zaa;
    }

    /* access modifiers changed from: protected */
    public final Parcel zaa() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zab);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void zab(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.zaa.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void zac(int i, Parcel parcel) throws RemoteException {
        try {
            this.zaa.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final Parcel zaa(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.zaa.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
