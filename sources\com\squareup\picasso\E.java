package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: Picasso */
public class E {
    static final Handler a = new D(Looper.getMainLooper());
    @SuppressLint({"StaticFieldLeak"})
    static volatile E b = null;
    private final c c;
    private final f d;
    private final b e;
    private final List<M> f;
    final Context g;
    final C6252q h;
    final C6246k i;
    final P j;
    final Map<Object, C6236a> k;
    final Map<ImageView, C6250o> l;
    final ReferenceQueue<Object> m;
    final Config n;
    boolean o;
    volatile boolean p;
    boolean q;

    /* compiled from: Picasso */
    public static class a {
        private final Context a;
        private r b;
        private ExecutorService c;
        private C6246k d;
        private c e;
        private f f;
        private List<M> g;
        private Config h;
        private boolean i;
        private boolean j;

        public a(Context context) {
            if (context != null) {
                this.a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public a a(r rVar) {
            if (rVar == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            } else if (this.b == null) {
                this.b = rVar;
                return this;
            } else {
                throw new IllegalStateException("Downloader already set.");
            }
        }

        public a b(boolean z) {
            this.j = z;
            return this;
        }

        public a a(C6246k kVar) {
            if (kVar == null) {
                throw new IllegalArgumentException("Memory cache must not be null.");
            } else if (this.d == null) {
                this.d = kVar;
                return this;
            } else {
                throw new IllegalStateException("Memory cache already set.");
            }
        }

        public a a(boolean z) {
            this.i = z;
            return this;
        }

        public E a() {
            Context context = this.a;
            if (this.b == null) {
                this.b = new C(context);
            }
            if (this.d == null) {
                this.d = new C6257w(context);
            }
            if (this.c == null) {
                this.c = new I();
            }
            if (this.f == null) {
                this.f = f.a;
            }
            P p = new P(this.d);
            Context context2 = context;
            C6252q qVar = new C6252q(context2, this.c, E.a, this.b, this.d, p);
            E e2 = new E(context2, qVar, this.d, this.e, this.f, this.g, p, this.h, this.i, this.j);
            return e2;
        }
    }

    /* compiled from: Picasso */
    private static class b extends Thread {
        private final ReferenceQueue<Object> a;
        private final Handler b;

        b(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.a = referenceQueue;
            this.b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    C0179a aVar = (C0179a) this.a.remove(1000);
                    Message obtainMessage = this.b.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.a;
                        this.b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.b.post(new F(this, e));
                    return;
                }
            }
        }
    }

    /* compiled from: Picasso */
    public interface c {
        void a(E e, Uri uri, Exception exc);
    }

    /* compiled from: Picasso */
    public enum d {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        final int e;

        private d(int i) {
            this.e = i;
        }
    }

    /* compiled from: Picasso */
    public enum e {
        LOW,
        NORMAL,
        HIGH
    }

    /* compiled from: Picasso */
    public interface f {
        public static final f a = new G();

        K a(K k);
    }

    E(Context context, C6252q qVar, C6246k kVar, c cVar, f fVar, List<M> list, P p2, Config config, boolean z, boolean z2) {
        this.g = context;
        this.h = qVar;
        this.i = kVar;
        this.c = cVar;
        this.d = fVar;
        this.n = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new N(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C6248m(context));
        arrayList.add(new y(context));
        arrayList.add(new C6249n(context));
        arrayList.add(new C6237b(context));
        arrayList.add(new C6253s(context));
        arrayList.add(new B(qVar.d, p2));
        this.f = Collections.unmodifiableList(arrayList);
        this.j = p2;
        this.k = new WeakHashMap();
        this.l = new WeakHashMap();
        this.o = z;
        this.p = z2;
        this.m = new ReferenceQueue<>();
        this.e = new b(this.m, a);
        this.e.start();
    }

    public void a(ImageView imageView) {
        if (imageView != null) {
            a((Object) imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    public void b(Object obj) {
        if (obj != null) {
            this.h.a(obj);
            return;
        }
        throw new IllegalArgumentException("tag == null");
    }

    public void c(Object obj) {
        if (obj != null) {
            this.h.b(obj);
            return;
        }
        throw new IllegalArgumentException("tag == null");
    }

    public void a(S s) {
        if (s != null) {
            a((Object) s);
            return;
        }
        throw new IllegalArgumentException("target cannot be null.");
    }

    /* access modifiers changed from: 0000 */
    public List<M> b() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public void c(C6236a aVar) {
        this.h.b(aVar);
    }

    /* access modifiers changed from: 0000 */
    public Bitmap b(String str) {
        Bitmap a2 = this.i.a(str);
        if (a2 != null) {
            this.j.b();
        } else {
            this.j.c();
        }
        return a2;
    }

    public L a(Uri uri) {
        return new L(this, uri, 0);
    }

    public L a(String str) {
        if (str == null) {
            return new L(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return a(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* access modifiers changed from: 0000 */
    public void b(C6236a aVar) {
        Bitmap b2 = z.a(aVar.e) ? b(aVar.b()) : null;
        String str = "Main";
        if (b2 != null) {
            a(b2, d.MEMORY, aVar, null);
            if (this.p) {
                String d2 = aVar.b.d();
                StringBuilder sb = new StringBuilder();
                sb.append("from ");
                sb.append(d.MEMORY);
                W.a(str, "completed", d2, sb.toString());
                return;
            }
            return;
        }
        a(aVar);
        if (this.p) {
            W.a(str, "resumed", aVar.b.d());
        }
    }

    public L a(int i2) {
        if (i2 != 0) {
            return new L(this, null, i2);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    /* access modifiers changed from: 0000 */
    public K a(K k2) {
        this.d.a(k2);
        if (k2 != null) {
            return k2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Request transformer ");
        sb.append(this.d.getClass().getCanonicalName());
        sb.append(" returned null for ");
        sb.append(k2);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void a(ImageView imageView, C6250o oVar) {
        if (this.l.containsKey(imageView)) {
            a((Object) imageView);
        }
        this.l.put(imageView, oVar);
    }

    /* access modifiers changed from: 0000 */
    public void a(C6236a aVar) {
        Object i2 = aVar.i();
        if (!(i2 == null || this.k.get(i2) == aVar)) {
            a(i2);
            this.k.put(i2, aVar);
        }
        c(aVar);
    }

    /* access modifiers changed from: 0000 */
    public void a(C6244i iVar) {
        C6236a b2 = iVar.b();
        List c2 = iVar.c();
        boolean z = true;
        boolean z2 = c2 != null && !c2.isEmpty();
        if (b2 == null && !z2) {
            z = false;
        }
        if (z) {
            Uri uri = iVar.d().e;
            Exception e2 = iVar.e();
            Bitmap k2 = iVar.k();
            d g2 = iVar.g();
            if (b2 != null) {
                a(k2, g2, b2, e2);
            }
            if (z2) {
                int size = c2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    a(k2, g2, (C6236a) c2.get(i2), e2);
                }
            }
            c cVar = this.c;
            if (!(cVar == null || e2 == null)) {
                cVar.a(this, uri, e2);
            }
        }
    }

    private void a(Bitmap bitmap, d dVar, C6236a aVar, Exception exc) {
        if (!aVar.j()) {
            if (!aVar.k()) {
                this.k.remove(aVar.i());
            }
            String str = "Main";
            if (bitmap == null) {
                aVar.a(exc);
                if (this.p) {
                    W.a(str, "errored", aVar.b.d(), exc.getMessage());
                }
            } else if (dVar != null) {
                aVar.a(bitmap, dVar);
                if (this.p) {
                    String d2 = aVar.b.d();
                    StringBuilder sb = new StringBuilder();
                    sb.append("from ");
                    sb.append(dVar);
                    W.a(str, "completed", d2, sb.toString());
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Object obj) {
        W.a();
        C6236a aVar = (C6236a) this.k.remove(obj);
        if (aVar != null) {
            aVar.a();
            this.h.a(aVar);
        }
        if (obj instanceof ImageView) {
            C6250o oVar = (C6250o) this.l.remove((ImageView) obj);
            if (oVar != null) {
                oVar.a();
            }
        }
    }

    public static E a() {
        if (b == null) {
            synchronized (E.class) {
                if (b == null) {
                    if (PicassoProvider.a != null) {
                        b = new a(PicassoProvider.a).a();
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
            }
        }
        return b;
    }
}
