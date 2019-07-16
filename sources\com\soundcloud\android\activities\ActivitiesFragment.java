package com.soundcloud.android.activities;

import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.activities.A.a;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010\u001f\u001a\u00020 2\u0018\u0010!\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0#\u0012\u0004\u0012\u00020\u000e0\"H\u0016J\u001a\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020 H\u0016J\u0010\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\u0002H\u0014J\b\u0010,\u001a\u00020\u0002H\u0014J\u0010\u0010-\u001a\u00020 2\u0006\u0010+\u001a\u00020\u0002H\u0014J\b\u0010.\u001a\u00020/H\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\r01H\u0016J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020 01H\u0016J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020 01H\u0016J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020 01H\u0016J\b\u00105\u001a\u00020/H\u0014J\b\u00106\u001a\u00020 H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX.¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u00067"}, d2 = {"Lcom/soundcloud/android/activities/ActivitiesFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/activities/ActivitiesPresenter;", "Lcom/soundcloud/android/activities/ActivitiesView;", "()V", "adapter", "Lcom/soundcloud/android/activities/ActivitiesAdapter;", "getAdapter", "()Lcom/soundcloud/android/activities/ActivitiesAdapter;", "setAdapter", "(Lcom/soundcloud/android/activities/ActivitiesAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/activities/ActivityItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "navigationExecutor", "Lcom/soundcloud/android/navigation/NavigationExecutor;", "getNavigationExecutor", "()Lcom/soundcloud/android/navigation/NavigationExecutor;", "setNavigationExecutor", "(Lcom/soundcloud/android/navigation/NavigationExecutor;)V", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy", "()Ldagger/Lazy;", "setPresenterLazy", "(Ldagger/Lazy;)V", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "", "itemClicked", "Lio/reactivex/Observable;", "nextPageSignal", "refreshSignal", "requestContent", "titleResId", "unbindViews", "base_release"}, mv = {1, 1, 15})
/* compiled from: ActivitiesFragment.kt */
public final class ActivitiesFragment extends UniflowBaseFragment<t> implements A {
    private final String i = "ActivitiesPresenter";
    public C2540e j;
    public C4806CMa<t> k;
    public C4581ija l;
    private C6769kJa<B, C6973nJa> m;
    private HashMap n;

    public ActivitiesFragment() {
        SoundCloudApplication.f().a(this);
    }

    public void Rb() {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        C2540e eVar = this.j;
        if (eVar != null) {
            C6769kJa kja = new C6769kJa(eVar, j.a, null, new i(), false, true, false, false, false, false, 964, null);
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
        return l.recyclerview_with_refresh_and_toolbar_and_page_bg_without_empty;
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

    public APa<B> ca() {
        C2540e eVar = this.j;
        if (eVar != null) {
            return eVar.j();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<RVa> e() {
        C6769kJa<B, C6973nJa> kja = this.m;
        if (kja != null) {
            return kja.f();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<RVa> f() {
        C6769kJa<B, C6973nJa> kja = this.m;
        if (kja != null) {
            return kja.g();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.side_menu_notifications;
    }

    /* access modifiers changed from: protected */
    public t Tb() {
        C4806CMa<t> cMa = this.k;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (t) obj;
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
        a.a(this);
    }

    /* access modifiers changed from: protected */
    public void a(t tVar) {
        C7471uYa.b(tVar, "presenter");
        tVar.a((A) this);
    }

    /* access modifiers changed from: protected */
    public void b(t tVar) {
        C7471uYa.b(tVar, "presenter");
        tVar.a();
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
