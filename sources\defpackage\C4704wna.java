package defpackage;

import com.soundcloud.android.playback.core.d;

/* renamed from: wna reason: default package and case insensitive filesystem */
/* compiled from: GoogleApiWrapper_Factory */
public final class C4704wna implements C4961HMa<C4695vna> {
    private final C7054oVa<d> a;

    public C4704wna(C7054oVa<d> ova) {
        this.a = ova;
    }

    public static C4704wna a(C7054oVa<d> ova) {
        return new C4704wna(ova);
    }

    public C4695vna get() {
        return new C4695vna((d) this.a.get());
    }
}
