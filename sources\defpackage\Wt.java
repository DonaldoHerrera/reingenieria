package defpackage;

import java.io.IOException;

/* renamed from: Wt reason: default package */
public final class Wt {
    /* JADX INFO: finally extract failed */
    public static long a(C1370hu huVar) throws IOException {
        Kt kt = new Kt();
        try {
            huVar.writeTo(kt);
            kt.close();
            return kt.a;
        } catch (Throwable th) {
            kt.close();
            throw th;
        }
    }
}
