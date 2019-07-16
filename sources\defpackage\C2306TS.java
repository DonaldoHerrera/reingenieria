package defpackage;

import com.soundcloud.android.likes.C3989m;

/* renamed from: TS reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistsUniflowOperations_Factory */
public final class C2306TS implements C4961HMa<C2287SS> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<C3989m> b;
    private final C7054oVa<C1938AS> c;

    public C2306TS(C7054oVa<C5327TLa> ova, C7054oVa<C3989m> ova2, C7054oVa<C1938AS> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C2306TS a(C7054oVa<C5327TLa> ova, C7054oVa<C3989m> ova2, C7054oVa<C1938AS> ova3) {
        return new C2306TS(ova, ova2, ova3);
    }

    public C2287SS get() {
        return new C2287SS((C5327TLa) this.a.get(), (C3989m) this.b.get(), (C1938AS) this.c.get());
    }
}
