package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: m reason: default package and case insensitive filesystem */
/* compiled from: AnimatedStateListDrawableCompat */
public class C1499m extends C1623q {
    private b p;
    private f q;
    private int r;
    private int s;
    private boolean t;

    /* renamed from: m$a */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class a extends f {
        private final Animatable a;

        a(Animatable animatable) {
            super();
            this.a = animatable;
        }

        public void c() {
            this.a.start();
        }

        public void d() {
            this.a.stop();
        }
    }

    /* renamed from: m$b */
    /* compiled from: AnimatedStateListDrawableCompat */
    static class b extends a {
        Y<Long> K;
        C0516ca<Integer> L;

        b(b bVar, C1499m mVar, Resources resources) {
            super(bVar, mVar, resources);
            if (bVar != null) {
                this.K = bVar.K;
                this.L = bVar.L;
                return;
            }
            this.K = new Y<>();
            this.L = new C0516ca<>();
        }

        private static long f(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: 0000 */
        public int a(int i, int i2, Drawable drawable, boolean z) {
            int a = super.a(drawable);
            long f = f(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.K.a(f, Long.valueOf(j2 | j));
            if (z) {
                this.K.a(f(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        public int b(int[] iArr) {
            int a = super.a(iArr);
            if (a >= 0) {
                return a;
            }
            return super.a(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: 0000 */
        public int c(int i, int i2) {
            return (int) ((Long) this.K.b(f(i, i2), Long.valueOf(-1))).longValue();
        }

        /* access modifiers changed from: 0000 */
        public int d(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.L.b(i, Integer.valueOf(0))).intValue();
        }

        /* access modifiers changed from: 0000 */
        public boolean e(int i, int i2) {
            return (((Long) this.K.b(f(i, i2), Long.valueOf(-1))).longValue() & 8589934592L) != 0;
        }

        /* access modifiers changed from: 0000 */
        public void m() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        public Drawable newDrawable() {
            return new C1499m(this, null);
        }

        /* access modifiers changed from: 0000 */
        public boolean d(int i, int i2) {
            return (((Long) this.K.b(f(i, i2), Long.valueOf(-1))).longValue() & 4294967296L) != 0;
        }

        public Drawable newDrawable(Resources resources) {
            return new C1499m(this, resources);
        }

        /* access modifiers changed from: 0000 */
        public int a(int[] iArr, Drawable drawable, int i) {
            int a = super.a(iArr, drawable);
            this.L.c(a, Integer.valueOf(i));
            return a;
        }
    }

    /* renamed from: m$c */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class c extends f {
        private final C1385ie a;

        c(C1385ie ieVar) {
            super();
            this.a = ieVar;
        }

        public void c() {
            this.a.start();
        }

        public void d() {
            this.a.stop();
        }
    }

    /* renamed from: m$d */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class d extends f {
        private final ObjectAnimator a;
        private final boolean b;

        d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            e eVar = new e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) eVar.a());
            ofInt.setInterpolator(eVar);
            this.b = z2;
            this.a = ofInt;
        }

        public boolean a() {
            return this.b;
        }

        public void b() {
            this.a.reverse();
        }

        public void c() {
            this.a.start();
        }

        public void d() {
            this.a.cancel();
        }
    }

    /* renamed from: m$e */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class e implements TimeInterpolator {
        private int[] a;
        private int b;
        private int c;

        e(AnimationDrawable animationDrawable, boolean z) {
            a(animationDrawable, z);
        }

        /* access modifiers changed from: 0000 */
        public int a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.c)) + 0.5f);
            int i2 = this.b;
            int[] iArr = this.a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.c) : 0.0f);
        }

        /* access modifiers changed from: 0000 */
        public int a() {
            return this.c;
        }
    }

    /* renamed from: m$f */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static abstract class f {
        private f() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public C1499m() {
        this(null, null);
    }

    private void c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        d(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        e(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private void d() {
        onStateChange(getState());
    }

    private int e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray a2 = C0286Za.a(resources, theme, attributeSet, C1406j.AnimatedStateListDrawableTransition);
        int resourceId = a2.getResourceId(C1406j.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = a2.getResourceId(C1406j.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = a2.getResourceId(C1406j.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable b2 = resourceId3 > 0 ? C1437k.b(context, resourceId3) : null;
        boolean z = a2.getBoolean(C1406j.AnimatedStateListDrawableTransition_android_reversible, false);
        a2.recycle();
        String str = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
        if (b2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(str);
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                b2 = C1385ie.a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                b2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                b2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (b2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(str);
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.p.a(resourceId, resourceId2, b2, z);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(sb3.toString());
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public void b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        TypedArray a2 = C0286Za.a(resources, theme, attributeSet, C1406j.AnimatedStateListDrawableCompat);
        setVisible(a2.getBoolean(C1406j.AnimatedStateListDrawableCompat_android_visible, true), true);
        a(a2);
        a(resources);
        a2.recycle();
        c(context, resources, xmlPullParser, attributeSet, theme);
        d();
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        f fVar = this.q;
        if (fVar != null) {
            fVar.d();
            this.q = null;
            a(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    public Drawable mutate() {
        if (!this.t) {
            super.mutate();
            if (this == this) {
                this.p.m();
                this.t = true;
            }
        }
        return this;
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int b2 = this.p.b(iArr);
        boolean z = b2 != b() && (b(b2) || a(b2));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.q != null && (visible || z2)) {
            if (z) {
                this.q.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    C1499m(b bVar, Resources resources) {
        super(null);
        this.r = -1;
        this.s = -1;
        a((b) new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    private int d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray a2 = C0286Za.a(resources, theme, attributeSet, C1406j.AnimatedStateListDrawableItem);
        int resourceId = a2.getResourceId(C1406j.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = a2.getResourceId(C1406j.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable b2 = resourceId2 > 0 ? C1437k.b(context, resourceId2) : null;
        a2.recycle();
        int[] a3 = a(attributeSet);
        String str = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
        if (b2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(str);
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("vector")) {
                b2 = C1601pe.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                b2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                b2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (b2 != null) {
            return this.p.a(a3, b2, resourceId);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(str);
        throw new XmlPullParserException(sb2.toString());
    }

    public static C1499m a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C1499m mVar = new C1499m();
            mVar.b(context, resources, xmlPullParser, attributeSet, theme);
            return mVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    private boolean b(int i) {
        int i2;
        f fVar;
        f fVar2 = this.q;
        if (fVar2 == null) {
            i2 = b();
        } else if (i == this.r) {
            return true;
        } else {
            if (i != this.s || !fVar2.a()) {
                i2 = this.r;
                fVar2.d();
            } else {
                fVar2.b();
                this.r = this.s;
                this.s = i;
                return true;
            }
        }
        this.q = null;
        this.s = -1;
        this.r = -1;
        b bVar = this.p;
        int d2 = bVar.d(i2);
        int d3 = bVar.d(i);
        if (!(d3 == 0 || d2 == 0)) {
            int c2 = bVar.c(d2, d3);
            if (c2 < 0) {
                return false;
            }
            boolean e2 = bVar.e(d2, d3);
            a(c2);
            Drawable current = getCurrent();
            if (current instanceof AnimationDrawable) {
                fVar = new d((AnimationDrawable) current, bVar.d(d2, d3), e2);
            } else if (current instanceof C1385ie) {
                fVar = new c((C1385ie) current);
            } else if (current instanceof Animatable) {
                fVar = new a((Animatable) current);
            }
            fVar.c();
            this.q = fVar;
            this.s = i2;
            this.r = i;
            return true;
        }
        return false;
    }

    private void a(TypedArray typedArray) {
        b bVar = this.p;
        if (VERSION.SDK_INT >= 21) {
            bVar.d |= typedArray.getChangingConfigurations();
        }
        bVar.b(typedArray.getBoolean(C1406j.AnimatedStateListDrawableCompat_android_variablePadding, bVar.i));
        bVar.a(typedArray.getBoolean(C1406j.AnimatedStateListDrawableCompat_android_constantSize, bVar.l));
        bVar.b(typedArray.getInt(C1406j.AnimatedStateListDrawableCompat_android_enterFadeDuration, bVar.A));
        bVar.c(typedArray.getInt(C1406j.AnimatedStateListDrawableCompat_android_exitFadeDuration, bVar.B));
        setDither(typedArray.getBoolean(C1406j.AnimatedStateListDrawableCompat_android_dither, bVar.x));
    }

    /* access modifiers changed from: 0000 */
    public b a() {
        return new b(this.p, this, null);
    }

    /* access modifiers changed from: protected */
    public void a(b bVar) {
        super.a(bVar);
        if (bVar instanceof b) {
            this.p = (b) bVar;
        }
    }
}
