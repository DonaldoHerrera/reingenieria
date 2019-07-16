package defpackage;

import java.util.concurrent.Callable;

/* renamed from: rz reason: default package and case insensitive filesystem */
final class C1681rz implements Runnable {
    private final /* synthetic */ C1652qz a;
    private final /* synthetic */ Callable b;

    C1681rz(C1652qz qzVar, Callable callable) {
        this.a = qzVar;
        this.b = callable;
    }

    public final void run() {
        try {
            this.a.a(this.b.call());
        } catch (Exception e) {
            this.a.a(e);
        }
    }
}
