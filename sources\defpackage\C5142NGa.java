package defpackage;

import android.view.View;

/* renamed from: NGa reason: default package and case insensitive filesystem */
/* compiled from: AccessibilityUtils.kt */
public final class C5142NGa extends C0273Wb {
    final /* synthetic */ String d;

    C5142NGa(String str) {
        this.d = str;
    }

    public void a(View view, Mc mc) {
        C7471uYa.b(view, "v");
        C7471uYa.b(mc, "info");
        super.a(view, mc);
        a aVar = a.e;
        C7471uYa.a((Object) aVar, "ACTION_CLICK");
        mc.a(new a(aVar.a(), this.d));
    }
}
