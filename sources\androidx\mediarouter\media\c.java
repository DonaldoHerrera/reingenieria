package androidx.mediarouter.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;

/* compiled from: MediaRouteProvider */
public abstract class c {
    private final Context a;
    private final C0017c b;
    private final b c = new b();
    private a d;
    private b e;
    private boolean f;
    private d g;
    private boolean h;

    /* compiled from: MediaRouteProvider */
    public static abstract class a {
        public abstract void a(c cVar, d dVar);
    }

    /* compiled from: MediaRouteProvider */
    private final class b extends Handler {
        b() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                c.this.a();
            } else if (i == 2) {
                c.this.b();
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.c$c reason: collision with other inner class name */
    /* compiled from: MediaRouteProvider */
    public static final class C0017c {
        private final ComponentName a;

        C0017c(ComponentName componentName) {
            if (componentName != null) {
                this.a = componentName;
                return;
            }
            throw new IllegalArgumentException("componentName must not be null");
        }

        public ComponentName a() {
            return this.a;
        }

        public String b() {
            return this.a.getPackageName();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ProviderMetadata{ componentName=");
            sb.append(this.a.flattenToShortString());
            sb.append(" }");
            return sb.toString();
        }
    }

    /* compiled from: MediaRouteProvider */
    public static abstract class d {
        public void a() {
        }

        public void a(int i) {
        }

        public boolean a(Intent intent, androidx.mediarouter.media.h.c cVar) {
            return false;
        }

        public void b() {
        }

        public void b(int i) {
            c();
        }

        public void c() {
        }

        public void c(int i) {
        }
    }

    c(Context context, C0017c cVar) {
        if (context != null) {
            this.a = context;
            if (cVar == null) {
                this.b = new C0017c(new ComponentName(context, getClass()));
            } else {
                this.b = cVar;
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    public void a(b bVar) {
    }

    public final void a(a aVar) {
        h.a();
        this.d = aVar;
    }

    public final void b(b bVar) {
        h.a();
        if (!C0243Pb.a(this.e, bVar)) {
            this.e = bVar;
            if (!this.f) {
                this.f = true;
                this.c.sendEmptyMessage(2);
            }
        }
    }

    public final Context c() {
        return this.a;
    }

    public final d d() {
        return this.g;
    }

    public final b e() {
        return this.e;
    }

    public final Handler f() {
        return this.c;
    }

    public final C0017c g() {
        return this.b;
    }

    public final void a(d dVar) {
        h.a();
        if (this.g != dVar) {
            this.g = dVar;
            if (!this.h) {
                this.h = true;
                this.c.sendEmptyMessage(1);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.f = false;
        a(this.e);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.h = false;
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(this, this.g);
        }
    }

    public d a(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public d a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return a(str);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }
}
