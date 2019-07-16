package com.soundcloud.android.playback;

import android.annotation.SuppressLint;
import com.google.common.base.Predicate;
import com.soundcloud.android.foundation.playqueue.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PlaylistExploder */
public class Yc {
    private final C4909Fra a;
    /* access modifiers changed from: private */
    public final C3814lca b;
    private final Set<C3508cda> c = new HashSet();
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa d = new UPa();

    public Yc(C4909Fra fra, C3814lca lca) {
        this.a = fra;
        this.b = lca;
    }

    private void b(C3508cda cda) {
        this.c.add(cda);
        UPa uPa = this.d;
        IPa a2 = this.a.c(cda).a(RPa.a()).c((C6776kQa<? super T>) new C4339m<Object>(this, cda)).a((C6776kQa<? super Throwable>) new C4344n<Object>(this, cda)).a(RPa.a());
        Xc xc = new Xc(this, cda);
        a2.c(xc);
        uPa.b(xc);
    }

    private void c(C3508cda cda) {
        this.c.remove(cda);
    }

    /* access modifiers changed from: 0000 */
    public void a(p pVar) {
        if (pVar.e()) {
            this.d.b();
            this.c.clear();
            a(this.b.j(), 8);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        a(this.b.j(), 8);
    }

    public void a(int i, int i2) {
        for (C3508cda cda : b(i, i2)) {
            if (!this.c.contains(cda)) {
                b(cda);
            }
        }
    }

    private Collection<C3508cda> b(int i, int i2) {
        ArrayList arrayList = new ArrayList(this.b.a(i, i2));
        arrayList.addAll(this.b.b(4));
        return C3063jD.a((Collection<E>) arrayList, (Predicate<? super E>) C4334l.a);
    }

    public /* synthetic */ void a(C3508cda cda, List list) throws Exception {
        c(cda);
    }

    public /* synthetic */ void a(C3508cda cda, Throwable th) throws Exception {
        c(cda);
    }
}
