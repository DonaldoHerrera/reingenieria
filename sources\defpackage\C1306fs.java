package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: fs reason: default package and case insensitive filesystem */
public final class C1306fs extends Wr implements C1244ds {
    C1306fs(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    public final Bundle a(Account account, String str, Bundle bundle) throws RemoteException {
        Parcel C = C();
        C1214cs.a(C, (Parcelable) account);
        C.writeString(str);
        C1214cs.a(C, (Parcelable) bundle);
        Parcel a = a(5, C);
        Bundle bundle2 = (Bundle) C1214cs.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
