package defpackage;

/* renamed from: Cfa reason: default package and case insensitive filesystem */
/* compiled from: SQLBriteColumnAdapters.kt */
public final class C3931Cfa implements C6704jMa<C3508cda, String> {
    /* renamed from: a */
    public C3508cda decode(String str) {
        C7471uYa.b(str, "s");
        return new C3508cda(str);
    }

    /* renamed from: a */
    public String encode(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        String cda2 = cda.toString();
        C7471uYa.a((Object) cda2, "urn.toString()");
        return cda2;
    }
}
