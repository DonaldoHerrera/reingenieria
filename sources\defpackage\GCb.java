package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: GCb reason: default package */
/* compiled from: DateTimeBuilder */
final class GCb extends C6287dDb implements C7036oDb, Cloneable {
    final Map<C7381tDb, Long> a = new HashMap();
    C6625iCb b;
    NBb c;
    XBb d;
    C7239rBb e;
    boolean f;
    EBb g;

    private void J() {
        if (this.a.size() > 0) {
            XBb xBb = this.d;
            if (xBb != null) {
                C7239rBb rbb = this.e;
                if (rbb != null) {
                    a((C7036oDb) xBb.a(rbb));
                    return;
                }
            }
            XBb xBb2 = this.d;
            if (xBb2 != null) {
                a((C7036oDb) xBb2);
                return;
            }
            C7239rBb rbb2 = this.e;
            if (rbb2 != null) {
                a((C7036oDb) rbb2);
            }
        }
    }

    private void K() {
        if (this.a.containsKey(C6423fDb.INSTANT_SECONDS)) {
            NBb nBb = this.c;
            if (nBb != null) {
                a(nBb);
                return;
            }
            Long l = (Long) this.a.get(C6423fDb.OFFSET_SECONDS);
            if (l != null) {
                a((NBb) PBb.a(l.intValue()));
            }
        }
    }

    private void L() {
        if (this.e != null) {
            return;
        }
        if (!this.a.containsKey(C6423fDb.INSTANT_SECONDS) && !this.a.containsKey(C6423fDb.SECOND_OF_DAY) && !this.a.containsKey(C6423fDb.SECOND_OF_MINUTE)) {
            return;
        }
        if (this.a.containsKey(C6423fDb.NANO_OF_SECOND)) {
            long longValue = ((Long) this.a.get(C6423fDb.NANO_OF_SECOND)).longValue();
            this.a.put(C6423fDb.MICRO_OF_SECOND, Long.valueOf(longValue / 1000));
            this.a.put(C6423fDb.MILLI_OF_SECOND, Long.valueOf(longValue / 1000000));
            return;
        }
        this.a.put(C6423fDb.NANO_OF_SECOND, Long.valueOf(0));
        this.a.put(C6423fDb.MICRO_OF_SECOND, Long.valueOf(0));
        this.a.put(C6423fDb.MILLI_OF_SECOND, Long.valueOf(0));
    }

    private void M() {
        if (this.d != null && this.e != null) {
            Long l = (Long) this.a.get(C6423fDb.OFFSET_SECONDS);
            if (l != null) {
                this.a.put(C6423fDb.INSTANT_SECONDS, Long.valueOf(this.d.a(this.e).a((NBb) PBb.a(l.intValue())).d(C6423fDb.INSTANT_SECONDS)));
            } else if (this.c != null) {
                this.a.put(C6423fDb.INSTANT_SECONDS, Long.valueOf(this.d.a(this.e).a(this.c).d(C6423fDb.INSTANT_SECONDS)));
            }
        }
    }

    private GCb c(C7381tDb tdb, long j) {
        this.a.put(tdb, Long.valueOf(j));
        return this;
    }

    private void d(XCb xCb) {
        Long l = (Long) this.a.get(C6423fDb.HOUR_OF_DAY);
        Long l2 = (Long) this.a.get(C6423fDb.MINUTE_OF_HOUR);
        Long l3 = (Long) this.a.get(C6423fDb.SECOND_OF_MINUTE);
        Long l4 = (Long) this.a.get(C6423fDb.NANO_OF_SECOND);
        if (l != null) {
            if (l2 == null && (l3 != null || l4 != null)) {
                return;
            }
            if (l2 == null || l3 != null || l4 == null) {
                if (xCb != XCb.LENIENT) {
                    if (l != null) {
                        if (xCb == XCb.SMART && l.longValue() == 24 && ((l2 == null || l2.longValue() == 0) && ((l3 == null || l3.longValue() == 0) && (l4 == null || l4.longValue() == 0)))) {
                            l = Long.valueOf(0);
                            this.g = EBb.a(1);
                        }
                        int a2 = C6423fDb.HOUR_OF_DAY.a(l.longValue());
                        if (l2 != null) {
                            int a3 = C6423fDb.MINUTE_OF_HOUR.a(l2.longValue());
                            if (l3 != null) {
                                int a4 = C6423fDb.SECOND_OF_MINUTE.a(l3.longValue());
                                if (l4 != null) {
                                    a(C7239rBb.a(a2, a3, a4, C6423fDb.NANO_OF_SECOND.a(l4.longValue())));
                                } else {
                                    a(C7239rBb.a(a2, a3, a4));
                                }
                            } else if (l4 == null) {
                                a(C7239rBb.a(a2, a3));
                            }
                        } else if (l3 == null && l4 == null) {
                            a(C7239rBb.a(a2, 0));
                        }
                    }
                } else if (l != null) {
                    long longValue = l.longValue();
                    if (l2 == null) {
                        int a5 = C6355eDb.a(C6355eDb.b(longValue, 24));
                        a(C7239rBb.a((int) ((long) C6355eDb.a(longValue, 24)), 0));
                        this.g = EBb.a(a5);
                    } else if (l3 != null) {
                        if (l4 == null) {
                            l4 = Long.valueOf(0);
                        }
                        long d2 = C6355eDb.d(C6355eDb.d(C6355eDb.d(C6355eDb.e(longValue, 3600000000000L), C6355eDb.e(l2.longValue(), 60000000000L)), C6355eDb.e(l3.longValue(), 1000000000)), l4.longValue());
                        int b2 = (int) C6355eDb.b(d2, 86400000000000L);
                        a(C7239rBb.a(C6355eDb.c(d2, 86400000000000L)));
                        this.g = EBb.a(b2);
                    } else {
                        long d3 = C6355eDb.d(C6355eDb.e(longValue, 3600), C6355eDb.e(l2.longValue(), 60));
                        int b3 = (int) C6355eDb.b(d3, 86400);
                        a(C7239rBb.b(C6355eDb.c(d3, 86400)));
                        this.g = EBb.a(b3);
                    }
                }
                this.a.remove(C6423fDb.HOUR_OF_DAY);
                this.a.remove(C6423fDb.MINUTE_OF_HOUR);
                this.a.remove(C6423fDb.SECOND_OF_MINUTE);
                this.a.remove(C6423fDb.NANO_OF_SECOND);
            }
        }
    }

    private Long e(C7381tDb tdb) {
        return (Long) this.a.get(tdb);
    }

    /* access modifiers changed from: 0000 */
    public void a(XBb xBb) {
        this.d = xBb;
    }

    /* access modifiers changed from: 0000 */
    public GCb b(C7381tDb tdb, long j) {
        C6355eDb.a(tdb, "field");
        Long e2 = e(tdb);
        if (e2 == null || e2.longValue() == j) {
            c(tdb, j);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Conflict found: ");
        sb.append(tdb);
        String str = " ";
        sb.append(str);
        sb.append(e2);
        sb.append(" differs from ");
        sb.append(tdb);
        sb.append(str);
        sb.append(j);
        sb.append(": ");
        sb.append(this);
        throw new C5687cBb(sb.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("DateTimeBuilder[");
        if (this.a.size() > 0) {
            sb.append("fields=");
            sb.append(this.a);
        }
        String str = ", ";
        sb.append(str);
        sb.append(this.b);
        sb.append(str);
        sb.append(this.c);
        sb.append(str);
        sb.append(this.d);
        sb.append(str);
        sb.append(this.e);
        sb.append(']');
        return sb.toString();
    }

    private boolean c(XCb xCb) {
        int i = 0;
        loop0:
        while (i < 100) {
            for (Entry key : this.a.entrySet()) {
                C7381tDb tdb = (C7381tDb) key.getKey();
                Object a2 = tdb.a(this.a, this, xCb);
                if (a2 != null) {
                    if (a2 instanceof C6353eCb) {
                        C6353eCb ecb = (C6353eCb) a2;
                        NBb nBb = this.c;
                        if (nBb == null) {
                            this.c = ecb.getZone();
                        } else if (!nBb.equals(ecb.getZone())) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("ChronoZonedDateTime must use the effective parsed zone: ");
                            sb.append(this.c);
                            throw new C5687cBb(sb.toString());
                        }
                        a2 = ecb.toLocalDateTime();
                    }
                    if (a2 instanceof XBb) {
                        a(tdb, (XBb) a2);
                    } else if (a2 instanceof C7239rBb) {
                        a(tdb, (C7239rBb) a2);
                    } else if (a2 instanceof ZBb) {
                        ZBb zBb = (ZBb) a2;
                        a(tdb, zBb.toLocalDate());
                        a(tdb, zBb.toLocalTime());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unknown type: ");
                        sb2.append(a2.getClass().getName());
                        throw new C5687cBb(sb2.toString());
                    }
                } else if (!this.a.containsKey(tdb)) {
                }
                i++;
            }
        }
        if (i == 100) {
            throw new C5687cBb("Badly written field");
        } else if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(C7239rBb rbb) {
        this.e = rbb;
    }

    public GCb a(XCb xCb, Set<C7381tDb> set) {
        if (set != null) {
            this.a.keySet().retainAll(set);
        }
        K();
        a(xCb);
        b(xCb);
        if (c(xCb)) {
            K();
            a(xCb);
            b(xCb);
        }
        d(xCb);
        J();
        EBb eBb = this.g;
        if (eBb != null && !eBb.a()) {
            XBb xBb = this.d;
            if (!(xBb == null || this.e == null)) {
                this.d = xBb.a((C7312sDb) this.g);
                this.g = EBb.a;
            }
        }
        L();
        M();
        return this;
    }

    private void b(XCb xCb) {
        long j = 0;
        if (this.a.containsKey(C6423fDb.CLOCK_HOUR_OF_DAY)) {
            long longValue = ((Long) this.a.remove(C6423fDb.CLOCK_HOUR_OF_DAY)).longValue();
            if (!(xCb == XCb.LENIENT || (xCb == XCb.SMART && longValue == 0))) {
                C6423fDb.CLOCK_HOUR_OF_DAY.b(longValue);
            }
            C6423fDb fdb = C6423fDb.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            b(fdb, longValue);
        }
        if (this.a.containsKey(C6423fDb.CLOCK_HOUR_OF_AMPM)) {
            long longValue2 = ((Long) this.a.remove(C6423fDb.CLOCK_HOUR_OF_AMPM)).longValue();
            if (!(xCb == XCb.LENIENT || (xCb == XCb.SMART && longValue2 == 0))) {
                C6423fDb.CLOCK_HOUR_OF_AMPM.b(longValue2);
            }
            C6423fDb fdb2 = C6423fDb.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j = longValue2;
            }
            b(fdb2, j);
        }
        if (xCb != XCb.LENIENT) {
            if (this.a.containsKey(C6423fDb.AMPM_OF_DAY)) {
                C6423fDb fdb3 = C6423fDb.AMPM_OF_DAY;
                fdb3.b(((Long) this.a.get(fdb3)).longValue());
            }
            if (this.a.containsKey(C6423fDb.HOUR_OF_AMPM)) {
                C6423fDb fdb4 = C6423fDb.HOUR_OF_AMPM;
                fdb4.b(((Long) this.a.get(fdb4)).longValue());
            }
        }
        if (this.a.containsKey(C6423fDb.AMPM_OF_DAY) && this.a.containsKey(C6423fDb.HOUR_OF_AMPM)) {
            long longValue3 = ((Long) this.a.remove(C6423fDb.AMPM_OF_DAY)).longValue();
            b(C6423fDb.HOUR_OF_DAY, (longValue3 * 12) + ((Long) this.a.remove(C6423fDb.HOUR_OF_AMPM)).longValue());
        }
        if (this.a.containsKey(C6423fDb.NANO_OF_DAY)) {
            long longValue4 = ((Long) this.a.remove(C6423fDb.NANO_OF_DAY)).longValue();
            if (xCb != XCb.LENIENT) {
                C6423fDb.NANO_OF_DAY.b(longValue4);
            }
            b(C6423fDb.SECOND_OF_DAY, longValue4 / 1000000000);
            b(C6423fDb.NANO_OF_SECOND, longValue4 % 1000000000);
        }
        if (this.a.containsKey(C6423fDb.MICRO_OF_DAY)) {
            long longValue5 = ((Long) this.a.remove(C6423fDb.MICRO_OF_DAY)).longValue();
            if (xCb != XCb.LENIENT) {
                C6423fDb.MICRO_OF_DAY.b(longValue5);
            }
            b(C6423fDb.SECOND_OF_DAY, longValue5 / 1000000);
            b(C6423fDb.MICRO_OF_SECOND, longValue5 % 1000000);
        }
        if (this.a.containsKey(C6423fDb.MILLI_OF_DAY)) {
            long longValue6 = ((Long) this.a.remove(C6423fDb.MILLI_OF_DAY)).longValue();
            if (xCb != XCb.LENIENT) {
                C6423fDb.MILLI_OF_DAY.b(longValue6);
            }
            b(C6423fDb.SECOND_OF_DAY, longValue6 / 1000);
            b(C6423fDb.MILLI_OF_SECOND, longValue6 % 1000);
        }
        if (this.a.containsKey(C6423fDb.SECOND_OF_DAY)) {
            long longValue7 = ((Long) this.a.remove(C6423fDb.SECOND_OF_DAY)).longValue();
            if (xCb != XCb.LENIENT) {
                C6423fDb.SECOND_OF_DAY.b(longValue7);
            }
            b(C6423fDb.HOUR_OF_DAY, longValue7 / 3600);
            b(C6423fDb.MINUTE_OF_HOUR, (longValue7 / 60) % 60);
            b(C6423fDb.SECOND_OF_MINUTE, longValue7 % 60);
        }
        if (this.a.containsKey(C6423fDb.MINUTE_OF_DAY)) {
            long longValue8 = ((Long) this.a.remove(C6423fDb.MINUTE_OF_DAY)).longValue();
            if (xCb != XCb.LENIENT) {
                C6423fDb.MINUTE_OF_DAY.b(longValue8);
            }
            b(C6423fDb.HOUR_OF_DAY, longValue8 / 60);
            b(C6423fDb.MINUTE_OF_HOUR, longValue8 % 60);
        }
        if (xCb != XCb.LENIENT) {
            if (this.a.containsKey(C6423fDb.MILLI_OF_SECOND)) {
                C6423fDb fdb5 = C6423fDb.MILLI_OF_SECOND;
                fdb5.b(((Long) this.a.get(fdb5)).longValue());
            }
            if (this.a.containsKey(C6423fDb.MICRO_OF_SECOND)) {
                C6423fDb fdb6 = C6423fDb.MICRO_OF_SECOND;
                fdb6.b(((Long) this.a.get(fdb6)).longValue());
            }
        }
        if (this.a.containsKey(C6423fDb.MILLI_OF_SECOND) && this.a.containsKey(C6423fDb.MICRO_OF_SECOND)) {
            b(C6423fDb.MICRO_OF_SECOND, (((Long) this.a.remove(C6423fDb.MILLI_OF_SECOND)).longValue() * 1000) + (((Long) this.a.get(C6423fDb.MICRO_OF_SECOND)).longValue() % 1000));
        }
        if (this.a.containsKey(C6423fDb.MICRO_OF_SECOND) && this.a.containsKey(C6423fDb.NANO_OF_SECOND)) {
            b(C6423fDb.MICRO_OF_SECOND, ((Long) this.a.get(C6423fDb.NANO_OF_SECOND)).longValue() / 1000);
            this.a.remove(C6423fDb.MICRO_OF_SECOND);
        }
        if (this.a.containsKey(C6423fDb.MILLI_OF_SECOND) && this.a.containsKey(C6423fDb.NANO_OF_SECOND)) {
            b(C6423fDb.MILLI_OF_SECOND, ((Long) this.a.get(C6423fDb.NANO_OF_SECOND)).longValue() / 1000000);
            this.a.remove(C6423fDb.MILLI_OF_SECOND);
        }
        if (this.a.containsKey(C6423fDb.MICRO_OF_SECOND)) {
            b(C6423fDb.NANO_OF_SECOND, ((Long) this.a.remove(C6423fDb.MICRO_OF_SECOND)).longValue() * 1000);
        } else if (this.a.containsKey(C6423fDb.MILLI_OF_SECOND)) {
            b(C6423fDb.NANO_OF_SECOND, ((Long) this.a.remove(C6423fDb.MILLI_OF_SECOND)).longValue() * 1000000);
        }
    }

    private void a(C7381tDb tdb, XBb xBb) {
        if (this.b.equals(xBb.getChronology())) {
            long epochDay = xBb.toEpochDay();
            Long l = (Long) this.a.put(C6423fDb.EPOCH_DAY, Long.valueOf(epochDay));
            if (l != null && l.longValue() != epochDay) {
                StringBuilder sb = new StringBuilder();
                sb.append("Conflict found: ");
                sb.append(C6827lBb.c(l.longValue()));
                sb.append(" differs from ");
                sb.append(C6827lBb.c(epochDay));
                sb.append(" while resolving  ");
                sb.append(tdb);
                throw new C5687cBb(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChronoLocalDate must use the effective parsed chronology: ");
        sb2.append(this.b);
        throw new C5687cBb(sb2.toString());
    }

    private void a(C7381tDb tdb, C7239rBb rbb) {
        long M = rbb.M();
        Long l = (Long) this.a.put(C6423fDb.NANO_OF_DAY, Long.valueOf(M));
        if (l != null && l.longValue() != M) {
            StringBuilder sb = new StringBuilder();
            sb.append("Conflict found: ");
            sb.append(C7239rBb.a(l.longValue()));
            sb.append(" differs from ");
            sb.append(rbb);
            sb.append(" while resolving  ");
            sb.append(tdb);
            throw new C5687cBb(sb.toString());
        }
    }

    private void a(XCb xCb) {
        if (this.b instanceof C7034oCb) {
            a(C7034oCb.e.a(this.a, xCb));
        } else if (this.a.containsKey(C6423fDb.EPOCH_DAY)) {
            a(C6827lBb.c(((Long) this.a.remove(C6423fDb.EPOCH_DAY)).longValue()));
        }
    }

    private void a(C6827lBb lbb) {
        if (lbb != null) {
            a((XBb) lbb);
            for (C7381tDb tdb : this.a.keySet()) {
                if ((tdb instanceof C6423fDb) && tdb.isDateBased()) {
                    try {
                        long d2 = lbb.d(tdb);
                        Long l = (Long) this.a.get(tdb);
                        if (d2 != l.longValue()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Conflict found: Field ");
                            sb.append(tdb);
                            String str = " ";
                            sb.append(str);
                            sb.append(d2);
                            sb.append(" differs from ");
                            sb.append(tdb);
                            sb.append(str);
                            sb.append(l);
                            sb.append(" derived from ");
                            sb.append(lbb);
                            throw new C5687cBb(sb.toString());
                        }
                    } catch (C5687cBb unused) {
                        continue;
                    }
                }
            }
        }
    }

    private void a(NBb nBb) {
        C6353eCb a2 = this.b.a(C6623iBb.b(((Long) this.a.remove(C6423fDb.INSTANT_SECONDS)).longValue()), nBb);
        if (this.d == null) {
            a(a2.toLocalDate());
        } else {
            a((C7381tDb) C6423fDb.INSTANT_SECONDS, a2.toLocalDate());
        }
        b(C6423fDb.SECOND_OF_DAY, (long) a2.toLocalTime().N());
    }

    public long d(C7381tDb tdb) {
        C6355eDb.a(tdb, "field");
        Long e2 = e(tdb);
        if (e2 != null) {
            return e2.longValue();
        }
        XBb xBb = this.d;
        if (xBb != null && xBb.b(tdb)) {
            return this.d.d(tdb);
        }
        C7239rBb rbb = this.e;
        if (rbb != null && rbb.b(tdb)) {
            return this.e.d(tdb);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Field not found: ");
        sb.append(tdb);
        throw new C5687cBb(sb.toString());
    }

    private void a(C7036oDb odb) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            C7381tDb tdb = (C7381tDb) entry.getKey();
            long longValue = ((Long) entry.getValue()).longValue();
            if (odb.b(tdb)) {
                try {
                    long d2 = odb.d(tdb);
                    if (d2 == longValue) {
                        it.remove();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cross check failed: ");
                        sb.append(tdb);
                        String str = " ";
                        sb.append(str);
                        sb.append(d2);
                        sb.append(" vs ");
                        sb.append(tdb);
                        sb.append(str);
                        sb.append(longValue);
                        throw new C5687cBb(sb.toString());
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public <R> R a(CDb<R> cDb) {
        if (cDb == BDb.g()) {
            return this.c;
        }
        if (cDb == BDb.a()) {
            return this.b;
        }
        R r = null;
        if (cDb == BDb.b()) {
            XBb xBb = this.d;
            if (xBb != null) {
                r = C6827lBb.a((C7036oDb) xBb);
            }
            return r;
        } else if (cDb == BDb.c()) {
            return this.e;
        } else {
            if (cDb == BDb.f() || cDb == BDb.d()) {
                return cDb.a(this);
            }
            if (cDb == BDb.e()) {
                return null;
            }
            return cDb.a(this);
        }
    }

    public <R> R b(CDb<R> cDb) {
        return cDb.a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r1.b(r3) != false) goto L_0x0020;
     */
    public boolean b(C7381tDb tdb) {
        boolean z = false;
        if (tdb == null) {
            return false;
        }
        if (!this.a.containsKey(tdb)) {
            XBb xBb = this.d;
            if (xBb == null || !xBb.b(tdb)) {
                C7239rBb rbb = this.e;
                if (rbb != null) {
                }
                return z;
            }
        }
        z = true;
        return z;
    }
}
