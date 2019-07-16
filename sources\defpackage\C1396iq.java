package defpackage;

import com.google.android.exoplayer2.H;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: iq reason: default package and case insensitive filesystem */
/* compiled from: DefaultLoadErrorHandlingPolicy */
public class C1396iq implements C1520mq {
    private final int a;

    public C1396iq() {
        this(-1);
    }

    public long a(int i, long j, IOException iOException, int i2) {
        if ((iOException instanceof H) || (iOException instanceof FileNotFoundException) || (iOException instanceof g)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((i2 - 1) * 1000, 5000);
    }

    public C1396iq(int i) {
        this.a = i;
    }

    public int a(int i) {
        int i2 = this.a;
        if (i2 != -1) {
            return i2;
        }
        return i == 7 ? 6 : 3;
    }
}
