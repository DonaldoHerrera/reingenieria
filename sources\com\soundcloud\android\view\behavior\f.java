package com.soundcloud.android.view.behavior;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PlayerBehaviorFactory */
public class f {
    public e a(BottomSheetBehavior<View> bottomSheetBehavior) {
        a(bottomSheetBehavior, 1);
        return new e(bottomSheetBehavior);
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
