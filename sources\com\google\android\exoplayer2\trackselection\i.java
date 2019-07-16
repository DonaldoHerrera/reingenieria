package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import com.google.android.exoplayer2.C0618s;
import com.google.android.exoplayer2.P;
import com.google.android.exoplayer2.Q;
import com.google.android.exoplayer2.X;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;

/* compiled from: MappingTrackSelector */
public abstract class i extends o {
    private a c;

    /* compiled from: MappingTrackSelector */
    public static final class a {
        @Deprecated
        public final int a = this.b;
        private final int b;
        private final int[] c;
        private final TrackGroupArray[] d;
        private final int[] e;
        private final int[][][] f;
        private final TrackGroupArray g;

        a(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.c = iArr;
            this.d = trackGroupArrayArr;
            this.f = iArr3;
            this.e = iArr2;
            this.g = trackGroupArray;
            this.b = iArr.length;
        }

        public int a() {
            return this.b;
        }

        public TrackGroupArray b(int i) {
            return this.d[i];
        }

        public int a(int i) {
            return this.c[i];
        }
    }

    /* access modifiers changed from: protected */
    public abstract Pair<Q[], l[]> a(a aVar, int[][][] iArr, int[] iArr2) throws C0618s;

    public final void a(Object obj) {
        this.c = (a) obj;
    }

    public final p a(P[] pArr, TrackGroupArray trackGroupArray, com.google.android.exoplayer2.source.r.a aVar, X x) throws C0618s {
        int[] iArr;
        int[] iArr2 = new int[(pArr.length + 1)];
        TrackGroup[][] trackGroupArr = new TrackGroup[(pArr.length + 1)][];
        int[][][] iArr3 = new int[(pArr.length + 1)][][];
        for (int i = 0; i < trackGroupArr.length; i++) {
            int i2 = trackGroupArray.b;
            trackGroupArr[i] = new TrackGroup[i2];
            iArr3[i] = new int[i2][];
        }
        int[] a2 = a(pArr);
        for (int i3 = 0; i3 < trackGroupArray.b; i3++) {
            TrackGroup a3 = trackGroupArray.a(i3);
            int a4 = a(pArr, a3);
            if (a4 == pArr.length) {
                iArr = new int[a3.a];
            } else {
                iArr = a(pArr[a4], a3);
            }
            int i4 = iArr2[a4];
            trackGroupArr[a4][i4] = a3;
            iArr3[a4][i4] = iArr;
            iArr2[a4] = iArr2[a4] + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[pArr.length];
        int[] iArr4 = new int[pArr.length];
        for (int i5 = 0; i5 < pArr.length; i5++) {
            int i6 = iArr2[i5];
            trackGroupArrayArr[i5] = new TrackGroupArray((TrackGroup[]) C0471ar.a((T[]) trackGroupArr[i5], i6));
            iArr3[i5] = (int[][]) C0471ar.a((T[]) iArr3[i5], i6);
            iArr4[i5] = pArr[i5].e();
        }
        int[] iArr5 = a2;
        int[][][] iArr6 = iArr3;
        a aVar2 = new a(iArr4, trackGroupArrayArr, iArr5, iArr6, new TrackGroupArray((TrackGroup[]) C0471ar.a((T[]) trackGroupArr[pArr.length], iArr2[pArr.length])));
        Pair a5 = a(aVar2, iArr3, a2);
        return new p((Q[]) a5.first, (l[]) a5.second, aVar2);
    }

    private static int a(P[] pArr, TrackGroup trackGroup) throws C0618s {
        int length = pArr.length;
        int i = 0;
        int i2 = 0;
        while (i < pArr.length) {
            P p = pArr[i];
            int i3 = i2;
            int i4 = length;
            for (int i5 = 0; i5 < trackGroup.a; i5++) {
                int a2 = p.a(trackGroup.a(i5)) & 7;
                if (a2 > i3) {
                    if (a2 == 4) {
                        return i;
                    }
                    i4 = i;
                    i3 = a2;
                }
            }
            i++;
            length = i4;
            i2 = i3;
        }
        return length;
    }

    private static int[] a(P p, TrackGroup trackGroup) throws C0618s {
        int[] iArr = new int[trackGroup.a];
        for (int i = 0; i < trackGroup.a; i++) {
            iArr[i] = p.a(trackGroup.a(i));
        }
        return iArr;
    }

    private static int[] a(P[] pArr) throws C0618s {
        int[] iArr = new int[pArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = pArr[i].o();
        }
        return iArr;
    }
}
