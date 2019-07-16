package defpackage;

import com.soundcloud.android.likes.C3971b;

/* renamed from: Xta reason: default package and case insensitive filesystem */
/* compiled from: EntityItemCreator_Factory */
public final class C5454Xta implements C4961HMa<C5425Wta> {
    private final C7054oVa<C3815lda> a;
    private final C7054oVa<C3971b> b;
    private final C7054oVa<C1937AR> c;

    public C5454Xta(C7054oVa<C3815lda> ova, C7054oVa<C3971b> ova2, C7054oVa<C1937AR> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C5454Xta a(C7054oVa<C3815lda> ova, C7054oVa<C3971b> ova2, C7054oVa<C1937AR> ova3) {
        return new C5454Xta(ova, ova2, ova3);
    }

    public C5425Wta get() {
        return new C5425Wta((C3815lda) this.a.get(), (C3971b) this.b.get(), (C1937AR) this.c.get());
    }
}
