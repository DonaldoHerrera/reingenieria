package com.soundcloud.android.settings.notifications;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: NotificationPreferencesStorage */
public class p {
    private final SharedPreferences a;
    private final C5694cGa b;

    public p(SharedPreferences sharedPreferences, C5694cGa cga) {
        this.a = sharedPreferences;
        this.b = cga;
    }

    /* access modifiers changed from: 0000 */
    public j a() {
        i[] values;
        j jVar = new j();
        for (i iVar : i.values()) {
            jVar.a(iVar.a(), a(iVar));
        }
        return jVar;
    }

    /* access modifiers changed from: 0000 */
    public void b(String str) {
        this.a.edit().putBoolean(c(str), this.a.getBoolean(str, true)).apply();
    }

    /* access modifiers changed from: 0000 */
    public long c() {
        return this.b.a() - this.a.getLong("last_update", -1);
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        return this.a.getBoolean("pending_sync", false);
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        this.a.edit().putLong("last_update", this.b.a()).apply();
    }

    private String c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("backup_");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public boolean a(String str) {
        return this.a.getBoolean(c(str), true);
    }

    public void b() {
        this.a.edit().clear().apply();
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        this.a.edit().putBoolean("pending_sync", z).apply();
    }

    /* access modifiers changed from: 0000 */
    public void a(j jVar) {
        Map a2 = jVar.a();
        Editor edit = this.a.edit();
        for (Entry entry : a2.entrySet()) {
            C4928GKa a3 = i.a((String) entry.getKey());
            if (a3.c()) {
                i iVar = (i) a3.b();
                h hVar = (h) entry.getValue();
                if (iVar.d().c()) {
                    edit.putBoolean((String) iVar.d().b(), hVar.b());
                }
                if (iVar.b().c()) {
                    edit.putBoolean((String) iVar.b().b(), hVar.a());
                }
            }
        }
        edit.apply();
    }

    private h a(i iVar) {
        return new h(a(iVar.d()), a(iVar.b()));
    }

    private boolean a(C4928GKa<String> gKa) {
        if (gKa.c()) {
            return this.a.getBoolean((String) gKa.b(), true);
        }
        return true;
    }
}
