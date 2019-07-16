package com.soundcloud.android.profile;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000278B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010\u001b\u001a\u00020\u001c2\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001f\u0012\u0004\u0012\u00020\u000e0\u001eH\u0016J\u001a\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u001cH\u0016J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0002H\u0014J\b\u0010(\u001a\u00020\u0002H\u0014J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0002H\u0014J\b\u0010*\u001a\u00020+H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0-H\u0016J\u0012\u0010.\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u0002000-H\u0016J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u001c0-H\u0016J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\u001c0-H\u0016J\b\u00103\u001a\u00020+H\u0014J\u000e\u00104\u001a\b\u0012\u0004\u0012\u0002050-H\u0016J\b\u00106\u001a\u00020\u001cH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188TX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u00069"}, d2 = {"Lcom/soundcloud/android/profile/UserTopTracksFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/profile/UserTopTracksPresenter;", "Lcom/soundcloud/android/profile/PlayableView;", "()V", "adapter", "Lcom/soundcloud/android/profile/UserPlayableAdapter;", "getAdapter", "()Lcom/soundcloud/android/profile/UserPlayableAdapter;", "setAdapter", "(Lcom/soundcloud/android/profile/UserPlayableAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/profile/UserPlayableItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "emptyStateProvider", "Lcom/soundcloud/android/profile/UserTopTracksFragment$UserTopTracksEmptyStateProvider;", "presenterFactory", "Lcom/soundcloud/android/profile/UserTopTracksPresenterFactory;", "getPresenterFactory", "()Lcom/soundcloud/android/profile/UserTopTracksPresenterFactory;", "setPresenterFactory", "(Lcom/soundcloud/android/profile/UserTopTracksPresenterFactory;)V", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "", "nextPageSignal", "Lio/reactivex/Observable;", "onCreate", "playlistClick", "Lcom/soundcloud/android/profile/UserPlaylistsItemClickParams;", "refreshSignal", "requestContent", "titleResId", "trackClick", "Lcom/soundcloud/android/profile/UserTracksItemClickParams;", "unbindViews", "Companion", "UserTopTracksEmptyStateProvider", "base_release"}, mv = {1, 1, 15})
/* compiled from: UserTopTracksFragment.kt */
public final class UserTopTracksFragment extends UniflowBaseFragment<Wd> implements C5849t {
    public static final a i = new a(null);
    public Xd j;
    public C5808kc k;
    private C6769kJa<C5818mc, C6973nJa> l;
    private b m = new b();
    private HashMap n;

    /* compiled from: UserTopTracksFragment.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final Fragment a(C3508cda cda, Yca yca, SearchQuerySourceInfo searchQuerySourceInfo) {
            C7471uYa.b(cda, "userUrn");
            C7471uYa.b(yca, "screen");
            UserTopTracksFragment userTopTracksFragment = new UserTopTracksFragment();
            userTopTracksFragment.setArguments(B.a(cda, yca, searchQuerySourceInfo));
            return userTopTracksFragment;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: UserTopTracksFragment.kt */
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
            return l.emptyview_profile_no_top_tracks;
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

    public void Rb() {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        C5808kc kcVar = this.k;
        if (kcVar != null) {
            C6769kJa kja = new C6769kJa(kcVar, Sd.a, null, this.m, false, false, false, false, false, false, 1012, null);
            this.l = kja;
            return;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return "userTopTracks";
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
            return kja.g();
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

    public void onCreate(Bundle bundle) {
        dagger.android.support.a.a(this);
        super.onCreate(bundle);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.user_profile_sounds_header_top_tracks;
    }

    /* access modifiers changed from: protected */
    public Wd Tb() {
        Xd xd = this.j;
        if (xd != null) {
            C3508cda b2 = C5526_Ha.b(getArguments(), "user_urn_key");
            String str = "Required value was null.";
            if (b2 != null) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    return xd.a(b2, (SearchQuerySourceInfo) arguments.getParcelable("search_query_source_info_key"));
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
    public void a(Wd wd) {
        C7471uYa.b(wd, "presenter");
        wd.a((C5849t) this);
    }

    /* access modifiers changed from: protected */
    public void b(Wd wd) {
        C7471uYa.b(wd, "presenter");
        wd.a();
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
