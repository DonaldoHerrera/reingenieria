package defpackage;

/* renamed from: Acb reason: default package and case insensitive filesystem */
/* compiled from: JvmBuiltInsSettings.kt */
public final class C4749Acb extends a<C5029Jcb, b> {
    final /* synthetic */ String a;
    final /* synthetic */ GYa b;

    C4749Acb(String str, GYa gYa) {
        this.a = str;
        this.b = gYa;
    }

    /* renamed from: a */
    public boolean b(C5029Jcb jcb) {
        C7471uYa.b(jcb, "javaClassDescriptor");
        String a2 = Lkb.a.a(jcb, this.a);
        if (C7269rcb.h.a().contains(a2)) {
            this.b.a = b.BLACK_LIST;
        } else if (C7269rcb.h.c().contains(a2)) {
            this.b.a = b.WHITE_LIST;
        } else if (C7269rcb.h.b().contains(a2)) {
            this.b.a = b.DROP;
        }
        return ((b) this.b.a) == null;
    }

    public b a() {
        b bVar = (b) this.b.a;
        return bVar != null ? bVar : b.NOT_CONSIDERED;
    }
}
