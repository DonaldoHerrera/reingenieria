package defpackage;

/* renamed from: rDb reason: default package and case insensitive filesystem */
/* compiled from: TemporalAdjusters */
public final class C7243rDb {

    /* renamed from: rDb$a */
    /* compiled from: TemporalAdjusters */
    private static final class a implements C7105pDb {
        private final int a;
        private final int b;

        public C6967nDb a(C6967nDb ndb) {
            int c = ndb.c(C6423fDb.DAY_OF_WEEK);
            if (this.a < 2 && c == this.b) {
                return ndb;
            }
            if ((this.a & 1) == 0) {
                int i = c - this.b;
                return ndb.b((long) (i >= 0 ? 7 - i : -i), C6491gDb.DAYS);
            }
            int i2 = this.b - c;
            return ndb.a((long) (i2 >= 0 ? 7 - i2 : -i2), (DDb) C6491gDb.DAYS);
        }

        private a(int i, C6351eBb ebb) {
            C6355eDb.a(ebb, "dayOfWeek");
            this.a = i;
            this.b = ebb.getValue();
        }
    }

    public static C7105pDb a(C6351eBb ebb) {
        return new a(0, ebb);
    }

    public static C7105pDb b(C6351eBb ebb) {
        return new a(1, ebb);
    }
}
