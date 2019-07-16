package com.soundcloud.android.profile;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.profile.P.d;
import com.soundcloud.android.profile.P.e;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001EB\u0005¢\u0006\u0002\u0010\u0005J\u001c\u0010\"\u001a\u00020#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00150%H\u0016J\u001a\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020#H\u0016J\u0010\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020\u0002H\u0014J\b\u0010/\u001a\u00020\u0002H\u0014J\u0010\u00100\u001a\u00020#2\u0006\u0010.\u001a\u00020\u0002H\u0014J\b\u00101\u001a\u000202H\u0016J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020704H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020504H\u0016J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020#04H\u0016J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020#04H\u0016J\u0017\u0010;\u001a\u00020#2\b\u0010<\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0002\u0010=J\u0017\u0010>\u001a\u00020#2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0002\u0010AJ\b\u0010B\u001a\u00020#H\u0016J\u0014\u0010C\u001a\u00020@*\u00020\u00142\u0006\u0010D\u001a\u00020\u0014H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019XD¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006F"}, d2 = {"Lcom/soundcloud/android/profile/ProfileBucketsFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/profile/ProfileBucketsPresenter;", "Lcom/soundcloud/android/profile/ProfileBucketsView;", "Lcom/soundcloud/android/profile/ProfileScreen;", "()V", "adapter", "Lcom/soundcloud/android/profile/ProfileBucketsAdapter;", "getAdapter", "()Lcom/soundcloud/android/profile/ProfileBucketsAdapter;", "setAdapter", "(Lcom/soundcloud/android/profile/ProfileBucketsAdapter;)V", "baseScrollableProfile", "Lcom/soundcloud/android/profile/BaseScrollableProfile;", "getBaseScrollableProfile$base_release", "()Lcom/soundcloud/android/profile/BaseScrollableProfile;", "setBaseScrollableProfile$base_release", "(Lcom/soundcloud/android/profile/BaseScrollableProfile;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/profile/ProfileBucketsItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "emptyStateProvider", "Lcom/soundcloud/android/profile/ProfileBucketsEmptyStateProvider;", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "profileBucketsPresenterFactory", "Lcom/soundcloud/android/profile/ProfileBucketsPresenterFactory;", "getProfileBucketsPresenterFactory$base_release", "()Lcom/soundcloud/android/profile/ProfileBucketsPresenterFactory;", "setProfileBucketsPresenterFactory$base_release", "(Lcom/soundcloud/android/profile/ProfileBucketsPresenterFactory;)V", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "Lcom/soundcloud/android/profile/ProfileBucketsViewModel;", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "", "onPlaylistClicked", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/navigation/NavigationTarget;", "onTrackClicked", "Lcom/soundcloud/android/playback/PlaybackInitiator$PlayParams;", "onViewAllClicked", "refreshSignal", "requestContent", "setEmptyViewHeight", "height", "(Ljava/lang/Integer;)V", "setSwipeToRefreshEnabled", "enabled", "", "(Ljava/lang/Boolean;)V", "unbindViews", "isIdentityEqualTo", "other", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: ProfileBucketsFragment.kt */
public final class ProfileBucketsFragment extends UniflowBaseFragment<C5781fa> implements C5826oa, Qa {
    public static final a i = new a(null);
    private final String j = "profileBuckets";
    public C k;
    public C5786ga l;
    public C5805k m;
    private C6769kJa<P, C6973nJa> n;
    private final L o = new L();
    private HashMap p;

    /* compiled from: ProfileBucketsFragment.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final Fragment a(C3508cda cda, Yca yca, SearchQuerySourceInfo searchQuerySourceInfo) {
            C7471uYa.b(cda, "userUrn");
            C7471uYa.b(yca, "screen");
            ProfileBucketsFragment profileBucketsFragment = new ProfileBucketsFragment();
            profileBucketsFragment.setArguments(B.a(cda, yca, searchQuerySourceInfo));
            return profileBucketsFragment;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public ProfileBucketsFragment() {
        SoundCloudApplication.f().a(this);
    }

    @NXa
    public static final Fragment a(C3508cda cda, Yca yca, SearchQuerySourceInfo searchQuerySourceInfo) {
        return i.a(cda, yca, searchQuerySourceInfo);
    }

    public APa<C4621nja> E() {
        C c = this.k;
        if (c != null) {
            return c.l();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public void Rb() {
        HashMap hashMap = this.p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        C c = this.k;
        if (c != null) {
            C6769kJa kja = new C6769kJa(c, new N(this), null, this.o, false, false, false, false, false, false, 1012, null);
            this.n = kja;
            return;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.j;
    }

    public int Vb() {
        return l.recyclerview_with_refresh_without_empty;
    }

    public void Wb() {
        C6769kJa<P, C6973nJa> kja = this.n;
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
        return com.soundcloud.android.profile.C5826oa.a.a(this);
    }

    public APa<RVa> f() {
        C6769kJa<P, C6973nJa> kja = this.n;
        if (kja != null) {
            return kja.g();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<com.soundcloud.android.playback.Db.a> n() {
        C c = this.k;
        if (c != null) {
            return c.k();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public APa<C4621nja> r() {
        C c = this.k;
        if (c != null) {
            return c.j();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public C5781fa Tb() {
        C5786ga gaVar = this.l;
        if (gaVar != null) {
            C3508cda b = C5526_Ha.b(getArguments(), "user_urn_key");
            String str = "Required value was null.";
            if (b != null) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    return gaVar.a(b, (SearchQuerySourceInfo) arguments.getParcelable("search_query_source_info_key"));
                }
                throw new IllegalArgumentException(str);
            }
            throw new IllegalArgumentException(str);
        }
        C7471uYa.b("profileBucketsPresenterFactory");
        throw null;
    }

    public void b() {
        com.soundcloud.android.profile.C5826oa.a.b(this);
    }

    /* access modifiers changed from: private */
    public final boolean a(P p2, P p3) {
        if (p2 instanceof e) {
            if ((p3 instanceof e) && C7471uYa.a((Object) ((e) p3).e().a(), (Object) ((e) p2).e().a())) {
                return true;
            }
        } else if (!(p2 instanceof d)) {
            return C7471uYa.a((Object) p2, (Object) p3);
        } else {
            if ((p3 instanceof d) && C7471uYa.a((Object) ((d) p3).e().a(), (Object) ((d) p2).e().a())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void b(C5781fa faVar) {
        C7471uYa.b(faVar, "presenter");
        faVar.a();
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<P, C6973nJa> kja = this.n;
        if (kja != null) {
            C6769kJa.a(kja, view, true, new M(this), 0, 8, null);
            C5805k kVar = this.m;
            if (kVar != null) {
                kVar.b(view);
            } else {
                C7471uYa.b("baseScrollableProfile");
                throw null;
            }
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r4 != null) goto L_0x004d;
     */
    public void a(C6832lEa<C5831pa, C6973nJa> lea) {
        List list;
        C7471uYa.b(lea, "viewModel");
        C5831pa paVar = (C5831pa) lea.b();
        this.o.a(paVar != null ? Boolean.valueOf(paVar.c()) : null);
        C5831pa paVar2 = (C5831pa) lea.b();
        this.o.a(paVar2 != null ? paVar2.b() : null);
        C6769kJa<P, C6973nJa> kja = this.n;
        if (kja != null) {
            C6900mEa a2 = lea.a();
            C5831pa paVar3 = (C5831pa) lea.b();
            if (paVar3 != null) {
                list = paVar3.a();
            }
            list = C6918mWa.a();
            kja.a(new C4736AEa<>(a2, list));
            return;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void a(C5781fa faVar) {
        C7471uYa.b(faVar, "presenter");
        faVar.a((C5826oa) this);
    }

    public void a(Integer num) {
        C5805k kVar = this.m;
        if (kVar != null) {
            kVar.a(getView(), num);
        } else {
            C7471uYa.b("baseScrollableProfile");
            throw null;
        }
    }

    public void a(Boolean bool) {
        C5805k kVar = this.m;
        if (kVar != null) {
            kVar.a(getView(), bool);
        } else {
            C7471uYa.b("baseScrollableProfile");
            throw null;
        }
    }
}
