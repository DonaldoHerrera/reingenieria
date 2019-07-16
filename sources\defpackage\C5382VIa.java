package defpackage;

import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.foundation.events.p;
import com.soundcloud.android.foundation.events.v;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.playback.Db;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
/* renamed from: VIa reason: default package and case insensitive filesystem */
/* compiled from: MixedItemClickListener */
public class C5382VIa {
    private final Db a;
    private final C4425ta b;
    private final Yca c;
    private final SearchQuerySourceInfo d;
    private final C4655rja e;

    /* renamed from: VIa$a */
    /* compiled from: MixedItemClickListener */
    public static class a {
        private final Db a;
        private final C4425ta b;
        private final C4655rja c;

        public a(Db db, C4425ta taVar, C4655rja rja) {
            this.a = db;
            this.b = taVar;
            this.c = rja;
        }

        public C5382VIa a(Yca yca, SearchQuerySourceInfo searchQuerySourceInfo) {
            C5382VIa vIa = new C5382VIa(this.a, this.b, yca, searchQuerySourceInfo, this.c);
            return vIa;
        }
    }

    public C5382VIa(Db db, C4425ta taVar, Yca yca, SearchQuerySourceInfo searchQuerySourceInfo, C4655rja rja) {
        this.a = db;
        this.b = taVar;
        this.c = yca;
        this.d = searchQuerySourceInfo;
        this.e = rja;
    }

    private PromotedSourceInfo a(C3855qda qda) {
        return PromotedSourceInfo.a(qda.a(), qda.t());
    }

    private C4928GKa<PromotedSourceInfo> b(Wca wca) {
        if (wca instanceof C3855qda) {
            C3855qda qda = (C3855qda) wca;
            if (qda.n()) {
                return C4928GKa.c(a(qda));
            }
        }
        return C4928GKa.a();
    }

    public void a(Wca wca) {
        if (wca.a().x()) {
            a(Collections.singletonList(wca), 0);
        } else {
            a(wca, C4928GKa.a());
        }
    }

    private void a(Wca wca, C4928GKa<v> gKa) {
        C3508cda a2 = wca.a();
        if (wca instanceof C3855qda) {
            this.e.a(C4621nja.a(a2, this.c, C4928GKa.b(this.d), b(wca), C4928GKa.c(K.d(a2, a((C3855qda) wca, gKa)))));
        } else if (a2.u()) {
            this.e.a(C4621nja.a(a2, this.c, C4928GKa.c(this.d), b(wca)));
        } else if (a2.J()) {
            this.e.a(C4621nja.a(a2, C4928GKa.a(), C4928GKa.c(this.c), C4928GKa.c(this.d)));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized urn [");
            sb.append(a2);
            sb.append("] in ");
            sb.append(C5382VIa.class.getSimpleName());
            sb.append(": ");
            sb.append(a2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private C3710l a(C3855qda qda, C4928GKa<v> gKa) {
        return C5672bua.a(qda, this.c.a(), (v) gKa.d(), p.SELF, C3508cda.a);
    }

    private void a(List<? extends Wca> list, int i) {
        List a2 = a(list);
        int size = a(list.subList(0, i)).size();
        PlaySessionSource playSessionSource = new PlaySessionSource(this.c);
        playSessionSource.a(this.d);
        IPa b2 = this.a.b(a2, size, playSessionSource);
        C4425ta taVar = this.b;
        taVar.getClass();
        b2.d((C6776kQa<? super T>) new C4802CIa<Object>(taVar));
    }

    private List<C3508cda> a(List<? extends Wca> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Wca wca : list) {
            if (wca.a().x()) {
                arrayList.add(wca.a());
            }
        }
        return arrayList;
    }
}
