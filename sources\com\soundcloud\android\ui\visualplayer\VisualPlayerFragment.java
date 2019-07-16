package com.soundcloud.android.ui.visualplayer;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.V;
import com.soundcloud.android.playback.ui.C4451fb;
import com.soundcloud.android.playback.ui.view.PlayerTrackPager;
import com.soundcloud.android.ui.visualplayer.d.a;
import com.soundcloud.android.ui.visualplayer.e.l;
import com.soundcloud.android.ui.visualplayer.e.p;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\"\u0010\u001a\u001a\u00020\u001b2\u0018\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001e\u0012\u0004\u0012\u00020\u000f0\u001dH\u0016J\u001a\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001bH\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0002H\u0014J\b\u0010'\u001a\u00020\u0002H\u0014J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0002H\u0014J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u000204H\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b06H\u0016J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\u001b06H\u0016J\b\u00108\u001a\u00020,H\u0014J\b\u00109\u001a\u00020\u001bH\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX.¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006:"}, d2 = {"Lcom/soundcloud/android/ui/visualplayer/VisualPlayerFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/ui/visualplayer/VisualPlayerPresenter;", "Lcom/soundcloud/android/ui/visualplayer/PlayerView;", "Lcom/soundcloud/android/playback/ui/IPlayerFragment;", "()V", "adapter", "Lcom/soundcloud/android/ui/visualplayer/VisualPlayerAdapter;", "getAdapter$visual_player_release", "()Lcom/soundcloud/android/ui/visualplayer/VisualPlayerAdapter;", "setAdapter$visual_player_release", "(Lcom/soundcloud/android/ui/visualplayer/VisualPlayerAdapter;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/ui/visualplayer/PlayerItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy$visual_player_release", "()Ldagger/Lazy;", "setPresenterLazy$visual_player_release", "(Ldagger/Lazy;)V", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getPlayerPager", "Lcom/soundcloud/android/playback/ui/view/PlayerTrackPager;", "getResId", "", "handleBackPressed", "", "onAttach", "context", "Landroid/content/Context;", "onPlayerSlide", "slideOffset", "", "refreshSignal", "Lio/reactivex/Observable;", "requestContent", "titleResId", "unbindViews", "visual-player_release"}, mv = {1, 1, 15})
/* compiled from: VisualPlayerFragment.kt */
public final class VisualPlayerFragment extends UniflowBaseFragment<t> implements d, C4451fb {
    private final String i = "NewPlayerPresenterKey";
    public C4806CMa<t> j;
    public h k;
    private C6769kJa<c, C6973nJa> l;

    public PlayerTrackPager Bb() {
        return null;
    }

    public boolean Sa() {
        return false;
    }

    public void Sb() {
        h hVar = this.k;
        if (hVar != null) {
            C6769kJa kja = new C6769kJa(hVar, l.a, null, new m(), true, true, false, false, false, false, 964, null);
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
        return l.player_fragment_new;
    }

    public void Wb() {
        C6769kJa<c, C6973nJa> kja = this.l;
        if (kja != null) {
            kja.b();
        } else {
            C7471uYa.b("collectionRenderer");
            throw null;
        }
    }

    public void a(float f) {
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
        C6769kJa<c, C6973nJa> kja = this.l;
        if (kja != null) {
            return kja.g();
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public void onAttach(Context context) {
        C7471uYa.b(context, "context");
        dagger.android.support.a.a(this);
        super.onAttach(context);
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.app_id;
    }

    /* access modifiers changed from: protected */
    public t Tb() {
        C4806CMa<t> cMa = this.j;
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
        C6769kJa<c, C6973nJa> kja = this.l;
        String str = "collectionRenderer";
        if (kja != null) {
            C6769kJa.a(kja, view, false, new k(this), 0, 10, null);
            C6769kJa<c, C6973nJa> kja2 = this.l;
            if (kja2 != null) {
                RecyclerView c = kja2.c();
                if (c != null) {
                    c.setNestedScrollingEnabled(false);
                    new V().a(c);
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            C7471uYa.b(str);
            throw null;
        }
        C7471uYa.b(str);
        throw null;
    }

    public void b() {
        a.b(this);
    }

    /* access modifiers changed from: protected */
    public void b(t tVar) {
        C7471uYa.b(tVar, "presenter");
        tVar.a();
    }

    /* access modifiers changed from: protected */
    public void a(t tVar) {
        C7471uYa.b(tVar, "presenter");
        tVar.a(this);
    }

    public void a(C6832lEa<List<c>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        C6769kJa<c, C6973nJa> kja = this.l;
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
