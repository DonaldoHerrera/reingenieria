package com.soundcloud.android.collection;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.collection.Ca.a;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.search.C5916j;
import com.soundcloud.android.upsell.i;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010\u001f\u001a\u00020 2\u0018\u0010!\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0#\u0012\u0004\u0012\u00020\u000e0\"H\u0016J\u001a\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020 H\u0016J\u0010\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\u0002H\u0014J\b\u0010,\u001a\u00020\u0002H\u0014J\u0010\u0010-\u001a\u00020 2\u0006\u0010+\u001a\u00020\u0002H\u0014J\b\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u00020 2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0018\u00101\u001a\u00020 2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020 07H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020907H\u0016J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020907H\u0016J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020 07H\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020 07H\u0016J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020907H\u0016J\b\u0010>\u001a\u00020/H\u0014J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020907H\u0016J\b\u0010@\u001a\u00020 H\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020 07H\u0016J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020 07H\u0016J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020 07H\u0016J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020 07H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006E"}, d2 = {"Lcom/soundcloud/android/collection/CollectionFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/collection/CollectionPresenter;", "Lcom/soundcloud/android/collection/CollectionView;", "()V", "adapter", "Lcom/soundcloud/android/collection/CollectionAdapter;", "getAdapter$base_release", "()Lcom/soundcloud/android/collection/CollectionAdapter;", "setAdapter$base_release", "(Lcom/soundcloud/android/collection/CollectionAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/collection/CollectionItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy$base_release", "()Ldagger/Lazy;", "setPresenterLazy$base_release", "(Ldagger/Lazy;)V", "titleBarUpsellController", "Lcom/soundcloud/android/upsell/TitleBarUpsellController;", "getTitleBarUpsellController$base_release", "()Lcom/soundcloud/android/upsell/TitleBarUpsellController;", "setTitleBarUpsellController$base_release", "(Lcom/soundcloud/android/upsell/TitleBarUpsellController;)V", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onboardingItemClosed", "Lio/reactivex/Observable;", "playlistItemClick", "Lcom/soundcloud/android/foundation/domain/Urn;", "profileItemClick", "refreshSignal", "requestContent", "stationItemClick", "titleResId", "trackItemClick", "unbindViews", "upsellClick", "upsellClose", "upsellHeaderClick", "upsellShown", "base_release"}, mv = {1, 1, 15})
/* compiled from: CollectionFragment.kt */
public final class CollectionFragment extends UniflowBaseFragment<ua> implements Ca {
    private final String i = "CollectionPresenterKey";
    public C4806CMa<ua> j;
    public C2837s k;
    public i l;
    private C6769kJa<B, C6973nJa> m;
    private HashMap n;

    public CollectionFragment() {
        SoundCloudApplication.f().a(this);
    }

    public void Rb() {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        C2837s sVar = this.k;
        if (sVar != null) {
            C6769kJa kja = new C6769kJa(sVar, C2844z.a, null, new C5916j(), true, false, true, false, false, false, 932, null);
            this.m = kja;
            return;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.i;
    }

    public int Vb() {
        return l.recyclerview_with_top_divider_and_refresh_and_toolbar_without_empty;
    }

    public void Wb() {
        C6769kJa<B, C6973nJa> kja = this.m;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public APa<RVa> c() {
        APa<RVa> c = APa.c(RVa.a);
        C7471uYa.a((Object) c, "Observable.just(Unit)");
        return c;
    }

    public APa<RVa> e() {
        return a.a(this);
    }

    public APa<RVa> f() {
        C6769kJa<B, C6973nJa> kja = this.m;
        if (kja != null) {
            return kja.g();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C7471uYa.b(menu, "menu");
        C7471uYa.b(menuInflater, "inflater");
        i iVar = this.l;
        if (iVar != null) {
            iVar.a(menu, Yca.COLLECTIONS);
            super.onCreateOptionsMenu(menu, menuInflater);
            return;
        }
        C7471uYa.b("titleBarUpsellController");
        throw null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public APa<RVa> p() {
        C2837s sVar = this.k;
        if (sVar != null) {
            return sVar.j();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<C3508cda> q() {
        C2837s sVar = this.k;
        if (sVar != null) {
            return sVar.n();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<C3508cda> s() {
        C2837s sVar = this.k;
        if (sVar != null) {
            return sVar.m();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<C3508cda> t() {
        C2837s sVar = this.k;
        if (sVar != null) {
            return sVar.k();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<RVa> u() {
        C2837s sVar = this.k;
        if (sVar != null) {
            return sVar.o();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<RVa> v() {
        C2837s sVar = this.k;
        if (sVar != null) {
            return sVar.p();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<RVa> w() {
        C2837s sVar = this.k;
        if (sVar != null) {
            return sVar.q();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<RVa> y() {
        C2837s sVar = this.k;
        if (sVar != null) {
            return sVar.r();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<C3508cda> z() {
        C2837s sVar = this.k;
        if (sVar != null) {
            return sVar.l();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.tab_library;
    }

    /* access modifiers changed from: protected */
    public ua Tb() {
        C4806CMa<ua> cMa = this.j;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (ua) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<B, C6973nJa> kja = this.m;
        if (kja != null) {
            C6769kJa.a(kja, view, false, null, 0, 14, null);
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public void b() {
        a.b(this);
    }

    /* access modifiers changed from: protected */
    public void a(ua uaVar) {
        C7471uYa.b(uaVar, "presenter");
        uaVar.a((Ca) this);
    }

    /* access modifiers changed from: protected */
    public void b(ua uaVar) {
        C7471uYa.b(uaVar, "presenter");
        uaVar.a();
    }

    public void a(C6832lEa<List<B>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        C6769kJa<B, C6973nJa> kja = this.m;
        if (kja != null) {
            C6900mEa a = lea.a();
            List list = (List) lea.b();
            if (list == null) {
                list = C6918mWa.a();
            }
            kja.a(new C4736AEa<>(a, list));
            return;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }
}
