package com.google.android.exoplayer2.extractor.mp4;

import java.util.UUID;

/* compiled from: PsshAtomUtil */
public final class l {

    /* compiled from: PsshAtomUtil */
    private static class a {
        /* access modifiers changed from: private */
        public final UUID a;
        private final int b;
        private final byte[] c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.a = uuid;
            this.b = i;
            this.c = bArr;
        }
    }

    public static UUID a(byte[] bArr) {
        a b = b(bArr);
        if (b == null) {
            return null;
        }
        return b.a;
    }

    private static a b(byte[] bArr) {
        Pq pq = new Pq(bArr);
        if (pq.d() < 32) {
            return null;
        }
        pq.e(0);
        if (pq.h() != pq.a() + 4 || pq.h() != c.ha) {
            return null;
        }
        int c = c.c(pq.h());
        if (c > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported pssh version: ");
            sb.append(c);
            Iq.d("PsshAtomUtil", sb.toString());
            return null;
        }
        UUID uuid = new UUID(pq.p(), pq.p());
        if (c == 1) {
            pq.f(pq.x() * 16);
        }
        int x = pq.x();
        if (x != pq.a()) {
            return null;
        }
        byte[] bArr2 = new byte[x];
        pq.a(bArr2, 0, x);
        return new a(uuid, c, bArr2);
    }
}
