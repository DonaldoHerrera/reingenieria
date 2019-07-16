package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: op reason: default package and case insensitive filesystem */
/* compiled from: DvbParser */
final class C1581op {
    private static final byte[] a = {0, 7, 8, Ascii.SI};
    private static final byte[] b = {0, 119, -120, -1};
    private static final byte[] c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint d = new Paint();
    private final Paint e;
    private final Canvas f;
    private final b g;
    private final a h;
    private final h i;
    private Bitmap j;

    /* renamed from: op$a */
    /* compiled from: DvbParser */
    private static final class a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    /* renamed from: op$b */
    /* compiled from: DvbParser */
    private static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    /* renamed from: op$c */
    /* compiled from: DvbParser */
    private static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    /* renamed from: op$d */
    /* compiled from: DvbParser */
    private static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final SparseArray<e> d;

        public d(int i, int i2, int i3, SparseArray<e> sparseArray) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = sparseArray;
        }
    }

    /* renamed from: op$e */
    /* compiled from: DvbParser */
    private static final class e {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* renamed from: op$f */
    /* compiled from: DvbParser */
    private static final class f {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final SparseArray<g> k;

        public f(int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray<g> sparseArray) {
            this.a = i2;
            this.b = z;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = i9;
            this.j = i10;
            this.k = sparseArray;
        }

        public void a(f fVar) {
            if (fVar != null) {
                SparseArray<g> sparseArray = fVar.k;
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    this.k.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
                }
            }
        }
    }

    /* renamed from: op$g */
    /* compiled from: DvbParser */
    private static final class g {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    /* renamed from: op$h */
    /* compiled from: DvbParser */
    private static final class h {
        public final int a;
        public final int b;
        public final SparseArray<f> c = new SparseArray<>();
        public final SparseArray<a> d = new SparseArray<>();
        public final SparseArray<c> e = new SparseArray<>();
        public final SparseArray<a> f = new SparseArray<>();
        public final SparseArray<c> g = new SparseArray<>();
        public b h;
        public d i;

        public h(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }

        public void a() {
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
            this.i = null;
        }
    }

    public C1581op(int i2, int i3) {
        this.d.setStyle(Style.FILL_AND_STROKE);
        this.d.setXfermode(new PorterDuffXfermode(Mode.SRC));
        this.d.setPathEffect(null);
        this.e = new Paint();
        this.e.setStyle(Style.FILL);
        this.e.setXfermode(new PorterDuffXfermode(Mode.DST_OVER));
        this.e.setPathEffect(null);
        this.f = new Canvas();
        b bVar = new b(719, 575, 0, 719, 0, 575);
        this.g = bVar;
        this.h = new a(0, b(), c(), d());
        this.i = new h(i2, i3);
    }

    private static int a(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    private static d b(Oq oq, int i2) {
        int a2 = oq.a(8);
        int a3 = oq.a(4);
        int a4 = oq.a(2);
        oq.c(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int a5 = oq.a(8);
            oq.c(8);
            i3 -= 6;
            sparseArray.put(a5, new e(oq.a(16), oq.a(16)));
        }
        return new d(a2, a3, a4, sparseArray);
    }

    private static f c(Oq oq, int i2) {
        int i3;
        int i4;
        Oq oq2 = oq;
        int a2 = oq2.a(8);
        oq2.c(4);
        boolean e2 = oq.e();
        oq2.c(3);
        int i5 = 16;
        int a3 = oq2.a(16);
        int a4 = oq2.a(16);
        int a5 = oq2.a(3);
        int a6 = oq2.a(3);
        int i6 = 2;
        oq2.c(2);
        int a7 = oq2.a(8);
        int a8 = oq2.a(8);
        int a9 = oq2.a(4);
        int a10 = oq2.a(2);
        oq2.c(2);
        int i7 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i7 > 0) {
            int a11 = oq2.a(i5);
            int a12 = oq2.a(i6);
            int a13 = oq2.a(i6);
            int a14 = oq2.a(12);
            int i8 = a10;
            oq2.c(4);
            int a15 = oq2.a(12);
            i7 -= 6;
            if (a12 == 1 || a12 == 2) {
                i7 -= 2;
                i4 = oq2.a(8);
                i3 = oq2.a(8);
            } else {
                i4 = 0;
                i3 = 0;
            }
            g gVar = new g(a12, a13, a14, a15, i4, i3);
            sparseArray.put(a11, gVar);
            a10 = i8;
            i6 = 2;
            i5 = 16;
        }
        f fVar = new f(a2, e2, a3, a4, a5, a6, a7, a8, a9, a10, sparseArray);
        return fVar;
    }

    private static int[] d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = 255;
            if (i2 < 8) {
                int i4 = (i2 & 1) != 0 ? 255 : 0;
                int i5 = (i2 & 2) != 0 ? 255 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = a(63, i4, i5, i3);
            } else {
                int i6 = i2 & 136;
                int i7 = 170;
                int i8 = 85;
                if (i6 == 0) {
                    int i9 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i10 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = a(255, i9, i10, i8 + i7);
                } else if (i6 != 8) {
                    int i11 = 43;
                    if (i6 == 128) {
                        int i12 = ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0);
                        int i13 = ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        int i14 = i11 + 127;
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = a(255, i12, i13, i14 + i8);
                    } else if (i6 == 136) {
                        int i15 = ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0);
                        int i16 = ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = a(255, i15, i16, i11 + i8);
                    }
                } else {
                    int i17 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i18 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = a(127, i17, i18, i8 + i7);
                }
            }
        }
        return iArr;
    }

    public void a() {
        this.i.a();
    }

    public List<Uo> a(byte[] bArr, int i2) {
        int i3;
        int i4;
        SparseArray<g> sparseArray;
        Oq oq = new Oq(bArr, i2);
        while (oq.a() >= 48 && oq.a(8) == 15) {
            a(oq, this.i);
        }
        h hVar = this.i;
        if (hVar.i == null) {
            return Collections.emptyList();
        }
        b bVar = hVar.h;
        if (bVar == null) {
            bVar = this.g;
        }
        Bitmap bitmap = this.j;
        if (!(bitmap != null && bVar.a + 1 == bitmap.getWidth() && bVar.b + 1 == this.j.getHeight())) {
            this.j = Bitmap.createBitmap(bVar.a + 1, bVar.b + 1, Config.ARGB_8888);
            this.f.setBitmap(this.j);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = this.i.i.d;
        for (int i5 = 0; i5 < sparseArray2.size(); i5++) {
            this.f.save();
            e eVar = (e) sparseArray2.valueAt(i5);
            f fVar = (f) this.i.c.get(sparseArray2.keyAt(i5));
            int i6 = eVar.a + bVar.c;
            int i7 = eVar.b + bVar.e;
            this.f.clipRect(i6, i7, Math.min(fVar.c + i6, bVar.d), Math.min(fVar.d + i7, bVar.f));
            a aVar = (a) this.i.d.get(fVar.g);
            if (aVar == null) {
                aVar = (a) this.i.f.get(fVar.g);
                if (aVar == null) {
                    aVar = this.h;
                }
            }
            SparseArray<g> sparseArray3 = fVar.k;
            int i8 = 0;
            while (i8 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i8);
                g gVar = (g) sparseArray3.valueAt(i8);
                c cVar = (c) this.i.e.get(keyAt);
                c cVar2 = cVar == null ? (c) this.i.g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i4 = i8;
                    sparseArray = sparseArray3;
                    a(cVar2, aVar, fVar.f, gVar.c + i6, i7 + gVar.d, cVar2.b ? null : this.d, this.f);
                } else {
                    i4 = i8;
                    sparseArray = sparseArray3;
                }
                i8 = i4 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.b) {
                int i9 = fVar.f;
                if (i9 == 3) {
                    i3 = aVar.d[fVar.h];
                } else if (i9 == 2) {
                    i3 = aVar.c[fVar.i];
                } else {
                    i3 = aVar.b[fVar.j];
                }
                this.e.setColor(i3);
                this.f.drawRect((float) i6, (float) i7, (float) (fVar.c + i6), (float) (fVar.d + i7), this.e);
            }
            Bitmap createBitmap = Bitmap.createBitmap(this.j, i6, i7, fVar.c, fVar.d);
            float f2 = (float) i6;
            int i10 = bVar.a;
            float f3 = f2 / ((float) i10);
            float f4 = (float) i7;
            int i11 = bVar.b;
            Uo uo = new Uo(createBitmap, f3, 0, f4 / ((float) i11), 0, ((float) fVar.c) / ((float) i10), ((float) fVar.d) / ((float) i11));
            arrayList.add(uo);
            this.f.drawColor(0, Mode.CLEAR);
            this.f.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static c b(Oq oq) {
        byte[] bArr;
        int a2 = oq.a(16);
        oq.c(4);
        int a3 = oq.a(2);
        boolean e2 = oq.e();
        oq.c(1);
        byte[] bArr2 = null;
        if (a3 == 1) {
            oq.c(oq.a(8) * 16);
        } else if (a3 == 0) {
            int a4 = oq.a(16);
            int a5 = oq.a(16);
            if (a4 > 0) {
                bArr2 = new byte[a4];
                oq.b(bArr2, 0, a4);
            }
            if (a5 > 0) {
                bArr = new byte[a5];
                oq.b(bArr, 0, a5);
                return new c(a2, e2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(a2, e2, bArr2, bArr);
    }

    private static int[] b() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                int i3 = 127;
                int i4 = (i2 & 1) != 0 ? 127 : 0;
                int i5 = (i2 & 2) != 0 ? 127 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = a(255, i4, i5, i3);
            }
        }
        return iArr;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r4v0, types: [int] */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4, types: [byte] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7, types: [int] */
    /* JADX WARNING: type inference failed for: r3v8, types: [int] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11, types: [int] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v4, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r15v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v10
  assigns: []
  uses: []
  mth insns count: 77
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008f A[LOOP:0: B:1:0x0009->B:33:0x008f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 12 */
    private static int b(Oq oq, int[] iArr, byte[] r15, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int i4;
        ? r3;
        ? r32;
        int a2;
        ? r33;
        ? r34;
        Oq oq2 = oq;
        int i5 = i3;
        Paint paint2 = paint;
        int i6 = i2;
        boolean z2 = false;
        while (true) {
            ? a3 = oq.a(4);
            if (a3 != 0) {
                z = z2;
                r32 = a3;
            } else {
                if (!oq.e()) {
                    int a4 = oq.a(3);
                    if (a4 != 0) {
                        z = z2;
                        i4 = a4 + 2;
                        r3 = 0;
                    } else {
                        i4 = 0;
                        z = true;
                        r3 = 0;
                    }
                } else {
                    if (!oq.e()) {
                        a2 = oq.a(2) + 4;
                        r33 = oq.a(4);
                    } else {
                        int a5 = oq.a(2);
                        if (a5 == 0) {
                            z = z2;
                            r32 = 0;
                        } else if (a5 == 1) {
                            z = z2;
                            i4 = 2;
                            r3 = 0;
                        } else if (a5 == 2) {
                            a2 = oq.a(4) + 9;
                            r33 = oq.a(4);
                        } else if (a5 != 3) {
                            z = z2;
                            i4 = 0;
                            r3 = 0;
                        } else {
                            a2 = oq.a(8) + 25;
                            r33 = oq.a(4);
                        }
                    }
                    z = z2;
                    i4 = a2;
                    r3 = r33;
                }
                if (!(i4 == 0 || paint2 == null)) {
                    if (r15 != 0) {
                        r3 = r15[r3];
                    }
                    paint2.setColor(iArr[r3]);
                    Canvas canvas2 = canvas;
                    canvas2.drawRect((float) i6, (float) i5, (float) (i6 + i4), (float) (i5 + 1), paint);
                }
                i6 += i4;
                if (!z) {
                    return i6;
                }
                z2 = z;
            }
            i4 = 1;
            r3 = r34;
            if (r15 != 0) {
            }
            paint2.setColor(iArr[r3]);
            Canvas canvas22 = canvas;
            canvas22.drawRect((float) i6, (float) i5, (float) (i6 + i4), (float) (i5 + 1), paint);
            i6 += i4;
            if (!z) {
            }
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v4, types: [byte] */
    private static int c(Oq oq, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int i4;
        int i5;
        Oq oq2 = oq;
        int i6 = i3;
        Paint paint2 = paint;
        int i7 = i2;
        boolean z2 = false;
        while (true) {
            int a2 = oq.a(8);
            if (a2 != 0) {
                z = z2;
                i5 = a2;
                i4 = 1;
            } else if (!oq.e()) {
                int a3 = oq.a(7);
                if (a3 != 0) {
                    z = z2;
                    i4 = a3;
                    i5 = 0;
                } else {
                    i4 = 0;
                    z = true;
                    i5 = 0;
                }
            } else {
                z = z2;
                i4 = oq.a(7);
                i5 = oq.a(8);
            }
            if (!(i4 == 0 || paint2 == null)) {
                if (bArr != 0) {
                    i5 = bArr[i5];
                }
                paint2.setColor(iArr[i5]);
                Canvas canvas2 = canvas;
                canvas2.drawRect((float) i7, (float) i6, (float) (i7 + i4), (float) (i6 + 1), paint);
            }
            i7 += i4;
            if (z) {
                return i7;
            }
            z2 = z;
        }
    }

    private static void a(Oq oq, h hVar) {
        int a2 = oq.a(8);
        int a3 = oq.a(16);
        int a4 = oq.a(16);
        int c2 = oq.c() + a4;
        if (a4 * 8 > oq.a()) {
            Iq.d("DvbParser", "Data field length exceeds limit");
            oq.c(oq.a());
            return;
        }
        switch (a2) {
            case 16:
                if (a3 == hVar.a) {
                    d dVar = hVar.i;
                    d b2 = b(oq, a4);
                    if (b2.c == 0) {
                        if (!(dVar == null || dVar.b == b2.b)) {
                            hVar.i = b2;
                            break;
                        }
                    } else {
                        hVar.i = b2;
                        hVar.c.clear();
                        hVar.d.clear();
                        hVar.e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.i;
                if (a3 == hVar.a && dVar2 != null) {
                    f c3 = c(oq, a4);
                    if (dVar2.c == 0) {
                        c3.a((f) hVar.c.get(c3.a));
                    }
                    hVar.c.put(c3.a, c3);
                    break;
                }
            case 18:
                if (a3 != hVar.a) {
                    if (a3 == hVar.b) {
                        a a5 = a(oq, a4);
                        hVar.f.put(a5.a, a5);
                        break;
                    }
                } else {
                    a a6 = a(oq, a4);
                    hVar.d.put(a6.a, a6);
                    break;
                }
                break;
            case 19:
                if (a3 != hVar.a) {
                    if (a3 == hVar.b) {
                        c b3 = b(oq);
                        hVar.g.put(b3.a, b3);
                        break;
                    }
                } else {
                    c b4 = b(oq);
                    hVar.e.put(b4.a, b4);
                    break;
                }
                break;
            case 20:
                if (a3 == hVar.a) {
                    hVar.h = a(oq);
                    break;
                }
                break;
        }
        oq.d(c2 - oq.c());
    }

    private static b a(Oq oq) {
        int i2;
        int i3;
        int i4;
        int i5;
        oq.c(4);
        boolean e2 = oq.e();
        oq.c(3);
        int a2 = oq.a(16);
        int a3 = oq.a(16);
        if (e2) {
            int a4 = oq.a(16);
            int a5 = oq.a(16);
            int a6 = oq.a(16);
            i2 = oq.a(16);
            i4 = a5;
            i3 = a6;
            i5 = a4;
        } else {
            i4 = a2;
            i2 = a3;
            i5 = 0;
            i3 = 0;
        }
        b bVar = new b(a2, a3, i5, i4, i3, i2);
        return bVar;
    }

    private static a a(Oq oq, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Oq oq2 = oq;
        int i8 = 8;
        int a2 = oq2.a(8);
        oq2.c(8);
        int i9 = 2;
        int i10 = i2 - 2;
        int[] b2 = b();
        int[] c2 = c();
        int[] d2 = d();
        while (i10 > 0) {
            int a3 = oq2.a(i8);
            int a4 = oq2.a(i8);
            int i11 = i10 - 2;
            int[] iArr = (a4 & 128) != 0 ? b2 : (a4 & 64) != 0 ? c2 : d2;
            if ((a4 & 1) != 0) {
                i6 = oq2.a(i8);
                i5 = oq2.a(i8);
                i4 = oq2.a(i8);
                i3 = oq2.a(i8);
                i7 = i11 - 4;
            } else {
                i4 = oq2.a(4) << 4;
                i7 = i11 - 2;
                i3 = oq2.a(i9) << 6;
                i6 = oq2.a(6) << i9;
                i5 = oq2.a(4) << 4;
            }
            if (i6 == 0) {
                i5 = 0;
                i4 = 0;
                i3 = 255;
            }
            int i12 = i7;
            double d3 = (double) i6;
            int i13 = a2;
            double d4 = (double) (i5 - 128);
            double d5 = (double) (i4 - 128);
            iArr[a3] = a((byte) (255 - (i3 & 255)), C0471ar.a((int) (d3 + (1.402d * d4)), 0, 255), C0471ar.a((int) ((d3 - (0.34414d * d5)) - (d4 * 0.71414d)), 0, 255), C0471ar.a((int) (d3 + (d5 * 1.772d)), 0, 255));
            i10 = i12;
            a2 = i13;
            i8 = 8;
            i9 = 2;
        }
        return new a(a2, b2, c2, d2);
    }

    private static void a(c cVar, a aVar, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i2 == 3) {
            iArr = aVar.d;
        } else if (i2 == 2) {
            iArr = aVar.c;
        } else {
            iArr = aVar.b;
        }
        int[] iArr2 = iArr;
        int i5 = i2;
        int i6 = i3;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        a(cVar.c, iArr2, i5, i6, i4, paint2, canvas2);
        a(cVar.d, iArr2, i5, i6, i4 + 1, paint2, canvas2);
    }

    private static void a(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        int a2;
        byte[] bArr3;
        byte[] bArr4;
        int i5 = i2;
        byte[] bArr5 = bArr;
        Oq oq = new Oq(bArr);
        int i6 = i3;
        int i7 = i4;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (oq.a() != 0) {
            int a3 = oq.a(8);
            if (a3 != 240) {
                switch (a3) {
                    case 16:
                        if (i5 != 3) {
                            if (i5 != 2) {
                                bArr2 = null;
                                a2 = a(oq, iArr, bArr2, i6, i7, paint, canvas);
                                oq.b();
                                break;
                            } else {
                                bArr3 = bArr7 == null ? a : bArr7;
                            }
                        } else {
                            bArr3 = bArr6 == null ? b : bArr6;
                        }
                        bArr2 = bArr3;
                        a2 = a(oq, iArr, bArr2, i6, i7, paint, canvas);
                        oq.b();
                    case 17:
                        a2 = b(oq, iArr, i5 == 3 ? c : null, i6, i7, paint, canvas);
                        oq.b();
                        break;
                    case 18:
                        a2 = c(oq, iArr, null, i6, i7, paint, canvas);
                        break;
                    default:
                        switch (a3) {
                            case 32:
                                bArr7 = a(4, 4, oq);
                                continue;
                            case 33:
                                bArr4 = a(4, 8, oq);
                                break;
                            case 34:
                                bArr4 = a(16, 8, oq);
                                break;
                            default:
                                continue;
                        }
                        bArr6 = bArr4;
                        break;
                }
                i6 = a2;
            } else {
                i7 += 2;
                i6 = i3;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r4v0, types: [int] */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4, types: [byte] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7, types: [int] */
    /* JADX WARNING: type inference failed for: r3v8, types: [int] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12, types: [int] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v4, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r15v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v11
  assigns: []
  uses: []
  mth insns count: 72
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083 A[LOOP:0: B:1:0x0009->B:30:0x0083, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 11 */
    private static int a(Oq oq, int[] iArr, byte[] r15, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int i4;
        ? r3;
        int a2;
        ? r32;
        ? r33;
        ? r34;
        Oq oq2 = oq;
        int i5 = i3;
        Paint paint2 = paint;
        int i6 = i2;
        boolean z2 = false;
        while (true) {
            ? a3 = oq.a(2);
            if (a3 != 0) {
                z = z2;
                r34 = a3;
            } else {
                if (oq.e()) {
                    a2 = oq.a(3) + 3;
                    r32 = oq.a(2);
                } else if (oq.e()) {
                    z = z2;
                    r34 = 0;
                } else {
                    int a4 = oq.a(2);
                    if (a4 == 0) {
                        i4 = 0;
                        z = true;
                        r3 = 0;
                    } else if (a4 == 1) {
                        z = z2;
                        i4 = 2;
                        r3 = 0;
                    } else if (a4 == 2) {
                        a2 = oq.a(4) + 12;
                        r32 = oq.a(2);
                    } else if (a4 != 3) {
                        z = z2;
                        i4 = 0;
                        r3 = 0;
                    } else {
                        a2 = oq.a(8) + 29;
                        r32 = oq.a(2);
                    }
                    if (!(i4 == 0 || paint2 == null)) {
                        if (r15 != 0) {
                            r3 = r15[r3];
                        }
                        paint2.setColor(iArr[r3]);
                        Canvas canvas2 = canvas;
                        canvas2.drawRect((float) i6, (float) i5, (float) (i6 + i4), (float) (i5 + 1), paint);
                    }
                    i6 += i4;
                    if (z) {
                        return i6;
                    }
                    z2 = z;
                }
                z = z2;
                i4 = a2;
                r3 = r32;
                if (r15 != 0) {
                }
                paint2.setColor(iArr[r3]);
                Canvas canvas22 = canvas;
                canvas22.drawRect((float) i6, (float) i5, (float) (i6 + i4), (float) (i5 + 1), paint);
                i6 += i4;
                if (z) {
                }
            }
            i4 = 1;
            r3 = r33;
            if (r15 != 0) {
            }
            paint2.setColor(iArr[r3]);
            Canvas canvas222 = canvas;
            canvas222.drawRect((float) i6, (float) i5, (float) (i6 + i4), (float) (i5 + 1), paint);
            i6 += i4;
            if (z) {
            }
        }
    }

    private static byte[] a(int i2, int i3, Oq oq) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) oq.a(i3);
        }
        return bArr;
    }
}
