package defpackage;

import java.io.Closeable;

/* renamed from: BXa reason: default package */
/* compiled from: Closeable.kt */
public final class BXa {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C7468uVa.a(th, th2);
            }
        }
    }
}
