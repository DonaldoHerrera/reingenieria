package com.google.android.exoplayer2.trackselection;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.C0618s;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Q;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;

public class DefaultTrackSelector extends i {
    private static final int[] d = new int[0];
    private final com.google.android.exoplayer2.trackselection.l.b e;
    private final AtomicReference<Parameters> f = new AtomicReference<>(Parameters.f);
    private boolean g;

    public static final class Parameters extends TrackSelectionParameters {
        public static final Creator<Parameters> CREATOR = new f();
        public static final Parameters f = new Parameters();
        public final int A;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> B;
        private final SparseBooleanArray C;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final int n;
        public final int o;
        public final boolean p;
        public final int q;
        public final int r;
        public final boolean s;
        public final boolean t;
        public final boolean u;
        public final boolean v;
        public final boolean w;
        @Deprecated
        public final boolean x;
        @Deprecated
        public final boolean y;
        public final boolean z;

        private Parameters() {
            TrackSelectionParameters trackSelectionParameters = TrackSelectionParameters.a;
            String str = trackSelectionParameters.b;
            String str2 = trackSelectionParameters.c;
            boolean z2 = trackSelectionParameters.d;
            int i2 = trackSelectionParameters.e;
            SparseArray sparseArray = r1;
            SparseArray sparseArray2 = new SparseArray();
            SparseBooleanArray sparseBooleanArray = r1;
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            this(BaseClientBuilder.API_PRIORITY_OTHER, BaseClientBuilder.API_PRIORITY_OTHER, BaseClientBuilder.API_PRIORITY_OTHER, BaseClientBuilder.API_PRIORITY_OTHER, true, false, true, BaseClientBuilder.API_PRIORITY_OTHER, BaseClientBuilder.API_PRIORITY_OTHER, true, str, BaseClientBuilder.API_PRIORITY_OTHER, BaseClientBuilder.API_PRIORITY_OTHER, true, false, false, str2, z2, i2, false, false, true, 0, sparseArray, sparseBooleanArray);
        }

        public final boolean a(int i2) {
            return this.C.get(i2);
        }

        public final boolean b(int i2, TrackGroupArray trackGroupArray) {
            Map map = (Map) this.B.get(i2);
            return map != null && map.containsKey(trackGroupArray);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z2 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || Parameters.class != obj.getClass()) {
                return false;
            }
            Parameters parameters = (Parameters) obj;
            if (!(super.equals(obj) && this.g == parameters.g && this.h == parameters.h && this.i == parameters.i && this.j == parameters.j && this.k == parameters.k && this.l == parameters.l && this.m == parameters.m && this.p == parameters.p && this.n == parameters.n && this.o == parameters.o && this.q == parameters.q && this.r == parameters.r && this.s == parameters.s && this.t == parameters.t && this.u == parameters.u && this.v == parameters.v && this.w == parameters.w && this.z == parameters.z && this.A == parameters.A && a(this.C, parameters.C) && a(this.B, parameters.B))) {
                z2 = false;
            }
            return z2;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + (this.p ? 1 : 0)) * 31) + this.n) * 31) + this.o) * 31) + this.q) * 31) + this.r) * 31) + (this.s ? 1 : 0)) * 31) + (this.t ? 1 : 0)) * 31) + (this.u ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31) + (this.z ? 1 : 0)) * 31) + this.A;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            C0471ar.a(parcel, this.k);
            C0471ar.a(parcel, this.l);
            C0471ar.a(parcel, this.m);
            parcel.writeInt(this.n);
            parcel.writeInt(this.o);
            C0471ar.a(parcel, this.p);
            parcel.writeInt(this.q);
            parcel.writeInt(this.r);
            C0471ar.a(parcel, this.s);
            C0471ar.a(parcel, this.t);
            C0471ar.a(parcel, this.u);
            C0471ar.a(parcel, this.v);
            C0471ar.a(parcel, this.w);
            C0471ar.a(parcel, this.z);
            parcel.writeInt(this.A);
            a(parcel, this.B);
            parcel.writeSparseBooleanArray(this.C);
        }

        Parameters(int i2, int i3, int i4, int i5, boolean z2, boolean z3, boolean z4, int i6, int i7, boolean z5, String str, int i8, int i9, boolean z6, boolean z7, boolean z8, String str2, boolean z9, int i10, boolean z10, boolean z11, boolean z12, int i11, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            boolean z13 = z3;
            boolean z14 = z4;
            super(str, str2, z9, i10);
            this.g = i2;
            this.h = i3;
            this.i = i4;
            this.j = i5;
            this.k = z2;
            this.l = z13;
            this.m = z14;
            this.n = i6;
            this.o = i7;
            this.p = z5;
            this.q = i8;
            this.r = i9;
            this.s = z6;
            this.t = z7;
            this.u = z8;
            this.v = z10;
            this.w = z11;
            this.z = z12;
            this.A = i11;
            this.x = z13;
            this.y = z14;
            this.B = sparseArray;
            this.C = sparseBooleanArray;
        }

        public final SelectionOverride a(int i2, TrackGroupArray trackGroupArray) {
            Map map = (Map) this.B.get(i2);
            if (map != null) {
                return (SelectionOverride) map.get(trackGroupArray);
            }
            return null;
        }

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> a(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i3 = 0; i3 < readInt3; i3++) {
                    hashMap.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        private static void a(Parcel parcel, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = sparseArray.keyAt(i2);
                Map map = (Map) sparseArray.valueAt(i2);
                int size2 = map.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Entry entry : map.entrySet()) {
                    parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
        }

        private static boolean a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i2)) < 0) {
                    return false;
                }
            }
            return true;
        }

        Parameters(Parcel parcel) {
            super(parcel);
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = C0471ar.a(parcel);
            this.l = C0471ar.a(parcel);
            this.m = C0471ar.a(parcel);
            this.n = parcel.readInt();
            this.o = parcel.readInt();
            this.p = C0471ar.a(parcel);
            this.q = parcel.readInt();
            this.r = parcel.readInt();
            this.s = C0471ar.a(parcel);
            this.t = C0471ar.a(parcel);
            this.u = C0471ar.a(parcel);
            this.v = C0471ar.a(parcel);
            this.w = C0471ar.a(parcel);
            this.z = C0471ar.a(parcel);
            this.A = parcel.readInt();
            this.B = a(parcel);
            SparseBooleanArray readSparseBooleanArray = parcel.readSparseBooleanArray();
            C0471ar.a(readSparseBooleanArray);
            this.C = readSparseBooleanArray;
            this.x = this.l;
            this.y = this.m;
        }

        private static boolean a(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                if (indexOfKey < 0 || !a((Map) sparseArray.valueAt(i2), (Map) sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean a(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Entry entry : map.entrySet()) {
                TrackGroupArray trackGroupArray = (TrackGroupArray) entry.getKey();
                if (map2.containsKey(trackGroupArray)) {
                    if (!C0471ar.a(entry.getValue(), map2.get(trackGroupArray))) {
                    }
                }
                return false;
            }
            return true;
        }
    }

    public static final class SelectionOverride implements Parcelable {
        public static final Creator<SelectionOverride> CREATOR = new g();
        public final int a;
        public final int[] b = new int[this.c];
        public final int c;
        public final int d;
        public final int e;

        SelectionOverride(Parcel parcel) {
            this.a = parcel.readInt();
            this.c = parcel.readByte();
            parcel.readIntArray(this.b);
            this.d = parcel.readInt();
            this.e = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            if (!(this.a == selectionOverride.a && Arrays.equals(this.b, selectionOverride.b) && this.d == selectionOverride.d && this.e == selectionOverride.e)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.d) * 31) + this.e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b.length);
            parcel.writeIntArray(this.b);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
        }
    }

    private static final class a {
        public final int a;
        public final int b;
        public final String c;

        public a(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!(this.a == aVar.a && this.b == aVar.b && TextUtils.equals(this.c, aVar.c))) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    protected static final class b implements Comparable<b> {
        public final boolean a;
        private final Parameters b;
        private final boolean c;
        private final int d;
        private final int e;
        private final int f;
        private final boolean g;
        private final int h;
        private final int i;
        private final int j;

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
            if (r7 > r6.q) goto L_0x003b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[EDGE_INSN: B:22:0x0057->B:20:0x0057 ?: BREAK  
EDGE_INSN: B:22:0x0057->B:20:0x0057 ?: BREAK  , SYNTHETIC] */
        public b(Format format, Parameters parameters, int i2) {
            String[] b2;
            int i3;
            this.b = parameters;
            int i4 = 0;
            this.c = DefaultTrackSelector.a(i2, false);
            this.d = DefaultTrackSelector.a(format, parameters.b);
            boolean z = true;
            this.g = (format.c & 1) != 0;
            this.h = format.v;
            this.i = format.w;
            int i5 = format.e;
            this.j = i5;
            if (i5 == -1 || i5 <= parameters.r) {
                int i6 = format.v;
                if (i6 != -1) {
                }
                this.a = z;
                b2 = C0471ar.b();
                int i7 = BaseClientBuilder.API_PRIORITY_OTHER;
                i3 = 0;
                while (true) {
                    if (i3 < b2.length) {
                        break;
                    }
                    int a2 = DefaultTrackSelector.a(format, b2[i3]);
                    if (a2 > 0) {
                        i7 = i3;
                        i4 = a2;
                        break;
                    }
                    i3++;
                }
                this.e = i7;
                this.f = i4;
            }
            z = false;
            this.a = z;
            b2 = C0471ar.b();
            int i72 = BaseClientBuilder.API_PRIORITY_OTHER;
            i3 = 0;
            while (true) {
                if (i3 < b2.length) {
                }
                i3++;
            }
            this.e = i72;
            this.f = i4;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            int a2;
            boolean z = this.c;
            int i2 = 1;
            if (z != bVar.c) {
                if (!z) {
                    i2 = -1;
                }
                return i2;
            }
            int i3 = this.d;
            int i4 = bVar.d;
            if (i3 != i4) {
                return DefaultTrackSelector.d(i3, i4);
            }
            boolean z2 = this.a;
            if (z2 != bVar.a) {
                if (!z2) {
                    i2 = -1;
                }
                return i2;
            }
            if (this.b.v) {
                int b2 = DefaultTrackSelector.c(this.j, bVar.j);
                if (b2 != 0) {
                    if (b2 > 0) {
                        i2 = -1;
                    }
                    return i2;
                }
            }
            boolean z3 = this.g;
            if (z3 != bVar.g) {
                if (!z3) {
                    i2 = -1;
                }
                return i2;
            }
            int i5 = this.e;
            int i6 = bVar.e;
            if (i5 != i6) {
                return -DefaultTrackSelector.d(i5, i6);
            }
            int i7 = this.f;
            int i8 = bVar.f;
            if (i7 != i8) {
                return DefaultTrackSelector.d(i7, i8);
            }
            if (!this.a || !this.c) {
                i2 = -1;
            }
            int i9 = this.h;
            int i10 = bVar.h;
            if (i9 != i10) {
                a2 = DefaultTrackSelector.d(i9, i10);
            } else {
                int i11 = this.i;
                int i12 = bVar.i;
                if (i11 != i12) {
                    a2 = DefaultTrackSelector.d(i11, i12);
                } else {
                    a2 = DefaultTrackSelector.d(this.j, bVar.j);
                }
            }
            return i2 * a2;
        }
    }

    public DefaultTrackSelector(com.google.android.exoplayer2.trackselection.l.b bVar) {
        this.e = bVar;
    }

    protected static boolean a(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* access modifiers changed from: private */
    public static int c(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* access modifiers changed from: private */
    public static int d(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* access modifiers changed from: protected */
    public final Pair<Q[], l[]> a(com.google.android.exoplayer2.trackselection.i.a aVar, int[][][] iArr, int[] iArr2) throws C0618s {
        Parameters parameters = (Parameters) this.f.get();
        int a2 = aVar.a();
        com.google.android.exoplayer2.trackselection.l.a[] a3 = a(aVar, iArr, iArr2, parameters);
        int i = 0;
        while (true) {
            com.google.android.exoplayer2.trackselection.l.a aVar2 = null;
            if (i >= a2) {
                break;
            }
            if (parameters.a(i)) {
                a3[i] = null;
            } else {
                TrackGroupArray b2 = aVar.b(i);
                if (parameters.b(i, b2)) {
                    SelectionOverride a4 = parameters.a(i, b2);
                    if (a4 != null) {
                        aVar2 = new com.google.android.exoplayer2.trackselection.l.a(b2.a(a4.a), a4.b, a4.d, Integer.valueOf(a4.e));
                    }
                    a3[i] = aVar2;
                }
            }
            i++;
        }
        l[] a5 = this.e.a(a3, a());
        Q[] qArr = new Q[a2];
        for (int i2 = 0; i2 < a2; i2++) {
            qArr[i2] = !parameters.a(i2) && (aVar.a(i2) == 6 || a5[i2] != null) ? Q.a : null;
        }
        a(aVar, iArr, qArr, a5, parameters.A);
        return Pair.create(qArr, a5);
    }

    /* access modifiers changed from: protected */
    public com.google.android.exoplayer2.trackselection.l.a b(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, boolean z) throws C0618s {
        com.google.android.exoplayer2.trackselection.l.a a2 = (parameters.w || parameters.v || !z) ? null : a(trackGroupArray, iArr, i, parameters);
        return a2 == null ? a(trackGroupArray, iArr, parameters) : a2;
    }

    private static int b(TrackGroup trackGroup, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, List<Integer> list) {
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int intValue = ((Integer) list.get(i7)).intValue();
            TrackGroup trackGroup2 = trackGroup;
            if (a(trackGroup.a(intValue), str, iArr[intValue], i, i2, i3, i4, i5)) {
                i6++;
            }
        }
        return i6;
    }

    /* access modifiers changed from: protected */
    public com.google.android.exoplayer2.trackselection.l.a[] a(com.google.android.exoplayer2.trackselection.i.a aVar, int[][][] iArr, int[] iArr2, Parameters parameters) throws C0618s {
        int i;
        String str;
        int i2;
        String str2;
        b bVar;
        int i3;
        com.google.android.exoplayer2.trackselection.i.a aVar2 = aVar;
        Parameters parameters2 = parameters;
        int a2 = aVar.a();
        com.google.android.exoplayer2.trackselection.l.a[] aVarArr = new com.google.android.exoplayer2.trackselection.l.a[a2];
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 1;
            if (i5 >= a2) {
                break;
            }
            if (2 == aVar2.a(i5)) {
                if (!z) {
                    aVarArr[i5] = b(aVar2.b(i5), iArr[i5], iArr2[i5], parameters, true);
                    z = aVarArr[i5] != null;
                }
                if (aVar2.b(i5).b <= 0) {
                    i = 0;
                }
                i6 |= i;
            }
            i5++;
        }
        b bVar2 = null;
        String str3 = null;
        int i7 = -1;
        int i8 = 0;
        while (i8 < a2) {
            if (i == aVar2.a(i8)) {
                i3 = i7;
                bVar = bVar2;
                str2 = str3;
                i2 = i8;
                Pair a3 = a(aVar2.b(i8), iArr[i8], iArr2[i8], parameters, this.g || i6 == 0);
                if (a3 != null && (bVar == null || ((b) a3.second).compareTo(bVar) > 0)) {
                    if (i3 != -1) {
                        aVarArr[i3] = null;
                    }
                    com.google.android.exoplayer2.trackselection.l.a aVar3 = (com.google.android.exoplayer2.trackselection.l.a) a3.first;
                    aVarArr[i2] = aVar3;
                    bVar2 = (b) a3.second;
                    str3 = aVar3.a.a(aVar3.b[0]).A;
                    i7 = i2;
                    i8 = i2 + 1;
                    i = 1;
                }
            } else {
                i3 = i7;
                bVar = bVar2;
                str2 = str3;
                i2 = i8;
            }
            i7 = i3;
            bVar2 = bVar;
            str3 = str2;
            i8 = i2 + 1;
            i = 1;
        }
        String str4 = str3;
        int i9 = Integer.MIN_VALUE;
        int i10 = -1;
        while (i4 < a2) {
            int a4 = aVar2.a(i4);
            if (a4 != 1) {
                if (a4 != 2) {
                    if (a4 != 3) {
                        aVarArr[i4] = a(a4, aVar2.b(i4), iArr[i4], parameters2);
                    } else {
                        str = str4;
                        Pair a5 = a(aVar2.b(i4), iArr[i4], parameters2, str);
                        if (a5 != null && ((Integer) a5.second).intValue() > i9) {
                            if (i10 != -1) {
                                aVarArr[i10] = null;
                            }
                            aVarArr[i4] = (com.google.android.exoplayer2.trackselection.l.a) a5.first;
                            i9 = ((Integer) a5.second).intValue();
                            i10 = i4;
                        }
                    }
                }
                str = str4;
            } else {
                str = str4;
            }
            i4++;
            str4 = str;
        }
        return aVarArr;
    }

    private static com.google.android.exoplayer2.trackselection.l.a a(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters) {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        Parameters parameters2 = parameters;
        int i2 = parameters2.m ? 24 : 16;
        boolean z = parameters2.l && (i & i2) != 0;
        int i3 = 0;
        while (i3 < trackGroupArray2.b) {
            TrackGroup a2 = trackGroupArray2.a(i3);
            TrackGroup trackGroup = a2;
            int[] a3 = a(a2, iArr[i3], z, i2, parameters2.g, parameters2.h, parameters2.i, parameters2.j, parameters2.n, parameters2.o, parameters2.p);
            if (a3.length > 0) {
                return new com.google.android.exoplayer2.trackselection.l.a(trackGroup, a3);
            }
            i3++;
            trackGroupArray2 = trackGroupArray;
        }
        return null;
    }

    private static int[] a(TrackGroup trackGroup, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2) {
        String str;
        TrackGroup trackGroup2 = trackGroup;
        if (trackGroup2.a < 2) {
            return d;
        }
        List a2 = a(trackGroup2, i6, i7, z2);
        if (a2.size() < 2) {
            return d;
        }
        if (!z) {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i8 = 0;
            for (int i9 = 0; i9 < a2.size(); i9++) {
                String str3 = trackGroup2.a(((Integer) a2.get(i9)).intValue()).i;
                if (hashSet.add(str3)) {
                    String str4 = str3;
                    int b2 = b(trackGroup, iArr, i, str3, i2, i3, i4, i5, a2);
                    if (b2 > i8) {
                        i8 = b2;
                        str2 = str4;
                    }
                }
            }
            str = str2;
        } else {
            str = null;
        }
        a(trackGroup, iArr, i, str, i2, i3, i4, i5, a2);
        return a2.size() < 2 ? d : C0471ar.a(a2);
    }

    private static void a(TrackGroup trackGroup, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = ((Integer) list2.get(size)).intValue();
            TrackGroup trackGroup2 = trackGroup;
            if (!a(trackGroup.a(intValue), str, iArr[intValue], i, i2, i3, i4, i5)) {
                list2.remove(size);
            }
        }
    }

    private static boolean a(Format format, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        if (!a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C0471ar.a((Object) format.i, (Object) str)) {
            return false;
        }
        int i7 = format.n;
        if (i7 != -1 && i7 > i3) {
            return false;
        }
        int i8 = format.o;
        if (i8 != -1 && i8 > i4) {
            return false;
        }
        float f2 = format.p;
        if (f2 != -1.0f && f2 > ((float) i5)) {
            return false;
        }
        int i9 = format.e;
        if (i9 == -1 || i9 <= i6) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0097, code lost:
        if (r0 < 0) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bc  */
    private static com.google.android.exoplayer2.trackselection.l.a a(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        TrackGroup trackGroup;
        boolean z;
        int i;
        boolean a2;
        boolean z2;
        int i2;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        Parameters parameters2 = parameters;
        int i3 = -1;
        int i4 = 0;
        TrackGroup trackGroup2 = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (i4 < trackGroupArray2.b) {
            TrackGroup a3 = trackGroupArray2.a(i4);
            List a4 = a(a3, parameters2.n, parameters2.o, parameters2.p);
            int[] iArr2 = iArr[i4];
            int i9 = i8;
            int i10 = i7;
            int i11 = i6;
            int i12 = i5;
            TrackGroup trackGroup3 = trackGroup2;
            int i13 = 0;
            while (i13 < a3.a) {
                if (a(iArr2[i13], parameters2.z)) {
                    Format a5 = a3.a(i13);
                    if (a4.contains(Integer.valueOf(i13))) {
                        int i14 = a5.n;
                        if (i14 == i3 || i14 <= parameters2.g) {
                            int i15 = a5.o;
                            if (i15 == i3 || i15 <= parameters2.h) {
                                float f2 = a5.p;
                                if (f2 == -1.0f || f2 <= ((float) parameters2.i)) {
                                    int i16 = a5.e;
                                    if (i16 == i3 || i16 <= parameters2.j) {
                                        z = true;
                                        if (z || parameters2.k) {
                                            i = !z ? 2 : 1;
                                            a2 = a(iArr2[i13], false);
                                            if (a2) {
                                                i += 1000;
                                            }
                                            z2 = i <= i11;
                                            if (i != i11) {
                                                int c = c(a5.e, i10);
                                                trackGroup = trackGroup3;
                                                if (!parameters2.v || c == 0) {
                                                    int a6 = a5.a();
                                                    if (a6 != i9) {
                                                        i2 = c(a6, i9);
                                                    } else {
                                                        i2 = c(a5.e, i10);
                                                    }
                                                    if (a2) {
                                                    }
                                                    z2 = false;
                                                }
                                                z2 = true;
                                            } else {
                                                trackGroup = trackGroup3;
                                            }
                                            if (z2) {
                                                i10 = a5.e;
                                                i9 = a5.a();
                                                i12 = i13;
                                                trackGroup3 = a3;
                                                i11 = i;
                                                i13++;
                                                i3 = -1;
                                                TrackGroupArray trackGroupArray3 = trackGroupArray;
                                            }
                                            trackGroup3 = trackGroup;
                                            i13++;
                                            i3 = -1;
                                            TrackGroupArray trackGroupArray32 = trackGroupArray;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                    a2 = a(iArr2[i13], false);
                    if (a2) {
                    }
                    if (i <= i11) {
                    }
                    if (i != i11) {
                    }
                    if (z2) {
                    }
                    trackGroup3 = trackGroup;
                    i13++;
                    i3 = -1;
                    TrackGroupArray trackGroupArray322 = trackGroupArray;
                }
                trackGroup = trackGroup3;
                trackGroup3 = trackGroup;
                i13++;
                i3 = -1;
                TrackGroupArray trackGroupArray3222 = trackGroupArray;
            }
            TrackGroup trackGroup4 = trackGroup3;
            i4++;
            i3 = -1;
            trackGroupArray2 = trackGroupArray;
            i5 = i12;
            i6 = i11;
            i7 = i10;
            i8 = i9;
            trackGroup2 = trackGroup4;
        }
        if (trackGroup2 == null) {
            return null;
        }
        return new com.google.android.exoplayer2.trackselection.l.a(trackGroup2, i5);
    }

    /* access modifiers changed from: protected */
    public Pair<com.google.android.exoplayer2.trackselection.l.a, b> a(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, boolean z) throws C0618s {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        Parameters parameters2 = parameters;
        com.google.android.exoplayer2.trackselection.l.a aVar = null;
        b bVar = null;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (i2 < trackGroupArray2.b) {
            TrackGroup a2 = trackGroupArray2.a(i2);
            int[] iArr2 = iArr[i2];
            b bVar2 = bVar;
            int i5 = i4;
            int i6 = i3;
            for (int i7 = 0; i7 < a2.a; i7++) {
                if (a(iArr2[i7], parameters2.z)) {
                    b bVar3 = new b(a2.a(i7), parameters2, iArr2[i7]);
                    if ((bVar3.a || parameters2.s) && (bVar2 == null || bVar3.compareTo(bVar2) > 0)) {
                        i6 = i2;
                        i5 = i7;
                        bVar2 = bVar3;
                    }
                }
            }
            i2++;
            i3 = i6;
            i4 = i5;
            bVar = bVar2;
        }
        if (i3 == -1) {
            return null;
        }
        TrackGroup a3 = trackGroupArray2.a(i3);
        if (!parameters2.w && !parameters2.v && z) {
            int[] a4 = a(a3, iArr[i3], parameters2.t, parameters2.u);
            if (a4.length > 0) {
                aVar = new com.google.android.exoplayer2.trackselection.l.a(a3, a4);
            }
        }
        if (aVar == null) {
            aVar = new com.google.android.exoplayer2.trackselection.l.a(a3, i4);
        }
        C1852xq.a(bVar);
        return Pair.create(aVar, bVar);
    }

    private static int[] a(TrackGroup trackGroup, int[] iArr, boolean z, boolean z2) {
        HashSet hashSet = new HashSet();
        a aVar = null;
        int i = 0;
        for (int i2 = 0; i2 < trackGroup.a; i2++) {
            Format a2 = trackGroup.a(i2);
            a aVar2 = new a(a2.v, a2.w, a2.i);
            if (hashSet.add(aVar2)) {
                int a3 = a(trackGroup, iArr, aVar2, z, z2);
                if (a3 > i) {
                    i = a3;
                    aVar = aVar2;
                }
            }
        }
        if (i <= 1) {
            return d;
        }
        int[] iArr2 = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < trackGroup.a; i4++) {
            Format a4 = trackGroup.a(i4);
            int i5 = iArr[i4];
            C1852xq.a(aVar);
            if (a(a4, i5, aVar, z, z2)) {
                int i6 = i3 + 1;
                iArr2[i3] = i4;
                i3 = i6;
            }
        }
        return iArr2;
    }

    private static int a(TrackGroup trackGroup, int[] iArr, a aVar, boolean z, boolean z2) {
        int i = 0;
        for (int i2 = 0; i2 < trackGroup.a; i2++) {
            if (a(trackGroup.a(i2), iArr[i2], aVar, z, z2)) {
                i++;
            }
        }
        return i;
    }

    private static boolean a(Format format, int i, a aVar, boolean z, boolean z2) {
        if (!a(i, false)) {
            return false;
        }
        int i2 = format.v;
        if (i2 == -1 || i2 != aVar.a) {
            return false;
        }
        if (!z) {
            String str = format.i;
            if (str == null || !TextUtils.equals(str, aVar.c)) {
                return false;
            }
        }
        if (!z2) {
            int i3 = format.w;
            if (i3 == -1 || i3 != aVar.b) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public Pair<com.google.android.exoplayer2.trackselection.l.a, Integer> a(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters, String str) throws C0618s {
        int i;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        Parameters parameters2 = parameters;
        int i2 = 0;
        TrackGroup trackGroup = null;
        int i3 = 0;
        int i4 = 0;
        while (i2 < trackGroupArray2.b) {
            TrackGroup a2 = trackGroupArray2.a(i2);
            int[] iArr2 = iArr[i2];
            int i5 = i4;
            int i6 = i3;
            TrackGroup trackGroup2 = trackGroup;
            for (int i7 = 0; i7 < a2.a; i7++) {
                if (a(iArr2[i7], parameters2.z)) {
                    Format a3 = a2.a(i7);
                    int i8 = a3.c & (~parameters2.e);
                    boolean z = (i8 & 1) != 0;
                    boolean z2 = (i8 & 2) != 0;
                    int a4 = a(a3, parameters2.c);
                    boolean a5 = a(a3);
                    if (a4 > 0 || (parameters2.d && a5)) {
                        String str2 = str;
                        int i9 = z ? 11 : !z2 ? 7 : 3;
                        i = i9 + a4;
                    } else if (z) {
                        String str3 = str;
                        i = 2;
                    } else if (z2) {
                        if (a(a3, str) > 0 || (a5 && a(str))) {
                            i = 1;
                        }
                    }
                    if (a(iArr2[i7], false)) {
                        i += 1000;
                    }
                    if (i > i5) {
                        i6 = i7;
                        trackGroup2 = a2;
                        i5 = i;
                    }
                }
                String str4 = str;
            }
            String str5 = str;
            i2++;
            trackGroup = trackGroup2;
            i3 = i6;
            i4 = i5;
        }
        if (trackGroup == null) {
            return null;
        }
        return Pair.create(new com.google.android.exoplayer2.trackselection.l.a(trackGroup, i3), Integer.valueOf(i4));
    }

    /* access modifiers changed from: protected */
    public com.google.android.exoplayer2.trackselection.l.a a(int i, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws C0618s {
        TrackGroup trackGroup = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < trackGroupArray.b) {
            TrackGroup a2 = trackGroupArray.a(i2);
            int[] iArr2 = iArr[i2];
            int i5 = i4;
            int i6 = i3;
            TrackGroup trackGroup2 = trackGroup;
            for (int i7 = 0; i7 < a2.a; i7++) {
                if (a(iArr2[i7], parameters.z)) {
                    int i8 = (a2.a(i7).c & 1) != 0 ? 2 : 1;
                    if (a(iArr2[i7], false)) {
                        i8 += 1000;
                    }
                    if (i8 > i5) {
                        i6 = i7;
                        trackGroup2 = a2;
                        i5 = i8;
                    }
                }
            }
            i2++;
            trackGroup = trackGroup2;
            i3 = i6;
            i4 = i5;
        }
        if (trackGroup == null) {
            return null;
        }
        return new com.google.android.exoplayer2.trackselection.l.a(trackGroup, i3);
    }

    private static void a(com.google.android.exoplayer2.trackselection.i.a aVar, int[][][] iArr, Q[] qArr, l[] lVarArr, int i) {
        boolean z;
        if (i != 0) {
            boolean z2 = false;
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            while (true) {
                if (i2 >= aVar.a()) {
                    z = true;
                    break;
                }
                int a2 = aVar.a(i2);
                l lVar = lVarArr[i2];
                if ((a2 == 1 || a2 == 2) && lVar != null && a(iArr[i2], aVar.b(i2), lVar)) {
                    if (a2 == 1) {
                        if (i4 != -1) {
                            break;
                        }
                        i4 = i2;
                    } else if (i3 != -1) {
                        break;
                    } else {
                        i3 = i2;
                    }
                }
                i2++;
            }
            z = false;
            if (!(i4 == -1 || i3 == -1)) {
                z2 = true;
            }
            if (z && z2) {
                Q q = new Q(i);
                qArr[i4] = q;
                qArr[i3] = q;
            }
        }
    }

    private static boolean a(int[][] iArr, TrackGroupArray trackGroupArray, l lVar) {
        if (lVar == null) {
            return false;
        }
        int a2 = trackGroupArray.a(lVar.c());
        for (int i = 0; i < lVar.length(); i++) {
            if ((iArr[a2][lVar.b(i)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    protected static boolean a(Format format) {
        return a(format.A);
    }

    protected static boolean a(String str) {
        return TextUtils.isEmpty(str) || TextUtils.equals(str, "und");
    }

    protected static int a(Format format, String str) {
        String str2 = format.A;
        if (str2 == null || str == null) {
            return 0;
        }
        if (TextUtils.equals(str2, str)) {
            return 3;
        }
        if (format.A.startsWith(str) || str.startsWith(format.A)) {
            return 2;
        }
        if (format.A.length() < 3 || str.length() < 3 || !format.A.substring(0, 3).equals(str.substring(0, 3))) {
            return 0;
        }
        return 1;
    }

    private static List<Integer> a(TrackGroup trackGroup, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList(trackGroup.a);
        for (int i3 = 0; i3 < trackGroup.a; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            int i4 = BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i5 = 0; i5 < trackGroup.a; i5++) {
                Format a2 = trackGroup.a(i5);
                int i6 = a2.n;
                if (i6 > 0) {
                    int i7 = a2.o;
                    if (i7 > 0) {
                        Point a3 = a(z, i, i2, i6, i7);
                        int i8 = a2.n;
                        int i9 = a2.o;
                        int i10 = i8 * i9;
                        if (i8 >= ((int) (((float) a3.x) * 0.98f)) && i9 >= ((int) (((float) a3.y) * 0.98f)) && i10 < i4) {
                            i4 = i10;
                        }
                    }
                }
            }
            if (i4 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int a4 = trackGroup.a(((Integer) arrayList.get(size)).intValue()).a();
                    if (a4 == -1 || a4 > i4) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    private static Point a(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            boolean z2 = true;
            boolean z3 = i3 > i4;
            if (i <= i2) {
                z2 = false;
            }
        }
        int i5 = i2;
        i2 = i;
        i = i5;
        int i6 = i3 * i;
        int i7 = i4 * i2;
        if (i6 >= i7) {
            return new Point(i2, C0471ar.a(i7, i3));
        }
        return new Point(C0471ar.a(i6, i4), i);
    }
}
