package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: QZa reason: default package */
/* compiled from: KClassifiers.kt */
public final class QZa {
    public static /* synthetic */ HZa a(C7541vZa vza, List list, boolean z, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = C6918mWa.a();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list2 = C6918mWa.a();
        }
        return a(vza, list, z, list2);
    }

    public static final HZa a(C7541vZa vza, List<JZa> list, boolean z, List<? extends Annotation> list2) {
        C6723jeb jeb;
        C7471uYa.b(vza, "$this$createType");
        C7471uYa.b(list, "arguments");
        C7471uYa.b(list2, "annotations");
        M_a m_a = (M_a) (!(vza instanceof M_a) ? null : vza);
        if (m_a != null) {
            C5122Mcb b = m_a.b();
            if (b != null) {
                Ptb Q = b.Q();
                C7471uYa.a((Object) Q, "descriptor.typeConstructor");
                List parameters = Q.getParameters();
                C7471uYa.a((Object) parameters, "typeConstructor.parameters");
                if (parameters.size() == list.size()) {
                    if (list2.isEmpty()) {
                        jeb = C6723jeb.c.a();
                    } else {
                        jeb = C6723jeb.c.a();
                    }
                    return new C5120Mab(a(jeb, Q, list, z), new PZa(vza));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Class declares ");
                sb.append(parameters.size());
                sb.append(" type parameters, but ");
                sb.append(list.size());
                sb.append(" were provided.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot create type for an unsupported classifier: ");
        sb2.append(vza);
        sb2.append(" (");
        sb2.append(vza.getClass());
        sb2.append(')');
        throw new C5240Qab(sb2.toString());
    }

    private static final Etb a(C6723jeb jeb, Ptb ptb, List<JZa> list, boolean z) {
        Object obj;
        List parameters = ptb.getParameters();
        C7471uYa.a((Object) parameters, "typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                JZa jZa = (JZa) next;
                C5120Mab mab = (C5120Mab) jZa.b();
                C7706xtb b = mab != null ? mab.b() : null;
                KZa c = jZa.c();
                if (c == null) {
                    Object obj2 = parameters.get(i);
                    C7471uYa.a(obj2, "parameters[index]");
                    obj = new Jtb((C4905Fdb) obj2);
                } else {
                    int i3 = OZa.a[c.ordinal()];
                    if (i3 == 1) {
                        C6473fub fub = C6473fub.INVARIANT;
                        if (b != null) {
                            obj = new Utb(fub, b);
                        } else {
                            C7471uYa.a();
                            throw null;
                        }
                    } else if (i3 == 2) {
                        C6473fub fub2 = C6473fub.IN_VARIANCE;
                        if (b != null) {
                            obj = new Utb(fub2, b);
                        } else {
                            C7471uYa.a();
                            throw null;
                        }
                    } else if (i3 == 3) {
                        C6473fub fub3 = C6473fub.OUT_VARIANCE;
                        if (b != null) {
                            obj = new Utb(fub3, b);
                        } else {
                            C7471uYa.a();
                            throw null;
                        }
                    } else {
                        throw new FVa();
                    }
                }
                arrayList.add(obj);
                i = i2;
            } else {
                C6782kWa.c();
                throw null;
            }
        }
        return C7775ytb.a(jeb, ptb, arrayList, z);
    }
}
