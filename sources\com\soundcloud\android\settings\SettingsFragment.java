package com.soundcloud.android.settings;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.soul.components.cells.standard.CellStandard;
import com.soundcloud.android.view.UniflowBaseFragment;
import java.util.HashMap;

@EVa(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u0007H\u0016J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0002H\u0014J\b\u0010)\u001a\u00020\u0002H\u0014J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0002H\u0014J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0007H\u0016J\b\u0010.\u001a\u00020\u0007H\u0016J\b\u0010/\u001a\u00020\u0007H\u0016J\b\u00100\u001a\u00020\u0007H\u0016J\b\u00101\u001a\u00020,H\u0014J\b\u00102\u001a\u00020\u0007H\u0016R\"\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\"\u0010\r\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\n¨\u00063"}, d2 = {"Lcom/soundcloud/android/settings/SettingsFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/settings/SettingsPresenter;", "Lcom/soundcloud/android/settings/SettingsView;", "()V", "advertisingSettingsClick", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getAdvertisingSettingsClick", "()Lio/reactivex/subjects/PublishSubject;", "analyticsSettingsClick", "getAnalyticsSettingsClick", "basicSettingsClick", "getBasicSettingsClick", "communicationsSettingsClick", "getCommunicationsSettingsClick", "downloadsSettingsClick", "getDownloadsSettingsClick", "notificationSettingsClick", "getNotificationSettingsClick", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy", "()Ldagger/Lazy;", "setPresenterLazy", "(Ldagger/Lazy;)V", "streamingQualitySettingsClick", "getStreamingQualitySettingsClick", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "", "hideOfflineSettings", "hideStreamingQualitySettings", "showOfflineSettings", "showStreamingQualitySettings", "titleResId", "unbindViews", "base_release"}, mv = {1, 1, 15})
/* compiled from: SettingsFragment.kt */
public final class SettingsFragment extends UniflowBaseFragment<S> implements U {
    private final C6781kVa<RVa> i;
    private final C6781kVa<RVa> j;
    private final C6781kVa<RVa> k;
    private final C6781kVa<RVa> l;
    private final C6781kVa<RVa> m;
    private final C6781kVa<RVa> n;
    private final C6781kVa<RVa> o;
    public C4806CMa<S> p;
    private final String q = "SettingsPresenterKey";
    private HashMap r;

    public SettingsFragment() {
        C6781kVa<RVa> s = C6781kVa.s();
        String str = "PublishSubject.create<Unit>()";
        C7471uYa.a((Object) s, str);
        this.i = s;
        C6781kVa<RVa> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, str);
        this.j = s2;
        C6781kVa<RVa> s3 = C6781kVa.s();
        C7471uYa.a((Object) s3, str);
        this.k = s3;
        C6781kVa<RVa> s4 = C6781kVa.s();
        C7471uYa.a((Object) s4, str);
        this.l = s4;
        C6781kVa<RVa> s5 = C6781kVa.s();
        C7471uYa.a((Object) s5, str);
        this.m = s5;
        C6781kVa<RVa> s6 = C6781kVa.s();
        C7471uYa.a((Object) s6, str);
        this.n = s6;
        C6781kVa<RVa> s7 = C6781kVa.s();
        C7471uYa.a((Object) s7, str);
        this.o = s7;
        SoundCloudApplication.f().a(this);
    }

    public void Fb() {
        Group group = (Group) c(i.settings_streaming_quality_settings_link_block);
        C7471uYa.a((Object) group, "settings_streaming_quality_settings_link_block");
        group.setVisibility(8);
    }

    public void Ob() {
        Group group = (Group) c(i.settings_offline_sync_settings_link_block);
        C7471uYa.a((Object) group, "settings_offline_sync_settings_link_block");
        group.setVisibility(8);
    }

    public void Rb() {
        HashMap hashMap = this.r;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.q;
    }

    public int Vb() {
        return l.settings;
    }

    public void Wb() {
    }

    public View c(int i2) {
        if (this.r == null) {
            this.r = new HashMap();
        }
        View view = (View) this.r.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.r.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public void yb() {
        Group group = (Group) c(i.settings_streaming_quality_settings_link_block);
        C7471uYa.a((Object) group, "settings_streaming_quality_settings_link_block");
        group.setVisibility(0);
    }

    public void zb() {
        Group group = (Group) c(i.settings_offline_sync_settings_link_block);
        C7471uYa.a((Object) group, "settings_offline_sync_settings_link_block");
        group.setVisibility(0);
    }

    public C6781kVa<RVa> Ab() {
        return this.j;
    }

    public C6781kVa<RVa> Hb() {
        return this.k;
    }

    public C6781kVa<RVa> Lb() {
        return this.o;
    }

    public C6781kVa<RVa> Nb() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.title_settings;
    }

    /* access modifiers changed from: protected */
    public S Tb() {
        C4806CMa<S> cMa = this.p;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (S) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        ((CellStandard) c(i.settings_basic_settings_link)).setOnClickListener(new z(this));
        ((CellStandard) c(i.settings_streaming_quality_link)).setOnClickListener(new A(this));
        ((CellStandard) c(i.settings_notifications_link)).setOnClickListener(new B(this));
        ((CellStandard) c(i.settings_downloads_link)).setOnClickListener(new C(this));
        ((CellStandard) c(i.settings_analytics_link)).setOnClickListener(new D(this));
        ((CellStandard) c(i.settings_communications_link)).setOnClickListener(new E(this));
        ((CellStandard) c(i.settings_advertising_link)).setOnClickListener(new F(this));
    }

    /* access modifiers changed from: protected */
    public void b(S s) {
        C7471uYa.b(s, "presenter");
        s.a();
    }

    public C6781kVa<RVa> rb() {
        return this.i;
    }

    public C6781kVa<RVa> ub() {
        return this.l;
    }

    public C6781kVa<RVa> wb() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    public void a(S s) {
        C7471uYa.b(s, "presenter");
        s.a(this);
    }
}
