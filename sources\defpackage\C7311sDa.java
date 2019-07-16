package defpackage;

import com.soundcloud.android.tracks.W;

/* renamed from: sDa reason: default package and case insensitive filesystem */
/* compiled from: DownloadedMediaStreamsStorage_Factory */
public final class C7311sDa implements C4961HMa<C6830lDa> {
    private final C7054oVa<W> a;

    public C7311sDa(C7054oVa<W> ova) {
        this.a = ova;
    }

    public static C7311sDa a(C7054oVa<W> ova) {
        return new C7311sDa(ova);
    }

    public C6830lDa get() {
        return new C6830lDa((W) this.a.get());
    }
}
