package com.soundcloud.android.collection;

import android.annotation.SuppressLint;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.sync.SyncJobResult;
import com.soundcloud.android.sync.T;
import com.soundcloud.android.sync.ca;
import com.soundcloud.android.sync.ia;
import com.soundcloud.android.sync.la;
import com.soundcloud.android.sync.na;

/* compiled from: CollectionSyncer.kt */
public class Aa {
    private final a a;
    private final ca b;
    private final la c;
    private final T d;
    private final C5606ava e;
    private final Ica f;

    public Aa(a aVar, ca caVar, la laVar, T t, C5606ava ava, Ica ica) {
        C7471uYa.b(aVar, "appFeatures");
        C7471uYa.b(caVar, "syncOperations");
        C7471uYa.b(laVar, "syncStateStorage");
        C7471uYa.b(t, "syncInitiator");
        C7471uYa.b(ava, "observerFactory");
        C7471uYa.b(ica, "sessionProvider");
        this.a = aVar;
        this.b = caVar;
        this.c = laVar;
        this.d = t;
        this.e = ava;
        this.f = ica;
    }

    @SuppressLint({"CheckResult"})
    public void a() {
        c().a().a((C7256rQa<? super T>) ya.a).e(new za(this)).f();
    }

    public IPa<ia> b() {
        IPa<ia> a2 = e().a(na.COLLECTIONS_DELTA);
        C7471uYa.a((Object) a2, "syncOperations.failSafeS…ncable.COLLECTIONS_DELTA)");
        return a2;
    }

    public Ica c() {
        return this.f;
    }

    public T d() {
        return this.d;
    }

    public ca e() {
        return this.b;
    }

    public la f() {
        return this.c;
    }

    public IPa<Boolean> g() {
        IPa<Boolean> a2 = IPa.a(Boolean.valueOf(f().c(na.MY_PLAYLISTS) && f().c(na.COLLECTIONS_DELTA)));
        C7471uYa.a((Object) a2, "Single.just(syncStateSto…cable.COLLECTIONS_DELTA))");
        return a2;
    }

    public IPa<ia> h() {
        IPa<ia> b2 = e().b(na.COLLECTIONS_DELTA);
        C7471uYa.a((Object) b2, "syncOperations.lazySyncI…ncable.COLLECTIONS_DELTA)");
        return b2;
    }

    public IPa<SyncJobResult> i() {
        IPa<SyncJobResult> a2 = d().a(na.MY_PLAYLISTS);
        C7471uYa.a((Object) a2, "syncInitiator.sync(Syncable.MY_PLAYLISTS)");
        return a2;
    }

    public C6979nPa j() {
        C6979nPa b2 = d().a(na.MY_PLAYLISTS).e().b((C7255rPa) d().a(na.COLLECTIONS_DELTA).e());
        C7471uYa.a((Object) b2, "syncInitiator.sync(Synca…S_DELTA).ignoreElement())");
        return b2;
    }

    public void k() {
        d().b(na.COLLECTIONS_DELTA);
        d().b(na.MY_PLAYLISTS);
    }
}
