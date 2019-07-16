package defpackage;

/* renamed from: Vkb reason: default package */
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
class Vkb extends a {
    final /* synthetic */ b b;

    Vkb(b bVar) {
        this.b = bVar;
    }

    private static /* synthetic */ void b(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"}));
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
