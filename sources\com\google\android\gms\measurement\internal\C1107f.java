package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.f reason: case insensitive filesystem */
final class C1107f {
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;
    final long f;
    final long g;
    final Long h;
    final Long i;
    final Long j;
    final Boolean k;

    C1107f(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l, Long l2, Long l3, Boolean bool) {
        long j7 = j2;
        long j8 = j3;
        long j9 = j4;
        long j10 = j6;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        boolean z = true;
        Preconditions.checkArgument(j7 >= 0);
        Preconditions.checkArgument(j8 >= 0);
        Preconditions.checkArgument(j9 >= 0);
        if (j10 < 0) {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.a = str;
        this.b = str2;
        this.c = j7;
        this.d = j8;
        this.e = j9;
        this.f = j5;
        this.g = j10;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    /* access modifiers changed from: 0000 */
    public final C1107f a(long j2) {
        C1107f fVar = new C1107f(this.a, this.b, this.c, this.d, this.e, j2, this.g, this.h, this.i, this.j, this.k);
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    public final C1107f a(long j2, long j3) {
        C1107f fVar = new C1107f(this.a, this.b, this.c, this.d, this.e, this.f, j2, Long.valueOf(j3), this.i, this.j, this.k);
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    public final C1107f a(Long l, Long l2, Boolean bool) {
        C1107f fVar = new C1107f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
        return fVar;
    }

    C1107f(String str, String str2, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, j2, j3, 0, j4, 0, null, null, null, null);
    }
}
