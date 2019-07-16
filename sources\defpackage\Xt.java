package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: Xt reason: default package */
public final class Xt extends ByteArrayOutputStream {
    private int a;
    private final int b;
    private boolean c;
    private final Level d;
    private final Logger e;

    public Xt(Logger logger, Level level, int i) {
        Pu.a(logger);
        this.e = logger;
        Pu.a(level);
        this.d = level;
        if (i >= 0) {
            this.b = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    private static void a(StringBuilder sb, int i) {
        if (i == 1) {
            sb.append("1 byte");
            return;
        }
        sb.append(NumberFormat.getInstance().format((long) i));
        sb.append(" bytes");
    }

    public final synchronized void close() throws IOException {
        if (!this.c) {
            if (this.a != 0) {
                StringBuilder sb = new StringBuilder("Total: ");
                a(sb, this.a);
                if (this.count != 0 && this.count < this.a) {
                    sb.append(" (logging first ");
                    a(sb, this.count);
                    sb.append(")");
                }
                this.e.logp(Level.CONFIG, "com.google.api.client.util.LoggingByteArrayOutputStream", "close", sb.toString());
                if (this.count != 0) {
                    this.e.logp(this.d, "com.google.api.client.util.LoggingByteArrayOutputStream", "close", toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                }
            }
            this.c = true;
        }
    }

    public final synchronized void write(int i) {
        if (!this.c) {
            this.a++;
            if (this.count < this.b) {
                super.write(i);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        if (!this.c) {
            this.a += i2;
            if (this.count < this.b) {
                int i3 = this.count + i2;
                if (i3 > this.b) {
                    i2 += this.b - i3;
                }
                super.write(bArr, i, i2);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
