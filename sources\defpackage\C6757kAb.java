package defpackage;

import java.io.InputStream;

/* renamed from: kAb reason: default package and case insensitive filesystem */
/* compiled from: Buffer */
class C6757kAb extends InputStream {
    final /* synthetic */ C6825lAb a;

    C6757kAb(C6825lAb lab) {
        this.a = lab;
    }

    public int available() {
        return (int) Math.min(this.a.c, 2147483647L);
    }

    public void close() {
    }

    public int read() {
        C6825lAb lab = this.a;
        if (lab.c > 0) {
            return lab.readByte() & 255;
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(".inputStream()");
        return sb.toString();
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.a.a(bArr, i, i2);
    }
}
