package com.soundcloud.android.features.library.artists;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.features.library.aa.p;
import com.soundcloud.android.features.library.artists.a.C0081a;
import com.soundcloud.android.profile.C5803jc;
import com.soundcloud.android.profile.Rb;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001?B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010\u001f\u001a\u00020 2\u0018\u0010!\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0#\u0012\u0004\u0012\u00020\u000e0\"H\u0016J\u001a\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020 H\u0016J\u0010\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\u0002H\u0014J\b\u0010,\u001a\u00020\u0002H\u0014J\u0010\u0010-\u001a\u00020 2\u0006\u0010+\u001a\u00020\u0002H\u0014J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020 0/H\u0016J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000203H\u0002J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020 0/H\u0016J\u0010\u00105\u001a\u00020 2\u0006\u00106\u001a\u000207H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u0002030/H\u0016J\u000e\u00109\u001a\b\u0012\u0004\u0012\u0002030/H\u0016J\u000f\u0010:\u001a\u0004\u0018\u000101H\u0014¢\u0006\u0002\u0010;J\b\u0010<\u001a\u00020 H\u0016J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020>0/H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX.¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006@"}, d2 = {"Lcom/soundcloud/android/features/library/artists/ArtistsFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/features/library/artists/ArtistsPresenter;", "Lcom/soundcloud/android/features/library/artists/ArtistView;", "()V", "adapter", "Lcom/soundcloud/android/profile/UserListAdapter;", "getAdapter$collections_ui_release", "()Lcom/soundcloud/android/profile/UserListAdapter;", "setAdapter$collections_ui_release", "(Lcom/soundcloud/android/profile/UserListAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/users/UserItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "emptyStateProvider", "Lcom/soundcloud/android/features/library/artists/ArtistsEmptyStateProvider;", "getEmptyStateProvider", "()Lcom/soundcloud/android/features/library/artists/ArtistsEmptyStateProvider;", "emptyStateProvider$delegate", "Lkotlin/Lazy;", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy$collections_ui_release", "()Ldagger/Lazy;", "setPresenterLazy$collections_ui_release", "(Ldagger/Lazy;)V", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "emptyActionClick", "Lio/reactivex/Observable;", "getResId", "", "getUserParamsFromBundle", "Lcom/soundcloud/android/profile/UserParams;", "nextPageSignal", "onAttach", "context", "Landroid/content/Context;", "refreshSignal", "requestContent", "titleResId", "()Ljava/lang/Integer;", "unbindViews", "userClick", "Lcom/soundcloud/android/features/library/artists/UserItemClickParams;", "Companion", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: ArtistsFragment.kt */
public final class ArtistsFragment extends UniflowBaseFragment<o> implements a {
    static final /* synthetic */ DZa[] i = {HYa.a((DYa) new EYa(HYa.a(ArtistsFragment.class), "emptyStateProvider", "getEmptyStateProvider()Lcom/soundcloud/android/features/library/artists/ArtistsEmptyStateProvider;"))};
    public static final a j = new a(null);
    public C4806CMa<o> k;
    public Rb l;
    private C6769kJa<C4954HFa, C6973nJa> m;
    private final String n = "CollectionFollowingsPresenterKey";
    private final C7744yVa o = BVa.a(e.a);
    private HashMap p;

    /* compiled from: ArtistsFragment.kt */
    public static final class a {
        private a() {
        }

        public final ArtistsFragment a(C3508cda cda) {
            C7471uYa.b(cda, "userUrn");
            ArtistsFragment artistsFragment = new ArtistsFragment();
            artistsFragment.setArguments(ArtistsFragment.j.a(C5803jc.a, cda));
            return artistsFragment;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        private final Bundle a(com.soundcloud.android.profile.C5803jc.a aVar, C3508cda cda) {
            Bundle bundle = new Bundle();
            C5526_Ha.b(bundle, "user_urn_key", cda);
            return bundle;
        }
    }

    private final c Yb() {
        C7744yVa yva = this.o;
        DZa dZa = i[0];
        return (c) yva.getValue();
    }

    /* access modifiers changed from: private */
    public final C5803jc Zb() {
        com.soundcloud.android.profile.C5803jc.a aVar = C5803jc.a;
        Bundle arguments = getArguments();
        if (arguments != null) {
            return aVar.a(arguments);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public APa<q> K() {
        Rb rb = this.l;
        if (rb != null) {
            APa<q> h = rb.j().h(g.a);
            C7471uYa.a((Object) h, "adapter.userClick().map …n.COLLECTION_FOLLOWING) }");
            return h;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public Integer Qb() {
        return Integer.valueOf(p.profile_following);
    }

    public void Rb() {
        HashMap hashMap = this.p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        Rb rb = this.l;
        if (rb != null) {
            C6769kJa kja = new C6769kJa(rb, d.a, null, Yb(), false, true, false, false, false, false, 980, null);
            this.m = kja;
            return;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.n;
    }

    public int Vb() {
        return l.recyclerview_with_refresh_and_toolbar_and_page_bg_without_empty;
    }

    public void Wb() {
        C6769kJa<C4954HFa, C6973nJa> kja = this.m;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public APa<RVa> X() {
        return Yb().e();
    }

    public APa<C5803jc> c() {
        APa<C5803jc> c = APa.c(Zb());
        C7471uYa.a((Object) c, "Observable.just(getUserParamsFromBundle())");
        return c;
    }

    public APa<RVa> e() {
        C6769kJa<C4954HFa, C6973nJa> kja = this.m;
        if (kja != null) {
            return kja.f();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<C5803jc> f() {
        C6769kJa<C4954HFa, C6973nJa> kja = this.m;
        if (kja != null) {
            APa<C5803jc> h = kja.g().h(new f(this));
            C7471uYa.a((Object) h, "collectionRenderer.onRef…tUserParamsFromBundle() }");
            return h;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public void onAttach(Context context) {
        C7471uYa.b(context, "context");
        dagger.android.support.a.a(this);
        super.onAttach(context);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    /* access modifiers changed from: protected */
    public o Tb() {
        C4806CMa<o> cMa = this.k;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (o) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void b() {
        C0081a.a(this);
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<C4954HFa, C6973nJa> kja = this.m;
        if (kja != null) {
            C6769kJa.a(kja, view, true, null, 0, 12, null);
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void b(o oVar) {
        C7471uYa.b(oVar, "presenter");
        oVar.a();
    }

    public void a(C6832lEa<List<C4954HFa>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        List list = (List) lea.b();
        if (list == null) {
            list = C6918mWa.a();
        }
        C6769kJa<C4954HFa, C6973nJa> kja = this.m;
        if (kja != null) {
            kja.a(new C4736AEa<>(lea.a(), list));
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void a(o oVar) {
        C7471uYa.b(oVar, "presenter");
        oVar.a((a) this);
    }
}
