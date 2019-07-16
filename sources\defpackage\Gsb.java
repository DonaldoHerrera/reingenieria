package defpackage;

import java.util.concurrent.locks.Lock;

/* renamed from: Gsb reason: default package */
/* compiled from: LockBasedStorageManager */
class Gsb extends Jsb {
    Gsb(String str, c cVar, Lock lock) {
        super(str, cVar, lock, null);
    }

    private static /* synthetic */ void b(int i) {
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1", "recursionDetectedDefault"}));
    }

    /* access modifiers changed from: protected */
    public <T> j<T> b() {
        j<T> a = j.a();
        if (a != null) {
            return a;
        }
        b(0);
        throw null;
    }
}
