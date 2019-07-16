package defpackage;

/* renamed from: Lsb reason: default package */
/* compiled from: LockBasedStorageManager */
class Lsb implements c {
    Lsb() {
    }

    private static /* synthetic */ void a(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"}));
    }

    public RuntimeException a(Throwable th) {
        if (th == null) {
            a(0);
            throw null;
        }
        C7296rvb.b(th);
        throw null;
    }
}
