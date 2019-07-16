package com.soundcloud.android.collection.playhistory;

import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.collection.playhistory.Ea.a;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010\u001e\u001a\u00020\r2\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120!\u0012\u0004\u0012\u00020\u00130 H\u0016J\u001a\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\rH\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0)H\u0016J\u0010\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u0002H\u0014J\b\u0010,\u001a\u00020\u0002H\u0014J\u0010\u0010-\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u0002H\u0014J\b\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\r0)H\u0016J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\r0)H\u0016J\b\u00103\u001a\u00020\rH\u0016J\b\u00104\u001a\u00020/H\u0014J\u000e\u00105\u001a\b\u0012\u0004\u0012\u0002060)H\u0016J\b\u00107\u001a\u00020\rH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015XD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00068"}, d2 = {"Lcom/soundcloud/android/collection/playhistory/PlayHistoryFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/collection/playhistory/PlayHistoryPresenter;", "Lcom/soundcloud/android/collection/playhistory/PlayHistoryView;", "()V", "adapter", "Lcom/soundcloud/android/collection/playhistory/PlayHistoryAdapter;", "getAdapter", "()Lcom/soundcloud/android/collection/playhistory/PlayHistoryAdapter;", "setAdapter", "(Lcom/soundcloud/android/collection/playhistory/PlayHistoryAdapter;)V", "clearConfirmationClick", "Lio/reactivex/subjects/BehaviorSubject;", "", "getClearConfirmationClick", "()Lio/reactivex/subjects/BehaviorSubject;", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/collection/playhistory/PlayHistoryItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy", "()Ldagger/Lazy;", "setPresenterLazy", "(Ldagger/Lazy;)V", "accept", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "clearContent", "Lio/reactivex/Observable;", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "", "onCreate", "refreshSignal", "requestContent", "showClearContentDialog", "titleResId", "trackClick", "Lcom/soundcloud/android/foundation/domain/Urn;", "unbindViews", "base_release"}, mv = {1, 1, 15})
/* compiled from: PlayHistoryFragment.kt */
public final class PlayHistoryFragment extends UniflowBaseFragment<ka> implements Ea {
    private final String i = "PlayHistoryPresenter";
    public r j;
    public C4806CMa<ka> k;
    private C6769kJa<Q, C6973nJa> l;
    private final C6713jVa<RVa> m;
    private HashMap n;

    public PlayHistoryFragment() {
        C6713jVa<RVa> s = C6713jVa.s();
        C7471uYa.a((Object) s, "BehaviorSubject.create()");
        this.m = s;
        SoundCloudApplication.f().a(this);
    }

    public void Rb() {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        r rVar = this.j;
        if (rVar != null) {
            C6769kJa kja = new C6769kJa(rVar, L.a, null, new K(), false, false, false, false, false, false, 868, null);
            this.l = kja;
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
        return l.recyclerview_with_refresh_and_toolbar_without_empty;
    }

    public void W() {
        new C2785m().a((a) new M(this)).a(getFragmentManager());
    }

    public void Wb() {
        C6769kJa<Q, C6973nJa> kja = this.l;
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
        C6769kJa<Q, C6973nJa> kja = this.l;
        if (kja != null) {
            return kja.g();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<RVa> ia() {
        r rVar = this.j;
        if (rVar != null) {
            return rVar.j();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public APa<C3508cda> l() {
        r rVar = this.j;
        if (rVar != null) {
            return rVar.k();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.collections_play_history_header;
    }

    public C6713jVa<RVa> S() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    public ka Tb() {
        C4806CMa<ka> cMa = this.k;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (ka) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<Q, C6973nJa> kja = this.l;
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
    public void a(ka kaVar) {
        C7471uYa.b(kaVar, "presenter");
        kaVar.a((Ea) this);
    }

    /* access modifiers changed from: protected */
    public void b(ka kaVar) {
        C7471uYa.b(kaVar, "presenter");
        kaVar.a();
    }

    public void a(C6832lEa<List<Q>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        C6769kJa<Q, C6973nJa> kja = this.l;
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
