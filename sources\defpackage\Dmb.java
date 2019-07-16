package defpackage;

/* renamed from: Dmb reason: default package */
/* compiled from: Flags */
public class Dmb {
    public static final a A = c.a((c<?>) z);
    public static final a B = c.a((c<?>) A);
    public static final a C = c.a((c<?>) b);
    public static final a D = c.a((c<?>) C);
    public static final a E = c.a((c<?>) D);
    public static final a F = c.a(d);
    public static final a G = c.a((c<?>) F);
    public static final a H = c.a((c<?>) G);
    public static final a I = c.a();
    public static final a J = c.a((c<?>) I);
    public static final a K = c.a();
    public static final a a = c.a();
    public static final a b = c.a();
    public static final c<C7762ymb> c = c.a(b, C7762ymb.values());
    public static final c<Glb> d = c.a(c, Glb.values());
    public static final c<defpackage.C6458flb.b> e = c.a(d, defpackage.C6458flb.b.values());
    public static final a f = c.a(e);
    public static final a g = c.a((c<?>) f);
    public static final a h = c.a((c<?>) g);
    public static final a i = c.a((c<?>) h);
    public static final a j = c.a((c<?>) i);
    public static final a k = c.a(c);
    public static final c<Elb> l = c.a(d, Elb.values());
    public static final a m = c.a(l);
    public static final a n = c.a((c<?>) m);
    public static final a o = c.a((c<?>) n);
    public static final a p = c.a((c<?>) o);
    public static final a q = c.a((c<?>) p);
    public static final a r = c.a((c<?>) q);
    public static final a s = c.a((c<?>) r);
    public static final a t = c.a(l);
    public static final a u = c.a((c<?>) t);
    public static final a v = c.a((c<?>) u);
    public static final a w = c.a((c<?>) v);
    public static final a x = c.a((c<?>) w);
    public static final a y = c.a((c<?>) x);
    public static final a z = c.a((c<?>) y);

    /* renamed from: Dmb$a */
    /* compiled from: Flags */
    public static class a extends c<Boolean> {
        public a(int i) {
            super(i, 1);
        }

        private static /* synthetic */ void b(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"}));
        }

        public Boolean a(int i) {
            boolean z = true;
            if ((i & (1 << this.a)) == 0) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf != null) {
                return valueOf;
            }
            b(0);
            throw null;
        }

        public int a(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.a;
            }
            return 0;
        }
    }

    /* renamed from: Dmb$b */
    /* compiled from: Flags */
    private static class b<E extends defpackage.Nnb.a> extends c<E> {
        private final E[] c;

        public b(int i, E[] eArr) {
            super(i, a(eArr));
            this.c = eArr;
        }

        private static /* synthetic */ void b(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"}));
        }

        private static <E> int a(E[] eArr) {
            if (eArr != null) {
                int length = eArr.length - 1;
                if (length == 0) {
                    return 1;
                }
                for (int i = 31; i >= 0; i--) {
                    if (((1 << i) & length) != 0) {
                        return i + 1;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Empty enum: ");
                sb.append(eArr.getClass());
                throw new IllegalStateException(sb.toString());
            }
            b(0);
            throw null;
        }

        public E a(int i) {
            E[] eArr;
            int i2 = (1 << this.b) - 1;
            int i3 = this.a;
            int i4 = (i & (i2 << i3)) >> i3;
            for (E e : this.c) {
                if (e.i() == i4) {
                    return e;
                }
            }
            return null;
        }

        public int a(E e) {
            return e.i() << this.a;
        }
    }

    /* renamed from: Dmb$c */
    /* compiled from: Flags */
    public static abstract class c<E> {
        public final int a;
        public final int b;

        public static <E extends defpackage.Nnb.a> c<E> a(c<?> cVar, E[] eArr) {
            return new b(cVar.a + cVar.b, eArr);
        }

        public abstract int a(E e);

        public abstract E a(int i);

        private c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public static a a() {
            return new a(0);
        }

        public static a a(c<?> cVar) {
            return new a(cVar.a + cVar.b);
        }
    }

    public static int a(boolean z2, C7762ymb ymb, Glb glb, boolean z3, boolean z4, boolean z5) {
        if (ymb == null) {
            a(10);
            throw null;
        } else if (glb != null) {
            return b.a(Boolean.valueOf(z2)) | d.a(glb) | c.a(ymb) | F.a(Boolean.valueOf(z3)) | G.a(Boolean.valueOf(z4)) | H.a(Boolean.valueOf(z5));
        } else {
            a(11);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    private static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        if (i2 != 1) {
            if (i2 == 2) {
                objArr[0] = "kind";
            } else if (i2 != 5) {
                if (i2 != 6) {
                    if (i2 != 8) {
                        if (i2 != 9) {
                            if (i2 != 11) {
                                objArr[0] = "visibility";
                            }
                        }
                    }
                }
                objArr[0] = "memberKind";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
            switch (i2) {
                case 3:
                    objArr[2] = "getConstructorFlags";
                    break;
                case 4:
                case 5:
                case 6:
                    objArr[2] = "getFunctionFlags";
                    break;
                case 7:
                case 8:
                case 9:
                    objArr[2] = "getPropertyFlags";
                    break;
                case 10:
                case 11:
                    objArr[2] = "getAccessorFlags";
                    break;
                default:
                    objArr[2] = "getClassFlags";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
        objArr[0] = "modality";
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i2) {
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
            case 10:
            case 11:
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
