package androidx.work;

import android.content.Context;
import androidx.work.impl.m;
import java.util.Collections;
import java.util.List;

/* compiled from: WorkManager */
public abstract class r {
    protected r() {
    }

    @Deprecated
    public static r a() {
        m a = m.a();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    public abstract m a(String str);

    public abstract m a(String str, f fVar, n nVar);

    public abstract m a(List<? extends s> list);

    public abstract m b(String str);

    public abstract C3347xE<List<q>> c(String str);

    public static void a(Context context, b bVar) {
        m.a(context, bVar);
    }

    public final m a(s sVar) {
        return a(Collections.singletonList(sVar));
    }
}
