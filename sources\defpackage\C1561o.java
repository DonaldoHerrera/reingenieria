package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.SparseArray;

/* renamed from: o reason: default package and case insensitive filesystem */
/* compiled from: DrawableContainer */
class C1561o extends Drawable implements Callback {
    private b a;
    private Rect b;
    private Drawable c;
    private Drawable d;
    private int e = 255;
    private boolean f;
    private int g = -1;
    private int h = -1;
    private boolean i;
    private Runnable j;
    private long k;
    private long l;
    private a m;

    /* renamed from: o$a */
    /* compiled from: DrawableContainer */
    static class a implements Callback {
        private Callback a;

        a() {
        }

        public a a(Callback callback) {
            this.a = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Callback callback = this.a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Callback callback = this.a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        public Callback a() {
            Callback callback = this.a;
            this.a = null;
            return callback;
        }
    }

    /* renamed from: o$b */
    /* compiled from: DrawableContainer */
    static abstract class b extends ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        Mode G;
        boolean H;
        boolean I;
        final C1561o a;
        Resources b;
        int c = 160;
        int d;
        int e;
        SparseArray<ConstantState> f;
        Drawable[] g;
        int h;
        boolean i;
        boolean j;
        Rect k;
        boolean l;
        boolean m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        int z;

        b(b bVar, C1561o oVar, Resources resources) {
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = oVar;
            Resources resources2 = resources != null ? resources : bVar != null ? bVar.b : null;
            this.b = resources2;
            this.c = C1561o.a(resources, bVar != null ? bVar.c : 0);
            if (bVar != null) {
                this.d = bVar.d;
                this.e = bVar.e;
                this.v = true;
                this.w = true;
                this.i = bVar.i;
                this.l = bVar.l;
                this.x = bVar.x;
                this.y = bVar.y;
                this.z = bVar.z;
                this.A = bVar.A;
                this.B = bVar.B;
                this.C = bVar.C;
                this.D = bVar.D;
                this.E = bVar.E;
                this.F = bVar.F;
                this.G = bVar.G;
                this.H = bVar.H;
                this.I = bVar.I;
                if (bVar.c == this.c) {
                    if (bVar.j) {
                        this.k = new Rect(bVar.k);
                        this.j = true;
                    }
                    if (bVar.m) {
                        this.n = bVar.n;
                        this.o = bVar.o;
                        this.p = bVar.p;
                        this.q = bVar.q;
                        this.m = true;
                    }
                }
                if (bVar.r) {
                    this.s = bVar.s;
                    this.r = true;
                }
                if (bVar.t) {
                    this.u = bVar.u;
                    this.t = true;
                }
                Drawable[] drawableArr = bVar.g;
                this.g = new Drawable[drawableArr.length];
                this.h = bVar.h;
                SparseArray<ConstantState> sparseArray = bVar.f;
                if (sparseArray != null) {
                    this.f = sparseArray.clone();
                } else {
                    this.f = new SparseArray<>(this.h);
                }
                int i2 = this.h;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null) {
                        ConstantState constantState = drawableArr[i3].getConstantState();
                        if (constantState != null) {
                            this.f.put(i3, constantState);
                        } else {
                            this.g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.g = new Drawable[10];
            this.h = 0;
        }

        private Drawable b(Drawable drawable) {
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.a);
            return mutate;
        }

        private void n() {
            SparseArray<ConstantState> sparseArray = this.f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.g[this.f.keyAt(i2)] = b(((ConstantState) this.f.valueAt(i2)).newDrawable(this.b));
                }
                this.f = null;
            }
        }

        public final int a(Drawable drawable) {
            int i2 = this.h;
            if (i2 >= this.g.length) {
                a(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.a);
            this.g[i2] = drawable;
            this.h++;
            this.e = drawable.getChangingConfigurations() | this.e;
            k();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return i2;
        }

        /* access modifiers changed from: 0000 */
        public final int c() {
            return this.g.length;
        }

        public boolean canApplyTheme() {
            int i2 = this.h;
            Drawable[] drawableArr = this.g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    ConstantState constantState = (ConstantState) this.f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public final int d() {
            return this.h;
        }

        public final int e() {
            if (!this.m) {
                b();
            }
            return this.o;
        }

        public final int f() {
            if (!this.m) {
                b();
            }
            return this.q;
        }

        public final int g() {
            if (!this.m) {
                b();
            }
            return this.p;
        }

        public int getChangingConfigurations() {
            return this.d | this.e;
        }

        public final Rect h() {
            if (this.i) {
                return null;
            }
            if (this.k != null || this.j) {
                return this.k;
            }
            n();
            Rect rect = new Rect();
            int i2 = this.h;
            Drawable[] drawableArr = this.g;
            Rect rect2 = null;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    int i4 = rect.left;
                    if (i4 > rect2.left) {
                        rect2.left = i4;
                    }
                    int i5 = rect.top;
                    if (i5 > rect2.top) {
                        rect2.top = i5;
                    }
                    int i6 = rect.right;
                    if (i6 > rect2.right) {
                        rect2.right = i6;
                    }
                    int i7 = rect.bottom;
                    if (i7 > rect2.bottom) {
                        rect2.bottom = i7;
                    }
                }
            }
            this.j = true;
            this.k = rect2;
            return rect2;
        }

        public final int i() {
            if (!this.m) {
                b();
            }
            return this.n;
        }

        public final int j() {
            if (this.r) {
                return this.s;
            }
            n();
            int i2 = this.h;
            Drawable[] drawableArr = this.g;
            int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            this.s = opacity;
            this.r = true;
            return opacity;
        }

        /* access modifiers changed from: 0000 */
        public void k() {
            this.r = false;
            this.t = false;
        }

        public final boolean l() {
            return this.l;
        }

        /* access modifiers changed from: 0000 */
        public abstract void m();

        public final void c(int i2) {
            this.B = i2;
        }

        /* access modifiers changed from: 0000 */
        public final boolean b(int i2, int i3) {
            int i4 = this.h;
            Drawable[] drawableArr = this.g;
            boolean z2 = false;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    boolean layoutDirection = VERSION.SDK_INT >= 23 ? drawableArr[i5].setLayoutDirection(i2) : false;
                    if (i5 == i3) {
                        z2 = layoutDirection;
                    }
                }
            }
            this.z = i2;
            return z2;
        }

        public final void b(boolean z2) {
            this.i = z2;
        }

        /* access modifiers changed from: protected */
        public void b() {
            this.m = true;
            n();
            int i2 = this.h;
            Drawable[] drawableArr = this.g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final Drawable a(int i2) {
            Drawable drawable = this.g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<ConstantState> sparseArray = this.f;
            if (sparseArray != null) {
                int indexOfKey = sparseArray.indexOfKey(i2);
                if (indexOfKey >= 0) {
                    Drawable b2 = b(((ConstantState) this.f.valueAt(indexOfKey)).newDrawable(this.b));
                    this.g[i2] = b2;
                    this.f.removeAt(indexOfKey);
                    if (this.f.size() == 0) {
                        this.f = null;
                    }
                    return b2;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public final void a(Resources resources) {
            if (resources != null) {
                this.b = resources;
                int a2 = C1561o.a(resources, this.c);
                int i2 = this.c;
                this.c = a2;
                if (i2 != a2) {
                    this.m = false;
                    this.j = false;
                }
            }
        }

        public final void b(int i2) {
            this.A = i2;
        }

        /* access modifiers changed from: 0000 */
        public final void a(Theme theme) {
            if (theme != null) {
                n();
                int i2 = this.h;
                Drawable[] drawableArr = this.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null && drawableArr[i3].canApplyTheme()) {
                        drawableArr[i3].applyTheme(theme);
                        this.e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                a(theme.getResources());
            }
        }

        public final void a(boolean z2) {
            this.l = z2;
        }

        public void a(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            System.arraycopy(this.g, 0, drawableArr, 0, i2);
            this.g = drawableArr;
        }

        public synchronized boolean a() {
            if (this.v) {
                return this.w;
            }
            n();
            this.v = true;
            int i2 = this.h;
            Drawable[] drawableArr = this.g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }
    }

    C1561o() {
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(23)
    private boolean c() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    /* access modifiers changed from: 0000 */
    public b a() {
        throw null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079  */
    public boolean a(int i2) {
        Runnable runnable;
        if (i2 == this.g) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.a.B > 0) {
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.c;
            if (drawable2 != null) {
                this.d = drawable2;
                this.h = this.g;
                this.l = ((long) this.a.B) + uptimeMillis;
            } else {
                this.d = null;
                this.h = -1;
                this.l = 0;
            }
        } else {
            Drawable drawable3 = this.c;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i2 >= 0) {
            b bVar = this.a;
            if (i2 < bVar.h) {
                Drawable a2 = bVar.a(i2);
                this.c = a2;
                this.g = i2;
                if (a2 != null) {
                    int i3 = this.a.A;
                    if (i3 > 0) {
                        this.k = uptimeMillis + ((long) i3);
                    }
                    a(a2);
                }
                if (!(this.k == 0 && this.l == 0)) {
                    runnable = this.j;
                    if (runnable != null) {
                        this.j = new C1530n(this);
                    } else {
                        unscheduleSelf(runnable);
                    }
                    a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.c = null;
        this.g = -1;
        runnable = this.j;
        if (runnable != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    public void applyTheme(Theme theme) {
        this.a.a(theme);
    }

    /* access modifiers changed from: 0000 */
    public int b() {
        return this.g;
    }

    public boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.e;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.a.getChangingConfigurations();
    }

    public final ConstantState getConstantState() {
        if (!this.a.a()) {
            return null;
        }
        this.a.d = getChangingConfigurations();
        return this.a;
    }

    public Drawable getCurrent() {
        return this.c;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.a.l()) {
            return this.a.e();
        }
        Drawable drawable = this.c;
        return drawable != null ? drawable.getIntrinsicHeight() : -1;
    }

    public int getIntrinsicWidth() {
        if (this.a.l()) {
            return this.a.i();
        }
        Drawable drawable = this.c;
        return drawable != null ? drawable.getIntrinsicWidth() : -1;
    }

    public int getMinimumHeight() {
        if (this.a.l()) {
            return this.a.f();
        }
        Drawable drawable = this.c;
        return drawable != null ? drawable.getMinimumHeight() : 0;
    }

    public int getMinimumWidth() {
        if (this.a.l()) {
            return this.a.g();
        }
        Drawable drawable = this.c;
        return drawable != null ? drawable.getMinimumWidth() : 0;
    }

    public int getOpacity() {
        Drawable drawable = this.c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.a.j();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect h2 = this.a.h();
        if (h2 != null) {
            rect.set(h2);
            z = (h2.right | ((h2.left | h2.top) | h2.bottom)) != 0;
        } else {
            Drawable drawable = this.c;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (c()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.k();
        }
        if (drawable == this.c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.a.C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            this.h = -1;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f) {
                this.c.setAlpha(this.e);
            }
        }
        if (this.l != 0) {
            this.l = 0;
            z = true;
        }
        if (this.k != 0) {
            this.k = 0;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            b a2 = a();
            a2.m();
            a(a2);
            this.i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        return this.a.b(i2, b());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (!this.f || this.e != i2) {
            this.f = true;
            this.e = i2;
            Drawable drawable = this.c;
            if (drawable == null) {
                return;
            }
            if (this.k == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        b bVar = this.a;
        if (bVar.C != z) {
            bVar.C = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.a(drawable, bVar.C);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.a;
        bVar.E = true;
        if (bVar.D != colorFilter) {
            bVar.D = colorFilter;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        b bVar = this.a;
        if (bVar.x != z) {
            bVar.x = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setDither(bVar.x);
            }
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, f2, f3);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.b;
        if (rect == null) {
            this.b = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, i2, i3, i4, i5);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        b bVar = this.a;
        bVar.H = true;
        if (bVar.F != colorStateList) {
            bVar.F = colorStateList;
            androidx.core.graphics.drawable.a.a(this.c, colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        b bVar = this.a;
        bVar.I = true;
        if (bVar.G != mode) {
            bVar.G = mode;
            androidx.core.graphics.drawable.a.a(this.c, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    private void a(Drawable drawable) {
        if (this.m == null) {
            this.m = new a();
        }
        a aVar = this.m;
        aVar.a(drawable.getCallback());
        drawable.setCallback(aVar);
        try {
            if (this.a.A <= 0 && this.f) {
                drawable.setAlpha(this.e);
            }
            if (this.a.E) {
                drawable.setColorFilter(this.a.D);
            } else {
                if (this.a.H) {
                    androidx.core.graphics.drawable.a.a(drawable, this.a.F);
                }
                if (this.a.I) {
                    androidx.core.graphics.drawable.a.a(drawable, this.a.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.a.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.a.C);
            }
            Rect rect = this.b;
            if (VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.m.a());
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public void a(boolean z) {
        boolean z2;
        Drawable drawable;
        boolean z3 = true;
        this.f = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            long j2 = this.k;
            if (j2 != 0) {
                if (j2 <= uptimeMillis) {
                    drawable2.setAlpha(this.e);
                    this.k = 0;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - uptimeMillis) * 255)) / this.a.A)) * this.e) / 255);
                    z2 = true;
                    drawable = this.d;
                    if (drawable == null) {
                        long j3 = this.l;
                        if (j3 != 0) {
                            if (j3 <= uptimeMillis) {
                                drawable.setVisible(false, false);
                                this.d = null;
                                this.h = -1;
                                this.l = 0;
                            } else {
                                drawable.setAlpha(((((int) ((j3 - uptimeMillis) * 255)) / this.a.B) * this.e) / 255);
                                if (!z && z3) {
                                    scheduleSelf(this.j, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        this.l = 0;
                    }
                    z3 = z2;
                    if (!z) {
                        return;
                    }
                    return;
                }
            }
        } else {
            this.k = 0;
        }
        z2 = false;
        drawable = this.d;
        if (drawable == null) {
        }
        z3 = z2;
        if (!z) {
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Resources resources) {
        this.a.a(resources);
    }

    /* access modifiers changed from: protected */
    public void a(b bVar) {
        this.a = bVar;
        int i2 = this.g;
        if (i2 >= 0) {
            this.c = bVar.a(i2);
            Drawable drawable = this.c;
            if (drawable != null) {
                a(drawable);
            }
        }
        this.h = -1;
        this.d = null;
    }

    static int a(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }
}
