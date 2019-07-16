package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: Qkb reason: default package */
/* compiled from: typeSignatureMapping.kt */
public final class Qkb {
    private static final <T> T a(C7829zkb<T> zkb, T t, boolean z) {
        return z ? zkb.b(t) : t;
    }

    public static /* synthetic */ Object a(C7706xtb xtb, C7829zkb zkb, Okb okb, Mkb mkb, C7622wkb wkb, C6376eYa eya, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            eya = C7779yvb.c();
        }
        return a(xtb, zkb, okb, mkb, wkb, eya, z);
    }

    public static final <T> T a(C7706xtb xtb, C7829zkb<T> zkb, Okb okb, Mkb<? extends T> mkb, C7622wkb<T> wkb, C6376eYa<? super C7706xtb, ? super T, ? super Okb, RVa> eya, boolean z) {
        T t;
        Object obj;
        C7706xtb xtb2 = xtb;
        C7829zkb<T> zkb2 = zkb;
        Okb okb2 = okb;
        Mkb<? extends T> mkb2 = mkb;
        C7622wkb<T> wkb2 = wkb;
        C6376eYa<? super C7706xtb, ? super T, ? super Okb, RVa> eya2 = eya;
        C7471uYa.b(xtb, "kotlinType");
        C7471uYa.b(zkb, "factory");
        C7471uYa.b(okb, "mode");
        C7471uYa.b(mkb, "typeMappingConfiguration");
        C7471uYa.b(eya2, "writeGenericType");
        C7706xtb a = mkb.a(xtb);
        if (a != null) {
            return a(a, zkb, okb, mkb, wkb, eya, z);
        }
        if (C5181Obb.h(xtb)) {
            return a(C5447Xbb.a(xtb, mkb.a()), zkb, okb, mkb, wkb, eya, z);
        }
        Object a2 = a(xtb, zkb, okb);
        if (a2 != null) {
            T a3 = a(zkb, (T) a2, okb.c());
            eya2.a(xtb, a3, okb);
            return a3;
        }
        Ptb za = xtb.za();
        if (!(za instanceof C7637wtb)) {
            C5122Mcb c = za.c();
            if (c != null) {
                C7471uYa.a((Object) c, "constructor.declarationD…structor of $kotlinType\")");
                String str = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor";
                if (C7154ptb.a((C5272Rcb) c)) {
                    T b = zkb.b("error/NonExistentClass");
                    if (c != null) {
                        mkb.a(xtb, (C5029Jcb) c);
                        if (wkb2 == null) {
                            return b;
                        }
                        wkb.a(b);
                        throw null;
                    }
                    throw new OVa(str);
                }
                boolean z2 = c instanceof C5029Jcb;
                if (!z2 || !C5301Sbb.d(xtb)) {
                    if (z2) {
                        C5029Jcb jcb = (C5029Jcb) c;
                        if (jcb.isInline() && !okb.b()) {
                            C7706xtb a4 = a(xtb);
                            if (a4 != null) {
                                return a(a4, zkb, okb.e(), mkb, wkb, eya, z);
                            }
                        }
                        if (!okb.d() || !C5301Sbb.c(jcb)) {
                            C5029Jcb original = jcb.getOriginal();
                            C7471uYa.a((Object) original, "descriptor.original");
                            t = mkb.a(original);
                            if (t == null) {
                                if (jcb.g() == C5060Kcb.ENUM_ENTRY) {
                                    C5272Rcb e = jcb.e();
                                    if (e != null) {
                                        jcb = (C5029Jcb) e;
                                    } else {
                                        throw new OVa(str);
                                    }
                                }
                                C5029Jcb original2 = jcb.getOriginal();
                                C7471uYa.a((Object) original2, "enumClassIfEnumEntry.original");
                                t = zkb.b(a(original2, mkb, z));
                            }
                        } else {
                            t = zkb.a();
                        }
                        eya2.a(xtb, t, okb);
                        return t;
                    }
                    boolean z3 = z;
                    if (c instanceof C4905Fdb) {
                        try {
                            T a5 = a(Fub.a((C4905Fdb) c), zkb, okb, mkb, null, C7779yvb.c(), z);
                            if (wkb2 == null) {
                                return a5;
                            }
                            C7694xnb name = c.getName();
                            C7471uYa.a((Object) name, "descriptor.getName()");
                            wkb.a(name, a5);
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown type ");
                        sb.append(xtb);
                        throw new UnsupportedOperationException(sb.toString());
                    }
                } else if (xtb.ya().size() == 1) {
                    Stb stb = (Stb) xtb.ya().get(0);
                    C7706xtb type = stb.getType();
                    C7471uYa.a((Object) type, "memberProjection.type");
                    if (stb.b() == C6473fub.IN_VARIANCE) {
                        obj = zkb.b("java/lang/Object");
                        if (wkb2 != null) {
                            wkb.b();
                            throw null;
                        }
                    } else if (wkb2 == null) {
                        C6473fub b2 = stb.b();
                        C7471uYa.a((Object) b2, "memberProjection.projectionKind");
                        obj = a(type, zkb, okb.a(b2), mkb, wkb, eya, z);
                        if (wkb2 != null) {
                            wkb.a();
                            throw null;
                        }
                    } else {
                        wkb.b();
                        throw null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("[");
                    sb2.append(zkb.a(obj));
                    return zkb.a(sb2.toString());
                } else {
                    throw new UnsupportedOperationException("arrays must have one type argument");
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("no descriptor for type constructor of ");
                sb3.append(xtb);
                throw new UnsupportedOperationException(sb3.toString());
            }
        } else {
            mkb.a(((C7637wtb) za).b());
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if ((r3 instanceof defpackage.C7477udb) == false) goto L_0x002e;
     */
    public static final boolean a(C4904Fcb fcb) {
        C7471uYa.b(fcb, "descriptor");
        boolean z = true;
        if (fcb instanceof C5242Qcb) {
            return true;
        }
        C7706xtb a = fcb.a();
        if (a != null) {
            if (C5301Sbb.w(a)) {
                C7706xtb a2 = fcb.a();
                if (a2 == null) {
                    C7471uYa.a();
                    throw null;
                } else if (!C5605aub.g(a2)) {
                }
            }
            z = false;
            return z;
        }
        C7471uYa.a();
        throw null;
    }

    private static final String a(boolean z) {
        C7349snb snb;
        if (z) {
            snb = C6531gpb.g;
        } else {
            snb = C6531gpb.f;
        }
        C7355sqb a = C7355sqb.a(C7280rnb.a(snb));
        C7471uYa.a((Object) a, "JvmClassName.byClassId(ClassId.topLevel(fqName))");
        String b = a.b();
        C7471uYa.a((Object) b, "JvmClassName.byClassId(C…vel(fqName)).internalName");
        return b;
    }

    private static final <T> T a(C7706xtb xtb, C7829zkb<T> zkb, Okb okb) {
        C5122Mcb c = xtb.za().c();
        if (!(c instanceof C5029Jcb)) {
            c = null;
        }
        C5029Jcb jcb = (C5029Jcb) c;
        if (jcb != null) {
            boolean z = false;
            if (jcb == C5447Xbb.a()) {
                return zkb.b(a(false));
            }
            if (C7471uYa.a((Object) jcb, (Object) C5447Xbb.b())) {
                return zkb.b(a(true));
            }
            C5331Tbb b = C5301Sbb.b((C5272Rcb) jcb);
            if (b != null) {
                C7424tqb a = C7424tqb.a(b);
                C7471uYa.a((Object) a, "JvmPrimitiveType.get(primitiveType)");
                String a2 = a.a();
                C7471uYa.a((Object) a2, "JvmPrimitiveType.get(primitiveType).desc");
                Object a3 = zkb.a(a2);
                if (C5605aub.g(xtb) || C6593hkb.a(xtb)) {
                    z = true;
                }
                return a(zkb, (T) a3, z);
            }
            C5331Tbb a4 = C5301Sbb.a((C5272Rcb) jcb);
            if (a4 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                C7424tqb a5 = C7424tqb.a(a4);
                C7471uYa.a((Object) a5, "JvmPrimitiveType.get(arrayElementType)");
                sb.append(a5.a());
                return zkb.a(sb.toString());
            } else if (C5301Sbb.e((C5272Rcb) jcb)) {
                C7280rnb a6 = C6721jcb.m.a(C7148pqb.d(jcb));
                if (a6 != null) {
                    if (!okb.a()) {
                        List b2 = C6721jcb.m.b();
                        if (!(b2 instanceof Collection) || !b2.isEmpty()) {
                            Iterator it = b2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (C7471uYa.a((Object) ((a) it.next()).d(), (Object) a6)) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (z) {
                            return null;
                        }
                    }
                    C7355sqb a7 = C7355sqb.a(a6);
                    C7471uYa.a((Object) a7, "JvmClassName.byClassId(classId)");
                    String b3 = a7.b();
                    C7471uYa.a((Object) b3, "JvmClassName.byClassId(classId).internalName");
                    return zkb.b(b3);
                }
            }
        }
        return null;
    }

    public static final C7706xtb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "inlineClassType");
        return a(xtb, new HashSet());
    }

    public static final C7706xtb a(C7706xtb xtb, HashSet<C5122Mcb> hashSet) {
        C7706xtb xtb2;
        C7471uYa.b(xtb, "kotlinType");
        C7471uYa.b(hashSet, "visitedClassifiers");
        C5122Mcb c = xtb.za().c();
        if (c != null) {
            C7471uYa.a((Object) c, "kotlinType.constructor.d…n expected: $kotlinType\")");
            if (!hashSet.add(c)) {
                return null;
            }
            if (c instanceof C4905Fdb) {
                xtb2 = a(Fub.a((C4905Fdb) c), hashSet);
                if (xtb2 == null) {
                    xtb = null;
                } else if (!C7844ztb.b(xtb2) && xtb.Aa()) {
                    xtb = Fub.f(xtb2);
                }
                return xtb;
            }
            if ((c instanceof C5029Jcb) && ((C5029Jcb) c).isInline()) {
                C7706xtb b = C6667ipb.b(xtb);
                if (b != null) {
                    xtb2 = a(b, hashSet);
                    if (xtb2 != null) {
                        if (C7844ztb.b(xtb)) {
                            if (!C7844ztb.b(xtb2) && !C5301Sbb.s(xtb2)) {
                                xtb = Fub.f(xtb2);
                            }
                        }
                    }
                }
                return null;
            }
            return xtb;
            xtb = xtb2;
            return xtb;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Type with a declaration expected: ");
        sb.append(xtb);
        throw new AssertionError(sb.toString());
    }

    public static /* synthetic */ String a(C5029Jcb jcb, Mkb mkb, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            mkb = Nkb.a;
        }
        return a(jcb, mkb, z);
    }

    public static final String a(C5029Jcb jcb, Mkb<?> mkb, boolean z) {
        C7471uYa.b(jcb, "klass");
        C7471uYa.b(mkb, "typeMappingConfiguration");
        C5272Rcb a = z ? a(jcb.e()) : jcb.e();
        C7694xnb b = C7832znb.b(jcb.getName());
        C7471uYa.a((Object) b, "SpecialNames.safeIdentifier(klass.name)");
        String b2 = b.b();
        C7471uYa.a((Object) b2, "SpecialNames.safeIdentifier(klass.name).identifier");
        if (a instanceof C6790kdb) {
            C7349snb q = ((C6790kdb) a).q();
            if (!q.b()) {
                StringBuilder sb = new StringBuilder();
                String a2 = q.a();
                C7471uYa.a((Object) a2, "fqName.asString()");
                sb.append(Cxb.a(a2, '.', '/', false, 4, (Object) null));
                sb.append('/');
                sb.append(b2);
                b2 = sb.toString();
            }
            return b2;
        }
        C5029Jcb jcb2 = (C5029Jcb) (!(a instanceof C5029Jcb) ? null : a);
        if (jcb2 != null) {
            String b3 = mkb.b(jcb2);
            if (b3 == null) {
                b3 = a(jcb2, mkb, z);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b3);
            sb2.append('$');
            sb2.append(b2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unexpected container: ");
        sb3.append(a);
        sb3.append(" for ");
        sb3.append(jcb);
        throw new IllegalArgumentException(sb3.toString());
    }

    private static final C5272Rcb a(C5272Rcb rcb) {
        C5272Rcb rcb2 = (C5029Jcb) (!(rcb instanceof C5029Jcb) ? null : rcb);
        if (rcb2 == null) {
            rcb2 = (C6790kdb) (!(rcb instanceof C6790kdb) ? null : rcb);
        }
        if (rcb2 != null) {
            return rcb2;
        }
        if (rcb != null) {
            return a(rcb.e());
        }
        return null;
    }
}
