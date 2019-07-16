package bo.app;

import android.content.res.Resources;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable;
import android.os.Handler;

public final class gi {
    /* access modifiers changed from: private */
    public final int a;
    /* access modifiers changed from: private */
    public final int b;
    /* access modifiers changed from: private */
    public final int c;
    /* access modifiers changed from: private */
    public final Drawable d;
    /* access modifiers changed from: private */
    public final Drawable e;
    /* access modifiers changed from: private */
    public final Drawable f;
    /* access modifiers changed from: private */
    public final boolean g;
    /* access modifiers changed from: private */
    public final boolean h;
    /* access modifiers changed from: private */
    public final boolean i;
    /* access modifiers changed from: private */
    public final gs j;
    /* access modifiers changed from: private */
    public final Options k;
    /* access modifiers changed from: private */
    public final int l;
    /* access modifiers changed from: private */
    public final boolean m;
    /* access modifiers changed from: private */
    public final Object n;
    /* access modifiers changed from: private */
    public final ho o;
    /* access modifiers changed from: private */
    public final ho p;
    /* access modifiers changed from: private */
    public final he q;
    /* access modifiers changed from: private */
    public final Handler r;
    /* access modifiers changed from: private */
    public final boolean s;

    public static class a {
        /* access modifiers changed from: private */
        public int a = 0;
        /* access modifiers changed from: private */
        public int b = 0;
        /* access modifiers changed from: private */
        public int c = 0;
        /* access modifiers changed from: private */
        public Drawable d = null;
        /* access modifiers changed from: private */
        public Drawable e = null;
        /* access modifiers changed from: private */
        public Drawable f = null;
        /* access modifiers changed from: private */
        public boolean g = false;
        /* access modifiers changed from: private */
        public boolean h = false;
        /* access modifiers changed from: private */
        public boolean i = false;
        /* access modifiers changed from: private */
        public gs j = gs.IN_SAMPLE_POWER_OF_2;
        /* access modifiers changed from: private */
        public Options k = new Options();
        /* access modifiers changed from: private */
        public int l = 0;
        /* access modifiers changed from: private */
        public boolean m = false;
        /* access modifiers changed from: private */
        public Object n = null;
        /* access modifiers changed from: private */
        public ho o = null;
        /* access modifiers changed from: private */
        public ho p = null;
        /* access modifiers changed from: private */
        public he q = gg.c();
        /* access modifiers changed from: private */
        public Handler r = null;
        /* access modifiers changed from: private */
        public boolean s = false;

        public a a(boolean z) {
            this.h = z;
            return this;
        }

        public a b(boolean z) {
            this.i = z;
            return this;
        }

        public a a(gs gsVar) {
            this.j = gsVar;
            return this;
        }

        public a a(gi giVar) {
            this.a = giVar.a;
            this.b = giVar.b;
            this.c = giVar.c;
            this.d = giVar.d;
            this.e = giVar.e;
            this.f = giVar.f;
            this.g = giVar.g;
            this.h = giVar.h;
            this.i = giVar.i;
            this.j = giVar.j;
            this.k = giVar.k;
            this.l = giVar.l;
            this.m = giVar.m;
            this.n = giVar.n;
            this.o = giVar.o;
            this.p = giVar.p;
            this.q = giVar.q;
            this.r = giVar.r;
            this.s = giVar.s;
            return this;
        }

        public gi a() {
            return new gi(this);
        }
    }

    public static gi t() {
        return new a().a();
    }

    private gi(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
        this.m = aVar.m;
        this.n = aVar.n;
        this.o = aVar.o;
        this.p = aVar.p;
        this.q = aVar.q;
        this.r = aVar.r;
        this.s = aVar.s;
    }

    public boolean a() {
        return (this.d == null && this.a == 0) ? false : true;
    }

    public boolean b() {
        return (this.e == null && this.b == 0) ? false : true;
    }

    public boolean c() {
        return (this.f == null && this.c == 0) ? false : true;
    }

    public boolean d() {
        return this.o != null;
    }

    public boolean e() {
        return this.p != null;
    }

    public boolean f() {
        return this.l > 0;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public boolean i() {
        return this.i;
    }

    public gs j() {
        return this.j;
    }

    public Options k() {
        return this.k;
    }

    public int l() {
        return this.l;
    }

    public boolean m() {
        return this.m;
    }

    public Object n() {
        return this.n;
    }

    public ho o() {
        return this.o;
    }

    public ho p() {
        return this.p;
    }

    public he q() {
        return this.q;
    }

    public Handler r() {
        return this.r;
    }

    /* access modifiers changed from: 0000 */
    public boolean s() {
        return this.s;
    }

    public Drawable a(Resources resources) {
        int i2 = this.a;
        return i2 != 0 ? resources.getDrawable(i2) : this.d;
    }

    public Drawable b(Resources resources) {
        int i2 = this.b;
        return i2 != 0 ? resources.getDrawable(i2) : this.e;
    }

    public Drawable c(Resources resources) {
        int i2 = this.c;
        return i2 != 0 ? resources.getDrawable(i2) : this.f;
    }
}
