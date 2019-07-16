package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.measurement.ua reason: case insensitive filesystem */
public abstract class C1047ua<T> {
    private static final Object a = new Object();
    @SuppressLint({"StaticFieldLeak"})
    private static Context b = null;
    private static boolean c = false;
    private static final AtomicInteger d = new AtomicInteger();
    private final Ba e;
    private final String f;
    private final T g;
    private volatile int h;
    private volatile T i;

    private C1047ua(Ba ba, String str, T t) {
        this.h = -1;
        if (ba.b != null) {
            this.e = ba;
            this.f = str;
            this.g = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static void a(Context context) {
        synchronized (a) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (b != context) {
                synchronized (C0976ia.class) {
                    C0976ia.a.clear();
                }
                synchronized (Aa.class) {
                    Aa.a.clear();
                }
                synchronized (C1029ra.class) {
                    C1029ra.a = null;
                }
                d.incrementAndGet();
                b = context;
            }
        }
    }

    static void b() {
        d.incrementAndGet();
    }

    private final T d() {
        C1000ma maVar;
        Ba ba = this.e;
        String str = (String) C1029ra.a(b).a("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
        if (!(str != null && C0969ha.c.matcher(str).matches())) {
            if (this.e.b == null) {
                Context context = b;
                Ba ba2 = this.e;
                maVar = Aa.a(context, (String) null);
            } else if (C1035sa.a(b, this.e.b)) {
                Ba ba3 = this.e;
                maVar = C0976ia.a(b.getContentResolver(), this.e.b);
            } else {
                maVar = null;
            }
            if (maVar != null) {
                Object a2 = maVar.a(c());
                if (a2 != null) {
                    return a(a2);
                }
            }
        } else {
            String str2 = "PhenotypeFlag";
            if (Log.isLoggable(str2, 3)) {
                String str3 = "Bypass reading Phenotype values for flag: ";
                String valueOf = String.valueOf(c());
                Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            }
        }
        return null;
    }

    private final T e() {
        Ba ba = this.e;
        Object a2 = C1029ra.a(b).a(a(this.e.c));
        if (a2 != null) {
            return a(a2);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public abstract T a(Object obj);

    public final String c() {
        return a(this.e.d);
    }

    /* access modifiers changed from: private */
    public static C1047ua<Long> b(Ba ba, String str, long j) {
        return new C1065xa(ba, str, Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    public static C1047ua<Boolean> b(Ba ba, String str, boolean z) {
        return new C1059wa(ba, str, Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    public static C1047ua<Double> b(Ba ba, String str, double d2) {
        return new C1077za(ba, str, Double.valueOf(d2));
    }

    /* access modifiers changed from: private */
    public static C1047ua<String> b(Ba ba, String str, String str2) {
        return new C1071ya(ba, str, str2);
    }

    /* synthetic */ C1047ua(Ba ba, String str, Object obj, C1065xa xaVar) {
        this(ba, str, obj);
    }

    private final String a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final T a() {
        int i2 = d.get();
        if (this.h < i2) {
            synchronized (this) {
                if (this.h < i2) {
                    if (b != null) {
                        Ba ba = this.e;
                        T d2 = d();
                        if (d2 == null) {
                            d2 = e();
                            if (d2 == null) {
                                d2 = this.g;
                            }
                        }
                        this.i = d2;
                        this.h = i2;
                    } else {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                }
            }
        }
        return this.i;
    }
}
