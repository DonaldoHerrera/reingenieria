package com.soundcloud.android.settings.notifications;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.preference.TwoStatePreference;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.ia.s;
import java.util.Collection;

/* compiled from: NotificationPreferencesFragment */
public class l extends PreferenceFragment {
    private static final Collection<String> a = i.e();
    private static final Collection<String> b = i.c();
    n c;
    private UPa d = new UPa();

    public l() {
        SoundCloudApplication.f().a(this);
    }

    private void a() {
        getPreferenceManager().setSharedPreferencesName("notification_preferences");
        addPreferencesFromResource(s.notification_preferences);
        c();
        b();
    }

    private void c() {
        i.LIKES.d().a((C7733yKa<? super T>) new c<Object>(this));
        i.LIKES.b().a((C7733yKa<? super T>) new d<Object>(this));
    }

    private boolean d(String str) {
        C4928GKa c2 = c(str);
        return c2.c() && ((TwoStatePreference) c2.b()).isChecked();
    }

    private void e(String str) {
        boolean d2 = d(str);
        if (a.contains(str)) {
            a(d2, "all_mobile", a);
        } else if (b.contains(str)) {
            a(d2, "all_mail", b);
        }
    }

    public /* synthetic */ void b(String str) {
        getPreferenceScreen().findPreference(str).setTitle(p.email_notifications_like);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
    }

    public void onDestroy() {
        super.onDestroy();
        this.d.b();
    }

    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        if (preference.hasKey()) {
            String key = preference.getKey();
            char c2 = 65535;
            int hashCode = key.hashCode();
            String str = "all_mail";
            String str2 = "all_mobile";
            if (hashCode != 1366043904) {
                if (hashCode == 1798054293 && key.equals(str)) {
                    c2 = 1;
                }
            } else if (key.equals(str2)) {
                c2 = 0;
            }
            if (c2 == 0) {
                a(str2, a);
            } else if (c2 != 1) {
                e(key);
            } else {
                a(str, b);
            }
            UPa uPa = this.d;
            IPa c3 = this.c.c();
            C5068Kua kua = new C5068Kua();
            c3.c(kua);
            uPa.b(kua);
        }
        return true;
    }

    private void c(Collection<String> collection) {
        for (String str : collection) {
            a(str, this.c.b(str));
        }
        if (!b(collection)) {
            a(collection, true);
        }
    }

    private void b() {
        a("all_mobile", b(a));
        a("all_mail", b(b));
    }

    public /* synthetic */ void a(String str) {
        getPreferenceScreen().findPreference(str).setTitle(p.push_notifications_like);
    }

    private boolean b(Collection<String> collection) {
        for (String d2 : collection) {
            if (d(d2)) {
                return true;
            }
        }
        return false;
    }

    private C4928GKa<TwoStatePreference> c(String str) {
        return C4928GKa.b((TwoStatePreference) getPreferenceScreen().findPreference(str));
    }

    private void a(boolean z, String str, Collection<String> collection) {
        if (z && !d(str)) {
            a(str, true);
        } else if (!b(collection)) {
            a(collection);
            a(str, false);
        }
    }

    private void a(String str, Collection<String> collection) {
        if (d(str)) {
            c(collection);
            return;
        }
        a(collection);
        a(collection, false);
    }

    private void a(Collection<String> collection) {
        for (String a2 : collection) {
            this.c.a(a2);
        }
    }

    private void a(String str, boolean z) {
        C4928GKa c2 = c(str);
        if (c2.c()) {
            ((TwoStatePreference) c2.b()).setChecked(z);
        }
    }

    private void a(Collection<String> collection, boolean z) {
        for (String a2 : collection) {
            a(a2, z);
        }
    }
}
