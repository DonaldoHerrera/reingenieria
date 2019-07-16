package defpackage;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;

/* renamed from: Jp reason: default package */
/* compiled from: WebvttCue */
public final class Jp extends Uo {
    public final long o;
    public final long p;

    /* renamed from: Jp$a */
    /* compiled from: WebvttCue */
    public static class a {
        private long a;
        private long b;
        private SpannableStringBuilder c;
        private Alignment d;
        private float e;
        private int f;
        private int g;
        private float h;
        private int i;
        private float j;

        public a() {
            b();
        }

        public Jp a() {
            if (this.h != Float.MIN_VALUE && this.i == Integer.MIN_VALUE) {
                c();
            }
            Jp jp = new Jp(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
            return jp;
        }

        public void b() {
            this.a = 0;
            this.b = 0;
            this.c = null;
            this.d = null;
            this.e = Float.MIN_VALUE;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = Float.MIN_VALUE;
            this.i = Integer.MIN_VALUE;
            this.j = Float.MIN_VALUE;
        }

        public a c(int i2) {
            this.i = i2;
            return this;
        }

        public a c(float f2) {
            this.j = f2;
            return this;
        }

        private a c() {
            Alignment alignment = this.d;
            if (alignment == null) {
                this.i = Integer.MIN_VALUE;
            } else {
                int i2 = Ip.a[alignment.ordinal()];
                if (i2 == 1) {
                    this.i = 0;
                } else if (i2 == 2) {
                    this.i = 1;
                } else if (i2 != 3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unrecognized alignment: ");
                    sb.append(this.d);
                    Iq.d("WebvttCueBuilder", sb.toString());
                    this.i = 0;
                } else {
                    this.i = 2;
                }
            }
            return this;
        }

        public a a(long j2) {
            this.b = j2;
            return this;
        }

        public a a(SpannableStringBuilder spannableStringBuilder) {
            this.c = spannableStringBuilder;
            return this;
        }

        public a a(Alignment alignment) {
            this.d = alignment;
            return this;
        }

        public a a(float f2) {
            this.e = f2;
            return this;
        }

        public a a(int i2) {
            this.g = i2;
            return this;
        }

        public a b(long j2) {
            this.a = j2;
            return this;
        }

        public a b(int i2) {
            this.f = i2;
            return this;
        }

        public a b(float f2) {
            this.h = f2;
            return this;
        }
    }

    public Jp(CharSequence charSequence) {
        this(0, 0, charSequence);
    }

    public boolean a() {
        return this.d == Float.MIN_VALUE && this.g == Float.MIN_VALUE;
    }

    public Jp(long j, long j2, CharSequence charSequence) {
        this(j, j2, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public Jp(long j, long j2, CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.o = j;
        this.p = j2;
    }
}
