package defpackage;

import java.io.Serializable;
import java.util.HashMap;

/* renamed from: CCb reason: default package */
/* compiled from: ThaiBuddhistChronology */
public final class CCb extends C6625iCb implements Serializable {
    public static final CCb e = new CCb();
    private static final HashMap<String, String[]> f = new HashMap<>();
    private static final HashMap<String, String[]> g = new HashMap<>();
    private static final HashMap<String, String[]> h = new HashMap<>();

    static {
        String str = "BE";
        String str2 = "BB";
        String str3 = "en";
        f.put(str3, new String[]{str2, str});
        String[] strArr = {str2, str};
        String str4 = "th";
        f.put(str4, strArr);
        g.put(str3, new String[]{"B.B.", "B.E."});
        String str5 = "ปีก่อนคริสต์กาลที่";
        g.put(str4, new String[]{"พ.ศ.", str5});
        h.put(str3, new String[]{"Before Buddhist", "Budhhist Era"});
        h.put(str4, new String[]{"พุทธศักราช", str5});
    }

    private CCb() {
    }

    private Object readResolve() {
        return e;
    }

    public ZBb<ECb> c(C7036oDb odb) {
        return super.c(odb);
    }

    public String getCalendarType() {
        return "buddhist";
    }

    public String getId() {
        return "ThaiBuddhist";
    }

    public ECb a(C7036oDb odb) {
        if (odb instanceof ECb) {
            return (ECb) odb;
        }
        return new ECb(C6827lBb.a(odb));
    }

    public ECb date(int i, int i2, int i3) {
        return new ECb(C6827lBb.a(i - 543, i2, i3));
    }

    public FCb eraOf(int i) {
        return FCb.a(i);
    }

    public C6353eCb<ECb> a(C6623iBb ibb, NBb nBb) {
        return super.a(ibb, nBb);
    }

    public FDb a(C6423fDb fdb) {
        int i = BCb.a[fdb.ordinal()];
        if (i == 1) {
            FDb range = C6423fDb.PROLEPTIC_MONTH.range();
            return FDb.a(range.b() + 6516, range.a() + 6516);
        } else if (i == 2) {
            FDb range2 = C6423fDb.YEAR.range();
            return FDb.a(1, 1 + (-(range2.b() + 543)), range2.a() + 543);
        } else if (i != 3) {
            return fdb.range();
        } else {
            FDb range3 = C6423fDb.YEAR.range();
            return FDb.a(range3.b() + 543, range3.a() + 543);
        }
    }
}
