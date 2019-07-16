package com.soundcloud.android.stations;

import android.content.Context;
import android.view.View;
import com.soundcloud.android.likes.C3986j;

/* renamed from: com.soundcloud.android.stations.yb reason: case insensitive filesystem */
/* compiled from: StationMenuPresenter */
public class C6063yb implements a {
    private final ic a;
    private final Context b;
    private final Bb c;
    private final UPa d = new UPa();
    /* access modifiers changed from: private */
    public Ab e;

    C6063yb(Context context, Bb bb, ic icVar) {
        this.b = context;
        this.c = bb;
        this.a = icVar;
    }

    public void onDismiss() {
        this.d.b();
    }

    public void a(View view, C3508cda cda) {
        this.e = this.c.a((a) this, view);
        a(cda);
    }

    public void a(Pb pb) {
        boolean z = !pb.h();
        UPa uPa = this.d;
        C6979nPa a2 = this.a.a(pb.g(), z).a(RPa.a());
        C3986j jVar = new C3986j(this.b, z);
        a2.c(jVar);
        uPa.b(jVar);
    }

    private void a(C3508cda cda) {
        UPa uPa = this.d;
        C7531vPa a2 = this.a.a(cda, C4928GKa.a()).a(RPa.a());
        C6060xb xbVar = new C6060xb(this);
        a2.c(xbVar);
        uPa.b(xbVar);
    }
}
