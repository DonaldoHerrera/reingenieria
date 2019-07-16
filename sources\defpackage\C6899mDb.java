package defpackage;

import java.util.Map;

/* renamed from: mDb reason: default package and case insensitive filesystem */
/* compiled from: IsoFields */
public final class C6899mDb {
    public static final C7381tDb a = a.DAY_OF_QUARTER;
    public static final C7381tDb b = a.QUARTER_OF_YEAR;
    public static final C7381tDb c = a.WEEK_OF_WEEK_BASED_YEAR;
    public static final C7381tDb d = a.WEEK_BASED_YEAR;
    public static final DDb e = b.WEEK_BASED_YEARS;
    public static final DDb f = b.QUARTER_YEARS;

    /* renamed from: mDb$a */
    /* compiled from: IsoFields */
    private enum a implements C7381tDb {
        DAY_OF_QUARTER,
        QUARTER_OF_YEAR,
        WEEK_OF_WEEK_BASED_YEAR,
        WEEK_BASED_YEAR;
        
        /* access modifiers changed from: private */
        public static final int[] e = null;

        static {
            e = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        /* access modifiers changed from: private */
        public static boolean e(C7036oDb odb) {
            return C6625iCb.b(odb).equals(C7034oCb.e);
        }

        /* access modifiers changed from: private */
        public static FDb f(C6827lBb lbb) {
            return FDb.a(1, (long) b(e(lbb)));
        }

        public C7036oDb a(Map<C7381tDb, Long> map, C7036oDb odb, XCb xCb) {
            return null;
        }

        public boolean isDateBased() {
            return true;
        }

        public boolean isTimeBased() {
            return false;
        }

        /* access modifiers changed from: private */
        public static int b(int i) {
            C6827lBb a = C6827lBb.a(i, 1, 1);
            return (a.K() == C6351eBb.THURSDAY || (a.K() == C6351eBb.WEDNESDAY && a.isLeapYear())) ? 53 : 52;
        }

        /* access modifiers changed from: private */
        public static int d(C6827lBb lbb) {
            int L = lbb.L() - 1;
            int ordinal = (3 - lbb.K().ordinal()) + L;
            int i = (ordinal - ((ordinal / 7) * 7)) - 3;
            if (i < -3) {
                i += 7;
            }
            if (L < i) {
                return (int) f(lbb.b(180).b(1)).a();
            }
            int i2 = ((L - i) / 7) + 1;
            if (i2 == 53) {
                if (!(i == -3 || (i == -2 && lbb.isLeapYear()))) {
                    i2 = 1;
                }
            }
            return i2;
        }

        /* access modifiers changed from: private */
        public static int e(C6827lBb lbb) {
            int O = lbb.O();
            int L = lbb.L();
            if (L <= 3) {
                if (L - lbb.K().ordinal() < -2) {
                    return O - 1;
                }
                return O;
            } else if (L < 363) {
                return O;
            } else {
                return ((L - 363) - (lbb.isLeapYear() ? 1 : 0)) - lbb.K().ordinal() >= 0 ? O + 1 : O;
            }
        }
    }

    /* renamed from: mDb$b */
    /* compiled from: IsoFields */
    private enum b implements DDb {
        WEEK_BASED_YEARS("WeekBasedYears", C6419fBb.b(31556952)),
        QUARTER_YEARS("QuarterYears", C6419fBb.b(7889238));
        
        private final String d;
        private final C6419fBb e;

        private b(String str, C6419fBb fbb) {
            this.d = str;
            this.e = fbb;
        }

        public <R extends C6967nDb> R a(R r, long j) {
            int i = C6559hDb.a[ordinal()];
            if (i == 1) {
                return r.a(C6899mDb.d, C6355eDb.d((long) r.c(C6899mDb.d), j));
            } else if (i == 2) {
                return r.b(j / 256, C6491gDb.YEARS).b((j % 256) * 3, C6491gDb.MONTHS);
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        public boolean isDateBased() {
            return true;
        }

        public String toString() {
            return this.d;
        }
    }
}
