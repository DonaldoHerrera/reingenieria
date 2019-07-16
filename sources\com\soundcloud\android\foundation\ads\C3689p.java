package com.soundcloud.android.foundation.ads;

import com.soundcloud.android.foundation.ads.C3688o.a;
import com.soundcloud.android.foundation.ads.C3688o.b;

/* renamed from: com.soundcloud.android.foundation.ads.p reason: case insensitive filesystem */
/* compiled from: ApiBaseAdVisualCompanion.kt */
public final class C3689p {
    public static final String a(C3688o oVar) {
        if (!(oVar instanceof b)) {
            return null;
        }
        String d = d(oVar).d();
        if (d.length() > 0) {
            return d;
        }
        return null;
    }

    public static final String b(C3688o oVar) {
        if (oVar instanceof b) {
            return d(oVar).g();
        }
        return null;
    }

    public static final a c(C3688o oVar) {
        C7471uYa.b(oVar, "$this$toHtmlCompanion");
        return (a) oVar;
    }

    public static final b d(C3688o oVar) {
        C7471uYa.b(oVar, "$this$toImageCompanion");
        return (b) oVar;
    }
}
