package defpackage;

/* renamed from: eBb reason: default package and case insensitive filesystem */
/* compiled from: DayOfWeek */
public enum C6351eBb implements C7036oDb, C7105pDb {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    public static final CDb<C6351eBb> h = null;
    private static final C6351eBb[] i = null;

    static {
        h = new C6283dBb();
        i = values();
    }

    public static C6351eBb a(int i2) {
        if (i2 >= 1 && i2 <= 7) {
            return i[i2 - 1];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid value for DayOfWeek: ");
        sb.append(i2);
        throw new C5687cBb(sb.toString());
    }

    public boolean b(C7381tDb tdb) {
        boolean z = true;
        if (tdb instanceof C6423fDb) {
            if (tdb != C6423fDb.DAY_OF_WEEK) {
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
        if (tdb == C6423fDb.DAY_OF_WEEK) {
            return getValue();
        }
        return a(tdb).a(d(tdb), tdb);
    }

    public long d(C7381tDb tdb) {
        if (tdb == C6423fDb.DAY_OF_WEEK) {
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

    public static C6351eBb a(C7036oDb odb) {
        if (odb instanceof C6351eBb) {
            return (C6351eBb) odb;
        }
        try {
            return a(odb.c(C6423fDb.DAY_OF_WEEK));
        } catch (C5687cBb e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain DayOfWeek from TemporalAccessor: ");
            sb.append(odb);
            sb.append(", type ");
            sb.append(odb.getClass().getName());
            throw new C5687cBb(sb.toString(), e);
        }
    }

    public FDb a(C7381tDb tdb) {
        if (tdb == C6423fDb.DAY_OF_WEEK) {
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

    public C6351eBb a(long j2) {
        return i[(ordinal() + (((int) (j2 % 7)) + 7)) % 7];
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.e()) {
            return C6491gDb.DAYS;
        }
        if (cDb == BDb.b() || cDb == BDb.c() || cDb == BDb.a() || cDb == BDb.f() || cDb == BDb.g() || cDb == BDb.d()) {
            return null;
        }
        return cDb.a(this);
    }

    public C6967nDb a(C6967nDb ndb) {
        return ndb.a((C7381tDb) C6423fDb.DAY_OF_WEEK, (long) getValue());
    }
}
