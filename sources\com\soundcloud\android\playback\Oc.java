package com.soundcloud.android.playback;

import android.content.Context;
import android.media.AudioManager;
import com.soundcloud.android.properties.a;
import java.io.File;

/* compiled from: PlayerModule_ProvideFlipperConfigurationFactory */
public final class Oc implements C4961HMa<Ula> {
    private final C7054oVa<Context> a;
    private final C7054oVa<Ec> b;
    private final C7054oVa<String> c;
    private final C7054oVa<File> d;
    private final C7054oVa<AudioManager> e;
    private final C7054oVa<a> f;

    public Oc(C7054oVa<Context> ova, C7054oVa<Ec> ova2, C7054oVa<String> ova3, C7054oVa<File> ova4, C7054oVa<AudioManager> ova5, C7054oVa<a> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static Oc a(C7054oVa<Context> ova, C7054oVa<Ec> ova2, C7054oVa<String> ova3, C7054oVa<File> ova4, C7054oVa<AudioManager> ova5, C7054oVa<a> ova6) {
        Oc oc = new Oc(ova, ova2, ova3, ova4, ova5, ova6);
        return oc;
    }

    public static Ula a(Context context, Ec ec, String str, File file, AudioManager audioManager, a aVar) {
        Ula a2 = Kc.a(context, ec, str, file, audioManager, aVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public Ula get() {
        return a((Context) this.a.get(), (Ec) this.b.get(), (String) this.c.get(), (File) this.d.get(), (AudioManager) this.e.get(), (a) this.f.get());
    }
}
