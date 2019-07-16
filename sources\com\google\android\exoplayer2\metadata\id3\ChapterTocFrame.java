package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class ChapterTocFrame extends Id3Frame {
    public static final Creator<ChapterTocFrame> CREATOR = new e();
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    private final Id3Frame[] f;

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = id3FrameArr;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        if (this.c != chapterTocFrame.c || this.d != chapterTocFrame.d || !C0471ar.a((Object) this.b, (Object) chapterTocFrame.b) || !Arrays.equals(this.e, chapterTocFrame.e) || !Arrays.equals(this.f, chapterTocFrame.f)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = (((true + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeByte(this.d ? (byte) 1 : 0);
        parcel.writeStringArray(this.e);
        parcel.writeInt(this.f.length);
        for (Id3Frame writeParcelable : this.f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        C0471ar.a(readString);
        this.b = readString;
        boolean z = true;
        this.c = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.d = z;
        String[] createStringArray = parcel.createStringArray();
        C0471ar.a(createStringArray);
        this.e = createStringArray;
        int readInt = parcel.readInt();
        this.f = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
