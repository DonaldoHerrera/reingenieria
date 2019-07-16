package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.F.b;
import com.google.android.gms.internal.measurement.H.a;

final /* synthetic */ class _d {
    static final /* synthetic */ int[] a = new int[a.values().length];
    static final /* synthetic */ int[] b = new int[b.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0066 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
    static {
        try {
            b[b.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[b.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[b.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[b.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a[a.REGEXP.ordinal()] = 1;
        a[a.BEGINS_WITH.ordinal()] = 2;
        a[a.ENDS_WITH.ordinal()] = 3;
        a[a.PARTIAL.ordinal()] = 4;
        a[a.EXACT.ordinal()] = 5;
        try {
            a[a.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
