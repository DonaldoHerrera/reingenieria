package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: qP reason: default package and case insensitive filesystem */
/* compiled from: UnauthorisedRequestRegistry */
public class C3218qP {
    private static final long a = TimeUnit.SECONDS.toMillis(5);
    @SuppressLint({"StaticFieldLeak"})
    private static C3218qP b;
    private final Context c;
    private final SharedPreferences d;

    protected C3218qP(Context context, SharedPreferences sharedPreferences) {
        this.c = context.getApplicationContext();
        this.d = sharedPreferences;
    }

    public static synchronized C3218qP a(Context context) {
        C3218qP qPVar;
        synchronized (C3218qP.class) {
            if (b == null) {
                b = new C3218qP(context, C7853zya.a(context));
            }
            qPVar = b;
        }
        return qPVar;
    }

    private long d() {
        return this.d.getLong("LAST_OBSERVED_AUTH_ERROR_TIME", 0);
    }

    private boolean e() {
        if (d() != 0) {
            return false;
        }
        this.d.edit().putLong("LAST_OBSERVED_AUTH_ERROR_TIME", System.currentTimeMillis()).apply();
        return true;
    }

    public Boolean b() {
        long d2 = d();
        if (d2 == 0) {
            return Boolean.valueOf(false);
        }
        long currentTimeMillis = System.currentTimeMillis() - d2;
        boolean z = true;
        SDb.a("RequestRegistry").a("Milliseconds since last observed unauthorised request %s", Long.valueOf(currentTimeMillis));
        if (currentTimeMillis < a) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void c() {
        boolean e = e();
        SDb.a("RequestRegistry").a("Observed Unauthorised request timestamp update result = %s", Boolean.valueOf(e));
        this.c.sendBroadcast(new Intent("SoundCloudApplication.unauthorized"));
    }

    public void a() {
        SDb.a("RequestRegistry").a("Clearing Observed Unauthorised request timestamp", new Object[0]);
        this.d.edit().clear().apply();
    }
}
