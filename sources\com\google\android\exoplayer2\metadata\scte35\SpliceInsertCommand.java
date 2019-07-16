package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceInsertCommand extends SpliceCommand {
    public static final Creator<SpliceInsertCommand> CREATOR = new c();
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final List<a> h;
    public final boolean i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;

    public static final class a {
        public final int a;
        public final long b;
        public final long c;

        /* synthetic */ a(int i, long j, long j2, c cVar) {
            this(i, j, j2);
        }

        public static a a(Parcel parcel) {
            a aVar = new a(parcel.readInt(), parcel.readLong(), parcel.readLong());
            return aVar;
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }

        private a(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }
    }

    /* synthetic */ SpliceInsertCommand(Parcel parcel, c cVar) {
        this(parcel);
    }

    static SpliceInsertCommand a(Pq pq, long j2, Zq zq) {
        boolean z;
        int i2;
        int i3;
        int i4;
        long j3;
        boolean z2;
        List list;
        long j4;
        boolean z3;
        boolean z4;
        List list2;
        boolean z5;
        long j5;
        Zq zq2 = zq;
        long v = pq.v();
        boolean z6 = (pq.t() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z6) {
            int t = pq.t();
            boolean z7 = (t & 128) != 0;
            boolean z8 = (t & 64) != 0;
            boolean z9 = (t & 32) != 0;
            boolean z10 = (t & 16) != 0;
            long a2 = (!z8 || z10) ? -9223372036854775807L : TimeSignalCommand.a(pq, j2);
            if (!z8) {
                int t2 = pq.t();
                list2 = new ArrayList(t2);
                for (int i5 = 0; i5 < t2; i5++) {
                    int t3 = pq.t();
                    long a3 = !z10 ? TimeSignalCommand.a(pq, j2) : -9223372036854775807L;
                    a aVar = new a(t3, a3, zq2.b(a3), null);
                    list2.add(aVar);
                }
            } else {
                list2 = emptyList;
            }
            if (z9) {
                long t4 = (long) pq.t();
                z5 = (128 & t4) != 0;
                j5 = ((((t4 & 1) << 32) | pq.v()) * 1000) / 90;
            } else {
                j5 = -9223372036854775807L;
                z5 = false;
            }
            int z11 = pq.z();
            i3 = pq.t();
            i2 = pq.t();
            z4 = z7;
            z = z8;
            list = list2;
            boolean z12 = z5;
            i4 = z11;
            long j6 = j5;
            z3 = z10;
            j4 = a2;
            z2 = z12;
            j3 = j6;
        } else {
            list = emptyList;
            z4 = false;
            z3 = false;
            j4 = -9223372036854775807L;
            z2 = false;
            j3 = -9223372036854775807L;
            i4 = 0;
            i3 = 0;
            i2 = 0;
            z = false;
        }
        SpliceInsertCommand spliceInsertCommand = new SpliceInsertCommand(v, z6, z4, z, z3, j4, zq2.b(j4), list, z2, j3, i4, i3, i2);
        return spliceInsertCommand;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.a);
        parcel.writeByte(this.b ? (byte) 1 : 0);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeByte(this.d ? (byte) 1 : 0);
        parcel.writeByte(this.e ? (byte) 1 : 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        int size = this.h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            ((a) this.h.get(i3)).b(parcel);
        }
        parcel.writeByte(this.i ? (byte) 1 : 0);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
    }

    private SpliceInsertCommand(long j2, boolean z, boolean z2, boolean z3, boolean z4, long j3, long j4, List<a> list, boolean z5, long j5, int i2, int i3, int i4) {
        this.a = j2;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j3;
        this.g = j4;
        this.h = Collections.unmodifiableList(list);
        this.i = z5;
        this.j = j5;
        this.k = i2;
        this.l = i3;
        this.m = i4;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.a = parcel.readLong();
        boolean z = false;
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.e = parcel.readByte() == 1;
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(a.a(parcel));
        }
        this.h = Collections.unmodifiableList(arrayList);
        if (parcel.readByte() == 1) {
            z = true;
        }
        this.i = z;
        this.j = parcel.readLong();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
    }
}
