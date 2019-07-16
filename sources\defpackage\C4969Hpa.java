package defpackage;

import com.soundcloud.android.sync.T;

/* renamed from: Hpa reason: default package and case insensitive filesystem */
/* compiled from: DefaultPlaylistRepository_Factory */
public final class C4969Hpa implements C4961HMa<C4938Gpa> {
    private final C7054oVa<C6332dsa> a;
    private final C7054oVa<T> b;
    private final C7054oVa<HPa> c;

    public C4969Hpa(C7054oVa<C6332dsa> ova, C7054oVa<T> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C4969Hpa a(C7054oVa<C6332dsa> ova, C7054oVa<T> ova2, C7054oVa<HPa> ova3) {
        return new C4969Hpa(ova, ova2, ova3);
    }

    public C4938Gpa get() {
        return new C4938Gpa((C6332dsa) this.a.get(), (T) this.b.get(), (HPa) this.c.get());
    }
}
