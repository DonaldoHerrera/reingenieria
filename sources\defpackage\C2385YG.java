package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: YG reason: default package and case insensitive filesystem */
public class C2385YG {
    @SuppressLint({"StaticFieldLeak"})
    private static C2385YG a = new C2385YG();
    private Context b;

    private C2385YG() {
    }

    public static C2385YG a() {
        return a;
    }

    public void a(Context context) {
        this.b = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.b;
    }
}
