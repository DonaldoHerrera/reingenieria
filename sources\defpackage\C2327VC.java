package defpackage;

import java.util.Random;
import sun.misc.Unsafe;

/* renamed from: VC reason: default package and case insensitive filesystem */
/* compiled from: Striped64 */
abstract class C2327VC extends Number {
    static final ThreadLocal<int[]> a = new ThreadLocal<>();
    static final Random b = new Random();
    static final int c = Runtime.getRuntime().availableProcessors();
    private static final Unsafe d;
    private static final long e;
    private static final long f;
    volatile transient a[] g;
    volatile transient long h;
    volatile transient int i;

    /* renamed from: VC$a */
    /* compiled from: Striped64 */
    static final class a {
        private static final Unsafe a;
        private static final long b;
        volatile long c;

        static {
            try {
                a = C2327VC.d();
                Class<a> cls = a.class;
                b = a.objectFieldOffset(cls.getDeclaredField("c"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        a(long j) {
            this.c = j;
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(long j, long j2) {
            return a.compareAndSwapLong(this, b, j, j2);
        }
    }

    static {
        try {
            d = d();
            Class<C2327VC> cls = C2327VC.class;
            e = d.objectFieldOffset(cls.getDeclaredField("h"));
            f = d.objectFieldOffset(cls.getDeclaredField("i"));
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }

    C2327VC() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new defpackage.C2309UC());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    public static Unsafe d() {
        return Unsafe.getUnsafe();
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(long j, long j2) {
        return d.compareAndSwapLong(this, e, j, j2);
    }

    /* access modifiers changed from: 0000 */
    public abstract long b(long j, long j2);

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return d.compareAndSwapInt(this, f, 0, 1);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008d, code lost:
        if (r1.g != r9) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008f, code lost:
        r8 = new defpackage.C2327VC.a[(r10 << 1)];
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0094, code lost:
        if (r11 >= r10) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0096, code lost:
        r8[r11] = r9[r11];
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009d, code lost:
        r1.g = r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00ec A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0022 A[SYNTHETIC] */
    public final void a(long j, int[] iArr, boolean z) {
        int[] iArr2;
        int i2;
        boolean z2;
        boolean z3;
        long j2 = j;
        if (iArr == null) {
            iArr2 = new int[1];
            a.set(iArr2);
            i2 = b.nextInt();
            if (i2 == 0) {
                i2 = 1;
            }
            iArr2[0] = i2;
        } else {
            i2 = iArr[0];
            iArr2 = iArr;
        }
        boolean z4 = z;
        while (true) {
            boolean z5 = false;
            while (true) {
                a[] aVarArr = this.g;
                if (aVarArr != null) {
                    int length = aVarArr.length;
                    if (length > 0) {
                        a aVar = aVarArr[(length - 1) & i2];
                        if (aVar != null) {
                            if (!z4) {
                                z4 = true;
                            } else {
                                long j3 = aVar.c;
                                if (!aVar.a(j3, b(j3, j2))) {
                                    if (length < c && this.g == aVarArr) {
                                        if (!z5) {
                                            z5 = true;
                                        } else if (this.i == 0 && c()) {
                                            try {
                                                break;
                                            } finally {
                                                this.i = 0;
                                            }
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                            int i3 = i2 ^ (i2 << 13);
                            int i4 = i3 ^ (i3 >>> 17);
                            i2 = i4 ^ (i4 << 5);
                            iArr2[0] = i2;
                        } else if (this.i == 0) {
                            a aVar2 = new a(j2);
                            if (this.i == 0 && c()) {
                                try {
                                    a[] aVarArr2 = this.g;
                                    if (aVarArr2 != null) {
                                        int length2 = aVarArr2.length;
                                        if (length2 > 0) {
                                            int i5 = (length2 - 1) & i2;
                                            if (aVarArr2[i5] == null) {
                                                aVarArr2[i5] = aVar2;
                                                z3 = true;
                                                if (!z3) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    z3 = false;
                                    if (!z3) {
                                    }
                                } finally {
                                    this.i = 0;
                                }
                            }
                        }
                        z5 = false;
                        int i32 = i2 ^ (i2 << 13);
                        int i42 = i32 ^ (i32 >>> 17);
                        i2 = i42 ^ (i42 << 5);
                        iArr2[0] = i2;
                    }
                }
                if (this.i == 0 && this.g == aVarArr && c()) {
                    try {
                        if (this.g == aVarArr) {
                            a[] aVarArr3 = new a[2];
                            aVarArr3[i2 & 1] = new a(j2);
                            this.g = aVarArr3;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            return;
                        }
                    } finally {
                        this.i = 0;
                    }
                } else {
                    long j4 = this.h;
                    if (a(j4, b(j4, j2))) {
                        return;
                    }
                }
            }
        }
    }
}
