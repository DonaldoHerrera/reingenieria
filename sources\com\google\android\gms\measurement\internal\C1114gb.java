package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.gb reason: case insensitive filesystem */
public final class C1114gb extends C1120hc {
    private static final AtomicReference<String[]> c = new AtomicReference<>();
    private static final AtomicReference<String[]> d = new AtomicReference<>();
    private static final AtomicReference<String[]> e = new AtomicReference<>();

    C1114gb(Mb mb) {
        super(mb);
    }

    private final boolean s() {
        a();
        return this.a.l() && this.a.e().a(3);
    }

    /* access modifiers changed from: protected */
    public final String a(String str) {
        if (str == null) {
            return null;
        }
        if (!s()) {
            return str;
        }
        return a(str, C1145mc.b, C1145mc.a, c);
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        if (str == null) {
            return null;
        }
        if (!s()) {
            return str;
        }
        return a(str, C1140lc.b, C1140lc.a, d);
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!s()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return a(str, C1155oc.b, C1155oc.a, e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("experiment_id");
        sb.append("(");
        sb.append(str);
        sb.append(")");
        return sb.toString();
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

    private static String a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Vd.e(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strArr2[i]);
                        sb.append("(");
                        sb.append(strArr[i]);
                        sb.append(")");
                        strArr3[i] = sb.toString();
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    public final /* bridge */ /* synthetic */ C1168rb b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ Clock c() {
        return super.c();
    }

    /* access modifiers changed from: protected */
    public final String a(zzai zzai) {
        if (zzai == null) {
            return null;
        }
        if (!s()) {
            return zzai.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzai.c);
        sb.append(",name=");
        sb.append(a(zzai.a));
        sb.append(",params=");
        sb.append(a(zzai.b));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(C1112g gVar) {
        if (gVar == null) {
            return null;
        }
        if (!s()) {
            return gVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Event{appId='");
        sb.append(gVar.a);
        sb.append("', name='");
        sb.append(a(gVar.b));
        sb.append("', params=");
        sb.append(a(gVar.f));
        sb.append("}");
        return sb.toString();
    }

    private final String a(zzah zzah) {
        if (zzah == null) {
            return null;
        }
        if (!s()) {
            return zzah.toString();
        }
        return a(zzah.i());
    }

    /* access modifiers changed from: protected */
    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!s()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (sb.length() != 0) {
                sb.append(", ");
            } else {
                sb.append("Bundle[{");
            }
            sb.append(b(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ be a() {
        return super.a();
    }
}
