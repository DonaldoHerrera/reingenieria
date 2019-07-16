package com.soundcloud.android.settings.streamingquality;

import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.settings.streamingquality.SettingsListPicker.a;
import com.soundcloud.android.settings.streamingquality.SettingsListPicker.c;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0002H\u0014J\b\u0010!\u001a\u00020\u0002H\u0014J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0002H\u0014J\b\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u000eH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0'H\u0016J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\tH\u0014J\b\u0010,\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000e0\u000e0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006-"}, d2 = {"Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettingsFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettingsPresenter;", "Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettingsView;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "onSettingPositionClick", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getOnSettingPositionClick", "()Lio/reactivex/subjects/PublishSubject;", "onVisible", "", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy", "()Ldagger/Lazy;", "setPresenterLazy", "(Ldagger/Lazy;)V", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "getScreen", "Lcom/soundcloud/android/foundation/domain/Screen;", "onResume", "Lio/reactivex/Observable;", "render", "viewModel", "Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettingsViewModel;", "titleResId", "unbindViews", "base_release"}, mv = {1, 1, 15})
/* compiled from: StreamingQualitySettingsFragment.kt */
public final class StreamingQualitySettingsFragment extends UniflowBaseFragment<i> implements q {
    public C4806CMa<i> i;
    private final C6781kVa<Integer> j;
    private final C6781kVa<RVa> k;
    private final UPa l = new UPa();
    private final String m;
    private HashMap n;

    public StreamingQualitySettingsFragment() {
        C6781kVa<Integer> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<Int>()");
        this.j = s;
        C6781kVa<RVa> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, "PublishSubject.create<Unit>()");
        this.k = s2;
        SoundCloudApplication.f().a(this);
        this.m = "StreamingQualitySettingsPresenterKey";
    }

    public void Rb() {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
    }

    public Yca Ta() {
        return Yca.SETTINGS_STREAMING_QUALITY;
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.m;
    }

    public int Vb() {
        return l.settings_streaming_quality;
    }

    public void Wb() {
        this.l.b();
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

    public APa<RVa> d() {
        return this.k;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public void onResume() {
        super.onResume();
        this.k.a(RVa.a);
    }

    public C6781kVa<Integer> Jb() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.title_streaming_quality_settings;
    }

    /* access modifiers changed from: protected */
    public i Tb() {
        C4806CMa<i> cMa = this.i;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (i) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void a(r rVar) {
        C7471uYa.b(rVar, "viewModel");
        SettingsListPicker settingsListPicker = (SettingsListPicker) c(i.settingsPicker);
        List<a> b = rVar.b();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) b, 10));
        for (a a : b) {
            arrayList.add(new a(a.a()));
        }
        settingsListPicker.a(new c(arrayList, rVar.a()));
    }

    /* access modifiers changed from: protected */
    public void b(i iVar) {
        C7471uYa.b(iVar, "presenter");
        iVar.a();
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        UPa uPa = this.l;
        VPa f = ((SettingsListPicker) c(i.settingsPicker)).z().f((C6776kQa<? super T>) new g<Object>(new f(Jb())));
        C7471uYa.a((Object) f, "settingsPicker.positionC…ingPositionClick::onNext)");
        XUa.a(uPa, f);
    }

    /* access modifiers changed from: protected */
    public void a(i iVar) {
        C7471uYa.b(iVar, "presenter");
        iVar.a((q) this);
    }
}
