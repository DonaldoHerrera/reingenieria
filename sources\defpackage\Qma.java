package defpackage;

import android.content.res.Resources;
import com.soundcloud.android.image.N;
import com.soundcloud.android.tracks.Ca;

/* renamed from: Qma reason: default package */
/* compiled from: MetadataOperations_Factory */
public final class Qma implements C4961HMa<Fma> {
    private final C7054oVa<Resources> a;
    private final C7054oVa<Ca> b;
    private final C7054oVa<N> c;
    private final C7054oVa<HPa> d;

    public Qma(C7054oVa<Resources> ova, C7054oVa<Ca> ova2, C7054oVa<N> ova3, C7054oVa<HPa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static Qma a(C7054oVa<Resources> ova, C7054oVa<Ca> ova2, C7054oVa<N> ova3, C7054oVa<HPa> ova4) {
        return new Qma(ova, ova2, ova3, ova4);
    }

    public Fma get() {
        return new Fma((Resources) this.a.get(), (Ca) this.b.get(), (N) this.c.get(), (HPa) this.d.get());
    }
}
