package defpackage;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;

/* renamed from: AE reason: default package and case insensitive filesystem */
/* compiled from: MoreExecutors */
public final class C1924AE {
    public static Executor a() {
        return C3207qE.INSTANCE;
    }

    static Executor a(Executor executor, C3121mE<?> mEVar) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(mEVar);
        if (executor == a()) {
            return executor;
        }
        return new C3387zE(executor, mEVar);
    }
}
