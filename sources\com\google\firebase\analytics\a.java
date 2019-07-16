package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.If;
import com.google.android.gms.measurement.internal.C1165qc;
import com.google.android.gms.measurement.internal.Lc;
import java.util.List;
import java.util.Map;

final class a implements Lc {
    private final /* synthetic */ If a;

    a(If ifR) {
        this.a = ifR;
    }

    public final void a(String str, String str2, Bundle bundle) {
        this.a.b(str, str2, bundle);
    }

    public final String b() {
        return this.a.c();
    }

    public final String c() {
        return this.a.d();
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.a.a(str, str2, bundle);
    }

    public final long d() {
        return this.a.a();
    }

    public final String e() {
        return this.a.b();
    }

    public final void setDataCollectionEnabled(boolean z) {
        this.a.a(z);
    }

    public final void a(String str, String str2, Object obj) {
        this.a.a(str, str2, obj);
    }

    public final void b(String str) {
        this.a.a(str);
    }

    public final void c(String str) {
        this.a.b(str);
    }

    public final Map<String, Object> a(String str, String str2, boolean z) {
        return this.a.a(str, str2, z);
    }

    public final void a(C1165qc qcVar) {
        this.a.a(qcVar);
    }

    public final String a() {
        return this.a.e();
    }

    public final void a(Bundle bundle) {
        this.a.a(bundle);
    }

    public final List<Bundle> a(String str, String str2) {
        return this.a.a(str, str2);
    }

    public final int a(String str) {
        return this.a.c(str);
    }
}
