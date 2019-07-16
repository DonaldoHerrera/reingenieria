package defpackage;

import android.content.SharedPreferences;

/* renamed from: bDa reason: default package and case insensitive filesystem */
/* compiled from: TimelineSyncStorage */
public class C5622bDa {
    private final SharedPreferences a;

    public C5622bDa(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public void a(C4928GKa<Oca> gKa) {
        String str = "next_url";
        if (gKa.c()) {
            String a2 = ((Oca) gKa.b()).a();
            SDb.a("Writing next soundstream link to preferences : %s", a2);
            this.a.edit().putString(str, a2).apply();
            return;
        }
        SDb.a("No next link in soundstream response, clearing any stored link", new Object[0]);
        this.a.edit().remove(str).apply();
    }

    public String b() {
        return this.a.getString("future_url", "");
    }

    public String c() {
        return this.a.getString("next_url", "");
    }

    public boolean d() {
        return this.a.contains("next_url");
    }

    public boolean e() {
        return !this.a.contains("future_url");
    }

    public void a(Oca oca) {
        String a2 = oca.a();
        SDb.a("Writing future soundstream link to preferences : %s", a2);
        this.a.edit().putString("future_url", a2).apply();
    }

    public void a() {
        this.a.edit().clear().apply();
    }
}
