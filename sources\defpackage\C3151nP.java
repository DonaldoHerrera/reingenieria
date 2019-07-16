package defpackage;

import java.io.IOException;

/* renamed from: nP reason: default package and case insensitive filesystem */
/* compiled from: ProgressRequestBody */
class C3151nP extends C7099pAb {
    private long b;
    final /* synthetic */ long c;
    final /* synthetic */ C3180oP d;

    C3151nP(C3180oP oPVar, GAb gAb, long j) {
        this.d = oPVar;
        this.c = j;
        super(gAb);
    }

    public void a(C6825lAb lab, long j) throws IOException {
        this.b += j;
        this.d.b.a(this.b, this.c);
        super.a(lab, j);
    }
}
