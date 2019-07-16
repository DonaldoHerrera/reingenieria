package com.soundcloud.android.profile;

import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001:B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010\"\u001a\u00020#2\u0018\u0010$\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0&\u0012\u0004\u0012\u00020\u000e0%H\u0016J\u001a\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020#H\u0016J\u0010\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020\u0002H\u0014J\u0010\u0010/\u001a\n 0*\u0004\u0018\u00010\u00020\u0002H\u0014J\u0010\u00101\u001a\u00020#2\u0006\u0010.\u001a\u00020\u0002H\u0014J\b\u00102\u001a\u000203H\u0016J,\u00104\u001a&\u0012\f\u0012\n 0*\u0004\u0018\u00010606 0*\u0012\u0012\f\u0012\n 0*\u0004\u0018\u00010606\u0018\u00010505H\u0016J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0016J\b\u00108\u001a\u00020#H\u0016J\b\u00109\u001a\u000206H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX.¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u0017XD¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006;"}, d2 = {"Lcom/soundcloud/android/profile/UserDetailsFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/profile/UserDetailsPresenter;", "Lcom/soundcloud/android/profile/UserDetailsView;", "()V", "adapterFactory", "Lcom/soundcloud/android/profile/UserDetailAdapter$Factory;", "getAdapterFactory", "()Lcom/soundcloud/android/profile/UserDetailAdapter$Factory;", "setAdapterFactory", "(Lcom/soundcloud/android/profile/UserDetailAdapter$Factory;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/profile/UserDetailItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "followersClickListener", "Lio/reactivex/subjects/PublishSubject;", "Lcom/soundcloud/android/profile/UserFollowsItem;", "getFollowersClickListener", "()Lio/reactivex/subjects/PublishSubject;", "followingsClickListener", "getFollowingsClickListener", "linkClickListener", "", "getLinkClickListener", "presenterKey", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy", "()Ldagger/Lazy;", "setPresenterLazy", "(Ldagger/Lazy;)V", "accept", "", "loaderState", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "kotlin.jvm.PlatformType", "disconnectPresenter", "getResId", "", "refreshSignal", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/profile/UserDetailsParams;", "requestContent", "unbindViews", "userDetailsParams", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: UserDetailsFragment.kt */
public final class UserDetailsFragment extends UniflowBaseFragment<C5841rb> implements C5851tb {
    public static final a i = new a(null);
    private final String j = "UserDetailsPresenterKey";
    private final C6781kVa<String> k;
    private final C6781kVa<Gb> l;
    private final C6781kVa<Gb> m;
    public C4806CMa<C5841rb> n;
    public com.soundcloud.android.profile.C5787gb.a o;
    private C6769kJa<C5797ib, C6973nJa> p;
    private HashMap q;

    /* compiled from: UserDetailsFragment.kt */
    public static final class a {
        private a() {
        }

        public final UserDetailsFragment a(C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo) {
            C7471uYa.b(cda, "userUrn");
            UserDetailsFragment userDetailsFragment = new UserDetailsFragment();
            Bundle bundle = new Bundle();
            C5526_Ha.b(bundle, "user_urn_key", cda);
            bundle.putParcelable("search_query_source_info_key", searchQuerySourceInfo);
            userDetailsFragment.setArguments(bundle);
            return userDetailsFragment;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public UserDetailsFragment() {
        C6781kVa<String> s = C6781kVa.s();
        String str = "PublishSubject.create()";
        C7471uYa.a((Object) s, str);
        this.k = s;
        C6781kVa<Gb> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, str);
        this.l = s2;
        C6781kVa<Gb> s3 = C6781kVa.s();
        C7471uYa.a((Object) s3, str);
        this.m = s3;
        SoundCloudApplication.f().a(this);
    }

    /* access modifiers changed from: private */
    public final C5817mb Yb() {
        C3508cda b = C5526_Ha.b(getArguments(), "user_urn_key");
        if (b != null) {
            Bundle arguments = getArguments();
            return new C5817mb(b, arguments != null ? (SearchQuerySourceInfo) arguments.getParcelable("search_query_source_info_key") : null);
        }
        throw new IllegalArgumentException("Missing required param user_urn_key");
    }

    public void Rb() {
        HashMap hashMap = this.q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        com.soundcloud.android.profile.C5787gb.a aVar = this.o;
        if (aVar != null) {
            C6769kJa kja = new C6769kJa(aVar.a(Ja(), Ea(), Ha()), C5802jb.a, null, null, false, false, false, false, false, false, 1012, null);
            this.p = kja;
            return;
        }
        C7471uYa.b("adapterFactory");
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
        C6769kJa<C5797ib, C6973nJa> kja = this.p;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public APa<C5817mb> c() {
        APa<C5817mb> c = APa.c(Yb());
        C7471uYa.a((Object) c, "Observable.just(userDetailsParams())");
        return c;
    }

    public APa<RVa> e() {
        return com.soundcloud.android.profile.C5851tb.a.a(this);
    }

    public APa<C5817mb> f() {
        C6769kJa<C5797ib, C6973nJa> kja = this.p;
        if (kja != null) {
            return kja.g().h(new C5807kb(this));
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public C6781kVa<Gb> Ea() {
        return this.m;
    }

    public C6781kVa<String> Ha() {
        return this.k;
    }

    public C6781kVa<Gb> Ja() {
        return this.l;
    }

    /* access modifiers changed from: protected */
    public C5841rb Tb() {
        C4806CMa<C5841rb> cMa = this.n;
        if (cMa != null) {
            return (C5841rb) cMa.get();
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void b() {
        com.soundcloud.android.profile.C5851tb.a.b(this);
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<C5797ib, C6973nJa> kja = this.p;
        if (kja != null) {
            C6769kJa.a(kja, view, false, null, 0, 14, null);
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void b(C5841rb rbVar) {
        C7471uYa.b(rbVar, "presenter");
        rbVar.a();
    }

    public void a(C6832lEa<List<C5797ib>, C6973nJa> lea) {
        C7471uYa.b(lea, "loaderState");
        List list = (List) lea.b();
        if (list == null) {
            list = C5797ib.a.a(Yb());
        }
        List a2 = C6850lWa.a(C5788gc.b);
        ArrayList arrayList = new ArrayList();
        for (Object next : a2) {
            C5788gc gcVar = (C5788gc) next;
            if (lea.a().d()) {
                arrayList.add(next);
            }
        }
        List c = C7676xWa.c((Collection) list, (Iterable) arrayList);
        C6769kJa<C5797ib, C6973nJa> kja = this.p;
        if (kja != null) {
            C6900mEa mea = new C6900mEa(false, false, null, null, false, 31, null);
            kja.a(new C4736AEa<>(mea, c));
            return;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void a(C5841rb rbVar) {
        C7471uYa.b(rbVar, "presenter");
        rbVar.a((C5851tb) this);
    }
}
