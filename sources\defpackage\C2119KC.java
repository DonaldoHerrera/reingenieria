package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: KC reason: default package and case insensitive filesystem */
/* compiled from: LongAdder */
final class C2119KC extends C2327VC implements Serializable, C2042GC {
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.i = 0;
        this.g = null;
        this.h = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(d());
    }

    public void a() {
        add(1);
    }

    public void add(long j) {
        a[] aVarArr = this.g;
        if (aVarArr == null) {
            long j2 = this.h;
            if (a(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = (int[]) C2327VC.a.get();
        boolean z = true;
        if (!(iArr == null || aVarArr == null)) {
            int length = aVarArr.length;
            if (length >= 1) {
                a aVar = aVarArr[(length - 1) & iArr[0]];
                if (aVar != null) {
                    long j3 = aVar.c;
                    z = aVar.a(j3, j3 + j);
                    if (z) {
                        return;
                    }
                }
            }
        }
        a(j, iArr, z);
    }

    /* access modifiers changed from: 0000 */
    public final long b(long j, long j2) {
        return j + j2;
    }

    public long d() {
        long j = this.h;
        a[] aVarArr = this.g;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                if (aVar != null) {
                    j += aVar.c;
                }
            }
        }
        return j;
    }

    public double doubleValue() {
        return (double) d();
    }

    public float floatValue() {
        return (float) d();
    }

    public int intValue() {
        return (int) d();
    }

    public long longValue() {
        return d();
    }

    public String toString() {
        return Long.toString(d());
    }
}
