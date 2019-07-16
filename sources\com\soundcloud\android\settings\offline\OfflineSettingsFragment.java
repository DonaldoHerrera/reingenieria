package com.soundcloud.android.settings.offline;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.C0325l.a;
import androidx.constraintlayout.widget.Group;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.offline.Oc;
import com.soundcloud.android.settings.C5988u;
import com.soundcloud.android.settings.offline.view.OfflineStorageView;
import com.soundcloud.android.soul.components.cells.standard.CellStandard;
import com.soundcloud.android.soul.components.cells.standard.CellStandard.a.c;
import com.soundcloud.android.view.UniflowBaseFragment;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import com.soundcloud.android.view.customfontviews.b;
import java.util.HashMap;

@EVa(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\u0007H\u0016J\u0010\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0002H\u0014J\b\u00101\u001a\u00020\u0002H\u0014J\u0010\u00102\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0002H\u0014J\b\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020\u0007H\u0016J\b\u0010<\u001a\u00020\u0007H\u0016J\u0010\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u0014H\u0016J\u0010\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u0014H\u0016J\b\u0010A\u001a\u000204H\u0014J\b\u0010B\u001a\u00020\u0007H\u0016R\"\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\"\u0010\r\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u00140\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\nR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\nR\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u001b0\u001b0\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020 XD¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R$\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006C"}, d2 = {"Lcom/soundcloud/android/settings/offline/OfflineSettingsFragment;", "Lcom/soundcloud/android/view/UniflowBaseFragment;", "Lcom/soundcloud/android/settings/offline/OfflineSettingsPresenter;", "Lcom/soundcloud/android/settings/offline/OfflineSettingsView;", "()V", "onAutomaticCollectionSyncClick", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getOnAutomaticCollectionSyncClick", "()Lio/reactivex/subjects/PublishSubject;", "onChangeStorageLocationClick", "getOnChangeStorageLocationClick", "onDisableOfflineCollectionCancellationClick", "getOnDisableOfflineCollectionCancellationClick", "onDisableOfflineCollectionConfirmationClick", "getOnDisableOfflineCollectionConfirmationClick", "onDownloadHighQualityClick", "getOnDownloadHighQualityClick", "onRedownloadOfflineContentFromQualityChange", "", "getOnRedownloadOfflineContentFromQualityChange", "onRemoveOfflineContentClick", "getOnRemoveOfflineContentClick", "onRemoveOfflineContentConfirmationClick", "getOnRemoveOfflineContentConfirmationClick", "onStorageUsageLimitChange", "Lcom/soundcloud/android/settings/offline/StorageUsageLimit;", "getOnStorageUsageLimitChange", "onWifiOnlySyncClick", "getOnWifiOnlySyncClick", "presenterKey", "", "getPresenterKey", "()Ljava/lang/String;", "presenterLazy", "Ldagger/Lazy;", "getPresenterLazy", "()Ldagger/Lazy;", "setPresenterLazy", "(Ldagger/Lazy;)V", "bindViews", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildRenderers", "connectPresenter", "presenter", "createPresenter", "disconnectPresenter", "getResId", "", "render", "viewModel", "Lcom/soundcloud/android/settings/offline/OfflineSettingsViewModel;", "setUpOfflineUsageView", "offlineUsage", "Lcom/soundcloud/android/settings/OfflineUsage;", "showBelowStorageLimitWarning", "showConfirmDisableOfflineCollectionDialog", "showOfflineQualityChangedDialog", "changeToHighQuality", "showRemoveAllOfflineContentDialog", "isOfflineCollectionEnabled", "titleResId", "unbindViews", "base_release"}, mv = {1, 1, 15})
/* compiled from: OfflineSettingsFragment.kt */
public final class OfflineSettingsFragment extends UniflowBaseFragment<n> implements H {
    public C4806CMa<n> i;
    private final String j = "OfflineSettingsPresenterKey";
    private final C6781kVa<RVa> k;
    private final C6781kVa<RVa> l;
    private final C6781kVa<RVa> m;
    private final C6781kVa<RVa> n;
    private final C6781kVa<RVa> o;
    private final C6781kVa<RVa> p;
    private final C6781kVa<Boolean> q;
    private final C6781kVa<RVa> r;
    private final C6781kVa<RVa> s;
    private final C6781kVa<J> t;
    private HashMap u;

    public OfflineSettingsFragment() {
        C6781kVa<RVa> s2 = C6781kVa.s();
        String str = "PublishSubject.create<Unit>()";
        C7471uYa.a((Object) s2, str);
        this.k = s2;
        C6781kVa<RVa> s3 = C6781kVa.s();
        C7471uYa.a((Object) s3, str);
        this.l = s3;
        C6781kVa<RVa> s4 = C6781kVa.s();
        C7471uYa.a((Object) s4, str);
        this.m = s4;
        C6781kVa<RVa> s5 = C6781kVa.s();
        C7471uYa.a((Object) s5, str);
        this.n = s5;
        C6781kVa<RVa> s6 = C6781kVa.s();
        C7471uYa.a((Object) s6, str);
        this.o = s6;
        C6781kVa<RVa> s7 = C6781kVa.s();
        C7471uYa.a((Object) s7, str);
        this.p = s7;
        C6781kVa<Boolean> s8 = C6781kVa.s();
        C7471uYa.a((Object) s8, "PublishSubject.create<Boolean>()");
        this.q = s8;
        C6781kVa<RVa> s9 = C6781kVa.s();
        C7471uYa.a((Object) s9, str);
        this.r = s9;
        C6781kVa<RVa> s10 = C6781kVa.s();
        C7471uYa.a((Object) s10, str);
        this.s = s10;
        C6781kVa<J> s11 = C6781kVa.s();
        C7471uYa.a((Object) s11, "PublishSubject.create<StorageUsageLimit>()");
        this.t = s11;
        SoundCloudApplication.f().a(this);
    }

    public void Db() {
        Toast.makeText(getActivity(), p.offline_cannot_set_limit_below_usage, 0).show();
    }

    public void Rb() {
        HashMap hashMap = this.u;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void Sb() {
    }

    /* access modifiers changed from: protected */
    public String Ub() {
        return this.j;
    }

    public int Vb() {
        return l.settings_offline_listening;
    }

    public void Wb() {
    }

    public View c(int i2) {
        if (this.u == null) {
            this.u = new HashMap();
        }
        View view = (View) this.u.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.u.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public void d(boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = p.change_offline_quality_title_to_high;
        } else {
            i2 = p.change_offline_quality_title_to_standard;
        }
        if (z) {
            i3 = p.change_offline_quality_body_to_high;
        } else {
            i3 = p.change_offline_quality_body_to_standard;
        }
        View a = new b(getActivity()).c(i2).b(i3).a();
        Context context = getContext();
        if (context != null) {
            a aVar = new a(context);
            aVar.b(a);
            aVar.c(p.btn_yes, (OnClickListener) new C5968j(this));
            aVar.a(p.btn_no, (OnClickListener) new k(this));
            aVar.c();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void e(boolean z) {
        int i2;
        if (z) {
            i2 = p.remove_offline_content_body_sync_collection;
        } else {
            i2 = p.remove_offline_content_body_default;
        }
        View a = new b(getActivity()).c(p.remove_offline_content_title).b(i2).a();
        Context context = getContext();
        if (context != null) {
            a aVar = new a(context);
            aVar.b(a);
            aVar.c(p.btn_continue, (OnClickListener) new l(this));
            aVar.a(p.btn_cancel, (OnClickListener) null);
            aVar.c();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Rb();
    }

    public void qb() {
        View a = new b(getActivity()).a(h.dialog_download, p.disable_offline_collection_title, p.disable_offline_collection_body).a();
        Context context = getContext();
        if (context != null) {
            a aVar = new a(context);
            aVar.b(a);
            aVar.c(17039370, (OnClickListener) new C5965g(this));
            aVar.a(17039360, (OnClickListener) new C5966h(this));
            aVar.a((OnCancelListener) new C5967i(this));
            aVar.c();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public C6781kVa<RVa> Cb() {
        return this.o;
    }

    public C6781kVa<RVa> Eb() {
        return this.l;
    }

    public C6781kVa<RVa> Gb() {
        return this.n;
    }

    public C6781kVa<RVa> Ib() {
        return this.m;
    }

    public C6781kVa<Boolean> Mb() {
        return this.q;
    }

    public C6781kVa<J> Pb() {
        return this.t;
    }

    /* access modifiers changed from: protected */
    public int Qb() {
        return p.settings_offline_listening;
    }

    /* access modifiers changed from: protected */
    public n Tb() {
        C4806CMa<n> cMa = this.i;
        if (cMa != null) {
            Object obj = cMa.get();
            C7471uYa.a(obj, "presenterLazy.get()");
            return (n) obj;
        }
        C7471uYa.b("presenterLazy");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        C7471uYa.b(view, "view");
        ((CellStandard) c(i.offline_listening_settings_pref_collection)).setOnClickListener(new C5959a(this));
        ((CellStandard) c(i.offline_listening_settings_pref_only_wifi)).setOnClickListener(new C5960b(this));
        ((CellStandard) c(i.offline_listening_settings_pref_only_high_quality)).setOnClickListener(new C5961c(this));
        ((CellStandard) c(i.offline_listening_settings_pref_change_location_content)).setOnClickListener(new C5962d(this));
        ((CellStandard) c(i.offline_listening_settings_pref_remove_offline_content)).setOnClickListener(new C5963e(this));
    }

    /* access modifiers changed from: protected */
    public void b(n nVar) {
        C7471uYa.b(nVar, "presenter");
        nVar.a();
    }

    public C6781kVa<RVa> sb() {
        return this.s;
    }

    public C6781kVa<RVa> tb() {
        return this.k;
    }

    public C6781kVa<RVa> vb() {
        return this.p;
    }

    public C6781kVa<RVa> xb() {
        return this.r;
    }

    public void a(C5988u uVar) {
        C7471uYa.b(uVar, "offlineUsage");
        ((OfflineStorageView) c(i.offline_listening_settings_pref_storage_usage)).setOfflineUsage(uVar);
        ((OfflineStorageView) c(i.offline_listening_settings_pref_storage_usage)).setOnStorageLimitChangedListener(new C5964f(this));
    }

    public void a(I i2) {
        int i3;
        C7471uYa.b(i2, "viewModel");
        CellStandard cellStandard = (CellStandard) c(i.offline_listening_settings_pref_collection);
        String string = getString(p.pref_offline_offline_collection);
        C7471uYa.a((Object) string, "getString(R.string.pref_…fline_offline_collection)");
        cellStandard.a(new CellStandard.b(string, new c(i2.b())));
        CellStandard cellStandard2 = (CellStandard) c(i.offline_listening_settings_pref_only_wifi);
        String string2 = getString(p.pref_offline_wifi_only_sync);
        C7471uYa.a((Object) string2, "getString(R.string.pref_offline_wifi_only_sync)");
        cellStandard2.a(new CellStandard.b(string2, new c(i2.d())));
        CellStandard cellStandard3 = (CellStandard) c(i.offline_listening_settings_pref_only_high_quality);
        String string3 = getString(p.pref_offline_high_quality_only);
        C7471uYa.a((Object) string3, "getString(R.string.pref_offline_high_quality_only)");
        cellStandard3.a(new CellStandard.b(string3, new c(i2.c())));
        String str = "pref_change_storage_location_group";
        if (i2.a() instanceof I.a.b) {
            Group group = (Group) c(i.pref_change_storage_location_group);
            C7471uYa.a((Object) group, str);
            group.setVisibility(0);
            if (Oc.DEVICE_STORAGE == ((I.a.b) i2.a()).a()) {
                i3 = p.pref_offline_change_storage_location_description_device_storage;
            } else {
                i3 = p.pref_offline_change_storage_location_description_sd_card;
            }
            ((CustomFontTextView) c(i.offline_listening_settings_pref_change_location_content_summary)).setText(i3);
        } else {
            Group group2 = (Group) c(i.pref_change_storage_location_group);
            C7471uYa.a((Object) group2, str);
            group2.setVisibility(8);
        }
        ((OfflineStorageView) c(i.offline_listening_settings_pref_storage_usage)).a();
    }

    /* access modifiers changed from: protected */
    public void a(n nVar) {
        C7471uYa.b(nVar, "presenter");
        nVar.a((H) this);
    }
}
