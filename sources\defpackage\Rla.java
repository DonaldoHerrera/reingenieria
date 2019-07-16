package defpackage;

import com.soundcloud.android.playback.core.d;

/* renamed from: Rla reason: default package */
/* compiled from: FlipperAdapter.kt */
final class Rla extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ Nla a;
    final /* synthetic */ C4592jma b;

    Rla(Nla nla, C4592jma jma) {
        this.a = nla;
        this.b = jma;
        super(0);
    }

    public final void d() {
        if (this.a.a(this.b.c())) {
            this.a.g = this.b.a();
            if (this.a.g) {
                this.a.i = this.b.b();
                return;
            }
            return;
        }
        d b2 = this.a.l;
        StringBuilder sb = new StringBuilder();
        sb.append("onSeekingStatusChanged for a different playing uri: ");
        sb.append(this.b);
        b2.b("FlipperAdapter", sb.toString());
    }
}
