package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/* renamed from: yza reason: default package and case insensitive filesystem */
/* compiled from: SharedPreferenceBackedPreference.kt */
public abstract class C7786yza<T> implements C7648wza<T> {
    private final String a;
    private final SharedPreferences b;

    public C7786yza(String str, SharedPreferences sharedPreferences) {
        C7471uYa.b(str, "key");
        C7471uYa.b(sharedPreferences, "preferences");
        this.a = str;
        this.b = sharedPreferences;
    }

    public void clear() {
        Editor edit = this.b.edit();
        C7471uYa.a((Object) edit, "editor");
        edit.remove(this.a);
        edit.apply();
    }
}
