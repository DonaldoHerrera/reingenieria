package defpackage;

import android.text.SpannableStringBuilder;
import com.google.common.base.Ascii;
import java.util.Locale;

/* renamed from: Hb reason: default package and case insensitive filesystem */
/* compiled from: BidiFormatter */
public final class C0211Hb {
    static final C0223Kb a = C0227Lb.c;
    private static final String b = Character.toString(8206);
    private static final String c = Character.toString(8207);
    static final C0211Hb d = new C0211Hb(false, 2, a);
    static final C0211Hb e = new C0211Hb(true, 2, a);
    private final boolean f;
    private final int g;
    private final C0223Kb h;

    /* renamed from: Hb$a */
    /* compiled from: BidiFormatter */
    public static final class a {
        private boolean a;
        private int b;
        private C0223Kb c;

        public a() {
            b(C0211Hb.a(Locale.getDefault()));
        }

        private static C0211Hb a(boolean z) {
            return z ? C0211Hb.e : C0211Hb.d;
        }

        private void b(boolean z) {
            this.a = z;
            this.c = C0211Hb.a;
            this.b = 2;
        }

        public C0211Hb a() {
            if (this.b == 2 && this.c == C0211Hb.a) {
                return a(this.a);
            }
            return new C0211Hb(this.a, this.b, this.c);
        }
    }

    /* renamed from: Hb$b */
    /* compiled from: BidiFormatter */
    private static class b {
        private static final byte[] a = new byte[1792];
        private final CharSequence b;
        private final boolean c;
        private final int d;
        private int e;
        private char f;

        static {
            for (int i = 0; i < 1792; i++) {
                a[i] = Character.getDirectionality(i);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.b = charSequence;
            this.c = z;
            this.d = charSequence.length();
        }

        private static byte a(char c2) {
            return c2 < 1792 ? a[c2] : Character.getDirectionality(c2);
        }

        private byte e() {
            char c2;
            int i = this.e;
            do {
                int i2 = this.e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.b;
                int i3 = i2 - 1;
                this.e = i3;
                this.f = charSequence.charAt(i3);
                c2 = this.f;
                if (c2 == '&') {
                    return Ascii.FF;
                }
            } while (c2 != ';');
            this.e = i;
            this.f = ';';
            return Ascii.CR;
        }

        private byte f() {
            char charAt;
            do {
                int i = this.e;
                if (i >= this.d) {
                    break;
                }
                CharSequence charSequence = this.b;
                this.e = i + 1;
                charAt = charSequence.charAt(i);
                this.f = charAt;
            } while (charAt != ';');
            return Ascii.FF;
        }

        private byte g() {
            char charAt;
            int i = this.e;
            while (true) {
                int i2 = this.e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.b;
                int i3 = i2 - 1;
                this.e = i3;
                this.f = charSequence.charAt(i3);
                char c2 = this.f;
                if (c2 == '<') {
                    return Ascii.FF;
                }
                if (c2 == '>') {
                    break;
                } else if (c2 == '\"' || c2 == '\'') {
                    char c3 = this.f;
                    do {
                        int i4 = this.e;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.b;
                        int i5 = i4 - 1;
                        this.e = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f = charAt;
                    } while (charAt != c3);
                }
            }
            this.e = i;
            this.f = '>';
            return Ascii.CR;
        }

        private byte h() {
            char charAt;
            int i = this.e;
            while (true) {
                int i2 = this.e;
                if (i2 < this.d) {
                    CharSequence charSequence = this.b;
                    this.e = i2 + 1;
                    this.f = charSequence.charAt(i2);
                    char c2 = this.f;
                    if (c2 == '>') {
                        return Ascii.FF;
                    }
                    if (c2 == '\"' || c2 == '\'') {
                        char c3 = this.f;
                        do {
                            int i3 = this.e;
                            if (i3 >= this.d) {
                                break;
                            }
                            CharSequence charSequence2 = this.b;
                            this.e = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f = charAt;
                        } while (charAt != c3);
                    }
                } else {
                    this.e = i;
                    this.f = '<';
                    return Ascii.CR;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public byte b() {
            this.f = this.b.charAt(this.e);
            if (Character.isHighSurrogate(this.f)) {
                int codePointAt = Character.codePointAt(this.b, this.e);
                this.e += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.e++;
            byte a2 = a(this.f);
            if (this.c) {
                char c2 = this.f;
                if (c2 == '<') {
                    a2 = h();
                } else if (c2 == '&') {
                    a2 = f();
                }
            }
            return a2;
        }

        /* access modifiers changed from: 0000 */
        public int c() {
            this.e = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.e < this.d && i == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.e > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r2 = r2 - 1;
         */
        public int d() {
            this.e = this.d;
            int i = 0;
            int i2 = 0;
            while (this.e > 0) {
                byte a2 = a();
                if (a2 != 0) {
                    if (a2 == 1 || a2 == 2) {
                        if (i2 == 0) {
                            return 1;
                        }
                        if (i != 0) {
                        }
                    } else if (a2 != 9) {
                        switch (a2) {
                            case 14:
                            case 15:
                                if (i == i2) {
                                    return -1;
                                }
                                break;
                            case 16:
                            case 17:
                                if (i == i2) {
                                    return 1;
                                }
                                break;
                            case 18:
                                i2++;
                                break;
                            default:
                                if (i != 0) {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else if (i2 == 0) {
                    return -1;
                } else {
                    if (i != 0) {
                    }
                }
                i = i2;
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        public byte a() {
            this.f = this.b.charAt(this.e - 1);
            if (Character.isLowSurrogate(this.f)) {
                int codePointBefore = Character.codePointBefore(this.b, this.e);
                this.e -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.e--;
            byte a2 = a(this.f);
            if (this.c) {
                char c2 = this.f;
                if (c2 == '>') {
                    a2 = g();
                } else if (c2 == ';') {
                    a2 = e();
                }
            }
            return a2;
        }
    }

    C0211Hb(boolean z, int i, C0223Kb kb) {
        this.f = z;
        this.g = i;
        this.h = kb;
    }

    public static C0211Hb a() {
        return new a().a();
    }

    private static int c(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public boolean b() {
        return (this.g & 2) != 0;
    }

    private String a(CharSequence charSequence, C0223Kb kb) {
        boolean isRtl = kb.isRtl(charSequence, 0, charSequence.length());
        if (this.f || (!isRtl && c(charSequence) != 1)) {
            return (!this.f || (isRtl && c(charSequence) != -1)) ? "" : c;
        }
        return b;
    }

    private String b(CharSequence charSequence, C0223Kb kb) {
        boolean isRtl = kb.isRtl(charSequence, 0, charSequence.length());
        if (this.f || (!isRtl && b(charSequence) != 1)) {
            return (!this.f || (isRtl && b(charSequence) != -1)) ? "" : c;
        }
        return b;
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).c();
    }

    public CharSequence a(CharSequence charSequence, C0223Kb kb, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = kb.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (b() && z) {
            spannableStringBuilder.append(b(charSequence, isRtl ? C0227Lb.b : C0227Lb.a));
        }
        if (isRtl != this.f) {
            spannableStringBuilder.append(isRtl ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(a(charSequence, isRtl ? C0227Lb.b : C0227Lb.a));
        }
        return spannableStringBuilder;
    }

    public CharSequence a(CharSequence charSequence) {
        return a(charSequence, this.h, true);
    }

    static boolean a(Locale locale) {
        return C0231Mb.a(locale) == 1;
    }
}
