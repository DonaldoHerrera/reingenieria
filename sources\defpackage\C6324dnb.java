package defpackage;

/* renamed from: dnb reason: default package and case insensitive filesystem */
/* compiled from: BitEncoding */
public class C6324dnb {
    private static final boolean a;

    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        a = "true".equals(str);
    }

    private static /* synthetic */ void a(int i) {
        int i2 = i;
        String str = (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 7 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 9 || i2 == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 1 || i2 == 2 || i2 == 4 || i2 == 7 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 9 || i2 == 10) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        if (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 7 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 9 || i2 == 10) {
            objArr[0] = str2;
        } else {
            objArr[0] = "data";
        }
        String str3 = "decodeBytes";
        String str4 = "splitBytesToStringArray";
        String str5 = "encode8to7";
        String str6 = "encodeBytes";
        if (i2 == 1 || i2 == 2) {
            objArr[1] = str6;
        } else if (i2 == 4) {
            objArr[1] = str5;
        } else if (i2 == 7) {
            objArr[1] = str4;
        } else if (i2 == 12) {
            objArr[1] = "dropMarker";
        } else if (i2 == 14) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i2 == 16) {
            objArr[1] = "decode7to8";
        } else if (i2 == 9 || i2 == 10) {
            objArr[1] = str3;
        } else {
            objArr[1] = str2;
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
                break;
            case 3:
                objArr[2] = str5;
                break;
            case 5:
                objArr[2] = "addModuloByte";
                break;
            case 6:
                objArr[2] = str4;
                break;
            case 8:
                objArr[2] = str3;
                break;
            case 11:
                objArr[2] = "dropMarker";
                break;
            case 13:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 15:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = str6;
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 1 || i2 == 2 || i2 == 4 || i2 == 7 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 9 || i2 == 10) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    private static void a(byte[] bArr, int i) {
        if (bArr != null) {
            int length = bArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bArr[i2] = (byte) ((bArr[i2] + i) & 127);
            }
            return;
        }
        a(5);
        throw null;
    }

    private static byte[] b(String[] strArr) {
        if (strArr != null) {
            int i = 0;
            for (String length : strArr) {
                i += length.length();
            }
            byte[] bArr = new byte[i];
            int length2 = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length2) {
                String str = strArr[i2];
                int length3 = str.length();
                int i4 = i3;
                int i5 = 0;
                while (i5 < length3) {
                    int i6 = i4 + 1;
                    bArr[i4] = (byte) str.charAt(i5);
                    i5++;
                    i4 = i6;
                }
                i2++;
                i3 = i4;
            }
            return bArr;
        }
        a(13);
        throw null;
    }

    private static String[] c(String[] strArr) {
        if (strArr != null) {
            String[] strArr2 = (String[]) strArr.clone();
            strArr2[0] = strArr2[0].substring(1);
            if (strArr2 != null) {
                return strArr2;
            }
            a(12);
            throw null;
        }
        a(11);
        throw null;
    }

    public static byte[] a(String[] strArr) {
        if (strArr != null) {
            if (strArr.length > 0 && !strArr[0].isEmpty()) {
                char charAt = strArr[0].charAt(0);
                if (charAt == 0) {
                    byte[] a2 = C7211qnb.a(c(strArr));
                    if (a2 != null) {
                        return a2;
                    }
                    a(9);
                    throw null;
                } else if (charAt == 65535) {
                    strArr = c(strArr);
                }
            }
            byte[] b = b(strArr);
            a(b, 127);
            byte[] a3 = a(b);
            if (a3 != null) {
                return a3;
            }
            a(10);
            throw null;
        }
        a(8);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v2
  assigns: []
  uses: []
  mth insns count: 33
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    private static byte[] a(byte[] bArr) {
        ? r5;
        if (bArr != null) {
            int length = (bArr.length * 7) / 8;
            byte[] bArr2 = new byte[length];
            int i = 0;
            int i2 = 0;
            ? r52 = 0;
            while (i < length) {
                i2++;
                int i3 = r52 + 1;
                bArr2[i] = (byte) (((bArr[i2] & 255) >>> r52) + ((bArr[i2] & ((1 << i3) - 1)) << (7 - r52)));
                if (r52 == 6) {
                    i2++;
                    r5 = 0;
                } else {
                    r5 = i3;
                }
                i++;
                r52 = r5;
            }
            return bArr2;
        }
        a(15);
        throw null;
    }
}
