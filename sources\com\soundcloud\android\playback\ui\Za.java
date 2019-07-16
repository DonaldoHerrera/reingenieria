package com.soundcloud.android.playback.ui;

import android.view.View;
import com.soundcloud.android.stations.Ga;

/* compiled from: ErrorViewControllerFactory */
class Za {
    private final C7054oVa<Ga> a;

    Za(C7054oVa<Ga> ova) {
        a(ova, 1);
        this.a = ova;
    }

    /* access modifiers changed from: 0000 */
    public Ya a(View view) {
        Object obj = this.a.get();
        a(obj, 1);
        Ga ga = (Ga) obj;
        a(view, 2);
        return new Ya(ga, view);
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
