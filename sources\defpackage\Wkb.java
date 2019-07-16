package defpackage;

/* renamed from: Wkb reason: default package */
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
class Wkb extends a {
    final /* synthetic */ c b;

    Wkb(c cVar) {
        this.b = cVar;
    }

    private static /* synthetic */ void b(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"}));
    }

    /* access modifiers changed from: protected */
    public void a(String[] strArr) {
        if (strArr != null) {
            Tkb.this.h = strArr;
        } else {
            b(0);
            throw null;
        }
    }
}
