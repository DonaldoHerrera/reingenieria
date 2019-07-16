package defpackage;

import com.soundcloud.android.likes.C3989m;
import java.util.Collection;
import java.util.Map;

/* renamed from: Bra reason: default package and case insensitive filesystem */
/* compiled from: PlaylistItemRepository.kt */
public class C4785Bra {
    private final Fda a;
    /* access modifiers changed from: private */
    public final C5425Wta b;
    private final C3989m c;
    private final C2210OR d;
    private final C3815lda e;

    public C4785Bra(Fda fda, C5425Wta wta, C3989m mVar, C2210OR or, C3815lda lda) {
        C7471uYa.b(fda, "playlistRepository");
        C7471uYa.b(wta, "entityItemCreator");
        C7471uYa.b(mVar, "likesStateProvider");
        C7471uYa.b(or, "repostsStateProvider");
        C7471uYa.b(lda, "offlinePropertiesProvider");
        this.a = fda;
        this.b = wta;
        this.c = mVar;
        this.d = or;
        this.e = lda;
    }

    private APa<Map<C3508cda, Eda>> b(Collection<C3508cda> collection, boolean z) {
        APa<Map<C3508cda, Eda>> h = a().a(C7676xWa.q(collection)).h(new C7632wra(z)).h(C7701xra.a);
        C7471uYa.a((Object) h, "playlistRepository.playl…ssociateBy { it.urn() } }");
        return h;
    }

    public Fda a() {
        return this.a;
    }

    public APa<C3863rda> a(C3508cda cda, _Xa<? super Eda, Boolean> _xa) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(_xa, "syncIf");
        _Ua _ua = _Ua.a;
        APa c2 = a().a(cda, _xa).c((C7118pQa<? super T, ? extends EPa<? extends R>>) new C4754Ara<Object,Object>(this));
        C7471uYa.a((Object) c2, "playlistRepository.playl…flatMap { it.playlist() }");
        APa d2 = this.c.d();
        APa b2 = this.d.b();
        C7471uYa.a((Object) b2, "repostsStateProvider.repostedStatuses()");
        APa d3 = this.e.d();
        C7471uYa.a((Object) d3, "offlinePropertiesProvider.states()");
        APa<C3863rda> d4 = APa.a(c2, d2, b2, d3, new C7839zra(this)).d();
        C7471uYa.a((Object) d4, "Observables.combineLates… }.distinctUntilChanged()");
        return d4;
    }

    /* access modifiers changed from: private */
    public APa<Eda> a(Pda<Eda> pda) {
        String str = "Observable.just(item)";
        if (pda instanceof b) {
            APa<Eda> c2 = APa.c(((b) pda).a());
            C7471uYa.a((Object) c2, str);
            return c2;
        } else if (pda instanceof a) {
            APa<Eda> c3 = APa.c(((a) pda).a());
            C7471uYa.a((Object) c3, str);
            return c3;
        } else if (pda instanceof c) {
            Kda a2 = ((c) pda).a();
            if (a2 != null) {
                APa<Eda> b2 = APa.b((Throwable) a2);
                if (b2 != null) {
                    return b2;
                }
            }
            APa<Eda> e2 = APa.e();
            C7471uYa.a((Object) e2, "Observable.empty()");
            return e2;
        } else {
            throw new FVa();
        }
    }

    public static /* synthetic */ APa a(C4785Bra bra, Collection collection, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            return bra.a(collection, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: liveUrnsToPlaylistItems");
    }

    public APa<Map<C3508cda, C3863rda>> a(Collection<C3508cda> collection, boolean z) {
        C7471uYa.b(collection, "urns");
        _Ua _ua = _Ua.a;
        APa b2 = b(collection, z);
        APa d2 = this.c.d();
        APa b3 = this.d.b();
        C7471uYa.a((Object) b3, "repostsStateProvider.repostedStatuses()");
        APa b4 = this.e.b();
        C7471uYa.a((Object) b4, "offlinePropertiesProvider.smoothStates()");
        APa<Map<C3508cda, C3863rda>> d3 = APa.a(b2, d2, b3, b4, new C7770yra(this)).d();
        C7471uYa.a((Object) d3, "Observables.combineLates… }.distinctUntilChanged()");
        return d3;
    }
}
