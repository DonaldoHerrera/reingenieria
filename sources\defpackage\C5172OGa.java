package defpackage;

import android.view.View;

/* renamed from: OGa reason: default package and case insensitive filesystem */
/* compiled from: AccessibilityUtils.kt */
public final class C5172OGa {
    public static final void a(View view) {
        C7471uYa.b(view, "$this$announceOnTextChange");
        C1778vc.e(view, 1);
    }

    public static final void a(View view, int i) {
        C7471uYa.b(view, "$this$addAccessibilityAction");
        String string = view.getResources().getString(i);
        C7471uYa.a((Object) string, "this.resources.getString(resource)");
        a(view, string);
    }

    public static final void a(View view, String str) {
        C7471uYa.b(view, "$this$addAccessibilityAction");
        C7471uYa.b(str, "label");
        C1778vc.a(view, (C0273Wb) new C5142NGa(str));
    }
}
