package com.soundcloud.android.playback;

import com.soundcloud.android.ads.Na;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.U;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;

/* renamed from: com.soundcloud.android.playback.xb reason: case insensitive filesystem */
/* compiled from: PlaybackAnalyticsController */
public class C4525xb {
    private final Jd a;
    private final A b;
    private final C3814lca c;
    private final Na d;
    private C4928GKa<C4519wc> e = C4928GKa.a();
    private Ba f = Ba.a;
    private boolean g;
    private C3508cda h;

    public C4525xb(Jd jd, A a2, C3814lca lca, Na na) {
        this.a = jd;
        this.b = a2;
        this.c = lca;
        this.d = na;
    }

    private C4535zb b(boolean z) {
        return z ? this.b : this.a;
    }

    private long c(boolean z) {
        if (this.e.c()) {
            return ((C4519wc) this.e.b()).d() + a(z);
        }
        return a(z);
    }

    private boolean d(boolean z) {
        return z && this.h != null && this.f.j();
    }

    /* access modifiers changed from: 0000 */
    public void a(Ba ba, boolean z) {
        C3508cda s = ba.s();
        C4535zb b2 = b(z);
        boolean z2 = !s.equals(this.f.s());
        if (z2) {
            a();
        }
        if (d(z2)) {
            b(this.g).a(this.f);
        }
        if (ba.j()) {
            if (z) {
                a(s, C4928GKa.b(this.d.a()));
            }
            b2.b(ba, z2);
        } else {
            b2.a(ba, z2);
        }
        this.f = ba;
        this.g = z;
        this.h = s;
    }

    public void a(C4519wc wcVar, boolean z) {
        if (wcVar.d() >= c(z)) {
            b(z).a(this.f, wcVar);
            this.e = C4928GKa.c(wcVar);
        }
        b(z).a(wcVar);
    }

    private void a() {
        PromotedSourceInfo h2 = this.c.i().h();
        if (h2 != null) {
            h2.f();
        }
        this.e = C4928GKa.a();
    }

    private long a(boolean z) {
        return z ? A.a : Jd.a;
    }

    private void a(C3508cda cda, C4928GKa<C3676c> gKa) {
        gKa.a((C7733yKa<? super T>) new C4319i<Object>(this, cda, gKa));
    }

    public /* synthetic */ void a(C3508cda cda, C4928GKa gKa, C3676c cVar) {
        if (!(cVar instanceof U)) {
            return;
        }
        if (cVar.f().equals(cda)) {
            this.b.a((U) gKa.b(), this.c.l());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot set ad metadata as urn ");
        sb.append(cVar.f());
        sb.append(" not playing. Currently playing: ");
        sb.append(cda);
        throw new IllegalStateException(sb.toString());
    }
}
