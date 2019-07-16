package defpackage;

/* renamed from: tD reason: default package and case insensitive filesystem */
/* compiled from: Hashing */
final class C3266tD {
    static int a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    static int a(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }

    static int a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d * ((double) highestOneBit)))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        if (i2 <= 0) {
            i2 = 1073741824;
        }
        return i2;
    }
}
