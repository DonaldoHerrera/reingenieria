package com.google.android.gms.cast;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.internal.cast.C0704fa;
import com.google.android.gms.internal.cast.C0727ra;
import com.google.android.gms.internal.cast.va;

/* renamed from: com.google.android.gms.cast.c reason: case insensitive filesystem */
public final class C0629c {
    private static final AbstractClientBuilder<va, a> a = new U();
    @Deprecated
    public static final Api<a> b = new Api<>("CastRemoteDisplay.API", a, C0704fa.b);
    @Deprecated
    public static final C0630d c = new C0727ra(b);

    @Deprecated
    /* renamed from: com.google.android.gms.cast.c$a */
    public static final class a implements HasOptions {
        final CastDevice a;
        final b b;
        final int c;
    }

    @Deprecated
    /* renamed from: com.google.android.gms.cast.c$b */
    public interface b {
    }

    public static C0631e a(Context context) {
        return new C0631e(context);
    }
}
