package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: Np reason: default package */
/* compiled from: WebvttSubtitle */
final class Np implements Xo {
    private final List<Jp> a;
    private final int b;
    private final long[] c = new long[(this.b * 2)];
    private final long[] d;

    public Np(List<Jp> list) {
        this.a = list;
        this.b = list.size();
        for (int i = 0; i < this.b; i++) {
            Jp jp = (Jp) list.get(i);
            int i2 = i * 2;
            long[] jArr = this.c;
            jArr[i2] = jp.o;
            jArr[i2 + 1] = jp.p;
        }
        long[] jArr2 = this.c;
        this.d = Arrays.copyOf(jArr2, jArr2.length);
        Arrays.sort(this.d);
    }

    public int a(long j) {
        int a2 = C0471ar.a(this.d, j, false, false);
        if (a2 < this.d.length) {
            return a2;
        }
        return -1;
    }

    public List<Uo> b(long j) {
        SpannableStringBuilder spannableStringBuilder = null;
        Jp jp = null;
        ArrayList arrayList = null;
        for (int i = 0; i < this.b; i++) {
            long[] jArr = this.c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Jp jp2 = (Jp) this.a.get(i);
                if (!jp2.a()) {
                    arrayList.add(jp2);
                } else if (jp == null) {
                    jp = jp2;
                } else {
                    String str = "\n";
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append(jp.a).append(str).append(jp2.a);
                    } else {
                        spannableStringBuilder.append(str).append(jp2.a);
                    }
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new Jp(spannableStringBuilder));
        } else if (jp != null) {
            arrayList.add(jp);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    public int a() {
        return this.d.length;
    }

    public long a(int i) {
        boolean z = true;
        C1852xq.a(i >= 0);
        if (i >= this.d.length) {
            z = false;
        }
        C1852xq.a(z);
        return this.d[i];
    }
}
