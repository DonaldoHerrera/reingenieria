package com.soundcloud.android.cast;

import com.google.android.gms.cast.framework.C0635c;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0638f;

/* compiled from: DefaultCastContextWrapper */
class B implements C2733g {
    private final C0635c a;

    B(C0635c cVar) {
        this.a = cVar;
    }

    public void a(C0638f fVar) {
        this.a.a(fVar);
    }

    public C4928GKa<C0636d> a() {
        try {
            return C4928GKa.b(this.a.c().a());
        } catch (RuntimeException e) {
            SDb.a("GoogleCast").a((Throwable) e, "Unable to get current cast session", new Object[0]);
            return C4928GKa.a();
        }
    }
}
