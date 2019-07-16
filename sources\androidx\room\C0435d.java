package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: androidx.room.d reason: case insensitive filesystem */
/* compiled from: IMultiInstanceInvalidationCallback */
public interface C0435d extends IInterface {

    /* renamed from: androidx.room.d$a */
    /* compiled from: IMultiInstanceInvalidationCallback */
    public static abstract class a extends Binder implements C0435d {

        /* renamed from: androidx.room.d$a$a reason: collision with other inner class name */
        /* compiled from: IMultiInstanceInvalidationCallback */
        private static class C0022a implements C0435d {
            private IBinder a;

            C0022a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static C0435d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0435d)) {
                return new C0022a(iBinder);
            }
            return (C0435d) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "androidx.room.IMultiInstanceInvalidationCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                a(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    void a(String[] strArr) throws RemoteException;
}
