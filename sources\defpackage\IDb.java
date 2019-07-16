package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: IDb reason: default package */
/* compiled from: StandardZoneRules */
final class IDb extends NDb implements Serializable {
    private final long[] a;
    private final PBb[] b;
    private final long[] c;
    private final C7032oBb[] d;
    private final PBb[] e;
    private final MDb[] f;
    private final ConcurrentMap<Integer, KDb[]> g = new ConcurrentHashMap();

    private IDb(long[] jArr, PBb[] pBbArr, long[] jArr2, PBb[] pBbArr2, MDb[] mDbArr) {
        this.a = jArr;
        this.b = pBbArr;
        this.c = jArr2;
        this.e = pBbArr2;
        this.f = mDbArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jArr2.length) {
            int i2 = i + 1;
            KDb kDb = new KDb(jArr2[i], pBbArr2[i], pBbArr2[i2]);
            if (kDb.u()) {
                arrayList.add(kDb.b());
                arrayList.add(kDb.a());
            } else {
                arrayList.add(kDb.a());
                arrayList.add(kDb.b());
            }
            i = i2;
        }
        this.d = (C7032oBb[]) arrayList.toArray(new C7032oBb[arrayList.size()]);
    }

    private Object c(C7032oBb obb) {
        int i = 0;
        if (this.f.length > 0) {
            C7032oBb[] obbArr = this.d;
            if (obb.b((ZBb<?>) obbArr[obbArr.length - 1])) {
                KDb[] a2 = a(obb.L());
                Object obj = null;
                int length = a2.length;
                while (i < length) {
                    KDb kDb = a2[i];
                    Object a3 = a(obb, kDb);
                    if ((a3 instanceof KDb) || a3.equals(kDb.f())) {
                        return a3;
                    }
                    i++;
                    obj = a3;
                }
                return obj;
            }
        }
        int binarySearch = Arrays.binarySearch(this.d, obb);
        if (binarySearch == -1) {
            return this.e[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            C7032oBb[] obbArr2 = this.d;
            if (binarySearch < obbArr2.length - 1) {
                int i2 = binarySearch + 1;
                if (obbArr2[binarySearch].equals(obbArr2[i2])) {
                    binarySearch = i2;
                }
            }
        }
        if ((binarySearch & 1) != 0) {
            return this.e[(binarySearch / 2) + 1];
        }
        C7032oBb[] obbArr3 = this.d;
        C7032oBb obb2 = obbArr3[binarySearch];
        C7032oBb obb3 = obbArr3[binarySearch + 1];
        PBb[] pBbArr = this.e;
        int i3 = binarySearch / 2;
        PBb pBb = pBbArr[i3];
        PBb pBb2 = pBbArr[i3 + 1];
        if (pBb2.d() > pBb.d()) {
            return new KDb(obb2, pBb, pBb2);
        }
        return new KDb(obb3, pBb, pBb2);
    }

    private Object writeReplace() {
        return new HDb(1, this);
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.a.length);
        for (long a2 : this.a) {
            HDb.a(a2, dataOutput);
        }
        for (PBb a3 : this.b) {
            HDb.a(a3, dataOutput);
        }
        dataOutput.writeInt(this.c.length);
        for (long a4 : this.c) {
            HDb.a(a4, dataOutput);
        }
        for (PBb a5 : this.e) {
            HDb.a(a5, dataOutput);
        }
        dataOutput.writeByte(this.f.length);
        for (MDb a6 : this.f) {
            a6.a(dataOutput);
        }
    }

    public List<PBb> b(C7032oBb obb) {
        Object c2 = c(obb);
        if (c2 instanceof KDb) {
            return ((KDb) c2).g();
        }
        return Collections.singletonList((PBb) c2);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IDb) {
            IDb iDb = (IDb) obj;
            if (!Arrays.equals(this.a, iDb.a) || !Arrays.equals(this.b, iDb.b) || !Arrays.equals(this.c, iDb.c) || !Arrays.equals(this.e, iDb.e) || !Arrays.equals(this.f, iDb.f)) {
                z = false;
            }
            return z;
        } else if (!(obj instanceof a)) {
            return false;
        } else {
            if (!a() || !a(C6623iBb.a).equals(((a) obj).a(C6623iBb.a))) {
                z = false;
            }
            return z;
        }
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.a) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StandardZoneRules[currentStandardOffset=");
        PBb[] pBbArr = this.b;
        sb.append(pBbArr[pBbArr.length - 1]);
        sb.append("]");
        return sb.toString();
    }

    public boolean b(C6623iBb ibb) {
        return !c(ibb).equals(a(ibb));
    }

    static IDb a(DataInput dataInput) throws IOException, ClassNotFoundException {
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        for (int i = 0; i < readInt; i++) {
            jArr[i] = HDb.b(dataInput);
        }
        PBb[] pBbArr = new PBb[(readInt + 1)];
        for (int i2 = 0; i2 < pBbArr.length; i2++) {
            pBbArr[i2] = HDb.c(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = new long[readInt2];
        for (int i3 = 0; i3 < readInt2; i3++) {
            jArr2[i3] = HDb.b(dataInput);
        }
        PBb[] pBbArr2 = new PBb[(readInt2 + 1)];
        for (int i4 = 0; i4 < pBbArr2.length; i4++) {
            pBbArr2[i4] = HDb.c(dataInput);
        }
        byte readByte = dataInput.readByte();
        MDb[] mDbArr = new MDb[readByte];
        for (int i5 = 0; i5 < readByte; i5++) {
            mDbArr[i5] = MDb.a(dataInput);
        }
        IDb iDb = new IDb(jArr, pBbArr, jArr2, pBbArr2, mDbArr);
        return iDb;
    }

    public PBb c(C6623iBb ibb) {
        int binarySearch = Arrays.binarySearch(this.a, ibb.J());
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.b[binarySearch + 1];
    }

    public boolean a() {
        return this.c.length == 0;
    }

    public PBb a(C6623iBb ibb) {
        long J = ibb.J();
        if (this.f.length > 0) {
            long[] jArr = this.c;
            if (J > jArr[jArr.length - 1]) {
                PBb[] pBbArr = this.e;
                KDb[] a2 = a(a(J, pBbArr[pBbArr.length - 1]));
                KDb kDb = null;
                for (int i = 0; i < a2.length; i++) {
                    kDb = a2[i];
                    if (J < kDb.toEpochSecond()) {
                        return kDb.f();
                    }
                }
                return kDb.e();
            }
        }
        int binarySearch = Arrays.binarySearch(this.c, J);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.e[binarySearch + 1];
    }

    public KDb a(C7032oBb obb) {
        Object c2 = c(obb);
        if (c2 instanceof KDb) {
            return (KDb) c2;
        }
        return null;
    }

    private Object a(C7032oBb obb, KDb kDb) {
        C7032oBb b2 = kDb.b();
        if (kDb.u()) {
            if (obb.c((ZBb<?>) b2)) {
                return kDb.f();
            }
            if (obb.c((ZBb<?>) kDb.a())) {
                return kDb;
            }
            return kDb.e();
        } else if (!obb.c((ZBb<?>) b2)) {
            return kDb.e();
        } else {
            return obb.c((ZBb<?>) kDb.a()) ? kDb.f() : kDb;
        }
    }

    public boolean a(C7032oBb obb, PBb pBb) {
        return b(obb).contains(pBb);
    }

    private KDb[] a(int i) {
        Integer valueOf = Integer.valueOf(i);
        KDb[] kDbArr = (KDb[]) this.g.get(valueOf);
        if (kDbArr != null) {
            return kDbArr;
        }
        MDb[] mDbArr = this.f;
        KDb[] kDbArr2 = new KDb[mDbArr.length];
        for (int i2 = 0; i2 < mDbArr.length; i2++) {
            kDbArr2[i2] = mDbArr[i2].a(i);
        }
        if (i < 2100) {
            this.g.putIfAbsent(valueOf, kDbArr2);
        }
        return kDbArr2;
    }

    private int a(long j, PBb pBb) {
        return C6827lBb.c(C6355eDb.b(j + ((long) pBb.d()), 86400)).O();
    }
}
