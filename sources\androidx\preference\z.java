package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/* compiled from: PreferenceManager */
public class z {
    private Context a;
    private long b = 0;
    private SharedPreferences c;
    private C0406n d;
    private Editor e;
    private boolean f;
    private String g;
    private int h;
    private int i = 0;
    private PreferenceScreen j;
    private d k;
    private c l;
    private a m;
    private b n;

    /* compiled from: PreferenceManager */
    public interface a {
        void onDisplayPreferenceDialog(Preference preference);
    }

    /* compiled from: PreferenceManager */
    public interface b {
        void onNavigateToScreen(PreferenceScreen preferenceScreen);
    }

    /* compiled from: PreferenceManager */
    public interface c {
        boolean onPreferenceTreeClick(Preference preference);
    }

    /* compiled from: PreferenceManager */
    public static abstract class d {
        public abstract boolean a(Preference preference, Preference preference2);

        public abstract boolean b(Preference preference, Preference preference2);
    }

    public z(Context context) {
        this.a = context;
        a(b(context));
    }

    public PreferenceScreen a(Context context, int i2, PreferenceScreen preferenceScreen) {
        a(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new y(context, this).a(i2, (PreferenceGroup) preferenceScreen);
        preferenceScreen2.a(this);
        a(false);
        return preferenceScreen2;
    }

    /* access modifiers changed from: 0000 */
    public long b() {
        long j2;
        synchronized (this) {
            j2 = this.b;
            this.b = 1 + j2;
        }
        return j2;
    }

    public b c() {
        return this.n;
    }

    public c d() {
        return this.l;
    }

    public d e() {
        return this.k;
    }

    public C0406n f() {
        return this.d;
    }

    public PreferenceScreen g() {
        return this.j;
    }

    public SharedPreferences h() {
        Context context;
        if (f() != null) {
            return null;
        }
        if (this.c == null) {
            if (this.i != 1) {
                context = this.a;
            } else {
                context = androidx.core.content.a.a(this.a);
            }
            this.c = context.getSharedPreferences(this.g, this.h);
        }
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public boolean i() {
        return !this.f;
    }

    private static String b(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append("_preferences");
        return sb.toString();
    }

    public PreferenceScreen a(Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.a(this);
        return preferenceScreen;
    }

    public void a(String str) {
        this.g = str;
        this.c = null;
    }

    public boolean a(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.j;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.V();
        }
        this.j = preferenceScreen;
        return true;
    }

    public Preference a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.j;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.c(charSequence);
    }

    /* access modifiers changed from: 0000 */
    public Editor a() {
        if (this.d != null) {
            return null;
        }
        if (!this.f) {
            return h().edit();
        }
        if (this.e == null) {
            this.e = h().edit();
        }
        return this.e;
    }

    private void a(boolean z) {
        if (!z) {
            Editor editor = this.e;
            if (editor != null) {
                editor.apply();
            }
        }
        this.f = z;
    }

    public void a(a aVar) {
        this.m = aVar;
    }

    public void a(Preference preference) {
        a aVar = this.m;
        if (aVar != null) {
            aVar.onDisplayPreferenceDialog(preference);
        }
    }

    public void a(c cVar) {
        this.l = cVar;
    }

    public void a(b bVar) {
        this.n = bVar;
    }
}
