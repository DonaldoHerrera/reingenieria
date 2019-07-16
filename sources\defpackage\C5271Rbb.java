package defpackage;

/* renamed from: Rbb reason: default package and case insensitive filesystem */
/* compiled from: KotlinBuiltIns */
class C5271Rbb implements _Xa<C7694xnb, C5029Jcb> {
    final /* synthetic */ C5301Sbb a;

    C5271Rbb(C5301Sbb sbb) {
        this.a = sbb;
    }

    /* renamed from: a */
    public C5029Jcb invoke(C7694xnb xnb) {
        C5122Mcb b = this.a.i().b(xnb, Ffb.FROM_BUILTINS);
        if (b == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Built-in class ");
            sb.append(C5301Sbb.b.a(xnb));
            sb.append(" is not found");
            throw new AssertionError(sb.toString());
        } else if (b instanceof C5029Jcb) {
            return (C5029Jcb) b;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Must be a class descriptor ");
            sb2.append(xnb);
            sb2.append(", but was ");
            sb2.append(b);
            throw new AssertionError(sb2.toString());
        }
    }
}
