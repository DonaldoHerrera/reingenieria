package com.google.android.gms.internal.cast;

import android.content.Context;
import com.google.android.gms.cast.C0627a;
import com.google.android.gms.cast.C0628b;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0668u;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.r;

public final class Ga extends C0668u {
    private final CastOptions d;
    private final Na e;

    public Ga(Context context, CastOptions castOptions, Na na) {
        String str;
        if (castOptions.Y().isEmpty()) {
            str = C0628b.a(castOptions.H());
        } else {
            str = C0628b.a(castOptions.H(), castOptions.Y());
        }
        super(context, str);
        this.d = castOptions;
        this.e = na;
    }

    public final r a(String str) {
        C0636d dVar = new C0636d(b(), a(), str, this.d, C0627a.c, new Ea(), new C0709i(b(), this.d, this.e));
        return dVar;
    }

    public final boolean c() {
        return this.d.I();
    }
}
