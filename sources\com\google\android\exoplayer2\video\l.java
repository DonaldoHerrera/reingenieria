package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.H;
import java.util.Collections;
import java.util.List;

/* compiled from: HevcConfig */
public final class l {
    public final List<byte[]> a;
    public final int b;

    private l(List<byte[]> list, int i) {
        this.a = list;
        this.b = i;
    }

    public static l a(Pq pq) throws H {
        List list;
        try {
            pq.f(21);
            int t = pq.t() & 3;
            int t2 = pq.t();
            int c = pq.c();
            int i = 0;
            int i2 = 0;
            while (i < t2) {
                pq.f(1);
                int z = pq.z();
                int i3 = i2;
                for (int i4 = 0; i4 < z; i4++) {
                    int z2 = pq.z();
                    i3 += z2 + 4;
                    pq.f(z2);
                }
                i++;
                i2 = i3;
            }
            pq.e(c);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            int i6 = 0;
            while (i5 < t2) {
                pq.f(1);
                int z3 = pq.z();
                int i7 = i6;
                for (int i8 = 0; i8 < z3; i8++) {
                    int z4 = pq.z();
                    System.arraycopy(Mq.a, 0, bArr, i7, Mq.a.length);
                    int length = i7 + Mq.a.length;
                    System.arraycopy(pq.a, pq.c(), bArr, length, z4);
                    i7 = length + z4;
                    pq.f(z4);
                }
                i5++;
                i6 = i7;
            }
            if (i2 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new l(list, t + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new H("Error parsing HEVC config", e);
        }
    }
}
