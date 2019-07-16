package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;

/* renamed from: DV reason: default package and case insensitive filesystem */
/* compiled from: KeyStorage */
class C2001DV {
    private final SharedPreferences a;
    private final String b = a(C3344wV.a.b());

    public C2001DV(@C3324vV SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    private byte[] c(String str) {
        return Base64.decode(str, 0);
    }

    private byte[] d(String str) {
        return c(this.a.getString(str, this.b));
    }

    private String e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".iv");
        return sb.toString();
    }

    public void a(C3344wV wVVar) {
        Editor edit = this.a.edit();
        edit.putString(wVVar.c(), a(wVVar.b()));
        if (wVVar.d()) {
            edit.putString(e(wVVar.c()), a(wVVar.a()));
        }
        edit.apply();
    }

    public C3344wV b(String str) {
        if (this.a.contains(str)) {
            return new C3344wV(str, d(str), d(e(str)));
        }
        return C3344wV.a;
    }

    public boolean a(String str) {
        return this.a.contains(str);
    }

    private String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 0);
    }
}
