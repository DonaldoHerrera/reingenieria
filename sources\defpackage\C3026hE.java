package defpackage;

import java.math.RoundingMode;

/* renamed from: hE reason: default package and case insensitive filesystem */
/* compiled from: IntMath */
/* synthetic */ class C3026hE {
    static final /* synthetic */ int[] a = new int[RoundingMode.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
    static {
        a[RoundingMode.UNNECESSARY.ordinal()] = 1;
        a[RoundingMode.DOWN.ordinal()] = 2;
        a[RoundingMode.FLOOR.ordinal()] = 3;
        a[RoundingMode.UP.ordinal()] = 4;
        a[RoundingMode.CEILING.ordinal()] = 5;
        a[RoundingMode.HALF_DOWN.ordinal()] = 6;
        a[RoundingMode.HALF_UP.ordinal()] = 7;
        try {
            a[RoundingMode.HALF_EVEN.ordinal()] = 8;
        } catch (NoSuchFieldError unused) {
        }
    }
}
