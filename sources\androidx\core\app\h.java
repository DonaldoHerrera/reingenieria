package androidx.core.app;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.Window.OnFrameMetricsAvailableListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FrameMetricsAggregator */
public class h {
    private b a;

    /* compiled from: FrameMetricsAggregator */
    private static class a extends b {
        private static HandlerThread a;
        private static Handler b;
        int c;
        SparseIntArray[] d = new SparseIntArray[9];
        private ArrayList<WeakReference<Activity>> e = new ArrayList<>();
        OnFrameMetricsAvailableListener f = new g(this);

        a(int i) {
            this.c = i;
        }

        /* access modifiers changed from: 0000 */
        public void a(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }

        public SparseIntArray[] b(Activity activity) {
            Iterator it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == activity) {
                    this.e.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f);
            return this.d;
        }

        public void a(Activity activity) {
            if (a == null) {
                a = new HandlerThread("FrameMetricsAggregator");
                a.start();
                b = new Handler(a.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.d;
                if (sparseIntArrayArr[i] == null && (this.c & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f, b);
            this.e.add(new WeakReference(activity));
        }
    }

    /* compiled from: FrameMetricsAggregator */
    private static class b {
        b() {
        }

        public void a(Activity activity) {
        }

        public SparseIntArray[] b(Activity activity) {
            return null;
        }
    }

    public h() {
        this(1);
    }

    public void a(Activity activity) {
        this.a.a(activity);
    }

    public SparseIntArray[] b(Activity activity) {
        return this.a.b(activity);
    }

    public h(int i) {
        if (VERSION.SDK_INT >= 24) {
            this.a = new a(i);
        } else {
            this.a = new b();
        }
    }
}
