package defpackage;

import com.soundcloud.android.properties.a;
import com.soundcloud.android.tracks.D;
import com.soundcloud.android.tracks.Lb;

/* renamed from: JV reason: default package */
/* compiled from: DataModule_ProvideTrackRepositoryFactory */
public final class JV implements C4961HMa<C3760eea> {
    private final C7054oVa<a> a;
    private final C7054oVa<Lb> b;
    private final C7054oVa<D> c;

    public JV(C7054oVa<a> ova, C7054oVa<Lb> ova2, C7054oVa<D> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static JV a(C7054oVa<a> ova, C7054oVa<Lb> ova2, C7054oVa<D> ova3) {
        return new JV(ova, ova2, ova3);
    }

    public static C3760eea a(a aVar, C7054oVa<Lb> ova, C7054oVa<D> ova2) {
        C3760eea b2 = HV.b(aVar, ova, ova2);
        C5023JMa.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    public C3760eea get() {
        return a((a) this.a.get(), this.b, this.c);
    }
}
