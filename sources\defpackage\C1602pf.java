package defpackage;

import androidx.work.j;
import androidx.work.q.a;

/* renamed from: pf reason: default package and case insensitive filesystem */
/* compiled from: WorkTypeConverters */
/* synthetic */ class C1602pf {
    static final /* synthetic */ int[] a = new int[a.values().length];
    static final /* synthetic */ int[] b = new int[androidx.work.a.values().length];
    static final /* synthetic */ int[] c = new int[j.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|37|38|40) */
    /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|40) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0070 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0084 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0098 */
    static {
        try {
            c[j.NOT_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            c[j.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            c[j.UNMETERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            c[j.NOT_ROAMING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            c[j.METERED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        b[androidx.work.a.EXPONENTIAL.ordinal()] = 1;
        try {
            b[androidx.work.a.LINEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        a[a.ENQUEUED.ordinal()] = 1;
        a[a.RUNNING.ordinal()] = 2;
        a[a.SUCCEEDED.ordinal()] = 3;
        a[a.FAILED.ordinal()] = 4;
        a[a.BLOCKED.ordinal()] = 5;
        try {
            a[a.CANCELLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
