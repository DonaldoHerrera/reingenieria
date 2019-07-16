package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.c;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.firebase-perf.hb reason: case insensitive filesystem */
final class C0846hb implements dd {
    private final C0838fb a;

    private C0846hb(C0838fb fbVar) {
        C0897ub.a(fbVar, "output");
        this.a = fbVar;
    }

    public static C0846hb a(C0838fb fbVar) {
        C0846hb hbVar = fbVar.c;
        if (hbVar != null) {
            return hbVar;
        }
        return new C0846hb(fbVar);
    }

    public final void b(int i, int i2) throws IOException {
        this.a.b(i, i2);
    }

    public final void c(int i, long j) throws IOException {
        this.a.a(i, j);
    }

    public final void d(int i, long j) throws IOException {
        this.a.c(i, j);
    }

    public final void e(int i, long j) throws IOException {
        this.a.a(i, j);
    }

    public final void f(int i, int i2) throws IOException {
        this.a.d(i, i2);
    }

    public final void g(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0838fb.e(((Integer) list.get(i4)).intValue());
            }
            this.a.i(i3);
            while (i2 < list.size()) {
                this.a.h(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void h(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0838fb.h(((Long) list.get(i4)).longValue());
            }
            this.a.i(i3);
            while (i2 < list.size()) {
                this.a.c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0838fb.a(((Integer) list.get(i4)).intValue());
            }
            this.a.i(i3);
            while (i2 < list.size()) {
                this.a.i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.c(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0838fb.d(((Integer) list.get(i4)).intValue());
            }
            this.a.i(i3);
            while (i2 < list.size()) {
                this.a.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void k(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0838fb.g(((Long) list.get(i4)).longValue());
            }
            this.a.i(i3);
            while (i2 < list.size()) {
                this.a.c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0838fb.e(((Long) list.get(i4)).longValue());
            }
            this.a.i(i3);
            while (i2 < list.size()) {
                this.a.a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void m(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0838fb.b(((Double) list.get(i4)).doubleValue());
            }
            this.a.i(i3);
            while (i2 < list.size()) {
                this.a.a(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    public final void n(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0838fb.b(((Float) list.get(i4)).floatValue());
            }
            this.a.i(i3);
            while (i2 < list.size()) {
                this.a.a(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    public final void c(int i, int i2) throws IOException {
        this.a.b(i, i2);
    }

    public final void f(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0838fb.b(((Boolean) list.get(i4)).booleanValue());
            }
            this.a.i(i3);
            while (i2 < list.size()) {
                this.a.a(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public final int a() {
        return c.l;
    }

    public final void b(int i, long j) throws IOException {
        this.a.c(i, j);
    }

    public final void c(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0838fb.c(((Integer) list.get(i4)).intValue());
            }
            this.a.i(i3);
            while (i2 < list.size()) {
                this.a.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void d(int i, int i2) throws IOException {
        this.a.e(i, i2);
    }

    public final void e(int i, int i2) throws IOException {
        this.a.c(i, i2);
    }

    public final void a(int i, int i2) throws IOException {
        this.a.e(i, i2);
    }

    public final void b(int i, Object obj, C0886rc rcVar) throws IOException {
        C0838fb fbVar = this.a;
        C0835ec ecVar = (C0835ec) obj;
        fbVar.a(i, 3);
        rcVar.a(ecVar, (dd) fbVar.c);
        fbVar.a(i, 4);
    }

    public final void d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0838fb.f(((Long) list.get(i4)).longValue());
            }
            this.a.i(i3);
            while (i2 < list.size()) {
                this.a.b(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.b(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void e(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0838fb.b(((Integer) list.get(i4)).intValue());
            }
            this.a.i(i3);
            while (i2 < list.size()) {
                this.a.j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.d(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void a(int i, float f) throws IOException {
        this.a.a(i, f);
    }

    public final void a(int i, double d) throws IOException {
        this.a.a(i, d);
    }

    public final void a(int i, boolean z) throws IOException {
        this.a.a(i, z);
    }

    public final void b(int i) throws IOException {
        this.a.a(i, 4);
    }

    public final void a(int i, String str) throws IOException {
        this.a.a(i, str);
    }

    public final void b(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0838fb.d(((Long) list.get(i4)).longValue());
            }
            this.a.i(i3);
            while (i2 < list.size()) {
                this.a.a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void a(int i, Oa oa) throws IOException {
        this.a.a(i, oa);
    }

    public final void a(int i, long j) throws IOException {
        this.a.b(i, j);
    }

    public final void a(int i, Object obj, C0886rc rcVar) throws IOException {
        this.a.a(i, (C0835ec) obj, rcVar);
    }

    public final void a(int i) throws IOException {
        this.a.a(i, 3);
    }

    public final void a(int i, Object obj) throws IOException {
        if (obj instanceof Oa) {
            this.a.b(i, (Oa) obj);
        } else {
            this.a.a(i, (C0835ec) obj);
        }
    }

    public final void a(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0838fb.m(((Integer) list.get(i4)).intValue());
            }
            this.a.i(i3);
            while (i2 < list.size()) {
                this.a.h(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void b(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof Lb) {
            Lb lb = (Lb) list;
            while (i2 < list.size()) {
                Object j = lb.j(i2);
                if (j instanceof String) {
                    this.a.a(i, (String) j);
                } else {
                    this.a.a(i, (Oa) j);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, (String) list.get(i2));
            i2++;
        }
    }

    public final void a(int i, List<Oa> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.a(i, (Oa) list.get(i2));
        }
    }

    public final void a(int i, List<?> list, C0886rc rcVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b(i, list.get(i2), rcVar);
        }
    }

    public final void b(int i, List<?> list, C0886rc rcVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            a(i, list.get(i2), rcVar);
        }
    }

    public final <K, V> void a(int i, Vb<K, V> vb, Map<K, V> map) throws IOException {
        for (Entry entry : map.entrySet()) {
            this.a.a(i, 2);
            this.a.i(Wb.a(vb, entry.getKey(), entry.getValue()));
            C0838fb fbVar = this.a;
            Object key = entry.getKey();
            Object value = entry.getValue();
            C0870nb.a(fbVar, vb.a, 1, key);
            C0870nb.a(fbVar, vb.c, 2, value);
        }
    }
}
