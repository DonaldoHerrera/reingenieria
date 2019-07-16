package com.soundcloud.android.upsell;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.concurrent.TimeUnit;

/* compiled from: InlineUpsellStorage */
class c {
    private final SharedPreferences a;
    private final C5694cGa b;

    public c(SharedPreferences sharedPreferences, C5694cGa cga) {
        this.a = sharedPreferences;
        this.b = cga;
    }

    private boolean c(String str) {
        long a2 = this.b.a();
        SharedPreferences sharedPreferences = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("upsell_dismissed:");
        sb.append(str);
        return TimeUnit.MILLISECONDS.toHours(a2 - sharedPreferences.getLong(sb.toString(), this.b.a())) >= 48;
    }

    private boolean d(String str) {
        SharedPreferences sharedPreferences = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("upsell_dismissed:");
        sb.append(str);
        return sharedPreferences.contains(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.a.edit().clear().apply();
    }

    /* access modifiers changed from: 0000 */
    public void b(String str) {
        Editor edit = this.a.edit();
        StringBuilder sb = new StringBuilder();
        sb.append("upsell_dismissed:");
        sb.append(str);
        edit.putLong(sb.toString(), this.b.a()).apply();
    }

    /* access modifiers changed from: 0000 */
    public boolean a(String str) {
        return !d(str) || c(str);
    }
}
