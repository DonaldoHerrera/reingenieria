package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PublicSuffixDatabase {
    private static final byte[] a = {42};
    private static final String[] b = new String[0];
    private static final String[] c = {"*"};
    private static final PublicSuffixDatabase d = new PublicSuffixDatabase();
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final CountDownLatch f = new CountDownLatch(1);
    private byte[] g;
    private byte[] h;

    public static PublicSuffixDatabase a() {
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        if (r0 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r1 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        r0.close();
     */
    private void b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            C6961nAb a2 = C7720yAb.a((HAb) new C7306sAb(C7720yAb.a(resourceAsStream)));
            byte[] bArr = new byte[a2.readInt()];
            a2.readFully(bArr);
            byte[] bArr2 = new byte[a2.readInt()];
            a2.readFully(bArr2);
            if (a2 != null) {
                a2.close();
            }
            synchronized (this) {
                this.g = bArr;
                this.h = bArr2;
            }
            this.f.countDown();
            return;
        }
        return;
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0025 */
    private void c() {
        boolean z;
        z = false;
        while (true) {
            try {
                b();
            } catch (InterruptedIOException ) {
                Thread.interrupted();
                z = true;
            } catch (IOException e2) {
                _zb.a().a(5, "Failed to read public suffix list", (Throwable) e2);
                if (z) {
                    Thread.currentThread().interrupt();
                }
                return;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
            Thread.interrupted();
            z = true;
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public String a(String str) {
        int i;
        int i2;
        if (str != null) {
            String str2 = "\\.";
            String[] split = IDN.toUnicode(str).split(str2);
            String[] a2 = a(split);
            if (split.length == a2.length && a2[0].charAt(0) != '!') {
                return null;
            }
            if (a2[0].charAt(0) == '!') {
                i2 = split.length;
                i = a2.length;
            } else {
                i2 = split.length;
                i = a2.length + 1;
            }
            StringBuilder sb = new StringBuilder();
            String[] split2 = str.split(str2);
            for (int i3 = i2 - i; i3 < split2.length; i3++) {
                sb.append(split2[i3]);
                sb.append('.');
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        throw new NullPointerException("domain == null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009b  */
    private String[] a(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        int i = 0;
        if (this.e.get() || !this.e.compareAndSet(false, true)) {
            try {
                this.f.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            c();
        }
        synchronized (this) {
            if (this.g == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        byte[][] bArr = new byte[strArr.length][];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(StandardCharsets.UTF_8);
        }
        int i3 = 0;
        while (true) {
            if (i3 >= bArr.length) {
                str = null;
                break;
            }
            str = a(this.g, bArr, i3);
            if (str != null) {
                break;
            }
            i3++;
        }
        if (bArr.length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            int i4 = 0;
            while (true) {
                if (i4 >= bArr2.length - 1) {
                    break;
                }
                bArr2[i4] = a;
                str2 = a(this.g, bArr2, i4);
                if (str2 != null) {
                    break;
                }
                i4++;
            }
        }
        str2 = null;
        if (str2 != null) {
            while (true) {
                if (i >= bArr.length - 1) {
                    break;
                }
                str3 = a(this.h, bArr, i);
                if (str3 != null) {
                    break;
                }
                i++;
            }
            if (str3 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("!");
                sb.append(str3);
                return sb.toString().split("\\.");
            } else if (str == null && str2 == null) {
                return c;
            } else {
                if (str != null) {
                    strArr2 = str.split("\\.");
                } else {
                    strArr2 = b;
                }
                if (str2 != null) {
                    strArr3 = str2.split("\\.");
                } else {
                    strArr3 = b;
                }
                if (strArr2.length <= strArr3.length) {
                    strArr2 = strArr3;
                }
                return strArr2;
            }
        }
        str3 = null;
        if (str3 == null) {
        }
    }

    private static String a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        byte b2;
        int i3;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = (i4 + length) / 2;
            while (i5 > -1 && bArr3[i5] != 10) {
                i5--;
            }
            int i6 = i5 + 1;
            int i7 = 1;
            while (true) {
                i2 = i6 + i7;
                if (bArr3[i2] == 10) {
                    break;
                }
                i7++;
            }
            int i8 = i2 - i6;
            int i9 = i;
            boolean z = false;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (z) {
                    z = false;
                    b2 = 46;
                } else {
                    b2 = bArr4[i9][i10] & 255;
                }
                i3 = b2 - (bArr3[i6 + i11] & 255);
                if (i3 == 0) {
                    i11++;
                    i10++;
                    if (i11 == i8) {
                        break;
                    } else if (bArr4[i9].length == i10) {
                        if (i9 == bArr4.length - 1) {
                            break;
                        }
                        i9++;
                        z = true;
                        i10 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i12 = i8 - i11;
                    int length2 = bArr4[i9].length - i10;
                    while (true) {
                        i9++;
                        if (i9 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i9].length;
                    }
                    if (length2 >= i12) {
                        if (length2 <= i12) {
                            return new String(bArr3, i6, i8, StandardCharsets.UTF_8);
                        }
                    }
                }
                i4 = i2 + 1;
            }
            length = i6 - 1;
        }
        return null;
    }
}
