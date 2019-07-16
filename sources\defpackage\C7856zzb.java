package defpackage;

import java.io.IOException;

/* renamed from: zzb reason: default package and case insensitive filesystem */
/* compiled from: Http2 */
public final class C7856zzb {
    static final C7030oAb a = C7030oAb.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    static final String[] c = new String[64];
    static final String[] d = new String[256];

    static {
        String str;
        int[] iArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = Kyb.a("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr2 = {1};
        strArr2[8] = "PADDED";
        int length = iArr2.length;
        int i3 = 0;
        while (true) {
            str = "|PADDED";
            if (i3 >= length) {
                break;
            }
            int i4 = iArr2[i3];
            String[] strArr3 = c;
            int i5 = i4 | 8;
            StringBuilder sb = new StringBuilder();
            sb.append(c[i4]);
            sb.append(str);
            strArr3[i5] = sb.toString();
            i3++;
        }
        String[] strArr4 = c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        for (int i6 : new int[]{4, 32, 36}) {
            for (int i7 : iArr2) {
                String[] strArr5 = c;
                int i8 = i7 | i6;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c[i7]);
                sb2.append('|');
                sb2.append(c[i6]);
                strArr5[i8] = sb2.toString();
                String[] strArr6 = c;
                int i9 = i8 | 8;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(c[i7]);
                sb3.append('|');
                sb3.append(c[i6]);
                sb3.append(str);
                strArr6[i9] = sb3.toString();
            }
        }
        while (true) {
            String[] strArr7 = c;
            if (i < strArr7.length) {
                if (strArr7[i] == null) {
                    strArr7[i] = d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private C7856zzb() {
    }

    static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(Kyb.a(str, objArr));
    }

    static IOException b(String str, Object... objArr) throws IOException {
        throw new IOException(Kyb.a(str, objArr));
    }

    static String a(boolean z, int i, int i2, byte b2, byte b3) {
        String[] strArr = b;
        String a2 = b2 < strArr.length ? strArr[b2] : Kyb.a("0x%02x", Byte.valueOf(b2));
        String a3 = a(b2, b3);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = a2;
        objArr[4] = a3;
        return Kyb.a("%s 0x%08x %5d %-13s %s", objArr);
    }

    static String a(byte b2, byte b3) {
        String str;
        if (b3 == 0) {
            return "";
        }
        if (!(b2 == 2 || b2 == 3)) {
            if (b2 == 4 || b2 == 6) {
                if (b3 == 1) {
                    str = "ACK";
                } else {
                    str = d[b3];
                }
                return str;
            } else if (!(b2 == 7 || b2 == 8)) {
                String[] strArr = c;
                String str2 = b3 < strArr.length ? strArr[b3] : d[b3];
                if (b2 != 5 || (b3 & 4) == 0) {
                    return (b2 != 0 || (b3 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                }
                return str2.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return d[b3];
    }
}
