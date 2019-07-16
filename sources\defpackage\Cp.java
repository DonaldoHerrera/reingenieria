package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: Cp reason: default package */
/* compiled from: Tx3gDecoder */
public final class Cp extends Vo {
    private static final int o = C0471ar.b("styl");
    private static final int p = C0471ar.b("tbox");
    private final Pq q = new Pq();
    private boolean r;
    private int s;
    private int t;
    private String u;
    private float v;
    private int w;

    public Cp(List<byte[]> list) {
        super("Tx3gDecoder");
        a(list);
    }

    private void a(List<byte[]> list) {
        String str = "sans-serif";
        boolean z = false;
        if (list != null && list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.s = bArr[24];
            this.t = ((bArr[26] & 255) << Ascii.CAN) | ((bArr[27] & 255) << Ascii.DLE) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            if ("Serif".equals(C0471ar.a(bArr, 43, bArr.length - 43))) {
                str = "serif";
            }
            this.u = str;
            this.w = bArr[25] * Ascii.DC4;
            if ((bArr[0] & 32) != 0) {
                z = true;
            }
            this.r = z;
            if (this.r) {
                this.v = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) this.w);
                this.v = C0471ar.a(this.v, 0.0f, 0.95f);
                return;
            }
            this.v = 0.85f;
            return;
        }
        this.s = 0;
        this.t = -1;
        this.u = str;
        this.r = false;
        this.v = 0.85f;
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = true;
            boolean z2 = (i & 1) != 0;
            boolean z3 = (i & 2) != 0;
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z = false;
            }
            if (z) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z && !z2 && !z3) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Xo a(byte[] bArr, int i, boolean z) throws Zo {
        this.q.a(bArr, i);
        String a = a(this.q);
        if (a.isEmpty()) {
            return Dp.a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        b(spannableStringBuilder2, this.s, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder2, this.t, -1, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder2, this.u, "sans-serif", 0, spannableStringBuilder.length(), 16711680);
        float f = this.v;
        while (this.q.a() >= 8) {
            int c = this.q.c();
            int h = this.q.h();
            int h2 = this.q.h();
            boolean z2 = true;
            if (h2 == o) {
                if (this.q.a() < 2) {
                    z2 = false;
                }
                a(z2);
                int z3 = this.q.z();
                for (int i2 = 0; i2 < z3; i2++) {
                    a(this.q, spannableStringBuilder);
                }
            } else if (h2 == p && this.r) {
                if (this.q.a() < 2) {
                    z2 = false;
                }
                a(z2);
                f = C0471ar.a(((float) this.q.z()) / ((float) this.w), 0.0f, 0.95f);
            }
            this.q.e(c + h);
        }
        Uo uo = new Uo(spannableStringBuilder, null, f, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
        return new Dp(uo);
    }

    private static String a(Pq pq) throws Zo {
        a(pq.a() >= 2);
        int z = pq.z();
        if (z == 0) {
            return "";
        }
        if (pq.a() >= 2) {
            char e = pq.e();
            if (e == 65279 || e == 65534) {
                return pq.a(z, Charset.forName("UTF-16"));
            }
        }
        return pq.a(z, Charset.forName("UTF-8"));
    }

    private void a(Pq pq, SpannableStringBuilder spannableStringBuilder) throws Zo {
        a(pq.a() >= 12);
        int z = pq.z();
        int z2 = pq.z();
        pq.f(2);
        int t2 = pq.t();
        pq.f(1);
        int h = pq.h();
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i = z;
        int i2 = z2;
        b(spannableStringBuilder2, t2, this.s, i, i2, 0);
        a(spannableStringBuilder2, h, this.t, i, i2, 0);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i, int i2, int i3) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, i3 | 33);
        }
    }

    private static void a(boolean z) throws Zo {
        if (!z) {
            throw new Zo("Unexpected subtitle format.");
        }
    }
}
