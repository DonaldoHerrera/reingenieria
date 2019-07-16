package com.soundcloud.android.playback;

import android.content.Context;
import com.soundcloud.android.playback.core.l;
import java.io.File;

/* compiled from: PlayerCacheFactory.kt */
public class Ec {
    private final C6291dHa a;

    public Ec(C6291dHa dha) {
        C7471uYa.b(dha, "countryProvider");
        this.a = dha;
    }

    public <T> l<T> a(Context context, T t, File file) {
        C7471uYa.b(context, "context");
        return new M(context, t, file, this.a);
    }
}
