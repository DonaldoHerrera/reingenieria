package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.H;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Lp reason: default package */
/* compiled from: WebvttDecoder */
public final class Lp extends Vo {
    private final Kp o = new Kp();
    private final Pq p = new Pq();
    private final a q = new a();
    private final Ep r = new Ep();
    private final List<Hp> s = new ArrayList();

    public Lp() {
        super("WebvttDecoder");
    }

    private static void b(Pq pq) {
        do {
        } while (!TextUtils.isEmpty(pq.j()));
    }

    /* access modifiers changed from: protected */
    public Np a(byte[] bArr, int i, boolean z) throws Zo {
        this.p.a(bArr, i);
        this.q.b();
        this.s.clear();
        try {
            Mp.b(this.p);
            do {
            } while (!TextUtils.isEmpty(this.p.j()));
            ArrayList arrayList = new ArrayList();
            while (true) {
                int a = a(this.p);
                if (a == 0) {
                    return new Np(arrayList);
                }
                if (a == 1) {
                    b(this.p);
                } else if (a == 2) {
                    if (arrayList.isEmpty()) {
                        this.p.j();
                        Hp a2 = this.r.a(this.p);
                        if (a2 != null) {
                            this.s.add(a2);
                        }
                    } else {
                        throw new Zo("A style block was found after the first cue.");
                    }
                } else if (a == 3 && this.o.a(this.p, this.q, this.s)) {
                    arrayList.add(this.q.a());
                    this.q.b();
                }
            }
        } catch (H e) {
            throw new Zo((Exception) e);
        }
    }

    private static int a(Pq pq) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = pq.c();
            String j = pq.j();
            i = j == null ? 0 : "STYLE".equals(j) ? 2 : j.startsWith("NOTE") ? 1 : 3;
        }
        pq.e(i2);
        return i;
    }
}
