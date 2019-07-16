package defpackage;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: id reason: default package and case insensitive filesystem */
/* compiled from: Loader */
public class C1384id<D> {
    int a;
    b<D> b;
    a<D> c;
    Context d;
    boolean e = false;
    boolean f = false;
    boolean g = true;
    boolean h = false;
    boolean i = false;

    /* renamed from: id$a */
    /* compiled from: Loader */
    public interface a<D> {
        void a(C1384id<D> idVar);
    }

    /* renamed from: id$b */
    /* compiled from: Loader */
    public interface b<D> {
        void a(C1384id<D> idVar, D d);
    }

    public C1384id(Context context) {
        this.d = context.getApplicationContext();
    }

    public void a(int i2, b<D> bVar) {
        if (this.b == null) {
            this.b = bVar;
            this.a = i2;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void b(D d2) {
        b<D> bVar = this.b;
        if (bVar != null) {
            bVar.a(this, d2);
        }
    }

    public void c() {
        this.i = false;
    }

    public void d() {
        a<D> aVar = this.c;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void e() {
        j();
    }

    public boolean f() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        throw null;
    }

    public void i() {
        if (this.e) {
            e();
        } else {
            this.h = true;
        }
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public void l() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    public void n() {
        k();
        this.g = true;
        this.e = false;
        this.f = false;
        this.h = false;
        this.i = false;
    }

    public void o() {
        if (this.i) {
            i();
        }
    }

    public final void p() {
        this.e = true;
        this.g = false;
        this.f = false;
        l();
    }

    public void q() {
        this.e = false;
        m();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0235Nb.a(this, sb);
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public boolean b() {
        return h();
    }

    public void a(b<D> bVar) {
        b<D> bVar2 = this.b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (bVar2 == bVar) {
            this.b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    public void a() {
        this.f = true;
        g();
    }

    public String a(D d2) {
        StringBuilder sb = new StringBuilder(64);
        C0235Nb.a(d2, sb);
        sb.append("}");
        return sb.toString();
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        if (this.e || this.h || this.i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.i);
        }
        if (this.f || this.g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f);
            printWriter.print(" mReset=");
            printWriter.println(this.g);
        }
    }
}
