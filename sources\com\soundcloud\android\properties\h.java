package com.soundcloud.android.properties;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.preference.CheckBoxPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.Preference.b;
import androidx.preference.Preference.c;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.s;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.soundcloud.android.ia.p;
import dagger.android.support.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: AppFeaturesPreferencesFragment.kt */
public final class h extends s {
    public FirebaseRemoteConfig a;
    @a
    public SharedPreferences b;
    public C4581ija c;
    public a d;
    public C6699jHa e;
    private VPa f = C4881Eua.b();
    private HashMap g;

    public void Qb() {
        HashMap hashMap = this.g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final a Rb() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar;
        }
        C7471uYa.b("appConfiguration");
        throw null;
    }

    public final SharedPreferences Sb() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        C7471uYa.b("appFeaturesPrefs");
        throw null;
    }

    public final C4581ija Tb() {
        C4581ija ija = this.c;
        if (ija != null) {
            return ija;
        }
        C7471uYa.b("navigationExecutor");
        throw null;
    }

    public void onAttach(Context context) {
        C7471uYa.b(context, "context");
        a.a(this);
        super.onAttach(context);
    }

    public void onCreatePreferences(Bundle bundle, String str) {
        PreferenceScreen a2 = getPreferenceManager().a(getContext());
        Preference preference = new Preference(getContext());
        Preference preference2 = new Preference(getContext());
        Preference preference3 = new Preference(getContext());
        PreferenceCategory preferenceCategory = new PreferenceCategory(getContext());
        PreferenceCategory preferenceCategory2 = new PreferenceCategory(getContext());
        PreferenceCategory preferenceCategory3 = new PreferenceCategory(getContext());
        preference.f(p.feature_overrides_restart_title);
        preference.a((c) new d(preference, this, a2));
        a2.c(preference);
        preference2.f(p.feature_overrides_reset_title);
        e eVar = new e(this, preferenceCategory, preferenceCategory2, preferenceCategory3, a2);
        preference2.a((c) eVar);
        a2.c(preference2);
        c(preference3);
        g gVar = new g(preference3, this, preferenceCategory, preferenceCategory2, preferenceCategory3, a2);
        preference3.a((c) gVar);
        a2.c(preference3);
        preferenceCategory.f(p.feature_overrides_flag_category_title);
        a2.c((Preference) preferenceCategory);
        preferenceCategory2.f(p.feature_overrides_killswitch_category_title);
        a2.c((Preference) preferenceCategory2);
        preferenceCategory3.f(p.feature_overrides_variants_category_title);
        a2.c((Preference) preferenceCategory3);
        a(preferenceCategory, preferenceCategory2, preferenceCategory3);
        setPreferenceScreen(a2);
    }

    public void onDestroy() {
        this.f.dispose();
        super.onDestroy();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Qb();
    }

    /* access modifiers changed from: private */
    public final void b(Preference preference) {
        StringBuilder sb = new StringBuilder();
        sb.append(getString(p.feature_overrides_force_update_remotes_title));
        sb.append(": fetching");
        preference.b((CharSequence) sb.toString());
    }

    /* access modifiers changed from: private */
    public final void c(Preference preference) {
        preference.b((CharSequence) getString(p.feature_overrides_force_update_remotes_title));
    }

    public final void a(VPa vPa) {
        C7471uYa.b(vPa, "<set-?>");
        this.f = vPa;
    }

    /* access modifiers changed from: private */
    public final void a(PreferenceCategory preferenceCategory, PreferenceCategory preferenceCategory2, PreferenceCategory preferenceCategory3) {
        preferenceCategory.ga();
        List a2 = m.c.a();
        ArrayList<a> arrayList = new ArrayList<>();
        for (Object next : a2) {
            if (!(((a) next) instanceof b)) {
                arrayList.add(next);
            }
        }
        for (a a3 : arrayList) {
            a(preferenceCategory, a3);
        }
        preferenceCategory2.ga();
        List a4 = m.c.a();
        ArrayList<a> arrayList2 = new ArrayList<>();
        for (Object next2 : a4) {
            if (((a) next2) instanceof b) {
                arrayList2.add(next2);
            }
        }
        for (a a5 : arrayList2) {
            a(preferenceCategory2, a5);
        }
        preferenceCategory3.ga();
        a(preferenceCategory3);
    }

    private final void a(PreferenceCategory preferenceCategory) {
        for (c cVar : m.c.b()) {
            ListPreference listPreference = new ListPreference(getContext());
            FirebaseRemoteConfig firebaseRemoteConfig = this.a;
            if (firebaseRemoteConfig != null) {
                SharedPreferences sharedPreferences = this.b;
                if (sharedPreferences != null) {
                    C6699jHa jha = this.e;
                    if (jha != null) {
                        String name = cVar.a(firebaseRemoteConfig, sharedPreferences, jha).name();
                        a((Preference) listPreference, cVar.c(), name);
                        List f2 = cVar.f();
                        String str = "null cannot be cast to non-null type java.util.Collection<T>";
                        if (f2 != null) {
                            Object[] array = f2.toArray(new String[0]);
                            String str2 = "null cannot be cast to non-null type kotlin.Array<T>";
                            if (array != null) {
                                listPreference.a((CharSequence[]) array);
                                List f3 = cVar.f();
                                if (f3 != null) {
                                    Object[] array2 = f3.toArray(new String[0]);
                                    if (array2 != null) {
                                        listPreference.b((CharSequence[]) array2);
                                        listPreference.f(name);
                                        listPreference.d(cVar.c());
                                        listPreference.a((b) new c(listPreference, cVar, this, preferenceCategory));
                                        preferenceCategory.c((Preference) listPreference);
                                    } else {
                                        throw new OVa(str2);
                                    }
                                } else {
                                    throw new OVa(str);
                                }
                            } else {
                                throw new OVa(str2);
                            }
                        } else {
                            throw new OVa(str);
                        }
                    } else {
                        C7471uYa.b("deviceHelper");
                        throw null;
                    }
                } else {
                    C7471uYa.b("appFeaturesPrefs");
                    throw null;
                }
            } else {
                C7471uYa.b("firebaseRemoteConfig");
                throw null;
            }
        }
    }

    private final void a(PreferenceCategory preferenceCategory, a aVar) {
        CheckBoxPreference checkBoxPreference = new CheckBoxPreference(preferenceCategory.b());
        FirebaseRemoteConfig firebaseRemoteConfig = this.a;
        String str = "firebaseRemoteConfig";
        if (firebaseRemoteConfig != null) {
            SharedPreferences sharedPreferences = this.b;
            String str2 = "appFeaturesPrefs";
            if (sharedPreferences != null) {
                C6699jHa jha = this.e;
                String str3 = "deviceHelper";
                if (jha != null) {
                    boolean booleanValue = aVar.a(firebaseRemoteConfig, sharedPreferences, jha).booleanValue();
                    checkBoxPreference.b((CharSequence) aVar.c());
                    checkBoxPreference.a((CharSequence) aVar.b());
                    FirebaseRemoteConfig firebaseRemoteConfig2 = this.a;
                    if (firebaseRemoteConfig2 != null) {
                        SharedPreferences sharedPreferences2 = this.b;
                        if (sharedPreferences2 != null) {
                            C6699jHa jha2 = this.e;
                            if (jha2 != null) {
                                checkBoxPreference.d(aVar.a(firebaseRemoteConfig2, sharedPreferences2, jha2).booleanValue());
                                checkBoxPreference.c((Object) Boolean.valueOf(booleanValue));
                                checkBoxPreference.a((b) new b(this, aVar));
                                preferenceCategory.c((Preference) checkBoxPreference);
                                return;
                            }
                            C7471uYa.b(str3);
                            throw null;
                        }
                        C7471uYa.b(str2);
                        throw null;
                    }
                    C7471uYa.b(str);
                    throw null;
                }
                C7471uYa.b(str3);
                throw null;
            }
            C7471uYa.b(str2);
            throw null;
        }
        C7471uYa.b(str);
        throw null;
    }

    /* access modifiers changed from: private */
    public final void a(Preference preference, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        preference.b((CharSequence) sb.toString());
    }

    /* access modifiers changed from: private */
    public final void a(Preference preference) {
        StringBuilder sb = new StringBuilder();
        sb.append(getString(p.feature_overrides_force_update_remotes_title));
        sb.append(": error");
        preference.b((CharSequence) sb.toString());
    }
}
