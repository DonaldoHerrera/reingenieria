package defpackage;

/* renamed from: Ukb reason: default package */
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
class Ukb extends a {
    final /* synthetic */ b b;

    Ukb(b bVar) {
        this.b = bVar;
    }

    private static /* synthetic */ void b(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"}));
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
