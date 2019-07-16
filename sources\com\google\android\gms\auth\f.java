package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;

final class f implements g<TokenData> {
    private final /* synthetic */ Account a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Bundle c;

    f(Account account, String str, Bundle bundle) {
        this.a = account;
        this.b = str;
        this.c = bundle;
    }

    public final /* synthetic */ Object a(IBinder iBinder) throws RemoteException, IOException, a {
        Bundle a2 = C1275es.a(iBinder).a(this.a, this.b, this.c);
        e.b(a2);
        Bundle bundle = a2;
        TokenData a3 = TokenData.a(bundle, "tokenDetails");
        if (a3 != null) {
            return a3;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        C0472as a4 = C0472as.a(string);
        boolean z = false;
        if (!C0472as.a(a4)) {
            if (C0472as.NETWORK_ERROR.equals(a4) || C0472as.SERVICE_UNAVAILABLE.equals(a4) || C0472as.INTNERNAL_ERROR.equals(a4)) {
                z = true;
            }
            if (z) {
                throw new IOException(string);
            }
            throw new a(string);
        }
        Logger a5 = e.e;
        String valueOf = String.valueOf(a4);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("isUserRecoverableError status: ");
        sb.append(valueOf);
        a5.w("GoogleAuthUtil", sb.toString());
        throw new d(string, intent);
    }
}
