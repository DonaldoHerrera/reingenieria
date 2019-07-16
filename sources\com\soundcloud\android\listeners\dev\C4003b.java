package com.soundcloud.android.listeners.dev;

import android.content.res.Resources;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.Preference.b;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import com.soundcloud.android.ia.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

@EVa(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\bH\u0002J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002J\f\u0010\u001c\u001a\u00020\u000f*\u00020\u0018H\u0002J\u0014\u0010\u001d\u001a\u00020\u000f*\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0014\u0010\u001e\u001a\u00020\u000f*\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/soundcloud/android/listeners/dev/DevDrawerExperimentsHelper;", "", "resources", "Landroid/content/res/Resources;", "experimentOperations", "Lcom/soundcloud/android/configuration/experiments/ExperimentOperations;", "(Landroid/content/res/Resources;Lcom/soundcloud/android/configuration/experiments/ExperimentOperations;)V", "experimentsKey", "", "kotlin.jvm.PlatformType", "addDefaultExperimentVariant", "", "Lcom/soundcloud/android/configuration/experiments/ExperimentVariant;", "variants", "addExperiments", "", "screen", "Landroidx/preference/PreferenceScreen;", "buildExperimentLayer", "Lcom/soundcloud/android/configuration/experiments/Layer;", "experiment", "Lcom/soundcloud/android/configuration/experiments/ExperimentConfiguration;", "variant", "buildExperimentListPreference", "Landroidx/preference/ListPreference;", "clearPreferencesForExperimentLayer", "layer", "getExperimentLayerPrefix", "clearExperimentSummary", "setExperimentEntries", "setExperimentSummary", "Companion", "devdrawer_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.listeners.dev.b reason: case insensitive filesystem */
/* compiled from: DevDrawerExperimentsHelper.kt */
public final class C4003b {
    public static final a a = new a(null);
    private final String b = this.c.getString(p.dev_drawer_section_experiments_key);
    private final Resources c;
    /* access modifiers changed from: private */
    public final C2137KU d;

    /* renamed from: com.soundcloud.android.listeners.dev.b$a */
    /* compiled from: DevDrawerExperimentsHelper.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C4003b(Resources resources, C2137KU ku) {
        C7471uYa.b(resources, "resources");
        C7471uYa.b(ku, "experimentOperations");
        this.c = resources;
        this.d = ku;
    }

    /* access modifiers changed from: private */
    public final void b(ListPreference listPreference, C2118JU ju) {
        String a2 = this.d.a(ju);
        if (!Cxb.a(a2)) {
            listPreference.a((CharSequence) this.c.getString(p.dev_drawer_section_experiments_enabled_prefix, new Object[]{a2}));
            listPreference.f(a2);
            return;
        }
        a(listPreference);
    }

    public final void a(PreferenceScreen preferenceScreen) {
        C7471uYa.b(preferenceScreen, "screen");
        PreferenceCategory preferenceCategory = new PreferenceCategory(preferenceScreen.b());
        preferenceCategory.b((CharSequence) this.c.getString(p.dev_drawer_section_experiments));
        preferenceCategory.d(this.b);
        preferenceScreen.c((Preference) preferenceCategory);
        for (C2118JU a2 : C2118JU.values()) {
            preferenceCategory.c((Preference) a(preferenceScreen, a2));
        }
    }

    private final ListPreference a(PreferenceScreen preferenceScreen, C2118JU ju) {
        ListPreference listPreference = new ListPreference(preferenceScreen.b());
        StringBuilder sb = new StringBuilder();
        sb.append(a(ju.c()));
        sb.append(ju.b());
        listPreference.d(sb.toString());
        listPreference.b((CharSequence) C7315sGa.b(ju.b()));
        listPreference.a((b) new C4004c(this, ju, preferenceScreen));
        a(listPreference, ju);
        b(listPreference, ju);
        return listPreference;
    }

    /* access modifiers changed from: private */
    public final C2232PU a(C2118JU ju, String str) {
        List list;
        boolean z;
        List a2 = new C7162pxb(" : ").a((CharSequence) str, 0);
        if (!a2.isEmpty()) {
            ListIterator listIterator = a2.listIterator(a2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (((String) listIterator.previous()).length() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    list = C7676xWa.d((Iterable) a2, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = C6918mWa.a();
        C2232PU pu = new C2232PU(ju.c(), ju.a(), ju.b(), Integer.parseInt((String) C7676xWa.h(list)), (String) C7676xWa.f(list));
        return pu;
    }

    private final void a(ListPreference listPreference, C2118JU ju) {
        List<C2213OU> a2 = a(ju.d());
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a2, 10));
        for (C2213OU ou : a2) {
            StringBuilder sb = new StringBuilder();
            sb.append(ou.b());
            sb.append(" : ");
            sb.append(ou.a());
            arrayList.add(sb.toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            listPreference.a((CharSequence[]) strArr);
            listPreference.b((CharSequence[]) strArr);
            return;
        }
        throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private final List<C2213OU> a(List<C2213OU> list) {
        String string = this.c.getString(p.dev_drawer_section_experiment_default);
        C7471uYa.a((Object) string, "resources.getString(R.st…ction_experiment_default)");
        return C7676xWa.a((Collection) list, (Object) new C2213OU(string, -1));
    }

    /* access modifiers changed from: private */
    public final void a(PreferenceScreen preferenceScreen, String str) {
        String a2 = a(str);
        Preference c2 = preferenceScreen.c((CharSequence) this.b);
        if (c2 != null) {
            PreferenceCategory preferenceCategory = (PreferenceCategory) c2;
            int ea = preferenceCategory.ea();
            int i = 0;
            while (i < ea) {
                Preference g = preferenceCategory.g(i);
                if (g != null) {
                    ListPreference listPreference = (ListPreference) g;
                    String g2 = listPreference.g();
                    C7471uYa.a((Object) g2, "it.key");
                    if (Cxb.b(g2, a2, false, 2, null)) {
                        a(listPreference);
                    }
                    i++;
                } else {
                    throw new OVa("null cannot be cast to non-null type androidx.preference.ListPreference");
                }
            }
            return;
        }
        throw new OVa("null cannot be cast to non-null type androidx.preference.PreferenceCategory");
    }

    private final String a(String str) {
        String string = this.c.getString(p.dev_drawer_section_experiments_layer_prefix_key, new Object[]{str});
        C7471uYa.a((Object) string, "resources.getString(R.st…_layer_prefix_key, layer)");
        return string;
    }

    private final void a(ListPreference listPreference) {
        listPreference.a((CharSequence) this.c.getString(p.dev_drawer_section_experiment_default));
        listPreference.f("");
    }
}
