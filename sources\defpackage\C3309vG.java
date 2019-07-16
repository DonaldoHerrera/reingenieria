package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: vG reason: default package and case insensitive filesystem */
/* compiled from: Encoder */
public final class C3309vG {
    private static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    private static int a(C3269tG tGVar) {
        return C3329wG.a(tGVar) + C3329wG.b(tGVar) + C3329wG.c(tGVar) + C3329wG.d(tGVar);
    }

    static void b(CharSequence charSequence, C3248sF sFVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                sFVar.a((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    sFVar.a((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    sFVar.a(charAt, 4);
                }
            }
        }
    }

    public static C3369yG a(String str, C3190pG pGVar, Map<C2459bF, ?> map) throws C3046iF {
        C3229rG rGVar;
        String str2 = "ISO-8859-1";
        String obj = (map == null || !map.containsKey(C2459bF.CHARACTER_SET)) ? str2 : map.get(C2459bF.CHARACTER_SET).toString();
        C3209qG a2 = a(str, obj);
        C3248sF sFVar = new C3248sF();
        if (a2 == C3209qG.BYTE && !str2.equals(obj)) {
            C3288uF a3 = C3288uF.a(obj);
            if (a3 != null) {
                a(a3, sFVar);
            }
        }
        a(a2, sFVar);
        C3248sF sFVar2 = new C3248sF();
        a(str, a2, sFVar2, obj);
        if (map == null || !map.containsKey(C2459bF.QR_VERSION)) {
            rGVar = a(pGVar, a2, sFVar, sFVar2);
        } else {
            rGVar = C3229rG.a(Integer.parseInt(map.get(C2459bF.QR_VERSION).toString()));
            if (!a(a(a2, sFVar, sFVar2, rGVar), rGVar, pGVar)) {
                throw new C3046iF("Data too big for requested version");
            }
        }
        C3248sF sFVar3 = new C3248sF();
        sFVar3.a(sFVar);
        a(a2 == C3209qG.BYTE ? sFVar2.j() : str.length(), rGVar, a2, sFVar3);
        sFVar3.a(sFVar2);
        b a4 = rGVar.a(pGVar);
        int b = rGVar.b() - a4.d();
        a(b, sFVar3);
        C3248sF a5 = a(sFVar3, rGVar.b(), b, a4.c());
        C3369yG yGVar = new C3369yG();
        yGVar.a(pGVar);
        yGVar.a(a2);
        yGVar.a(rGVar);
        int a6 = rGVar.a();
        C3269tG tGVar = new C3269tG(a6, a6);
        int a7 = a(a5, pGVar, rGVar, tGVar);
        yGVar.b(a7);
        C3349xG.a(a5, pGVar, rGVar, a7, tGVar);
        yGVar.a(tGVar);
        return yGVar;
    }

    private static C3229rG a(C3190pG pGVar, C3209qG qGVar, C3248sF sFVar, C3248sF sFVar2) throws C3046iF {
        return a(a(qGVar, sFVar, sFVar2, a(a(qGVar, sFVar, sFVar2, C3229rG.a(1)), pGVar)), pGVar);
    }

    private static int a(C3209qG qGVar, C3248sF sFVar, C3248sF sFVar2, C3229rG rGVar) {
        return sFVar.i() + qGVar.a(rGVar) + sFVar2.i();
    }

    static int a(int i) {
        int[] iArr = a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    private static C3209qG a(String str, String str2) {
        if ("Shift_JIS".equals(str2) && a(str)) {
            return C3209qG.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (a((int) charAt) == -1) {
                return C3209qG.BYTE;
            } else {
                z = true;
            }
        }
        if (z) {
            return C3209qG.ALPHANUMERIC;
        }
        if (z2) {
            return C3209qG.NUMERIC;
        }
        return C3209qG.BYTE;
    }

    private static boolean a(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                byte b = bytes[i] & 255;
                if ((b < 129 || b > 159) && (b < 224 || b > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static int a(C3248sF sFVar, C3190pG pGVar, C3229rG rGVar, C3269tG tGVar) throws C3046iF {
        int i = BaseClientBuilder.API_PRIORITY_OTHER;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            C3349xG.a(sFVar, pGVar, rGVar, i3, tGVar);
            int a2 = a(tGVar);
            if (a2 < i) {
                i2 = i3;
                i = a2;
            }
        }
        return i2;
    }

    private static C3229rG a(int i, C3190pG pGVar) throws C3046iF {
        for (int i2 = 1; i2 <= 40; i2++) {
            C3229rG a2 = C3229rG.a(i2);
            if (a(i, a2, pGVar)) {
                return a2;
            }
        }
        throw new C3046iF("Data too big");
    }

    private static boolean a(int i, C3229rG rGVar, C3190pG pGVar) {
        return rGVar.b() - rGVar.a(pGVar).d() >= (i + 7) / 8;
    }

    static void a(int i, C3248sF sFVar) throws C3046iF {
        int i2 = i << 3;
        if (sFVar.i() <= i2) {
            for (int i3 = 0; i3 < 4 && sFVar.i() < i2; i3++) {
                sFVar.a(false);
            }
            int i4 = sFVar.i() & 7;
            if (i4 > 0) {
                while (i4 < 8) {
                    sFVar.a(false);
                    i4++;
                }
            }
            int j = i - sFVar.j();
            for (int i5 = 0; i5 < j; i5++) {
                sFVar.a((i5 & 1) == 0 ? 236 : 17, 8);
            }
            if (sFVar.i() != i2) {
                throw new C3046iF("Bits size does not equal capacity");
            }
            return;
        }
        StringBuilder sb = new StringBuilder("data bits cannot fit in the QR Code");
        sb.append(sFVar.i());
        sb.append(" > ");
        sb.append(i2);
        throw new C3046iF(sb.toString());
    }

    static void a(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws C3046iF {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new C3046iF("EC bytes mismatch");
            } else if (i3 != i6 + i5) {
                throw new C3046iF("RS blocks mismatch");
            } else if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new C3046iF("Total bytes mismatch");
            } else if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
            }
        } else {
            throw new C3046iF("Block ID too large");
        }
    }

    static C3248sF a(C3248sF sFVar, int i, int i2, int i3) throws C3046iF {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (sFVar.j() == i5) {
            ArrayList<C3249sG> arrayList = new ArrayList<>(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                int[] iArr3 = iArr2;
                a(i, i2, i3, i10, iArr, iArr2);
                int i11 = iArr[0];
                byte[] bArr = new byte[i11];
                sFVar.a(i7 << 3, bArr, 0, i11);
                byte[] a2 = a(bArr, iArr3[0]);
                arrayList.add(new C3249sG(bArr, a2));
                i8 = Math.max(i8, i11);
                i9 = Math.max(i9, a2.length);
                i7 += iArr[0];
            }
            if (i5 == i7) {
                C3248sF sFVar2 = new C3248sF();
                for (int i12 = 0; i12 < i8; i12++) {
                    for (C3249sG a3 : arrayList) {
                        byte[] a4 = a3.a();
                        if (i12 < a4.length) {
                            sFVar2.a(a4[i12], 8);
                        }
                    }
                }
                for (int i13 = 0; i13 < i9; i13++) {
                    for (C3249sG b : arrayList) {
                        byte[] b2 = b.b();
                        if (i13 < b2.length) {
                            sFVar2.a(b2[i13], 8);
                        }
                    }
                }
                if (i4 == sFVar2.j()) {
                    return sFVar2;
                }
                StringBuilder sb = new StringBuilder("Interleaving error: ");
                sb.append(i4);
                sb.append(" and ");
                sb.append(sFVar2.j());
                sb.append(" differ.");
                throw new C3046iF(sb.toString());
            }
            throw new C3046iF("Data bytes does not match offset");
        }
        throw new C3046iF("Number of bits and data bytes does not match");
    }

    static byte[] a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new C3348xF(C3308vF.e).a(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    static void a(C3209qG qGVar, C3248sF sFVar) {
        sFVar.a(qGVar.a(), 4);
    }

    static void a(int i, C3229rG rGVar, C3209qG qGVar, C3248sF sFVar) throws C3046iF {
        int a2 = qGVar.a(rGVar);
        int i2 = 1 << a2;
        if (i < i2) {
            sFVar.a(i, a2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is bigger than ");
        sb.append(i2 - 1);
        throw new C3046iF(sb.toString());
    }

    static void a(String str, C3209qG qGVar, C3248sF sFVar, String str2) throws C3046iF {
        int i = C3289uG.a[qGVar.ordinal()];
        if (i == 1) {
            b(str, sFVar);
        } else if (i == 2) {
            a((CharSequence) str, sFVar);
        } else if (i == 3) {
            a(str, sFVar, str2);
        } else if (i == 4) {
            a(str, sFVar);
        } else {
            StringBuilder sb = new StringBuilder("Invalid mode: ");
            sb.append(qGVar);
            throw new C3046iF(sb.toString());
        }
    }

    static void a(CharSequence charSequence, C3248sF sFVar) throws C3046iF {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int a2 = a((int) charSequence.charAt(i));
            if (a2 != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int a3 = a((int) charSequence.charAt(i2));
                    if (a3 != -1) {
                        sFVar.a((a2 * 45) + a3, 11);
                        i += 2;
                    } else {
                        throw new C3046iF();
                    }
                } else {
                    sFVar.a(a2, 6);
                    i = i2;
                }
            } else {
                throw new C3046iF();
            }
        }
    }

    static void a(String str, C3248sF sFVar, String str2) throws C3046iF {
        try {
            for (byte a2 : str.getBytes(str2)) {
                sFVar.a(a2, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new C3046iF((Throwable) e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC] */
    static void a(String str, C3248sF sFVar) throws C3046iF {
        int i;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            int i2 = 0;
            while (i2 < length) {
                byte b = ((bytes[i2] & 255) << 8) | (bytes[i2 + 1] & 255);
                byte b2 = 33088;
                if (b < 33088 || b > 40956) {
                    if (b < 57408 || b > 60351) {
                        i = -1;
                        if (i == -1) {
                            sFVar.a(((i >> 8) * 192) + (i & 255), 13);
                            i2 += 2;
                        } else {
                            throw new C3046iF("Invalid byte sequence");
                        }
                    } else {
                        b2 = 49472;
                    }
                }
                i = b - b2;
                if (i == -1) {
                }
            }
        } catch (UnsupportedEncodingException e) {
            throw new C3046iF((Throwable) e);
        }
    }

    private static void a(C3288uF uFVar, C3248sF sFVar) {
        sFVar.a(C3209qG.ECI.a(), 4);
        sFVar.a(uFVar.a(), 8);
    }
}
