package com.google.android.material.tabs;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.va;
import androidx.core.widget.l;
import androidx.viewpager.widget.ViewPager;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.android.material.internal.r;
import com.google.android.material.internal.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@androidx.viewpager.widget.ViewPager.a
public class TabLayout extends HorizontalScrollView {
    private static final C0251Rb<f> a = new C0259Tb(16);
    int A;
    boolean B;
    boolean C;
    boolean D;
    private b E;
    private final ArrayList<b> F;
    private b G;
    private ValueAnimator H;
    ViewPager I;
    private androidx.viewpager.widget.a J;
    private DataSetObserver K;
    private g L;
    private a M;
    private boolean N;
    private final C0251Rb<h> O;
    private final ArrayList<f> b;
    private f c;
    /* access modifiers changed from: private */
    public final RectF d;
    private final e e;
    int f;
    int g;
    int h;
    int i;
    int j;
    ColorStateList k;
    ColorStateList l;
    ColorStateList m;
    Drawable n;
    Mode o;
    float p;
    float q;
    final int r;
    int s;
    private final int t;
    private final int u;
    private final int v;
    private int w;
    int x;
    int y;
    int z;

    private class a implements androidx.viewpager.widget.ViewPager.d {
        private boolean a;

        a() {
        }

        public void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.I == viewPager) {
                tabLayout.a(aVar2, this.a);
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(boolean z) {
            this.a = z;
        }
    }

    public interface b<T extends f> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    public interface c extends b<f> {
    }

    private class d extends DataSetObserver {
        d() {
        }

        public void onChanged() {
            TabLayout.this.c();
        }

        public void onInvalidated() {
            TabLayout.this.c();
        }
    }

    private class e extends LinearLayout {
        private int a;
        private final Paint b;
        private final GradientDrawable c;
        int d = -1;
        float e;
        private int f = -1;
        private int g = -1;
        private int h = -1;
        private ValueAnimator i;

        e(Context context) {
            super(context);
            setWillNotDraw(false);
            this.b = new Paint();
            this.c = new GradientDrawable();
        }

        /* access modifiers changed from: 0000 */
        public void a(int i2) {
            if (this.b.getColor() != i2) {
                this.b.setColor(i2);
                C1778vc.F(this);
            }
        }

        /* access modifiers changed from: 0000 */
        public void b(int i2) {
            if (this.a != i2) {
                this.a = i2;
                C1778vc.F(this);
            }
        }

        public void draw(Canvas canvas) {
            Drawable drawable = TabLayout.this.n;
            int i2 = 0;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            int i3 = this.a;
            if (i3 >= 0) {
                intrinsicHeight = i3;
            }
            int i4 = TabLayout.this.z;
            if (i4 == 0) {
                i2 = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i4 == 1) {
                i2 = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i4 != 2) {
                if (i4 != 3) {
                    intrinsicHeight = 0;
                } else {
                    intrinsicHeight = getHeight();
                }
            }
            int i5 = this.g;
            if (i5 >= 0 && this.h > i5) {
                Drawable drawable2 = TabLayout.this.n;
                if (drawable2 == null) {
                    drawable2 = this.c;
                }
                Drawable i6 = androidx.core.graphics.drawable.a.i(drawable2);
                i6.setBounds(this.g, i2, this.h, intrinsicHeight);
                Paint paint = this.b;
                if (paint != null) {
                    if (VERSION.SDK_INT == 21) {
                        i6.setColorFilter(paint.getColor(), Mode.SRC_IN);
                    } else {
                        androidx.core.graphics.drawable.a.b(i6, paint.getColor());
                    }
                }
                i6.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.i;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                b();
                return;
            }
            this.i.cancel();
            a(this.d, Math.round((1.0f - this.i.getAnimatedFraction()) * ((float) this.i.getDuration())));
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (MeasureSpec.getMode(i2) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.A == 1 && tabLayout.x == 1) {
                    int childCount = getChildCount();
                    int i4 = 0;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = getChildAt(i5);
                        if (childAt.getVisibility() == 0) {
                            i4 = Math.max(i4, childAt.getMeasuredWidth());
                        }
                    }
                    if (i4 > 0) {
                        if (i4 * childCount <= getMeasuredWidth() - (TabLayout.this.a(16) * 2)) {
                            boolean z2 = false;
                            for (int i6 = 0; i6 < childCount; i6++) {
                                LayoutParams layoutParams = (LayoutParams) getChildAt(i6).getLayoutParams();
                                if (layoutParams.width != i4 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i4;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.x = 0;
                            tabLayout2.a(false);
                        }
                        if (z) {
                            super.onMeasure(i2, i3);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (VERSION.SDK_INT < 23 && this.f != i2) {
                requestLayout();
                this.f = i2;
            }
        }

        private void b() {
            int i2;
            int i3;
            View childAt = getChildAt(this.d);
            if (childAt == null || childAt.getWidth() <= 0) {
                i3 = -1;
                i2 = -1;
            } else {
                i3 = childAt.getLeft();
                i2 = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.C && (childAt instanceof h)) {
                    a((h) childAt, tabLayout.d);
                    i3 = (int) TabLayout.this.d.left;
                    i2 = (int) TabLayout.this.d.right;
                }
                if (this.e > 0.0f && this.d < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.d + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.C && (childAt2 instanceof h)) {
                        a((h) childAt2, tabLayout2.d);
                        left = (int) TabLayout.this.d.left;
                        right = (int) TabLayout.this.d.right;
                    }
                    float f2 = this.e;
                    i3 = (int) ((((float) left) * f2) + ((1.0f - f2) * ((float) i3)));
                    i2 = (int) ((((float) right) * f2) + ((1.0f - f2) * ((float) i2)));
                }
            }
            b(i3, i2);
        }

        /* access modifiers changed from: 0000 */
        public boolean a() {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (getChildAt(i2).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void a(int i2, float f2) {
            ValueAnimator valueAnimator = this.i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.i.cancel();
            }
            this.d = i2;
            this.e = f2;
            b();
        }

        /* access modifiers changed from: 0000 */
        public void a(int i2, int i3) {
            ValueAnimator valueAnimator = this.i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.i.cancel();
            }
            View childAt = getChildAt(i2);
            if (childAt == null) {
                b();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.C && (childAt instanceof h)) {
                a((h) childAt, tabLayout.d);
                left = (int) TabLayout.this.d.left;
                right = (int) TabLayout.this.d.right;
            }
            int i4 = left;
            int i5 = right;
            int i6 = this.g;
            int i7 = this.h;
            if (!(i6 == i4 && i7 == i5)) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.i = valueAnimator2;
                valueAnimator2.setInterpolator(Ez.b);
                valueAnimator2.setDuration((long) i3);
                valueAnimator2.setFloatValues(new float[]{0.0f, 1.0f});
                b bVar = new b(this, i6, i4, i7, i5);
                valueAnimator2.addUpdateListener(bVar);
                valueAnimator2.addListener(new c(this, i2));
                valueAnimator2.start();
            }
        }

        /* access modifiers changed from: 0000 */
        public void b(int i2, int i3) {
            if (i2 != this.g || i3 != this.h) {
                this.g = i2;
                this.h = i3;
                C1778vc.F(this);
            }
        }

        private void a(h hVar, RectF rectF) {
            int a2 = hVar.d();
            if (a2 < TabLayout.this.a(24)) {
                a2 = TabLayout.this.a(24);
            }
            int left = (hVar.getLeft() + hVar.getRight()) / 2;
            int i2 = a2 / 2;
            rectF.set((float) (left - i2), 0.0f, (float) (left + i2), 0.0f);
        }
    }

    public static class f {
        private Object a;
        private Drawable b;
        /* access modifiers changed from: private */
        public CharSequence c;
        /* access modifiers changed from: private */
        public CharSequence d;
        private int e = -1;
        private View f;
        public TabLayout g;
        public h h;

        public int c() {
            return this.e;
        }

        public CharSequence d() {
            return this.c;
        }

        public boolean e() {
            TabLayout tabLayout = this.g;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: 0000 */
        public void f() {
            this.g = null;
            this.h = null;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -1;
            this.f = null;
        }

        public void g() {
            TabLayout tabLayout = this.g;
            if (tabLayout != null) {
                tabLayout.c(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: 0000 */
        public void h() {
            h hVar = this.h;
            if (hVar != null) {
                hVar.b();
            }
        }

        public View a() {
            return this.f;
        }

        public Drawable b() {
            return this.b;
        }

        public f a(View view) {
            this.f = view;
            h();
            return this;
        }

        /* access modifiers changed from: 0000 */
        public void b(int i) {
            this.e = i;
        }

        public f b(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
                this.h.setContentDescription(charSequence);
            }
            this.c = charSequence;
            h();
            return this;
        }

        public f a(int i) {
            a(LayoutInflater.from(this.h.getContext()).inflate(i, this.h, false));
            return this;
        }

        public f a(Drawable drawable) {
            this.b = drawable;
            h();
            return this;
        }

        public f a(CharSequence charSequence) {
            this.d = charSequence;
            h();
            return this;
        }
    }

    public static class g implements androidx.viewpager.widget.ViewPager.e {
        private final WeakReference<TabLayout> a;
        private int b;
        private int c;

        public g(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        public void a(int i) {
            this.b = this.c;
            this.c = i;
        }

        public void b(int i) {
            TabLayout tabLayout = (TabLayout) this.a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.c;
                tabLayout.b(tabLayout.b(i), i2 == 0 || (i2 == 2 && this.b == 0));
            }
        }

        public void a(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.a.get();
            if (tabLayout != null) {
                boolean z = false;
                boolean z2 = this.c != 2 || this.b == 1;
                if (!(this.c == 2 && this.b == 0)) {
                    z = true;
                }
                tabLayout.a(i, f, z2, z);
            }
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            this.c = 0;
            this.b = 0;
        }
    }

    class h extends LinearLayout {
        private f a;
        private TextView b;
        private ImageView c;
        private View d;
        private TextView e;
        private ImageView f;
        private Drawable g;
        private int h = 2;

        public h(Context context) {
            super(context);
            a(context);
            C1778vc.b(this, TabLayout.this.f, TabLayout.this.g, TabLayout.this.h, TabLayout.this.i);
            setGravity(17);
            setOrientation(TabLayout.this.B ^ true ? 1 : 0);
            setClickable(true);
            C1778vc.a((View) this, C1568oc.a(getContext(), CloseCodes.PROTOCOL_ERROR));
        }

        /* access modifiers changed from: private */
        public int d() {
            View[] viewArr = {this.b, this.c, this.d};
            int length = viewArr.length;
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            for (int i4 = 0; i4 < length; i4++) {
                View view = viewArr[i4];
                if (view != null && view.getVisibility() == 0) {
                    i3 = z ? Math.min(i3, view.getLeft()) : view.getLeft();
                    i2 = z ? Math.max(i2, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i2 - i3;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            f fVar = this.a;
            Drawable drawable = null;
            View a2 = fVar != null ? fVar.a() : null;
            if (a2 != null) {
                ViewParent parent = a2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(a2);
                    }
                    addView(a2);
                }
                this.d = a2;
                TextView textView = this.b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
                this.e = (TextView) a2.findViewById(16908308);
                TextView textView2 = this.e;
                if (textView2 != null) {
                    this.h = l.d(textView2);
                }
                this.f = (ImageView) a2.findViewById(16908294);
            } else {
                View view = this.d;
                if (view != null) {
                    removeView(view);
                    this.d = null;
                }
                this.e = null;
                this.f = null;
            }
            boolean z = false;
            if (this.d == null) {
                if (this.c == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(Az.design_layout_tab_icon, this, false);
                    addView(imageView2, 0);
                    this.c = imageView2;
                }
                if (!(fVar == null || fVar.b() == null)) {
                    drawable = androidx.core.graphics.drawable.a.i(fVar.b()).mutate();
                }
                if (drawable != null) {
                    androidx.core.graphics.drawable.a.a(drawable, TabLayout.this.l);
                    Mode mode = TabLayout.this.o;
                    if (mode != null) {
                        androidx.core.graphics.drawable.a.a(drawable, mode);
                    }
                }
                if (this.b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(Az.design_layout_tab_text, this, false);
                    addView(textView3);
                    this.b = textView3;
                    this.h = l.d(this.b);
                }
                l.d(this.b, TabLayout.this.j);
                ColorStateList colorStateList = TabLayout.this.k;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
                a(this.b, this.c);
            } else if (!(this.e == null && this.f == null)) {
                a(this.e, this.f);
            }
            if (fVar != null && !TextUtils.isEmpty(fVar.d)) {
                setContentDescription(fVar.d);
            }
            if (fVar != null && fVar.e()) {
                z = true;
            }
            setSelected(z);
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            setOrientation(TabLayout.this.B ^ true ? 1 : 0);
            if (this.e == null && this.f == null) {
                a(this.b, this.c);
            } else {
                a(this.e, this.f);
            }
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.g;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.g.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(androidx.appcompat.app.ActionBar.b.class.getName());
        }

        @TargetApi(14)
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(androidx.appcompat.app.ActionBar.b.class.getName());
        }

        public void onMeasure(int i2, int i3) {
            int size = MeasureSpec.getSize(i2);
            int mode = MeasureSpec.getMode(i2);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i2 = MeasureSpec.makeMeasureSpec(TabLayout.this.s, Integer.MIN_VALUE);
            }
            super.onMeasure(i2, i3);
            if (this.b != null) {
                float f2 = TabLayout.this.p;
                int i4 = this.h;
                ImageView imageView = this.c;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f2 = TabLayout.this.q;
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.b.getTextSize();
                int lineCount = this.b.getLineCount();
                int d2 = l.d(this.b);
                int i5 = (f2 > textSize ? 1 : (f2 == textSize ? 0 : -1));
                if (i5 != 0 || (d2 >= 0 && i4 != d2)) {
                    if (TabLayout.this.A == 1 && i5 > 0 && lineCount == 1) {
                        Layout layout = this.b.getLayout();
                        if (layout == null || a(layout, 0, f2) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.b.setTextSize(0, f2);
                        this.b.setMaxLines(i4);
                        super.onMeasure(i2, i3);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.a.g();
            return true;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.d;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* JADX WARNING: type inference failed for: r7v2, types: [android.graphics.drawable.Drawable] */
        /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: type inference failed for: r7v6, types: [android.graphics.drawable.Drawable] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        public void a(Context context) {
            int i2 = TabLayout.this.r;
            GradientDrawable gradientDrawable = null;
            if (i2 != 0) {
                this.g = C1437k.b(context, i2);
                Drawable drawable = this.g;
                if (drawable != null && drawable.isStateful()) {
                    this.g.setState(getDrawableState());
                }
            } else {
                this.g = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.m != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList a2 = Yz.a(TabLayout.this.m);
                if (VERSION.SDK_INT >= 21) {
                    if (TabLayout.this.D) {
                        gradientDrawable2 = 0;
                    }
                    if (!TabLayout.this.D) {
                        gradientDrawable = gradientDrawable3;
                    }
                    gradientDrawable2 = new RippleDrawable(a2, gradientDrawable2, gradientDrawable);
                } else {
                    Drawable i3 = androidx.core.graphics.drawable.a.i(gradientDrawable3);
                    androidx.core.graphics.drawable.a.a(i3, a2);
                    gradientDrawable2 = new LayerDrawable(new Drawable[]{gradientDrawable2, i3});
                }
            }
            C1778vc.a((View) this, (Drawable) gradientDrawable2);
            TabLayout.this.invalidate();
        }

        /* access modifiers changed from: private */
        public void a(Canvas canvas) {
            Drawable drawable = this.g;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.g.draw(canvas);
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(f fVar) {
            if (fVar != this.a) {
                this.a = fVar;
                b();
            }
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            a((f) null);
            setSelected(false);
        }

        private void a(TextView textView, ImageView imageView) {
            f fVar = this.a;
            Drawable mutate = (fVar == null || fVar.b() == null) ? null : androidx.core.graphics.drawable.a.i(this.a.b()).mutate();
            f fVar2 = this.a;
            CharSequence d2 = fVar2 != null ? fVar2.d() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d2);
            if (textView != null) {
                if (z) {
                    textView.setText(d2);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText(null);
                }
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                int a2 = (!z || imageView.getVisibility() != 0) ? 0 : TabLayout.this.a(8);
                if (TabLayout.this.B) {
                    if (a2 != C0487bc.a(marginLayoutParams)) {
                        C0487bc.a(marginLayoutParams, a2);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (a2 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = a2;
                    C0487bc.a(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            f fVar3 = this.a;
            CharSequence a3 = fVar3 != null ? fVar3.d : null;
            if (z) {
                a3 = null;
            }
            va.a(this, a3);
        }

        private float a(Layout layout, int i2, float f2) {
            return layout.getLineWidth(i2) * (f2 / layout.getPaint().getTextSize());
        }
    }

    public static class i implements c {
        private final ViewPager a;

        public i(ViewPager viewPager) {
            this.a = viewPager;
        }

        public void a(f fVar) {
            this.a.setCurrentItem(fVar.c());
        }

        public void b(f fVar) {
        }

        public void c(f fVar) {
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    private h e(f fVar) {
        C0251Rb<h> rb = this.O;
        h hVar = rb != null ? (h) rb.a() : null;
        if (hVar == null) {
            hVar = new h(getContext());
        }
        hVar.a(fVar);
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.d)) {
            hVar.setContentDescription(fVar.c);
        } else {
            hVar.setContentDescription(fVar.d);
        }
        return hVar;
    }

    private LayoutParams f() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        a(layoutParams);
        return layoutParams;
    }

    private void g() {
        if (this.H == null) {
            this.H = new ValueAnimator();
            this.H.setInterpolator(Ez.b);
            this.H.setDuration((long) this.y);
            this.H.addUpdateListener(new a(this));
        }
    }

    private int getDefaultHeight() {
        int size = this.b.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            f fVar = (f) this.b.get(i2);
            if (fVar != null && fVar.b() != null && !TextUtils.isEmpty(fVar.d())) {
                z2 = true;
                break;
            }
            i2++;
        }
        return (!z2 || this.B) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i2 = this.t;
        if (i2 != -1) {
            return i2;
        }
        return this.A == 0 ? this.v : 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void h() {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((f) this.b.get(i2)).h();
        }
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.e.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.e.getChildAt(i3);
                boolean z2 = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z2 = false;
                }
                childAt.setActivated(z2);
                i3++;
            }
        }
    }

    public void addView(View view) {
        a(view);
    }

    public void b(b bVar) {
        this.F.remove(bVar);
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        d();
        androidx.viewpager.widget.a aVar = this.J;
        if (aVar != null) {
            int a2 = aVar.a();
            for (int i2 = 0; i2 < a2; i2++) {
                f b2 = b();
                b2.b(this.J.c(i2));
                a(b2, false);
            }
            ViewPager viewPager = this.I;
            if (viewPager != null && a2 > 0) {
                int currentItem = viewPager.getCurrentItem();
                if (currentItem != getSelectedTabPosition() && currentItem < getTabCount()) {
                    c(b(currentItem));
                }
            }
        }
    }

    public void d() {
        for (int childCount = this.e.getChildCount() - 1; childCount >= 0; childCount--) {
            d(childCount);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            it.remove();
            fVar.f();
            b(fVar);
        }
        this.c = null;
    }

    public int getSelectedTabPosition() {
        f fVar = this.c;
        if (fVar != null) {
            return fVar.c();
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.x;
    }

    public ColorStateList getTabIconTint() {
        return this.l;
    }

    public int getTabIndicatorGravity() {
        return this.z;
    }

    /* access modifiers changed from: 0000 */
    public int getTabMaxWidth() {
        return this.s;
    }

    public int getTabMode() {
        return this.A;
    }

    public ColorStateList getTabRippleColor() {
        return this.m;
    }

    public Drawable getTabSelectedIndicator() {
        return this.n;
    }

    public ColorStateList getTabTextColors() {
        return this.k;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.I == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                a((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.N) {
            setupWithViewPager(null);
            this.N = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i2 = 0; i2 < this.e.getChildCount(); i2++) {
            View childAt = this.e.getChildAt(i2);
            if (childAt instanceof h) {
                ((h) childAt).a(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int a2 = a(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE) {
            i3 = MeasureSpec.makeMeasureSpec(Math.min(a2, MeasureSpec.getSize(i3)), 1073741824);
        } else if (mode == 0) {
            i3 = MeasureSpec.makeMeasureSpec(a2, 1073741824);
        }
        int size = MeasureSpec.getSize(i2);
        if (MeasureSpec.getMode(i2) != 0) {
            int i4 = this.u;
            if (i4 <= 0) {
                i4 = size - a(56);
            }
            this.s = i4;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            boolean z2 = false;
            View childAt = getChildAt(0);
            int i5 = this.A;
            if (i5 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i5 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
                z2 = true;
            }
            if (z2) {
                childAt.measure(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    public void setInlineLabel(boolean z2) {
        if (this.B != z2) {
            this.B = z2;
            for (int i2 = 0; i2 < this.e.getChildCount(); i2++) {
                View childAt = this.e.getChildAt(i2);
                if (childAt instanceof h) {
                    ((h) childAt).c();
                }
            }
            e();
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(b bVar) {
        b bVar2 = this.E;
        if (bVar2 != null) {
            b(bVar2);
        }
        this.E = bVar;
        if (bVar != null) {
            a(bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setScrollAnimatorListener(AnimatorListener animatorListener) {
        g();
        this.H.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.n != drawable) {
            this.n = drawable;
            C1778vc.F(this.e);
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.e.a(i2);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.z != i2) {
            this.z = i2;
            C1778vc.F(this.e);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.e.b(i2);
    }

    public void setTabGravity(int i2) {
        if (this.x != i2) {
            this.x = i2;
            e();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            h();
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(C1437k.a(getContext(), i2));
    }

    public void setTabIndicatorFullWidth(boolean z2) {
        this.C = z2;
        C1778vc.F(this.e);
    }

    public void setTabMode(int i2) {
        if (i2 != this.A) {
            this.A = i2;
            e();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            for (int i2 = 0; i2 < this.e.getChildCount(); i2++) {
                View childAt = this.e.getChildAt(i2);
                if (childAt instanceof h) {
                    ((h) childAt).a(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(C1437k.a(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            h();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        a(aVar, false);
    }

    public void setUnboundedRipple(boolean z2) {
        if (this.D != z2) {
            this.D = z2;
            for (int i2 = 0; i2 < this.e.getChildCount(); i2++) {
                View childAt = this.e.getChildAt(i2);
                if (childAt instanceof h) {
                    ((h) childAt).a(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        a(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1771uz.tabStyle);
    }

    public void a(int i2, float f2, boolean z2) {
        a(i2, f2, z2, true);
    }

    public void addView(View view, int i2) {
        a(view);
    }

    public f b() {
        f a2 = a();
        a2.g = this;
        a2.h = e(a2);
        return a2;
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.b = new ArrayList<>();
        this.d = new RectF();
        this.s = BaseClientBuilder.API_PRIORITY_OTHER;
        this.F = new ArrayList<>();
        this.O = new C0255Sb(12);
        setHorizontalScrollBarEnabled(false);
        this.e = new e(context);
        super.addView(this.e, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray a2 = r.a(context, attributeSet, Dz.TabLayout, i2, Cz.Widget_Design_TabLayout, Dz.TabLayout_tabTextAppearance);
        this.e.b(a2.getDimensionPixelSize(Dz.TabLayout_tabIndicatorHeight, -1));
        this.e.a(a2.getColor(Dz.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(Uz.b(context, a2, Dz.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(a2.getInt(Dz.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(a2.getBoolean(Dz.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = a2.getDimensionPixelSize(Dz.TabLayout_tabPadding, 0);
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.f = a2.getDimensionPixelSize(Dz.TabLayout_tabPaddingStart, this.f);
        this.g = a2.getDimensionPixelSize(Dz.TabLayout_tabPaddingTop, this.g);
        this.h = a2.getDimensionPixelSize(Dz.TabLayout_tabPaddingEnd, this.h);
        this.i = a2.getDimensionPixelSize(Dz.TabLayout_tabPaddingBottom, this.i);
        this.j = a2.getResourceId(Dz.TabLayout_tabTextAppearance, Cz.TextAppearance_Design_Tab);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.j, C1406j.TextAppearance);
        try {
            this.p = (float) obtainStyledAttributes.getDimensionPixelSize(C1406j.TextAppearance_android_textSize, 0);
            this.k = Uz.a(context, obtainStyledAttributes, C1406j.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            if (a2.hasValue(Dz.TabLayout_tabTextColor)) {
                this.k = Uz.a(context, a2, Dz.TabLayout_tabTextColor);
            }
            if (a2.hasValue(Dz.TabLayout_tabSelectedTextColor)) {
                this.k = a(this.k.getDefaultColor(), a2.getColor(Dz.TabLayout_tabSelectedTextColor, 0));
            }
            this.l = Uz.a(context, a2, Dz.TabLayout_tabIconTint);
            this.o = s.a(a2.getInt(Dz.TabLayout_tabIconTintMode, -1), null);
            this.m = Uz.a(context, a2, Dz.TabLayout_tabRippleColor);
            this.y = a2.getInt(Dz.TabLayout_tabIndicatorAnimationDuration, 300);
            this.t = a2.getDimensionPixelSize(Dz.TabLayout_tabMinWidth, -1);
            this.u = a2.getDimensionPixelSize(Dz.TabLayout_tabMaxWidth, -1);
            this.r = a2.getResourceId(Dz.TabLayout_tabBackground, 0);
            this.w = a2.getDimensionPixelSize(Dz.TabLayout_tabContentStart, 0);
            this.A = a2.getInt(Dz.TabLayout_tabMode, 1);
            this.x = a2.getInt(Dz.TabLayout_tabGravity, 0);
            this.B = a2.getBoolean(Dz.TabLayout_tabInlineLabel, false);
            this.D = a2.getBoolean(Dz.TabLayout_tabUnboundedRipple, false);
            a2.recycle();
            Resources resources = getResources();
            this.q = (float) resources.getDimensionPixelSize(C1831wz.design_tab_text_size_2line);
            this.v = resources.getDimensionPixelSize(C1831wz.design_tab_scrollable_min_width);
            e();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void f(f fVar) {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            ((b) this.F.get(size)).c(fVar);
        }
    }

    private void h(f fVar) {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            ((b) this.F.get(size)).b(fVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, float f2, boolean z2, boolean z3) {
        int round = Math.round(((float) i2) + f2);
        if (round >= 0 && round < this.e.getChildCount()) {
            if (z3) {
                this.e.a(i2, f2);
            }
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.H.cancel();
            }
            scrollTo(a(i2, f2), 0);
            if (z2) {
                setSelectedTabView(round);
            }
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(C1437k.b(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    /* access modifiers changed from: protected */
    public boolean b(f fVar) {
        return a.a(fVar);
    }

    private void g(f fVar) {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            ((b) this.F.get(size)).a(fVar);
        }
    }

    public f b(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return (f) this.b.get(i2);
    }

    /* access modifiers changed from: 0000 */
    public void b(f fVar, boolean z2) {
        f fVar2 = this.c;
        if (fVar2 != fVar) {
            int c2 = fVar != null ? fVar.c() : -1;
            if (z2) {
                if ((fVar2 == null || fVar2.c() == -1) && c2 != -1) {
                    a(c2, 0.0f, true);
                } else {
                    c(c2);
                }
                if (c2 != -1) {
                    setSelectedTabView(c2);
                }
            }
            this.c = fVar;
            if (fVar2 != null) {
                h(fVar2);
            }
            if (fVar != null) {
                g(fVar);
            }
        } else if (fVar2 != null) {
            f(fVar);
            c(fVar.c());
        }
    }

    private void c(int i2) {
        if (i2 != -1) {
            if (getWindowToken() == null || !C1778vc.B(this) || this.e.a()) {
                a(i2, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int a2 = a(i2, 0.0f);
            if (scrollX != a2) {
                g();
                this.H.setIntValues(new int[]{scrollX, a2});
                this.H.start();
            }
            this.e.a(i2, this.y);
        }
    }

    private void d(f fVar) {
        this.e.addView(fVar.h, fVar.c(), f());
    }

    private void e() {
        C1778vc.b(this.e, this.A == 0 ? Math.max(0, this.w - this.f) : 0, 0, 0, 0);
        int i2 = this.A;
        if (i2 == 0) {
            this.e.setGravity(8388611);
        } else if (i2 == 1) {
            this.e.setGravity(1);
        }
        a(true);
    }

    public void a(f fVar) {
        a(fVar, this.b.isEmpty());
    }

    private void d(int i2) {
        h hVar = (h) this.e.getChildAt(i2);
        this.e.removeViewAt(i2);
        if (hVar != null) {
            hVar.a();
            this.O.a(hVar);
        }
        requestLayout();
    }

    public void a(f fVar, boolean z2) {
        a(fVar, this.b.size(), z2);
    }

    public void a(f fVar, int i2, boolean z2) {
        if (fVar.g == this) {
            a(fVar, i2);
            d(fVar);
            if (z2) {
                fVar.g();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    private void a(TabItem tabItem) {
        f b2 = b();
        CharSequence charSequence = tabItem.a;
        if (charSequence != null) {
            b2.b(charSequence);
        }
        Drawable drawable = tabItem.b;
        if (drawable != null) {
            b2.a(drawable);
        }
        int i2 = tabItem.c;
        if (i2 != 0) {
            b2.a(i2);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            b2.a(tabItem.getContentDescription());
        }
        a(b2);
    }

    /* access modifiers changed from: 0000 */
    public void c(f fVar) {
        b(fVar, true);
    }

    public void a(b bVar) {
        if (!this.F.contains(bVar)) {
            this.F.add(bVar);
        }
    }

    /* access modifiers changed from: protected */
    public f a() {
        f fVar = (f) a.a();
        return fVar == null ? new f() : fVar;
    }

    public void a(ViewPager viewPager, boolean z2) {
        a(viewPager, z2, false);
    }

    private void a(ViewPager viewPager, boolean z2, boolean z3) {
        ViewPager viewPager2 = this.I;
        if (viewPager2 != null) {
            g gVar = this.L;
            if (gVar != null) {
                viewPager2.b((androidx.viewpager.widget.ViewPager.e) gVar);
            }
            a aVar = this.M;
            if (aVar != null) {
                this.I.b((androidx.viewpager.widget.ViewPager.d) aVar);
            }
        }
        b bVar = this.G;
        if (bVar != null) {
            b(bVar);
            this.G = null;
        }
        if (viewPager != null) {
            this.I = viewPager;
            if (this.L == null) {
                this.L = new g(this);
            }
            this.L.a();
            viewPager.a((androidx.viewpager.widget.ViewPager.e) this.L);
            this.G = new i(viewPager);
            a(this.G);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                a(adapter, z2);
            }
            if (this.M == null) {
                this.M = new a();
            }
            this.M.a(z2);
            viewPager.a((androidx.viewpager.widget.ViewPager.d) this.M);
            a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.I = null;
            a((androidx.viewpager.widget.a) null, false);
        }
        this.N = z3;
    }

    /* access modifiers changed from: 0000 */
    public void a(androidx.viewpager.widget.a aVar, boolean z2) {
        androidx.viewpager.widget.a aVar2 = this.J;
        if (aVar2 != null) {
            DataSetObserver dataSetObserver = this.K;
            if (dataSetObserver != null) {
                aVar2.c(dataSetObserver);
            }
        }
        this.J = aVar;
        if (z2 && aVar != null) {
            if (this.K == null) {
                this.K = new d();
            }
            aVar.a(this.K);
        }
        c();
    }

    private void a(f fVar, int i2) {
        fVar.b(i2);
        this.b.add(i2, fVar);
        int size = this.b.size();
        while (true) {
            i2++;
            if (i2 < size) {
                ((f) this.b.get(i2)).b(i2);
            } else {
                return;
            }
        }
    }

    private void a(View view) {
        if (view instanceof TabItem) {
            a((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void a(LayoutParams layoutParams) {
        if (this.A == 1 && this.x == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    /* access modifiers changed from: 0000 */
    public int a(int i2) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i2));
    }

    private int a(int i2, float f2) {
        int i3 = 0;
        if (this.A != 0) {
            return 0;
        }
        View childAt = this.e.getChildAt(i2);
        int i4 = i2 + 1;
        View childAt2 = i4 < this.e.getChildCount() ? this.e.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f2);
        return C1778vc.l(this) == 0 ? left + i5 : left - i5;
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z2) {
        for (int i2 = 0; i2 < this.e.getChildCount(); i2++) {
            View childAt = this.e.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            a((LayoutParams) childAt.getLayoutParams());
            if (z2) {
                childAt.requestLayout();
            }
        }
    }

    private static ColorStateList a(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }
}
