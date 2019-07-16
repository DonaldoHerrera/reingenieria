package com.facebook.internal;

import com.facebook.GraphRequest.b;
import com.facebook.L;
import com.facebook.internal.ia.a;

/* compiled from: Utility */
class ga implements b {
    final /* synthetic */ a a;
    final /* synthetic */ String b;

    ga(a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    public void a(L l) {
        if (l.a() != null) {
            this.a.a(l.a().e());
            return;
        }
        ca.a(this.b, l.b());
        this.a.a(l.b());
    }
}
