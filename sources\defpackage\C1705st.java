package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: st reason: default package and case insensitive filesystem */
public final class C1705st implements C1246du {
    private final C1646qt a;
    private final Set<String> b;

    protected C1705st(C1825wt wtVar) {
        this.a = wtVar.a;
        this.b = new HashSet(wtVar.b);
    }

    public final <T> T a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        C1795vt a2 = this.a.a(inputStream, charset);
        if (!this.b.isEmpty()) {
            try {
                String str = "wrapper key(s) not found: %s";
                Object[] objArr = {this.b};
                if (!((a2.a(this.b) == null || a2.f() == Bt.END_OBJECT) ? false : true)) {
                    throw new IllegalArgumentException(Uu.a(str, objArr));
                }
            } catch (Throwable th) {
                a2.a();
                throw th;
            }
        }
        return a2.a(cls, true, null);
    }

    public final C1646qt b() {
        return this.a;
    }

    public final Set<String> a() {
        return Collections.unmodifiableSet(this.b);
    }
}
