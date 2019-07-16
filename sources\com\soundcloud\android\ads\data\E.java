package com.soundcloud.android.ads.data;

import androidx.room.C;
import androidx.room.C0433b;
import androidx.room.C0434c;
import androidx.room.t;
import androidx.room.w;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: VideoAdsDao_Impl */
public final class E extends v {
    /* access modifiers changed from: private */
    public final t a;
    private final C0434c b;
    /* access modifiers changed from: private */
    public final C2561e c = new C2561e();
    private final C0433b d;
    private final C e;
    private final C f;

    public E(t tVar) {
        this.a = tVar;
        this.b = new z(this, tVar);
        this.d = new A(this, tVar);
        this.e = new B(this, tVar);
        this.f = new C(this, tVar);
    }

    public void a(h hVar) {
        this.a.b();
        this.a.c();
        try {
            this.d.a(hVar);
            this.a.m();
        } finally {
            this.a.e();
        }
    }

    public void b(h hVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.a(hVar);
            this.a.m();
        } finally {
            this.a.e();
        }
    }

    public void a(long j, int i) {
        this.a.b();
        Yd a2 = this.e.a();
        a2.a(1, j);
        a2.a(2, (long) i);
        this.a.c();
        try {
            a2.v();
            this.a.m();
        } finally {
            this.a.e();
            this.e.a(a2);
        }
    }

    public IPa<List<h>> b(long j, int i) {
        w a2 = w.a("SELECT * FROM videoAds WHERE (expiryTimestamp > ? AND appVersion = ?) ORDER BY expiryTimestamp ASC", 2);
        a2.a(1, j);
        a2.a(2, (long) i);
        return IPa.c((Callable<? extends T>) new D<Object>(this, a2));
    }

    public void a() {
        this.a.b();
        Yd a2 = this.f.a();
        this.a.c();
        try {
            a2.v();
            this.a.m();
        } finally {
            this.a.e();
            this.f.a(a2);
        }
    }
}
