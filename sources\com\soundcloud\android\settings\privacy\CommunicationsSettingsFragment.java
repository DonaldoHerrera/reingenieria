package com.soundcloud.android.settings.privacy;

import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;

@EVa(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0016J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0002H\u0014J\b\u0010\"\u001a\u00020\u0002H\u0014J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0002H\u0014J\b\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020%H\u0014J\b\u0010*\u001a\u00020\u0018H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eXD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00180\u00180\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\f¨\u0006+"}, d2 = {"Lcom/soundcloud/android/settings/privacy/CommunicationsSettingsFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/settings/privacy/CommunicationsSettingsPresenter;", "Lcom/soundcloud/android/settings/privacy/CommunicationsSettingsView;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "optInToggle", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getOptInToggle", "()Lio/reactivex/subjects/PublishSubject;", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy", "()Ldagger/Lazy;", "setPresenterLazy", "(Ldagger/Lazy;)V", "privacyPolicyButtonClick", "", "getPrivacyPolicyButtonClick", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "", "render", "viewModel", "Lcom/soundcloud/android/settings/privacy/CommunicationsSettingsViewModel;", "titleResId", "unbindViews", "base_release"}, mv = {1, 1, 15})
/* compiled from: CommunicationsSettingsFragment.kt */
public final class CommunicationsSettingsFragment extends UniflowBaseFragment<J> implements L {
    private final C6781kVa<RVa> i;
    private final C6781kVa<Boolean> j;
    private final UPa k = new UPa();
    public C4806CMa<J> l;
    private final String m;
    private HashMap n;

    public CommunicationsSettingsFragment() {
        C6781kVa<RVa> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<Unit>()");
        this.i = s;
        C6781kVa<Boolean> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, "PublishSubject.create<Boolean>()");
        this.j = s2;
        SoundCloudApplication.f().a(this);
        this.m = "CommunicationsPresenterKey";
    }

    public void Rb() {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.m;
    }

    public int Vb() {
        return l.privacy_settings_communications;
    }

    public void Wb() {
        this.k.b();
    }

    public View c(int i2) {
        if (this.n == null) {
            this.n = new HashMap();
        }
        View view = (View) this.n.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.n.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.title_communications_settings;
    }

    /* access modifiers changed from: protected */
    public J Tb() {
        C4806CMa<J> cMa = this.l;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (J) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public C6781kVa<RVa> Ua() {
        return this.i;
    }

    public C6781kVa<Boolean> Va() {
        return this.j;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        UPa uPa = this.k;
        VPa f = ((PrivacySettingsToggleLayout) c(i.privacy_settings_communications_layout)).a().h(A.a).f((C6776kQa<? super T>) new D<Object>(new B(Ua())));
        C7471uYa.a((Object) f, "privacy_settings_communi…olicyButtonClick::onNext)");
        XUa.a(uPa, f);
        UPa uPa2 = this.k;
        VPa f2 = ((PrivacySettingsToggleLayout) c(i.privacy_settings_communications_layout)).b().f((C6776kQa<? super T>) new D<Object>(new C(Va())));
        C7471uYa.a((Object) f2, "privacy_settings_communi…ribe(optInToggle::onNext)");
        XUa.a(uPa2, f2);
    }

    /* access modifiers changed from: protected */
    public void b(J j2) {
        C7471uYa.b(j2, "presenter");
        j2.a();
    }

    public void a(M m2) {
        C7471uYa.b(m2, "viewModel");
        ((PrivacySettingsToggleLayout) c(i.privacy_settings_communications_layout)).a(new O(m2.b(), m2.a(), m2.c()));
    }

    /* access modifiers changed from: protected */
    public void a(J j2) {
        C7471uYa.b(j2, "presenter");
        j2.a((L) this);
    }
}
