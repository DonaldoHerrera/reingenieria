package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: py reason: default package and case insensitive filesystem */
public abstract class C1621py implements C1710sy {
    private C1890yy a;
    private long b;

    protected C1621py(String str) {
        this(str == null ? null : new C1890yy(str));
    }

    public final boolean a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final Charset b() {
        C1890yy yyVar = this.a;
        return (yyVar == null || yyVar.b() == null) ? Jt.a : this.a.b();
    }

    public final long getLength() throws IOException {
        if (this.b == -1) {
            this.b = Wt.a(this);
        }
        return this.b;
    }

    public final String getType() {
        C1890yy yyVar = this.a;
        if (yyVar == null) {
            return null;
        }
        return yyVar.a();
    }

    private C1621py(C1890yy yyVar) {
        this.b = -1;
        this.a = yyVar;
    }
}
