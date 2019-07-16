package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: xF reason: default package and case insensitive filesystem */
/* compiled from: ReedSolomonEncoder */
public final class C3348xF {
    private final C3308vF a;
    private final List<C3328wF> b = new ArrayList();

    public C3348xF(C3308vF vFVar) {
        this.a = vFVar;
        this.b.add(new C3328wF(vFVar, new int[]{1}));
    }

    private C3328wF a(int i) {
        if (i >= this.b.size()) {
            List<C3328wF> list = this.b;
            C3328wF wFVar = (C3328wF) list.get(list.size() - 1);
            for (int size = this.b.size(); size <= i; size++) {
                C3308vF vFVar = this.a;
                wFVar = wFVar.c(new C3328wF(vFVar, new int[]{1, vFVar.a((size - 1) + vFVar.a())}));
                this.b.add(wFVar);
            }
        }
        return (C3328wF) this.b.get(i);
    }

    public void a(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                C3328wF a2 = a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] a3 = new C3328wF(this.a, iArr2).a(i, 1).b(a2)[1].a();
                int length2 = i - a3.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(a3, 0, iArr, length + length2, a3.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
