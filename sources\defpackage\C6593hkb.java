package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: hkb reason: default package and case insensitive filesystem */
/* compiled from: typeEnhancement.kt */
public final class C6593hkb {
    private static final C6456fjb a;
    private static final C6456fjb b;

    static {
        C7349snb snb = C6657igb.k;
        C7471uYa.a((Object) snb, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        a = new C6456fjb(snb);
        C7349snb snb2 = C6657igb.l;
        C7471uYa.a((Object) snb2, "JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION");
        b = new C6456fjb(snb2);
    }

    public static final C7706xtb a(C7706xtb xtb, _Xa<? super Integer, C6592hjb> _xa) {
        C7471uYa.b(xtb, "$this$enhance");
        C7471uYa.b(_xa, "qualifiers");
        return a(xtb.Ba(), _xa, 0).c();
    }

    private static final <T> C6524gjb<T> b(T t) {
        return new C6524gjb<>(t, a);
    }

    private static final <T> C6524gjb<T> c(T t) {
        return new C6524gjb<>(t, null);
    }

    public static final boolean a(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$hasEnhancedNullability");
        C6723jeb annotations = xtb.getAnnotations();
        C7349snb snb = C6657igb.k;
        C7471uYa.a((Object) snb, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        return annotations.a(snb) != null;
    }

    private static final Qjb a(C6405eub eub, _Xa<? super Integer, C6592hjb> _xa, int i) {
        Qjb qjb;
        C6405eub eub2;
        boolean z = false;
        if (C7844ztb.a(eub)) {
            return new Qjb(eub, 1, false);
        }
        if (eub instanceof C7223qtb) {
            C7223qtb qtb = (C7223qtb) eub;
            C5725ckb a2 = a(qtb.Da(), _xa, i, C6389ekb.FLEXIBLE_LOWER);
            C5725ckb a3 = a(qtb.Ea(), _xa, i, C6389ekb.FLEXIBLE_UPPER);
            boolean z2 = a2.a() == a3.a();
            if (!TVa.a || z2) {
                if (a2.d() || a3.d()) {
                    z = true;
                }
                C7706xtb a4 = C6269cub.a(a2.b());
                if (a4 == null) {
                    a4 = C6269cub.a(a3.b());
                }
                if (z) {
                    if (eub instanceof Bib) {
                        eub2 = new Bib(a2.b(), a3.b());
                    } else {
                        eub2 = C7775ytb.a(a2.b(), a3.b());
                    }
                    eub = C6269cub.b(eub2, a4);
                }
                qjb = new Qjb(eub, a2.a(), z);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Different tree sizes of bounds: ");
                sb.append("lower = (");
                sb.append(qtb.Da());
                String str = ", ";
                sb.append(str);
                sb.append(a2.a());
                sb.append("), ");
                sb.append("upper = (");
                sb.append(qtb.Ea());
                sb.append(str);
                sb.append(a3.a());
                sb.append(')');
                throw new AssertionError(sb.toString());
            }
        } else if (eub instanceof Etb) {
            qjb = a((Etb) eub, _xa, i, C6389ekb.INFLEXIBLE);
        } else {
            throw new FVa();
        }
        return qjb;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [Etb] */
    /* JADX WARNING: type inference failed for: r2v6, types: [xtb] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v9, types: [eub] */
    /* JADX WARNING: type inference failed for: r3v11, types: [jjb] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v10
  assigns: [?[OBJECT, ARRAY], eub, Etb]
  uses: [xtb, ?[int, boolean, OBJECT, ARRAY, byte, short, char], ?[OBJECT, ARRAY], Etb]
  mth insns count: 116
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
    private static final C5725ckb a(Etb etb, _Xa<? super Integer, C6592hjb> _xa, int i, C6389ekb ekb) {
        ? r2;
        Stb stb;
        Etb etb2 = etb;
        _Xa<? super Integer, C6592hjb> _xa2 = _xa;
        C6389ekb ekb2 = ekb;
        if (!a(ekb) && etb.ya().isEmpty()) {
            return new C5725ckb(etb2, 1, false);
        }
        C5122Mcb c = etb.za().c();
        if (c == null) {
            return new C5725ckb(etb2, 1, false);
        }
        C7471uYa.a((Object) c, "constructor.declarationD…pleResult(this, 1, false)");
        C6592hjb hjb = (C6592hjb) _xa2.invoke(Integer.valueOf(i));
        C6524gjb a2 = a(c, hjb, ekb2);
        C5122Mcb mcb = (C5122Mcb) a2.a();
        C6723jeb b2 = a2.b();
        Ptb Q = mcb.Q();
        String str = "enhancedClassifier.typeConstructor";
        C7471uYa.a((Object) Q, str);
        int i2 = i + 1;
        boolean z = b2 != null;
        List ya = etb.ya();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) ya, 10));
        int i3 = i2;
        int i4 = 0;
        for (Object next : ya) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                Stb stb2 = (Stb) next;
                if (stb2.a()) {
                    i3++;
                    Ptb Q2 = mcb.Q();
                    C7471uYa.a((Object) Q2, str);
                    stb = C5605aub.a((C4905Fdb) Q2.getParameters().get(i4));
                } else {
                    Qjb a3 = a(stb2.getType().Ba(), _xa2, i3);
                    z = z || a3.d();
                    i3 += a3.a();
                    C7706xtb b3 = a3.b();
                    C6473fub b4 = stb2.b();
                    C7471uYa.a((Object) b4, "arg.projectionKind");
                    stb = Fub.a(b3, b4, (C4905Fdb) Q.getParameters().get(i4));
                }
                arrayList.add(stb);
                i4 = i5;
            } else {
                C6782kWa.c();
                throw null;
            }
        }
        C6524gjb a4 = a((C7706xtb) etb2, hjb, ekb2);
        boolean booleanValue = ((Boolean) a4.a()).booleanValue();
        C6723jeb b5 = a4.b();
        int i6 = i3 - i;
        if (!(z || b5 != null)) {
            return new C5725ckb(etb2, i6, false);
        }
        ? a5 = C7775ytb.a(a(C7676xWa.f((Iterable) C6918mWa.b((T[]) new C6723jeb[]{etb.getAnnotations(), b2, b5}))), Q, arrayList, booleanValue);
        if (hjb.d()) {
            a5 = new C6728jjb(a5);
        }
        if (b5 != null && hjb.e()) {
            r2 = C6269cub.b(etb2, r2);
        }
        if (r2 != 0) {
            return new C5725ckb((Etb) r2, i6, true);
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }

    private static final C6723jeb a(List<? extends C6723jeb> list) {
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("At least one Annotations object expected");
        } else if (size != 1) {
            return new C7202qeb(C7676xWa.q(list));
        } else {
            return (C6723jeb) C7676xWa.j((List) list);
        }
    }

    private static final boolean a(C6389ekb ekb) {
        return ekb != C6389ekb.INFLEXIBLE;
    }

    private static final <T> C6524gjb<T> a(T t) {
        return new C6524gjb<>(t, b);
    }

    private static final C6524gjb<C5122Mcb> a(C5122Mcb mcb, C6592hjb hjb, C6389ekb ekb) {
        if (!a(ekb)) {
            return c(mcb);
        }
        if (!(mcb instanceof C5029Jcb)) {
            return c(mcb);
        }
        C6721jcb jcb = C6721jcb.m;
        C6660ijb b2 = hjb.b();
        if (b2 != null) {
            int i = C6525gkb.a[b2.ordinal()];
            if (i != 1) {
                if (i == 2 && ekb == C6389ekb.FLEXIBLE_UPPER) {
                    C5029Jcb jcb2 = (C5029Jcb) mcb;
                    if (jcb.d(jcb2)) {
                        return a((T) jcb.b(jcb2));
                    }
                }
            } else if (ekb == C6389ekb.FLEXIBLE_LOWER) {
                C5029Jcb jcb3 = (C5029Jcb) mcb;
                if (jcb.c(jcb3)) {
                    return a((T) jcb.a(jcb3));
                }
            }
        }
        return c(mcb);
    }

    private static final C6524gjb<Boolean> a(C7706xtb xtb, C6592hjb hjb, C6389ekb ekb) {
        C6524gjb<Boolean> gjb;
        if (!a(ekb)) {
            return c(Boolean.valueOf(xtb.Aa()));
        }
        C6796kjb c = hjb.c();
        if (c != null) {
            int i = C6525gkb.b[c.ordinal()];
            if (i == 1) {
                gjb = b(Boolean.valueOf(true));
            } else if (i == 2) {
                gjb = b(Boolean.valueOf(false));
            }
            return gjb;
        }
        gjb = c(Boolean.valueOf(xtb.Aa()));
        return gjb;
    }
}
