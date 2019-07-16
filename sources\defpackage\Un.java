package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.H;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: Un reason: default package */
/* compiled from: VorbisReader */
final class Un extends Sn {
    private a n;
    private int o;
    private boolean p;
    private d q;
    private b r;

    /* renamed from: Un$a */
    /* compiled from: VorbisReader */
    static final class a {
        public final d a;
        public final b b;
        public final byte[] c;
        public final c[] d;
        public final int e;

        public a(d dVar, b bVar, byte[] bArr, c[] cVarArr, int i) {
            this.a = dVar;
            this.b = bVar;
            this.c = bArr;
            this.d = cVarArr;
            this.e = i;
        }
    }

    Un() {
    }

    static int a(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static boolean c(Pq pq) {
        try {
            return Vn.a(1, pq, true);
        } catch (H unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    /* access modifiers changed from: 0000 */
    public a b(Pq pq) throws IOException {
        if (this.q == null) {
            this.q = Vn.b(pq);
            return null;
        } else if (this.r == null) {
            this.r = Vn.a(pq);
            return null;
        } else {
            byte[] bArr = new byte[pq.d()];
            System.arraycopy(pq.a, 0, bArr, 0, pq.d());
            c[] a2 = Vn.a(pq, this.q.b);
            a aVar = new a(this.q, this.r, bArr, a2, Vn.a(a2.length - 1));
            return aVar;
        }
    }

    /* access modifiers changed from: protected */
    public void c(long j) {
        super.c(j);
        int i = 0;
        this.p = j != 0;
        d dVar = this.q;
        if (dVar != null) {
            i = dVar.g;
        }
        this.o = i;
    }

    /* access modifiers changed from: protected */
    public long a(Pq pq) {
        byte[] bArr = pq.a;
        int i = 0;
        if ((bArr[0] & 1) == 1) {
            return -1;
        }
        int a2 = a(bArr[0], this.n);
        if (this.p) {
            i = (this.o + a2) / 4;
        }
        long j = (long) i;
        a(pq, j);
        this.p = true;
        this.o = a2;
        return j;
    }

    /* access modifiers changed from: protected */
    public boolean a(Pq pq, long j, a aVar) throws IOException, InterruptedException {
        if (this.n != null) {
            return false;
        }
        this.n = b(pq);
        if (this.n == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.n.a.j);
        arrayList.add(this.n.c);
        d dVar = this.n.a;
        aVar.a = Format.a(null, "audio/vorbis", null, dVar.e, -1, dVar.b, (int) dVar.c, arrayList, null, 0, null);
        return true;
    }

    static void a(Pq pq, long j) {
        pq.d(pq.d() + 4);
        pq.a[pq.d() - 4] = (byte) ((int) (j & 255));
        pq.a[pq.d() - 3] = (byte) ((int) ((j >>> 8) & 255));
        pq.a[pq.d() - 2] = (byte) ((int) ((j >>> 16) & 255));
        pq.a[pq.d() - 1] = (byte) ((int) ((j >>> 24) & 255));
    }

    private static int a(byte b, a aVar) {
        if (!aVar.d[a(b, aVar.e, 1)].a) {
            return aVar.a.g;
        }
        return aVar.a.h;
    }
}
