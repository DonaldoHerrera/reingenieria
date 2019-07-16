package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class zaa extends ActivityLifecycleObserver {
    private final WeakReference<C0044zaa> zacl;

    /* renamed from: com.google.android.gms.common.api.internal.zaa$zaa reason: collision with other inner class name */
    static class C0044zaa extends LifecycleCallback {
        private List<Runnable> zacm = new ArrayList();

        private C0044zaa(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
        }

        /* access modifiers changed from: private */
        public static C0044zaa zaa(Activity activity) {
            C0044zaa zaa;
            synchronized (activity) {
                LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
                zaa = (C0044zaa) fragment.getCallbackOrNull("LifecycleObserverOnStop", C0044zaa.class);
                if (zaa == null) {
                    zaa = new C0044zaa(fragment);
                }
            }
            return zaa;
        }

        public void onStop() {
            List<Runnable> list;
            synchronized (this) {
                list = this.zacm;
                this.zacm = new ArrayList();
            }
            for (Runnable run : list) {
                run.run();
            }
        }

        /* access modifiers changed from: private */
        public final synchronized void zaa(Runnable runnable) {
            this.zacm.add(runnable);
        }
    }

    public zaa(Activity activity) {
        this(C0044zaa.zaa(activity));
    }

    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        C0044zaa zaa = (C0044zaa) this.zacl.get();
        if (zaa != null) {
            zaa.zaa(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }

    private zaa(C0044zaa zaa) {
        this.zacl = new WeakReference<>(zaa);
    }
}
