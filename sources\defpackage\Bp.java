package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: Bp reason: default package */
/* compiled from: TtmlSubtitle */
final class Bp implements Xo {
    private final C1851xp a;
    private final long[] b;
    private final Map<String, Ap> c;
    private final Map<String, C1881yp> d;
    private final Map<String, String> e;

    public Bp(C1851xp xpVar, Map<String, Ap> map, Map<String, C1881yp> map2, Map<String, String> map3) {
        this.a = xpVar;
        this.d = map2;
        this.e = map3;
        this.c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.b = xpVar.b();
    }

    public int a(long j) {
        int a2 = C0471ar.a(this.b, j, false, false);
        if (a2 < this.b.length) {
            return a2;
        }
        return -1;
    }

    public List<Uo> b(long j) {
        return this.a.a(j, this.c, this.d, this.e);
    }

    public int a() {
        return this.b.length;
    }

    public long a(int i) {
        return this.b[i];
    }
}
