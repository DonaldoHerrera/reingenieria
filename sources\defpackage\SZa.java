package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: SZa reason: default package */
/* compiled from: KTypesJvm.kt */
public final class SZa {
    public static final C7472uZa<?> a(HZa hZa) {
        C7471uYa.b(hZa, "$this$jvmErasure");
        C7541vZa e = hZa.e();
        if (e != null) {
            C7472uZa<?> a = a(e);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot calculate JVM erasure for type: ");
        sb.append(hZa);
        throw new C5240Qab(sb.toString());
    }

    public static final C7472uZa<?> a(C7541vZa vza) {
        Object obj;
        boolean z;
        C7471uYa.b(vza, "$this$jvmErasure");
        if (vza instanceof C7472uZa) {
            return (C7472uZa) vza;
        }
        if (vza instanceof IZa) {
            List upperBounds = ((IZa) vza).getUpperBounds();
            Iterator it = upperBounds.iterator();
            while (true) {
                C5029Jcb jcb = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                HZa hZa = (HZa) obj;
                if (hZa != null) {
                    C5122Mcb c = ((C5120Mab) hZa).b().za().c();
                    if (c instanceof C5029Jcb) {
                        jcb = c;
                    }
                    C5029Jcb jcb2 = jcb;
                    if (jcb2 == null || jcb2.g() == C5060Kcb.INTERFACE || jcb2.g() == C5060Kcb.ANNOTATION_CLASS) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    throw new OVa("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                }
            }
            HZa hZa2 = (HZa) obj;
            if (hZa2 == null) {
                hZa2 = (HZa) C7676xWa.g(upperBounds);
            }
            if (hZa2 != null) {
                C7472uZa<?> a = a(hZa2);
                if (a != null) {
                    return a;
                }
            }
            return HYa.a(Object.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot calculate JVM erasure for type: ");
        sb.append(vza);
        throw new C5240Qab(sb.toString());
    }
}
