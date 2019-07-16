package defpackage;

import android.content.ContentValues;

/* renamed from: yT reason: default package and case insensitive filesystem */
/* compiled from: StoreCommentCommand */
public class C3382yT extends C1286fT<C3282tT, C6431fLa> {
    /* access modifiers changed from: private */
    public final C3800jea b;
    /* access modifiers changed from: private */
    public long c = -1;

    public C3382yT(C5500ZKa zKa, C3800jea jea) {
        super(zKa);
        this.b = jea;
    }

    /* access modifiers changed from: private */
    public static ContentValues b(C3282tT tTVar) {
        C5296SKa b2 = C5296SKa.b();
        b2.a(a.e, tTVar.a().toString());
        b2.a(a.g, tTVar.h().c());
        b2.a(a.f, tTVar.d().l().c());
        b2.a(a.j, tTVar.f());
        b2.a(a.i, tTVar.b().getTime());
        tTVar.g().a((C7733yKa<? super T>) new C3222qT<Object>(b2));
        return b2.a();
    }

    public long d() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public C6431fLa a(C5500ZKa zKa, C3282tT tTVar) {
        return zKa.a((a) new C3362xT(this, tTVar));
    }
}
