package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;

/* compiled from: TrackSelection */
public interface l {

    /* compiled from: TrackSelection */
    public static final class a {
        public final TrackGroup a;
        public final int[] b;
        public final int c;
        public final Object d;

        public a(TrackGroup trackGroup, int... iArr) {
            this(trackGroup, iArr, 0, null);
        }

        public a(TrackGroup trackGroup, int[] iArr, int i, Object obj) {
            this.a = trackGroup;
            this.b = iArr;
            this.c = i;
            this.d = obj;
        }
    }

    /* compiled from: TrackSelection */
    public interface b {
        l[] a(a[] aVarArr, Up up);
    }

    int a();

    Format a(int i);

    void a(float f);

    int b(int i);

    void b();

    TrackGroup c();

    void d();

    void e();

    Format f();

    int length();
}
