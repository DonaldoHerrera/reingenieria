package com.soundcloud.android.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.playback.C4536zc;
import defpackage.C6968nEa;
import java.util.HashMap;

@EVa(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007\b\u0016¢\u0006\u0002\u0010\u0007B\u000f\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H&J\b\u0010(\u001a\u00020#H&J\u0015\u0010)\u001a\u00020#2\u0006\u0010\u0017\u001a\u00028\u0000H$¢\u0006\u0002\u0010*J\r\u0010+\u001a\u00028\u0000H$¢\u0006\u0002\u0010,J\u0015\u0010-\u001a\u00020#2\u0006\u0010\u0017\u001a\u00028\u0000H$¢\u0006\u0002\u0010*J\b\u0010.\u001a\u00020/H&J\b\u00100\u001a\u00020#H\u0002J\u0010\u00101\u001a\u00020#2\u0006\u00102\u001a\u000203H\u0016J\u0012\u00104\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J&\u00105\u001a\u0004\u0018\u00010%2\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010:\u001a\u00020#H\u0016J\b\u0010;\u001a\u00020#H\u0016J\u0010\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020'H\u0016J\u001a\u0010>\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010?\u001a\u00020#2\u0006\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020#H&R\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u00028\u0000X.¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00020\u001cX¤\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\n¨\u0006C"}, d2 = {"Lcom/soundcloud/android/view/UniflowBaseFragment;", "T", "Lcom/soundcloud/android/uniflow/LiveAndDie;", "Lcom/soundcloud/android/view/BaseFragment;", "Lcom/soundcloud/android/view/ScrollableToTop;", "Lcom/soundcloud/android/view/ViewWithNavigation;", "Lcom/soundcloud/android/view/ViewWithTracks;", "()V", "presenterManager", "Lcom/soundcloud/android/uniflow/android/PresenterManager;", "(Lcom/soundcloud/android/uniflow/android/PresenterManager;)V", "expandPlayerCommand", "Lcom/soundcloud/android/playback/ExpandPlayerCommand;", "getExpandPlayerCommand$base_release", "()Lcom/soundcloud/android/playback/ExpandPlayerCommand;", "setExpandPlayerCommand$base_release", "(Lcom/soundcloud/android/playback/ExpandPlayerCommand;)V", "navigator", "Lcom/soundcloud/android/navigation/Navigator;", "getNavigator$base_release", "()Lcom/soundcloud/android/navigation/Navigator;", "setNavigator$base_release", "(Lcom/soundcloud/android/navigation/Navigator;)V", "presenter", "Lcom/soundcloud/android/uniflow/LiveAndDie;", "presenterId", "", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "getPresenterManager", "()Lcom/soundcloud/android/uniflow/android/PresenterManager;", "setPresenterManager", "bindViews", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "(Lcom/soundcloud/android/uniflow/LiveAndDie;)V", "createPresenter", "()Lcom/soundcloud/android/uniflow/LiveAndDie;", "disconnectPresenter", "getResId", "", "initializePresenter", "navigateTo", "navigationTarget", "Lcom/soundcloud/android/navigation/NavigationTarget;", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onSaveInstanceState", "outState", "onViewCreated", "showPlaybackResult", "playbackResult", "Lcom/soundcloud/android/playback/PlaybackResult;", "unbindViews", "base_release"}, mv = {1, 1, 15})
/* compiled from: UniflowBaseFragment.kt */
public abstract class UniflowBaseFragment<T extends C6968nEa> extends BaseFragment implements N, V, W {
    private T c;
    private long d;
    public C5047KEa e;
    public C4425ta f;
    public C4655rja g;
    private HashMap h;

    public UniflowBaseFragment() {
    }

    private final void Xb() {
        this.c = Tb();
        C5047KEa kEa = this.e;
        if (kEa != null) {
            T t = this.c;
            String str = "presenter";
            if (t != null) {
                this.d = kEa.a((C6968nEa) t);
                T t2 = this.c;
                if (t2 != null) {
                    t2.create();
                } else {
                    C7471uYa.b(str);
                    throw null;
                }
            } else {
                C7471uYa.b(str);
                throw null;
            }
        } else {
            C7471uYa.b("presenterManager");
            throw null;
        }
    }

    public static final /* synthetic */ C6968nEa a(UniflowBaseFragment uniflowBaseFragment) {
        T t = uniflowBaseFragment.c;
        if (t != null) {
            return t;
        }
        C7471uYa.b("presenter");
        throw null;
    }

    public void Rb() {
        HashMap hashMap = this.h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract void Sb();

    /* access modifiers changed from: protected */
    public abstract T Tb();

    /* access modifiers changed from: protected */
    public abstract String Ub();

    public abstract int Vb();

    public abstract void Wb();

    public abstract void a(View view, Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    /* access modifiers changed from: protected */
    public abstract void b(T t);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!(this.c == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Presenter ");
            T t = this.c;
            if (t == null) {
                C7471uYa.b("presenter");
                throw null;
            }
            sb.append(t);
            sb.append(" was already initialized");
            throw new IllegalStateException(sb.toString().toString());
        }
        if (bundle == null) {
            Xb();
        } else {
            this.d = bundle.getLong(Ub());
            C5047KEa kEa = this.e;
            if (kEa != null) {
                T a = kEa.a(this.d);
                if (a != null) {
                    this.c = a;
                } else {
                    C7316sHa.a(4, "UniflowBase", "Reinitializing empty presenter");
                    Xb();
                }
            } else {
                C7471uYa.b("presenterManager");
                throw null;
            }
        }
        Sb();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7471uYa.b(layoutInflater, "inflater");
        return layoutInflater.inflate(Vb(), viewGroup, false);
    }

    public void onDestroy() {
        FragmentActivity requireActivity = requireActivity();
        C7471uYa.a((Object) requireActivity, "requireActivity()");
        if (!requireActivity.isChangingConfigurations()) {
            C5047KEa kEa = this.e;
            if (kEa != null) {
                kEa.b(this.d);
                T t = this.c;
                if (t != null) {
                    t.destroy();
                    this.d = 0;
                } else {
                    C7471uYa.b("presenter");
                    throw null;
                }
            } else {
                C7471uYa.b("presenterManager");
                throw null;
            }
        }
        super.onDestroy();
    }

    public void onDestroyView() {
        Wb();
        T t = this.c;
        if (t != null) {
            b(t);
            super.onDestroyView();
            Rb();
            return;
        }
        C7471uYa.b("presenter");
        throw null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C7471uYa.b(bundle, "outState");
        bundle.putLong(Ub(), this.d);
        super.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        a(view, bundle);
        super.onViewCreated(view, bundle);
        T t = this.c;
        if (t != null) {
            a(t);
        } else {
            C7471uYa.b("presenter");
            throw null;
        }
    }

    public UniflowBaseFragment(C5047KEa kEa) {
        C7471uYa.b(kEa, "presenterManager");
        this.e = kEa;
    }

    public void a(C4536zc zcVar) {
        C7471uYa.b(zcVar, "playbackResult");
        C4425ta taVar = this.f;
        if (taVar != null) {
            taVar.a(zcVar);
        } else {
            C7471uYa.b("expandPlayerCommand");
            throw null;
        }
    }

    public void a(C4621nja nja) {
        C7471uYa.b(nja, "navigationTarget");
        C4655rja rja = this.g;
        if (rja != null) {
            rja.a(nja);
        } else {
            C7471uYa.b("navigator");
            throw null;
        }
    }
}
