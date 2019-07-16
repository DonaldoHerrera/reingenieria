package defpackage;

import java.io.Serializable;

/* renamed from: wCb reason: default package and case insensitive filesystem */
/* compiled from: MinguoChronology */
public final class C7586wCb extends C6625iCb implements Serializable {
    public static final C7586wCb e = new C7586wCb();

    private C7586wCb() {
    }

    private Object readResolve() {
        return e;
    }

    public ZBb<C7724yCb> c(C7036oDb odb) {
        return super.c(odb);
    }

    public String getCalendarType() {
        return "roc";
    }

    public String getId() {
        return "Minguo";
    }

    public C7724yCb a(C7036oDb odb) {
        if (odb instanceof C7724yCb) {
            return (C7724yCb) odb;
        }
        return new C7724yCb(C6827lBb.a(odb));
    }

    public C7724yCb date(int i, int i2, int i3) {
        return new C7724yCb(C6827lBb.a(i + 1911, i2, i3));
    }

    public C7793zCb eraOf(int i) {
        return C7793zCb.a(i);
    }

    public C6353eCb<C7724yCb> a(C6623iBb ibb, NBb nBb) {
        return super.a(ibb, nBb);
    }

    public FDb a(C6423fDb fdb) {
        int i = C7517vCb.a[fdb.ordinal()];
        if (i == 1) {
            FDb range = C6423fDb.PROLEPTIC_MONTH.range();
            return FDb.a(range.b() - 22932, range.a() - 22932);
        } else if (i == 2) {
            FDb range2 = C6423fDb.YEAR.range();
            return FDb.a(1, range2.a() - 1911, (-range2.b()) + 1 + 1911);
        } else if (i != 3) {
            return fdb.range();
        } else {
            FDb range3 = C6423fDb.YEAR.range();
            return FDb.a(range3.b() - 1911, range3.a() - 1911);
        }
    }
}
