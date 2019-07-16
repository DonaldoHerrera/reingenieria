package com.soundcloud.android.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/* compiled from: PromotedImpressionsStorage.kt */
public class _c {
    private final SharedPreferences a;

    public _c(SharedPreferences sharedPreferences) {
        C7471uYa.b(sharedPreferences, "sharedPreferences");
        this.a = sharedPreferences;
    }

    public void a(C3508cda cda) {
        C7471uYa.b(cda, "adUrn");
        Editor edit = this.a.edit();
        C7471uYa.a((Object) edit, "editor");
        edit.putBoolean(cda.b(), true);
        edit.apply();
    }

    public boolean b(C3508cda cda) {
        C7471uYa.b(cda, "adUrn");
        return this.a.contains(cda.b());
    }

    public void a() {
        Editor edit = this.a.edit();
        C7471uYa.a((Object) edit, "editor");
        edit.clear();
        edit.apply();
    }
}
