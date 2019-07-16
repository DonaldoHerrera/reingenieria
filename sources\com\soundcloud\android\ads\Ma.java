package com.soundcloud.android.ads;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import com.google.common.base.Predicate;
import com.soundcloud.android.foundation.ads.U;
import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.foundation.ads.da;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.playback.ui.view.RoundedColorButton;

/* compiled from: AdUtils */
public final class Ma {
    public static final Predicate<q> a = C2648z.a;

    private Ma() {
    }

    public static boolean a(q qVar) {
        return qVar.a().c() && (qVar.a().b() instanceof ca);
    }

    private static ColorStateList a(String str, String str2, String str3) {
        return new ColorStateList(new int[][]{new int[]{16842908}, new int[]{16842919}, new int[0]}, new int[]{Color.parseColor(str), Color.parseColor(str2), Color.parseColor(str3)});
    }

    static void a(U u, Resources resources, RoundedColorButton roundedColorButton) {
        String string = resources.getString(p.ads_call_to_action);
        if (u.m() != null) {
            string = u.m();
        }
        roundedColorButton.setText(string);
        if (u.n() != null) {
            da n = u.n();
            roundedColorButton.setTextColor(a(n.d(), n.f(), n.b()));
            roundedColorButton.setBackground(a(n.c(), n.e(), n.a()));
        }
    }
}
