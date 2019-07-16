package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.util.concurrent.Executor;

final class U implements C2495b {
    private final FirebaseApp a;
    private final C2510q b;
    private final C2516x c;
    private final Executor d;
    private final C2402ZE e;

    U(FirebaseApp firebaseApp, C2510q qVar, Executor executor, C2402ZE ze) {
        this(firebaseApp, qVar, executor, new C2516x(firebaseApp.b(), qVar), ze);
    }

    public final Wy<String> a(String str, String str2, String str3, String str4) {
        return b(a(str, str3, str4, new Bundle()));
    }

    public final boolean a() {
        return false;
    }

    public final boolean b() {
        return this.b.a() != 0;
    }

    public final Wy<Void> b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        bundle.putString("gcm.topic", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        String valueOf2 = String.valueOf(str3);
        return a(b(a(str, str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), bundle)));
    }

    private U(FirebaseApp firebaseApp, C2510q qVar, Executor executor, C2516x xVar, C2402ZE ze) {
        this.a = firebaseApp;
        this.b = qVar;
        this.c = xVar;
        this.d = executor;
        this.e = ze;
    }

    public final Wy<Void> a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        bundle.putString("gcm.topic", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return a(b(a(str, str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), bundle)));
    }

    private final Wy<String> b(Wy<Bundle> wy) {
        return wy.a(this.d, (Py<TResult, TContinuationResult>) new V<TResult,TContinuationResult>(this));
    }

    private final Wy<Bundle> a(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.a.d().b());
        bundle.putString("gmsv", Integer.toString(this.b.d()));
        bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.b());
        bundle.putString("app_ver_name", this.b.c());
        bundle.putString("cliv", "fiid-12451000");
        bundle.putString("Firebase-Client", this.e.a());
        Xy xy = new Xy();
        this.d.execute(new T(this, bundle, xy));
        return xy.a();
    }

    /* access modifiers changed from: private */
    public static String a(Bundle bundle) throws IOException {
        String str = "SERVICE_NOT_AVAILABLE";
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException(str);
            }
        } else {
            throw new IOException(str);
        }
    }

    private final <T> Wy<Void> a(Wy<T> wy) {
        return wy.a(J.a(), (Py<TResult, TContinuationResult>) new W<TResult,TContinuationResult>(this));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(Bundle bundle, Xy xy) {
        try {
            xy.a(this.c.a(bundle));
        } catch (IOException e2) {
            xy.a((Exception) e2);
        }
    }
}
