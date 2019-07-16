package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: Fp reason: default package */
/* compiled from: Mp4WebvttDecoder */
public final class Fp extends Vo {
    private static final int o = C0471ar.b("payl");
    private static final int p = C0471ar.b("sttg");
    private static final int q = C0471ar.b("vttc");
    private final Pq r = new Pq();
    private final a s = new a();

    public Fp() {
        super("Mp4WebvttDecoder");
    }

    /* access modifiers changed from: protected */
    public Gp a(byte[] bArr, int i, boolean z) throws Zo {
        this.r.a(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.r.a() > 0) {
            if (this.r.a() >= 8) {
                int h = this.r.h();
                if (this.r.h() == q) {
                    arrayList.add(a(this.r, this.s, h - 8));
                } else {
                    this.r.f(h - 8);
                }
            } else {
                throw new Zo("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new Gp(arrayList);
    }

    private static Uo a(Pq pq, a aVar, int i) throws Zo {
        aVar.b();
        while (i > 0) {
            if (i >= 8) {
                int h = pq.h();
                int h2 = pq.h();
                int i2 = i - 8;
                int i3 = h - 8;
                String a = C0471ar.a(pq.a, pq.c(), i3);
                pq.f(i3);
                i = i2 - i3;
                if (h2 == p) {
                    Kp.a(a, aVar);
                } else if (h2 == o) {
                    Kp.a((String) null, a.trim(), aVar, Collections.emptyList());
                }
            } else {
                throw new Zo("Incomplete vtt cue box header found.");
            }
        }
        return aVar.a();
    }
}
