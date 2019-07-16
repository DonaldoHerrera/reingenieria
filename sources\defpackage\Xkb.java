package defpackage;

/* renamed from: Xkb reason: default package */
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
class Xkb extends a {
    final /* synthetic */ c b;

    Xkb(c cVar) {
        this.b = cVar;
    }

    private static /* synthetic */ void b(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"}));
    }

    /* access modifiers changed from: protected */
    public void a(String[] strArr) {
        if (strArr != null) {
            Tkb.this.i = strArr;
        } else {
            b(0);
            throw null;
        }
    }
}
