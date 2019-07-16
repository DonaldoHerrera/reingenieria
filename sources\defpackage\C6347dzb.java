package defpackage;

import java.io.IOException;

/* renamed from: dzb reason: default package and case insensitive filesystem */
/* compiled from: RouteException */
public final class C6347dzb extends RuntimeException {
    private IOException a;
    private IOException b;

    C6347dzb(IOException iOException) {
        super(iOException);
        this.a = iOException;
        this.b = iOException;
    }

    public IOException a() {
        return this.a;
    }

    public IOException b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public void a(IOException iOException) {
        Kyb.a((Throwable) this.a, (Throwable) iOException);
        this.b = iOException;
    }
}
