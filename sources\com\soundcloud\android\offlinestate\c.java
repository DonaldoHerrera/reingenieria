package com.soundcloud.android.offlinestate;

import android.view.View;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R2\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\b0\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/offlinestate/OfflineStateHelper;", "", "view", "Landroid/view/View;", "callback", "Lcom/soundcloud/android/offlinestate/OfflineStateHelper$Callback;", "(Landroid/view/View;Lcom/soundcloud/android/offlinestate/OfflineStateHelper$Callback;)V", "delayedState", "Lcom/soundcloud/java/optional/Optional;", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "update", "", "oldState", "Lcom/soundcloud/android/foundation/domain/offline/OfflineState;", "newState", "Callback", "Companion", "offlinestate_release"}, mv = {1, 1, 15})
/* compiled from: OfflineStateHelper.kt */
public class c {
    private static final long a = TimeUnit.MILLISECONDS.toMillis(200);
    public static final b b = new b(null);
    /* access modifiers changed from: private */
    public C4928GKa<Runnable> c;
    /* access modifiers changed from: private */
    public final View d;
    /* access modifiers changed from: private */
    public final a e;

    /* compiled from: OfflineStateHelper.kt */
    public interface a {
        void a(C3823mda mda);
    }

    /* compiled from: OfflineStateHelper.kt */
    public static final class b {
        private b() {
        }

        @NXa
        public final c a(View view, a aVar) {
            C7471uYa.b(view, "view");
            C7471uYa.b(aVar, "callback");
            return new c(view, aVar, null);
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    private c(View view, a aVar) {
        this.d = view;
        this.e = aVar;
        this.c = C4928GKa.a();
    }

    @NXa
    public static final c a(View view, a aVar) {
        return b.a(view, aVar);
    }

    public /* synthetic */ c(View view, a aVar, C7264rYa rya) {
        this(view, aVar);
    }

    public void a(C3823mda mda, C3823mda mda2) {
        C7471uYa.b(mda2, "newState");
        this.c.a((C7733yKa<? super T>) new d<Object>(this));
        if (mda != null && mda == C3823mda.DOWNLOADING && mda2 == C3823mda.REQUESTED) {
            this.c = C4928GKa.c(new e(this, mda2));
            this.d.postDelayed((Runnable) this.c.b(), a);
            return;
        }
        this.e.a(mda2);
    }
}
