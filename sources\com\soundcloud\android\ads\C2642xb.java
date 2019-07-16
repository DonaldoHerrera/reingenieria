package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.J;

/* renamed from: com.soundcloud.android.ads.xb reason: case insensitive filesystem */
/* compiled from: DefaultForceAdTestingIdRepository.kt */
public class C2642xb implements J {
    private String a;
    private String b;
    private Boolean c;
    private final C2436_U d;

    public C2642xb(C2436_U _u) {
        C7471uYa.b(_u, "featureOperations");
        this.d = _u;
    }

    public void a(String str) {
        this.b = str;
    }

    public void b(String str) {
        this.a = str;
    }

    public Boolean c() {
        return this.c;
    }

    public void clear() {
        b(null);
        a((String) null);
        a((Boolean) null);
    }

    public boolean d() {
        boolean p = f().p();
        String e = e();
        boolean z = false;
        boolean z2 = p & (!(e == null || Cxb.a(e)));
        String b2 = b();
        if (b2 == null || Cxb.a(b2)) {
            z = true;
        }
        return z2 & (!z);
    }

    public String e() {
        return this.a;
    }

    public C2436_U f() {
        return this.d;
    }

    public void a(Boolean bool) {
        this.c = bool;
    }

    public String b() {
        return this.b;
    }

    public boolean a() {
        if (f().p()) {
            Boolean c2 = c();
            if (c2 != null && !c2.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
