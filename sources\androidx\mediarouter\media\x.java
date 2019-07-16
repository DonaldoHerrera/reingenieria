package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.view.Display;
import androidx.mediarouter.media.a.C0016a;
import androidx.mediarouter.media.c.C0017c;
import androidx.mediarouter.media.n.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* compiled from: SystemMediaRouteProvider */
abstract class x extends c {

    /* compiled from: SystemMediaRouteProvider */
    private static class a extends d {
        public a(Context context, f fVar) {
            super(context, fVar);
        }

        /* access modifiers changed from: protected */
        public void a(C0020b bVar, C0016a aVar) {
            super.a(bVar, aVar);
            aVar.a(m.a(bVar.a));
        }
    }

    /* compiled from: SystemMediaRouteProvider */
    static class b extends x implements androidx.mediarouter.media.n.a, g {
        private static final ArrayList<IntentFilter> i = new ArrayList<>();
        private static final ArrayList<IntentFilter> j = new ArrayList<>();
        private final f k;
        protected final Object l;
        protected final Object m;
        protected final Object n;
        protected final Object o;
        protected int p;
        protected boolean q;
        protected boolean r;
        protected final ArrayList<C0020b> s = new ArrayList<>();
        protected final ArrayList<c> t = new ArrayList<>();
        private androidx.mediarouter.media.n.e u;
        private androidx.mediarouter.media.n.c v;

        /* compiled from: SystemMediaRouteProvider */
        protected static final class a extends androidx.mediarouter.media.c.d {
            private final Object a;

            public a(Object obj) {
                this.a = obj;
            }

            public void a(int i) {
                androidx.mediarouter.media.n.d.a(this.a, i);
            }

            public void c(int i) {
                androidx.mediarouter.media.n.d.b(this.a, i);
            }
        }

        /* renamed from: androidx.mediarouter.media.x$b$b reason: collision with other inner class name */
        /* compiled from: SystemMediaRouteProvider */
        protected static final class C0020b {
            public final Object a;
            public final String b;
            public a c;

            public C0020b(Object obj, String str) {
                this.a = obj;
                this.b = str;
            }
        }

        /* compiled from: SystemMediaRouteProvider */
        protected static final class c {
            public final h.g a;
            public final Object b;

            public c(h.g gVar, Object obj) {
                this.a = gVar;
                this.b = obj;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            i.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            j.add(intentFilter2);
        }

        public b(Context context, f fVar) {
            super(context);
            this.k = fVar;
            this.l = n.a(context);
            this.m = h();
            this.n = i();
            this.o = n.a(this.l, context.getResources().getString(C1869yd.mr_user_route_category_name), false);
            m();
        }

        private boolean j(Object obj) {
            if (h(obj) != null || f(obj) >= 0) {
                return false;
            }
            C0020b bVar = new C0020b(obj, k(obj));
            a(bVar);
            this.s.add(bVar);
            return true;
        }

        private String k(Object obj) {
            String str;
            if (j() == obj) {
                str = "DEFAULT_ROUTE";
            } else {
                str = String.format(Locale.US, "ROUTE_%08x", new Object[]{Integer.valueOf(g(obj).hashCode())});
            }
            if (b(str) < 0) {
                return str;
            }
            int i2 = 2;
            while (true) {
                String format = String.format(Locale.US, "%s_%d", new Object[]{str, Integer.valueOf(i2)});
                if (b(format) < 0) {
                    return format;
                }
                i2++;
            }
        }

        private void m() {
            l();
            boolean z = false;
            for (Object j2 : n.a(this.l)) {
                z |= j(j2);
            }
            if (z) {
                k();
            }
        }

        public androidx.mediarouter.media.c.d a(String str) {
            int b = b(str);
            if (b >= 0) {
                return new a(((C0020b) this.s.get(b)).a);
            }
            return null;
        }

        public void a(int i2, Object obj) {
        }

        public void a(Object obj, Object obj2) {
        }

        public void a(Object obj, Object obj2, int i2) {
        }

        public void b(Object obj) {
            if (h(obj) == null) {
                int f = f(obj);
                if (f >= 0) {
                    this.s.remove(f);
                    k();
                }
            }
        }

        public void c(h.g gVar) {
            if (gVar.n() != this) {
                int e = e(gVar);
                if (e >= 0) {
                    c cVar = (c) this.t.remove(e);
                    androidx.mediarouter.media.n.d.a(cVar.b, (Object) null);
                    androidx.mediarouter.media.n.f.b(cVar.b, (Object) null);
                    n.d(this.l, cVar.b);
                }
            }
        }

        public void d(Object obj) {
            if (j(obj)) {
                k();
            }
        }

        public void e(Object obj) {
            if (h(obj) == null) {
                int f = f(obj);
                if (f >= 0) {
                    C0020b bVar = (C0020b) this.s.get(f);
                    int e = androidx.mediarouter.media.n.d.e(obj);
                    if (e != bVar.c.s()) {
                        C0016a aVar = new C0016a(bVar.c);
                        aVar.e(e);
                        bVar.c = aVar.a();
                        k();
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            int size = this.s.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C0020b) this.s.get(i2)).a == obj) {
                    return i2;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        public String g(Object obj) {
            CharSequence a2 = androidx.mediarouter.media.n.d.a(obj, c());
            return a2 != null ? a2.toString() : "";
        }

        /* access modifiers changed from: protected */
        public c h(Object obj) {
            Object d = androidx.mediarouter.media.n.d.d(obj);
            if (d instanceof c) {
                return (c) d;
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public Object i() {
            return n.a((g) this);
        }

        /* access modifiers changed from: protected */
        public void l() {
            if (this.r) {
                this.r = false;
                n.c(this.l, this.m);
            }
            int i2 = this.p;
            if (i2 != 0) {
                this.r = true;
                n.a(this.l, i2, this.m);
            }
        }

        /* access modifiers changed from: protected */
        public void i(Object obj) {
            if (this.u == null) {
                this.u = new androidx.mediarouter.media.n.e();
            }
            this.u.a(this.l, 8388611, obj);
        }

        public void d(h.g gVar) {
            if (gVar.w()) {
                if (gVar.n() != this) {
                    int e = e(gVar);
                    if (e >= 0) {
                        i(((c) this.t.get(e)).b);
                    }
                } else {
                    int b = b(gVar.d());
                    if (b >= 0) {
                        i(((C0020b) this.s.get(b)).a);
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public Object h() {
            return n.a((androidx.mediarouter.media.n.a) this);
        }

        public void a(b bVar) {
            boolean z;
            int i2 = 0;
            if (bVar != null) {
                List c2 = bVar.b().c();
                int size = c2.size();
                int i3 = 0;
                while (i2 < size) {
                    String str = (String) c2.get(i2);
                    i3 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i3 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i3 | 2 : i3 | 8388608;
                    i2++;
                }
                z = bVar.c();
                i2 = i3;
            } else {
                z = false;
            }
            if (this.p != i2 || this.q != z) {
                this.p = i2;
                this.q = z;
                m();
            }
        }

        public void b(int i2, Object obj) {
            if (obj == n.a(this.l, 8388611)) {
                c h = h(obj);
                if (h != null) {
                    h.a.x();
                } else {
                    int f = f(obj);
                    if (f >= 0) {
                        this.k.a(((C0020b) this.s.get(f)).b);
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public Object j() {
            if (this.v == null) {
                this.v = new androidx.mediarouter.media.n.c();
            }
            return this.v.a(this.l);
        }

        /* access modifiers changed from: protected */
        public void k() {
            androidx.mediarouter.media.d.a aVar = new androidx.mediarouter.media.d.a();
            int size = this.s.size();
            for (int i2 = 0; i2 < size; i2++) {
                aVar.a(((C0020b) this.s.get(i2)).c);
            }
            a(aVar.a());
        }

        /* access modifiers changed from: protected */
        public int e(h.g gVar) {
            int size = this.t.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((c) this.t.get(i2)).a == gVar) {
                    return i2;
                }
            }
            return -1;
        }

        public void b(Object obj, int i2) {
            c h = h(obj);
            if (h != null) {
                h.a.a(i2);
            }
        }

        public void b(h.g gVar) {
            if (gVar.n() != this) {
                int e = e(gVar);
                if (e >= 0) {
                    a((c) this.t.get(e));
                }
            }
        }

        public void a(Object obj) {
            if (h(obj) == null) {
                int f = f(obj);
                if (f >= 0) {
                    a((C0020b) this.s.get(f));
                    k();
                }
            }
        }

        /* access modifiers changed from: protected */
        public int b(String str) {
            int size = this.s.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C0020b) this.s.get(i2)).b.equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        public void a(Object obj, int i2) {
            c h = h(obj);
            if (h != null) {
                h.a.b(i2);
            }
        }

        public void a(h.g gVar) {
            if (gVar.n() != this) {
                Object b = n.b(this.l, this.o);
                c cVar = new c(gVar, b);
                androidx.mediarouter.media.n.d.a(b, (Object) cVar);
                androidx.mediarouter.media.n.f.b(b, this.n);
                a(cVar);
                this.t.add(cVar);
                n.a(this.l, b);
                return;
            }
            int f = f(n.a(this.l, 8388611));
            if (f >= 0 && ((C0020b) this.s.get(f)).b.equals(gVar.d())) {
                gVar.x();
            }
        }

        /* access modifiers changed from: protected */
        public void a(C0020b bVar) {
            C0016a aVar = new C0016a(bVar.b, g(bVar.a));
            a(bVar, aVar);
            bVar.c = aVar.a();
        }

        /* access modifiers changed from: protected */
        public void a(C0020b bVar, C0016a aVar) {
            int c2 = androidx.mediarouter.media.n.d.c(bVar.a);
            if ((c2 & 1) != 0) {
                aVar.a((Collection<IntentFilter>) i);
            }
            if ((c2 & 2) != 0) {
                aVar.a((Collection<IntentFilter>) j);
            }
            aVar.c(androidx.mediarouter.media.n.d.b(bVar.a));
            aVar.b(androidx.mediarouter.media.n.d.a(bVar.a));
            aVar.e(androidx.mediarouter.media.n.d.e(bVar.a));
            aVar.g(androidx.mediarouter.media.n.d.g(bVar.a));
            aVar.f(androidx.mediarouter.media.n.d.f(bVar.a));
        }

        /* access modifiers changed from: protected */
        public void a(c cVar) {
            androidx.mediarouter.media.n.f.a(cVar.b, (CharSequence) cVar.a.i());
            androidx.mediarouter.media.n.f.b(cVar.b, cVar.a.k());
            androidx.mediarouter.media.n.f.a(cVar.b, cVar.a.j());
            androidx.mediarouter.media.n.f.c(cVar.b, cVar.a.o());
            androidx.mediarouter.media.n.f.e(cVar.b, cVar.a.q());
            androidx.mediarouter.media.n.f.d(cVar.b, cVar.a.p());
        }
    }

    /* compiled from: SystemMediaRouteProvider */
    private static class c extends b implements androidx.mediarouter.media.o.b {
        private androidx.mediarouter.media.o.a w;
        private androidx.mediarouter.media.o.d x;

        public c(Context context, f fVar) {
            super(context, fVar);
        }

        /* access modifiers changed from: protected */
        public void a(C0020b bVar, C0016a aVar) {
            super.a(bVar, aVar);
            if (!androidx.mediarouter.media.o.e.b(bVar.a)) {
                aVar.b(false);
            }
            if (b(bVar)) {
                aVar.a(true);
            }
            Display a = androidx.mediarouter.media.o.e.a(bVar.a);
            if (a != null) {
                aVar.d(a.getDisplayId());
            }
        }

        /* access modifiers changed from: protected */
        public boolean b(C0020b bVar) {
            if (this.x == null) {
                this.x = new androidx.mediarouter.media.o.d();
            }
            return this.x.a(bVar.a);
        }

        public void c(Object obj) {
            int f = f(obj);
            if (f >= 0) {
                C0020b bVar = (C0020b) this.s.get(f);
                Display a = androidx.mediarouter.media.o.e.a(obj);
                int displayId = a != null ? a.getDisplayId() : -1;
                if (displayId != bVar.c.q()) {
                    C0016a aVar = new C0016a(bVar.c);
                    aVar.d(displayId);
                    bVar.c = aVar.a();
                    k();
                }
            }
        }

        /* access modifiers changed from: protected */
        public Object h() {
            return o.a(this);
        }

        /* access modifiers changed from: protected */
        public void l() {
            super.l();
            if (this.w == null) {
                this.w = new androidx.mediarouter.media.o.a(c(), f());
            }
            this.w.a(this.q ? this.p : 0);
        }
    }

    /* compiled from: SystemMediaRouteProvider */
    private static class d extends c {
        public d(Context context, f fVar) {
            super(context, fVar);
        }

        /* access modifiers changed from: protected */
        public void a(C0020b bVar, C0016a aVar) {
            super.a(bVar, aVar);
            CharSequence a = androidx.mediarouter.media.p.a.a(bVar.a);
            if (a != null) {
                aVar.a(a.toString());
            }
        }

        /* access modifiers changed from: protected */
        public boolean b(C0020b bVar) {
            return androidx.mediarouter.media.p.a.b(bVar.a);
        }

        /* access modifiers changed from: protected */
        public void i(Object obj) {
            n.b(this.l, 8388611, obj);
        }

        /* access modifiers changed from: protected */
        public Object j() {
            return p.a(this.l);
        }

        /* access modifiers changed from: protected */
        public void l() {
            if (this.r) {
                n.c(this.l, this.m);
            }
            int i = 1;
            this.r = true;
            Object obj = this.l;
            int i2 = this.p;
            Object obj2 = this.m;
            if (!this.q) {
                i = 0;
            }
            p.a(obj, i2, obj2, i | 2);
        }

        /* access modifiers changed from: protected */
        public void a(c cVar) {
            super.a(cVar);
            androidx.mediarouter.media.p.b.a(cVar.b, cVar.a.c());
        }
    }

    /* compiled from: SystemMediaRouteProvider */
    static class e extends x {
        private static final ArrayList<IntentFilter> i = new ArrayList<>();
        final AudioManager j;
        private final b k;
        int l = -1;

        /* compiled from: SystemMediaRouteProvider */
        final class a extends androidx.mediarouter.media.c.d {
            a() {
            }

            public void a(int i) {
                e.this.j.setStreamVolume(3, i, 0);
                e.this.h();
            }

            public void c(int i) {
                int streamVolume = e.this.j.getStreamVolume(3);
                if (Math.min(e.this.j.getStreamMaxVolume(3), Math.max(0, i + streamVolume)) != streamVolume) {
                    e.this.j.setStreamVolume(3, streamVolume, 0);
                }
                e.this.h();
            }
        }

        /* compiled from: SystemMediaRouteProvider */
        final class b extends BroadcastReceiver {
            b() {
            }

            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
                    if (intExtra >= 0) {
                        e eVar = e.this;
                        if (intExtra != eVar.l) {
                            eVar.h();
                        }
                    }
                }
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            intentFilter.addCategory("android.media.intent.category.LIVE_VIDEO");
            i.add(intentFilter);
        }

        public e(Context context) {
            super(context);
            this.j = (AudioManager) context.getSystemService("audio");
            this.k = new b();
            context.registerReceiver(this.k, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            h();
        }

        public androidx.mediarouter.media.c.d a(String str) {
            if (str.equals("DEFAULT_ROUTE")) {
                return new a();
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public void h() {
            Resources resources = c().getResources();
            int streamMaxVolume = this.j.getStreamMaxVolume(3);
            this.l = this.j.getStreamVolume(3);
            C0016a aVar = new C0016a("DEFAULT_ROUTE", resources.getString(C1869yd.mr_system_route_name));
            aVar.a((Collection<IntentFilter>) i);
            aVar.b(3);
            aVar.c(0);
            aVar.f(1);
            aVar.g(streamMaxVolume);
            aVar.e(this.l);
            a a2 = aVar.a();
            androidx.mediarouter.media.d.a aVar2 = new androidx.mediarouter.media.d.a();
            aVar2.a(a2);
            a(aVar2.a());
        }
    }

    /* compiled from: SystemMediaRouteProvider */
    public interface f {
        void a(String str);
    }

    protected x(Context context) {
        super(context, new C0017c(new ComponentName("android", x.class.getName())));
    }

    public static x a(Context context, f fVar) {
        int i = VERSION.SDK_INT;
        if (i >= 24) {
            return new a(context, fVar);
        }
        if (i >= 18) {
            return new d(context, fVar);
        }
        if (i >= 17) {
            return new c(context, fVar);
        }
        if (i >= 16) {
            return new b(context, fVar);
        }
        return new e(context);
    }

    public void a(h.g gVar) {
    }

    public void b(h.g gVar) {
    }

    public void c(h.g gVar) {
    }

    public void d(h.g gVar) {
    }
}
