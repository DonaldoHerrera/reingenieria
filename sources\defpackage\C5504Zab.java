package defpackage;

import java.lang.reflect.Method;

/* renamed from: Zab reason: default package and case insensitive filesystem */
/* compiled from: RuntimeTypeMapper.kt */
public final class C5504Zab {
    private static final C7280rnb a;
    public static final C5504Zab b = new C5504Zab();

    static {
        C7280rnb a2 = C7280rnb.a(new C7349snb("java.lang.Void"));
        C7471uYa.a((Object) a2, "ClassId.topLevel(FqName(\"java.lang.Void\"))");
        a = a2;
    }

    private C5504Zab() {
    }

    private final e b(C5582adb adb) {
        return new e(new b(a((C4935Gcb) adb), Hkb.a(adb, false, false, 1, null)));
    }

    public final C5578a_a a(C5582adb adb) {
        C5578a_a a_a;
        C5578a_a a_a2;
        C7471uYa.b(adb, "possiblySubstitutedFunction");
        C4935Gcb a2 = C6531gpb.a(adb);
        C7471uYa.a((Object) a2, "DescriptorUtils.unwrapFa…siblySubstitutedFunction)");
        C5582adb original = ((C5582adb) a2).getOriginal();
        C7471uYa.a((Object) original, "DescriptorUtils.unwrapFa…titutedFunction).original");
        if (original instanceof Yrb) {
            Yrb yrb = (Yrb) original;
            Wnb ma = yrb.ma();
            if (ma instanceof Blb) {
                b a3 = C6936mnb.b.a((Blb) ma, yrb.ka(), yrb.ia());
                if (a3 != null) {
                    return new e(a3);
                }
            }
            if (ma instanceof C6730jlb) {
                b a4 = C6936mnb.b.a((C6730jlb) ma, yrb.ka(), yrb.ia());
                if (a4 != null) {
                    C5272Rcb e = adb.e();
                    C7471uYa.a((Object) e, "possiblySubstitutedFunction.containingDeclaration");
                    if (C6667ipb.a(e)) {
                        a_a2 = new e(a4);
                    } else {
                        a_a2 = new d(a4);
                    }
                    return a_a2;
                }
            }
            return b(original);
        }
        Pib pib = null;
        if (original instanceof Rgb) {
            C7822zdb source = ((Rgb) original).getSource();
            if (!(source instanceof Cib)) {
                source = null;
            }
            Cib cib = (Cib) source;
            Pib c = cib != null ? cib.c() : null;
            if (!(c instanceof C7160pwb)) {
                c = null;
            }
            C7160pwb pwb = (C7160pwb) c;
            if (pwb != null) {
                Method I = pwb.I();
                if (I != null) {
                    return new c(I);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Incorrect resolution sequence for Java method ");
            sb.append(original);
            throw new C5240Qab(sb.toString());
        }
        String str = " (";
        if (original instanceof Ogb) {
            C7822zdb source2 = ((Ogb) original).getSource();
            if (!(source2 instanceof Cib)) {
                source2 = null;
            }
            Cib cib2 = (Cib) source2;
            if (cib2 != null) {
                pib = cib2.c();
            }
            if (pib instanceof C6749jwb) {
                a_a = new b(((C6749jwb) pib).I());
            } else {
                if (pib instanceof C6545gwb) {
                    C6545gwb gwb = (C6545gwb) pib;
                    if (gwb.m()) {
                        a_a = new a(gwb.E());
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Incorrect resolution sequence for Java constructor ");
                sb2.append(original);
                sb2.append(str);
                sb2.append(pib);
                sb2.append(')');
                throw new C5240Qab(sb2.toString());
            }
            return a_a;
        } else if (C6463fpb.a(original) || C6463fpb.b(original)) {
            return b(original);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown origin of ");
            sb3.append(original);
            sb3.append(str);
            sb3.append(original.getClass());
            sb3.append(')');
            throw new C5240Qab(sb3.toString());
        }
    }

    private final C5331Tbb b(Class<?> cls) {
        if (!cls.isPrimitive()) {
            return null;
        }
        C7424tqb a2 = C7424tqb.a(cls.getSimpleName());
        C7471uYa.a((Object) a2, "JvmPrimitiveType.get(simpleName)");
        return a2.c();
    }

    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [a_a$e] */
    /* JADX WARNING: type inference failed for: r0v4, types: [a_a$e] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.reflect.Method] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.reflect.Method] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.reflect.Method, a_a$e]
  uses: [a_a$e, java.lang.reflect.Method]
  mth insns count: 90
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    public final C5714c_a a(C7408tdb tdb) {
        C5714c_a c_a;
        C7471uYa.b(tdb, "possiblyOverriddenProperty");
        C4935Gcb a2 = C6531gpb.a(tdb);
        C7471uYa.a((Object) a2, "DescriptorUtils.unwrapFa…ssiblyOverriddenProperty)");
        C7408tdb original = ((C7408tdb) a2).getOriginal();
        C7471uYa.a((Object) original, "DescriptorUtils.unwrapFa…rriddenProperty).original");
        ? r0 = 0;
        if (original instanceof C7842zsb) {
            C7842zsb zsb = (C7842zsb) original;
            Olb ma = zsb.ma();
            f<Olb, e> fVar = Xmb.d;
            C7471uYa.a((Object) fVar, "JvmProtoBuf.propertySignature");
            e eVar = (e) Hmb.a(ma, fVar);
            if (eVar != null) {
                c cVar = new c(original, ma, eVar, zsb.ka(), zsb.ia());
                return cVar;
            }
        } else if (original instanceof Sgb) {
            C7822zdb source = ((Sgb) original).getSource();
            if (!(source instanceof Cib)) {
                source = null;
            }
            Cib cib = (Cib) source;
            Object c = cib != null ? cib.c() : null;
            if (c instanceof C6953mwb) {
                c_a = new a(((C6953mwb) c).I());
            } else if (c instanceof C7160pwb) {
                Method I = ((C7160pwb) c).I();
                C7546vdb c2 = original.c();
                C7822zdb source2 = c2 != null ? c2.getSource() : null;
                if (!(source2 instanceof Cib)) {
                    source2 = null;
                }
                Cib cib2 = (Cib) source2;
                Pib c3 = cib2 != null ? cib2.c() : null;
                if (!(c3 instanceof C7160pwb)) {
                    c3 = null;
                }
                C7160pwb pwb = (C7160pwb) c3;
                if (pwb != null) {
                    r0 = pwb.I();
                }
                c_a = new b(I, r0);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Incorrect resolution sequence for Java field ");
                sb.append(original);
                sb.append(" (source = ");
                sb.append(c);
                sb.append(')');
                throw new C5240Qab(sb.toString());
            }
            return c_a;
        }
        C7477udb b2 = original.b();
        if (b2 != null) {
            e b3 = b((C5582adb) b2);
            C7546vdb c4 = original.c();
            if (c4 != null) {
                r0 = b((C5582adb) c4);
            }
            return new d(b3, r0);
        }
        C7471uYa.a();
        throw null;
    }

    private final String a(C4935Gcb gcb) {
        String a2;
        String b2 = C7135pgb.b(gcb);
        if (b2 == null) {
            if (gcb instanceof C7477udb) {
                a2 = C6589hgb.a(C7148pqb.a(gcb).getName().a());
            } else if (gcb instanceof C7546vdb) {
                a2 = C6589hgb.d(C7148pqb.a(gcb).getName().a());
            } else {
                a2 = gcb.getName().a();
            }
            b2 = a2;
            C7471uYa.a((Object) b2, "when (descriptor) {\n    …name.asString()\n        }");
        }
        return b2;
    }

    public final C7280rnb a(Class<?> cls) {
        C7471uYa.b(cls, "klass");
        if (cls.isArray()) {
            Class componentType = cls.getComponentType();
            C7471uYa.a((Object) componentType, "klass.componentType");
            C5331Tbb b2 = b(componentType);
            if (b2 != null) {
                return new C7280rnb(C5301Sbb.b, b2.b());
            }
            C7280rnb a2 = C7280rnb.a(C5301Sbb.h.h.h());
            C7471uYa.a((Object) a2, "ClassId.topLevel(KotlinB….FQ_NAMES.array.toSafe())");
            return a2;
        } else if (C7471uYa.a((Object) cls, (Object) Void.TYPE)) {
            return a;
        } else {
            C5331Tbb b3 = b(cls);
            if (b3 != null) {
                return new C7280rnb(C5301Sbb.b, b3.d());
            }
            C7280rnb b4 = Rvb.b(cls);
            if (!b4.g()) {
                C6721jcb jcb = C6721jcb.m;
                C7349snb a3 = b4.a();
                C7471uYa.a((Object) a3, "classId.asSingleFqName()");
                C7280rnb a4 = jcb.a(a3);
                if (a4 != null) {
                    return a4;
                }
            }
            return b4;
        }
    }
}
