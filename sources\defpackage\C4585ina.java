package defpackage;

import com.soundcloud.android.playback.core.d;

/* renamed from: ina reason: default package and case insensitive filesystem */
/* compiled from: PlaybackManager.kt */
final class C4585ina<T> implements C6776kQa<C4633ona> {
    final /* synthetic */ C3968cna a;
    final /* synthetic */ boolean b;

    C4585ina(C3968cna cna, boolean z) {
        this.a = cna;
        this.b = z;
    }

    /* renamed from: a */
    public final void accept(C4633ona ona) {
        if (ona instanceof c) {
            if (this.b) {
                this.a.d.onPlay();
            }
            this.a.f.a(((c) ona).a());
        } else if (ona instanceof a) {
            d a2 = this.a.g;
            StringBuilder sb = new StringBuilder();
            a aVar = (a) ona;
            sb.append(aVar.a());
            sb.append(" as reaction to PlaybackItem fetch failed");
            String str = "PlaybackManager";
            a2.b(str, sb.toString());
            b a3 = aVar.a();
            if (a3 instanceof C0136b) {
                this.a.f.pause();
            } else if (a3 instanceof c) {
                C4677tna a4 = this.a.e.a(C4686una.FailureReaction);
                if (C7471uYa.a((Object) a4, (Object) b.a)) {
                    C3968cna.a(this.a, false, null, 3, null);
                } else if (C7471uYa.a((Object) a4, (Object) a.a)) {
                    this.a.g.b(str, "Did not skip after FailureReaction. Stopping playback instance.");
                    this.a.f.stop();
                    this.a.d.onStop();
                }
            } else {
                boolean z = a3 instanceof a;
            }
        }
    }
}
