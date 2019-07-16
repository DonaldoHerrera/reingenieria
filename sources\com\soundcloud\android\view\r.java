package com.soundcloud.android.view;

import android.view.View;
import com.soundcloud.android.view.C6228q.a;

/* compiled from: CollapsingToolbarStyleHelperFactory */
public final class r {
    public C6228q a(CustomFontTitleToolbar customFontTitleToolbar, View view, View view2, a aVar) {
        a(customFontTitleToolbar, 1);
        CustomFontTitleToolbar customFontTitleToolbar2 = customFontTitleToolbar;
        a(view, 2);
        View view3 = view;
        a(view2, 3);
        View view4 = view2;
        a(aVar, 4);
        return new C6228q(customFontTitleToolbar2, view3, view4, aVar);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
