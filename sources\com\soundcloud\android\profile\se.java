package com.soundcloud.android.profile;

/* compiled from: WriteMixedRecordsCommand_Factory */
public final class se implements C4961HMa<re> {
    private final C7054oVa<C3768fea> a;
    private final C7054oVa<Hda> b;
    private final C7054oVa<C3800jea> c;

    public se(C7054oVa<C3768fea> ova, C7054oVa<Hda> ova2, C7054oVa<C3800jea> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static se a(C7054oVa<C3768fea> ova, C7054oVa<Hda> ova2, C7054oVa<C3800jea> ova3) {
        return new se(ova, ova2, ova3);
    }

    public static re a(C3768fea fea, Hda hda, C3800jea jea) {
        return new re(fea, hda, jea);
    }

    public re get() {
        return new re((C3768fea) this.a.get(), (Hda) this.b.get(), (C3800jea) this.c.get());
    }
}
