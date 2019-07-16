package com.soundcloud.android.cast;

import java.util.List;

/* compiled from: CastQueueController */
public class r {
    private C3261sS a;

    private C4928GKa<String> c() {
        C3261sS sSVar = this.a;
        return sSVar == null ? C4928GKa.a() : sSVar.h();
    }

    public void a(C3261sS sSVar) {
        this.a = sSVar;
    }

    public C3508cda b() {
        C3261sS sSVar = this.a;
        return sSVar != null ? sSVar.c() : C3508cda.a;
    }

    public C3261sS a(C3508cda cda, List<C3508cda> list) {
        return C3261sS.a(c(), cda, list);
    }

    public C3261sS a() {
        return this.a;
    }

    public boolean a(C3508cda cda) {
        C3508cda b = b();
        return b != C3508cda.a && b.equals(cda);
    }

    public C3261sS a(C3508cda cda, long j) {
        return C3261sS.a(cda, j, this.a);
    }
}
