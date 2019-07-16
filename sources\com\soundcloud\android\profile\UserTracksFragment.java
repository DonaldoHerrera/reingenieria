package com.soundcloud.android.profile;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000267B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010\u001b\u001a\u00020\u001c2\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001f\u0012\u0004\u0012\u00020\u000e0\u001eH\u0016J\u001a\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u001cH\u0016J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0002H\u0014J\b\u0010(\u001a\u00020\u0002H\u0014J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0002H\u0014J\b\u0010*\u001a\u00020+H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0-H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020/0-H\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\u001c0-H\u0016J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u001c0-H\u0016J\b\u00102\u001a\u00020+H\u0014J\u000e\u00103\u001a\b\u0012\u0004\u0012\u0002040-H\u0016J\b\u00105\u001a\u00020\u001cH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188TX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u00068"}, d2 = {"Lcom/soundcloud/android/profile/UserTracksFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/profile/UserTracksPresenter;", "Lcom/soundcloud/android/profile/PlayableView;", "()V", "adapter", "Lcom/soundcloud/android/profile/UserPlayableAdapter;", "getAdapter", "()Lcom/soundcloud/android/profile/UserPlayableAdapter;", "setAdapter", "(Lcom/soundcloud/android/profile/UserPlayableAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/profile/UserPlayableItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "emptyStateProvider", "Lcom/soundcloud/android/profile/UserTracksFragment$UserTracksEmptyStateProvider;", "presenterFactory", "Lcom/soundcloud/android/profile/UserTracksPresenterFactory;", "getPresenterFactory", "()Lcom/soundcloud/android/profile/UserTracksPresenterFactory;", "setPresenterFactory", "(Lcom/soundcloud/android/profile/UserTracksPresenterFactory;)V", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "", "nextPageSignal", "Lio/reactivex/Observable;", "playlistClick", "Lcom/soundcloud/android/profile/UserPlaylistsItemClickParams;", "refreshSignal", "requestContent", "titleResId", "trackClick", "Lcom/soundcloud/android/profile/UserTracksItemClickParams;", "unbindViews", "Companion", "UserTracksEmptyStateProvider", "base_release"}, mv = {1, 1, 15})
/* compiled from: UserTracksFragment.kt */
public final class UserTracksFragment extends UniflowBaseFragment<ge> implements C5849t {
    public static final a i = new a(null);
    public he j;
    public C5808kc k;
    private C6769kJa<C5818mc, C6973nJa> l;
    private b m = new b();
    private HashMap n;

    /* compiled from: UserTracksFragment.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final Fragment a(C3508cda cda, Yca yca, SearchQuerySourceInfo searchQuerySourceInfo) {
            C7471uYa.b(cda, "userUrn");
            C7471uYa.b(yca, "screen");
            UserTracksFragment userTracksFragment = new UserTracksFragment();
            userTracksFragment.setArguments(B.a(cda, yca, searchQuerySourceInfo));
            return userTracksFragment;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: UserTracksFragment.kt */
    public static final class b implements C6837lJa {
        public void a(View view, C6973nJa nja) {
            C7471uYa.b(view, "view");
            C7471uYa.b(nja, "errorType");
            defpackage.C6837lJa.a.a(this, view, nja);
        }

        public void b(View view) {
            C7471uYa.b(view, "view");
            defpackage.C6837lJa.a.b(this, view);
        }

        public int c() {
            return defpackage.C6837lJa.a.c(this);
        }

        public int d() {
            return defpackage.C6837lJa.a.a(this);
        }

        public int b() {
            return l.emptyview_profile_no_tracks;
        }

        public void a(View view) {
            C7471uYa.b(view, "view");
            defpackage.C6837lJa.a.a((C6837lJa) this, view);
        }

        public int a(C6973nJa nja) {
            C7471uYa.b(nja, "legacyError");
            return defpackage.C6837lJa.a.a((C6837lJa) this, nja);
        }

        public int a() {
            return defpackage.C6837lJa.a.b(this);
        }
    }

    public UserTracksFragment() {
        SoundCloudApplication.f().a(this);
    }

    public void Rb() {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        C5808kc kcVar = this.k;
        if (kcVar != null) {
            C6769kJa kja = new C6769kJa(kcVar, Zd.a, null, this.m, false, true, false, false, false, false, 980, null);
            this.l = kja;
            return;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return "userTracks";
    }

    public int Vb() {
        return l.recyclerview_with_refresh_and_toolbar_without_empty;
    }

    public void Wb() {
        C6769kJa<C5818mc, C6973nJa> kja = this.l;
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
        C6769kJa<C5818mc, C6973nJa> kja = this.l;
        if (kja != null) {
            return kja.f();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<RVa> f() {
        C6769kJa<C5818mc, C6973nJa> kja = this.l;
        if (kja != null) {
            APa<RVa> h = kja.g().h(_d.a);
            C7471uYa.a((Object) h, "collectionRenderer.onRefresh().map { Unit }");
            return h;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<C5882zc> k() {
        APa<C5882zc> l2 = APa.l();
        C7471uYa.a((Object) l2, "Observable.never<UserPlaylistsItemClickParams>()");
        return l2;
    }

    public APa<ce> l() {
        C5808kc kcVar = this.k;
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

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.user_profile_sounds_header_tracks;
    }

    /* access modifiers changed from: protected */
    public ge Tb() {
        he heVar = this.j;
        if (heVar != null) {
            C3508cda b2 = C5526_Ha.b(getArguments(), "user_urn_key");
            String str = "Required value was null.";
            if (b2 != null) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    return heVar.a(b2, (SearchQuerySourceInfo) arguments.getParcelable("search_query_source_info_key"));
                }
                throw new IllegalArgumentException(str);
            }
            throw new IllegalArgumentException(str);
        }
        C7471uYa.b("presenterFactory");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<C5818mc, C6973nJa> kja = this.l;
        if (kja != null) {
            C6769kJa.a(kja, view, false, null, 0, 14, null);
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public void b() {
        com.soundcloud.android.profile.C5849t.a.a(this);
    }

    /* access modifiers changed from: protected */
    public void a(ge geVar) {
        C7471uYa.b(geVar, "presenter");
        geVar.a((C5849t) this);
    }

    /* access modifiers changed from: protected */
    public void b(ge geVar) {
        C7471uYa.b(geVar, "presenter");
        geVar.a();
    }

    public void a(C6832lEa<List<C5818mc>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        C6769kJa<C5818mc, C6973nJa> kja = this.l;
        if (kja != null) {
            C6900mEa a2 = lea.a();
            List list = (List) lea.b();
            if (list == null) {
                list = C6918mWa.a();
            }
            kja.a(new C4736AEa<>(a2, list));
            return;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }
}
