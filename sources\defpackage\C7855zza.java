package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/* renamed from: zza reason: default package and case insensitive filesystem */
/* compiled from: StringPreference.kt */
public final class C7855zza extends C7786yza<String> {
    private final String c;
    private final SharedPreferences d;

    public C7855zza(String str, SharedPreferences sharedPreferences) {
        C7471uYa.b(str, "key");
        C7471uYa.b(sharedPreferences, "preferences");
        super(str, sharedPreferences);
        this.c = str;
        this.d = sharedPreferences;
    }

    /* renamed from: a */
    public void setValue(String str) {
        Editor edit = this.d.edit();
        C7471uYa.a((Object) edit, "editor");
        edit.putString(this.c, str);
        edit.apply();
    }

    public String getValue() {
        return this.d.getString(this.c, null);
    }
}
