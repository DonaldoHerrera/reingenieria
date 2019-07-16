package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* renamed from: gAb reason: default package and case insensitive filesystem */
/* compiled from: AsyncTimeout */
class C6485gAb implements GAb {
    final /* synthetic */ GAb a;
    final /* synthetic */ C6621iAb b;

    C6485gAb(C6621iAb iab, GAb gAb) {
        this.b = iab;
        this.a = gAb;
    }

    public void a(C6825lAb lab, long j) throws IOException {
        KAb.a(lab.c, 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                DAb dAb = lab.b;
                while (true) {
                    if (j2 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        break;
                    }
                    j2 += (long) (dAb.c - dAb.b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    dAb = dAb.f;
                }
                this.b.h();
                try {
                    this.a.a(lab, j2);
                    j -= j2;
                    this.b.a(true);
                } catch (IOException e) {
                    throw this.b.a(e);
                } catch (Throwable th) {
                    this.b.a(false);
                    throw th;
                }
            } else {
                return;
            }
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

    public void flush() throws IOException {
        this.b.h();
        try {
            this.a.flush();
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
        sb.append("AsyncTimeout.sink(");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
