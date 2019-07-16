package com.soundcloud.android.collections.data;

import com.facebook.stetho.server.http.HttpStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/* compiled from: RoomLikesWriteStorage.kt */
public class ca implements L {
    /* access modifiers changed from: private */
    public final C2863t a;

    public ca(C2863t tVar) {
        C7471uYa.b(tVar, "likeDao");
        this.a = tVar;
    }

    public void b(Collection<C2862s> collection) {
        C7471uYa.b(collection, "likes");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) collection, 10));
        for (C2862s a2 : collection) {
            arrayList.add(a(a2));
        }
        for (List b : C7676xWa.b((Iterable) arrayList, (int) HttpStatus.HTTP_INTERNAL_SERVER_ERROR)) {
            this.a.b(b);
        }
    }

    public void c(Collection<C2862s> collection) {
        C7471uYa.b(collection, "likes");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) collection, 10));
        for (C2862s c : collection) {
            arrayList.add(c.c());
        }
        for (List a2 : C7676xWa.b((Iterable) arrayList, (int) HttpStatus.HTTP_INTERNAL_SERVER_ERROR)) {
            this.a.a(a2);
        }
    }

    public void clear() {
        this.a.a();
    }

    public C6979nPa a(ga gaVar) {
        C7471uYa.b(gaVar, "likeParams");
        long time = new Date().getTime();
        I i = new I(gaVar.b(), fa.a(gaVar.b()), time, gaVar.a() ? Long.valueOf(time) : null, !gaVar.a() ? Long.valueOf(time) : null);
        C6979nPa b = C6979nPa.b((C6368eQa) new ba(this, i));
        C7471uYa.a((Object) b, "Completable.fromAction {…Dao.upsert(updatedLike) }");
        return b;
    }

    public void a(Collection<C2853i> collection) {
        C7471uYa.b(collection, "changes");
        for (List a2 : C7676xWa.b((Iterable) collection, (int) HttpStatus.HTTP_INTERNAL_SERVER_ERROR)) {
            this.a.a((Collection<C2853i>) a2);
        }
    }

    public void a(Collection<C2862s> collection, ea eaVar) {
        C7471uYa.b(collection, "likes");
        C7471uYa.b(eaVar, "soundType");
        c(collection);
    }

    public boolean a(C3508cda cda, C3508cda cda2) {
        C7471uYa.b(cda, "localUrn");
        C7471uYa.b(cda2, "newUrn");
        return this.a.a(cda, cda2, ea.PLAYLIST) > 0;
    }

    private I a(C2862s sVar) {
        I i = new I(sVar.c(), fa.a(sVar.c()), sVar.b().getTime(), null, null);
        return i;
    }
}
