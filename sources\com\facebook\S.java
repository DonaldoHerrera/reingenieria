package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.ja;
import com.google.android.gms.common.Scopes;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProfileCache */
final class S {
    private final SharedPreferences a = B.e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    S() {
    }

    /* access modifiers changed from: 0000 */
    public void a(Profile profile) {
        ja.a((Object) profile, Scopes.PROFILE);
        JSONObject e = profile.e();
        if (e != null) {
            this.a.edit().putString("com.facebook.ProfileManager.CachedProfile", e.toString()).apply();
        }
    }

    /* access modifiers changed from: 0000 */
    public Profile b() {
        String string = this.a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }
}
