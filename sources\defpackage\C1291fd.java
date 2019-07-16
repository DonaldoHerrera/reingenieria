package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: fd reason: default package and case insensitive filesystem */
/* compiled from: LoaderManagerImpl */
class C1291fd extends C1260ed {
    static boolean a = false;
    private final h b;
    private final c c;

    /* renamed from: fd$a */
    /* compiled from: LoaderManagerImpl */
    public static class a<D> extends o<D> implements defpackage.C1384id.b<D> {
        private final int k;
        private final Bundle l;
        private final C1384id<D> m;
        private h n;
        private b<D> o;
        private C1384id<D> p;

        a(int i, Bundle bundle, C1384id<D> idVar, C1384id<D> idVar2) {
            this.k = i;
            this.l = bundle;
            this.m = idVar;
            this.p = idVar2;
            this.m.a(i, this);
        }

        /* access modifiers changed from: 0000 */
        public C1384id<D> a(h hVar, defpackage.C1260ed.a<D> aVar) {
            b<D> bVar = new b<>(this.m, aVar);
            a(hVar, bVar);
            b<D> bVar2 = this.o;
            if (bVar2 != null) {
                a((p<? super D>) bVar2);
            }
            this.n = hVar;
            this.o = bVar;
            return this.m;
        }

        public void b(D d) {
            super.b(d);
            C1384id<D> idVar = this.p;
            if (idVar != null) {
                idVar.n();
                this.p = null;
            }
        }

        /* access modifiers changed from: protected */
        public void c() {
            if (C1291fd.a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.m.p();
        }

        /* access modifiers changed from: protected */
        public void d() {
            if (C1291fd.a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.m.q();
        }

        /* access modifiers changed from: 0000 */
        public C1384id<D> e() {
            return this.m;
        }

        /* access modifiers changed from: 0000 */
        public void f() {
            h hVar = this.n;
            b<D> bVar = this.o;
            if (hVar != null && bVar != null) {
                super.a((p<? super T>) bVar);
                a(hVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.k);
            sb.append(" : ");
            C0235Nb.a(this.m, sb);
            sb.append("}}");
            return sb.toString();
        }

        public void a(p<? super D> pVar) {
            super.a(pVar);
            this.n = null;
            this.o = null;
        }

        /* access modifiers changed from: 0000 */
        public C1384id<D> a(boolean z) {
            if (C1291fd.a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.m.b();
            this.m.a();
            b<D> bVar = this.o;
            if (bVar != null) {
                a((p<? super D>) bVar);
                if (z) {
                    bVar.b();
                }
            }
            this.m.a((defpackage.C1384id.b<D>) this);
            if ((bVar == null || bVar.a()) && !z) {
                return this.m;
            }
            this.m.n();
            return this.p;
        }

        public void a(C1384id<D> idVar, D d) {
            String str = "LoaderManager";
            if (C1291fd.a) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
                Log.v(str, sb.toString());
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                b(d);
                return;
            }
            if (C1291fd.a) {
                Log.w(str, "onLoadComplete was incorrectly called on a background thread");
            }
            a(d);
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.k);
            printWriter.print(" mArgs=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.m);
            C1384id<D> idVar = this.m;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = "  ";
            sb.append(str2);
            idVar.a(sb.toString(), fileDescriptor, printWriter, strArr);
            if (this.o != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.o);
                b<D> bVar = this.o;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                bVar.a(sb2.toString(), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(e().a(a()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(b());
        }
    }

    /* renamed from: fd$b */
    /* compiled from: LoaderManagerImpl */
    static class b<D> implements p<D> {
        private final C1384id<D> a;
        private final defpackage.C1260ed.a<D> b;
        private boolean c = false;

        b(C1384id<D> idVar, defpackage.C1260ed.a<D> aVar) {
            this.a = idVar;
            this.b = aVar;
        }

        public void a(D d) {
            if (C1291fd.a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  onLoadFinished in ");
                sb.append(this.a);
                sb.append(": ");
                sb.append(this.a.a(d));
                Log.v("LoaderManager", sb.toString());
            }
            this.b.a(this.a, d);
            this.c = true;
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            if (this.c) {
                if (C1291fd.a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Resetting: ");
                    sb.append(this.a);
                    Log.v("LoaderManager", sb.toString());
                }
                this.b.a(this.a);
            }
        }

        public String toString() {
            return this.b.toString();
        }

        /* access modifiers changed from: 0000 */
        public boolean a() {
            return this.c;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.c);
        }
    }

    /* renamed from: fd$c */
    /* compiled from: LoaderManagerImpl */
    static class c extends t {
        private static final androidx.lifecycle.u.a a = new C1322gd();
        private C0516ca<a> b = new C0516ca<>();
        private boolean c = false;

        c() {
        }

        static c a(v vVar) {
            return (c) new u(vVar, a).a(c.class);
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            this.c = false;
        }

        /* access modifiers changed from: 0000 */
        public boolean c() {
            return this.c;
        }

        /* access modifiers changed from: 0000 */
        public void d() {
            int j = this.b.j();
            for (int i = 0; i < j; i++) {
                ((a) this.b.f(i)).f();
            }
        }

        /* access modifiers changed from: 0000 */
        public void e() {
            this.c = true;
        }

        /* access modifiers changed from: 0000 */
        public void a(int i, a aVar) {
            this.b.c(i, aVar);
        }

        /* access modifiers changed from: 0000 */
        public <D> a<D> a(int i) {
            return (a) this.b.b(i);
        }

        /* access modifiers changed from: protected */
        public void a() {
            super.a();
            int j = this.b.j();
            for (int i = 0; i < j; i++) {
                ((a) this.b.f(i)).a(true);
            }
            this.b.i();
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.b.j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                String sb2 = sb.toString();
                for (int i = 0; i < this.b.j(); i++) {
                    a aVar = (a) this.b.f(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.b.d(i));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.a(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    C1291fd(h hVar, v vVar) {
        this.b = hVar;
        this.c = c.a(vVar);
    }

    /* JADX INFO: finally extract failed */
    private <D> C1384id<D> a(int i, Bundle bundle, defpackage.C1260ed.a<D> aVar, C1384id<D> idVar) {
        try {
            this.c.e();
            C1384id onCreateLoader = aVar.onCreateLoader(i, bundle);
            if (onCreateLoader != null) {
                if (onCreateLoader.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                        sb.append(onCreateLoader);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                a aVar2 = new a(i, bundle, onCreateLoader, idVar);
                if (a) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  Created new loader ");
                    sb2.append(aVar2);
                    Log.v("LoaderManager", sb2.toString());
                }
                this.c.a(i, aVar2);
                this.c.b();
                return aVar2.a(this.b, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.c.b();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0235Nb.a(this.b, sb);
        sb.append("}}");
        return sb.toString();
    }

    public <D> C1384id<D> a(int i, Bundle bundle, defpackage.C1260ed.a<D> aVar) {
        if (this.c.c()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a a2 = this.c.a(i);
            String str = "LoaderManager";
            if (a) {
                StringBuilder sb = new StringBuilder();
                sb.append("initLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append(bundle);
                Log.v(str, sb.toString());
            }
            if (a2 == null) {
                return a(i, bundle, aVar, null);
            }
            if (a) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Re-using existing loader ");
                sb2.append(a2);
                Log.v(str, sb2.toString());
            }
            return a2.a(this.b, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public void a() {
        this.c.d();
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.c.a(str, fileDescriptor, printWriter, strArr);
    }
}
