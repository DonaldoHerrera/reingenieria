package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.H;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AvcConfig */
public final class h {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    private h(List<byte[]> list, int i, int i2, int i3, float f) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    public static h a(Pq pq) throws H {
        float f;
        int i;
        int i2;
        try {
            pq.f(4);
            int t = (pq.t() & 3) + 1;
            if (t != 3) {
                ArrayList arrayList = new ArrayList();
                int t2 = pq.t() & 31;
                for (int i3 = 0; i3 < t2; i3++) {
                    arrayList.add(b(pq));
                }
                int t3 = pq.t();
                for (int i4 = 0; i4 < t3; i4++) {
                    arrayList.add(b(pq));
                }
                if (t2 > 0) {
                    b b2 = Mq.b((byte[]) arrayList.get(0), t, ((byte[]) arrayList.get(0)).length);
                    int i5 = b2.e;
                    int i6 = b2.f;
                    f = b2.g;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                h hVar = new h(arrayList, t, i2, i, f);
                return hVar;
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new H("Error parsing AVC config", e2);
        }
    }

    private static byte[] b(Pq pq) {
        int z = pq.z();
        int c2 = pq.c();
        pq.f(z);
        return C1912zq.a(pq.a, c2, z);
    }
}
