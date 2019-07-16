package com.soundcloud.android.discovery.systemplaylist;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.view.CustomFontTitleToolbar;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002;<B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010\u001b\u001a\u00020\u001c2\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001f\u0012\u0004\u0012\u00020\u000e0\u001eH\u0016J\u001a\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u001cH\u0016J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0002H\u0014J\b\u0010(\u001a\u00020\u0002H\u0014J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0002H\u0014J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u001cH\u0002J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c00H\u0016J\u0012\u00101\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u00102\u001a\u00020\u001c2\u0006\u00103\u001a\u000204H\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020-00H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020-00H\u0016J$\u00107\u001a\u00020\u001c2\u001a\u0010\u001d\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001eH\u0002J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020900H\u0016J\b\u0010:\u001a\u00020\u001cH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012XD¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006="}, d2 = {"Lcom/soundcloud/android/discovery/systemplaylist/SystemPlaylistFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/discovery/systemplaylist/SystemPlaylistPresenter;", "Lcom/soundcloud/android/discovery/systemplaylist/SystemPlaylistView;", "()V", "adapter", "Lcom/soundcloud/android/discovery/systemplaylist/SystemPlaylistAdapter;", "getAdapter$base_release", "()Lcom/soundcloud/android/discovery/systemplaylist/SystemPlaylistAdapter;", "setAdapter$base_release", "(Lcom/soundcloud/android/discovery/systemplaylist/SystemPlaylistAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/discovery/systemplaylist/SystemPlaylistViewModelItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "emptyStateProvider", "Lcom/soundcloud/android/discovery/systemplaylist/SystemPlaylistFragment$SystemPlaylistEmptyStateProvider;", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy$base_release", "()Ldagger/Lazy;", "setPresenterLazy$base_release", "(Ldagger/Lazy;)V", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "", "getSystemPlaylistParamsFromBundle", "Lcom/soundcloud/android/discovery/systemplaylist/SystemPlaylistParams;", "initTitleBar", "nextPageSignal", "Lio/reactivex/Observable;", "onCreate", "refreshBundle", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "refreshSignal", "requestContent", "setTitle", "trackPlayClick", "Lcom/soundcloud/android/discovery/systemplaylist/TrackClickParams;", "unbindViews", "Companion", "SystemPlaylistEmptyStateProvider", "base_release"}, mv = {1, 1, 15})
/* compiled from: SystemPlaylistFragment.kt */
public final class SystemPlaylistFragment extends UniflowBaseFragment<T> implements aa {
    public static final a i = new a(null);
    public C4806CMa<T> j;
    public C3521l k;
    private C6769kJa<ca, C6973nJa> l;
    private b m = new b();
    private final String n = "SystemPlaylistPresenter";
    private HashMap o;

    /* compiled from: SystemPlaylistFragment.kt */
    public static final class a {
        private a() {
        }

        public final SystemPlaylistFragment a(G g) {
            C7471uYa.b(g, "systemPlaylistParams");
            SystemPlaylistFragment systemPlaylistFragment = new SystemPlaylistFragment();
            Bundle bundle = new Bundle();
            C3508cda b = g.b();
            if (b != null) {
                C6836lIa.a(bundle, "extra_urn", b);
            }
            if (g.a() != null) {
                bundle.putString("extra_permalink", g.a());
            }
            systemPlaylistFragment.setArguments(bundle);
            return systemPlaylistFragment;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: SystemPlaylistFragment.kt */
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
            return l.emptyview_server_error;
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

    public SystemPlaylistFragment() {
        SoundCloudApplication.f().a(this);
    }

    /* access modifiers changed from: private */
    public final G Yb() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return new G(C5526_Ha.b(arguments, "extra_urn"), arguments.getString("extra_permalink"));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void Zb() {
        if (((CustomFontTitleToolbar) c(i.toolbar_id)) != null && getActivity() != null) {
            FragmentActivity activity = getActivity();
            Integer num = null;
            if (!(activity instanceof AppCompatActivity)) {
                activity = null;
            }
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
            if (appCompatActivity != null) {
                ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
                if (supportActionBar != null) {
                    num = Integer.valueOf(supportActionBar.g());
                }
                appCompatActivity.setSupportActionBar((CustomFontTitleToolbar) appCompatActivity.findViewById(i.toolbar_id));
                if (num != null) {
                    num.intValue();
                    ActionBar supportActionBar2 = appCompatActivity.getSupportActionBar();
                    if (supportActionBar2 != null) {
                        supportActionBar2.a(num.intValue(), 4);
                    }
                }
                appCompatActivity.setTitle("");
            }
        }
    }

    public APa<ea> P() {
        C3521l lVar = this.k;
        if (lVar != null) {
            return lVar.j();
        }
        C7471uYa.b("adapter");
        throw null;
    }

    public void Rb() {
        HashMap hashMap = this.o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
        C3521l lVar = this.k;
        if (lVar != null) {
            C6769kJa kja = new C6769kJa(lVar, C3525p.a, null, this.m, true, true, false, false, false, false, 964, null);
            this.l = kja;
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
        C6769kJa<ca, C6973nJa> kja = this.l;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public APa<G> c() {
        APa<G> c = APa.c(Yb());
        C7471uYa.a((Object) c, "Observable.just(getSyste…aylistParamsFromBundle())");
        return c;
    }

    public View c(int i2) {
        if (this.o == null) {
            this.o = new HashMap();
        }
        View view = (View) this.o.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.o.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public APa<RVa> e() {
        C6769kJa<ca, C6973nJa> kja = this.l;
        if (kja != null) {
            return kja.f();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public APa<G> f() {
        C6769kJa<ca, C6973nJa> kja = this.l;
        if (kja != null) {
            APa<G> h = kja.g().h(new C3526q(this));
            C7471uYa.a((Object) h, "collectionRenderer.onRef…ylistParamsFromBundle() }");
            return h;
        }
        C7471uYa.b("collectionRenderer");
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
    public T Tb() {
        C4806CMa<T> cMa = this.j;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (T) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void b() {
        com.soundcloud.android.discovery.systemplaylist.aa.a.a(this);
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        C6769kJa<ca, C6973nJa> kja = this.l;
        if (kja != null) {
            C6769kJa.a(kja, view, false, null, 0, 14, null);
            Zb();
            return;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void b(T t) {
        C7471uYa.b(t, "presenter");
        t.a();
    }

    private final void b(C6832lEa<List<ca>, C6973nJa> lea) {
        if (lea != null) {
            List list = (List) lea.b();
            if (list != null) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    C3532x b2 = ((ca) list.get(0)).b();
                    if (b2 instanceof C3528t) {
                        activity.setTitle(((C3528t) b2).h());
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Input ");
                    sb.append(b2);
                    sb.append(" not of type ");
                    sb.append(C3528t.class.getSimpleName());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
        C7471uYa.b(t, "presenter");
        t.a((aa) this);
    }

    public void a(C6832lEa<List<ca>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        b(lea);
        C6769kJa<ca, C6973nJa> kja = this.l;
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

    public void a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        Bundle arguments = getArguments();
        if (arguments != null) {
            C7471uYa.a((Object) arguments, "arguments!!");
            C6836lIa.a(arguments, "extra_urn", cda);
            return;
        }
        C7471uYa.a();
        throw null;
    }
}
