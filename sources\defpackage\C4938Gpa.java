package defpackage;

import com.soundcloud.android.sync.T;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: Gpa reason: default package and case insensitive filesystem */
/* compiled from: DefaultPlaylistRepository.kt */
public class C4938Gpa implements Fda, Hda {
    private final C6332dsa a;
    private final T b;
    private final HPa c;

    public C4938Gpa(C6332dsa dsa, T t, HPa hPa) {
        C7471uYa.b(dsa, "playlistStorage");
        C7471uYa.b(t, "syncInitiator");
        C7471uYa.b(hPa, "scheduler");
        this.a = dsa;
        this.b = t;
        this.c = hPa;
    }

    /* access modifiers changed from: private */
    public APa<Pda<Eda>> c(C3508cda cda) {
        APa<Pda<Eda>> d = c(C6850lWa.a(cda)).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C7766ypa<Object,Object>(this, cda));
        C7471uYa.a((Object) d, "syncPlaylists(listOf(urn…Result(urn, it)\n        }");
        return d;
    }

    private APa<Pda<Eda>> d(C3508cda cda) {
        List a2 = C6850lWa.a(cda);
        APa<Pda<Eda>> d = this.a.a((Collection<C3508cda>) a2).g().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C7835zpa<Object,Object>(this, a2)).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C4752Apa<Object,Object>(this, cda));
        C7471uYa.a((Object) d, "playlistStorage\n        …ithFetchResult(urn, it) }");
        return d;
    }

    /* access modifiers changed from: private */
    public APa<Ida<Eda>> b(List<C3508cda> list) {
        APa<Ida<Eda>> h = this.a.b((Collection<C3508cda>) list).h(new C7628wpa(list));
        C7471uYa.a((Object) h, "playlistStorage\n        …          }\n            }");
        return h;
    }

    private IPa<MV> c(List<C3508cda> list) {
        IPa iPa;
        if (!list.isEmpty()) {
            if (list.size() == 1) {
                iPa = this.b.a((C3508cda) C7676xWa.f((List) list));
            } else {
                iPa = this.b.a(list);
            }
            IPa<MV> f = iPa.e(C4876Epa.a).f(C4907Fpa.a);
            C7471uYa.a((Object) f, "syncObservable\n         …          }\n            }");
            return f;
        }
        throw new IllegalStateException("Invalid requested urns of size 0");
    }

    public APa<Pda<Eda>> a(C3508cda cda, _Xa<? super Eda, Boolean> _xa) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(_xa, "syncIf");
        APa<Pda<Eda>> b2 = b(cda).g().d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C4783Bpa<Object,Object>(this, _xa, cda)).b(this.c);
        C7471uYa.a((Object) b2, "loadSingleLocal(urn).fir… }.subscribeOn(scheduler)");
        return b2;
    }

    /* access modifiers changed from: private */
    public APa<Pda<Eda>> b(C3508cda cda) {
        APa<Pda<Eda>> h = this.a.b((Collection<C3508cda>) C6850lWa.a(cda)).h(new C7697xpa(cda));
        C7471uYa.a((Object) h, "playlistStorage\n        …          }\n            }");
        return h;
    }

    public APa<Ida<Eda>> a(List<C3508cda> list) {
        C7471uYa.b(list, "urns");
        List e = C7676xWa.e(list);
        APa<Ida<Eda>> b2 = this.a.a((Collection<C3508cda>) e).g().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4814Cpa<Object,Object>(this, e)).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C4845Dpa<Object,Object>(this, e)).b(this.c);
        C7471uYa.a((Object) b2, "playlistStorage.availabl…  .subscribeOn(scheduler)");
        return b2;
    }

    public APa<Pda<Eda>> a(C3508cda cda, a aVar) {
        APa aPa;
        C7471uYa.b(cda, "urn");
        C7471uYa.b(aVar, "loadStrategy");
        int i = C7559vpa.a[aVar.ordinal()];
        if (i == 1) {
            aPa = c(cda);
        } else if (i == 2) {
            aPa = d(cda);
        } else {
            throw new FVa();
        }
        APa<Pda<Eda>> b2 = aPa.b(this.c);
        C7471uYa.a((Object) b2, "when (loadStrategy) {\n  … }.subscribeOn(scheduler)");
        return b2;
    }

    /* access modifiers changed from: private */
    public IPa<MV> a(List<C3508cda> list, List<C3508cda> list2) {
        List c2 = C7676xWa.c((Iterable) list, (Iterable) list2);
        if (!c2.isEmpty()) {
            return c(c2);
        }
        IPa<MV> a2 = IPa.a(b.a);
        C7471uYa.a((Object) a2, "Single.just(FetchResult.Success)");
        return a2;
    }

    public boolean a(Iterable<C3927zda> iterable) {
        C7471uYa.b(iterable, "playlists");
        return this.a.b(iterable).b();
    }

    public C4928GKa<String> a(C3508cda cda) {
        C7471uYa.b(cda, "playlistUrn");
        return this.a.c(cda);
    }

    public IPa<Set<C3508cda>> a(Collection<C3508cda> collection) {
        C7471uYa.b(collection, "posts");
        return this.a.c(collection);
    }

    public IPa<C3508cda> a(String str, boolean z, C3508cda cda, C3508cda cda2) {
        C7471uYa.b(str, "title");
        C7471uYa.b(cda, "firstTrackUrn");
        C7471uYa.b(cda2, "creatorUrn");
        return this.a.a(str, z, cda, cda2);
    }
}
