package com.soundcloud.android.playback.playqueue;

import com.google.common.base.Function;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.playback.Db;
import java.util.List;

/* renamed from: com.soundcloud.android.playback.playqueue.wa reason: case insensitive filesystem */
/* compiled from: PlayQueueHelper */
public class C4403wa {
    /* access modifiers changed from: private */
    public final C3814lca a;
    private final C4909Fra b;
    private final C5479Ypa c;
    private final Db d;
    private final F e;
    private final C4425ta f;
    private final HPa g;

    /* renamed from: com.soundcloud.android.playback.playqueue.wa$a */
    /* compiled from: PlayQueueHelper */
    private class a extends C5068Kua<List<C3509cea>> {
        private a() {
        }

        /* renamed from: a */
        public void onSuccess(List<C3509cea> list) {
            C4403wa.this.a.a(C2063HD.a(list, (Function<? super F, ? extends T>) C4359a.a));
            super.onSuccess(list);
        }
    }

    public C4403wa(C3814lca lca, C4909Fra fra, C5479Ypa ypa, Db db, F f2, C4425ta taVar, HPa hPa) {
        this.a = lca;
        this.b = fra;
        this.c = ypa;
        this.d = db;
        this.e = f2;
        this.f = taVar;
        this.g = hPa;
    }

    public void a(C3508cda cda) {
        if (this.a.x()) {
            IPa a2 = this.b.c(cda).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4385n<Object,Object>(this)).a(RPa.a());
            C4425ta taVar = this.f;
            taVar.getClass();
            a2.d((C6776kQa<? super T>) new C4369f<Object>(taVar));
            return;
        }
        this.c.c(cda).b(this.g).a(RPa.a()).a((KPa<? super T>) new a<Object>());
    }

    public /* synthetic */ MPa a(List list) throws Exception {
        return this.d.b(list, 0, PlaySessionSource.a(this.e.a()));
    }
}
