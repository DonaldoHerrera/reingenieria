package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.B;

/* renamed from: dl reason: default package and case insensitive filesystem */
/* compiled from: SourceApplicationInfo */
class C1238dl {
    private String a;
    private boolean b;

    private C1238dl(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public static void a() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(B.e()).edit();
        edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
        edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
        edit.apply();
    }

    public static C1238dl b() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(B.e());
        String str = "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage";
        if (!defaultSharedPreferences.contains(str)) {
            return null;
        }
        return new C1238dl(defaultSharedPreferences.getString(str, null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
    }

    public void c() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(B.e()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.b);
        edit.apply();
    }

    public String toString() {
        String str = this.b ? "Applink" : "Unclassified";
        if (this.a == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("(");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
