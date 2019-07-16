package com.soundcloud.android.trackinfo;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.view.View;
import android.widget.TextView;

/* compiled from: ViewUtils.kt */
public final class E {
    public static final void a(View view) {
        C7471uYa.b(view, "$this$hide");
        view.setVisibility(8);
    }

    public static final void b(View view) {
        C7471uYa.b(view, "$this$show");
        view.setVisibility(0);
    }

    public static /* synthetic */ void a(TextView textView, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        a(textView, num, num2, num3, num4);
    }

    public static final void a(TextView textView, Integer num, Integer num2, Integer num3, Integer num4) {
        C7471uYa.b(textView, "$this$setDrawableFromVectorResource");
        Resources resources = textView.getResources();
        String str = "resources";
        C7471uYa.a((Object) resources, str);
        C1601pe a = a(num, resources);
        Resources resources2 = textView.getResources();
        C7471uYa.a((Object) resources2, str);
        C1601pe a2 = a(num2, resources2);
        Resources resources3 = textView.getResources();
        C7471uYa.a((Object) resources3, str);
        C1601pe a3 = a(num3, resources3);
        Resources resources4 = textView.getResources();
        C7471uYa.a((Object) resources4, str);
        textView.setCompoundDrawablesWithIntrinsicBounds(a, a2, a3, a(num4, resources4));
    }

    private static final C1601pe a(Integer num, Resources resources) {
        if (num != null) {
            return C1601pe.a(resources, num.intValue(), (Theme) null);
        }
        return null;
    }
}
