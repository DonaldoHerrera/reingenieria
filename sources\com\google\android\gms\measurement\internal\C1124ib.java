package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

/* renamed from: com.google.android.gms.measurement.internal.ib reason: case insensitive filesystem */
public final class C1124ib extends C1120hc {
    /* access modifiers changed from: private */
    public char c = 0;
    /* access modifiers changed from: private */
    public long d = -1;
    private String e;
    private final C1134kb f = new C1134kb(this, 6, false, false);
    private final C1134kb g = new C1134kb(this, 6, true, false);
    private final C1134kb h = new C1134kb(this, 6, false, true);
    private final C1134kb i = new C1134kb(this, 5, false, false);
    private final C1134kb j = new C1134kb(this, 5, true, false);
    private final C1134kb k = new C1134kb(this, 5, false, true);
    private final C1134kb l = new C1134kb(this, 4, false, false);
    private final C1134kb m = new C1134kb(this, 3, false, false);
    private final C1134kb n = new C1134kb(this, 2, false, false);

    C1124ib(Mb mb) {
        super(mb);
    }

    @VisibleForTesting
    private final String C() {
        String str;
        synchronized (this) {
            if (this.e == null) {
                if (this.a.o() != null) {
                    this.e = this.a.o();
                } else {
                    this.e = ce.n();
                }
            }
            str = this.e;
        }
        return str;
    }

    protected static Object a(String str) {
        if (str == null) {
            return null;
        }
        return new C1129jb(str);
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    public final C1134kb A() {
        return this.n;
    }

    public final String B() {
        Pair<String, Long> a = b().e.a();
        if (a == null || a == C1168rb.c) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
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
        return false;
    }

    public final C1134kb s() {
        return this.f;
    }

    public final C1134kb t() {
        return this.g;
    }

    public final C1134kb u() {
        return this.h;
    }

    public final C1134kb v() {
        return this.i;
    }

    public final C1134kb w() {
        return this.j;
    }

    public final C1134kb x() {
        return this.k;
    }

    public final C1134kb y() {
        return this.l;
    }

    public final C1134kb z() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && a(i2)) {
            a(i2, a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i2 >= 5) {
            Preconditions.checkNotNull(str);
            Gb k2 = this.a.k();
            if (k2 == null) {
                a(6, "Scheduler not set. Not logging error/warn");
            } else if (!k2.n()) {
                a(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i2 < 0) {
                    i2 = 0;
                }
                C1119hb hbVar = new C1119hb(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3);
                k2.a((Runnable) hbVar);
            }
        }
    }

    public final /* bridge */ /* synthetic */ C1168rb b() {
        return super.b();
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public final boolean a(int i2) {
        return Log.isLoggable(C(), i2);
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public final void a(int i2, String str) {
        Log.println(i2, C(), str);
    }

    static String a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String a = a(z, obj);
        String a2 = a(z, obj2);
        String a3 = a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
        }
        return sb.toString();
    }

    @VisibleForTesting
    private static String a(boolean z, Object obj) {
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str2 = "-";
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = str2;
            }
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String b = b(Mb.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (!stackTraceElement.isNativeMethod()) {
                        String className = stackTraceElement.getClassName();
                        if (className != null && b(className).equals(b)) {
                            sb2.append(": ");
                            sb2.append(stackTraceElement);
                            break;
                        }
                    }
                    i2++;
                }
                return sb2.toString();
            } else if (obj instanceof C1129jb) {
                return ((C1129jb) obj).a;
            } else {
                if (z) {
                    return str2;
                }
                return String.valueOf(obj);
            }
        }
    }

    public final /* bridge */ /* synthetic */ be a() {
        return super.a();
    }
}
