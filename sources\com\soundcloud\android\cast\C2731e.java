package com.soundcloud.android.cast;

import android.content.Context;
import com.soundcloud.android.properties.j;

/* renamed from: com.soundcloud.android.cast.e reason: case insensitive filesystem */
/* compiled from: CastConfigStorage_Factory */
public final class C2731e implements C4961HMa<C2730d> {
    private final C7054oVa<Context> a;
    private final C7054oVa<j> b;
    private final C7054oVa<C7648wza<String>> c;

    public static C2730d a(Context context, j jVar, C7648wza<String> wza) {
        return new C2730d(context, jVar, wza);
    }

    public C2730d get() {
        return new C2730d((Context) this.a.get(), (j) this.b.get(), (C7648wza) this.c.get());
    }
}
