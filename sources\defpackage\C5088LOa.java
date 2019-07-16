package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

/* renamed from: LOa reason: default package and case insensitive filesystem */
/* compiled from: PreferenceStoreImpl */
public class C5088LOa implements C5057KOa {
    private final SharedPreferences a;
    private final String b;
    private final Context c;

    public C5088LOa(Context context, String str) {
        if (context != null) {
            this.c = context;
            this.b = str;
            this.a = this.c.getSharedPreferences(this.b, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    @TargetApi(9)
    public boolean a(Editor editor) {
        if (VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }

    public Editor edit() {
        return this.a.edit();
    }

    public SharedPreferences get() {
        return this.a;
    }

    @Deprecated
    public C5088LOa(C5531_Ma _ma) {
        this(_ma.e(), _ma.getClass().getName());
    }
}
