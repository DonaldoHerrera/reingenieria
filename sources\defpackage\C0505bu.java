package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bu reason: default package and case insensitive filesystem */
public final class C0505bu implements C1370hu {
    private final C1370hu a;
    private final int b;
    private final Level c;
    private final Logger d;

    public C0505bu(C1370hu huVar, Logger logger, Level level, int i) {
        this.a = huVar;
        this.d = logger;
        this.c = level;
        this.b = i;
    }

    /* JADX INFO: finally extract failed */
    public final void writeTo(OutputStream outputStream) throws IOException {
        Zt zt = new Zt(outputStream, this.d, this.c, this.b);
        try {
            this.a.writeTo(zt);
            zt.a().close();
            outputStream.flush();
        } catch (Throwable th) {
            zt.a().close();
            throw th;
        }
    }
}
