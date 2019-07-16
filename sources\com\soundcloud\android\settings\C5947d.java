package com.soundcloud.android.settings;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.E;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.offline.C4197yd;
import com.soundcloud.android.offline.Oc;
import com.soundcloud.android.view.customfontviews.b;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

@EVa(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014H\u0007J\u0010\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014H\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0018H\u0002R\u000e\u0010\n\u001a\u00020\u0002X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/soundcloud/android/settings/ChangeStorageLocationPresenter;", "Lcom/soundcloud/lightcycle/DefaultActivityLightCycle;", "Landroidx/appcompat/app/AppCompatActivity;", "offlineSettingsStorage", "Lcom/soundcloud/android/offline/OfflineSettingsStorage;", "offlineContentOperations", "Lcom/soundcloud/android/offline/OfflineContentOperations;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "(Lcom/soundcloud/android/offline/OfflineSettingsStorage;Lcom/soundcloud/android/offline/OfflineContentOperations;Lcom/soundcloud/android/foundation/events/Analytics;)V", "activity", "bytesToGB", "", "bytes", "", "formatGigabytes", "", "free", "total", "getInternalDeviceStorage", "Lcom/soundcloud/android/settings/SummaryRadioButton;", "kotlin.jvm.PlatformType", "getSdCardStorage", "handleCancel", "", "onCreate", "bundle", "Landroid/os/Bundle;", "resetOfflineContent", "offlineContentLocation", "Lcom/soundcloud/android/offline/OfflineContentLocation;", "showDialog", "updateRadioGroup", "updateSummaries", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.settings.d reason: case insensitive filesystem */
/* compiled from: ChangeStorageLocationPresenter.kt */
public final class C5947d extends DefaultActivityLightCycle<AppCompatActivity> {
    public static final a a = new a(null);
    private AppCompatActivity b;
    private final C4088fe c;
    private final C4197yd d;
    private final C3700b e;

    /* renamed from: com.soundcloud.android.settings.d$a */
    /* compiled from: ChangeStorageLocationPresenter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C5947d(C4088fe feVar, C4197yd ydVar, C3700b bVar) {
        C7471uYa.b(feVar, "offlineSettingsStorage");
        C7471uYa.b(ydVar, "offlineContentOperations");
        C7471uYa.b(bVar, "analytics");
        this.c = feVar;
        this.d = ydVar;
        this.e = bVar;
    }

    private final double a(long j) {
        return ((double) j) / 1.073741824E9d;
    }

    /* access modifiers changed from: private */
    public final void x() {
        AppCompatActivity appCompatActivity = this.b;
        if (appCompatActivity != null) {
            ((RadioGroup) appCompatActivity.findViewById(i.storage_options)).setOnCheckedChangeListener(null);
            y();
            return;
        }
        C7471uYa.b("activity");
        throw null;
    }

    private final void y() {
        int i;
        AppCompatActivity appCompatActivity = this.b;
        String str = "activity";
        if (appCompatActivity != null) {
            RadioGroup radioGroup = (RadioGroup) appCompatActivity.findViewById(i.storage_options);
            if (Oc.DEVICE_STORAGE == this.c.c()) {
                i = i.internal_device_storage;
            } else {
                i = i.sd_card;
            }
            radioGroup.check(i);
            AppCompatActivity appCompatActivity2 = this.b;
            if (appCompatActivity2 != null) {
                ((RadioGroup) appCompatActivity2.findViewById(i.storage_options)).setOnCheckedChangeListener(new C5951h(this));
            } else {
                C7471uYa.b(str);
                throw null;
            }
        } else {
            C7471uYa.b(str);
            throw null;
        }
    }

    private final void z() {
        String str;
        AppCompatActivity appCompatActivity = this.b;
        String str2 = "activity";
        if (appCompatActivity != null) {
            SummaryRadioButton summaryRadioButton = (SummaryRadioButton) appCompatActivity.findViewById(i.internal_device_storage);
            AppCompatActivity appCompatActivity2 = this.b;
            if (appCompatActivity2 != null) {
                Context applicationContext = appCompatActivity2.getApplicationContext();
                String str3 = "activity.applicationContext";
                C7471uYa.a((Object) applicationContext, str3);
                long a2 = C6698jGa.a(applicationContext);
                AppCompatActivity appCompatActivity3 = this.b;
                if (appCompatActivity3 != null) {
                    Context applicationContext2 = appCompatActivity3.getApplicationContext();
                    C7471uYa.a((Object) applicationContext2, str3);
                    summaryRadioButton.setSummary(a(a2, C6698jGa.b(applicationContext2)));
                    AppCompatActivity appCompatActivity4 = this.b;
                    if (appCompatActivity4 != null) {
                        SummaryRadioButton summaryRadioButton2 = (SummaryRadioButton) appCompatActivity4.findViewById(i.sd_card);
                        if (this.c.k()) {
                            AppCompatActivity appCompatActivity5 = this.b;
                            if (appCompatActivity5 != null) {
                                Context applicationContext3 = appCompatActivity5.getApplicationContext();
                                C7471uYa.a((Object) applicationContext3, str3);
                                long d2 = C6698jGa.d(applicationContext3);
                                AppCompatActivity appCompatActivity6 = this.b;
                                if (appCompatActivity6 != null) {
                                    Context applicationContext4 = appCompatActivity6.getApplicationContext();
                                    C7471uYa.a((Object) applicationContext4, str3);
                                    str = a(d2, C6698jGa.e(applicationContext4));
                                } else {
                                    C7471uYa.b(str2);
                                    throw null;
                                }
                            } else {
                                C7471uYa.b(str2);
                                throw null;
                            }
                        } else {
                            AppCompatActivity appCompatActivity7 = this.b;
                            if (appCompatActivity7 != null) {
                                str = appCompatActivity7.getString(p.unavailable);
                            } else {
                                C7471uYa.b(str2);
                                throw null;
                            }
                        }
                        summaryRadioButton2.setSummary(str);
                        return;
                    }
                    C7471uYa.b(str2);
                    throw null;
                }
                C7471uYa.b(str2);
                throw null;
            }
            C7471uYa.b(str2);
            throw null;
        }
        C7471uYa.b(str2);
        throw null;
    }

    /* renamed from: b */
    public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        C7471uYa.b(appCompatActivity, "activity");
        this.b = appCompatActivity;
        z();
        y();
    }

    private final String a(long j, long j2) {
        AppCompatActivity appCompatActivity = this.b;
        if (appCompatActivity != null) {
            String string = appCompatActivity.getResources().getString(p.pref_offline_storage_free_gb, new Object[]{Double.valueOf(a(j)), Double.valueOf(a(j2))});
            C7471uYa.a((Object) string, "activity.resources.getSt…(free), bytesToGB(total))");
            return string;
        }
        C7471uYa.b("activity");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void a(Oc oc) {
        C3924zaa zaa;
        C3700b bVar = this.e;
        if (Oc.DEVICE_STORAGE == oc) {
            zaa = C3924zaa.m();
        } else {
            zaa = C3924zaa.n();
        }
        C7471uYa.a((Object) zaa, "if (OfflineContentLocati…ionSdCard()\n            }");
        bVar.a((J) zaa);
        this.d.a(oc).a((C7117pPa) new C4943Gua());
        AppCompatActivity appCompatActivity = this.b;
        if (appCompatActivity != null) {
            appCompatActivity.finish();
        } else {
            C7471uYa.b("activity");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void b(Oc oc) {
        int i;
        AppCompatActivity appCompatActivity = this.b;
        String str = "activity";
        if (appCompatActivity != null) {
            b c2 = new b(appCompatActivity).c(p.confirm_change_storage_location_dialog_title);
            if (Oc.DEVICE_STORAGE == oc) {
                i = p.confirm_change_storage_location_dialog_message_internal_device_storage;
            } else {
                i = p.confirm_change_storage_location_dialog_message_sd_card;
            }
            View a2 = c2.b(i).a();
            AppCompatActivity appCompatActivity2 = this.b;
            if (appCompatActivity2 != null) {
                androidx.appcompat.app.C0325l.a aVar = new androidx.appcompat.app.C0325l.a(appCompatActivity2);
                aVar.b(a2);
                aVar.c(p.ok_got_it, (OnClickListener) new C5948e(this, oc));
                aVar.a(17039360, (OnClickListener) new C5949f(this));
                aVar.a((OnCancelListener) new C5950g(this));
                if (C5232QGa.a((Dialog) aVar.a())) {
                    C3700b bVar = this.e;
                    String a3 = Yca.SETTINGS_OFFLINE_STORAGE_LOCATION_CONFIRM.a();
                    C7471uYa.a((Object) a3, "Screen.SETTINGS_OFFLINE_…GE_LOCATION_CONFIRM.get()");
                    E e2 = new E(a3, null, null, null, null, 30, null);
                    bVar.a((J) e2);
                    return;
                }
                return;
            }
            C7471uYa.b(str);
            throw null;
        }
        C7471uYa.b(str);
        throw null;
    }
}
