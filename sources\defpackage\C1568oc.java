package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.PointerIcon;

/* renamed from: oc reason: default package and case insensitive filesystem */
/* compiled from: PointerIconCompat */
public final class C1568oc {
    private Object a;

    private C1568oc(Object obj) {
        this.a = obj;
    }

    public Object a() {
        return this.a;
    }

    public static C1568oc a(Context context, int i) {
        if (VERSION.SDK_INT >= 24) {
            return new C1568oc(PointerIcon.getSystemIcon(context, i));
        }
        return new C1568oc(null);
    }
}
