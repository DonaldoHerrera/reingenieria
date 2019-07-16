package defpackage;

import android.annotation.SuppressLint;

@SuppressLint({"CommitPrefEdits"})
/* renamed from: gj reason: default package and case insensitive filesystem */
/* compiled from: PreferenceManager */
class C1328gj {
    private final C5057KOa a;
    private final Ei b;

    public C1328gj(C5057KOa kOa, Ei ei) {
        this.a = kOa;
        this.b = ei;
    }

    public static C1328gj a(C5057KOa kOa, Ei ei) {
        return new C1328gj(kOa, ei);
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        C5057KOa kOa = this.a;
        kOa.a(kOa.edit().putBoolean("always_send_reports_opt_in", z));
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        String str = "preferences_migration_complete";
        String str2 = "always_send_reports_opt_in";
        if (!this.a.get().contains(str)) {
            C5088LOa lOa = new C5088LOa(this.b);
            if (!this.a.get().contains(str2) && lOa.get().contains(str2)) {
                boolean z = lOa.get().getBoolean(str2, false);
                C5057KOa kOa = this.a;
                kOa.a(kOa.edit().putBoolean(str2, z));
            }
            C5057KOa kOa2 = this.a;
            kOa2.a(kOa2.edit().putBoolean(str, true));
        }
        return this.a.get().getBoolean(str2, false);
    }
}
