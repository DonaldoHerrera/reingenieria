package defpackage;

/* renamed from: VZa reason: default package */
/* compiled from: reflectLambda.kt */
final /* synthetic */ class VZa extends C7402tYa implements C6308dYa<Crb, Blb, C7684xdb> {
    public static final VZa e = new VZa();

    VZa() {
        super(2);
    }

    /* renamed from: a */
    public final C7684xdb invoke(Crb crb, Blb blb) {
        C7471uYa.b(crb, "p1");
        C7471uYa.b(blb, "p2");
        return crb.a(blb);
    }

    public final String getName() {
        return "loadFunction";
    }

    public final C7610wZa h() {
        return HYa.a(Crb.class);
    }

    public final String j() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }
}
