package defpackage;

import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.d;
import com.soundcloud.android.playback.core.k.c;

/* renamed from: Qla reason: default package */
/* compiled from: FlipperAdapter.kt */
final class Qla extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ Nla a;
    final /* synthetic */ C4576hma b;

    Qla(Nla nla, C4576hma hma) {
        this.a = nla;
        this.b = hma;
        super(0);
    }

    public final void d() {
        PlaybackItem a2 = this.a.d;
        if (a2 == null || !this.a.a(this.b.c()) || this.a.g) {
            d b2 = this.a.l;
            StringBuilder sb = new StringBuilder();
            sb.append("Progress reported (");
            sb.append(this.b);
            sb.append(", isSeekPending=");
            sb.append(this.a.g);
            sb.append(") but ignored for playbackItem = ");
            sb.append(a2);
            b2.c("FlipperAdapter", sb.toString());
            return;
        }
        this.a.i = this.b.b();
        c c = this.a.e;
        if (c != null) {
            Ila ila = new Ila(a2, this.b.b(), this.b.a());
            c.a(ila);
        }
    }
}
