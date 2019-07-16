package defpackage;

import java.io.IOException;

/* renamed from: Uyb reason: default package */
/* compiled from: FaultHidingSink */
class Uyb extends C7099pAb {
    private boolean b;

    Uyb(GAb gAb) {
        super(gAb);
    }

    /* access modifiers changed from: protected */
    public void a(IOException iOException) {
        throw null;
    }

    public void a(C6825lAb lab, long j) throws IOException {
        if (this.b) {
            lab.skip(j);
            return;
        }
        try {
            super.a(lab, j);
        } catch (IOException e) {
            this.b = true;
            a(e);
        }
    }

    public void close() throws IOException {
        if (!this.b) {
            try {
                super.close();
            } catch (IOException e) {
                this.b = true;
                a(e);
            }
        }
    }

    public void flush() throws IOException {
        if (!this.b) {
            try {
                super.flush();
            } catch (IOException e) {
                this.b = true;
                a(e);
            }
        }
    }
}
