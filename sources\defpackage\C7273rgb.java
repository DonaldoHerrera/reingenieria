package defpackage;

/* renamed from: rgb reason: default package and case insensitive filesystem */
/* compiled from: DescriptorResolverUtils */
class C7273rgb implements _Xa<C4935Gcb, RVa> {
    final /* synthetic */ C7342sgb a;

    C7273rgb(C7342sgb sgb) {
        this.a = sgb;
    }

    private static /* synthetic */ void a(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"}));
    }

    /* renamed from: a */
    public RVa invoke(C4935Gcb gcb) {
        if (gcb != null) {
            this.a.a.a(gcb);
            return RVa.a;
        }
        a(0);
        throw null;
    }
}
