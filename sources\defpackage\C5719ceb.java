package defpackage;

/* renamed from: ceb reason: default package and case insensitive filesystem */
/* compiled from: AnnotatedImpl */
public class C5719ceb implements C5651beb {
    private final C6723jeb a;

    public C5719ceb(C6723jeb jeb) {
        if (jeb != null) {
            this.a = jeb;
        } else {
            a(0);
            throw null;
        }
    }

    private static /* synthetic */ void a(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 1 ? 3 : 2)];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = str2;
        }
        if (i != 1) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public C6723jeb getAnnotations() {
        C6723jeb jeb = this.a;
        if (jeb != null) {
            return jeb;
        }
        a(1);
        throw null;
    }
}
