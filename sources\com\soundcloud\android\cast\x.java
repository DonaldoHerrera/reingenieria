package com.soundcloud.android.cast;

import android.content.Context;
import android.os.Bundle;
import androidx.mediarouter.app.B;
import androidx.mediarouter.app.g;
import androidx.mediarouter.app.h;
import com.soundcloud.android.ia.q;

/* compiled from: CustomMediaRouteDialogFactory */
public class x extends B {

    /* compiled from: CustomMediaRouteDialogFactory */
    public static class a extends h {
        public g a(Context context, Bundle bundle) {
            return new g(context, q.CastDialogStyle);
        }
    }

    x() {
    }

    public h b() {
        return new a();
    }
}
