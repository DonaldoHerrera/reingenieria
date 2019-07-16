package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.B;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.concurrent.Executor;

/* renamed from: kk reason: default package and case insensitive filesystem */
/* compiled from: InternalAppEventsLogger */
public class C1452kk {
    private C1329gk a;

    public C1452kk(Context context) {
        this.a = new C1329gk(context, (String) null, (AccessToken) null);
    }

    public static a c() {
        return C1329gk.d();
    }

    static String d() {
        return C1329gk.f();
    }

    public void a(String str, Bundle bundle) {
        if (B.h()) {
            this.a.a(str, bundle);
        }
    }

    public void b(String str, Bundle bundle) {
        if (B.h()) {
            this.a.a(str, (Double) null, bundle);
        }
    }

    public C1452kk(Context context, String str) {
        this.a = new C1329gk(context, str, (AccessToken) null);
    }

    static Executor b() {
        return C1329gk.c();
    }

    public void a(String str, double d, Bundle bundle) {
        if (B.h()) {
            this.a.a(str, d, bundle);
        }
    }

    public C1452kk(String str, String str2, AccessToken accessToken) {
        this.a = new C1329gk(str, str2, accessToken);
    }

    public void a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (B.h()) {
            this.a.a(bigDecimal, currency, bundle);
        }
    }

    public void a(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (B.h()) {
            this.a.a(str, bigDecimal, currency, bundle);
        }
    }

    public void a(String str) {
        if (B.h()) {
            this.a.a(str, (Double) null, (Bundle) null);
        }
    }

    public void a(String str, Double d, Bundle bundle) {
        if (B.h()) {
            this.a.a(str, d, bundle);
        }
    }

    public void a() {
        this.a.b();
    }
}
