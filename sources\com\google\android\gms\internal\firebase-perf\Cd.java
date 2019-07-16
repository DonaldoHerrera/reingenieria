package com.google.android.gms.internal.firebase-perf;

import java.util.Arrays;
import java.util.Map.Entry;

final class Cd<K, V> extends yd<K, V> {
    static final yd<Object, Object> e = new Cd(null, new Object[0], 0);
    private final transient Object f;
    private final transient Object[] g;
    private final transient int h;

    private Cd(Object obj, Object[] objArr, int i) {
        this.f = obj;
        this.g = objArr;
        this.h = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bc, code lost:
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f1, code lost:
        r2[r7] = r4;
        r1 = r1 + 1;
     */
    static <K, V> Cd<K, V> a(int i, Object[] objArr) {
        Object obj;
        if (i == 0) {
            return (Cd) e;
        }
        int i2 = 0;
        if (i == 1) {
            rd.a(objArr[0], objArr[1]);
            return new Cd<>(null, objArr, 1);
        }
        Db.b(i, objArr.length >> 1);
        int max = Math.max(i, 2);
        int i3 = 1073741824;
        if (max < 751619276) {
            i3 = Integer.highestOneBit(max - 1) << 1;
            while (((double) i3) * 0.7d < ((double) max)) {
                i3 <<= 1;
            }
        } else {
            if (!(max < 1073741824)) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i == 1) {
            rd.a(objArr[0], objArr[1]);
            obj = 0;
        } else {
            int i4 = i3 - 1;
            if (i3 <= 128) {
                byte[] bArr = new byte[i3];
                Arrays.fill(bArr, -1);
                while (i2 < i) {
                    int i5 = i2 * 2;
                    Object obj2 = objArr[i5];
                    Object obj3 = objArr[i5 ^ 1];
                    rd.a(obj2, obj3);
                    int a = qd.a(obj2.hashCode());
                    while (true) {
                        int i6 = a & i4;
                        int i7 = bArr[i6] & 255;
                        if (i7 == 255) {
                            break;
                        } else if (!objArr[i7].equals(obj2)) {
                            a = i6 + 1;
                        } else {
                            throw a(obj2, obj3, objArr, i7);
                        }
                    }
                }
                obj = bArr;
            } else if (i3 <= 32768) {
                short[] sArr = new short[i3];
                Arrays.fill(sArr, -1);
                while (i2 < i) {
                    int i8 = i2 * 2;
                    Object obj4 = objArr[i8];
                    Object obj5 = objArr[i8 ^ 1];
                    rd.a(obj4, obj5);
                    int a2 = qd.a(obj4.hashCode());
                    while (true) {
                        int i9 = a2 & i4;
                        int i10 = sArr[i9] & 65535;
                        if (i10 == 65535) {
                            break;
                        } else if (!objArr[i10].equals(obj4)) {
                            a2 = i9 + 1;
                        } else {
                            throw a(obj4, obj5, objArr, i10);
                        }
                    }
                }
                obj = sArr;
            } else {
                int[] iArr = new int[i3];
                Arrays.fill(iArr, -1);
                while (i2 < i) {
                    int i11 = i2 * 2;
                    Object obj6 = objArr[i11];
                    Object obj7 = objArr[i11 ^ 1];
                    rd.a(obj6, obj7);
                    int a3 = qd.a(obj6.hashCode());
                    while (true) {
                        int i12 = a3 & i4;
                        int i13 = iArr[i12];
                        if (i13 == -1) {
                            break;
                        } else if (!objArr[i13].equals(obj6)) {
                            a3 = i12 + 1;
                        } else {
                            throw a(obj6, obj7, objArr, i13);
                        }
                    }
                }
                obj = iArr;
            }
        }
        return new Cd<>(obj, objArr, i);
    }

    /* access modifiers changed from: 0000 */
    public final Ad<Entry<K, V>> b() {
        return new C0828d(this, this.g, 0, this.h);
    }

    /* access modifiers changed from: 0000 */
    public final Ad<K> c() {
        return new C0836f(this, new C0832e(this.g, 0, this.h));
    }

    /* access modifiers changed from: 0000 */
    public final td<V> d() {
        return new C0832e(this.g, 1, this.h);
    }

    /* access modifiers changed from: 0000 */
    public final boolean e() {
        return false;
    }

    public final V get(Object obj) {
        Object obj2 = this.f;
        V[] vArr = this.g;
        int i = this.h;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (vArr[0].equals(obj)) {
                return vArr[1];
            }
            return null;
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int a = qd.a(obj.hashCode());
                while (true) {
                    int i2 = a & length;
                    byte b = bArr[i2] & 255;
                    if (b == 255) {
                        return null;
                    }
                    if (vArr[b].equals(obj)) {
                        return vArr[b ^ 1];
                    }
                    a = i2 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int a2 = qd.a(obj.hashCode());
                while (true) {
                    int i3 = a2 & length2;
                    short s = sArr[i3] & 65535;
                    if (s == 65535) {
                        return null;
                    }
                    if (vArr[s].equals(obj)) {
                        return vArr[s ^ 1];
                    }
                    a2 = i3 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int a3 = qd.a(obj.hashCode());
                while (true) {
                    int i4 = a3 & length3;
                    int i5 = iArr[i4];
                    if (i5 == -1) {
                        return null;
                    }
                    if (vArr[i5].equals(obj)) {
                        return vArr[i5 ^ 1];
                    }
                    a3 = i4 + 1;
                }
            }
        }
    }

    public final int size() {
        return this.h;
    }

    private static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        String str = "=";
        sb.append(str);
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append(str);
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}
