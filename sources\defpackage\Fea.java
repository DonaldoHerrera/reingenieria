package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: Fea reason: default package */
/* compiled from: IntroductoryOverlayOperations */
public class Fea implements OnSharedPreferenceChangeListener {
    private static final long a = TimeUnit.SECONDS.toMillis(1);
    private final SharedPreferences b;
    private final C5694cGa c;
    private final Set<a> d = new HashSet();

    /* renamed from: Fea$a */
    /* compiled from: IntroductoryOverlayOperations */
    public interface a {
        void a(String str);
    }

    public Fea(SharedPreferences sharedPreferences, C5694cGa cga) {
        this.b = sharedPreferences;
        this.c = cga;
    }

    public void a(String str, boolean z) {
        this.b.edit().putBoolean(str, z).putLong("overlay_shown_time", this.c.a()).apply();
    }

    public boolean b(String str) {
        return this.b.getBoolean(str, false);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        for (a aVar : this.d) {
            if (Eea.a.contains(str)) {
                aVar.a(str);
            }
        }
    }

    public void b(a aVar) {
        this.d.remove(aVar);
        this.b.unregisterOnSharedPreferenceChangeListener(this);
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        a(str, true);
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return this.c.a() > this.b.getLong("overlay_shown_time", 1) + a;
    }

    public void a(a aVar) {
        this.d.add(aVar);
        this.b.registerOnSharedPreferenceChangeListener(this);
    }
}
