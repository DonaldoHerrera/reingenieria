package defpackage;

import java.util.List;

/* renamed from: qkb reason: default package and case insensitive filesystem */
/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
public final class C7208qkb extends C6661ikb<C6315deb, Npb<?>> {
    private final C6263crb e = new C6263crb(this.f, this.g);
    private final C6450fdb f;
    private final C6586hdb g;

    public C7208qkb(C6450fdb fdb, C6586hdb hdb, Ssb ssb, Bkb bkb) {
        C7471uYa.b(fdb, "module");
        C7471uYa.b(hdb, "notFoundClasses");
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(bkb, "kotlinClassFinder");
        super(ssb, bkb);
        this.f = fdb;
        this.g = hdb;
    }

    /* access modifiers changed from: protected */
    public C6315deb a(C5590alb alb, Emb emb) {
        C7471uYa.b(alb, "proto");
        C7471uYa.b(emb, "nameResolver");
        return this.e.a(alb, emb);
    }

    /* access modifiers changed from: protected */
    public Npb<?> a(String str, Object obj) {
        C7471uYa.b(str, "desc");
        C7471uYa.b(obj, "initializer");
        boolean z = false;
        if (Hxb.a((CharSequence) "ZBCS", (CharSequence) str, false, 2, (Object) null)) {
            int intValue = ((Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode != 66) {
                if (hashCode != 67) {
                    if (hashCode != 83) {
                        if (hashCode == 90 && str.equals("Z")) {
                            if (intValue != 0) {
                                z = true;
                            }
                            obj = Boolean.valueOf(z);
                        }
                    } else if (str.equals("S")) {
                        obj = Short.valueOf((short) intValue);
                    }
                } else if (str.equals("C")) {
                    obj = Character.valueOf((char) intValue);
                }
            } else if (str.equals("B")) {
                obj = Byte.valueOf((byte) intValue);
            }
            throw new AssertionError(str);
        }
        return Qpb.a.a(obj);
    }

    /* access modifiers changed from: protected */
    public Npb<?> a(Npb<?> npb) {
        C7471uYa.b(npb, "constant");
        if (npb instanceof Kpb) {
            return new C6261cqb(((Number) ((Kpb) npb).a()).byteValue());
        }
        if (npb instanceof C5597aqb) {
            return new C6465fqb(((Number) ((C5597aqb) npb).a()).shortValue());
        }
        if (npb instanceof Vpb) {
            return new C6329dqb(((Number) ((Vpb) npb).a()).intValue());
        }
        return npb instanceof Zpb ? new C6397eqb(((Number) ((Zpb) npb).a()).longValue()) : npb;
    }

    /* access modifiers changed from: protected */
    public a a(C7280rnb rnb, C7822zdb zdb, List<C6315deb> list) {
        C7471uYa.b(rnb, "annotationClassId");
        C7471uYa.b(zdb, "source");
        C7471uYa.b(list, "result");
        return new C7139pkb(this, a(rnb), list, zdb);
    }

    private final C5029Jcb a(C7280rnb rnb) {
        return C5535_cb.a(this.f, rnb, this.g);
    }
}
