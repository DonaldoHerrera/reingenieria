package defpackage;

import java.util.Comparator;

/* renamed from: Ab reason: default package and case insensitive filesystem */
/* compiled from: FontsContractCompat */
class C0190Ab implements Comparator<byte[]> {
    C0190Ab() {
    }

    /* renamed from: a */
    public int compare(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        if (bArr.length != bArr2.length) {
            i2 = bArr.length;
            i = bArr2.length;
        } else {
            int i3 = 0;
            while (i3 < bArr.length) {
                if (bArr[i3] != bArr2[i3]) {
                    i2 = bArr[i3];
                    i = bArr2[i3];
                } else {
                    i3++;
                }
            }
            return 0;
        }
        return i2 - i;
    }
}
