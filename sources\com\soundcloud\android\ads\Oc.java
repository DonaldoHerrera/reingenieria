package com.soundcloud.android.ads;

import com.soundcloud.android.ads.data.g;
import com.soundcloud.android.ads.data.g.a;
import com.soundcloud.android.cast.C2732f;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.H;
import com.soundcloud.android.foundation.ads.M;
import com.soundcloud.android.foundation.ads.M.b;
import com.soundcloud.android.foundation.ads.Q;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.foundation.playqueue.C3719f;
import com.soundcloud.android.foundation.playqueue.F;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;
import com.soundcloud.android.foundation.playqueue.q;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PlayerVideoAdsController.kt */
public class Oc {
    private final C2436_U a;
    private final Ia b;
    private final C2732f c;
    private final C3760eea d;
    private final C2183NJ e;
    private final C5694cGa f;
    private final C2251QU g;
    private final C3814lca h;
    private final HPa i;

    public Oc(C2436_U _u, Ia ia, C2732f fVar, C3760eea eea, C2183NJ nj, C5694cGa cga, C2251QU qu, C3814lca lca, HPa hPa) {
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(ia, "adTimerHelper");
        C7471uYa.b(fVar, "castConnectionHelper");
        C7471uYa.b(eea, "trackRepository");
        C7471uYa.b(nj, "videoAdsRepository");
        C7471uYa.b(cga, "dateProvider");
        C7471uYa.b(qu, "playQueueVideoAdsExperiment");
        C7471uYa.b(lca, "playQueueManager");
        C7471uYa.b(hPa, "scheduler");
        this.a = _u;
        this.b = ia;
        this.c = fVar;
        this.d = eea;
        this.e = nj;
        this.f = cga;
        this.g = qu;
        this.h = lca;
        this.i = hPa;
    }

    public IPa<o> a(o oVar, C3508cda cda, int i2, PlaySessionSource playSessionSource) {
        C7471uYa.b(oVar, "playQueue");
        C7471uYa.b(cda, "initialTrackUrn");
        C7471uYa.b(playSessionSource, "playSessionSource");
        if (!this.g.a() || this.h.c(playSessionSource.d())) {
            IPa<o> a2 = IPa.a(oVar);
            C7471uYa.a((Object) a2, "Single.just(playQueue)");
            return a2;
        }
        IPa<o> a3 = IPa.c((Callable<? extends T>) new Kc<Object>(this)).b(this.i).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Lc<Object,Object>(this, cda)).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Mc<Object,Object>(this, oVar, cda, i2));
        C7471uYa.a((Object) a3, "Single.fromCallable { is…          }\n            }");
        return a3;
    }

    /* access modifiers changed from: private */
    public IPa<o> a(o oVar, C3508cda cda, int i2) {
        IPa<o> e2 = this.e.a().e(new Nc(this, oVar, cda, i2));
        C7471uYa.a((Object) e2, "videoAdsRepository.get()…          }\n            }");
        return e2;
    }

    /* access modifiers changed from: private */
    public List<q> a(o oVar, C3508cda cda, int i2, a aVar) {
        aa.a a2 = aVar.a();
        aa a3 = aa.e.a(a2, this.f.a(), cda);
        String str = "Required value was null.";
        if (a2.k() != null) {
            b bVar = M.g;
            M.a k = a2.k();
            if (k != null) {
                return a(a3, oVar, i2, (ca) bVar.a(k, cda, a2.d()));
            }
            throw new IllegalArgumentException(str);
        } else if (a2.l() != null) {
            Q.b bVar2 = Q.g;
            Q.a l = a2.l();
            if (l != null) {
                return a(a3, oVar, i2, (ca) bVar2.a(l, cda, a2.d()));
            }
            throw new IllegalArgumentException(str);
        } else {
            return C6918mWa.b((Object[]) new q[]{new C3719f.b(a3), oVar.c(i2)});
        }
    }

    private List<q> a(aa aaVar, o oVar, int i2, ca caVar) {
        q[] qVarArr = new q[2];
        qVarArr[0] = new C3719f.b(aaVar);
        q c2 = oVar.c(i2);
        C7471uYa.a((Object) c2, "playQueue.getPlayQueueItem(trackIndex)");
        if (c2 instanceof F) {
            qVarArr[1] = ((F.a) new F.a((F) c2).a((C3676c) caVar)).c();
            return C6918mWa.b((Object[]) qVarArr);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(c2);
        sb.append(" not of type ");
        sb.append(F.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: private */
    public List<q> a(o oVar, C3508cda cda, int i2, g.b bVar) {
        q c2 = oVar.c(i2);
        C7471uYa.a((Object) c2, "playQueue.getPlayQueueItem(trackIndex)");
        if (c2 instanceof F) {
            return C6850lWa.a(((F.a) new F.a((F) c2).a((C3676c) H.a(bVar.a(), cda))).c());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(c2);
        sb.append(" not of type ");
        sb.append(F.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: private */
    public o a(o oVar, int i2, List<? extends q> list) {
        oVar.q(i2);
        oVar.a(i2, list);
        return oVar;
    }

    /* access modifiers changed from: private */
    public IPa<Boolean> a(C3508cda cda) {
        IPa<Boolean> e2 = this.d.a(cda, a.LOCAL_ONLY).g().e(Jc.a);
        C7471uYa.a((Object) e2, "trackRepository.track(ur…          }\n            }");
        return e2;
    }

    /* access modifiers changed from: private */
    public boolean a() {
        return this.a.j() && !this.b.a() && !this.c.e();
    }
}
