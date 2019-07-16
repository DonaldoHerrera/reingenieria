package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.d;

final class Cc implements C1014oc {
    private final C1026qc a;
    private final String b;
    private final Object[] c;
    private final int d;

    Cc(C1026qc qcVar, String str, Object[] objArr) {
        this.a = qcVar;
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

    public final C1026qc a() {
        return this.a;
    }

    public final boolean b() {
        return (this.d & 2) == 2;
    }

    public final int c() {
        return (this.d & 1) == 1 ? d.i : d.j;
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
