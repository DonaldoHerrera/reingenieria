package com.soundcloud.android.profile;

import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.profile.C5849t.a;
import com.soundcloud.android.view.UniflowBaseFragment;
import com.soundcloud.android.view.V;
import com.soundcloud.android.view.W;
import defpackage.C6968nEa;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0005¢\u0006\u0002\u0010\u0007J\"\u0010\u0012\u001a\u00020\u00132\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0016\u0012\u0004\u0012\u00020\u00110\u0015H\u0016J\u001a\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020 H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\"H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\"H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\"H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130\"H\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\"H\u0016J\b\u0010)\u001a\u00020\u0013H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX.¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/soundcloud/android/profile/UserProfilePlayableFragment;", "T", "Lcom/soundcloud/android/uniflow/LiveAndDie;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/profile/PlayableView;", "Lcom/soundcloud/android/view/ViewWithNavigation;", "Lcom/soundcloud/android/view/ViewWithTracks;", "()V", "adapter", "Lcom/soundcloud/android/profile/UserPlayableAdapter;", "getAdapter", "()Lcom/soundcloud/android/profile/UserPlayableAdapter;", "setAdapter", "(Lcom/soundcloud/android/profile/UserPlayableAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/profile/UserPlayableItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "getEmptyStateProvider", "Lcom/soundcloud/android/view/collection/EmptyStateProvider;", "getResId", "", "nextPageSignal", "Lio/reactivex/Observable;", "playlistClick", "Lcom/soundcloud/android/profile/UserPlaylistsItemClickParams;", "refreshSignal", "requestContent", "trackClick", "Lcom/soundcloud/android/profile/UserTracksItemClickParams;", "unbindViews", "base_release"}, mv = {1, 1, 15})
/* compiled from: UserProfilePlayableFragment.kt */
public abstract class UserProfilePlayableFragment<T extends C6968nEa> extends UniflowBaseFragment<T> implements C5849t, V, W {
    public C5808kc i;
    private C6769kJa<C5818mc, C6973nJa> j;
    private HashMap k;

    public void Rb() {
        HashMap hashMap = this.k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        C5808kc kcVar = this.i;
        if (kcVar != null) {
            C6769kJa kja = new C6769kJa(kcVar, Kd.a, null, Xb(), false, true, false, false, false, false, 980, null);
            this.j = kja;
            return;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public int Vb() {
        return l.recyclerview_with_refresh_and_toolbar_without_empty;
    }

    public void Wb() {
        C6769kJa<C5818mc, C6973nJa> kja = this.j;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public abstract C6837lJa Xb();

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<C5818mc, C6973nJa> kja = this.j;
        if (kja != null) {
            C6769kJa.a(kja, view, false, null, 0, 14, null);
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public void b() {
        a.a(this);
    }

    public APa<RVa> c() {
        APa<RVa> c = APa.c(RVa.a);
        C7471uYa.a((Object) c, "Observable.just(Unit)");
        return c;
    }

    public APa<RVa> e() {
        C6769kJa<C5818mc, C6973nJa> kja = this.j;
        if (kja != null) {
            return kja.f();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<RVa> f() {
        C6769kJa<C5818mc, C6973nJa> kja = this.j;
        if (kja != null) {
            APa<RVa> h = kja.g().h(Ld.a);
            C7471uYa.a((Object) h, "collectionRenderer.onRefresh().map { Unit }");
            return h;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<C5882zc> k() {
        C5808kc kcVar = this.i;
        if (kcVar != null) {
            return kcVar.j();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<ce> l() {
        C5808kc kcVar = this.i;
        if (kcVar != null) {
            return kcVar.k();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public void a(C6832lEa<List<C5818mc>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        C6769kJa<C5818mc, C6973nJa> kja = this.j;
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
