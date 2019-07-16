package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: Gp reason: default package */
/* compiled from: Mp4WebvttSubtitle */
final class Gp implements Xo {
    private final List<Uo> a;

    public Gp(List<Uo> list) {
        this.a = Collections.unmodifiableList(list);
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
