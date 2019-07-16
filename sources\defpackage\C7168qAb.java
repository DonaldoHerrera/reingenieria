package defpackage;

import java.io.IOException;

/* renamed from: qAb reason: default package and case insensitive filesystem */
/* compiled from: ForwardingSource */
public abstract class C7168qAb implements HAb {
    private final HAb a;

    public C7168qAb(HAb hAb) {
        if (hAb != null) {
            this.a = hAb;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final HAb a() {
        return this.a;
    }

    public long b(C6825lAb lab, long j) throws IOException {
        return this.a.b(lab, j);
    }

    public void close() throws IOException {
        this.a.close();
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
