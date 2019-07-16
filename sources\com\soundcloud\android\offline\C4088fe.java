package com.soundcloud.android.offline;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.soundcloud.android.offline.fe reason: case insensitive filesystem */
/* compiled from: OfflineSettingsStorage */
public class C4088fe {
    private final SharedPreferences a;
    private final Context b;

    public C4088fe(@C4082ee SharedPreferences sharedPreferences, Context context) {
        this.a = sharedPreferences;
        this.b = context;
    }

    /* access modifiers changed from: 0000 */
    public void a(Oc oc) {
        this.a.edit().putString("offline_content_location", oc.d).apply();
    }

    public void b(boolean z) {
        this.a.edit().putBoolean("offline_wifi_only", z).apply();
    }

    public Oc c() {
        return Oc.a(this.a.getString("offline_content_location", Oc.DEVICE_STORAGE.d));
    }

    public APa<String> d() {
        return APa.a((CPa<T>) new C4819Cua<T>(this.a)).a((C7256rQa<? super T>) new C4071d<Object>("offline_content_location"));
    }

    public long e() {
        return this.a.getLong("offline_storage_limit", Long.MAX_VALUE);
    }

    /* access modifiers changed from: 0000 */
    public APa<Boolean> f() {
        return APa.a((CPa<T>) new C4819Cua<T>(this.a)).a((C7256rQa<? super T>) new C4071d<Object>("offline_wifi_only")).h(new Ea(this));
    }

    public boolean g() {
        return this.a.getBoolean("has_content_offline", false);
    }

    public boolean h() {
        return this.a.getBoolean("offline_settings_onboarding", false);
    }

    public boolean i() {
        return e() != Long.MAX_VALUE;
    }

    public Boolean j() {
        return Boolean.valueOf(this.a.getBoolean("is_offline_collection", false));
    }

    public boolean k() {
        Oc c = c();
        return Oc.DEVICE_STORAGE == c || (Oc.SD_CARD == c && C6698jGa.f(this.b));
    }

    public boolean l() {
        return this.a.getBoolean("offline_wifi_only", true);
    }

    public void m() {
        this.a.edit().putBoolean("is_offline_collection", false).apply();
    }

    /* access modifiers changed from: 0000 */
    public void n() {
        this.a.edit().putBoolean("offline_settings_onboarding", true).apply();
    }

    public void o() {
        a(Long.MAX_VALUE);
    }

    public void a(long j) {
        this.a.edit().putLong("offline_storage_limit", j).apply();
    }

    public void b() {
        this.a.edit().clear().apply();
    }

    public void a() {
        this.a.edit().putBoolean("is_offline_collection", true).apply();
    }

    public /* synthetic */ Boolean a(String str) throws Exception {
        return Boolean.valueOf(this.a.getBoolean(str, false));
    }

    public void a(boolean z) {
        this.a.edit().putBoolean("has_content_offline", z).apply();
    }
}
