package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: xAb reason: default package and case insensitive filesystem */
/* compiled from: Okio */
class C7651xAb extends C6621iAb {
    final /* synthetic */ Socket k;

    C7651xAb(Socket socket) {
        this.k = socket;
    }

    /* access modifiers changed from: protected */
    public IOException b(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* access modifiers changed from: protected */
    public void j() {
        String str = "Failed to close timed out socket ";
        try {
            this.k.close();
        } catch (Exception e) {
            Logger logger = C7720yAb.a;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.k);
            logger.log(level, sb.toString(), e);
        } catch (AssertionError e2) {
            if (C7720yAb.a(e2)) {
                Logger logger2 = C7720yAb.a;
                Level level2 = Level.WARNING;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(this.k);
                logger2.log(level2, sb2.toString(), e2);
                return;
            }
            throw e2;
        }
    }
}
