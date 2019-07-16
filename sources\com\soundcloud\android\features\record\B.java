package com.soundcloud.android.features.record;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.ViewConfiguration;
import android.widget.RelativeLayout.LayoutParams;
import com.soundcloud.android.features.record.G.g;
import java.lang.ref.WeakReference;

/* compiled from: CreateWaveDisplay */
public class B extends TouchLayout {
    private final int c;
    /* access modifiers changed from: private */
    public final ga d;
    /* access modifiers changed from: private */
    public final ga e;
    private final Handler f;
    /* access modifiers changed from: private */
    public long g;
    /* access modifiers changed from: private */
    public int h = -1;
    /* access modifiers changed from: private */
    public int i = -1;
    private boolean j;
    private int k;
    /* access modifiers changed from: private */
    public boolean l;
    /* access modifiers changed from: private */
    public C m;
    private Rect n;
    /* access modifiers changed from: private */
    public long o = -1;
    /* access modifiers changed from: private */
    public a p;
    /* access modifiers changed from: private */
    public int q;
    private int r;
    private int s;
    /* access modifiers changed from: private */
    public C4928GKa<c> t = C4928GKa.a();
    /* access modifiers changed from: private */
    public C4928GKa<c> u = C4928GKa.a();
    /* access modifiers changed from: private */
    public C4928GKa<c> v = C4928GKa.a();
    /* access modifiers changed from: private */
    public C4928GKa<c> w = C4928GKa.a();
    private J x;

    /* compiled from: CreateWaveDisplay */
    public interface a {
        void a(float f);

        void a(float f, long j);

        void b(float f, long j);
    }

    /* compiled from: CreateWaveDisplay */
    private static final class b extends Handler {
        private final WeakReference<B> a;
        private final J b;

        static /* synthetic */ void a(B b2, c cVar) {
            if (cVar.a(b2.v)) {
                b2.e.a(cVar.b);
                if (b2.p != null) {
                    b2.p.a(Math.max(0.0f, ((float) cVar.b) / ((float) b2.q)), cVar.a - ((c) b2.v.b()).a);
                }
                b2.m.invalidate();
            }
            b2.v = b2.t;
        }

        static /* synthetic */ void b(B b2, c cVar) {
            if (cVar.a(b2.w)) {
                b2.d.a(b2.q - cVar.b);
                if (b2.p != null) {
                    b2.p.b(Math.min(1.0f, ((float) cVar.b) / ((float) b2.q)), cVar.a - ((c) b2.w.b()).a);
                }
                b2.m.invalidate();
            }
            b2.w = b2.u;
        }

        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v1, types: [int] */
        /* JADX WARNING: type inference failed for: r1v4, types: [int] */
        /* JADX WARNING: type inference failed for: r1v8, types: [boolean] */
        /* JADX WARNING: type inference failed for: r1v9 */
        /* JADX WARNING: type inference failed for: r1v10 */
        /* JADX WARNING: type inference failed for: r1v11 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[boolean, int, float, short, byte, char], int]
  uses: [int, boolean]
  mth insns count: 71
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        public void handleMessage(Message message) {
            B b2 = (B) this.a.get();
            if (b2 != null) {
                int i = message.what;
                ? r1 = 0;
                if (i == 1) {
                    float[] g = ba.a(b2.getContext(), this.b).g();
                    if (b2.l) {
                        r1 = (int) (g[0] * ((float) b2.q));
                    }
                    int g2 = b2.l ? (int) (g[1] * ((float) b2.q)) : b2.q;
                    long j = (long) r1;
                    float min = ((float) (Math.min(Math.max(j, b2.o), (long) g2) - j)) / ((float) (g2 - r1));
                    if (b2.p != null) {
                        b2.p.a(min);
                    }
                } else if (i == 2) {
                    b2.g = System.currentTimeMillis();
                    b2.t.a((C7733yKa<? super T>) new C3649a<Object>(b2));
                    b2.u.a((C7733yKa<? super T>) new C3650b<Object>(b2));
                } else if (i == 3) {
                    b2.g = System.currentTimeMillis();
                    b2.v = b2.t;
                    b2.w = b2.u;
                    b2.d.setPressed(b2.i != -1);
                    ga e = b2.e;
                    if (b2.h != -1) {
                        r1 = 1;
                    }
                    e.setPressed(r1);
                }
            }
        }

        private b(B b2, J j) {
            this.a = new WeakReference<>(b2);
            this.b = j;
        }
    }

    /* compiled from: CreateWaveDisplay */
    private class c {
        long a;
        int b;

        public c(long j, int i) {
            this.a = j;
            this.b = i;
        }

        public boolean a(C4928GKa<c> gKa) {
            return gKa.c() && ((c) gKa.b()).b != this.b;
        }
    }

    public B(Context context, J j2) {
        super(context);
        this.x = j2;
        this.c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.e = new ga(getContext(), com.soundcloud.android.features.record.ga.a.LEFT);
        this.d = new ga(getContext(), com.soundcloud.android.features.record.ga.a.RIGHT);
        this.j = false;
        this.i = -1;
        this.h = -1;
        this.f = new b(j2);
        e();
    }

    private void setTouchMode(D d2) {
        Rect rect;
        if (this.k != 0 && d2.j <= 1) {
            Rect rect2 = null;
            if (this.e.getParent() == this) {
                rect = new Rect();
                this.e.getHitRect(rect);
                int i2 = rect.left;
                int i3 = this.c;
                rect.set(i2 - i3, rect.top - i3, rect.right, rect.bottom + i3);
            } else {
                rect = null;
            }
            if (this.d.getParent() == this) {
                rect2 = new Rect();
                this.d.getHitRect(rect2);
                int i4 = rect2.left;
                int i5 = rect2.top;
                int i6 = this.c;
                rect2.set(i4, i5 - i6, rect2.right + i6, rect2.bottom + i6);
            }
            int i7 = d2.j == 0 ? d2.e : d2.g;
            int i8 = d2.j == 0 ? d2.f : d2.h;
            if (rect != null && rect.contains(i7, i8)) {
                this.h = d2.j;
            } else if (rect2 != null && rect2.contains(i7, i8)) {
                this.i = d2.j;
            } else if (d2.d == 3) {
                Rect rect3 = this.n;
                if (rect3 != null && rect3.contains(i7, i8)) {
                    this.j = true;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z && getWidth() > 0) {
            C c2 = this.m;
            if (c2 != null && c2.getWidth() > 0) {
                d();
                this.e.getLayoutParams().addRule(5, this.m.getId());
                this.d.getLayoutParams().addRule(7, this.m.getId());
                this.q = this.m.getWidth();
                f();
            }
        }
    }

    public void setIsEditing(boolean z) {
        if (this.l != z) {
            this.l = z;
            this.m.setIsEditing(z);
            if (this.l) {
                f();
                return;
            }
            if (this.e.getParent() == this) {
                removeView(this.e);
            }
            if (this.d.getParent() == this) {
                removeView(this.d);
            }
        }
    }

    public void setProgress(float f2) {
        this.m.setPlaybackProgress(f2);
    }

    public void setTrimListener(a aVar) {
        this.p = aVar;
    }

    private void f() {
        float[] g2 = ba.a(getContext(), this.x).g();
        if (this.l) {
            this.e.a((int) (((float) this.q) * g2[0]));
            if (this.e.getParent() != this) {
                addView(this.e);
            }
            this.d.a((int) ((1.0d - ((double) g2[1])) * ((double) this.q)));
            if (this.d.getParent() != this) {
                addView(this.d);
            }
        }
    }

    public void c() {
        this.k = 0;
        this.m.b();
    }

    /* access modifiers changed from: protected */
    public void d(D d2) {
        c(d2.j);
    }

    /* access modifiers changed from: protected */
    public void e(D d2) {
        c(d2.j);
        b(3);
        this.f.removeMessages(1);
        this.o = -1;
        this.j = false;
    }

    private void d(int i2) {
        long j2 = (long) i2;
        if (j2 != this.o) {
            this.o = j2;
            b(1);
        }
    }

    public void b() {
        if (this.k != 0) {
            this.k = 0;
            this.m.a(this.k, true);
        }
    }

    public void a(boolean z) {
        if (this.k != 1) {
            this.k = 1;
            this.m.a(this.k, z);
        }
    }

    /* access modifiers changed from: protected */
    public void c(D d2) {
        setTouchMode(d2);
    }

    private void c(int i2) {
        if (this.h == i2) {
            this.t = C4928GKa.a();
            this.h = -1;
            this.r = -1;
            int i3 = this.i;
            if (i3 > i2) {
                this.i = i3 - 1;
            }
        }
        if (this.i == i2) {
            this.u = C4928GKa.a();
            this.i = -1;
            this.s = -1;
            int i4 = this.h;
            if (i4 > i2) {
                this.h = i4 - 1;
            }
        }
        a(2);
    }

    private void d() {
        if (this.m != null) {
            this.n = new Rect();
            this.m.getHitRect(this.n);
        }
    }

    public void b(Bundle bundle) {
        String simpleName = B.class.getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("_mode");
        bundle.putInt(sb.toString(), this.k);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(simpleName);
        sb2.append("_inEditMode");
        bundle.putBoolean(sb2.toString(), this.l);
    }

    private C e() {
        C c2 = this.m;
        if (c2 != null && c2.getParent() == this) {
            removeView(this.m);
        }
        this.m = new C(getContext());
        this.m.setRecordIntentProvider(this.x);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.bottomMargin = (int) getResources().getDimension(g.create_wave_view_bottom_margin);
        addView(this.m, layoutParams);
        return this.m;
    }

    public void a(float f2, boolean z) {
        this.m.a(f2, z);
    }

    public void a(Bundle bundle) {
        String simpleName = B.class.getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("_mode");
        this.k = bundle.getInt(sb.toString(), this.k);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(simpleName);
        sb2.append("_inEditMode");
        setIsEditing(bundle.getBoolean(sb2.toString(), this.l));
        this.m.a(this.k, false);
    }

    /* access modifiers changed from: protected */
    public void b(D d2) {
        if (this.j) {
            d(d2.e);
            return;
        }
        int i2 = d2.j == 0 ? d2.e : d2.g;
        if (this.h > -1) {
            if (this.r == -1) {
                this.r = i2 - this.e.getLeft();
            }
            this.t = C4928GKa.c(new c(System.currentTimeMillis(), Math.max(0, Math.min(this.d.getLeft() - this.e.getWidth(), (this.h == 0 ? d2.e : d2.g) - this.r))));
        }
        if (this.i > -1) {
            if (this.s == -1) {
                this.s = i2 - this.d.getRight();
            }
            this.u = C4928GKa.c(new c(System.currentTimeMillis(), Math.min(getWidth(), Math.max(this.e.getRight() + this.d.getWidth(), (this.i == 0 ? d2.e : d2.g) - this.s))));
        }
        a(2);
    }

    public void a() {
        super.a();
        this.m.a();
    }

    /* access modifiers changed from: protected */
    public void a(D d2) {
        setTouchMode(d2);
        if (this.j) {
            d(d2.e);
            return;
        }
        int i2 = this.h;
        if (i2 <= -1 || d2.j != i2) {
            int i3 = this.i;
            if (i3 > -1 && d2.j == i3) {
                b(3);
                return;
            }
            return;
        }
        b(3);
    }

    /* access modifiers changed from: protected */
    public void a(int i2) {
        if (this.g == 0) {
            b(i2);
            return;
        }
        long max = Math.max(0, (200 - System.currentTimeMillis()) - this.g);
        if (this.f.hasMessages(i2)) {
            this.f.removeMessages(i2);
        }
        this.f.sendEmptyMessageDelayed(i2, max);
    }

    /* access modifiers changed from: protected */
    public void b(int i2) {
        if (!this.f.hasMessages(i2)) {
            this.f.sendEmptyMessage(i2);
        }
    }
}
