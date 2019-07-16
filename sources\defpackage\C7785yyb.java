package defpackage;

import java.io.File;
import java.io.IOException;

/* renamed from: yyb reason: default package and case insensitive filesystem */
/* compiled from: RequestBody */
class C7785yyb extends C7854zyb {
    final /* synthetic */ C7233qyb a;
    final /* synthetic */ File b;

    C7785yyb(C7233qyb qyb, File file) {
        this.a = qyb;
        this.b = file;
    }

    public long a() {
        return this.b.length();
    }

    public C7233qyb b() {
        return this.a;
    }

    public void a(C6893mAb mab) throws IOException {
        HAb c = C7720yAb.c(this.b);
        try {
            mab.a(c);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            th = th;
        }
        throw th;
        if (c != null) {
            if (r1 != null) {
                try {
                    c.close();
                } catch (Throwable th2) {
                    r1.addSuppressed(th2);
                }
            } else {
                c.close();
            }
        }
        throw th;
    }
}
