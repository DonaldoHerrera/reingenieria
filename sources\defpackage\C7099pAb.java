package defpackage;

import java.io.IOException;

/* renamed from: pAb reason: default package and case insensitive filesystem */
/* compiled from: ForwardingSink */
public abstract class C7099pAb implements GAb {
    private final GAb a;

    public C7099pAb(GAb gAb) {
        if (gAb != null) {
            this.a = gAb;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void a(C6825lAb lab, long j) throws IOException {
        this.a.a(lab, j);
    }

    public void close() throws IOException {
        this.a.close();
    }

    public void flush() throws IOException {
        this.a.flush();
    }

    public JAb k() {
        return this.a.k();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.a.toString());
        sb.append(")");
        return sb.toString();
    }
}
