package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: Dp reason: default package */
/* compiled from: Tx3gSubtitle */
final class Dp implements Xo {
    public static final Dp a = new Dp();
    private final List<Uo> b;

    public Dp(Uo uo) {
        this.b = Collections.singletonList(uo);
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
        return j >= 0 ? this.b : Collections.emptyList();
    }

    private Dp() {
        this.b = Collections.emptyList();
    }
}
