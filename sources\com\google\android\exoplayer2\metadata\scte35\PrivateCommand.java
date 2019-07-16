package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class PrivateCommand extends SpliceCommand {
    public static final Creator<PrivateCommand> CREATOR = new a();
    public final long a;
    public final long b;
    public final byte[] c;

    /* synthetic */ PrivateCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    static PrivateCommand a(Pq pq, int i, long j) {
        long v = pq.v();
        byte[] bArr = new byte[(i - 4)];
        pq.a(bArr, 0, bArr.length);
        PrivateCommand privateCommand = new PrivateCommand(v, bArr, j);
        return privateCommand;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c.length);
        parcel.writeByteArray(this.c);
    }

    private PrivateCommand(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = new byte[parcel.readInt()];
        parcel.readByteArray(this.c);
    }
}
