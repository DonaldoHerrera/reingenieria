package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: HH reason: default package and case insensitive filesystem */
/* compiled from: StrictLineReader */
class C2067HH extends ByteArrayOutputStream {
    final /* synthetic */ C2086IH a;

    C2067HH(C2086IH ih, int i) {
        this.a = ih;
        super(i);
    }

    public String toString() {
        int i = this.count;
        try {
            return new String(this.buf, 0, (i <= 0 || this.buf[i + -1] != 13) ? this.count : i - 1, this.a.b.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
