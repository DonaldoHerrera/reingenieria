package com.soundcloud.android.offline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.soundcloud.android.offline.ke reason: case insensitive filesystem */
/* compiled from: OfflineStatePublisher */
class C4118ke {
    private final C5327TLa a;
    private final C4106ie b;

    public C4118ke(C5327TLa tLa, C4106ie ieVar) {
        this.a = tLa;
        this.b = ieVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(C4157rc rcVar) {
        this.a.c(C3876taa.u, new Hc(C3823mda.REQUESTED, rcVar.b, rcVar.d && rcVar.e.isEmpty()));
    }

    /* access modifiers changed from: 0000 */
    public void b(C3508cda cda) {
        a(C3823mda.DOWNLOADING, cda);
    }

    /* access modifiers changed from: 0000 */
    public void c(Collection<C3508cda> collection) {
        a(C3823mda.REQUESTED, collection);
    }

    /* access modifiers changed from: 0000 */
    public void d(C3508cda cda) {
        a(C3823mda.REQUESTED, cda);
    }

    /* access modifiers changed from: 0000 */
    public void e(C3508cda cda) {
        a(C3823mda.UNAVAILABLE, cda);
    }

    /* access modifiers changed from: 0000 */
    public void b(Collection<C3508cda> collection) {
        a(C3823mda.NOT_OFFLINE, collection);
    }

    /* access modifiers changed from: 0000 */
    public void c(C3508cda cda) {
        a(C3823mda.NOT_OFFLINE, cda);
    }

    /* access modifiers changed from: 0000 */
    public void d(Collection<C3508cda> collection) {
        a(C3823mda.UNAVAILABLE, collection);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Hc a(C3823mda mda, Collection<C3508cda> collection, Map<C3823mda, ze> map, C3823mda mda2) {
        return a(mda2, mda.equals(mda2) ? C4928GKa.c(collection) : C4928GKa.a(), map.containsKey(mda2) ? C4928GKa.c(map.get(mda2)) : C4928GKa.a());
    }

    /* access modifiers changed from: 0000 */
    public void a(Collection<C3508cda> collection) {
        a(C3823mda.DOWNLOADED, collection);
    }

    /* access modifiers changed from: 0000 */
    public void a(C3508cda cda) {
        a(C3823mda.DOWNLOADED, cda);
    }

    private void a(C3823mda mda, C3508cda cda) {
        a(mda, (Collection<C3508cda>) Collections.singletonList(cda));
    }

    private void a(C3823mda mda, Collection<C3508cda> collection) {
        this.b.a(collection, mda).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new Ua<Object,Object>(this, mda, collection)).f((C6776kQa<? super T>) new Va<Object>(this));
    }

    public /* synthetic */ EPa a(C3823mda mda, Collection collection, Map map) throws Exception {
        return APa.a((Iterable<? extends T>) Arrays.asList(C3823mda.values())).a((C7256rQa<? super T>) new Xa<Object>(mda, map)).h(new Wa(this, mda, collection, map));
    }

    static /* synthetic */ boolean a(C3823mda mda, Map map, C3823mda mda2) throws Exception {
        return mda.equals(mda2) || map.containsKey(mda2);
    }

    public /* synthetic */ void a(Hc hc) throws Exception {
        this.a.c(C3876taa.u, hc);
    }

    private static Hc a(C3823mda mda, C4928GKa<Collection<C3508cda>> gKa, C4928GKa<ze> gKa2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (gKa2.c()) {
            arrayList.addAll(((ze) gKa2.b()).b());
            z = ((ze) gKa2.b()).a();
        } else {
            z = false;
        }
        if (gKa.c()) {
            arrayList.addAll((Collection) gKa.b());
        }
        return new Hc(mda, arrayList, z);
    }
}
