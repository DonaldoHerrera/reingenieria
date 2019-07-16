package defpackage;

import android.view.View;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d.e.C0099e;
import com.soundcloud.android.foundation.events.C3702d.e.f;
import com.soundcloud.android.foundation.events.C3702d.e.h;
import com.soundcloud.android.foundation.events.C3702d.e.i;
import com.soundcloud.android.foundation.events.C3702d.e.k;
import com.soundcloud.android.foundation.events.C3702d.e.l;
import com.soundcloud.android.foundation.events.C3702d.e.n;
import com.soundcloud.android.foundation.events.C3702d.e.o;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.likes.C3983h;
import com.soundcloud.android.likes.C3986j;
import com.soundcloud.android.tracks.Va;
import java.util.concurrent.TimeUnit;

/* renamed from: PIa reason: default package and case insensitive filesystem */
/* compiled from: CardEngagementsPresenter */
public class C5204PIa {
    private final C5408WFa a;
    private final C3983h b;
    private final C1997DR c;
    private final C2526g d;
    private final C3700b e;
    private final Va f;

    /* renamed from: PIa$a */
    /* compiled from: CardEngagementsPresenter */
    public interface a {
        void a(View view);

        void b(View view);
    }

    C5204PIa(C5408WFa wFa, C3983h hVar, C1997DR dr, C2526g gVar, C3700b bVar, Va va) {
        this.a = wFa;
        this.b = hVar;
        this.c = dr;
        this.d = gVar;
        this.e = bVar;
        this.f = va;
    }

    private String c(C3855qda qda) {
        return this.f.b(qda) ? this.a.a((long) qda.z()) : "";
    }

    /* access modifiers changed from: private */
    public void b(View view, C3855qda qda, C3710l lVar) {
        C3508cda a2 = qda.a();
        boolean z = !qda.p();
        this.c.a(a2, z).a(RPa.a()).d((C6776kQa<? super T>) new C4771BIa<Object>(view));
        if (a2.x()) {
            this.e.a(z ? l.c : o.c);
        } else if (a2.u()) {
            this.e.a(z ? f.c : i.c);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot handle non track or playlist repost: ");
            sb.append(a2);
            throw new IllegalArgumentException(sb.toString());
        }
        this.e.a((J) K.a(z, a2, lVar, b(qda), C5672bua.b(qda)));
    }

    public void a(C5264RIa rIa, C3855qda qda, C3710l lVar) {
        rIa.a(C7315sGa.a(qda.g(), TimeUnit.MILLISECONDS));
        if (qda.f() != null && C5206PKa.b(qda.f())) {
            rIa.b(qda.f());
        }
        rIa.b(a(qda), qda.o());
        if (this.d.b(qda.e())) {
            rIa.a();
        } else {
            rIa.a(c(qda), qda.p());
        }
        rIa.a((a) new C5174OIa(this, qda, lVar));
    }

    /* access modifiers changed from: private */
    public void a(View view, C3855qda qda, C3710l lVar) {
        C3508cda a2 = qda.a();
        boolean z = !qda.o();
        this.b.a(a2, z).a(RPa.a()).a((C7117pPa) new C3986j(view.getContext(), z));
        if (a2.x()) {
            this.e.a(z ? k.c : n.c);
        } else if (a2.u()) {
            this.e.a(z ? C0099e.c : h.c);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot handle non track or playlist like: ");
            sb.append(a2);
            throw new IllegalArgumentException(sb.toString());
        }
        this.e.a((J) K.a(z, a2, lVar, b(qda), C5672bua.b(qda), K.h.OTHER));
    }

    private PromotedSourceInfo b(C3855qda qda) {
        if (qda.n()) {
            return PromotedSourceInfo.a(qda.a(), qda.t());
        }
        return null;
    }

    private String a(C3855qda qda) {
        return this.f.a(qda) ? this.a.a((long) qda.q()) : "";
    }
}
