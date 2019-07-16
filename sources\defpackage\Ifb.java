package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: Ifb reason: default package */
/* compiled from: AnnotationTypeQualifierResolver.kt */
public final class Ifb {
    private final Nsb<C5029Jcb, C6315deb> a;
    private final boolean b = this.c.a();
    private final C7848zvb c;

    /* renamed from: Ifb$a */
    /* compiled from: AnnotationTypeQualifierResolver.kt */
    public enum a {
        METHOD_RETURN_TYPE,
        VALUE_PARAMETER,
        FIELD,
        TYPE_USE
    }

    /* renamed from: Ifb$b */
    /* compiled from: AnnotationTypeQualifierResolver.kt */
    public static final class b {
        private final C6315deb a;
        private final int b;

        public b(C6315deb deb, int i) {
            C7471uYa.b(deb, "typeQualifier");
            this.a = deb;
            this.b = i;
        }

        public final C6315deb a() {
            return this.a;
        }

        public final List<a> b() {
            a[] values = a.values();
            ArrayList arrayList = new ArrayList();
            for (a aVar : values) {
                if (b(aVar)) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }

        private final boolean a(a aVar) {
            return ((1 << aVar.ordinal()) & this.b) != 0;
        }

        private final boolean b(a aVar) {
            return a(a.TYPE_USE) || a(aVar);
        }
    }

    public Ifb(Ssb ssb, C7848zvb zvb) {
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(zvb, "jsr305State");
        this.c = zvb;
        this.a = ssb.a((_Xa<? super K, ? extends V>) new Jfb<Object,Object>(this));
    }

    private final C6315deb c(C5029Jcb jcb) {
        if (jcb.g() != C5060Kcb.ANNOTATION_CLASS) {
            return null;
        }
        return (C6315deb) this.a.invoke(jcb);
    }

    public final Dvb b(C6315deb deb) {
        C7471uYa.b(deb, "annotationDescriptor");
        Map e = this.c.e();
        C7349snb q = deb.q();
        Dvb dvb = null;
        Dvb dvb2 = (Dvb) e.get(q != null ? q.a() : null);
        if (dvb2 != null) {
            return dvb2;
        }
        C5029Jcb b2 = C7148pqb.b(deb);
        if (b2 != null) {
            dvb = b(b2);
        }
        return dvb;
    }

    public final C6315deb d(C6315deb deb) {
        C7471uYa.b(deb, "annotationDescriptor");
        if (this.c.a()) {
            return null;
        }
        C5029Jcb b2 = C7148pqb.b(deb);
        if (b2 == null) {
            return null;
        }
        if (Kfb.b(b2)) {
            return deb;
        }
        return c(b2);
    }

    public final b e(C6315deb deb) {
        Object obj;
        boolean z;
        List list;
        C7471uYa.b(deb, "annotationDescriptor");
        if (this.c.a()) {
            return null;
        }
        C5029Jcb b2 = C7148pqb.b(deb);
        if (b2 != null) {
            if (!b2.getAnnotations().b(Kfb.c)) {
                b2 = null;
            }
            if (b2 != null) {
                C5029Jcb b3 = C7148pqb.b(deb);
                if (b3 != null) {
                    C6315deb a2 = b3.getAnnotations().a(Kfb.c);
                    if (a2 != null) {
                        Map a3 = a2.a();
                        ArrayList<a> arrayList = new ArrayList<>();
                        for (Entry entry : a3.entrySet()) {
                            C7694xnb xnb = (C7694xnb) entry.getKey();
                            Npb npb = (Npb) entry.getValue();
                            if (C7471uYa.a((Object) xnb, (Object) C6657igb.c)) {
                                list = a(npb);
                            } else {
                                list = C6918mWa.a();
                            }
                            C7331sWa.a((Collection) arrayList, (Iterable) list);
                        }
                        int i = 0;
                        for (a ordinal : arrayList) {
                            i |= 1 << ordinal.ordinal();
                        }
                        Iterator it = b2.getAnnotations().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (d((C6315deb) obj) != null) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        C6315deb deb2 = (C6315deb) obj;
                        if (deb2 != null) {
                            return new b(deb2, i);
                        }
                        return null;
                    }
                    C7471uYa.a();
                    throw null;
                }
                C7471uYa.a();
                throw null;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final C6315deb a(C5029Jcb jcb) {
        C6315deb deb;
        if (!jcb.getAnnotations().b(Kfb.a)) {
            return null;
        }
        Iterator it = jcb.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                deb = null;
                break;
            }
            deb = d((C6315deb) it.next());
            if (deb != null) {
                break;
            }
        }
        return deb;
    }

    private final Dvb b(C5029Jcb jcb) {
        C6315deb a2 = jcb.getAnnotations().a(Kfb.d);
        Dvb dvb = null;
        Npb a3 = a2 != null ? C7148pqb.a(a2) : null;
        if (!(a3 instanceof Spb)) {
            a3 = null;
        }
        Spb spb = (Spb) a3;
        if (spb != null) {
            Dvb d = this.c.d();
            if (d != null) {
                return d;
            }
            String a4 = spb.b().a();
            int hashCode = a4.hashCode();
            if (hashCode != -2137067054) {
                if (hashCode != -1838656823) {
                    if (hashCode == 2656902 && a4.equals("WARN")) {
                        dvb = Dvb.WARN;
                    }
                } else if (a4.equals("STRICT")) {
                    dvb = Dvb.STRICT;
                }
            } else if (a4.equals("IGNORE")) {
                dvb = Dvb.IGNORE;
            }
        }
        return dvb;
    }

    public final C6862lhb c(C6315deb deb) {
        C7471uYa.b(deb, "annotationDescriptor");
        if (this.c.a()) {
            return null;
        }
        C6862lhb lhb = (C6862lhb) Kfb.e.get(deb.q());
        if (lhb != null) {
            C6864ljb a2 = lhb.a();
            Collection b2 = lhb.b();
            Dvb a3 = a(deb);
            if (!(a3 != Dvb.IGNORE)) {
                a3 = null;
            }
            if (a3 != null) {
                return new C6862lhb(C6864ljb.a(a2, null, a3.c(), 1, null), b2);
            }
        }
        return null;
    }

    public final Dvb a(C6315deb deb) {
        C7471uYa.b(deb, "annotationDescriptor");
        Dvb b2 = b(deb);
        if (b2 != null) {
            return b2;
        }
        return this.c.c();
    }

    private final List<a> a(Npb<?> npb) {
        a aVar;
        if (npb instanceof Ipb) {
            Iterable<Npb> iterable = (Iterable) ((Ipb) npb).a();
            ArrayList arrayList = new ArrayList();
            for (Npb a2 : iterable) {
                C7331sWa.a((Collection) arrayList, (Iterable) a(a2));
            }
            return arrayList;
        } else if (!(npb instanceof Spb)) {
            return C6918mWa.a();
        } else {
            String b2 = ((Spb) npb).b().b();
            switch (b2.hashCode()) {
                case -2024225567:
                    if (b2.equals("METHOD")) {
                        aVar = a.METHOD_RETURN_TYPE;
                        break;
                    }
                case 66889946:
                    if (b2.equals("FIELD")) {
                        aVar = a.FIELD;
                        break;
                    }
                case 107598562:
                    if (b2.equals("TYPE_USE")) {
                        aVar = a.TYPE_USE;
                        break;
                    }
                case 446088073:
                    if (b2.equals("PARAMETER")) {
                        aVar = a.VALUE_PARAMETER;
                        break;
                    }
                default:
                    aVar = null;
                    break;
            }
            return C6918mWa.b((Object) aVar);
        }
    }

    public final boolean a() {
        return this.b;
    }
}
