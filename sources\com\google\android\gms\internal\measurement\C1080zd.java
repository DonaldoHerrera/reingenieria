package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.zd reason: case insensitive filesystem */
final class C1080zd implements Cloneable {
    private C1068xd<?, ?> a;
    private Object b;
    private List<Gd> c = new ArrayList();

    C1080zd() {
    }

    private final byte[] j() throws IOException {
        byte[] bArr = new byte[i()];
        a(C1062wd.a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final C1080zd clone() {
        C1080zd zdVar = new C1080zd();
        try {
            zdVar.a = this.a;
            if (this.c == null) {
                zdVar.c = null;
            } else {
                zdVar.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof Ed) {
                    zdVar.b = (Ed) ((Ed) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    zdVar.b = ((byte[]) this.b).clone();
                } else {
                    int i = 0;
                    if (this.b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        zdVar.b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.b instanceof boolean[]) {
                        zdVar.b = ((boolean[]) this.b).clone();
                    } else if (this.b instanceof int[]) {
                        zdVar.b = ((int[]) this.b).clone();
                    } else if (this.b instanceof long[]) {
                        zdVar.b = ((long[]) this.b).clone();
                    } else if (this.b instanceof float[]) {
                        zdVar.b = ((float[]) this.b).clone();
                    } else if (this.b instanceof double[]) {
                        zdVar.b = ((double[]) this.b).clone();
                    } else if (this.b instanceof Ed[]) {
                        Ed[] edArr = (Ed[]) this.b;
                        Ed[] edArr2 = new Ed[edArr.length];
                        zdVar.b = edArr2;
                        while (i < edArr.length) {
                            edArr2[i] = (Ed) edArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return zdVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Gd gd) throws IOException {
        List<Gd> list = this.c;
        if (list != null) {
            list.add(gd);
            return;
        }
        Object obj = this.b;
        if (obj instanceof Ed) {
            byte[] bArr = gd.b;
            C1044td a2 = C1044td.a(bArr, 0, bArr.length);
            int e = a2.e();
            if (e == bArr.length - C1062wd.b(e)) {
                Ed a3 = ((Ed) this.b).a(a2);
                this.a = this.a;
                this.b = a3;
                this.c = null;
                return;
            }
            throw Bd.a();
        } else if (obj instanceof Ed[]) {
            Collections.singletonList(gd);
            throw new NoSuchMethodError();
        } else if (obj instanceof C1026qc) {
            Collections.singletonList(gd);
            throw new NoSuchMethodError();
        } else if (obj instanceof C1026qc[]) {
            Collections.singletonList(gd);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(gd);
            throw new NoSuchMethodError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1080zd)) {
            return false;
        }
        C1080zd zdVar = (C1080zd) obj;
        if (this.b == null || zdVar.b == null) {
            List<Gd> list = this.c;
            if (list != null) {
                List<Gd> list2 = zdVar.c;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(j(), zdVar.j());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            C1068xd<?, ?> xdVar = this.a;
            if (xdVar != zdVar.a) {
                return false;
            }
            if (!xdVar.a.isArray()) {
                return this.b.equals(zdVar.b);
            }
            Object obj2 = this.b;
            if (obj2 instanceof byte[]) {
                return Arrays.equals((byte[]) obj2, (byte[]) zdVar.b);
            }
            if (obj2 instanceof int[]) {
                return Arrays.equals((int[]) obj2, (int[]) zdVar.b);
            }
            if (obj2 instanceof long[]) {
                return Arrays.equals((long[]) obj2, (long[]) zdVar.b);
            }
            if (obj2 instanceof float[]) {
                return Arrays.equals((float[]) obj2, (float[]) zdVar.b);
            }
            if (obj2 instanceof double[]) {
                return Arrays.equals((double[]) obj2, (double[]) zdVar.b);
            }
            if (obj2 instanceof boolean[]) {
                return Arrays.equals((boolean[]) obj2, (boolean[]) zdVar.b);
            }
            return Arrays.deepEquals((Object[]) obj2, (Object[]) zdVar.b);
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
            int i = 0;
            for (Gd gd : this.c) {
                i += C1062wd.c(gd.a) + 0 + gd.b.length;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final void a(C1062wd wdVar) throws IOException {
        if (this.b == null) {
            for (Gd gd : this.c) {
                wdVar.d(gd.a);
                wdVar.b(gd.b);
            }
            return;
        }
        throw new NoSuchMethodError();
    }
}
