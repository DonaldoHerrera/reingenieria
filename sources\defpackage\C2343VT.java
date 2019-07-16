package defpackage;

import android.content.SharedPreferences;

/* renamed from: VT reason: default package and case insensitive filesystem */
/* compiled from: ConfigurationSettingsStorage */
public class C2343VT {
    private final SharedPreferences a;

    C2343VT(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.a.edit().clear().apply();
    }

    /* access modifiers changed from: 0000 */
    public void b(C2455aV aVVar) {
        c();
        this.a.edit().putString("pending_plan_upgrade", aVVar.a()).apply();
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.a.edit().remove("pending_plan_downgrade").remove("pending_plan_upgrade").apply();
    }

    /* access modifiers changed from: 0000 */
    public int d() {
        return this.a.getInt("force_update_version", 0);
    }

    /* access modifiers changed from: 0000 */
    public long e() {
        return this.a.getLong("last_config_check_time", -1);
    }

    /* access modifiers changed from: 0000 */
    public C2455aV f() {
        return C2455aV.a(this.a.getString("pending_plan_downgrade", null));
    }

    /* access modifiers changed from: 0000 */
    public C2455aV g() {
        return C2455aV.a(this.a.getString("pending_plan_upgrade", null));
    }

    /* access modifiers changed from: 0000 */
    public void a(long j) {
        this.a.edit().putLong("last_config_check_time", j).apply();
    }

    /* access modifiers changed from: 0000 */
    public void a(C2455aV aVVar) {
        c();
        this.a.edit().putString("pending_plan_downgrade", aVVar.a()).apply();
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.a.edit().remove("force_update_version").apply();
    }

    /* access modifiers changed from: 0000 */
    public void a(int i) {
        this.a.edit().putInt("force_update_version", i).apply();
    }
}
