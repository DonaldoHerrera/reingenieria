package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import androidx.core.content.a;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.d reason: case insensitive filesystem */
public final class C1097d extends C1120hc {
    private long c;
    private String d;
    private Boolean e;
    private AccountManager f;
    private Boolean g;
    private long h;

    C1097d(Mb mb) {
        super(mb);
    }

    public final boolean a(Context context) {
        if (this.e == null) {
            a();
            this.e = Boolean.valueOf(false);
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.e = Boolean.valueOf(true);
                }
            } catch (NameNotFoundException unused) {
            }
        }
        return this.e.booleanValue();
    }

    public final /* bridge */ /* synthetic */ C1168rb b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ Clock c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ Gb d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C1124ib e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ ce f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ C1097d j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ C1114gb k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Vd l() {
        return super.l();
    }

    /* access modifiers changed from: protected */
    public final boolean q() {
        Calendar instance = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.d = sb.toString();
        return false;
    }

    public final long s() {
        o();
        return this.c;
    }

    public final String t() {
        o();
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public final long u() {
        i();
        return this.h;
    }

    /* access modifiers changed from: 0000 */
    public final void v() {
        i();
        this.g = null;
        this.h = 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean w() {
        String str = AccountType.GOOGLE;
        i();
        long currentTimeMillis = c().currentTimeMillis();
        if (currentTimeMillis - this.h > 86400000) {
            this.g = null;
        }
        Boolean bool = this.g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (a.a(getContext(), "android.permission.GET_ACCOUNTS") != 0) {
            e().w().a("Permission error checking for dasher/unicorn accounts");
            this.h = currentTimeMillis;
            this.g = Boolean.valueOf(false);
            return false;
        }
        if (this.f == null) {
            this.f = AccountManager.get(getContext());
        }
        try {
            Account[] accountArr = (Account[]) this.f.getAccountsByTypeAndFeatures(str, new String[]{"service_HOSTED"}, null, null).getResult();
            if (accountArr == null || accountArr.length <= 0) {
                Account[] accountArr2 = (Account[]) this.f.getAccountsByTypeAndFeatures(str, new String[]{"service_uca"}, null, null).getResult();
                if (accountArr2 != null && accountArr2.length > 0) {
                    this.g = Boolean.valueOf(true);
                    this.h = currentTimeMillis;
                    return true;
                }
                this.h = currentTimeMillis;
                this.g = Boolean.valueOf(false);
                return false;
            }
            this.g = Boolean.valueOf(true);
            this.h = currentTimeMillis;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            e().t().a("Exception checking account types", e2);
        }
    }

    public final /* bridge */ /* synthetic */ be a() {
        return super.a();
    }
}
