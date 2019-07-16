package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;

/* renamed from: pqb reason: default package and case insensitive filesystem */
/* compiled from: DescriptorUtils.kt */
public final class C7148pqb {
    private static final C7694xnb a;

    static {
        C7694xnb b = C7694xnb.b("value");
        C7471uYa.a((Object) b, "Name.identifier(\"value\")");
        a = b;
    }

    public static final C5029Jcb a(C6450fdb fdb, C7349snb snb, Dfb dfb) {
        C7471uYa.b(fdb, "$this$resolveTopLevelClass");
        C7471uYa.b(snb, "topLevelClassFqName");
        C7471uYa.b(dfb, "location");
        boolean z = !snb.b();
        if (!TVa.a || z) {
            C7349snb c = snb.c();
            C7471uYa.a((Object) c, "topLevelClassFqName.parent()");
            Eqb ha = fdb.a(c).ha();
            C7694xnb e = snb.e();
            C7471uYa.a((Object) e, "topLevelClassFqName.shortName()");
            C5122Mcb b = ha.b(e, dfb);
            if (!(b instanceof C5029Jcb)) {
                b = null;
            }
            return (C5029Jcb) b;
        }
        throw new AssertionError("Assertion failed");
    }

    public static final C5029Jcb b(C5029Jcb jcb) {
        C7471uYa.b(jcb, "$this$getSuperClassNotAny");
        for (C7706xtb xtb : jcb.z().za().b()) {
            if (!C5301Sbb.c(xtb)) {
                C5122Mcb c = xtb.za().c();
                if (C6531gpb.j(c)) {
                    if (c != null) {
                        return (C5029Jcb) c;
                    }
                    throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                }
            }
        }
        return null;
    }

    public static final C7349snb c(C5272Rcb rcb) {
        C7471uYa.b(rcb, "$this$fqNameSafe");
        C7349snb f = C6531gpb.f(rcb);
        C7471uYa.a((Object) f, "DescriptorUtils.getFqNameSafe(this)");
        return f;
    }

    public static final C7487unb d(C5272Rcb rcb) {
        C7471uYa.b(rcb, "$this$fqNameUnsafe");
        C7487unb e = C6531gpb.e(rcb);
        C7471uYa.a((Object) e, "DescriptorUtils.getFqName(this)");
        return e;
    }

    public static final C6450fdb e(C5272Rcb rcb) {
        C7471uYa.b(rcb, "$this$module");
        C6450fdb a2 = C6531gpb.a(rcb);
        C7471uYa.a((Object) a2, "DescriptorUtils.getContainingModule(this)");
        return a2;
    }

    public static final Iwb<C5272Rcb> f(C5272Rcb rcb) {
        C7471uYa.b(rcb, "$this$parents");
        return Ywb.a(g(rcb), 1);
    }

    public static final Iwb<C5272Rcb> g(C5272Rcb rcb) {
        C7471uYa.b(rcb, "$this$parentsWithSelf");
        return Twb.a(rcb, (_Xa<? super T, ? extends T>) C7079oqb.a);
    }

    public static final C7280rnb a(C5122Mcb mcb) {
        if (mcb == null) {
            return null;
        }
        C5272Rcb e = mcb.e();
        if (e == null) {
            return null;
        }
        if (e instanceof C6790kdb) {
            return new C7280rnb(((C6790kdb) e).q(), mcb.getName());
        }
        if (!(e instanceof C5152Ncb)) {
            return null;
        }
        C7280rnb a2 = a((C5122Mcb) e);
        if (a2 != null) {
            return a2.a(mcb.getName());
        }
        return null;
    }

    public static final C5301Sbb b(C5272Rcb rcb) {
        C7471uYa.b(rcb, "$this$builtIns");
        return e(rcb).E();
    }

    public static final C5029Jcb b(C6315deb deb) {
        C7471uYa.b(deb, "$this$annotationClass");
        C5122Mcb c = deb.getType().za().c();
        if (!(c instanceof C5029Jcb)) {
            c = null;
        }
        return (C5029Jcb) c;
    }

    public static final boolean a(C5061Kdb kdb) {
        C7471uYa.b(kdb, "$this$declaresOrInheritsDefaultValue");
        Boolean a2 = C7227qvb.a((Collection<N>) C6850lWa.a(kdb), (b<N>) C6805kqb.a, (_Xa<N, Boolean>) C6873lqb.e);
        C7471uYa.a((Object) a2, "DFS.ifAny(\n        listO…eclaresDefaultValue\n    )");
        return a2.booleanValue();
    }

    public static final C4935Gcb a(C4935Gcb gcb) {
        C7471uYa.b(gcb, "$this$propertyIfAccessor");
        if (!(gcb instanceof C7339sdb)) {
            return gcb;
        }
        C7408tdb I = ((C7339sdb) gcb).I();
        C7471uYa.a((Object) I, "correspondingProperty");
        return I;
    }

    public static final C7349snb a(C5272Rcb rcb) {
        C7471uYa.b(rcb, "$this$fqNameOrNull");
        C7487unb d = d(rcb);
        if (!d.c()) {
            d = null;
        }
        if (d != null) {
            return d.h();
        }
        return null;
    }

    public static /* synthetic */ C4935Gcb a(C4935Gcb gcb, boolean z, _Xa _xa, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return a(gcb, z, _xa);
    }

    public static final C4935Gcb a(C4935Gcb gcb, boolean z, _Xa<? super C4935Gcb, Boolean> _xa) {
        C7471uYa.b(gcb, "$this$firstOverridden");
        C7471uYa.b(_xa, "predicate");
        GYa gYa = new GYa();
        gYa.a = null;
        return (C4935Gcb) C7227qvb.a((Collection<N>) C6850lWa.a(gcb), (b<N>) new C6941mqb<N>(z), (c<N, R>) new C7010nqb<N,R>(gYa, _xa));
    }

    public static final Collection<C5029Jcb> a(C5029Jcb jcb) {
        C7471uYa.b(jcb, "sealedClass");
        if (jcb.h() != C6314ddb.SEALED) {
            return C6918mWa.a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C6737jqb jqb = new C6737jqb(jcb, linkedHashSet);
        C5272Rcb e = jcb.e();
        C7471uYa.a((Object) e, "sealedClass.containingDeclaration");
        if (e instanceof C6790kdb) {
            jqb.a(((C6790kdb) e).ha(), false);
        }
        Eqb H = jcb.H();
        C7471uYa.a((Object) H, "sealedClass.unsubstitutedInnerClassesScope");
        jqb.a(H, true);
        return linkedHashSet;
    }

    public static final Npb<?> a(C6315deb deb) {
        C7471uYa.b(deb, "$this$firstArgument");
        return (Npb) C7676xWa.h((Iterable<? extends T>) deb.a().values());
    }
}
