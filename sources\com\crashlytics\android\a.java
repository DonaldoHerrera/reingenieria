package com.crashlytics.android;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* compiled from: Crashlytics */
public class a extends C5531_Ma<Void> implements C5565aNa {
    public final Rg g;
    public final Fh h;
    public final Ei i;
    public final Collection<? extends C5531_Ma> j;

    /* renamed from: com.crashlytics.android.a$a reason: collision with other inner class name */
    /* compiled from: Crashlytics */
    public static class C0031a {
        private Rg a;
        private Fh b;
        private Ei c;
        private defpackage.Ei.a d;

        public C0031a a(Ei ei) {
            if (ei == null) {
                throw new NullPointerException("CrashlyticsCore Kit must not be null.");
            } else if (this.c == null) {
                this.c = ei;
                return this;
            } else {
                throw new IllegalStateException("CrashlyticsCore Kit already set.");
            }
        }

        public a a() {
            defpackage.Ei.a aVar = this.d;
            if (aVar != null) {
                if (this.c == null) {
                    this.c = aVar.a();
                } else {
                    throw new IllegalStateException("Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()");
                }
            }
            if (this.a == null) {
                this.a = new Rg();
            }
            if (this.b == null) {
                this.b = new Fh();
            }
            if (this.c == null) {
                this.c = new Ei();
            }
            return new a(this.a, this.b, this.c);
        }
    }

    public a() {
        this(new Rg(), new Fh(), new Ei());
    }

    public static a L() {
        return (a) C5328TMa.a(a.class);
    }

    private static void M() {
        if (L() == null) {
            throw new IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
        }
    }

    public static void a(Throwable th) {
        M();
        L().i.a(th);
    }

    public Collection<? extends C5531_Ma> c() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public Void d() {
        return null;
    }

    public String v() {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    public String x() {
        return "2.10.1.34";
    }

    a(Rg rg, Fh fh, Ei ei) {
        this.g = rg;
        this.h = fh;
        this.i = ei;
        this.j = Collections.unmodifiableCollection(Arrays.asList(new C5531_Ma[]{rg, fh, ei}));
    }

    public static void a(String str) {
        M();
        L().i.a(str);
    }

    public static void a(int i2, String str, String str2) {
        M();
        L().i.a(i2, str, str2);
    }

    public static void a(String str, String str2) {
        M();
        L().i.a(str, str2);
    }

    public static void a(String str, boolean z) {
        M();
        L().i.b(str, z);
    }

    public static void a(String str, int i2) {
        M();
        L().i.a(str, i2);
    }

    public static void a(String str, long j2) {
        M();
        L().i.a(str, j2);
    }
}
