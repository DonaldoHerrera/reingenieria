package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.H;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.video.h;

/* renamed from: rn reason: default package and case insensitive filesystem */
/* compiled from: VideoTagPayloadReader */
final class C1669rn extends C1640qn {
    private final Pq b = new Pq(Mq.a);
    private final Pq c = new Pq(4);
    private int d;
    private boolean e;
    private int f;

    public C1669rn(C1424jn jnVar) {
        super(jnVar);
    }

    /* access modifiers changed from: protected */
    public boolean a(Pq pq) throws a {
        int t = pq.t();
        int i = (t >> 4) & 15;
        int i2 = t & 15;
        if (i2 == 7) {
            this.f = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new a(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void b(Pq pq, long j) throws H {
        int t = pq.t();
        long i = j + (((long) pq.i()) * 1000);
        if (t == 0 && !this.e) {
            Pq pq2 = new Pq(new byte[pq.a()]);
            pq.a(pq2.a, 0, pq.a());
            h a = h.a(pq2);
            this.d = a.b;
            this.a.a(Format.a((String) null, "video/avc", (String) null, -1, -1, a.c, a.d, -1.0f, a.a, -1, a.e, (DrmInitData) null));
            this.e = true;
        } else if (t == 1 && this.e) {
            byte[] bArr = this.c.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i2 = 4 - this.d;
            int i3 = 0;
            while (pq.a() > 0) {
                pq.a(this.c.a, i2, this.d);
                this.c.e(0);
                int x = this.c.x();
                this.b.e(0);
                this.a.a(this.b, 4);
                int i4 = i3 + 4;
                this.a.a(pq, x);
                i3 = i4 + x;
            }
            this.a.a(i, this.f == 1 ? 1 : 0, i3, 0, null);
        }
    }
}
