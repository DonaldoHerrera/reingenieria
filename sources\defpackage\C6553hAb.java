package defpackage;

import java.io.IOException;

/* renamed from: hAb reason: default package and case insensitive filesystem */
/* compiled from: AsyncTimeout */
class C6553hAb implements HAb {
    final /* synthetic */ HAb a;
    final /* synthetic */ C6621iAb b;

    C6553hAb(C6621iAb iab, HAb hAb) {
        this.b = iab;
        this.a = hAb;
    }

    public long b(C6825lAb lab, long j) throws IOException {
        this.b.h();
        try {
            long b2 = this.a.b(lab, j);
            this.b.a(true);
            return b2;
        } catch (IOException e) {
            throw this.b.a(e);
        } catch (Throwable th) {
            this.b.a(false);
            throw th;
        }
    }

    public void close() throws IOException {
        this.b.h();
        try {
            this.a.close();
            this.b.a(true);
        } catch (IOException e) {
            throw this.b.a(e);
        } catch (Throwable th) {
            this.b.a(false);
            throw th;
        }
    }

    public JAb k() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AsyncTimeout.source(");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
