package defpackage;

import com.soundcloud.android.properties.a;
import com.soundcloud.android.tracks.Eb;
import com.soundcloud.android.tracks.T;

/* renamed from: IV reason: default package */
/* compiled from: DataModule_BindTrackWriterFactory */
public final class IV implements C4961HMa<C3768fea> {
    private final C7054oVa<a> a;
    private final C7054oVa<Eb> b;
    private final C7054oVa<T> c;

    public IV(C7054oVa<a> ova, C7054oVa<Eb> ova2, C7054oVa<T> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static IV a(C7054oVa<a> ova, C7054oVa<Eb> ova2, C7054oVa<T> ova3) {
        return new IV(ova, ova2, ova3);
    }

    public static C3768fea a(a aVar, C7054oVa<Eb> ova, C7054oVa<T> ova2) {
        C3768fea a2 = HV.a(aVar, ova, ova2);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C3768fea get() {
        return a((a) this.a.get(), this.b, this.c);
    }
}
