package defpackage;

import android.app.Activity;
import android.view.View;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.stations.Ga;

/* renamed from: QFa reason: default package and case insensitive filesystem */
/* compiled from: UserMenuPresenter */
public class C5231QFa implements a {
    private final C5141NFa a;
    private final Ga b;
    private final C2390YL c;
    /* access modifiers changed from: private */
    public final C2526g d;
    private final C3240rR e;
    private final C5321TFa f;
    private final UPa g = new UPa();
    /* access modifiers changed from: private */
    public C5291SFa h;
    private C3710l i;

    /* renamed from: QFa$a */
    /* compiled from: UserMenuPresenter */
    private class a extends C5005Iua<C4954HFa> {
        private a() {
        }

        /* renamed from: a */
        public void onSuccess(C4954HFa hFa) {
            C5231QFa.this.h.a(hFa, C5231QFa.this.d.b(hFa.a()));
        }
    }

    C5231QFa(C5321TFa tFa, C3240rR rRVar, C5141NFa nFa, Ga ga, C2390YL yl, C2526g gVar) {
        this.f = tFa;
        this.e = rRVar;
        this.a = nFa;
        this.b = ga;
        this.c = yl;
        this.d = gVar;
    }

    public void onDismiss() {
        this.g.b();
    }

    public void a(View view, C3508cda cda, C3710l lVar) {
        this.h = this.f.a((a) this, view);
        this.i = lVar;
        a(cda);
    }

    public void a(C4954HFa hFa) {
        boolean z = !hFa.e;
        this.e.a(hFa.a(), z).a((C7117pPa) new C4974Hua());
        this.c.a(hFa.a(), z, this.i);
    }

    public void a(Activity activity, C4954HFa hFa) {
        this.b.a(C3508cda.a(hFa.a().c()));
    }

    private void a(C3508cda cda) {
        this.g.b();
        UPa uPa = this.g;
        C7531vPa a2 = this.a.a(cda).a(RPa.a());
        a aVar = new a();
        a2.c(aVar);
        uPa.b(aVar);
    }
}
