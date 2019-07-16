package defpackage;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: GDb reason: default package */
/* compiled from: WeekFields */
public final class GDb implements Serializable {
    private static final ConcurrentMap<String, GDb> a = new ConcurrentHashMap(4, 0.75f, 2);
    public static final GDb b = new GDb(C6351eBb.MONDAY, 4);
    public static final GDb c = a(C6351eBb.SUNDAY, 1);
    private final C6351eBb d;
    private final int e;
    private final transient C7381tDb f = a.a(this);
    private final transient C7381tDb g = a.c(this);
    private final transient C7381tDb h = a.e(this);
    /* access modifiers changed from: private */
    public final transient C7381tDb i = a.d(this);
    private final transient C7381tDb j = a.b(this);

    /* renamed from: GDb$a */
    /* compiled from: WeekFields */
    static class a implements C7381tDb {
        private static final FDb a = FDb.a(1, 7);
        private static final FDb b = FDb.a(0, 1, 4, 6);
        private static final FDb c = FDb.a(0, 1, 52, 54);
        private static final FDb d = FDb.a(1, 52, 53);
        private static final FDb e = C6423fDb.YEAR.range();
        private final String f;
        private final GDb g;
        private final DDb h;
        private final DDb i;
        private final FDb j;

        private a(String str, GDb gDb, DDb dDb, DDb dDb2, FDb fDb) {
            this.f = str;
            this.g = gDb;
            this.h = dDb;
            this.i = dDb2;
            this.j = fDb;
        }

        static a a(GDb gDb) {
            a aVar = new a("DayOfWeek", gDb, C6491gDb.DAYS, C6491gDb.WEEKS, a);
            return aVar;
        }

        static a b(GDb gDb) {
            a aVar = new a("WeekBasedYear", gDb, C6899mDb.e, C6491gDb.FOREVER, e);
            return aVar;
        }

        static a c(GDb gDb) {
            a aVar = new a("WeekOfMonth", gDb, C6491gDb.WEEKS, C6491gDb.MONTHS, b);
            return aVar;
        }

        static a d(GDb gDb) {
            a aVar = new a("WeekOfWeekBasedYear", gDb, C6491gDb.WEEKS, C6899mDb.e, d);
            return aVar;
        }

        static a e(GDb gDb) {
            a aVar = new a("WeekOfYear", gDb, C6491gDb.WEEKS, C6491gDb.YEARS, c);
            return aVar;
        }

        private FDb f(C7036oDb odb) {
            int c2 = C6355eDb.c(odb.c(C6423fDb.DAY_OF_WEEK) - this.g.b().getValue(), 7) + 1;
            long c3 = c(odb, c2);
            if (c3 == 0) {
                return f(C6625iCb.b(odb).a(odb).a(2, (DDb) C6491gDb.WEEKS));
            }
            int a2 = a(b(odb.c(C6423fDb.DAY_OF_YEAR), c2), (IBb.a((long) odb.c(C6423fDb.YEAR)) ? 366 : 365) + this.g.c());
            if (c3 >= ((long) a2)) {
                return f(C6625iCb.b(odb).a(odb).b(2, (DDb) C6491gDb.WEEKS));
            }
            return FDb.a(1, (long) (a2 - 1));
        }

        public boolean isDateBased() {
            return true;
        }

        public boolean isTimeBased() {
            return false;
        }

        public FDb range() {
            return this.j;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f);
            sb.append("[");
            sb.append(this.g.toString());
            sb.append("]");
            return sb.toString();
        }

        private int a(C7036oDb odb, int i2) {
            return C6355eDb.c(odb.c(C6423fDb.DAY_OF_WEEK) - i2, 7) + 1;
        }

        private long b(C7036oDb odb, int i2) {
            int c2 = odb.c(C6423fDb.DAY_OF_MONTH);
            return (long) a(b(c2, i2), c2);
        }

        private int d(C7036oDb odb) {
            int c2 = C6355eDb.c(odb.c(C6423fDb.DAY_OF_WEEK) - this.g.b().getValue(), 7) + 1;
            int c3 = odb.c(C6423fDb.YEAR);
            long c4 = c(odb, c2);
            if (c4 == 0) {
                return c3 - 1;
            }
            if (c4 < 53) {
                return c3;
            }
            if (c4 >= ((long) a(b(odb.c(C6423fDb.DAY_OF_YEAR), c2), (IBb.a((long) c3) ? 366 : 365) + this.g.c()))) {
                c3++;
            }
            return c3;
        }

        private int e(C7036oDb odb) {
            int c2 = C6355eDb.c(odb.c(C6423fDb.DAY_OF_WEEK) - this.g.b().getValue(), 7) + 1;
            long c3 = c(odb, c2);
            if (c3 == 0) {
                return ((int) c(C6625iCb.b(odb).a(odb).a(1, (DDb) C6491gDb.WEEKS), c2)) + 1;
            }
            if (c3 >= 53) {
                int a2 = a(b(odb.c(C6423fDb.DAY_OF_YEAR), c2), (IBb.a((long) odb.c(C6423fDb.YEAR)) ? 366 : 365) + this.g.c());
                if (c3 >= ((long) a2)) {
                    return (int) (c3 - ((long) (a2 - 1)));
                }
            }
            return (int) c3;
        }

        public long c(C7036oDb odb) {
            int d2;
            int c2 = C6355eDb.c(odb.c(C6423fDb.DAY_OF_WEEK) - this.g.b().getValue(), 7) + 1;
            DDb dDb = this.i;
            if (dDb == C6491gDb.WEEKS) {
                return (long) c2;
            }
            if (dDb == C6491gDb.MONTHS) {
                int c3 = odb.c(C6423fDb.DAY_OF_MONTH);
                d2 = a(b(c3, c2), c3);
            } else if (dDb == C6491gDb.YEARS) {
                int c4 = odb.c(C6423fDb.DAY_OF_YEAR);
                d2 = a(b(c4, c2), c4);
            } else if (dDb == C6899mDb.e) {
                d2 = e(odb);
            } else if (dDb == C6491gDb.FOREVER) {
                d2 = d(odb);
            } else {
                throw new IllegalStateException("unreachable");
            }
            return (long) d2;
        }

        private int a(int i2, int i3) {
            return ((i2 + 7) + (i3 - 1)) / 7;
        }

        private int b(int i2, int i3) {
            int c2 = C6355eDb.c(i2 - i3, 7);
            return c2 + 1 > this.g.c() ? 7 - c2 : -c2;
        }

        public <R extends C6967nDb> R a(R r, long j2) {
            R r2;
            int a2 = this.j.a(j2, (C7381tDb) this);
            int c2 = r.c(this);
            if (a2 == c2) {
                return r;
            }
            if (this.i != C6491gDb.FOREVER) {
                return r.b((long) (a2 - c2), this.h);
            }
            int c3 = r.c(this.g.i);
            C6967nDb b2 = r.b((long) (((double) (j2 - ((long) c2))) * 52.1775d), C6491gDb.WEEKS);
            if (b2.c(this) > a2) {
                r2 = b2.a((long) b2.c(this.g.i), (DDb) C6491gDb.WEEKS);
            } else {
                if (b2.c(this) < a2) {
                    b2 = b2.b(2, C6491gDb.WEEKS);
                }
                r2 = b2.b((long) (c3 - b2.c(this.g.i)), C6491gDb.WEEKS);
                if (r2.c(this) > a2) {
                    r2 = r2.a(1, (DDb) C6491gDb.WEEKS);
                }
            }
            return r2;
        }

        public FDb b(C7036oDb odb) {
            C6423fDb fdb;
            DDb dDb = this.i;
            if (dDb == C6491gDb.WEEKS) {
                return this.j;
            }
            if (dDb == C6491gDb.MONTHS) {
                fdb = C6423fDb.DAY_OF_MONTH;
            } else if (dDb == C6491gDb.YEARS) {
                fdb = C6423fDb.DAY_OF_YEAR;
            } else if (dDb == C6899mDb.e) {
                return f(odb);
            } else {
                if (dDb == C6491gDb.FOREVER) {
                    return odb.a((C7381tDb) C6423fDb.YEAR);
                }
                throw new IllegalStateException("unreachable");
            }
            int b2 = b(odb.c(fdb), C6355eDb.c(odb.c(C6423fDb.DAY_OF_WEEK) - this.g.b().getValue(), 7) + 1);
            FDb a2 = odb.a((C7381tDb) fdb);
            return FDb.a((long) a(b2, (int) a2.b()), (long) a(b2, (int) a2.a()));
        }

        private long c(C7036oDb odb, int i2) {
            int c2 = odb.c(C6423fDb.DAY_OF_YEAR);
            return (long) a(b(c2, i2), c2);
        }

        public C7036oDb a(Map<C7381tDb, Long> map, C7036oDb odb, XCb xCb) {
            long j2;
            XBb xBb;
            long j3;
            XBb xBb2;
            long j4;
            long j5;
            int i2;
            int value = this.g.b().getValue();
            if (this.i == C6491gDb.WEEKS) {
                map.put(C6423fDb.DAY_OF_WEEK, Long.valueOf((long) (C6355eDb.c((value - 1) + (this.j.a(((Long) map.remove(this)).longValue(), (C7381tDb) this) - 1), 7) + 1)));
                return null;
            } else if (!map.containsKey(C6423fDb.DAY_OF_WEEK)) {
                return null;
            } else {
                String str = "Strict mode rejected date parsed to a different year";
                if (this.i == C6491gDb.FOREVER) {
                    if (!map.containsKey(this.g.i)) {
                        return null;
                    }
                    C6625iCb b2 = C6625iCb.b(odb);
                    C6423fDb fdb = C6423fDb.DAY_OF_WEEK;
                    int c2 = C6355eDb.c(fdb.a(((Long) map.get(fdb)).longValue()) - value, 7) + 1;
                    int a2 = range().a(((Long) map.get(this)).longValue(), (C7381tDb) this);
                    if (xCb == XCb.LENIENT) {
                        xBb2 = b2.date(a2, 1, this.g.c());
                        j5 = ((Long) map.get(this.g.i)).longValue();
                        i2 = a((C7036oDb) xBb2, value);
                        j4 = c(xBb2, i2);
                    } else {
                        xBb2 = b2.date(a2, 1, this.g.c());
                        j5 = (long) this.g.i.range().a(((Long) map.get(this.g.i)).longValue(), this.g.i);
                        i2 = a((C7036oDb) xBb2, value);
                        j4 = c(xBb2, i2);
                    }
                    XBb b3 = xBb2.b(((j5 - j4) * 7) + ((long) (c2 - i2)), (DDb) C6491gDb.DAYS);
                    if (xCb != XCb.STRICT || b3.d(this) == ((Long) map.get(this)).longValue()) {
                        map.remove(this);
                        map.remove(this.g.i);
                        map.remove(C6423fDb.DAY_OF_WEEK);
                        return b3;
                    }
                    throw new C5687cBb(str);
                } else if (!map.containsKey(C6423fDb.YEAR)) {
                    return null;
                } else {
                    C6423fDb fdb2 = C6423fDb.DAY_OF_WEEK;
                    int c3 = C6355eDb.c(fdb2.a(((Long) map.get(fdb2)).longValue()) - value, 7) + 1;
                    C6423fDb fdb3 = C6423fDb.YEAR;
                    int a3 = fdb3.a(((Long) map.get(fdb3)).longValue());
                    C6625iCb b4 = C6625iCb.b(odb);
                    DDb dDb = this.i;
                    if (dDb == C6491gDb.MONTHS) {
                        if (!map.containsKey(C6423fDb.MONTH_OF_YEAR)) {
                            return null;
                        }
                        long longValue = ((Long) map.remove(this)).longValue();
                        if (xCb == XCb.LENIENT) {
                            xBb = b4.date(a3, 1, 1).b(((Long) map.get(C6423fDb.MONTH_OF_YEAR)).longValue() - 1, (DDb) C6491gDb.MONTHS);
                            int a4 = a((C7036oDb) xBb, value);
                            j3 = ((longValue - b((C7036oDb) xBb, a4)) * 7) + ((long) (c3 - a4));
                        } else {
                            C6423fDb fdb4 = C6423fDb.MONTH_OF_YEAR;
                            xBb = b4.date(a3, fdb4.a(((Long) map.get(fdb4)).longValue()), 8);
                            int a5 = a((C7036oDb) xBb, value);
                            j3 = ((((long) this.j.a(longValue, (C7381tDb) this)) - b((C7036oDb) xBb, a5)) * 7) + ((long) (c3 - a5));
                        }
                        XBb b5 = xBb.b(j3, (DDb) C6491gDb.DAYS);
                        if (xCb != XCb.STRICT || b5.d(C6423fDb.MONTH_OF_YEAR) == ((Long) map.get(C6423fDb.MONTH_OF_YEAR)).longValue()) {
                            map.remove(this);
                            map.remove(C6423fDb.YEAR);
                            map.remove(C6423fDb.MONTH_OF_YEAR);
                            map.remove(C6423fDb.DAY_OF_WEEK);
                            return b5;
                        }
                        throw new C5687cBb("Strict mode rejected date parsed to a different month");
                    } else if (dDb == C6491gDb.YEARS) {
                        long longValue2 = ((Long) map.remove(this)).longValue();
                        XBb date = b4.date(a3, 1, 1);
                        if (xCb == XCb.LENIENT) {
                            int a6 = a((C7036oDb) date, value);
                            j2 = ((longValue2 - c(date, a6)) * 7) + ((long) (c3 - a6));
                        } else {
                            int a7 = a((C7036oDb) date, value);
                            j2 = ((((long) this.j.a(longValue2, (C7381tDb) this)) - c(date, a7)) * 7) + ((long) (c3 - a7));
                        }
                        XBb b6 = date.b(j2, (DDb) C6491gDb.DAYS);
                        if (xCb != XCb.STRICT || b6.d(C6423fDb.YEAR) == ((Long) map.get(C6423fDb.YEAR)).longValue()) {
                            map.remove(this);
                            map.remove(C6423fDb.YEAR);
                            map.remove(C6423fDb.DAY_OF_WEEK);
                            return b6;
                        }
                        throw new C5687cBb(str);
                    } else {
                        throw new IllegalStateException("unreachable");
                    }
                }
            }
        }

        public boolean a(C7036oDb odb) {
            if (odb.b(C6423fDb.DAY_OF_WEEK)) {
                DDb dDb = this.i;
                if (dDb == C6491gDb.WEEKS) {
                    return true;
                }
                if (dDb == C6491gDb.MONTHS) {
                    return odb.b(C6423fDb.DAY_OF_MONTH);
                }
                if (dDb == C6491gDb.YEARS) {
                    return odb.b(C6423fDb.DAY_OF_YEAR);
                }
                if (dDb == C6899mDb.e) {
                    return odb.b(C6423fDb.EPOCH_DAY);
                }
                if (dDb == C6491gDb.FOREVER) {
                    return odb.b(C6423fDb.EPOCH_DAY);
                }
            }
            return false;
        }
    }

    private GDb(C6351eBb ebb, int i2) {
        C6355eDb.a(ebb, "firstDayOfWeek");
        if (i2 < 1 || i2 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.d = ebb;
        this.e = i2;
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.d, this.e);
        } catch (IllegalArgumentException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid WeekFields");
            sb.append(e2.getMessage());
            throw new InvalidObjectException(sb.toString());
        }
    }

    public C6351eBb b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public C7381tDb d() {
        return this.j;
    }

    public C7381tDb e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GDb)) {
            return false;
        }
        if (hashCode() != obj.hashCode()) {
            z = false;
        }
        return z;
    }

    public C7381tDb f() {
        return this.i;
    }

    public int hashCode() {
        return (this.d.ordinal() * 7) + this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WeekFields[");
        sb.append(this.d);
        sb.append(',');
        sb.append(this.e);
        sb.append(']');
        return sb.toString();
    }

    public static GDb a(Locale locale) {
        C6355eDb.a(locale, "locale");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new Locale(locale.getLanguage(), locale.getCountry()));
        return a(C6351eBb.SUNDAY.a((long) (gregorianCalendar.getFirstDayOfWeek() - 1)), gregorianCalendar.getMinimalDaysInFirstWeek());
    }

    public static GDb a(C6351eBb ebb, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(ebb.toString());
        sb.append(i2);
        String sb2 = sb.toString();
        GDb gDb = (GDb) a.get(sb2);
        if (gDb != null) {
            return gDb;
        }
        a.putIfAbsent(sb2, new GDb(ebb, i2));
        return (GDb) a.get(sb2);
    }

    public C7381tDb a() {
        return this.f;
    }
}
