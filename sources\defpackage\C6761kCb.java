package defpackage;

import java.io.Serializable;
import java.util.HashMap;

/* renamed from: kCb reason: default package and case insensitive filesystem */
/* compiled from: HijrahChronology */
public final class C6761kCb extends C6625iCb implements Serializable {
    public static final C6761kCb e = new C6761kCb();
    private static final HashMap<String, String[]> f = new HashMap<>();
    private static final HashMap<String, String[]> g = new HashMap<>();
    private static final HashMap<String, String[]> h = new HashMap<>();

    static {
        String str = "en";
        f.put(str, new String[]{"BH", "HE"});
        g.put(str, new String[]{"B.H.", "H.E."});
        h.put(str, new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private C6761kCb() {
    }

    private Object readResolve() {
        return e;
    }

    public ZBb<C6897mCb> c(C7036oDb odb) {
        return super.c(odb);
    }

    public String getCalendarType() {
        return "islamic-umalqura";
    }

    public String getId() {
        return "Hijrah-umalqura";
    }

    public C6897mCb a(C7036oDb odb) {
        if (odb instanceof C6897mCb) {
            return (C6897mCb) odb;
        }
        return C6897mCb.d(odb.d(C6423fDb.EPOCH_DAY));
    }

    public C6897mCb date(int i, int i2, int i3) {
        return C6897mCb.a(i, i2, i3);
    }

    public C6965nCb eraOf(int i) {
        if (i == 0) {
            return C6965nCb.BEFORE_AH;
        }
        if (i == 1) {
            return C6965nCb.AH;
        }
        throw new C5687cBb("invalid Hijrah era");
    }

    public C6353eCb<C6897mCb> a(C6623iBb ibb, NBb nBb) {
        return super.a(ibb, nBb);
    }

    public FDb a(C6423fDb fdb) {
        return fdb.range();
    }
}
