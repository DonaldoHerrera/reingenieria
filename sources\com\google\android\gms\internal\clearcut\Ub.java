package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class Ub implements Cloneable {
    private Sb<?, ?> a;
    private Object b;
    private List<Object> c = new ArrayList();

    Ub() {
    }

    private final byte[] j() throws IOException {
        byte[] bArr = new byte[i()];
        a(Pb.a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final Ub clone() {
        Object clone;
        Ub ub = new Ub();
        try {
            ub.a = this.a;
            if (this.c == null) {
                ub.c = null;
            } else {
                ub.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof Wb) {
                    clone = (Wb) ((Wb) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    clone = ((byte[]) this.b).clone();
                } else {
                    int i = 0;
                    if (this.b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        ub.b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.b instanceof boolean[]) {
                        clone = ((boolean[]) this.b).clone();
                    } else if (this.b instanceof int[]) {
                        clone = ((int[]) this.b).clone();
                    } else if (this.b instanceof long[]) {
                        clone = ((long[]) this.b).clone();
                    } else if (this.b instanceof float[]) {
                        clone = ((float[]) this.b).clone();
                    } else if (this.b instanceof double[]) {
                        clone = ((double[]) this.b).clone();
                    } else if (this.b instanceof Wb[]) {
                        Wb[] wbArr = (Wb[]) this.b;
                        Wb[] wbArr2 = new Wb[wbArr.length];
                        ub.b = wbArr2;
                        while (i < wbArr.length) {
                            wbArr2[i] = (Wb) wbArr[i].clone();
                            i++;
                        }
                    }
                }
                ub.b = clone;
            }
            return ub;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Pb pb) throws IOException {
        if (this.b == null) {
            Iterator it = this.c.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ub)) {
            return false;
        }
        Ub ub = (Ub) obj;
        if (this.b == null || ub.b == null) {
            List<Object> list = this.c;
            if (list != null) {
                List<Object> list2 = ub.c;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(j(), ub.j());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            Sb<?, ?> sb = this.a;
            if (sb != ub.a) {
                return false;
            }
            if (!sb.a.isArray()) {
                return this.b.equals(ub.b);
            }
            Object obj2 = this.b;
            return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) ub.b) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) ub.b) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) ub.b) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) ub.b) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) ub.b) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) ub.b) : Arrays.deepEquals((Object[]) obj2, (Object[]) ub.b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(j()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: 0000 */
    public final int i() {
        if (this.b == null) {
            Iterator it = this.c.iterator();
            if (!it.hasNext()) {
                return 0;
            }
            it.next();
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }
}
