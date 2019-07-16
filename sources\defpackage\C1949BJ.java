package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;

/* renamed from: BJ reason: default package and case insensitive filesystem */
/* compiled from: VideoAdsModule */
public abstract class C1949BJ {

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: BJ$a */
    /* compiled from: VideoAdsModule */
    public @interface a {
    }

    static /* synthetic */ Thread a(Runnable runnable) {
        return new Thread(runnable, "VideoAdsThread");
    }

    @a
    static HPa a() {
        return C6645iVa.a(Executors.newSingleThreadExecutor(C3312vJ.a));
    }
}
