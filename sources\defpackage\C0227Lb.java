package defpackage;

import java.util.Locale;

/* renamed from: Lb reason: default package and case insensitive filesystem */
/* compiled from: TextDirectionHeuristicsCompat */
public final class C0227Lb {
    public static final C0223Kb a = new e(null, false);
    public static final C0223Kb b = new e(null, true);
    public static final C0223Kb c = new e(b.a, false);
    public static final C0223Kb d = new e(b.a, true);
    public static final C0223Kb e = new e(a.a, false);
    public static final C0223Kb f = f.b;

    /* renamed from: Lb$a */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class a implements c {
        static final a a = new a(true);
        private final boolean b;

        private a(boolean z) {
            this.b = z;
        }

        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a2 = C0227Lb.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a2 != 0) {
                    if (a2 != 1) {
                        continue;
                        i++;
                    } else if (!this.b) {
                        return 1;
                    }
                } else if (this.b) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.b ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: Lb$b */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class b implements c {
        static final b a = new b();

        private b() {
        }

        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C0227Lb.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: Lb$c */
    /* compiled from: TextDirectionHeuristicsCompat */
    private interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: Lb$d */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static abstract class d implements C0223Kb {
        private final c a;

        d(c cVar) {
            this.a = cVar;
        }

        private boolean a(CharSequence charSequence, int i, int i2) {
            int a2 = this.a.a(charSequence, i, i2);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return a();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public abstract boolean a();

        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.a == null) {
                return a();
            } else {
                return a(charSequence, i, i2);
            }
        }
    }

    /* renamed from: Lb$e */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class e extends d {
        private final boolean b;

        e(c cVar, boolean z) {
            super(cVar);
            this.b = z;
        }

        /* access modifiers changed from: protected */
        public boolean a() {
            return this.b;
        }
    }

    /* renamed from: Lb$f */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class f extends d {
        static final f b = new f();

        f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        public boolean a() {
            return C0231Mb.a(Locale.getDefault()) == 1;
        }
    }

    static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i) {
        if (i != 0) {
            if (!(i == 1 || i == 2)) {
                switch (i) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                        break;
                    default:
                        return 2;
                }
            }
            return 0;
        }
        return 1;
    }
}
