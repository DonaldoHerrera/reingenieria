package defpackage;

import com.soundcloud.android.tracks.W;

/* renamed from: LDa reason: default package and case insensitive filesystem */
/* compiled from: MediaStreamsStorage_Factory */
public final class C5077LDa implements C4961HMa<C4797CDa> {
    private final C7054oVa<W> a;

    public C5077LDa(C7054oVa<W> ova) {
        this.a = ova;
    }

    public static C5077LDa a(C7054oVa<W> ova) {
        return new C5077LDa(ova);
    }

    public C4797CDa get() {
        return new C4797CDa((W) this.a.get());
    }
}
