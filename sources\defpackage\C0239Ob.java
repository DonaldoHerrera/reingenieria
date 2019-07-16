package defpackage;

import android.util.Log;
import java.io.Writer;

/* renamed from: Ob reason: default package and case insensitive filesystem */
/* compiled from: LogWriter */
public class C0239Ob extends Writer {
    private final String a;
    private StringBuilder b = new StringBuilder(128);

    public C0239Ob(String str) {
        this.a = str;
    }

    private void a() {
        if (this.b.length() > 0) {
            Log.d(this.a, this.b.toString());
            StringBuilder sb = this.b;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                a();
            } else {
                this.b.append(c);
            }
        }
    }
}
