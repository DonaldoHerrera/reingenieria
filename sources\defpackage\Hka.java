package defpackage;

import android.os.Bundle;
import com.soundcloud.android.accounts.E;
import com.soundcloud.android.onboarding.auth.C;
import com.soundcloud.android.onboarding.auth.pa;

@Deprecated
/* renamed from: Hka reason: default package */
/* compiled from: LegacyAuthTaskResult */
public final class Hka {
    private final Kka a;
    private final C3776gea b;
    private final pa c;
    private final Exception d;
    private final Bundle e;

    private Hka(C3776gea gea, pa paVar) {
        this(Kka.SUCCESS, gea, paVar, null, null);
    }

    public static Hka a(C3776gea gea, pa paVar) {
        return new Hka(gea, paVar);
    }

    public static Hka b(ifa ifa) {
        return new Hka(Kka.SERVER_ERROR, ifa);
    }

    public static Hka c(ifa ifa) {
        return new Hka(Kka.UNAUTHORIZED, ifa);
    }

    public String toString() {
        Object[] objArr = new Object[5];
        boolean z = false;
        objArr[0] = this.a;
        objArr[1] = Boolean.valueOf(this.b != null);
        objArr[2] = this.c;
        objArr[3] = this.d;
        if (this.e != null) {
            z = true;
        }
        objArr[4] = Boolean.valueOf(z);
        return String.format("Auth task result with\n\tkind: %s\n\tuser present: %b\n\tvia: %s\n\texception: %s\n\tbundle present: %b\n", objArr);
    }

    private Hka(Exception exc) {
        this(Kka.FAILURE, null, null, exc, null);
    }

    public static Hka a(Exception exc) {
        return new Hka(exc);
    }

    public static Hka b(Exception exc) {
        return new Hka(Kka.NETWORK_ERROR, exc);
    }

    private Hka(Kka kka, ifa ifa) {
        this(kka, null, null, ifa, null);
    }

    public static Hka a(ifa ifa) {
        int i = Gka.a[ifa.j().ordinal()];
        if (i == 1) {
            return c(ifa);
        }
        if (i == 2) {
            return a(ifa.a(), ifa);
        }
        if (i == 3) {
            return b((Exception) ifa.getCause());
        }
        if (i != 4) {
            return new Hka(ifa);
        }
        return b(ifa);
    }

    public boolean b() {
        return this.a == Kka.SUCCESS;
    }

    private Hka(Kka kka, Exception exc) {
        this(kka, null, null, exc, null);
    }

    private Hka(Kka kka, C3776gea gea, pa paVar, Exception exc, Bundle bundle) {
        this.a = kka;
        this.b = gea;
        this.c = paVar;
        this.d = exc;
        this.e = bundle;
    }

    public static Hka a(String str, ifa ifa) {
        return new Hka(Kka.VALIDATION_ERROR, ifa);
    }

    public Eka a() {
        if (b()) {
            return Eka.a(new C4719yka(null, E.a(this.b, null, false)));
        }
        Exception exc = this.d;
        if (exc instanceof ifa) {
            return C.a((ifa) exc);
        }
        return Eka.a(exc);
    }
}
