package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Bib reason: default package */
/* compiled from: RawType.kt */
public final class Bib extends C7223qtb implements Dtb {
    public Bib(Etb etb, Etb etb2) {
        C7471uYa.b(etb, "lowerBound");
        C7471uYa.b(etb2, "upperBound");
        super(etb, etb2);
        boolean b = C6745jub.a.b(etb, etb2);
        if (TVa.a && !b) {
            StringBuilder sb = new StringBuilder();
            sb.append("Lower bound ");
            sb.append(etb);
            sb.append(" of a flexible type must be a subtype of the upper bound ");
            sb.append(etb2);
            throw new AssertionError(sb.toString());
        }
    }

    public Etb Ca() {
        return Da();
    }

    public Eqb ha() {
        C5122Mcb c = za().c();
        if (!(c instanceof C5029Jcb)) {
            c = null;
        }
        C5029Jcb jcb = (C5029Jcb) c;
        if (jcb != null) {
            Eqb a = jcb.a(C7620wib.e);
            C7471uYa.a((Object) a, "classDescriptor.getMemberScope(RawSubstitution)");
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Incorrect classifier: ");
        sb.append(za().c());
        throw new IllegalStateException(sb.toString().toString());
    }

    public Bib a(C6723jeb jeb) {
        C7471uYa.b(jeb, "newAnnotations");
        return new Bib(Da().a(jeb), Ea().a(jeb));
    }

    public Bib a(boolean z) {
        return new Bib(Da().a(z), Ea().a(z));
    }

    public String a(Cob cob, Pob pob) {
        C7471uYa.b(cob, "renderer");
        C7471uYa.b(pob, "options");
        C7689xib xib = C7689xib.a;
        C7758yib yib = new C7758yib(cob);
        C7827zib zib = C7827zib.a;
        String a = cob.a((C7706xtb) Da());
        String a2 = cob.a((C7706xtb) Ea());
        if (pob.c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("raw (");
            sb.append(a);
            sb.append("..");
            sb.append(a2);
            sb.append(')');
            return sb.toString();
        } else if (Ea().ya().isEmpty()) {
            return cob.a(a, a2, Fub.b(this));
        } else {
            List a3 = yib.invoke(Da());
            List a4 = yib.invoke(Ea());
            List list = a3;
            String a5 = C7676xWa.a(list, ", ", null, null, 0, null, Aib.a, 30, null);
            List e = C7676xWa.e((Iterable) a3, (Iterable) a4);
            boolean z = true;
            if (!(e instanceof Collection) || !e.isEmpty()) {
                Iterator it = e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    HVa hVa = (HVa) it.next();
                    if (!C7689xib.a.a((String) hVa.c(), (String) hVa.d())) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                a2 = zib.invoke(a2, a5);
            }
            String a6 = zib.invoke(a, a5);
            if (C7471uYa.a((Object) a6, (Object) a2)) {
                return a6;
            }
            return cob.a(a6, a2, Fub.b(this));
        }
    }
}
