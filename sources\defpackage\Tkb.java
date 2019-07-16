package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: Tkb reason: default package */
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
public class Tkb implements defpackage.Dkb.c {
    private static final boolean a = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
    private static final Map<C7280rnb, defpackage.Rkb.a> b = new HashMap();
    /* access modifiers changed from: private */
    public int[] c = null;
    /* access modifiers changed from: private */
    public C6528gnb d = null;
    /* access modifiers changed from: private */
    public String e = null;
    /* access modifiers changed from: private */
    public int f = 0;
    /* access modifiers changed from: private */
    public String g = null;
    /* access modifiers changed from: private */
    public String[] h = null;
    /* access modifiers changed from: private */
    public String[] i = null;
    private String[] j = null;
    /* access modifiers changed from: private */
    public defpackage.Rkb.a k = null;

    /* renamed from: Tkb$a */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    private static abstract class a implements defpackage.Dkb.b {
        private final List<String> a = new ArrayList();

        private static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i != 2) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classLiteralValue";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i != 2) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitClassLiteral";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a(Mpb mpb) {
            if (mpb == null) {
                a(2);
                throw null;
            }
        }

        public void a(Object obj) {
            if (obj instanceof String) {
                this.a.add((String) obj);
            }
        }

        public void a(C7280rnb rnb, C7694xnb xnb) {
            if (rnb == null) {
                a(0);
                throw null;
            } else if (xnb == null) {
                a(1);
                throw null;
            }
        }

        /* access modifiers changed from: protected */
        public abstract void a(String[] strArr);

        public void a() {
            List<String> list = this.a;
            a((String[]) list.toArray(new String[list.size()]));
        }
    }

    /* renamed from: Tkb$b */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    private class b implements defpackage.Dkb.a {
        private b() {
        }

        private static /* synthetic */ void a(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
            String str2 = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 9) {
                objArr[0] = "classId";
            } else if (i == 3 || i == 4) {
                objArr[0] = str2;
            } else if (i == 6) {
                objArr[0] = "enumClassId";
            } else if (i != 7) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            if (i == 3) {
                objArr[1] = "dataArrayVisitor";
            } else if (i != 4) {
                objArr[1] = str2;
            } else {
                objArr[1] = "stringsArrayVisitor";
            }
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                    objArr[2] = "visitEnum";
                    break;
                case 8:
                case 9:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        private defpackage.Dkb.b b() {
            return new Ukb(this);
        }

        private defpackage.Dkb.b c() {
            return new Vkb(this);
        }

        public defpackage.Dkb.a a(C7694xnb xnb, C7280rnb rnb) {
            if (xnb == null) {
                a(8);
                throw null;
            } else if (rnb != null) {
                return null;
            } else {
                a(9);
                throw null;
            }
        }

        public void a() {
        }

        public void a(C7694xnb xnb, Mpb mpb) {
            if (xnb == null) {
                a(0);
                throw null;
            } else if (mpb == null) {
                a(1);
                throw null;
            }
        }

        public void a(C7694xnb xnb, Object obj) {
            if (xnb != null) {
                String a2 = xnb.a();
                if ("k".equals(a2)) {
                    if (obj instanceof Integer) {
                        Tkb.this.k = defpackage.Rkb.a.a(((Integer) obj).intValue());
                    }
                } else if ("mv".equals(a2)) {
                    if (obj instanceof int[]) {
                        Tkb.this.c = (int[]) obj;
                    }
                } else if ("bv".equals(a2)) {
                    if (obj instanceof int[]) {
                        Tkb.this.d = new C6528gnb((int[]) obj);
                    }
                } else if ("xs".equals(a2)) {
                    if (obj instanceof String) {
                        Tkb.this.e = (String) obj;
                    }
                } else if ("xi".equals(a2)) {
                    if (obj instanceof Integer) {
                        Tkb.this.f = ((Integer) obj).intValue();
                    }
                } else if ("pn".equals(a2) && (obj instanceof String)) {
                    Tkb.this.g = (String) obj;
                }
            }
        }

        public void a(C7694xnb xnb, C7280rnb rnb, C7694xnb xnb2) {
            if (xnb == null) {
                a(5);
                throw null;
            } else if (rnb == null) {
                a(6);
                throw null;
            } else if (xnb2 == null) {
                a(7);
                throw null;
            }
        }

        public defpackage.Dkb.b a(C7694xnb xnb) {
            if (xnb != null) {
                String a2 = xnb.a();
                if ("d1".equals(a2)) {
                    return b();
                }
                if ("d2".equals(a2)) {
                    return c();
                }
                return null;
            }
            a(2);
            throw null;
        }
    }

    /* renamed from: Tkb$c */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    private class c implements defpackage.Dkb.a {
        private c() {
        }

        private static /* synthetic */ void a(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
            String str2 = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 9) {
                objArr[0] = "classId";
            } else if (i == 3 || i == 4) {
                objArr[0] = str2;
            } else if (i == 6) {
                objArr[0] = "enumClassId";
            } else if (i != 7) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            if (i == 3) {
                objArr[1] = "dataArrayVisitor";
            } else if (i != 4) {
                objArr[1] = str2;
            } else {
                objArr[1] = "stringsArrayVisitor";
            }
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                    objArr[2] = "visitEnum";
                    break;
                case 8:
                case 9:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        private defpackage.Dkb.b b() {
            return new Wkb(this);
        }

        private defpackage.Dkb.b c() {
            return new Xkb(this);
        }

        public defpackage.Dkb.a a(C7694xnb xnb, C7280rnb rnb) {
            if (xnb == null) {
                a(8);
                throw null;
            } else if (rnb != null) {
                return null;
            } else {
                a(9);
                throw null;
            }
        }

        public void a() {
        }

        public void a(C7694xnb xnb, Mpb mpb) {
            if (xnb == null) {
                a(0);
                throw null;
            } else if (mpb == null) {
                a(1);
                throw null;
            }
        }

        public void a(C7694xnb xnb, Object obj) {
            if (xnb != null) {
                String a2 = xnb.a();
                if ("version".equals(a2)) {
                    if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        Tkb.this.c = iArr;
                        if (Tkb.this.d == null) {
                            Tkb.this.d = new C6528gnb(iArr);
                        }
                    }
                } else if ("multifileClassName".equals(a2)) {
                    Tkb.this.e = obj instanceof String ? (String) obj : null;
                }
            }
        }

        public void a(C7694xnb xnb, C7280rnb rnb, C7694xnb xnb2) {
            if (xnb == null) {
                a(5);
                throw null;
            } else if (rnb == null) {
                a(6);
                throw null;
            } else if (xnb2 == null) {
                a(7);
                throw null;
            }
        }

        public defpackage.Dkb.b a(C7694xnb xnb) {
            if (xnb != null) {
                String a2 = xnb.a();
                if ("data".equals(a2) || "filePartClassNames".equals(a2)) {
                    return b();
                }
                if ("strings".equals(a2)) {
                    return c();
                }
                return null;
            }
            a(2);
            throw null;
        }
    }

    static {
        b.put(C7280rnb.a(new C7349snb("kotlin.jvm.internal.KotlinClass")), defpackage.Rkb.a.CLASS);
        b.put(C7280rnb.a(new C7349snb("kotlin.jvm.internal.KotlinFileFacade")), defpackage.Rkb.a.FILE_FACADE);
        b.put(C7280rnb.a(new C7349snb("kotlin.jvm.internal.KotlinMultifileClass")), defpackage.Rkb.a.MULTIFILE_CLASS);
        b.put(C7280rnb.a(new C7349snb("kotlin.jvm.internal.KotlinMultifileClassPart")), defpackage.Rkb.a.MULTIFILE_CLASS_PART);
        b.put(C7280rnb.a(new C7349snb("kotlin.jvm.internal.KotlinSyntheticClass")), defpackage.Rkb.a.SYNTHETIC_CLASS);
    }

    private static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        if (i2 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean c() {
        defpackage.Rkb.a aVar = this.k;
        return aVar == defpackage.Rkb.a.CLASS || aVar == defpackage.Rkb.a.FILE_FACADE || aVar == defpackage.Rkb.a.MULTIFILE_CLASS_PART;
    }

    public void a() {
    }

    public Rkb b() {
        if (this.k != null) {
            int[] iArr = this.c;
            if (iArr != null) {
                C6732jnb jnb = new C6732jnb(iArr, (this.f & 8) != 0);
                if (!jnb.d()) {
                    this.j = this.h;
                    this.h = null;
                } else if (c() && this.h == null) {
                    return null;
                }
                defpackage.Rkb.a aVar = this.k;
                C6528gnb gnb = this.d;
                if (gnb == null) {
                    gnb = C6528gnb.h;
                }
                Rkb rkb = new Rkb(aVar, jnb, gnb, this.h, this.j, this.i, this.e, this.f, this.g);
                return rkb;
            }
        }
        return null;
    }

    public defpackage.Dkb.a a(C7280rnb rnb, C7822zdb zdb) {
        if (rnb == null) {
            a(0);
            throw null;
        } else if (zdb == null) {
            a(1);
            throw null;
        } else if (rnb.a().equals(C6657igb.a)) {
            return new b();
        } else {
            if (a || this.k != null) {
                return null;
            }
            defpackage.Rkb.a aVar = (defpackage.Rkb.a) b.get(rnb);
            if (aVar == null) {
                return null;
            }
            this.k = aVar;
            return new c();
        }
    }
}
