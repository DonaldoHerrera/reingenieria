package defpackage;

import java.io.IOException;

/* renamed from: oP reason: default package and case insensitive filesystem */
/* compiled from: ProgressRequestBody */
class C3180oP extends C7854zyb {
    private final C7854zyb a;
    /* access modifiers changed from: private */
    public final d b;

    public C3180oP(C7854zyb zyb, d dVar) {
        this.a = zyb;
        this.b = dVar;
    }

    public C7233qyb b() {
        return this.a.b();
    }

    public long a() throws IOException {
        return this.a.a();
    }

    public void a(C6893mAb mab) throws IOException {
        C6893mAb a2 = C7720yAb.a((GAb) new C3151nP(this, mab, a()));
        this.a.a(a2);
        a2.flush();
    }
}
