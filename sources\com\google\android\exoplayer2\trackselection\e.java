package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: BaseTrackSelection */
public abstract class e implements l {
    protected final TrackGroup a;
    protected final int b;
    protected final int[] c;
    private final Format[] d;
    private final long[] e;
    private int f;

    /* compiled from: BaseTrackSelection */
    private static final class a implements Comparator<Format> {
        private a() {
        }

        /* renamed from: a */
        public int compare(Format format, Format format2) {
            return format2.e - format.e;
        }
    }

    public e(TrackGroup trackGroup, int... iArr) {
        int i = 0;
        C1852xq.b(iArr.length > 0);
        C1852xq.a(trackGroup);
        this.a = trackGroup;
        this.b = iArr.length;
        this.d = new Format[this.b];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = trackGroup.a(iArr[i2]);
        }
        Arrays.sort(this.d, new a());
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i < i3) {
                this.c[i] = trackGroup.a(this.d[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    public final Format a(int i) {
        return this.d[i];
    }

    public void a(float f2) {
    }

    public final int b(int i) {
        return this.c[i];
    }

    public /* synthetic */ void b() {
        k.a(this);
    }

    public final TrackGroup c() {
        return this.a;
    }

    public void d() {
    }

    public void e() {
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.a != eVar.a || !Arrays.equals(this.c, eVar.c)) {
            z = false;
        }
        return z;
    }

    public final Format f() {
        return this.d[a()];
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
        }
        return this.f;
    }

    public final int length() {
        return this.c.length;
    }
}
