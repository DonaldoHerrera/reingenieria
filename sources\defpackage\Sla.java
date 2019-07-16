package defpackage;

import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.d;

/* renamed from: Sla reason: default package */
/* compiled from: FlipperAdapter.kt */
final class Sla extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ Nla a;
    final /* synthetic */ C4600kma b;

    Sla(Nla nla, C4600kma kma) {
        this.a = nla;
        this.b = kma;
        super(0);
    }

    public final void d() {
        PlaybackItem a2 = this.a.d;
        if (a2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Current playback item is null! Cannot report state ");
            sb.append(this.b);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (this.a.a(this.b.g())) {
            Nla nla = this.a;
            nla.a(this.b, a2, nla.g ? this.a.i : this.b.d());
        } else {
            d b2 = this.a.l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("State reported for a different playing uri: ");
            sb2.append(this.b);
            b2.b("FlipperAdapter", sb2.toString());
        }
    }
}
