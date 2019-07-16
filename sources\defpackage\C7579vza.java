package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/* renamed from: vza reason: default package and case insensitive filesystem */
/* compiled from: BooleanPreference.kt */
public final class C7579vza extends C7786yza<Boolean> {
    private final String c;
    private final SharedPreferences d;

    public C7579vza(String str, SharedPreferences sharedPreferences) {
        C7471uYa.b(str, "key");
        C7471uYa.b(sharedPreferences, "preferences");
        super(str, sharedPreferences);
        this.c = str;
        this.d = sharedPreferences;
    }

    public void a(boolean z) {
        Editor edit = this.d.edit();
        C7471uYa.a((Object) edit, "editor");
        edit.putBoolean(this.c, z);
        edit.apply();
    }

    public /* bridge */ /* synthetic */ void setValue(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    public Boolean getValue() {
        return Boolean.valueOf(this.d.getBoolean(this.c, false));
    }
}
