package com.soundcloud.android.playback.widget;

import android.content.Context;
import com.soundcloud.android.collections.data.J;
import com.soundcloud.android.foundation.events.C;
import com.soundcloud.android.foundation.events.C.a;
import com.soundcloud.android.foundation.events.C3707i;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.K.h;
import com.soundcloud.android.foundation.playqueue.k;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.likes.C3983h;
import com.soundcloud.android.playback.C4416rb;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.Ca;
import java.util.Map;

/* compiled from: PlayerWidgetController */
public class l {
    public static final String a;
    private final Context b;
    private final w c;
    private final C4416rb d;
    private final C3814lca e;
    private final Ca f;
    private final C3983h g;
    private final C2390YL h;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C5292SGa.a());
        sb.append(".widgetLike");
        a = sb.toString();
    }

    public l(Context context, w wVar, C4416rb rbVar, C3814lca lca, Ca ca, C3983h hVar, C2390YL yl) {
        this.b = context;
        this.c = wVar;
        this.d = rbVar;
        this.e = lca;
        this.f = ca;
        this.g = hVar;
        this.h = yl;
    }

    static /* synthetic */ C6185ma a(C6185ma maVar) throws Exception {
        return maVar;
    }

    private C3710l b() {
        return C3710l.a(Yca.WIDGET);
    }

    static /* synthetic */ C6185ma b(C6185ma maVar) throws Exception {
        return maVar;
    }

    private void c() {
        this.c.a(this.b, this.d.isPlaying());
    }

    static /* synthetic */ boolean c(C6185ma maVar) throws Exception {
        return maVar != null;
    }

    public void a() {
        c();
        a((C7118pQa<C6185ma, C6185ma>) C4522b.a);
    }

    public /* synthetic */ void d(C6185ma maVar) throws Exception {
        this.c.a(this.b, maVar);
    }

    private void a(C7118pQa<C6185ma, C6185ma> pqa) {
        q h2 = this.e.h();
        if (h2.f()) {
            this.c.b(this.b);
        } else if (h2.k()) {
            this.c.c(this.b);
        } else if (h2.j()) {
            this.f.c(h2.c()).a((C7256rQa<? super T>) C4521a.a).f(pqa).a((C7600wPa<? super T>) C5190Oua.a(new e(this)));
        } else {
            this.c.a(this.b);
        }
    }

    public void a(boolean z) {
        q h2 = this.e.h();
        if (h2.j()) {
            C3508cda c2 = h2.c();
            this.g.b(c2, z);
            this.h.a(c2, z, b(), this.e.a(c2), h.WIDGET);
            return;
        }
        C7316sHa.d(new IllegalStateException("Tried to like a track from widget with invalid playQueue item"));
    }

    /* access modifiers changed from: 0000 */
    public void a(C3707i iVar) {
        if (iVar.d()) {
            this.c.a(this.b);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(C4431ub ubVar) {
        this.c.a(this.b, ubVar.p());
    }

    /* access modifiers changed from: 0000 */
    public void a(k kVar) {
        a((C7118pQa<C6185ma, C6185ma>) f.a);
    }

    /* access modifiers changed from: 0000 */
    public void a(Uaa uaa) {
        if (!this.e.x()) {
            for (C3509cea cea : uaa.a().values()) {
                if (this.e.e(cea.y())) {
                    a((C7118pQa<C6185ma, C6185ma>) new d<C6185ma,C6185ma>(cea));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Map<C3508cda, J> map) {
        C4928GKa g2 = this.e.g();
        if (g2.c() && ((C3508cda) g2.b()).x() && map.containsKey(g2.b())) {
            a((C7118pQa<C6185ma, C6185ma>) new g<C6185ma,C6185ma>(map, g2));
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(C c2) {
        C4928GKa g2 = this.e.g();
        if (g2.c() && ((C3508cda) g2.b()).x()) {
            a a2 = C3884uaa.a(c2, (C3508cda) g2.b());
            if (a2 != null) {
                a((C7118pQa<C6185ma, C6185ma>) new c<C6185ma,C6185ma>(a2));
            }
        }
    }
}
