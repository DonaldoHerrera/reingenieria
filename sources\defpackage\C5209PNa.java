package defpackage;

import android.os.Process;

/* renamed from: PNa reason: default package and case insensitive filesystem */
/* compiled from: AsyncTask */
class C5209PNa extends e<Params, Result> {
    final /* synthetic */ C5299SNa b;

    C5209PNa(C5299SNa sNa) {
        this.b = sNa;
        super(null);
    }

    public Result call() throws Exception {
        this.b.n.set(true);
        Process.setThreadPriority(10);
        C5299SNa sNa = this.b;
        Result a = sNa.a(this.a);
        sNa.e(a);
        return a;
    }
}
