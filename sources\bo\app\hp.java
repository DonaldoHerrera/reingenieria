package bo.app;

import android.opengl.GLES10;

public final class hp {
    private static gt a;

    /* renamed from: bo.app.hp$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[gw.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            a[gw.FIT_INSIDE.ordinal()] = 1;
            a[gw.CROP.ordinal()] = 2;
        }
    }

    static {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(3379, iArr, 0);
        int max = Math.max(iArr[0], 2048);
        a = new gt(max, max);
    }

    public static gt a(hi hiVar, gt gtVar) {
        int a2 = hiVar.a();
        if (a2 <= 0) {
            a2 = gtVar.a();
        }
        int b = hiVar.b();
        if (b <= 0) {
            b = gtVar.b();
        }
        return new gt(a2, b);
    }

    public static float b(gt gtVar, gt gtVar2, gw gwVar, boolean z) {
        int a2 = gtVar.a();
        int b = gtVar.b();
        int a3 = gtVar2.a();
        int b2 = gtVar2.b();
        float f = (float) a2;
        float f2 = f / ((float) a3);
        float f3 = (float) b;
        float f4 = f3 / ((float) b2);
        if ((gwVar != gw.FIT_INSIDE || f2 < f4) && (gwVar != gw.CROP || f2 >= f4)) {
            a3 = (int) (f / f4);
        } else {
            b2 = (int) (f3 / f2);
        }
        if ((z || a3 >= a2 || b2 >= b) && (!z || a3 == a2 || b2 == b)) {
            return 1.0f;
        }
        return ((float) a3) / f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    public static int a(gt gtVar, gt gtVar2, gw gwVar, boolean z) {
        int i;
        int i2;
        int a2 = gtVar.a();
        int b = gtVar.b();
        int a3 = gtVar2.a();
        int b2 = gtVar2.b();
        int i3 = AnonymousClass1.a[gwVar.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                i = 1;
            } else if (z) {
                int i4 = a2 / 2;
                int i5 = b / 2;
                i2 = 1;
                while (i4 / i2 > a3 && i5 / i2 > b2) {
                    i2 *= 2;
                }
            } else {
                i = Math.min(a2 / a3, b / b2);
            }
            if (i < 1) {
                i = 1;
            }
            return a(a2, b, i, z);
        } else if (z) {
            int i6 = a2 / 2;
            int i7 = b / 2;
            int i8 = 1;
            while (true) {
                if (i6 / i2 <= a3 && i7 / i2 <= b2) {
                    break;
                }
                i8 = i2 * 2;
            }
        } else {
            i = Math.max(a2 / a3, b / b2);
            if (i < 1) {
            }
            return a(a2, b, i, z);
        }
        i = i2;
        if (i < 1) {
        }
        return a(a2, b, i, z);
    }

    private static int a(int i, int i2, int i3, boolean z) {
        int a2 = a.a();
        int b = a.b();
        while (true) {
            if (i / i3 <= a2 && i2 / i3 <= b) {
                return i3;
            }
            i3 = z ? i3 * 2 : i3 + 1;
        }
    }

    public static int a(gt gtVar) {
        int a2 = gtVar.a();
        int b = gtVar.b();
        return Math.max((int) Math.ceil((double) (((float) a2) / ((float) a.a()))), (int) Math.ceil((double) (((float) b) / ((float) a.b()))));
    }
}
