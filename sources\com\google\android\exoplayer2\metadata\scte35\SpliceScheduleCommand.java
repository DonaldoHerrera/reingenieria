package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Creator<SpliceScheduleCommand> CREATOR = new e();
    public final List<b> a;

    public static final class a {
        public final int a;
        public final long b;

        /* synthetic */ a(int i, long j, e eVar) {
            this(i, j);
        }

        /* access modifiers changed from: private */
        public static a b(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        /* access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
        }

        private a(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public static final class b {
        public final long a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List<a> f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        private b(long j2, boolean z, boolean z2, boolean z3, List<a> list, long j3, boolean z4, long j4, int i2, int i3, int i4) {
            this.a = j2;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.f = Collections.unmodifiableList(list);
            this.e = j3;
            this.g = z4;
            this.h = j4;
            this.i = i2;
            this.j = i3;
            this.k = i4;
        }

        /* access modifiers changed from: private */
        public static b b(Pq pq) {
            boolean z;
            int i2;
            int i3;
            int i4;
            long j2;
            boolean z2;
            long j3;
            ArrayList arrayList;
            boolean z3;
            long j4;
            boolean z4;
            long v = pq.v();
            boolean z5 = (pq.t() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z5) {
                int t = pq.t();
                boolean z6 = (t & 128) != 0;
                boolean z7 = (t & 64) != 0;
                boolean z8 = (t & 32) != 0;
                long v2 = z7 ? pq.v() : -9223372036854775807L;
                if (!z7) {
                    int t2 = pq.t();
                    ArrayList arrayList3 = new ArrayList(t2);
                    for (int i5 = 0; i5 < t2; i5++) {
                        arrayList3.add(new a(pq.t(), pq.v(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long t3 = (long) pq.t();
                    z4 = (128 & t3) != 0;
                    j4 = ((((t3 & 1) << 32) | pq.v()) * 1000) / 90;
                } else {
                    z4 = false;
                    j4 = -9223372036854775807L;
                }
                int z9 = pq.z();
                int t4 = pq.t();
                i2 = pq.t();
                z = z7;
                j3 = v2;
                j2 = j4;
                arrayList = arrayList2;
                i4 = z9;
                i3 = t4;
                z3 = z6;
                z2 = z4;
            } else {
                arrayList = arrayList2;
                z3 = false;
                j3 = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i4 = 0;
                i3 = 0;
                i2 = 0;
                z = false;
            }
            b bVar = new b(v, z5, z3, z, arrayList, j3, z2, j2, i4, i3, i2);
            return bVar;
        }

        /* access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeLong(this.a);
            parcel.writeByte(this.b ? (byte) 1 : 0);
            parcel.writeByte(this.c ? (byte) 1 : 0);
            parcel.writeByte(this.d ? (byte) 1 : 0);
            int size = this.f.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                ((a) this.f.get(i2)).c(parcel);
            }
            parcel.writeLong(this.e);
            parcel.writeByte(this.g ? (byte) 1 : 0);
            parcel.writeLong(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }

        private b(Parcel parcel) {
            this.a = parcel.readLong();
            boolean z = false;
            this.b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                arrayList.add(a.b(parcel));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            if (parcel.readByte() == 1) {
                z = true;
            }
            this.g = z;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }

        /* access modifiers changed from: private */
        public static b b(Parcel parcel) {
            return new b(parcel);
        }
    }

    /* synthetic */ SpliceScheduleCommand(Parcel parcel, e eVar) {
        this(parcel);
    }

    static SpliceScheduleCommand a(Pq pq) {
        int t = pq.t();
        ArrayList arrayList = new ArrayList(t);
        for (int i = 0; i < t; i++) {
            arrayList.add(b.b(pq));
        }
        return new SpliceScheduleCommand((List<b>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((b) this.a.get(i2)).c(parcel);
        }
    }

    private SpliceScheduleCommand(List<b> list) {
        this.a = Collections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(b.b(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }
}
