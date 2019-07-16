package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: XU reason: default package and case insensitive filesystem */
/* compiled from: FeatureStorage */
public class C2380XU {
    /* access modifiers changed from: private */
    public final SharedPreferences a;
    private final C7118pQa<String, Boolean> b = new C2362WU(this);

    public C2380XU(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    private void b(String str, boolean z) {
        Editor edit = this.a.edit();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_enabled");
        edit.putBoolean(sb.toString(), z).apply();
    }

    private C7256rQa<String> c(String str) {
        return new C2344VU(str);
    }

    public void a(List<C2417ZU> list) {
        for (C2417ZU a2 : list) {
            a(a2);
        }
    }

    public APa<Boolean> b(String str) {
        return APa.a((CPa<T>) new C4819Cua<T>(this.a)).a(c(str)).h(this.b);
    }

    public void a(C2417ZU zu) {
        SDb.a("Configuration").a("updating feature: %s", zu);
        b(zu.b(), zu.a());
        a(zu.b(), zu.c());
    }

    private void a(String str, List<C2455aV> list) {
        Editor edit = this.a.edit();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_plans");
        edit.putStringSet(sb.toString(), C2474bV.a(list)).apply();
    }

    public boolean a(String str, boolean z) {
        SharedPreferences sharedPreferences = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_enabled");
        return sharedPreferences.getBoolean(sb.toString(), z);
    }

    static /* synthetic */ boolean a(String str, String str2) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_enabled");
        return str2.equals(sb.toString());
    }

    public List<C2455aV> a(String str) {
        SharedPreferences sharedPreferences = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_plans");
        return C2455aV.a((Collection<String>) sharedPreferences.getStringSet(sb.toString(), Collections.emptySet()));
    }

    public void a() {
        this.a.edit().clear().apply();
    }
}
