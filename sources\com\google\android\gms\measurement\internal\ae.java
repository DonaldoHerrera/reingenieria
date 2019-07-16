package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C0920aa;
import com.google.android.gms.internal.measurement.D;
import com.google.android.gms.internal.measurement.E;
import com.google.android.gms.internal.measurement.F;
import com.google.android.gms.internal.measurement.F.b;
import com.google.android.gms.internal.measurement.G;
import com.google.android.gms.internal.measurement.H;
import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.internal.measurement.P.a;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.internal.measurement.S;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.measurement.Z;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final class ae extends Ld {
    ae(Kd kd) {
        super(kd);
    }

    private static void b(Map<Integer, List<Long>> map, int i, long j) {
        List list = (List) map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList();
            map.put(Integer.valueOf(i), list);
        }
        list.add(Long.valueOf(j / 1000));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0cf2, code lost:
        if (r0.r() == false) goto L_0x0cfd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0cf4, code lost:
        r8 = java.lang.Integer.valueOf(r0.p());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0cfd, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0cfe, code lost:
        r1.a("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r8));
        r14.add(java.lang.Integer.valueOf(r5));
        r11 = r72;
        r1 = r73;
        r46 = r4;
        r47 = r7;
        r0 = r16;
        r3 = r17;
        r15 = r37;
        r68 = r43;
        r24 = r44;
        r69 = r48;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x05c0  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x064a  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x066b  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x075b  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x09e1  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0d60  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01da  */
    public final List<P> a(String str, List<S> list, List<C0920aa> list2) {
        Long l;
        Map f;
        Iterator it;
        T t;
        a aVar;
        Iterator it2;
        T t2;
        T t3;
        Collection collection;
        Iterable iterable;
        Iterator it3;
        T t4;
        Map map;
        T t5;
        Map map2;
        T t6;
        T t7;
        String str2;
        String str3;
        T t8;
        Map map3;
        T t9;
        T t10;
        Object obj;
        Object obj2;
        long j;
        boolean z;
        List list3;
        T t11;
        Long l2;
        S s;
        String str4;
        S s2;
        String str5;
        C1107f b;
        HashSet hashSet;
        String str6;
        T t12;
        T t13;
        T t14;
        T t15;
        S s3;
        C1107f fVar;
        String str7;
        T t16;
        String str8;
        Map map4;
        Iterator it4;
        Map map5;
        long j2;
        BitSet bitSet;
        Map map6;
        T t17;
        T t18;
        Iterator it5;
        Map map7;
        BitSet bitSet2;
        BitSet bitSet3;
        HashSet hashSet2;
        long j3;
        BitSet bitSet4;
        T t19;
        String str9;
        T t20;
        String str10;
        String str11;
        T t21;
        T t22;
        T t23;
        T t24;
        C1107f fVar2;
        T t25;
        Map map8;
        String str12;
        String str13;
        Map map9;
        BitSet bitSet5;
        String str14;
        String str15;
        T t26;
        String str16;
        Object obj3;
        C1107f fVar3;
        C1107f fVar4;
        S s4;
        String str17;
        String str18;
        T t27;
        String str19;
        Long l3;
        S s5;
        long j4;
        S s6;
        String str20;
        ArrayList arrayList;
        Map map10;
        Iterator it6;
        Iterator it7;
        Map map11;
        T t28;
        T t29;
        T t30;
        T t31;
        boolean z2;
        Iterator it8;
        Map map12;
        Object obj4;
        ae aeVar;
        Iterator it9;
        Map map13;
        he o;
        String str21 = str;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        HashSet hashSet3 = new HashSet();
        T t32 = new T();
        T t33 = new T();
        T t34 = new T();
        T t35 = new T();
        T t36 = new T();
        boolean i = f().i(str21);
        boolean d = f().d(str21, C1127j.wa);
        boolean d2 = f().d(str21, C1127j.Ea);
        boolean d3 = f().d(str21, C1127j.Fa);
        if (d2 || d3) {
            Iterator it10 = list.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    break;
                }
                S s7 = (S) it10.next();
                if ("_s".equals(s7.q())) {
                    l = Long.valueOf(s7.r());
                    break;
                }
            }
            if (l != null && d3) {
                o = o();
                o.s();
                o.i();
                Preconditions.checkNotEmpty(str);
                ContentValues contentValues = new ContentValues();
                contentValues.put("current_session_count", Integer.valueOf(0));
                o.w().update("events", contentValues, "app_id = ?", new String[]{str21});
            }
            f = o().f(str21);
            if (f != null && !f.isEmpty()) {
                HashSet hashSet4 = new HashSet(f.keySet());
                if (d2 || l == null) {
                    map10 = f;
                } else {
                    ae n = n();
                    Preconditions.checkNotEmpty(str);
                    Preconditions.checkNotNull(f);
                    map10 = new T();
                    if (!f.isEmpty()) {
                        Map e = n.o().e(str21);
                        Iterator it11 = f.keySet().iterator();
                        while (it11.hasNext()) {
                            int intValue = ((Integer) it11.next()).intValue();
                            Y y = (Y) f.get(Integer.valueOf(intValue));
                            List list4 = (List) e.get(Integer.valueOf(intValue));
                            if (list4 == null || list4.isEmpty()) {
                                aeVar = n;
                                map13 = e;
                                it9 = it11;
                                map10.put(Integer.valueOf(intValue), y);
                            } else {
                                map13 = e;
                                it9 = it11;
                                List a = n.m().a(y.r(), list4);
                                if (!a.isEmpty()) {
                                    Y.a aVar2 = (Y.a) y.l();
                                    aVar2.l();
                                    aVar2.b((Iterable<? extends Long>) a);
                                    aeVar = n;
                                    List a2 = n.m().a(y.p(), list4);
                                    aVar2.k();
                                    aVar2.a((Iterable<? extends Long>) a2);
                                    for (int i2 = 0; i2 < y.u(); i2++) {
                                        if (list4.contains(Integer.valueOf(y.b(i2).p()))) {
                                            aVar2.a(i2);
                                        }
                                    }
                                    for (int i3 = 0; i3 < y.y(); i3++) {
                                        if (list4.contains(Integer.valueOf(y.c(i3).p()))) {
                                            aVar2.b(i3);
                                        }
                                    }
                                    map10.put(Integer.valueOf(intValue), (Y) aVar2.w());
                                } else {
                                    e = map13;
                                    it11 = it9;
                                }
                            }
                            e = map13;
                            it11 = it9;
                            n = aeVar;
                        }
                    }
                }
                it6 = hashSet4.iterator();
                while (it6.hasNext()) {
                    int intValue2 = ((Integer) it6.next()).intValue();
                    Y y2 = (Y) map10.get(Integer.valueOf(intValue2));
                    BitSet bitSet6 = (BitSet) t33.get(Integer.valueOf(intValue2));
                    BitSet bitSet7 = (BitSet) t34.get(Integer.valueOf(intValue2));
                    if (i) {
                        t28 = new T();
                        if (!(y2 == null || y2.u() == 0)) {
                            for (Q q : y2.t()) {
                                if (q.q()) {
                                    it8 = it6;
                                    Integer valueOf = Integer.valueOf(q.p());
                                    if (q.r()) {
                                        Object valueOf2 = Long.valueOf(q.s());
                                        map12 = map10;
                                        obj4 = valueOf2;
                                    } else {
                                        map12 = map10;
                                        obj4 = null;
                                    }
                                    t28.put(valueOf, obj4);
                                } else {
                                    it8 = it6;
                                    map12 = map10;
                                }
                                map10 = map12;
                                it6 = it8;
                            }
                        }
                        it7 = it6;
                        map11 = map10;
                        t35.put(Integer.valueOf(intValue2), t28);
                    } else {
                        it7 = it6;
                        map11 = map10;
                        t28 = null;
                    }
                    if (bitSet6 == null) {
                        bitSet6 = new BitSet();
                        t33.put(Integer.valueOf(intValue2), bitSet6);
                        bitSet7 = new BitSet();
                        t34.put(Integer.valueOf(intValue2), bitSet7);
                    }
                    if (y2 != null) {
                        int i4 = 0;
                        while (i4 < (y2.q() << 6)) {
                            if (Rd.a(y2.p(), i4)) {
                                t31 = t34;
                                t30 = t35;
                                t29 = t33;
                                e().A().a("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue2), Integer.valueOf(i4));
                                bitSet7.set(i4);
                                if (Rd.a(y2.r(), i4)) {
                                    bitSet6.set(i4);
                                    z2 = true;
                                    if (t28 != null && !z2) {
                                        t28.remove(Integer.valueOf(i4));
                                    }
                                    i4++;
                                    t34 = t31;
                                    t35 = t30;
                                    t33 = t29;
                                }
                            } else {
                                t31 = t34;
                                t30 = t35;
                                t29 = t33;
                            }
                            z2 = false;
                            t28.remove(Integer.valueOf(i4));
                            i4++;
                            t34 = t31;
                            t35 = t30;
                            t33 = t29;
                        }
                    }
                    T t37 = t34;
                    T t38 = t35;
                    T t39 = t33;
                    a y3 = P.y();
                    y3.a(false);
                    if (d2) {
                        y3.a((Y) f.get(Integer.valueOf(intValue2)));
                    } else {
                        y3.a(y2);
                    }
                    Y.a z3 = Y.z();
                    z3.b((Iterable<? extends Long>) Rd.a(bitSet6));
                    z3.a((Iterable<? extends Long>) Rd.a(bitSet7));
                    if (i) {
                        z3.c(a(t28));
                        t36.put(Integer.valueOf(intValue2), new T());
                    }
                    y3.a(z3);
                    t32.put(Integer.valueOf(intValue2), (P) y3.w());
                    t34 = t37;
                    map10 = map11;
                    t35 = t38;
                    it6 = it7;
                    t33 = t39;
                }
            }
            T t40 = t34;
            T t41 = t35;
            T t42 = t33;
            String str22 = "Filter definition";
            String str23 = "Skipping failed audience ID";
            Object obj5 = "null";
            if (!list.isEmpty()) {
                T t43 = new T();
                long j5 = 0;
                S s8 = null;
                Long l4 = null;
                for (S s9 : list) {
                    String q2 = s9.q();
                    List<U> s10 = s9.s();
                    m();
                    String str24 = "_eid";
                    Long l5 = (Long) Rd.b(s9, str24);
                    boolean z4 = l5 != null;
                    if (z4) {
                        j = j5;
                        if (q2.equals("_ep")) {
                            z = true;
                            if (!z) {
                                m();
                                String str25 = (String) Rd.b(s9, "_en");
                                if (TextUtils.isEmpty(str25)) {
                                    e().s().a("Extra parameter without an event name. eventId", l5);
                                    t27 = t43;
                                    str19 = str23;
                                } else {
                                    if (s8 == null || l4 == null || l5.longValue() != l4.longValue()) {
                                        Pair a3 = o().a(str21, l5);
                                        if (a3 != null) {
                                            Object obj6 = a3.first;
                                            if (obj6 != null) {
                                                S s11 = (S) obj6;
                                                j4 = ((Long) a3.second).longValue();
                                                m();
                                                l3 = (Long) Rd.b(s11, str24);
                                                s5 = s11;
                                            }
                                        }
                                        t27 = t43;
                                        str19 = str23;
                                        e().s().a("Extra parameter without existing main event. eventName, eventId", str25, l5);
                                    } else {
                                        s5 = s8;
                                        l3 = l4;
                                        j4 = j;
                                    }
                                    j = j4 - 1;
                                    if (j <= 0) {
                                        he o2 = o();
                                        o2.i();
                                        o2.e().A().a("Clearing complex main event info. appId", str21);
                                        try {
                                            SQLiteDatabase w = o2.w();
                                            String str26 = "delete from main_event_params where app_id=?";
                                            try {
                                                String[] strArr = new String[1];
                                                try {
                                                    strArr[0] = str21;
                                                    w.execSQL(str26, strArr);
                                                } catch (SQLiteException e2) {
                                                    e = e2;
                                                }
                                            } catch (SQLiteException e3) {
                                                e = e3;
                                                o2.e().s().a("Error clearing complex main event", e);
                                                s6 = s9;
                                                t11 = t43;
                                                str4 = str23;
                                                str20 = str25;
                                                arrayList = new ArrayList();
                                                for (U u : s5.s()) {
                                                }
                                                if (!arrayList.isEmpty()) {
                                                }
                                                l2 = l3;
                                                b = o().b(str21, s2.q());
                                                if (b != null) {
                                                }
                                                o().a(fVar);
                                                long j6 = fVar.c;
                                                T t44 = t11;
                                                map4 = (Map) t44.get(str5);
                                                if (map4 == null) {
                                                }
                                                Map map14 = map4;
                                                it4 = map14.keySet().iterator();
                                                while (it4.hasNext()) {
                                                }
                                                str21 = str8;
                                                str23 = str7;
                                                t43 = t44;
                                                j5 = j;
                                                s8 = s;
                                                l4 = l2;
                                                t40 = t15;
                                                t41 = t14;
                                                t32 = t13;
                                                t42 = t12;
                                                str22 = str6;
                                                hashSet3 = hashSet;
                                                t36 = t16;
                                            }
                                        } catch (SQLiteException e4) {
                                            e = e4;
                                            o2.e().s().a("Error clearing complex main event", e);
                                            s6 = s9;
                                            t11 = t43;
                                            str4 = str23;
                                            str20 = str25;
                                            arrayList = new ArrayList();
                                            for (U u2 : s5.s()) {
                                            }
                                            if (!arrayList.isEmpty()) {
                                            }
                                            l2 = l3;
                                            b = o().b(str21, s2.q());
                                            if (b != null) {
                                            }
                                            o().a(fVar);
                                            long j62 = fVar.c;
                                            T t442 = t11;
                                            map4 = (Map) t442.get(str5);
                                            if (map4 == null) {
                                            }
                                            Map map142 = map4;
                                            it4 = map142.keySet().iterator();
                                            while (it4.hasNext()) {
                                            }
                                            str21 = str8;
                                            str23 = str7;
                                            t43 = t442;
                                            j5 = j;
                                            s8 = s;
                                            l4 = l2;
                                            t40 = t15;
                                            t41 = t14;
                                            t32 = t13;
                                            t42 = t12;
                                            str22 = str6;
                                            hashSet3 = hashSet;
                                            t36 = t16;
                                        }
                                        s6 = s9;
                                        t11 = t43;
                                        str4 = str23;
                                        str20 = str25;
                                    } else {
                                        Long l6 = l5;
                                        s6 = s9;
                                        str4 = str23;
                                        str20 = str25;
                                        t11 = t43;
                                        o().a(str, l6, j, s5);
                                    }
                                    arrayList = new ArrayList();
                                    for (U u22 : s5.s()) {
                                        m();
                                        if (Rd.a(s6, u22.p()) == null) {
                                            arrayList.add(u22);
                                        }
                                    }
                                    if (!arrayList.isEmpty()) {
                                        for (U add : s10) {
                                            arrayList.add(add);
                                        }
                                        list3 = arrayList;
                                        str5 = str20;
                                        s = s5;
                                        s2 = s6;
                                    } else {
                                        e().v().a("No unique parameters in main event. eventName", str20);
                                        str5 = str20;
                                        s = s5;
                                        s2 = s6;
                                        list3 = s10;
                                    }
                                    l2 = l3;
                                }
                                str23 = str19;
                                j5 = j;
                                t43 = t27;
                            } else {
                                s2 = s9;
                                t11 = t43;
                                str4 = str23;
                                if (z4) {
                                    m();
                                    Object valueOf3 = Long.valueOf(0);
                                    Object b2 = Rd.b(s2, "_epc");
                                    if (b2 != null) {
                                        valueOf3 = b2;
                                    }
                                    j = valueOf3.longValue();
                                    if (j <= 0) {
                                        e().v().a("Complex event with zero extra param count. eventName", q2);
                                        str18 = q2;
                                    } else {
                                        str18 = q2;
                                        o().a(str, l5, j, s2);
                                    }
                                    str17 = str18;
                                    s4 = s2;
                                    l2 = l5;
                                } else {
                                    s4 = s8;
                                    l2 = l4;
                                    str17 = q2;
                                }
                                list3 = s10;
                            }
                            b = o().b(str21, s2.q());
                            if (b != null) {
                                e().v().a("Event aggregate wasn't created during raw event logging. appId, event", C1124ib.a(str), k().a(str5));
                                if (d3) {
                                    str7 = str4;
                                    t16 = t36;
                                    s3 = s2;
                                    t15 = t40;
                                    t14 = t41;
                                    t13 = t32;
                                    str6 = str22;
                                    t12 = t42;
                                    hashSet = hashSet3;
                                    str8 = str21;
                                    fVar4 = new C1107f(str, s2.q(), 1, 1, 1, s3.r(), 0, null, null, null, null);
                                } else {
                                    str8 = str21;
                                    t16 = t36;
                                    s3 = s2;
                                    t13 = t32;
                                    str6 = str22;
                                    hashSet = hashSet3;
                                    t15 = t40;
                                    str7 = str4;
                                    t14 = t41;
                                    t12 = t42;
                                    fVar4 = new C1107f(str, s3.q(), 1, 1, s3.r(), 0, null, null, null, null);
                                }
                                fVar = fVar4;
                            } else {
                                str8 = str21;
                                t16 = t36;
                                s3 = s2;
                                t13 = t32;
                                str6 = str22;
                                hashSet = hashSet3;
                                t15 = t40;
                                str7 = str4;
                                t14 = t41;
                                t12 = t42;
                                if (d3) {
                                    fVar3 = new C1107f(b.a, b.b, b.c + 1, b.d + 1, b.e + 1, b.f, b.g, b.h, b.i, b.j, b.k);
                                } else {
                                    fVar3 = new C1107f(b.a, b.b, b.c + 1, b.d + 1, b.e, b.f, b.g, b.h, b.i, b.j, b.k);
                                }
                                fVar = fVar3;
                            }
                            o().a(fVar);
                            long j622 = fVar.c;
                            T t4422 = t11;
                            map4 = (Map) t4422.get(str5);
                            if (map4 == null) {
                                map4 = o().g(str8, str5);
                                if (map4 == null) {
                                    map4 = new T();
                                }
                                t4422.put(str5, map4);
                            }
                            Map map1422 = map4;
                            it4 = map1422.keySet().iterator();
                            while (it4.hasNext()) {
                                int intValue3 = ((Integer) it4.next()).intValue();
                                HashSet hashSet5 = hashSet;
                                if (hashSet5.contains(Integer.valueOf(intValue3))) {
                                    e().A().a(str7, Integer.valueOf(intValue3));
                                    hashSet2 = hashSet5;
                                } else {
                                    T t45 = t12;
                                    BitSet bitSet8 = (BitSet) t45.get(Integer.valueOf(intValue3));
                                    T t46 = t15;
                                    BitSet bitSet9 = (BitSet) t46.get(Integer.valueOf(intValue3));
                                    if (i) {
                                        bitSet = bitSet8;
                                        j2 = j622;
                                        t17 = t14;
                                        map6 = (Map) t16.get(Integer.valueOf(intValue3));
                                        map5 = (Map) t17.get(Integer.valueOf(intValue3));
                                    } else {
                                        bitSet = bitSet8;
                                        j2 = j622;
                                        t17 = t14;
                                        map6 = null;
                                        map5 = null;
                                    }
                                    Map map15 = map6;
                                    T t47 = t13;
                                    if (((P) t47.get(Integer.valueOf(intValue3))) == null) {
                                        Integer valueOf4 = Integer.valueOf(intValue3);
                                        a y4 = P.y();
                                        t18 = t4422;
                                        y4.a(true);
                                        t47.put(valueOf4, (P) y4.w());
                                        BitSet bitSet10 = new BitSet();
                                        t45.put(Integer.valueOf(intValue3), bitSet10);
                                        bitSet9 = new BitSet();
                                        t46.put(Integer.valueOf(intValue3), bitSet9);
                                        if (i) {
                                            T t48 = new T();
                                            BitSet bitSet11 = bitSet10;
                                            t17.put(Integer.valueOf(intValue3), t48);
                                            T t49 = new T();
                                            BitSet bitSet12 = bitSet9;
                                            t16.put(Integer.valueOf(intValue3), t49);
                                            map5 = t48;
                                            bitSet2 = bitSet11;
                                            bitSet9 = bitSet12;
                                            it5 = it4;
                                            map7 = t49;
                                            for (D d4 : (List) map1422.get(Integer.valueOf(intValue3))) {
                                                if (!d3 || !d2 || !d4.B()) {
                                                    bitSet4 = bitSet3;
                                                    j3 = j2;
                                                } else {
                                                    bitSet4 = bitSet3;
                                                    j3 = fVar.e;
                                                }
                                                if (e().a(2)) {
                                                    C1134kb A = e().A();
                                                    Integer valueOf5 = Integer.valueOf(intValue3);
                                                    if (d4.s()) {
                                                        str9 = str7;
                                                        t20 = t16;
                                                        obj3 = Integer.valueOf(d4.p());
                                                    } else {
                                                        t20 = t16;
                                                        str9 = str7;
                                                        obj3 = null;
                                                    }
                                                    t19 = t46;
                                                    A.a("Evaluating filter. audience, filter, event", valueOf5, obj3, k().a(d4.q()));
                                                    str10 = str6;
                                                    e().A().a(str10, m().a(d4));
                                                } else {
                                                    t20 = t16;
                                                    str9 = str7;
                                                    t19 = t46;
                                                    str10 = str6;
                                                }
                                                if (!d4.s() || d4.p() > 256) {
                                                    str11 = str10;
                                                    fVar2 = fVar;
                                                    t24 = t47;
                                                    t23 = t45;
                                                    map9 = map5;
                                                    bitSet5 = bitSet4;
                                                    t22 = t20;
                                                    str12 = str9;
                                                    t21 = t19;
                                                    D d5 = d4;
                                                    t25 = t17;
                                                    map8 = map1422;
                                                    str13 = str;
                                                    e().v().a("Invalid event filter ID. appId, id", C1124ib.a(str), String.valueOf(d5.s() ? Integer.valueOf(d5.p()) : null));
                                                } else {
                                                    String str27 = "Event filter result";
                                                    if (i) {
                                                        boolean y5 = d4.y();
                                                        boolean z5 = d4.z();
                                                        boolean z6 = y5 || z5 || (d2 && d4.B());
                                                        if (!bitSet2.get(d4.p()) || z6) {
                                                            Map map16 = map5;
                                                            D d6 = d4;
                                                            fVar2 = fVar;
                                                            bitSet5 = bitSet4;
                                                            t24 = t47;
                                                            map8 = map1422;
                                                            str13 = str;
                                                            map9 = map16;
                                                            t22 = t20;
                                                            t25 = t17;
                                                            String str28 = str27;
                                                            str11 = str10;
                                                            t23 = t45;
                                                            str12 = str9;
                                                            t21 = t19;
                                                            Boolean a4 = a(d6, str5, list3, j3);
                                                            e().A().a(str28, a4 == 0 ? obj5 : a4);
                                                            if (a4 == 0) {
                                                                hashSet5.add(Integer.valueOf(intValue3));
                                                            } else {
                                                                bitSet5.set(d6.p());
                                                                if (a4.booleanValue()) {
                                                                    bitSet2.set(d6.p());
                                                                    if (z6 && s3.u()) {
                                                                        if (z5) {
                                                                            b(map7, d6.p(), s3.r());
                                                                        } else {
                                                                            a(map9, d6.p(), s3.r());
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            e().A().a("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(intValue3), d4.s() ? Integer.valueOf(d4.p()) : null);
                                                            str14 = str;
                                                            str16 = str10;
                                                            bitSet3 = bitSet4;
                                                            t26 = t20;
                                                            str15 = str9;
                                                            t46 = t19;
                                                        }
                                                    } else {
                                                        str11 = str10;
                                                        fVar2 = fVar;
                                                        t24 = t47;
                                                        t23 = t45;
                                                        map9 = map5;
                                                        bitSet5 = bitSet4;
                                                        t22 = t20;
                                                        str12 = str9;
                                                        t21 = t19;
                                                        D d7 = d4;
                                                        t25 = t17;
                                                        map8 = map1422;
                                                        str13 = str;
                                                        String str29 = str27;
                                                        if (bitSet2.get(d7.p())) {
                                                            e().A().a("Event filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue3), d7.s() ? Integer.valueOf(d7.p()) : null);
                                                        } else {
                                                            Boolean a5 = a(d7, str5, list3, j3);
                                                            e().A().a(str29, a5 == 0 ? obj5 : a5);
                                                            if (a5 == 0) {
                                                                hashSet5.add(Integer.valueOf(intValue3));
                                                            } else {
                                                                bitSet5.set(d7.p());
                                                                if (a5.booleanValue()) {
                                                                    bitSet2.set(d7.p());
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                bitSet3 = bitSet5;
                                                map5 = map9;
                                                str14 = str13;
                                                str15 = str12;
                                                map1422 = map8;
                                                t17 = t25;
                                                fVar = fVar2;
                                                t47 = t24;
                                                t45 = t23;
                                                t26 = t22;
                                                t46 = t21;
                                                str16 = str11;
                                            }
                                            t15 = t46;
                                            t14 = t17;
                                            t13 = t47;
                                            hashSet2 = hashSet5;
                                            t12 = t45;
                                            it4 = it5;
                                            j622 = j2;
                                            t4422 = t18;
                                        } else {
                                            bitSet = bitSet10;
                                            BitSet bitSet13 = bitSet9;
                                        }
                                    } else {
                                        t18 = t4422;
                                    }
                                    bitSet2 = bitSet;
                                    it5 = it4;
                                    map7 = map15;
                                    for (D d42 : (List) map1422.get(Integer.valueOf(intValue3))) {
                                    }
                                    t15 = t46;
                                    t14 = t17;
                                    t13 = t47;
                                    hashSet2 = hashSet5;
                                    t12 = t45;
                                    it4 = it5;
                                    j622 = j2;
                                    t4422 = t18;
                                }
                            }
                            str21 = str8;
                            str23 = str7;
                            t43 = t4422;
                            j5 = j;
                            s8 = s;
                            l4 = l2;
                            t40 = t15;
                            t41 = t14;
                            t32 = t13;
                            t42 = t12;
                            str22 = str6;
                            hashSet3 = hashSet;
                            t36 = t16;
                        }
                    } else {
                        j = j5;
                    }
                    z = false;
                    if (!z) {
                    }
                    b = o().b(str21, s2.q());
                    if (b != null) {
                    }
                    o().a(fVar);
                    long j6222 = fVar.c;
                    T t44222 = t11;
                    map4 = (Map) t44222.get(str5);
                    if (map4 == null) {
                    }
                    Map map14222 = map4;
                    it4 = map14222.keySet().iterator();
                    while (it4.hasNext()) {
                    }
                    str21 = str8;
                    str23 = str7;
                    t43 = t44222;
                    j5 = j;
                    s8 = s;
                    l4 = l2;
                    t40 = t15;
                    t41 = t14;
                    t32 = t13;
                    t42 = t12;
                    str22 = str6;
                    hashSet3 = hashSet;
                    t36 = t16;
                }
            }
            String str30 = str21;
            T t50 = t36;
            T t51 = t32;
            String str31 = str22;
            HashSet hashSet6 = hashSet3;
            T t52 = t40;
            T t53 = t41;
            T t54 = t42;
            String str32 = str23;
            if (!list2.isEmpty()) {
                T t55 = new T();
                Iterator it12 = list2.iterator();
                while (it12.hasNext()) {
                    C0920aa aaVar = (C0920aa) it12.next();
                    Map map17 = (Map) t55.get(aaVar.p());
                    if (map17 == null) {
                        map17 = o().h(str30, aaVar.p());
                        if (map17 == null) {
                            map17 = new T();
                        }
                        t55.put(aaVar.p(), map17);
                    }
                    Iterator it13 = map17.keySet().iterator();
                    while (it13.hasNext()) {
                        int intValue4 = ((Integer) it13.next()).intValue();
                        if (hashSet6.contains(Integer.valueOf(intValue4))) {
                            e().A().a(str32, Integer.valueOf(intValue4));
                        } else {
                            T t56 = t54;
                            BitSet bitSet14 = (BitSet) t56.get(Integer.valueOf(intValue4));
                            T t57 = t52;
                            BitSet bitSet15 = (BitSet) t57.get(Integer.valueOf(intValue4));
                            if (i) {
                                t5 = t53;
                                map2 = (Map) t5.get(Integer.valueOf(intValue4));
                                it3 = it12;
                                t6 = t50;
                                map = (Map) t6.get(Integer.valueOf(intValue4));
                                t4 = t55;
                            } else {
                                it3 = it12;
                                t5 = t53;
                                t6 = t50;
                                t4 = t55;
                                map2 = null;
                                map = null;
                            }
                            Iterator it14 = it13;
                            T t58 = t51;
                            if (((P) t58.get(Integer.valueOf(intValue4))) == null) {
                                Integer valueOf6 = Integer.valueOf(intValue4);
                                a y6 = P.y();
                                y6.a(true);
                                t58.put(valueOf6, (P) y6.w());
                                bitSet14 = new BitSet();
                                t56.put(Integer.valueOf(intValue4), bitSet14);
                                bitSet15 = new BitSet();
                                t57.put(Integer.valueOf(intValue4), bitSet15);
                                if (i) {
                                    map2 = new T();
                                    t5.put(Integer.valueOf(intValue4), map2);
                                    map = new T();
                                    t6.put(Integer.valueOf(intValue4), map);
                                }
                            }
                            Iterator it15 = ((List) map17.get(Integer.valueOf(intValue4))).iterator();
                            while (true) {
                                if (!it15.hasNext()) {
                                    Map map18 = map17;
                                    String str33 = str;
                                    t50 = t6;
                                    t51 = t58;
                                    t54 = t56;
                                    t52 = t57;
                                    t53 = t5;
                                    t55 = t4;
                                    Map map19 = map18;
                                    it12 = it3;
                                    break;
                                }
                                Iterator it16 = it15;
                                G g = (G) it15.next();
                                Map map20 = map17;
                                String str34 = str32;
                                if (e().a(2)) {
                                    C1134kb A2 = e().A();
                                    Integer valueOf7 = Integer.valueOf(intValue4);
                                    if (g.r()) {
                                        t50 = t6;
                                        obj2 = Integer.valueOf(g.p());
                                    } else {
                                        t50 = t6;
                                        obj2 = null;
                                    }
                                    t7 = t5;
                                    A2.a("Evaluating filter. audience, filter, property", valueOf7, obj2, k().c(g.q()));
                                    str2 = str31;
                                    e().A().a(str2, m().a(g));
                                } else {
                                    t50 = t6;
                                    t7 = t5;
                                    str2 = str31;
                                }
                                if (!g.r() || g.p() > 256) {
                                    T t59 = t57;
                                    String str35 = str2;
                                    C1134kb v = e().v();
                                    Object a6 = C1124ib.a(str);
                                } else {
                                    String str36 = "Property filter result";
                                    if (i) {
                                        boolean s12 = g.s();
                                        boolean t60 = g.t();
                                        boolean z7 = d2 && g.x();
                                        boolean z8 = s12 || t60 || z7;
                                        if (!bitSet14.get(g.p()) || z8) {
                                            Boolean a7 = a(g, aaVar);
                                            str3 = str2;
                                            C1134kb A3 = e().A();
                                            if (a7 == 0) {
                                                t8 = t57;
                                                obj = obj5;
                                            } else {
                                                t8 = t57;
                                                obj = a7;
                                            }
                                            A3.a(str36, obj);
                                            if (a7 == 0) {
                                                hashSet6.add(Integer.valueOf(intValue4));
                                            } else {
                                                bitSet15.set(g.p());
                                                if (!d2 || !z7 || a7.booleanValue()) {
                                                    if (!d) {
                                                        bitSet14.set(g.p(), a7.booleanValue());
                                                    } else if (!bitSet14.get(g.p()) || g.s()) {
                                                        bitSet14.set(g.p(), a7.booleanValue());
                                                    }
                                                    if (a7.booleanValue() && z8 && aaVar.y()) {
                                                        long z9 = aaVar.z();
                                                        if (d2 && z7 && l != null) {
                                                            z9 = l.longValue();
                                                        }
                                                        if (t60) {
                                                            b(map, g.p(), z9);
                                                        } else {
                                                            a(map2, g.p(), z9);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            e().A().a("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(intValue4), g.r() ? Integer.valueOf(g.p()) : null);
                                            str31 = str2;
                                            map3 = map20;
                                            it15 = it16;
                                            str32 = str34;
                                            t9 = t7;
                                            t10 = t50;
                                            String str37 = str;
                                        }
                                    } else {
                                        t8 = t57;
                                        str3 = str2;
                                        if (bitSet14.get(g.p())) {
                                            e().A().a("Property filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue4), g.r() ? Integer.valueOf(g.p()) : null);
                                        } else {
                                            Boolean a8 = a(g, aaVar);
                                            e().A().a(str36, a8 == 0 ? obj5 : a8);
                                            if (a8 == 0) {
                                                hashSet6.add(Integer.valueOf(intValue4));
                                            } else {
                                                bitSet15.set(g.p());
                                                if (a8.booleanValue()) {
                                                    bitSet14.set(g.p());
                                                }
                                            }
                                        }
                                    }
                                    String str38 = str;
                                    map3 = map20;
                                    it15 = it16;
                                    str32 = str34;
                                    t57 = t8;
                                    t9 = t7;
                                    str31 = str3;
                                    t10 = t50;
                                }
                            }
                            it13 = it14;
                        }
                    }
                    str30 = str;
                }
            }
            T t61 = t53;
            T t62 = t51;
            T t63 = t54;
            T t64 = t52;
            ArrayList arrayList2 = new ArrayList();
            it = t63.keySet().iterator();
            while (it.hasNext()) {
                int intValue5 = ((Integer) it.next()).intValue();
                if (!hashSet6.contains(Integer.valueOf(intValue5))) {
                    P p = (P) t62.get(Integer.valueOf(intValue5));
                    if (p == null) {
                        aVar = P.y();
                    } else {
                        aVar = (a) p.l();
                    }
                    aVar.a(intValue5);
                    Y.a z10 = Y.z();
                    z10.b((Iterable<? extends Long>) Rd.a((BitSet) t63.get(Integer.valueOf(intValue5))));
                    T t65 = t64;
                    z10.a((Iterable<? extends Long>) Rd.a((BitSet) t65.get(Integer.valueOf(intValue5))));
                    if (i) {
                        t3 = t61;
                        z10.c(a((Map) t3.get(Integer.valueOf(intValue5))));
                        t2 = t50;
                        Map map21 = (Map) t2.get(Integer.valueOf(intValue5));
                        if (map21 == null) {
                            it2 = it;
                            t = t63;
                            collection = Collections.emptyList();
                        } else {
                            ArrayList arrayList3 = new ArrayList(map21.size());
                            for (Integer num : map21.keySet()) {
                                Iterator it17 = it;
                                Z.a t66 = Z.t();
                                t66.a(num.intValue());
                                List<Long> list5 = (List) map21.get(num);
                                if (list5 != null) {
                                    Collections.sort(list5);
                                    for (Long longValue : list5) {
                                        T t67 = t63;
                                        Map map22 = map21;
                                        t66.a(longValue.longValue());
                                        map21 = map22;
                                        t63 = t67;
                                    }
                                }
                                T t68 = t63;
                                Map map23 = map21;
                                arrayList3.add((Z) t66.w());
                                it = it17;
                                map21 = map23;
                                t63 = t68;
                            }
                            it2 = it;
                            t = t63;
                            collection = arrayList3;
                        }
                        if (d && aVar.l()) {
                            List<Z> x = aVar.m().x();
                            if (!x.isEmpty()) {
                                List arrayList4 = new ArrayList(collection);
                                T t69 = new T();
                                for (Z z11 : x) {
                                    if (z11.q() && z11.s() > 0) {
                                        t69.put(Integer.valueOf(z11.p()), Long.valueOf(z11.b(z11.s() - 1)));
                                    }
                                }
                                for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                                    Z z12 = (Z) arrayList4.get(i5);
                                    Long l7 = (Long) t69.remove(z12.q() ? Integer.valueOf(z12.p()) : null);
                                    if (l7 != null) {
                                        ArrayList arrayList5 = new ArrayList();
                                        if (l7.longValue() < z12.b(0)) {
                                            arrayList5.add(l7);
                                        }
                                        arrayList5.addAll(z12.r());
                                        Z.a aVar3 = (Z.a) z12.l();
                                        aVar3.k();
                                        aVar3.a((Iterable<? extends Long>) arrayList5);
                                        arrayList4.set(i5, (Z) aVar3.w());
                                    }
                                }
                                for (Integer num2 : t69.keySet()) {
                                    Z.a t70 = Z.t();
                                    t70.a(num2.intValue());
                                    T t71 = t69;
                                    t70.a(((Long) t69.get(num2)).longValue());
                                    arrayList4.add((Z) t70.w());
                                    t69 = t71;
                                }
                                iterable = arrayList4;
                                z10.d(iterable);
                            }
                        }
                        iterable = collection;
                        z10.d(iterable);
                    } else {
                        it2 = it;
                        t = t63;
                        t3 = t61;
                        t2 = t50;
                    }
                    aVar.a(z10);
                    t62.put(Integer.valueOf(intValue5), (P) aVar.w());
                    arrayList2.add((P) aVar.w());
                    he o3 = o();
                    Y k = aVar.k();
                    o3.s();
                    o3.i();
                    Preconditions.checkNotEmpty(str);
                    Preconditions.checkNotNull(k);
                    byte[] g2 = k.g();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("audience_id", Integer.valueOf(intValue5));
                    contentValues2.put("current_results", g2);
                    try {
                        try {
                            if (o3.w().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                                o3.e().s().a("Failed to insert filter results (got -1). appId", C1124ib.a(str));
                            }
                        } catch (SQLiteException e5) {
                            e = e5;
                            o3.e().s().a("Error storing filter results. appId", C1124ib.a(str), e);
                            it = it2;
                            t64 = t65;
                            t61 = t3;
                            t50 = t2;
                            t63 = t;
                        }
                    } catch (SQLiteException e6) {
                        e = e6;
                        o3.e().s().a("Error storing filter results. appId", C1124ib.a(str), e);
                        it = it2;
                        t64 = t65;
                        t61 = t3;
                        t50 = t2;
                        t63 = t;
                    }
                    it = it2;
                    t64 = t65;
                    t61 = t3;
                    t50 = t2;
                } else {
                    t = t63;
                    String str39 = str;
                }
                t63 = t;
            }
            return arrayList2;
        }
        l = null;
        o = o();
        o.s();
        o.i();
        Preconditions.checkNotEmpty(str);
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put("current_session_count", Integer.valueOf(0));
        try {
            o.w().update("events", contentValues3, "app_id = ?", new String[]{str21});
        } catch (SQLiteException e7) {
            o.e().s().a("Error resetting session-scoped event counts. appId", C1124ib.a(str), e7);
        }
        f = o().f(str21);
        HashSet hashSet42 = new HashSet(f.keySet());
        if (d2) {
        }
        map10 = f;
        it6 = hashSet42.iterator();
        while (it6.hasNext()) {
        }
        T t402 = t34;
        T t412 = t35;
        T t422 = t33;
        String str222 = "Filter definition";
        String str232 = "Skipping failed audience ID";
        Object obj52 = "null";
        if (!list.isEmpty()) {
        }
        String str302 = str21;
        T t502 = t36;
        T t512 = t32;
        String str312 = str222;
        HashSet hashSet62 = hashSet3;
        T t522 = t402;
        T t532 = t412;
        T t542 = t422;
        String str322 = str232;
        if (!list2.isEmpty()) {
        }
        T t612 = t532;
        T t622 = t512;
        T t632 = t542;
        T t642 = t522;
        ArrayList arrayList22 = new ArrayList();
        it = t632.keySet().iterator();
        while (it.hasNext()) {
        }
        return arrayList22;
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    private final Boolean a(D d, String str, List<U> list, long j) {
        Boolean bool;
        boolean u = d.u();
        Boolean valueOf = Boolean.valueOf(false);
        if (u) {
            Boolean a = a(j, d.x());
            if (a == null) {
                return null;
            }
            if (!a.booleanValue()) {
                return valueOf;
            }
        }
        HashSet hashSet = new HashSet();
        for (E e : d.t()) {
            if (e.x().isEmpty()) {
                e().v().a("null or empty param name in filter. event", k().a(str));
                return null;
            }
            hashSet.add(e.x());
        }
        T t = new T();
        for (U u2 : list) {
            if (hashSet.contains(u2.p())) {
                if (u2.s()) {
                    t.put(u2.p(), u2.s() ? Long.valueOf(u2.t()) : null);
                } else if (u2.u()) {
                    t.put(u2.p(), u2.u() ? Double.valueOf(u2.x()) : null);
                } else if (u2.q()) {
                    t.put(u2.p(), u2.r());
                } else {
                    e().v().a("Unknown value for param. event, param", k().a(str), k().b(u2.p()));
                    return null;
                }
            }
        }
        Iterator it = d.t().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                return Boolean.valueOf(true);
            }
            E e2 = (E) it.next();
            if (!e2.t() || !e2.u()) {
                z = false;
            }
            String x = e2.x();
            if (x.isEmpty()) {
                e().v().a("Event has empty param name. event", k().a(str));
                return null;
            }
            Object obj = t.get(x);
            if (obj instanceof Long) {
                if (!e2.r()) {
                    e().v().a("No number filter for long param. event, param", k().a(str), k().b(x));
                    return null;
                }
                Boolean a2 = a(((Long) obj).longValue(), e2.s());
                if (a2 == null) {
                    return null;
                }
                if (a2.booleanValue() == z) {
                    return valueOf;
                }
            } else if (obj instanceof Double) {
                if (!e2.r()) {
                    e().v().a("No number filter for double param. event, param", k().a(str), k().b(x));
                    return null;
                }
                Boolean a3 = a(((Double) obj).doubleValue(), e2.s());
                if (a3 == null) {
                    return null;
                }
                if (a3.booleanValue() == z) {
                    return valueOf;
                }
            } else if (obj instanceof String) {
                if (e2.p()) {
                    bool = a((String) obj, e2.q());
                } else if (e2.r()) {
                    String str2 = (String) obj;
                    if (Rd.a(str2)) {
                        bool = a(str2, e2.s());
                    } else {
                        e().v().a("Invalid param value for number filter. event, param", k().a(str), k().b(x));
                        return null;
                    }
                } else {
                    e().v().a("No filter for String param. event, param", k().a(str), k().b(x));
                    return null;
                }
                if (bool == null) {
                    return null;
                }
                if (bool.booleanValue() == z) {
                    return valueOf;
                }
            } else if (obj == null) {
                e().A().a("Missing param for filter. event, param", k().a(str), k().b(x));
                return valueOf;
            } else {
                e().v().a("Unknown param type. event, param", k().a(str), k().b(x));
                return null;
            }
        }
    }

    private final Boolean a(G g, C0920aa aaVar) {
        E z = g.z();
        boolean u = z.u();
        if (aaVar.s()) {
            if (z.r()) {
                return a(a(aaVar.t(), z.s()), u);
            }
            e().v().a("No number filter for long property. property", k().c(aaVar.p()));
            return null;
        } else if (aaVar.u()) {
            if (z.r()) {
                return a(a(aaVar.x(), z.s()), u);
            }
            e().v().a("No number filter for double property. property", k().c(aaVar.p()));
            return null;
        } else if (!aaVar.q()) {
            e().v().a("User property has no value, property", k().c(aaVar.p()));
            return null;
        } else if (z.p()) {
            return a(a(aaVar.r(), z.q()), u);
        } else {
            if (!z.r()) {
                e().v().a("No string or number filter defined. property", k().c(aaVar.p()));
            } else if (Rd.a(aaVar.r())) {
                return a(a(aaVar.r(), z.s()), u);
            } else {
                e().v().a("Invalid user property value for Numeric number filter. property, value", k().c(aaVar.p()), aaVar.r());
            }
            return null;
        }
    }

    @VisibleForTesting
    private static Boolean a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    @VisibleForTesting
    private final Boolean a(String str, H h) {
        String str2;
        List list;
        Preconditions.checkNotNull(h);
        if (str == null || !h.p() || h.q() == H.a.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (h.q() == H.a.IN_LIST) {
            if (h.y() == 0) {
                return null;
            }
        } else if (!h.r()) {
            return null;
        }
        H.a q = h.q();
        boolean u = h.u();
        if (u || q == H.a.REGEXP || q == H.a.IN_LIST) {
            str2 = h.s();
        } else {
            str2 = h.s().toUpperCase(Locale.ENGLISH);
        }
        String str3 = str2;
        if (h.y() == 0) {
            list = null;
        } else {
            List<String> x = h.x();
            if (!u) {
                ArrayList arrayList = new ArrayList(x.size());
                for (String upperCase : x) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                x = Collections.unmodifiableList(arrayList);
            }
            list = x;
        }
        return a(str, q, u, str3, list, q == H.a.REGEXP ? str3 : null);
    }

    private final Boolean a(String str, H.a aVar, boolean z, String str2, List<String> list, String str3) {
        if (str == null) {
            return null;
        }
        if (aVar == H.a.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && aVar != H.a.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (_d.a[aVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    e().v().a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    private final Boolean a(long j, F f) {
        try {
            return a(new BigDecimal(j), f, (double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean a(double d, F f) {
        try {
            return a(new BigDecimal(d), f, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean a(String str, F f) {
        if (!Rd.a(str)) {
            return null;
        }
        try {
            return a(new BigDecimal(str), f, (double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r2 != null) goto L_0x0087;
     */
    @VisibleForTesting
    private static Boolean a(BigDecimal bigDecimal, F f, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(f);
        if (f.p() && f.q() != b.UNKNOWN_COMPARISON_TYPE) {
            if (f.q() == b.BETWEEN) {
                if (!f.x() || !f.z()) {
                    return null;
                }
            } else if (!f.t()) {
                return null;
            }
            b q = f.q();
            if (f.q() == b.BETWEEN) {
                if (Rd.a(f.y()) && Rd.a(f.A())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(f.y());
                        bigDecimal3 = new BigDecimal(f.A());
                        bigDecimal2 = bigDecimal5;
                        bigDecimal4 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            } else if (!Rd.a(f.u())) {
                return null;
            } else {
                try {
                    bigDecimal4 = new BigDecimal(f.u());
                    bigDecimal2 = null;
                    bigDecimal3 = null;
                } catch (NumberFormatException unused2) {
                }
            }
            if (q == b.BETWEEN) {
                if (bigDecimal2 == null) {
                    return null;
                }
            }
            int i = _d.b[q.ordinal()];
            boolean z = false;
            if (i == 1) {
                if (bigDecimal.compareTo(bigDecimal4) == -1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } else if (i == 2) {
                if (bigDecimal.compareTo(bigDecimal4) == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } else if (i != 3) {
                if (i == 4) {
                    if (!(bigDecimal.compareTo(bigDecimal2) == -1 || bigDecimal.compareTo(bigDecimal3) == 1)) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            } else if (d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                if (bigDecimal.compareTo(bigDecimal4.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) == 1 && bigDecimal.compareTo(bigDecimal4.add(new BigDecimal(d).multiply(new BigDecimal(2)))) == -1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } else {
                if (bigDecimal.compareTo(bigDecimal4) == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    private static List<Q> a(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Integer intValue : map.keySet()) {
            int intValue2 = intValue.intValue();
            Q.a t = Q.t();
            t.a(intValue2);
            t.a(((Long) map.get(Integer.valueOf(intValue2))).longValue());
            arrayList.add((Q) t.w());
        }
        return arrayList;
    }

    private static void a(Map<Integer, Long> map, int i, long j) {
        Long l = (Long) map.get(Integer.valueOf(i));
        long j2 = j / 1000;
        if (l == null || j2 > l.longValue()) {
            map.put(Integer.valueOf(i), Long.valueOf(j2));
        }
    }
}
