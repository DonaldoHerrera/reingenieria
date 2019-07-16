package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.drm.r;
import com.google.android.exoplayer2.trackselection.o;

/* renamed from: com.google.android.exoplayer2.u reason: case insensitive filesystem */
/* compiled from: ExoPlayerFactory */
public final class C0623u {
    private static Up a;

    public static V a(Context context, o oVar) {
        return a(context, new r(context), oVar);
    }

    public static V a(Context context, S s, o oVar) {
        return a(context, s, oVar, new C0616p());
    }

    public static V a(Context context, S s, o oVar, D d) {
        return a(context, s, oVar, d, null, C0471ar.a());
    }

    public static V a(Context context, S s, o oVar, D d, n<r> nVar, Looper looper) {
        return a(context, s, oVar, d, nVar, new a(), looper);
    }

    public static V a(Context context, S s, o oVar, D d, n<r> nVar, a aVar, Looper looper) {
        return a(context, s, oVar, d, nVar, a(context), aVar, looper);
    }

    public static V a(Context context, S s, o oVar, D d, n<r> nVar, Up up, a aVar, Looper looper) {
        V v = new V(context, s, oVar, d, nVar, up, aVar, looper);
        return v;
    }

    private static synchronized Up a(Context context) {
        Up up;
        synchronized (C0623u.class) {
            if (a == null) {
                a = new a(context).a();
            }
            up = a;
        }
        return up;
    }
}
