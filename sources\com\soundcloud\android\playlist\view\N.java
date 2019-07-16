package com.soundcloud.android.playlist.view;

import android.content.res.Resources;
import android.view.View;
import com.soundcloud.android.view.CustomFontTitleToolbar;

/* compiled from: PlaylistDetailsHeaderAnimatorFactory */
final class N {
    private final C7054oVa<Resources> a;

    N(C7054oVa<Resources> ova) {
        a(ova, 1);
        this.a = ova;
    }

    /* access modifiers changed from: 0000 */
    public M a(CustomFontTitleToolbar customFontTitleToolbar, View view, View view2) {
        a(customFontTitleToolbar, 1);
        CustomFontTitleToolbar customFontTitleToolbar2 = customFontTitleToolbar;
        a(view, 2);
        View view3 = view;
        a(view2, 3);
        View view4 = view2;
        Object obj = this.a.get();
        a(obj, 4);
        return new M(customFontTitleToolbar2, view3, view4, (Resources) obj);
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
