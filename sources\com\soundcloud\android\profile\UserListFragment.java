package com.soundcloud.android.profile;

import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.profile.C5768cc;
import com.soundcloud.android.profile.C5803jc.a;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\"\u0010 \u001a\u00020!2\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140$\u0012\u0004\u0012\u00020\u00150#H\u0016J\u001a\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020!H\u0016J\u0015\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010-J\u0015\u0010.\u001a\u00020!2\u0006\u0010,\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010-J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u000202H&J\u0006\u00103\u001a\u000204J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020!06H\u0016J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020406H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020406H\u0016J\b\u00109\u001a\u00020!H\u0016J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020;06H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X.¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u0017X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006<"}, d2 = {"Lcom/soundcloud/android/profile/UserListFragment;", "Presenter", "Lcom/soundcloud/android/profile/UserListPresenter;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/profile/UserListView;", "()V", "accountOperations", "Lcom/soundcloud/android/accounts/AccountOperations;", "getAccountOperations", "()Lcom/soundcloud/android/accounts/AccountOperations;", "setAccountOperations", "(Lcom/soundcloud/android/accounts/AccountOperations;)V", "adapter", "Lcom/soundcloud/android/profile/UserListAdapter;", "getAdapter$base_release", "()Lcom/soundcloud/android/profile/UserListAdapter;", "setAdapter$base_release", "(Lcom/soundcloud/android/profile/UserListAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/users/UserItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "emptyStateProvider", "Lcom/soundcloud/android/view/collection/EmptyStateProvider;", "getEmptyStateProvider", "()Lcom/soundcloud/android/view/collection/EmptyStateProvider;", "presenterFactory", "Lcom/soundcloud/android/profile/UserListPresenterFactory;", "getPresenterFactory", "()Lcom/soundcloud/android/profile/UserListPresenterFactory;", "setPresenterFactory", "(Lcom/soundcloud/android/profile/UserListPresenterFactory;)V", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "(Lcom/soundcloud/android/profile/UserListPresenter;)V", "disconnectPresenter", "getResId", "", "getScreen", "Lcom/soundcloud/android/foundation/domain/Screen;", "getUserParamsFromBundle", "Lcom/soundcloud/android/profile/UserParams;", "nextPageSignal", "Lio/reactivex/Observable;", "refreshSignal", "requestContent", "unbindViews", "userClick", "Lcom/soundcloud/android/profile/UserItemClickParams;", "base_release"}, mv = {1, 1, 15})
/* compiled from: UserListFragment.kt */
public abstract class UserListFragment<Presenter extends C5768cc> extends UniflowBaseFragment<Presenter> implements C5783fc {
    public C5773dc i;
    public C2526g j;
    public Rb k;
    private C6769kJa<C4954HFa, C6973nJa> l;
    private HashMap m;

    public APa<Hb> K() {
        Rb rb = this.k;
        if (rb != null) {
            APa<Hb> h = rb.j().h(new Wb(this));
            C7471uYa.a((Object) h, "adapter.userClick().map …t.userUrn, getScreen()) }");
            return h;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public void Rb() {
        HashMap hashMap = this.m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        Rb rb = this.k;
        if (rb != null) {
            C6769kJa kja = new C6769kJa(rb, Ub.a, null, Yb(), false, true, false, false, false, false, 980, null);
            this.l = kja;
            return;
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public abstract Yca Ta();

    public int Vb() {
        return l.recyclerview_with_refresh_and_toolbar_without_empty;
    }

    public void Wb() {
        C6769kJa<C4954HFa, C6973nJa> kja = this.l;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public final C2526g Xb() {
        C2526g gVar = this.j;
        if (gVar != null) {
            return gVar;
        }
        C7471uYa.b("accountOperations");
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract C6837lJa Yb();

    public final C5773dc Zb() {
        C5773dc dcVar = this.i;
        if (dcVar != null) {
            return dcVar;
        }
        C7471uYa.b("presenterFactory");
        throw null;
    }

    public final C5803jc _b() {
        a aVar = C5803jc.a;
        Bundle arguments = getArguments();
        if (arguments != null) {
            return aVar.a(arguments);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public APa<C5803jc> c() {
        APa<C5803jc> c = APa.c(_b());
        C7471uYa.a((Object) c, "Observable.just(getUserParamsFromBundle())");
        return c;
    }

    public APa<RVa> e() {
        C6769kJa<C4954HFa, C6973nJa> kja = this.l;
        if (kja != null) {
            return kja.f();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<C5803jc> f() {
        C6769kJa<C4954HFa, C6973nJa> kja = this.l;
        if (kja != null) {
            APa<C5803jc> h = kja.g().h(new Vb(this));
            C7471uYa.a((Object) h, "collectionRenderer.onRef…tUserParamsFromBundle() }");
            return h;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<C4954HFa, C6973nJa> kja = this.l;
        if (kja != null) {
            C6769kJa.a(kja, view, false, null, 0, 14, null);
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public void b() {
        C5783fc.a.a(this);
    }

    public void a(C6832lEa<List<C4954HFa>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        List list = (List) lea.b();
        if (list == null) {
            list = C6918mWa.a();
        }
        C6769kJa<C4954HFa, C6973nJa> kja = this.l;
        if (kja != null) {
            kja.a(new C4736AEa<>(lea.a(), list));
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void b(Presenter presenter) {
        C7471uYa.b(presenter, "presenter");
        presenter.a();
    }

    /* access modifiers changed from: protected */
    public void a(Presenter presenter) {
        C7471uYa.b(presenter, "presenter");
        presenter.a((C5783fc) this);
    }
}
