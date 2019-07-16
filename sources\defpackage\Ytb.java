package defpackage;

/* renamed from: Ytb reason: default package */
/* compiled from: TypeSubstitutor */
class Ytb implements _Xa<C7349snb, Boolean> {
    Ytb() {
    }

    private static /* synthetic */ void a(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"}));
    }

    /* renamed from: a */
    public Boolean invoke(C7349snb snb) {
        if (snb != null) {
            return Boolean.valueOf(!snb.equals(C5301Sbb.h.J));
        }
        a(0);
        throw null;
    }
}
