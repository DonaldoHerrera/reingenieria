package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class TimeSignalCommand extends SpliceCommand {
    public static final Creator<TimeSignalCommand> CREATOR = new f();
    public final long a;
    public final long b;

    /* synthetic */ TimeSignalCommand(long j, long j2, f fVar) {
        this(j, j2);
    }

    static TimeSignalCommand a(Pq pq, long j, Zq zq) {
        long a2 = a(pq, j);
        return new TimeSignalCommand(a2, zq.b(a2));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    private TimeSignalCommand(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    static long a(Pq pq, long j) {
        long t = (long) pq.t();
        if ((128 & t) != 0) {
            return 8589934591L & ((((t & 1) << 32) | pq.v()) + j);
        }
        return -9223372036854775807L;
    }
}
