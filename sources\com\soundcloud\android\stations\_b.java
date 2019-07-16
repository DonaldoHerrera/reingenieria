package com.soundcloud.android.stations;

import com.soundcloud.android.foundation.playqueue.k;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.sync.T;

/* compiled from: StationsController */
public class _b {
    private final C5327TLa a;
    private final ic b;
    private final T c;
    private final HPa d;
    private final r e;

    /* compiled from: StationsController */
    private static class a {
        /* access modifiers changed from: private */
        public final C3508cda a;
        /* access modifiers changed from: private */
        public final int b;
        /* access modifiers changed from: private */
        public final C4431ub c;

        a(C3508cda cda, int i, C4431ub ubVar) {
            this.a = cda;
            this.b = i;
            this.c = ubVar;
        }
    }

    _b(C5327TLa tLa, ic icVar, T t, r rVar, HPa hPa) {
        this.a = tLa;
        this.b = icVar;
        this.c = t;
        this.e = rVar;
        this.d = hPa;
    }

    /* access modifiers changed from: private */
    public void c(a aVar) {
        this.b.a(aVar.a, aVar.b);
        this.a.c(C3876taa.o, C3490aba.c(aVar.a));
    }

    public void a() {
        APa.a((EPa<? extends T1>) this.e.a(), (EPa<? extends T2>) this.a.a(C3876taa.b), (C6504gQa<? super T1, ? super T2, ? extends R>) C6017j.a).a((C7256rQa<? super T>) C6023l.a).a(this.d).d((C6776kQa<? super T>) new C6020k<Object>(this)).d((C7118pQa<? super T, ? extends C7255rPa>) new C6026m<Object,Object>(this)).g();
    }

    public /* synthetic */ C7255rPa b(a aVar) throws Exception {
        return this.c.a();
    }

    static /* synthetic */ a a(k kVar, C4431ub ubVar) throws Exception {
        return new a(kVar.a(), kVar.c(), ubVar);
    }

    static /* synthetic */ boolean a(a aVar) throws Exception {
        return aVar.a.v() && aVar.c.j();
    }
}
