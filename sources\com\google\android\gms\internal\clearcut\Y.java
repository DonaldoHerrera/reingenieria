package com.google.android.gms.internal.clearcut;

final /* synthetic */ class Y {
    static final /* synthetic */ int[] a = new int[Nb.values().length];
    static final /* synthetic */ int[] b = new int[Ib.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(54:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(57:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
    /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
    /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
    /* JADX WARNING: Can't wrap try/catch for region: R(61:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
    /* JADX WARNING: Can't wrap try/catch for region: R(63:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
    /* JADX WARNING: Can't wrap try/catch for region: R(64:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
    /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0086 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0092 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00aa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00ce */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00ed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0101 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x010b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0115 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0129 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0133 */
    static {
        try {
            b[Ib.DOUBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[Ib.FLOAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[Ib.INT64.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[Ib.UINT64.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[Ib.INT32.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[Ib.FIXED64.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            b[Ib.FIXED32.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            b[Ib.BOOL.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        b[Ib.GROUP.ordinal()] = 9;
        b[Ib.MESSAGE.ordinal()] = 10;
        b[Ib.STRING.ordinal()] = 11;
        b[Ib.BYTES.ordinal()] = 12;
        b[Ib.UINT32.ordinal()] = 13;
        b[Ib.SFIXED32.ordinal()] = 14;
        b[Ib.SFIXED64.ordinal()] = 15;
        b[Ib.SINT32.ordinal()] = 16;
        b[Ib.SINT64.ordinal()] = 17;
        try {
            b[Ib.ENUM.ordinal()] = 18;
        } catch (NoSuchFieldError unused9) {
        }
        a[Nb.INT.ordinal()] = 1;
        a[Nb.LONG.ordinal()] = 2;
        a[Nb.FLOAT.ordinal()] = 3;
        a[Nb.DOUBLE.ordinal()] = 4;
        a[Nb.BOOLEAN.ordinal()] = 5;
        a[Nb.STRING.ordinal()] = 6;
        a[Nb.BYTE_STRING.ordinal()] = 7;
        a[Nb.ENUM.ordinal()] = 8;
        try {
            a[Nb.MESSAGE.ordinal()] = 9;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
