package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: lp reason: default package and case insensitive filesystem */
/* compiled from: CeaSubtitle */
final class C1488lp implements Xo {
    private final List<Uo> a;

    public C1488lp(List<Uo> list) {
        this.a = list;
    }

    public int a() {
        return 1;
    }

    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    public long a(int i) {
        C1852xq.a(i == 0);
        return 0;
    }

    public List<Uo> b(long j) {
        return j >= 0 ? this.a : Collections.emptyList();
    }
}
