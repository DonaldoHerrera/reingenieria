package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: vp reason: default package and case insensitive filesystem */
/* compiled from: SubripSubtitle */
final class C1791vp implements Xo {
    private final Uo[] a;
    private final long[] b;

    public C1791vp(Uo[] uoArr, long[] jArr) {
        this.a = uoArr;
        this.b = jArr;
    }

    public int a(long j) {
        int a2 = C0471ar.a(this.b, j, false, false);
        if (a2 < this.b.length) {
            return a2;
        }
        return -1;
    }

    public List<Uo> b(long j) {
        int b2 = C0471ar.b(this.b, j, true, false);
        if (b2 != -1) {
            Uo[] uoArr = this.a;
            if (uoArr[b2] != null) {
                return Collections.singletonList(uoArr[b2]);
            }
        }
        return Collections.emptyList();
    }

    public int a() {
        return this.b.length;
    }

    public long a(int i) {
        boolean z = true;
        C1852xq.a(i >= 0);
        if (i >= this.b.length) {
            z = false;
        }
        C1852xq.a(z);
        return this.b[i];
    }
}
