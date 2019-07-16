package defpackage;

import java.io.IOException;

/* renamed from: rt reason: default package and case insensitive filesystem */
public class C1675rt extends Tt implements Cloneable {
    private C1646qt c;

    public final void a(C1646qt qtVar) {
        this.c = qtVar;
    }

    /* renamed from: c */
    public C1675rt a(String str, Object obj) {
        super.a(str, obj);
        return this;
    }

    public /* synthetic */ Tt i() {
        return (C1675rt) clone();
    }

    /* renamed from: k */
    public C1675rt clone() {
        return (C1675rt) super.clone();
    }

    public final String l() throws IOException {
        C1646qt qtVar = this.c;
        if (qtVar != null) {
            return qtVar.b(this);
        }
        return super.toString();
    }

    public String toString() {
        C1646qt qtVar = this.c;
        if (qtVar == null) {
            return super.toString();
        }
        try {
            return qtVar.a((Object) this);
        } catch (IOException e) {
            Yu.a(e);
            throw null;
        }
    }
}
