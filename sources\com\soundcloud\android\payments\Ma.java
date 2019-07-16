package com.soundcloud.android.payments;

import android.content.SharedPreferences;

/* compiled from: TokenStorage */
class Ma {
    private final SharedPreferences a;

    Ma(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        this.a.edit().putString("pending_transaction_urn", str).apply();
    }

    /* access modifiers changed from: 0000 */
    public String b() {
        return this.a.getString("pending_transaction_urn", null);
    }

    public void a() {
        this.a.edit().clear().apply();
    }
}
