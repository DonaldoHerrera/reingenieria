package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.widget.ImageView;
import com.squareup.picasso.E.d;
import com.squareup.picasso.E.e;
import com.squareup.picasso.K.a;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RequestCreator */
public class L {
    private static final AtomicInteger a = new AtomicInteger();
    private final E b;
    private final a c;
    private boolean d;
    private boolean e;
    private boolean f = true;
    private int g;
    private int h;
    private int i;
    private int j;
    private Drawable k;
    private Drawable l;
    private Object m;

    L(E e2, Uri uri, int i2) {
        if (!e2.q) {
            this.b = e2;
            this.c = new a(uri, i2, e2.n);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    private Drawable f() {
        int i2 = this.g;
        if (i2 == 0) {
            return this.k;
        }
        int i3 = VERSION.SDK_INT;
        if (i3 >= 21) {
            return this.b.g.getDrawable(i2);
        }
        if (i3 >= 16) {
            return this.b.g.getResources().getDrawable(this.g);
        }
        TypedValue typedValue = new TypedValue();
        this.b.g.getResources().getValue(this.g, typedValue, true);
        return this.b.g.getResources().getDrawable(typedValue.resourceId);
    }

    public L a(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Error image may not be null.");
        } else if (this.h == 0) {
            this.l = drawable;
            return this;
        } else {
            throw new IllegalStateException("Error image already set.");
        }
    }

    public L b(Drawable drawable) {
        if (!this.f) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (this.g == 0) {
            this.k = drawable;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public L c() {
        this.d = true;
        return this;
    }

    public L d() {
        if (this.g != 0) {
            throw new IllegalStateException("Placeholder resource already set.");
        } else if (this.k == null) {
            this.f = false;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    /* access modifiers changed from: 0000 */
    public L e() {
        this.e = false;
        return this;
    }

    public L a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Tag invalid.");
        } else if (this.m == null) {
            this.m = obj;
            return this;
        } else {
            throw new IllegalStateException("Tag already set.");
        }
    }

    public Bitmap b() throws IOException {
        long nanoTime = System.nanoTime();
        W.b();
        if (this.e) {
            throw new IllegalStateException("Fit cannot be used with get.");
        } else if (!this.c.b()) {
            return null;
        } else {
            K a2 = a(nanoTime);
            C6254t tVar = new C6254t(this.b, a2, this.i, this.j, this.m, W.a(a2, new StringBuilder()));
            E e2 = this.b;
            return C6244i.a(e2, e2.h, e2.i, e2.j, (C6236a) tVar).l();
        }
    }

    /* access modifiers changed from: 0000 */
    public L a() {
        this.m = null;
        return this;
    }

    public L a(int i2, int i3) {
        this.c.a(i2, i3);
        return this;
    }

    public L a(Config config) {
        this.c.a(config);
        return this;
    }

    public L a(e eVar) {
        this.c.a(eVar);
        return this;
    }

    public L a(U u) {
        this.c.a(u);
        return this;
    }

    public L a(z zVar, z... zVarArr) {
        String str = "Memory policy cannot be null.";
        if (zVar != null) {
            this.i = zVar.d | this.i;
            if (zVarArr != null) {
                if (zVarArr.length > 0) {
                    int length = zVarArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        z zVar2 = zVarArr[i2];
                        if (zVar2 != null) {
                            this.i = zVar2.d | this.i;
                            i2++;
                        } else {
                            throw new IllegalArgumentException(str);
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException(str);
        }
        throw new IllegalArgumentException(str);
    }

    public L a(A a2, A... aArr) {
        String str = "Network policy cannot be null.";
        if (a2 != null) {
            this.j = a2.e | this.j;
            if (aArr != null) {
                if (aArr.length > 0) {
                    int length = aArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        A a3 = aArr[i2];
                        if (a3 != null) {
                            this.j = a3.e | this.j;
                            i2++;
                        } else {
                            throw new IllegalArgumentException(str);
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException(str);
        }
        throw new IllegalArgumentException(str);
    }

    public void a(S s) {
        long nanoTime = System.nanoTime();
        W.a();
        if (s == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.e) {
            Drawable drawable = null;
            if (!this.c.b()) {
                this.b.a(s);
                if (this.f) {
                    drawable = f();
                }
                s.a(drawable);
                return;
            }
            K a2 = a(nanoTime);
            String a3 = W.a(a2);
            if (z.a(this.i)) {
                Bitmap b2 = this.b.b(a3);
                if (b2 != null) {
                    this.b.a(s);
                    s.a(b2, d.MEMORY);
                    return;
                }
            }
            if (this.f) {
                drawable = f();
            }
            s.a(drawable);
            T t = new T(this.b, s, a2, this.i, this.j, this.l, a3, this.m, this.h);
            this.b.a((C6236a) t);
        } else {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
    }

    public void a(ImageView imageView, C6247l lVar) {
        ImageView imageView2 = imageView;
        C6247l lVar2 = lVar;
        long nanoTime = System.nanoTime();
        W.a();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.c.b()) {
            this.b.a(imageView2);
            if (this.f) {
                H.a(imageView2, f());
            }
        } else {
            if (this.e) {
                if (!this.c.c()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f) {
                            H.a(imageView2, f());
                        }
                        this.b.a(imageView2, new C6250o(this, imageView2, lVar2));
                        return;
                    }
                    this.c.a(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            K a2 = a(nanoTime);
            String a3 = W.a(a2);
            if (z.a(this.i)) {
                Bitmap b2 = this.b.b(a3);
                if (b2 != null) {
                    this.b.a(imageView2);
                    E e2 = this.b;
                    H.a(imageView, e2.g, b2, d.MEMORY, this.d, e2.o);
                    if (this.b.p) {
                        String g2 = a2.g();
                        StringBuilder sb = new StringBuilder();
                        sb.append("from ");
                        sb.append(d.MEMORY);
                        W.a("Main", "completed", g2, sb.toString());
                    }
                    if (lVar2 != null) {
                        lVar.onSuccess();
                    }
                    return;
                }
            }
            if (this.f) {
                H.a(imageView2, f());
            }
            C6255u uVar = new C6255u(this.b, imageView, a2, this.i, this.j, this.h, this.l, a3, this.m, lVar, this.d);
            this.b.a((C6236a) uVar);
        }
    }

    private K a(long j2) {
        int andIncrement = a.getAndIncrement();
        K a2 = this.c.a();
        a2.b = andIncrement;
        a2.c = j2;
        boolean z = this.b.p;
        String str = "Main";
        if (z) {
            W.a(str, "created", a2.g(), a2.toString());
        }
        this.b.a(a2);
        if (a2 != a2) {
            a2.b = andIncrement;
            a2.c = j2;
            if (z) {
                String d2 = a2.d();
                StringBuilder sb = new StringBuilder();
                sb.append("into ");
                sb.append(a2);
                W.a(str, "changed", d2, sb.toString());
            }
        }
        return a2;
    }
}
