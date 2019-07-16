package defpackage;

import java.io.Serializable;
import java.util.Map;

/* renamed from: oCb reason: default package and case insensitive filesystem */
/* compiled from: IsoChronology */
public final class C7034oCb extends C6625iCb implements Serializable {
    public static final C7034oCb e = new C7034oCb();

    private C7034oCb() {
    }

    private Object readResolve() {
        return e;
    }

    public String getCalendarType() {
        return "iso8601";
    }

    public String getId() {
        return "ISO";
    }

    public boolean isLeapYear(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    public C7032oBb c(C7036oDb odb) {
        return C7032oBb.a(odb);
    }

    public C6827lBb date(int i, int i2, int i3) {
        return C6827lBb.a(i, i2, i3);
    }

    public C7103pCb eraOf(int i) {
        return C7103pCb.a(i);
    }

    public C6827lBb a(C7036oDb odb) {
        return C6827lBb.a(odb);
    }

    public TBb a(C6623iBb ibb, NBb nBb) {
        return TBb.a(ibb, nBb);
    }

    public C6827lBb a(Map<C7381tDb, Long> map, XCb xCb) {
        if (map.containsKey(C6423fDb.EPOCH_DAY)) {
            return C6827lBb.c(((Long) map.remove(C6423fDb.EPOCH_DAY)).longValue());
        }
        Long l = (Long) map.remove(C6423fDb.PROLEPTIC_MONTH);
        if (l != null) {
            if (xCb != XCb.LENIENT) {
                C6423fDb.PROLEPTIC_MONTH.b(l.longValue());
            }
            a(map, C6423fDb.MONTH_OF_YEAR, (long) (C6355eDb.a(l.longValue(), 12) + 1));
            a(map, C6423fDb.YEAR, C6355eDb.b(l.longValue(), 12));
        }
        Long l2 = (Long) map.remove(C6423fDb.YEAR_OF_ERA);
        if (l2 != null) {
            if (xCb != XCb.LENIENT) {
                C6423fDb.YEAR_OF_ERA.b(l2.longValue());
            }
            Long l3 = (Long) map.remove(C6423fDb.ERA);
            if (l3 == null) {
                Long l4 = (Long) map.get(C6423fDb.YEAR);
                if (xCb != XCb.STRICT) {
                    a(map, C6423fDb.YEAR, (l4 == null || l4.longValue() > 0) ? l2.longValue() : C6355eDb.f(1, l2.longValue()));
                } else if (l4 != null) {
                    a(map, C6423fDb.YEAR, l4.longValue() > 0 ? l2.longValue() : C6355eDb.f(1, l2.longValue()));
                } else {
                    map.put(C6423fDb.YEAR_OF_ERA, l2);
                }
            } else if (l3.longValue() == 1) {
                a(map, C6423fDb.YEAR, l2.longValue());
            } else if (l3.longValue() == 0) {
                a(map, C6423fDb.YEAR, C6355eDb.f(1, l2.longValue()));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid value for era: ");
                sb.append(l3);
                throw new C5687cBb(sb.toString());
            }
        } else if (map.containsKey(C6423fDb.ERA)) {
            C6423fDb fdb = C6423fDb.ERA;
            fdb.b(((Long) map.get(fdb)).longValue());
        }
        if (map.containsKey(C6423fDb.YEAR)) {
            String str = "Strict mode rejected date parsed to a different month";
            if (map.containsKey(C6423fDb.MONTH_OF_YEAR)) {
                if (map.containsKey(C6423fDb.DAY_OF_MONTH)) {
                    C6423fDb fdb2 = C6423fDb.YEAR;
                    int a = fdb2.a(((Long) map.remove(fdb2)).longValue());
                    int a2 = C6355eDb.a(((Long) map.remove(C6423fDb.MONTH_OF_YEAR)).longValue());
                    int a3 = C6355eDb.a(((Long) map.remove(C6423fDb.DAY_OF_MONTH)).longValue());
                    if (xCb == XCb.LENIENT) {
                        return C6827lBb.a(a, 1, 1).e((long) C6355eDb.e(a2, 1)).d((long) C6355eDb.e(a3, 1));
                    } else if (xCb != XCb.SMART) {
                        return C6827lBb.a(a, a2, a3);
                    } else {
                        C6423fDb.DAY_OF_MONTH.b((long) a3);
                        if (a2 == 4 || a2 == 6 || a2 == 9 || a2 == 11) {
                            a3 = Math.min(a3, 30);
                        } else if (a2 == 2) {
                            a3 = Math.min(a3, C7446uBb.FEBRUARY.b(IBb.a((long) a)));
                        }
                        return C6827lBb.a(a, a2, a3);
                    }
                } else if (map.containsKey(C6423fDb.ALIGNED_WEEK_OF_MONTH)) {
                    if (map.containsKey(C6423fDb.ALIGNED_DAY_OF_WEEK_IN_MONTH)) {
                        C6423fDb fdb3 = C6423fDb.YEAR;
                        int a4 = fdb3.a(((Long) map.remove(fdb3)).longValue());
                        if (xCb == XCb.LENIENT) {
                            return C6827lBb.a(a4, 1, 1).e(C6355eDb.f(((Long) map.remove(C6423fDb.MONTH_OF_YEAR)).longValue(), 1)).f(C6355eDb.f(((Long) map.remove(C6423fDb.ALIGNED_WEEK_OF_MONTH)).longValue(), 1)).d(C6355eDb.f(((Long) map.remove(C6423fDb.ALIGNED_DAY_OF_WEEK_IN_MONTH)).longValue(), 1));
                        }
                        C6423fDb fdb4 = C6423fDb.MONTH_OF_YEAR;
                        int a5 = fdb4.a(((Long) map.remove(fdb4)).longValue());
                        C6423fDb fdb5 = C6423fDb.ALIGNED_WEEK_OF_MONTH;
                        int a6 = fdb5.a(((Long) map.remove(fdb5)).longValue());
                        C6423fDb fdb6 = C6423fDb.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                        C6827lBb d = C6827lBb.a(a4, a5, 1).d((long) (((a6 - 1) * 7) + (fdb6.a(((Long) map.remove(fdb6)).longValue()) - 1)));
                        if (xCb != XCb.STRICT || d.c((C7381tDb) C6423fDb.MONTH_OF_YEAR) == a5) {
                            return d;
                        }
                        throw new C5687cBb(str);
                    } else if (map.containsKey(C6423fDb.DAY_OF_WEEK)) {
                        C6423fDb fdb7 = C6423fDb.YEAR;
                        int a7 = fdb7.a(((Long) map.remove(fdb7)).longValue());
                        if (xCb == XCb.LENIENT) {
                            return C6827lBb.a(a7, 1, 1).e(C6355eDb.f(((Long) map.remove(C6423fDb.MONTH_OF_YEAR)).longValue(), 1)).f(C6355eDb.f(((Long) map.remove(C6423fDb.ALIGNED_WEEK_OF_MONTH)).longValue(), 1)).d(C6355eDb.f(((Long) map.remove(C6423fDb.DAY_OF_WEEK)).longValue(), 1));
                        }
                        C6423fDb fdb8 = C6423fDb.MONTH_OF_YEAR;
                        int a8 = fdb8.a(((Long) map.remove(fdb8)).longValue());
                        C6423fDb fdb9 = C6423fDb.ALIGNED_WEEK_OF_MONTH;
                        int a9 = fdb9.a(((Long) map.remove(fdb9)).longValue());
                        C6423fDb fdb10 = C6423fDb.DAY_OF_WEEK;
                        C6827lBb a10 = C6827lBb.a(a7, a8, 1).f((long) (a9 - 1)).a(C7243rDb.a(C6351eBb.a(fdb10.a(((Long) map.remove(fdb10)).longValue()))));
                        if (xCb != XCb.STRICT || a10.c((C7381tDb) C6423fDb.MONTH_OF_YEAR) == a8) {
                            return a10;
                        }
                        throw new C5687cBb(str);
                    }
                }
            }
            if (map.containsKey(C6423fDb.DAY_OF_YEAR)) {
                C6423fDb fdb11 = C6423fDb.YEAR;
                int a11 = fdb11.a(((Long) map.remove(fdb11)).longValue());
                if (xCb == XCb.LENIENT) {
                    return C6827lBb.a(a11, 1).d(C6355eDb.f(((Long) map.remove(C6423fDb.DAY_OF_YEAR)).longValue(), 1));
                }
                C6423fDb fdb12 = C6423fDb.DAY_OF_YEAR;
                return C6827lBb.a(a11, fdb12.a(((Long) map.remove(fdb12)).longValue()));
            } else if (map.containsKey(C6423fDb.ALIGNED_WEEK_OF_YEAR)) {
                if (map.containsKey(C6423fDb.ALIGNED_DAY_OF_WEEK_IN_YEAR)) {
                    C6423fDb fdb13 = C6423fDb.YEAR;
                    int a12 = fdb13.a(((Long) map.remove(fdb13)).longValue());
                    if (xCb == XCb.LENIENT) {
                        return C6827lBb.a(a12, 1, 1).f(C6355eDb.f(((Long) map.remove(C6423fDb.ALIGNED_WEEK_OF_YEAR)).longValue(), 1)).d(C6355eDb.f(((Long) map.remove(C6423fDb.ALIGNED_DAY_OF_WEEK_IN_YEAR)).longValue(), 1));
                    }
                    C6423fDb fdb14 = C6423fDb.ALIGNED_WEEK_OF_YEAR;
                    int a13 = fdb14.a(((Long) map.remove(fdb14)).longValue());
                    C6423fDb fdb15 = C6423fDb.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                    C6827lBb d2 = C6827lBb.a(a12, 1, 1).d((long) (((a13 - 1) * 7) + (fdb15.a(((Long) map.remove(fdb15)).longValue()) - 1)));
                    if (xCb != XCb.STRICT || d2.c((C7381tDb) C6423fDb.YEAR) == a12) {
                        return d2;
                    }
                    throw new C5687cBb("Strict mode rejected date parsed to a different year");
                } else if (map.containsKey(C6423fDb.DAY_OF_WEEK)) {
                    C6423fDb fdb16 = C6423fDb.YEAR;
                    int a14 = fdb16.a(((Long) map.remove(fdb16)).longValue());
                    if (xCb == XCb.LENIENT) {
                        return C6827lBb.a(a14, 1, 1).f(C6355eDb.f(((Long) map.remove(C6423fDb.ALIGNED_WEEK_OF_YEAR)).longValue(), 1)).d(C6355eDb.f(((Long) map.remove(C6423fDb.DAY_OF_WEEK)).longValue(), 1));
                    }
                    C6423fDb fdb17 = C6423fDb.ALIGNED_WEEK_OF_YEAR;
                    int a15 = fdb17.a(((Long) map.remove(fdb17)).longValue());
                    C6423fDb fdb18 = C6423fDb.DAY_OF_WEEK;
                    C6827lBb a16 = C6827lBb.a(a14, 1, 1).f((long) (a15 - 1)).a(C7243rDb.a(C6351eBb.a(fdb18.a(((Long) map.remove(fdb18)).longValue()))));
                    if (xCb != XCb.STRICT || a16.c((C7381tDb) C6423fDb.YEAR) == a14) {
                        return a16;
                    }
                    throw new C5687cBb(str);
                }
            }
        }
        return null;
    }
}
