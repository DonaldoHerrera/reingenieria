package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class ChapterFrame extends Id3Frame {
    public static final Creator<ChapterFrame> CREATOR = new d();
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    private final Id3Frame[] g;

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = id3FrameArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        if (!(this.c == chapterFrame.c && this.d == chapterFrame.d && this.e == chapterFrame.e && this.f == chapterFrame.f && C0471ar.a((Object) this.b, (Object) chapterFrame.b) && Arrays.equals(this.g, chapterFrame.g))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = (((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g.length);
        for (Id3Frame writeParcelable : this.g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    ChapterFrame(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        C0471ar.a(readString);
        this.b = readString;
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        int readInt = parcel.readInt();
        this.g = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.g[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
