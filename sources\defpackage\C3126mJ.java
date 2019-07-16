package defpackage;

import android.content.Context;

/* renamed from: mJ reason: default package and case insensitive filesystem */
/* compiled from: OMSdkWrapper.kt */
public final class C3126mJ {
    private final C3469VY a;

    public C3126mJ(C3469VY vy) {
        C7471uYa.b(vy, "errorReporter");
        this.a = vy;
    }

    public final void a(Context context) {
        C7471uYa.b(context, "context");
        try {
            if (!C3389zG.a(C3389zG.a(), context)) {
                a.a(this.a, new C3107lJ("Could not activate OM SDK"), null, 2, null);
            }
        } catch (IllegalArgumentException unused) {
            a.a(this.a, new C3107lJ("OM SDK version missing"), null, 2, null);
        }
    }
}
