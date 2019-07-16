package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: wm reason: default package and case insensitive filesystem */
/* compiled from: BaseAudioProcessor */
public abstract class C1818wm implements C1639qm {
    protected int a = -1;
    protected int b = -1;
    protected int c = -1;
    private ByteBuffer d;
    private ByteBuffer e;
    private boolean f;

    public C1818wm() {
        ByteBuffer byteBuffer = C1639qm.a;
        this.d = byteBuffer;
        this.e = byteBuffer;
    }

    public boolean a() {
        return this.f && this.e == C1639qm.a;
    }

    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.e;
        this.e = C1639qm.a;
        return byteBuffer;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.a;
    }

    public int e() {
        return this.c;
    }

    public final void f() {
        this.f = true;
        i();
    }

    public final void flush() {
        this.e = C1639qm.a;
        this.f = false;
        h();
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        return this.e.hasRemaining();
    }

    /* access modifiers changed from: protected */
    public void h() {
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    public boolean isActive() {
        return this.a != -1;
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    public final void reset() {
        flush();
        this.d = C1639qm.a;
        this.a = -1;
        this.b = -1;
        this.c = -1;
        j();
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer a(int i) {
        if (this.d.capacity() < i) {
            this.d = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.d.clear();
        }
        ByteBuffer byteBuffer = this.d;
        this.e = byteBuffer;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    public final boolean b(int i, int i2, int i3) {
        if (i == this.a && i2 == this.b && i3 == this.c) {
            return false;
        }
        this.a = i;
        this.b = i2;
        this.c = i3;
        return true;
    }
}
