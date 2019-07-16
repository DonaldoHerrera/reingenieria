package defpackage;

import java.text.DateFormatSymbols;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: _Cb reason: default package */
/* compiled from: SimpleDateTimeTextProvider */
final class _Cb extends VCb {
    /* access modifiers changed from: private */
    public static final Comparator<Entry<String, Long>> b = new ZCb();
    private final ConcurrentMap<Entry<C7381tDb, Locale>, Object> c = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: _Cb$a */
    /* compiled from: SimpleDateTimeTextProvider */
    static final class a {
        private final Map<C5555aDb, Map<Long, String>> a;
        private final Map<C5555aDb, List<Entry<String, Long>>> b;

        a(Map<C5555aDb, Map<Long, String>> map) {
            this.a = map;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (C5555aDb adb : map.keySet()) {
                HashMap hashMap2 = new HashMap();
                for (Entry entry : ((Map) map.get(adb)).entrySet()) {
                    Object put = hashMap2.put(entry.getValue(), _Cb.b(entry.getValue(), entry.getKey()));
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.values());
                Collections.sort(arrayList2, _Cb.b);
                hashMap.put(adb, arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put(null, arrayList);
            }
            Collections.sort(arrayList, _Cb.b);
            this.b = hashMap;
        }

        /* access modifiers changed from: 0000 */
        public String a(long j, C5555aDb adb) {
            Map map = (Map) this.a.get(adb);
            if (map != null) {
                return (String) map.get(Long.valueOf(j));
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public Iterator<Entry<String, Long>> a(C5555aDb adb) {
            List list = (List) this.b.get(adb);
            if (list != null) {
                return list.iterator();
            }
            return null;
        }
    }

    _Cb() {
    }

    private Object b(C7381tDb tdb, Locale locale) {
        Entry b2 = b((A) tdb, (B) locale);
        Object obj = this.c.get(b2);
        if (obj != null) {
            return obj;
        }
        this.c.putIfAbsent(b2, a(tdb, locale));
        return this.c.get(b2);
    }

    public String a(C7381tDb tdb, long j, C5555aDb adb, Locale locale) {
        Object b2 = b(tdb, locale);
        if (b2 instanceof a) {
            return ((a) b2).a(j, adb);
        }
        return null;
    }

    public Iterator<Entry<String, Long>> a(C7381tDb tdb, C5555aDb adb, Locale locale) {
        Object b2 = b(tdb, locale);
        if (b2 instanceof a) {
            return ((a) b2).a(adb);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static <A, B> Entry<A, B> b(A a2, B b2) {
        return new SimpleImmutableEntry(a2, b2);
    }

    private Object a(C7381tDb tdb, Locale locale) {
        C7381tDb tdb2 = tdb;
        C6423fDb fdb = C6423fDb.MONTH_OF_YEAR;
        Long valueOf = Long.valueOf(4);
        Long valueOf2 = Long.valueOf(3);
        Long valueOf3 = Long.valueOf(2);
        Long valueOf4 = Long.valueOf(1);
        if (tdb2 == fdb) {
            DateFormatSymbols instance = DateFormatSymbols.getInstance(locale);
            HashMap hashMap = new HashMap();
            Long valueOf5 = Long.valueOf(5);
            Long valueOf6 = Long.valueOf(6);
            Long valueOf7 = Long.valueOf(7);
            Long valueOf8 = Long.valueOf(8);
            Long valueOf9 = Long.valueOf(9);
            Long valueOf10 = Long.valueOf(10);
            Long valueOf11 = Long.valueOf(11);
            Long valueOf12 = Long.valueOf(12);
            String[] months = instance.getMonths();
            HashMap hashMap2 = new HashMap();
            DateFormatSymbols dateFormatSymbols = instance;
            hashMap2.put(valueOf4, months[0]);
            hashMap2.put(valueOf3, months[1]);
            hashMap2.put(valueOf2, months[2]);
            hashMap2.put(valueOf, months[3]);
            hashMap2.put(valueOf5, months[4]);
            hashMap2.put(valueOf6, months[5]);
            hashMap2.put(valueOf7, months[6]);
            hashMap2.put(valueOf8, months[7]);
            hashMap2.put(valueOf9, months[8]);
            hashMap2.put(valueOf10, months[9]);
            hashMap2.put(valueOf11, months[10]);
            hashMap2.put(valueOf12, months[11]);
            hashMap.put(C5555aDb.FULL, hashMap2);
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = hashMap;
            hashMap3.put(valueOf4, months[0].substring(0, 1));
            hashMap3.put(valueOf3, months[1].substring(0, 1));
            Long l = valueOf3;
            hashMap3.put(valueOf2, months[2].substring(0, 1));
            hashMap3.put(valueOf, months[3].substring(0, 1));
            hashMap3.put(valueOf5, months[4].substring(0, 1));
            hashMap3.put(valueOf6, months[5].substring(0, 1));
            hashMap3.put(valueOf7, months[6].substring(0, 1));
            hashMap3.put(valueOf8, months[7].substring(0, 1));
            hashMap3.put(valueOf9, months[8].substring(0, 1));
            hashMap3.put(valueOf10, months[9].substring(0, 1));
            hashMap3.put(valueOf11, months[10].substring(0, 1));
            hashMap3.put(valueOf12, months[11].substring(0, 1));
            HashMap hashMap5 = hashMap4;
            hashMap5.put(C5555aDb.NARROW, hashMap3);
            String[] shortMonths = dateFormatSymbols.getShortMonths();
            HashMap hashMap6 = new HashMap();
            hashMap6.put(valueOf4, shortMonths[0]);
            hashMap6.put(l, shortMonths[1]);
            hashMap6.put(valueOf2, shortMonths[2]);
            hashMap6.put(valueOf, shortMonths[3]);
            hashMap6.put(valueOf5, shortMonths[4]);
            hashMap6.put(valueOf6, shortMonths[5]);
            hashMap6.put(valueOf7, shortMonths[6]);
            hashMap6.put(valueOf8, shortMonths[7]);
            hashMap6.put(valueOf9, shortMonths[8]);
            hashMap6.put(valueOf10, shortMonths[9]);
            hashMap6.put(valueOf11, shortMonths[10]);
            hashMap6.put(valueOf12, shortMonths[11]);
            hashMap5.put(C5555aDb.SHORT, hashMap6);
            return a(hashMap5);
        }
        Long l2 = valueOf3;
        if (tdb2 == C6423fDb.DAY_OF_WEEK) {
            DateFormatSymbols instance2 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap7 = new HashMap();
            Long valueOf13 = Long.valueOf(5);
            Long valueOf14 = Long.valueOf(6);
            Long valueOf15 = Long.valueOf(7);
            String[] weekdays = instance2.getWeekdays();
            HashMap hashMap8 = new HashMap();
            hashMap8.put(valueOf4, weekdays[2]);
            hashMap8.put(l2, weekdays[3]);
            hashMap8.put(valueOf2, weekdays[4]);
            hashMap8.put(valueOf, weekdays[5]);
            hashMap8.put(valueOf13, weekdays[6]);
            hashMap8.put(valueOf14, weekdays[7]);
            hashMap8.put(valueOf15, weekdays[1]);
            hashMap7.put(C5555aDb.FULL, hashMap8);
            HashMap hashMap9 = new HashMap();
            hashMap9.put(valueOf4, weekdays[2].substring(0, 1));
            hashMap9.put(l2, weekdays[3].substring(0, 1));
            hashMap9.put(valueOf2, weekdays[4].substring(0, 1));
            hashMap9.put(valueOf, weekdays[5].substring(0, 1));
            hashMap9.put(valueOf13, weekdays[6].substring(0, 1));
            hashMap9.put(valueOf14, weekdays[7].substring(0, 1));
            hashMap9.put(valueOf15, weekdays[1].substring(0, 1));
            hashMap7.put(C5555aDb.NARROW, hashMap9);
            String[] shortWeekdays = instance2.getShortWeekdays();
            HashMap hashMap10 = new HashMap();
            hashMap10.put(valueOf4, shortWeekdays[2]);
            hashMap10.put(l2, shortWeekdays[3]);
            hashMap10.put(valueOf2, shortWeekdays[4]);
            hashMap10.put(valueOf, shortWeekdays[5]);
            hashMap10.put(valueOf13, shortWeekdays[6]);
            hashMap10.put(valueOf14, shortWeekdays[7]);
            hashMap10.put(valueOf15, shortWeekdays[1]);
            hashMap7.put(C5555aDb.SHORT, hashMap10);
            return a(hashMap7);
        } else if (tdb2 == C6423fDb.AMPM_OF_DAY) {
            DateFormatSymbols instance3 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap11 = new HashMap();
            String[] amPmStrings = instance3.getAmPmStrings();
            HashMap hashMap12 = new HashMap();
            hashMap12.put(Long.valueOf(0), amPmStrings[0]);
            hashMap12.put(valueOf4, amPmStrings[1]);
            hashMap11.put(C5555aDb.FULL, hashMap12);
            hashMap11.put(C5555aDb.SHORT, hashMap12);
            return a(hashMap11);
        } else if (tdb2 == C6423fDb.ERA) {
            DateFormatSymbols instance4 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap13 = new HashMap();
            String[] eras = instance4.getEras();
            HashMap hashMap14 = new HashMap();
            hashMap14.put(Long.valueOf(0), eras[0]);
            hashMap14.put(valueOf4, eras[1]);
            hashMap13.put(C5555aDb.SHORT, hashMap14);
            if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                HashMap hashMap15 = new HashMap();
                hashMap15.put(Long.valueOf(0), "Before Christ");
                hashMap15.put(valueOf4, "Anno Domini");
                hashMap13.put(C5555aDb.FULL, hashMap15);
            } else {
                hashMap13.put(C5555aDb.FULL, hashMap14);
            }
            HashMap hashMap16 = new HashMap();
            hashMap16.put(Long.valueOf(0), eras[0].substring(0, 1));
            hashMap16.put(valueOf4, eras[1].substring(0, 1));
            hashMap13.put(C5555aDb.NARROW, hashMap16);
            return a(hashMap13);
        } else if (tdb2 != C6899mDb.b) {
            return "";
        } else {
            HashMap hashMap17 = new HashMap();
            HashMap hashMap18 = new HashMap();
            hashMap18.put(valueOf4, "Q1");
            hashMap18.put(l2, "Q2");
            hashMap18.put(valueOf2, "Q3");
            hashMap18.put(valueOf, "Q4");
            hashMap17.put(C5555aDb.SHORT, hashMap18);
            HashMap hashMap19 = new HashMap();
            hashMap19.put(valueOf4, "1st quarter");
            hashMap19.put(l2, "2nd quarter");
            hashMap19.put(valueOf2, "3rd quarter");
            hashMap19.put(valueOf, "4th quarter");
            hashMap17.put(C5555aDb.FULL, hashMap19);
            return a(hashMap17);
        }
    }

    private static a a(Map<C5555aDb, Map<Long, String>> map) {
        map.put(C5555aDb.FULL_STANDALONE, map.get(C5555aDb.FULL));
        map.put(C5555aDb.SHORT_STANDALONE, map.get(C5555aDb.SHORT));
        if (map.containsKey(C5555aDb.NARROW) && !map.containsKey(C5555aDb.NARROW_STANDALONE)) {
            map.put(C5555aDb.NARROW_STANDALONE, map.get(C5555aDb.NARROW));
        }
        return new a(map);
    }
}
