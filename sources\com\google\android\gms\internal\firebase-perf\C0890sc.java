package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.c;

/* renamed from: com.google.android.gms.internal.firebase-perf.sc reason: case insensitive filesystem */
final class C0890sc implements C0821bc {
    private final C0835ec a;
    private final String b;
    private final Object[] c;
    private final int d;

    C0890sc(C0835ec ecVar, String str, Object[] objArr) {
        this.a = ecVar;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        char c2 = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c2 |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.d = c2 | (charAt2 << i);
                return;
            }
        }
    }

    public final boolean a() {
        return (this.d & 2) == 2;
    }

    public final C0835ec b() {
        return this.a;
    }

    public final int c() {
        return (this.d & 1) == 1 ? c.i : c.j;
    }

    /* access modifiers changed from: 0000 */
    public final String d() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final Object[] e() {
        return this.c;
    }
}
