package defpackage;

import android.os.Build.VERSION;
import android.text.PrecomputedText.Params;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.concurrent.Executor;

/* renamed from: Jb reason: default package and case insensitive filesystem */
/* compiled from: PrecomputedTextCompat */
public class C0219Jb implements Spannable {
    private static final Object a = new Object();
    private static Executor b = null;
    private final Spannable c;
    private final a d;

    /* renamed from: Jb$a */
    /* compiled from: PrecomputedTextCompat */
    public static final class a {
        private final TextPaint a;
        private final TextDirectionHeuristic b;
        private final int c;
        private final int d;
        final Params e = null;

        /* renamed from: Jb$a$a reason: collision with other inner class name */
        /* compiled from: PrecomputedTextCompat */
        public static class C0001a {
            private final TextPaint a;
            private TextDirectionHeuristic b;
            private int c;
            private int d;

            public C0001a(TextPaint textPaint) {
                this.a = textPaint;
                if (VERSION.SDK_INT >= 23) {
                    this.c = 1;
                    this.d = 1;
                } else {
                    this.d = 0;
                    this.c = 0;
                }
                if (VERSION.SDK_INT >= 18) {
                    this.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.b = null;
                }
            }

            public C0001a a(int i) {
                this.c = i;
                return this;
            }

            public C0001a b(int i) {
                this.d = i;
                return this;
            }

            public C0001a a(TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }

            public a a() {
                return new a(this.a, this.b, this.c, this.d);
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = i;
            this.d = i2;
        }

        public int a() {
            return this.c;
        }

        public int b() {
            return this.d;
        }

        public TextDirectionHeuristic c() {
            return this.b;
        }

        public TextPaint d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            return VERSION.SDK_INT < 18 || this.b == aVar.c();
        }

        public int hashCode() {
            int i = VERSION.SDK_INT;
            if (i >= 24) {
                return C0243Pb.a(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            } else if (i >= 21) {
                return C0243Pb.a(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            } else if (i >= 18) {
                return C0243Pb.a(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            } else if (i >= 17) {
                return C0243Pb.a(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            } else {
                return C0243Pb.a(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("textSize=");
            sb2.append(this.a.getTextSize());
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(", textScaleX=");
            sb3.append(this.a.getTextScaleX());
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(", textSkewX=");
            sb4.append(this.a.getTextSkewX());
            sb.append(sb4.toString());
            if (VERSION.SDK_INT >= 21) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(", letterSpacing=");
                sb5.append(this.a.getLetterSpacing());
                sb.append(sb5.toString());
                StringBuilder sb6 = new StringBuilder();
                sb6.append(", elegantTextHeight=");
                sb6.append(this.a.isElegantTextHeight());
                sb.append(sb6.toString());
            }
            int i = VERSION.SDK_INT;
            String str = ", textLocale=";
            if (i >= 24) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(this.a.getTextLocales());
                sb.append(sb7.toString());
            } else if (i >= 17) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(this.a.getTextLocale());
                sb.append(sb8.toString());
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append(", typeface=");
            sb9.append(this.a.getTypeface());
            sb.append(sb9.toString());
            if (VERSION.SDK_INT >= 26) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(", variationSettings=");
                sb10.append(this.a.getFontVariationSettings());
                sb.append(sb10.toString());
            }
            StringBuilder sb11 = new StringBuilder();
            sb11.append(", textDir=");
            sb11.append(this.b);
            sb.append(sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append(", breakStrategy=");
            sb12.append(this.c);
            sb.append(sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(", hyphenationFrequency=");
            sb13.append(this.d);
            sb.append(sb13.toString());
            sb.append("}");
            return sb.toString();
        }

        public boolean a(a aVar) {
            Params params = this.e;
            if (params != null) {
                return params.equals(aVar.e);
            }
            if ((VERSION.SDK_INT >= 23 && (this.c != aVar.a() || this.d != aVar.b())) || this.a.getTextSize() != aVar.d().getTextSize() || this.a.getTextScaleX() != aVar.d().getTextScaleX() || this.a.getTextSkewX() != aVar.d().getTextSkewX()) {
                return false;
            }
            if ((VERSION.SDK_INT >= 21 && (this.a.getLetterSpacing() != aVar.d().getLetterSpacing() || !TextUtils.equals(this.a.getFontFeatureSettings(), aVar.d().getFontFeatureSettings()))) || this.a.getFlags() != aVar.d().getFlags()) {
                return false;
            }
            int i = VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.a.getTextLocales().equals(aVar.d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.a.getTextLocale().equals(aVar.d().getTextLocale())) {
                return false;
            }
            if (this.a.getTypeface() == null) {
                if (aVar.d().getTypeface() != null) {
                    return false;
                }
            } else if (!this.a.getTypeface().equals(aVar.d().getTypeface())) {
                return false;
            }
            return true;
        }

        public a(Params params) {
            this.a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
        }
    }

    public a a() {
        return this.d;
    }

    public char charAt(int i) {
        return this.c.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.c.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.c.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.c.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.c.getSpans(i, i2, cls);
    }

    public int length() {
        return this.c.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.c.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.c.removeSpan(obj);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.c.setSpan(obj, i, i2, i3);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public CharSequence subSequence(int i, int i2) {
        return this.c.subSequence(i, i2);
    }

    public String toString() {
        return this.c.toString();
    }
}
