package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Q;

/* compiled from: TrackSelectorResult */
public final class p {
    public final int a;
    public final Q[] b;
    public final m c;
    public final Object d;

    public p(Q[] qArr, l[] lVarArr, Object obj) {
        this.b = qArr;
        this.c = new m(lVarArr);
        this.d = obj;
        this.a = qArr.length;
    }

    public boolean a(int i) {
        return this.b[i] != null;
    }

    public boolean a(p pVar) {
        if (pVar == null || pVar.c.a != this.c.a) {
            return false;
        }
        for (int i = 0; i < this.c.a; i++) {
            if (!a(pVar, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean a(p pVar, int i) {
        boolean z = false;
        if (pVar == null) {
            return false;
        }
        if (C0471ar.a((Object) this.b[i], (Object) pVar.b[i]) && C0471ar.a((Object) this.c.a(i), (Object) pVar.c.a(i))) {
            z = true;
        }
        return z;
    }
}
