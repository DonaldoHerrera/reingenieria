package defpackage;

import java.util.List;

/* renamed from: Srb reason: default package */
/* compiled from: BuiltInSerializerProtocol.kt */
public final class Srb extends Xqb {
    public static final Srb n = new Srb();

    private Srb() {
        Inb b = Inb.b();
        Amb.a(b);
        C7471uYa.a((Object) b, "ExtensionRegistryLite.ne…f::registerAllExtensions)");
        f<Ilb, Integer> fVar = Amb.a;
        C7471uYa.a((Object) fVar, "BuiltInsProtoBuf.packageFqName");
        f<C6730jlb, List<C5590alb>> fVar2 = Amb.c;
        C7471uYa.a((Object) fVar2, "BuiltInsProtoBuf.constructorAnnotation");
        f<C6458flb, List<C5590alb>> fVar3 = Amb.b;
        C7471uYa.a((Object) fVar3, "BuiltInsProtoBuf.classAnnotation");
        f<Blb, List<C5590alb>> fVar4 = Amb.d;
        C7471uYa.a((Object) fVar4, "BuiltInsProtoBuf.functionAnnotation");
        f<Olb, List<C5590alb>> fVar5 = Amb.e;
        C7471uYa.a((Object) fVar5, "BuiltInsProtoBuf.propertyAnnotation");
        f<Olb, List<C5590alb>> fVar6 = Amb.f;
        C7471uYa.a((Object) fVar6, "BuiltInsProtoBuf.propertyGetterAnnotation");
        f<Olb, List<C5590alb>> fVar7 = Amb.g;
        C7471uYa.a((Object) fVar7, "BuiltInsProtoBuf.propertySetterAnnotation");
        f<C7485ulb, List<C5590alb>> fVar8 = Amb.i;
        C7471uYa.a((Object) fVar8, "BuiltInsProtoBuf.enumEntryAnnotation");
        f<Olb, b> fVar9 = Amb.h;
        C7471uYa.a((Object) fVar9, "BuiltInsProtoBuf.compileTimeValue");
        f<C7003nmb, List<C5590alb>> fVar10 = Amb.j;
        C7471uYa.a((Object) fVar10, "BuiltInsProtoBuf.parameterAnnotation");
        f<_lb, List<C5590alb>> fVar11 = Amb.k;
        C7471uYa.a((Object) fVar11, "BuiltInsProtoBuf.typeAnnotation");
        f<C6527gmb, List<C5590alb>> fVar12 = Amb.l;
        C7471uYa.a((Object) fVar12, "BuiltInsProtoBuf.typeParameterAnnotation");
        super(b, fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12);
    }

    private final String c(C7349snb snb) {
        if (snb.b()) {
            return "default-package";
        }
        String a = snb.e().a();
        C7471uYa.a((Object) a, "fqName.shortName().asString()");
        return a;
    }

    public final String a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        StringBuilder sb = new StringBuilder();
        sb.append(c(snb));
        sb.append(".");
        sb.append("kotlin_builtins");
        return sb.toString();
    }

    public final String b(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        StringBuilder sb = new StringBuilder();
        String a = snb.a();
        C7471uYa.a((Object) a, "fqName.asString()");
        sb.append(Cxb.a(a, '.', '/', false, 4, (Object) null));
        sb.append("/");
        sb.append(a(snb));
        return sb.toString();
    }
}
