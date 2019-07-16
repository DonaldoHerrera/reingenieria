package com.soundcloud.android.features.record.filter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.soundcloud.android.features.record.C3668u;
import com.soundcloud.android.features.record.PlaybackFilter;
import java.nio.ByteBuffer;

public class FadeFilter implements PlaybackFilter {
    public static final Creator<FadeFilter> CREATOR = new a();
    private final long a;
    private final int b;
    private final int c;

    public FadeFilter(C3668u uVar) {
        this(uVar, 0);
    }

    public ByteBuffer a(ByteBuffer byteBuffer, long j, long j2) {
        int min = (int) Math.min(j2 - j, (long) byteBuffer.remaining());
        if (j < this.a) {
            int i = this.b;
            if (i == 1 || i == 0) {
                a(byteBuffer, j, 0, (int) Math.min((long) min, this.a - j), 0, false);
            }
        }
        long j3 = j2 - this.a;
        if (((long) byteBuffer.remaining()) + j > j3) {
            int i2 = this.b;
            if (i2 == 2 || i2 == 0) {
                int i3 = (int) (j >= j3 ? 0 : j3 - j);
                a(byteBuffer, j, i3, min - i3, j3, true);
            }
        }
        return byteBuffer;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FadeFilter{fadeSize=");
        sb.append(this.a);
        sb.append(", fadeType=");
        sb.append(this.b);
        sb.append(", fadeExpCurve=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeLong(this.a);
        parcel.writeInt(this.c);
    }

    public FadeFilter(C3668u uVar, int i) {
        this(i, uVar.b(1000));
    }

    public FadeFilter(int i, long j) {
        this(i, j, 2);
    }

    public FadeFilter(int i, long j, int i2) {
        this.a = j;
        this.b = i;
        this.c = i2;
    }

    private void a(ByteBuffer byteBuffer, long j, int i, int i2, long j2, boolean z) {
        int max = Math.max(0, i - (i % 2));
        for (int i3 = max; i3 < max + i2; i3 += 2) {
            double pow = Math.pow(((double) ((((long) i3) + j) - j2)) / ((double) this.a), (double) this.c);
            double d = (double) byteBuffer.getShort(i3);
            if (z) {
                pow = 1.0d - pow;
            }
            byteBuffer.putShort(i3, (short) ((int) (d * pow)));
        }
    }
}
