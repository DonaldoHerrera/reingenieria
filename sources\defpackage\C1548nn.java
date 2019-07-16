package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.H;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Collections;

/* renamed from: nn reason: default package and case insensitive filesystem */
/* compiled from: AudioTagPayloadReader */
final class C1548nn extends C1640qn {
    private static final int[] b = {5512, 11025, 22050, 44100};
    private boolean c;
    private boolean d;
    private int e;

    public C1548nn(C1424jn jnVar) {
        super(jnVar);
    }

    /* access modifiers changed from: protected */
    public boolean a(Pq pq) throws a {
        if (!this.c) {
            int t = pq.t();
            this.e = (t >> 4) & 15;
            int i = this.e;
            if (i == 2) {
                this.a.a(Format.a(null, "audio/mpeg", null, -1, -1, 1, b[(t >> 2) & 3], null, null, 0, null));
                this.d = true;
            } else if (i == 7 || i == 8) {
                this.a.a(Format.a((String) null, this.e == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", (String) null, -1, -1, 1, 8000, (t & 1) == 1 ? 2 : 3, null, (DrmInitData) null, 0, (String) null));
                this.d = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder();
                sb.append("Audio format not supported: ");
                sb.append(this.e);
                throw new a(sb.toString());
            }
            this.c = true;
        } else {
            pq.f(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void b(Pq pq, long j) throws H {
        Pq pq2 = pq;
        if (this.e == 2) {
            int a = pq.a();
            this.a.a(pq2, a);
            this.a.a(j, 1, a, 0, null);
            return;
        }
        int t = pq.t();
        if (t == 0 && !this.d) {
            byte[] bArr = new byte[pq.a()];
            pq2.a(bArr, 0, bArr.length);
            Pair a2 = C1912zq.a(bArr);
            this.a.a(Format.a(null, "audio/mp4a-latm", null, -1, -1, ((Integer) a2.second).intValue(), ((Integer) a2.first).intValue(), Collections.singletonList(bArr), null, 0, null));
            this.d = true;
        } else if (this.e != 10 || t == 1) {
            int a3 = pq.a();
            this.a.a(pq2, a3);
            this.a.a(j, 1, a3, 0, null);
        }
    }
}
