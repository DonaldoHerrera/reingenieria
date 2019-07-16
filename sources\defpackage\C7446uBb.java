package defpackage;

/* renamed from: uBb reason: default package and case insensitive filesystem */
/* compiled from: Month */
public enum C7446uBb implements C7036oDb, C7105pDb {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    
    public static final CDb<C7446uBb> m = null;
    private static final C7446uBb[] n = null;

    static {
        m = new C7308sBb();
        n = values();
    }

    public static C7446uBb a(int i) {
        if (i >= 1 && i <= 12) {
            return n[i - 1];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid value for MonthOfYear: ");
        sb.append(i);
        throw new C5687cBb(sb.toString());
    }

    public boolean b(C7381tDb tdb) {
        boolean z = true;
        if (tdb instanceof C6423fDb) {
            if (tdb != C6423fDb.MONTH_OF_YEAR) {
                z = false;
            }
            return z;
        }
        if (tdb == null || !tdb.a(this)) {
            z = false;
        }
        return z;
    }

    public int c(C7381tDb tdb) {
        if (tdb == C6423fDb.MONTH_OF_YEAR) {
            return getValue();
        }
        return a(tdb).a(d(tdb), tdb);
    }

    public long d(C7381tDb tdb) {
        if (tdb == C6423fDb.MONTH_OF_YEAR) {
            return (long) getValue();
        }
        if (!(tdb instanceof C6423fDb)) {
            return tdb.c(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(tdb);
        throw new EDb(sb.toString());
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public static C7446uBb a(C7036oDb odb) {
        if (odb instanceof C7446uBb) {
            return (C7446uBb) odb;
        }
        try {
            if (!C7034oCb.e.equals(C6625iCb.b(odb))) {
                odb = C6827lBb.a(odb);
            }
            return a(odb.c(C6423fDb.MONTH_OF_YEAR));
        } catch (C5687cBb e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain Month from TemporalAccessor: ");
            sb.append(odb);
            sb.append(", type ");
            sb.append(odb.getClass().getName());
            throw new C5687cBb(sb.toString(), e);
        }
    }

    public int b(boolean z) {
        int i = C7377tBb.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return z ? 29 : 28;
    }

    public int b() {
        int i = C7377tBb.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 28;
    }

    public FDb a(C7381tDb tdb) {
        if (tdb == C6423fDb.MONTH_OF_YEAR) {
            return tdb.range();
        }
        if (!(tdb instanceof C6423fDb)) {
            return tdb.b(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(tdb);
        throw new EDb(sb.toString());
    }

    public C7446uBb a(long j) {
        return n[(ordinal() + (((int) (j % 12)) + 12)) % 12];
    }

    public int a() {
        int i = C7377tBb.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public int a(boolean z) {
        switch (C7377tBb.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + true;
            case 3:
                return z + true;
            case 4:
                return z + true;
            case 5:
                return z + true;
            case 6:
                return 1;
            case 7:
                return z + true;
            case 8:
                return z + true;
            case 9:
                return z + true;
            case 10:
                return z + true;
            case 11:
                return z + true;
            default:
                return z + true;
        }
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.a()) {
            return C7034oCb.e;
        }
        if (cDb == BDb.e()) {
            return C6491gDb.MONTHS;
        }
        if (cDb == BDb.b() || cDb == BDb.c() || cDb == BDb.f() || cDb == BDb.g() || cDb == BDb.d()) {
            return null;
        }
        return cDb.a(this);
    }

    public C6967nDb a(C6967nDb ndb) {
        if (C6625iCb.b((C7036oDb) ndb).equals(C7034oCb.e)) {
            return ndb.a((C7381tDb) C6423fDb.MONTH_OF_YEAR, (long) getValue());
        }
        throw new C5687cBb("Adjustment only supported on ISO date-time");
    }
}
