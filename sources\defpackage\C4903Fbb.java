package defpackage;

/* renamed from: Fbb reason: default package and case insensitive filesystem */
/* compiled from: RuntimePackagePartProvider.kt */
final class C4903Fbb extends C7540vYa implements _Xa<C6732jnb, RVa> {
    public static final C4903Fbb a = new C4903Fbb();

    C4903Fbb() {
        super(1);
    }

    public final void a(C6732jnb jnb) {
        C7471uYa.b(jnb, "version");
        StringBuilder sb = new StringBuilder();
        sb.append("Module was compiled with an incompatible version of Kotlin. The binary version of its metadata is ");
        sb.append(jnb);
        sb.append(", ");
        sb.append("expected version is ");
        sb.append(C6732jnb.g);
        sb.append(". Please update Kotlin to the latest version");
        throw new UnsupportedOperationException(sb.toString());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((C6732jnb) obj);
        throw null;
    }
}
