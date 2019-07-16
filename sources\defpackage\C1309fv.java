package defpackage;

import java.util.concurrent.Callable;

/* renamed from: fv reason: default package and case insensitive filesystem */
final /* synthetic */ class C1309fv implements Callable {
    private final C1737tv a;

    private C1309fv(C1737tv tvVar) {
        this.a = tvVar;
    }

    static Callable a(C1737tv tvVar) {
        return new C1309fv(tvVar);
    }

    public final Object call() {
        return this.a.b();
    }
}
