package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public interface IResolveAccountCallbacks extends IInterface {

    public static abstract class Stub extends C1368hs implements IResolveAccountCallbacks {

        public static class Proxy extends C1337gs implements IResolveAccountCallbacks {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IResolveAccountCallbacks");
            }

            public void onAccountResolutionComplete(ResolveAccountResponse resolveAccountResponse) throws RemoteException {
                Parcel zaa = zaa();
                C1398is.a(zaa, (Parcelable) resolveAccountResponse);
                zab(2, zaa);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.IResolveAccountCallbacks");
        }

        public static IResolveAccountCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
            if (queryLocalInterface instanceof IResolveAccountCallbacks) {
                return (IResolveAccountCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        /* access modifiers changed from: protected */
        public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            onAccountResolutionComplete((ResolveAccountResponse) C1398is.a(parcel, ResolveAccountResponse.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    void onAccountResolutionComplete(ResolveAccountResponse resolveAccountResponse) throws RemoteException;
}
