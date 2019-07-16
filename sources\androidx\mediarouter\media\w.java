package androidx.mediarouter.media;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.mediarouter.media.n.f;
import androidx.mediarouter.media.n.g;
import java.lang.ref.WeakReference;

/* compiled from: RemoteControlClientCompat */
abstract class w {
    protected final Context a;
    protected final Object b;
    protected d c;

    /* compiled from: RemoteControlClientCompat */
    static class a extends w {
        private final Object d;
        private final Object e = n.a(this.d, "", false);
        private final Object f = n.b(this.d, this.e);
        private boolean g;

        /* renamed from: androidx.mediarouter.media.w$a$a reason: collision with other inner class name */
        /* compiled from: RemoteControlClientCompat */
        private static final class C0019a implements g {
            private final WeakReference<a> a;

            public C0019a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            public void a(Object obj, int i) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    d dVar = aVar.c;
                    if (dVar != null) {
                        dVar.b(i);
                    }
                }
            }

            public void b(Object obj, int i) {
                a aVar = (a) this.a.get();
                if (aVar != null) {
                    d dVar = aVar.c;
                    if (dVar != null) {
                        dVar.a(i);
                    }
                }
            }
        }

        public a(Context context, Object obj) {
            super(context, obj);
            this.d = n.a(context);
        }

        public void a(c cVar) {
            f.c(this.f, cVar.a);
            f.e(this.f, cVar.b);
            f.d(this.f, cVar.c);
            f.a(this.f, cVar.d);
            f.b(this.f, cVar.e);
            if (!this.g) {
                this.g = true;
                f.b(this.f, n.a((g) new C0019a(this)));
                f.a(this.f, this.b);
            }
        }
    }

    /* compiled from: RemoteControlClientCompat */
    static class b extends w {
        public b(Context context, Object obj) {
            super(context, obj);
        }
    }

    /* compiled from: RemoteControlClientCompat */
    public static final class c {
        public int a;
        public int b;
        public int c = 0;
        public int d = 3;
        public int e = 1;
    }

    /* compiled from: RemoteControlClientCompat */
    public interface d {
        void a(int i);

        void b(int i);
    }

    protected w(Context context, Object obj) {
        this.a = context;
        this.b = obj;
    }

    public static w a(Context context, Object obj) {
        if (VERSION.SDK_INT >= 16) {
            return new a(context, obj);
        }
        return new b(context, obj);
    }

    public void a(c cVar) {
    }

    public Object a() {
        return this.b;
    }

    public void a(d dVar) {
        this.c = dVar;
    }
}
