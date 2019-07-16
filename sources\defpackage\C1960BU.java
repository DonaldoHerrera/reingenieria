package defpackage;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: BU reason: default package and case insensitive filesystem */
/* compiled from: PlanStorage */
public class C1960BU {
    private static final C7256rQa<String> a = new C1939AT("upsells");
    private final SharedPreferences b;
    private final C7118pQa<String, List<C2455aV>> c = new C2136KT(this);

    public C1960BU(SharedPreferences sharedPreferences) {
        this.b = sharedPreferences;
    }

    private void b(List<C2493cV> list) {
        int i = 0;
        for (C2493cV cVVar : list) {
            if (C2455aV.a(cVVar.a()) == C2455aV.HIGH_TIER) {
                i = cVVar.b();
            }
        }
        this.b.edit().putInt("high_tier_trial", i).apply();
    }

    public /* synthetic */ List a(String str) throws Exception {
        return d();
    }

    public C2455aV c() {
        return C2455aV.a(this.b.getString("plan", C2455aV.UNDEFINED.a()));
    }

    public List<C2455aV> d() {
        return C2455aV.a((Collection<String>) this.b.getStringSet("upsells", Collections.emptySet()));
    }

    /* access modifiers changed from: 0000 */
    public String e() {
        return this.b.getString("vendor", "");
    }

    /* access modifiers changed from: 0000 */
    public boolean f() {
        return this.b.getBoolean("manageable", false);
    }

    /* access modifiers changed from: 0000 */
    public void a(C2455aV aVVar) {
        this.b.edit().putString("plan", aVVar.a()).apply();
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        this.b.edit().putBoolean("manageable", z).apply();
    }

    /* access modifiers changed from: 0000 */
    public void a(C4928GKa<String> gKa) {
        String str = "vendor";
        if (gKa.c()) {
            this.b.edit().putString(str, (String) gKa.b()).apply();
        } else {
            this.b.edit().remove(str).apply();
        }
    }

    /* access modifiers changed from: 0000 */
    public int b() {
        return this.b.getInt("high_tier_trial", 0);
    }

    public void a(List<C2493cV> list) {
        String str = "upsells";
        this.b.edit().putStringSet(str, C2474bV.a(C2455aV.b(list))).apply();
        b(list);
    }

    public void a() {
        this.b.edit().clear().apply();
    }
}
