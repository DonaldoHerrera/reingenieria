package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.D;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.v;
import androidx.appcompat.widget.ActionMenuView.d;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private int A;
    private boolean B;
    private boolean C;
    private final ArrayList<View> D;
    private final ArrayList<View> E;
    private final int[] F;
    b G;
    private final d H;
    private ua I;
    private ActionMenuPresenter J;
    private a K;
    private androidx.appcompat.view.menu.v.a L;
    private androidx.appcompat.view.menu.l.a M;
    private boolean N;
    private final Runnable O;
    private ActionMenuView a;
    private TextView b;
    private TextView c;
    private ImageButton d;
    private ImageView e;
    private Drawable f;
    private CharSequence g;
    ImageButton h;
    View i;
    private Context j;
    private int k;
    private int l;
    private int m;
    int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private Q t;
    private int u;
    private int v;
    private int w;
    private CharSequence x;
    private CharSequence y;
    private int z;

    public static class LayoutParams extends androidx.appcompat.app.ActionBar.LayoutParams {
        int b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        /* access modifiers changed from: 0000 */
        public void a(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.b = 0;
            this.a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((androidx.appcompat.app.ActionBar.LayoutParams) layoutParams);
            this.b = 0;
            this.b = layoutParams.b;
        }

        public LayoutParams(androidx.appcompat.app.ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super((android.view.ViewGroup.LayoutParams) marginLayoutParams);
            this.b = 0;
            a(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ra();
        int c;
        boolean d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private class a implements v {
        l a;
        p b;

        a() {
        }

        public Parcelable a() {
            return null;
        }

        public void a(Context context, l lVar) {
            l lVar2 = this.a;
            if (lVar2 != null) {
                p pVar = this.b;
                if (pVar != null) {
                    lVar2.a(pVar);
                }
            }
            this.a = lVar;
        }

        public void a(Parcelable parcelable) {
        }

        public void a(l lVar, boolean z) {
        }

        public boolean a(D d) {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean b(l lVar, p pVar) {
            View view = Toolbar.this.i;
            if (view instanceof C1742u) {
                ((C1742u) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.i = null;
            toolbar3.a();
            this.b = null;
            Toolbar.this.requestLayout();
            pVar.a(false);
            return true;
        }

        public int getId() {
            return 0;
        }

        public void a(boolean z) {
            if (this.b != null) {
                l lVar = this.a;
                boolean z2 = false;
                if (lVar != null) {
                    int size = lVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.a.getItem(i) == this.b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    b(this.a, this.b);
                }
            }
        }

        public boolean a(l lVar, p pVar) {
            Toolbar.this.e();
            ViewParent parent = Toolbar.this.h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.h);
            }
            Toolbar.this.i = pVar.getActionView();
            this.b = pVar;
            ViewParent parent2 = Toolbar.this.i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.i);
                }
                LayoutParams generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.a = 8388611 | (toolbar4.n & 112);
                generateDefaultLayoutParams.b = 2;
                toolbar4.i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.i);
            }
            Toolbar.this.j();
            Toolbar.this.requestLayout();
            pVar.a(true);
            View view = Toolbar.this.i;
            if (view instanceof C1742u) {
                ((C1742u) view).onActionViewExpanded();
            }
            return true;
        }
    }

    public interface b {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        return new C1862y(getContext());
    }

    private void l() {
        if (this.t == null) {
            this.t = new Q();
        }
    }

    private void m() {
        if (this.e == null) {
            this.e = new AppCompatImageView(getContext());
        }
    }

    private void n() {
        o();
        if (this.a.h() == null) {
            l lVar = (l) this.a.getMenu();
            if (this.K == null) {
                this.K = new a();
            }
            this.a.setExpandedActionViewsExclusive(true);
            lVar.a((v) this.K, this.j);
        }
    }

    private void o() {
        if (this.a == null) {
            this.a = new ActionMenuView(getContext());
            this.a.setPopupTheme(this.k);
            this.a.setOnMenuItemClickListener(this.H);
            this.a.a(this.L, this.M);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388613 | (this.n & 112);
            this.a.setLayoutParams(generateDefaultLayoutParams);
            a((View) this.a, false);
        }
    }

    private void p() {
        if (this.d == null) {
            this.d = new AppCompatImageButton(getContext(), null, C0294a.toolbarNavigationButtonStyle);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.n & 112);
            this.d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private void q() {
        removeCallbacks(this.O);
        post(this.O);
    }

    private boolean r() {
        if (!this.N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (d(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public void a(l lVar, ActionMenuPresenter actionMenuPresenter) {
        if (lVar != null || this.a != null) {
            o();
            l h2 = this.a.h();
            if (h2 != lVar) {
                if (h2 != null) {
                    h2.b((v) this.J);
                    h2.b((v) this.K);
                }
                if (this.K == null) {
                    this.K = new a();
                }
                actionMenuPresenter.c(true);
                if (lVar != null) {
                    lVar.a((v) actionMenuPresenter, this.j);
                    lVar.a((v) this.K, this.j);
                } else {
                    actionMenuPresenter.a(this.j, (l) null);
                    this.K.a(this.j, (l) null);
                    actionMenuPresenter.a(true);
                    this.K.a(true);
                }
                this.a.setPopupTheme(this.k);
                this.a.setPresenter(actionMenuPresenter);
                this.J = actionMenuPresenter;
            }
        }
    }

    public boolean b() {
        if (getVisibility() == 0) {
            ActionMenuView actionMenuView = this.a;
            if (actionMenuView != null && actionMenuView.g()) {
                return true;
            }
        }
        return false;
    }

    public void c() {
        a aVar = this.K;
        p pVar = aVar == null ? null : aVar.b;
        if (pVar != null) {
            pVar.collapseActionView();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void d() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            actionMenuView.b();
        }
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        if (this.h == null) {
            this.h = new AppCompatImageButton(getContext(), null, C0294a.toolbarNavigationButtonStyle);
            this.h.setImageDrawable(this.f);
            this.h.setContentDescription(this.g);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.n & 112);
            generateDefaultLayoutParams.b = 2;
            this.h.setLayoutParams(generateDefaultLayoutParams);
            this.h.setOnClickListener(new qa(this));
        }
    }

    public boolean f() {
        a aVar = this.K;
        return (aVar == null || aVar.b == null) ? false : true;
    }

    public boolean g() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.d();
    }

    public int getContentInsetEnd() {
        Q q2 = this.t;
        if (q2 != null) {
            return q2.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Q q2 = this.t;
        if (q2 != null) {
            return q2.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        Q q2 = this.t;
        if (q2 != null) {
            return q2.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        Q q2 = this.t;
        if (q2 != null) {
            return q2.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    public int getCurrentContentInsetEnd() {
        boolean z2;
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            l h2 = actionMenuView.h();
            if (h2 != null && h2.hasVisibleItems()) {
                z2 = true;
                if (!z2) {
                    return Math.max(getContentInsetEnd(), Math.max(this.v, 0));
                }
                return getContentInsetEnd();
            }
        }
        z2 = false;
        if (!z2) {
        }
    }

    public int getCurrentContentInsetLeft() {
        if (C1778vc.l(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C1778vc.l(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.u, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        n();
        return this.a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.J;
    }

    public Drawable getOverflowIcon() {
        n();
        return this.a.getOverflowIcon();
    }

    /* access modifiers changed from: 0000 */
    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    public D getWrapper() {
        if (this.I == null) {
            this.I = new ua(this, true);
        }
        return this.I;
    }

    public boolean h() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.e();
    }

    public boolean i() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.f();
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((LayoutParams) childAt.getLayoutParams()).b == 2 || childAt == this.a)) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    public boolean k() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.i();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a6 A[LOOP:0: B:101:0x02a4->B:102:0x02a6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c8 A[LOOP:1: B:104:0x02c6->B:105:0x02c8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0302 A[LOOP:2: B:112:0x0300->B:113:0x0302, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022c  */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        boolean d2;
        boolean d3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int size;
        int i15;
        int i16;
        int size2;
        int i17;
        int i18;
        int size3;
        boolean z3;
        int i19;
        int i20;
        boolean z4;
        int i21;
        int i22;
        int i23;
        int i24;
        char c2;
        int i25;
        int i26;
        boolean z5 = C1778vc.l(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i27 = width - paddingRight;
        int[] iArr = this.F;
        iArr[1] = 0;
        iArr[0] = 0;
        int m2 = C1778vc.m(this);
        int min = m2 >= 0 ? Math.min(m2, i5 - i3) : 0;
        if (!d(this.d)) {
            i7 = paddingLeft;
        } else if (z5) {
            i6 = b(this.d, i27, iArr, min);
            i7 = paddingLeft;
            if (d(this.h)) {
                if (z5) {
                    i6 = b(this.h, i6, iArr, min);
                } else {
                    i7 = a(this.h, i7, iArr, min);
                }
            }
            if (d(this.a)) {
                if (z5) {
                    i7 = a(this.a, i7, iArr, min);
                } else {
                    i6 = b(this.a, i6, iArr, min);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - i7);
            iArr[1] = Math.max(0, currentContentInsetRight - (i27 - i6));
            int max = Math.max(i7, currentContentInsetLeft);
            int min2 = Math.min(i6, i27 - currentContentInsetRight);
            if (d(this.i)) {
                if (z5) {
                    min2 = b(this.i, min2, iArr, min);
                } else {
                    max = a(this.i, max, iArr, min);
                }
            }
            if (d(this.e)) {
                if (z5) {
                    min2 = b(this.e, min2, iArr, min);
                } else {
                    max = a(this.e, max, iArr, min);
                }
            }
            d2 = d(this.b);
            d3 = d(this.c);
            if (!d2) {
                LayoutParams layoutParams = (LayoutParams) this.b.getLayoutParams();
                i9 = paddingRight;
                i10 = layoutParams.topMargin + this.b.getMeasuredHeight() + layoutParams.bottomMargin + 0;
            } else {
                i9 = paddingRight;
                i10 = 0;
            }
            if (!d3) {
                LayoutParams layoutParams2 = (LayoutParams) this.c.getLayoutParams();
                i11 = width;
                i10 += layoutParams2.topMargin + this.c.getMeasuredHeight() + layoutParams2.bottomMargin;
            } else {
                i11 = width;
            }
            if (!d2 || d3) {
                LayoutParams layoutParams3 = (LayoutParams) (!d2 ? this.b : this.c).getLayoutParams();
                LayoutParams layoutParams4 = (LayoutParams) (!d3 ? this.c : this.b).getLayoutParams();
                if ((d2 || this.b.getMeasuredWidth() <= 0) && (!d3 || this.c.getMeasuredWidth() <= 0)) {
                    i13 = paddingLeft;
                    z3 = false;
                } else {
                    i13 = paddingLeft;
                    z3 = true;
                }
                i19 = this.w & 112;
                i12 = min;
                if (i19 != 48) {
                    i20 = max;
                    z4 = d3;
                    i21 = getPaddingTop() + layoutParams3.topMargin + this.r;
                } else if (i19 != 80) {
                    int i28 = (((height - paddingTop) - paddingBottom) - i10) / 2;
                    int i29 = layoutParams3.topMargin;
                    i20 = max;
                    int i30 = this.r;
                    z4 = d3;
                    if (i28 < i29 + i30) {
                        i28 = i29 + i30;
                    } else {
                        int i31 = (((height - paddingBottom) - i10) - i28) - paddingTop;
                        int i32 = layoutParams3.bottomMargin;
                        int i33 = this.s;
                        if (i31 < i32 + i33) {
                            i28 = Math.max(0, i28 - ((layoutParams4.bottomMargin + i33) - i31));
                        }
                    }
                    i21 = paddingTop + i28;
                } else {
                    i20 = max;
                    z4 = d3;
                    i21 = (((height - paddingBottom) - layoutParams4.bottomMargin) - this.s) - i10;
                }
                if (!z5) {
                    if (z3) {
                        i24 = this.p;
                        c2 = 1;
                    } else {
                        c2 = 1;
                        i24 = 0;
                    }
                    int i34 = i24 - iArr[c2];
                    i8 -= Math.max(0, i34);
                    iArr[c2] = Math.max(0, -i34);
                    if (d2) {
                        LayoutParams layoutParams5 = (LayoutParams) this.b.getLayoutParams();
                        int measuredWidth = i8 - this.b.getMeasuredWidth();
                        int measuredHeight = this.b.getMeasuredHeight() + i21;
                        this.b.layout(measuredWidth, i21, i8, measuredHeight);
                        i25 = measuredWidth - this.q;
                        i21 = measuredHeight + layoutParams5.bottomMargin;
                    } else {
                        i25 = i8;
                    }
                    if (z4) {
                        LayoutParams layoutParams6 = (LayoutParams) this.c.getLayoutParams();
                        int i35 = i21 + layoutParams6.topMargin;
                        this.c.layout(i8 - this.c.getMeasuredWidth(), i35, i8, this.c.getMeasuredHeight() + i35);
                        i26 = i8 - this.q;
                        int i36 = layoutParams6.bottomMargin;
                    } else {
                        i26 = i8;
                    }
                    if (z3) {
                        i8 = Math.min(i25, i26);
                    }
                    max = i20;
                } else {
                    i14 = 0;
                    int i37 = (z3 ? this.p : 0) - iArr[0];
                    max = i20 + Math.max(0, i37);
                    iArr[0] = Math.max(0, -i37);
                    if (d2) {
                        LayoutParams layoutParams7 = (LayoutParams) this.b.getLayoutParams();
                        int measuredWidth2 = this.b.getMeasuredWidth() + max;
                        int measuredHeight2 = this.b.getMeasuredHeight() + i21;
                        this.b.layout(max, i21, measuredWidth2, measuredHeight2);
                        i22 = measuredWidth2 + this.q;
                        i21 = measuredHeight2 + layoutParams7.bottomMargin;
                    } else {
                        i22 = max;
                    }
                    if (z4) {
                        LayoutParams layoutParams8 = (LayoutParams) this.c.getLayoutParams();
                        int i38 = i21 + layoutParams8.topMargin;
                        int measuredWidth3 = this.c.getMeasuredWidth() + max;
                        this.c.layout(max, i38, measuredWidth3, this.c.getMeasuredHeight() + i38);
                        i23 = measuredWidth3 + this.q;
                        int i39 = layoutParams8.bottomMargin;
                    } else {
                        i23 = max;
                    }
                    if (z3) {
                        max = Math.max(i22, i23);
                    }
                    a((List<View>) this.D, 3);
                    size = this.D.size();
                    i15 = max;
                    for (i16 = 0; i16 < size; i16++) {
                        i15 = a((View) this.D.get(i16), i15, iArr, i12);
                    }
                    int i40 = i12;
                    a((List<View>) this.D, 5);
                    size2 = this.D.size();
                    for (i17 = 0; i17 < size2; i17++) {
                        i8 = b((View) this.D.get(i17), i8, iArr, i40);
                    }
                    a((List<View>) this.D, 1);
                    int a2 = a((List<View>) this.D, iArr);
                    i18 = (i13 + (((i11 - i13) - i9) / 2)) - (a2 / 2);
                    int i41 = a2 + i18;
                    if (i18 >= i15) {
                        i15 = i41 > i8 ? i18 - (i41 - i8) : i18;
                    }
                    size3 = this.D.size();
                    while (i14 < size3) {
                        i15 = a((View) this.D.get(i14), i15, iArr, i40);
                        i14++;
                    }
                    this.D.clear();
                    return;
                }
            } else {
                i13 = paddingLeft;
                i12 = min;
            }
            i14 = 0;
            a((List<View>) this.D, 3);
            size = this.D.size();
            i15 = max;
            while (i16 < size) {
            }
            int i402 = i12;
            a((List<View>) this.D, 5);
            size2 = this.D.size();
            while (i17 < size2) {
            }
            a((List<View>) this.D, 1);
            int a22 = a((List<View>) this.D, iArr);
            i18 = (i13 + (((i11 - i13) - i9) / 2)) - (a22 / 2);
            int i412 = a22 + i18;
            if (i18 >= i15) {
            }
            size3 = this.D.size();
            while (i14 < size3) {
            }
            this.D.clear();
            return;
        } else {
            i7 = a(this.d, paddingLeft, iArr, min);
        }
        i6 = i27;
        if (d(this.h)) {
        }
        if (d(this.a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i7);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i27 - i6));
        int max2 = Math.max(i7, currentContentInsetLeft2);
        int min22 = Math.min(i6, i27 - currentContentInsetRight2);
        if (d(this.i)) {
        }
        if (d(this.e)) {
        }
        d2 = d(this.b);
        d3 = d(this.c);
        if (!d2) {
        }
        if (!d3) {
        }
        if (!d2) {
        }
        LayoutParams layoutParams32 = (LayoutParams) (!d2 ? this.b : this.c).getLayoutParams();
        LayoutParams layoutParams42 = (LayoutParams) (!d3 ? this.c : this.b).getLayoutParams();
        if (d2) {
        }
        i13 = paddingLeft;
        z3 = false;
        i19 = this.w & 112;
        i12 = min;
        if (i19 != 48) {
        }
        if (!z5) {
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.F;
        if (Ba.a(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c3 = 0;
            c2 = 1;
        }
        if (d(this.d)) {
            a((View) this.d, i2, 0, i3, 0, this.o);
            i6 = this.d.getMeasuredWidth() + a((View) this.d);
            i5 = Math.max(0, this.d.getMeasuredHeight() + b((View) this.d));
            i4 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (d(this.h)) {
            a((View) this.h, i2, 0, i3, 0, this.o);
            i6 = this.h.getMeasuredWidth() + a((View) this.h);
            i5 = Math.max(i5, this.h.getMeasuredHeight() + b((View) this.h));
            i4 = View.combineMeasuredStates(i4, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i6);
        iArr[c3] = Math.max(0, currentContentInsetStart - i6);
        if (d(this.a)) {
            a((View) this.a, i2, max, i3, 0, this.o);
            i7 = this.a.getMeasuredWidth() + a((View) this.a);
            i5 = Math.max(i5, this.a.getMeasuredHeight() + b((View) this.a));
            i4 = View.combineMeasuredStates(i4, this.a.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i7);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (d(this.i)) {
            max2 += a(this.i, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.i.getMeasuredHeight() + b(this.i));
            i4 = View.combineMeasuredStates(i4, this.i.getMeasuredState());
        }
        if (d(this.e)) {
            max2 += a((View) this.e, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.e.getMeasuredHeight() + b((View) this.e));
            i4 = View.combineMeasuredStates(i4, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        int i11 = i5;
        int i12 = max2;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((LayoutParams) childAt.getLayoutParams()).b == 0 && d(childAt)) {
                i12 += a(childAt, i2, i12, i3, 0, iArr);
                i11 = Math.max(i11, childAt.getMeasuredHeight() + b(childAt));
                i4 = View.combineMeasuredStates(i4, childAt.getMeasuredState());
            }
        }
        int i14 = this.r + this.s;
        int i15 = this.p + this.q;
        if (d(this.b)) {
            a((View) this.b, i2, i12 + i15, i3, i14, iArr);
            int measuredWidth = this.b.getMeasuredWidth() + a((View) this.b);
            i8 = this.b.getMeasuredHeight() + b((View) this.b);
            i10 = View.combineMeasuredStates(i4, this.b.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i10 = i4;
            i9 = 0;
            i8 = 0;
        }
        if (d(this.c)) {
            int i16 = i8 + i14;
            int i17 = i10;
            i9 = Math.max(i9, a((View) this.c, i2, i12 + i15, i3, i16, iArr));
            i8 += this.c.getMeasuredHeight() + b((View) this.c);
            i10 = View.combineMeasuredStates(i17, this.c.getMeasuredState());
        } else {
            int i18 = i10;
        }
        int i19 = i12 + i9;
        int max3 = Math.max(i11, i8) + getPaddingTop() + getPaddingBottom();
        int i20 = i2;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(i19 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i20, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (r()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.a;
        l h2 = actionMenuView != null ? actionMenuView.h() : null;
        int i2 = savedState.c;
        if (!(i2 == 0 || this.K == null || h2 == null)) {
            MenuItem findItem = h2.findItem(i2);
            if (findItem != null) {
                findItem.expandActionView();
            }
        }
        if (savedState.d) {
            q();
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        l();
        Q q2 = this.t;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        q2.a(z2);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        a aVar = this.K;
        if (aVar != null) {
            p pVar = aVar.b;
            if (pVar != null) {
                savedState.c = pVar.getItemId();
            }
        }
        savedState.d = i();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public void setCollapsible(boolean z2) {
        this.N = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.v) {
            this.v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.u) {
            this.u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(C1437k.b(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(C1437k.b(getContext(), i2));
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        p();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(b bVar) {
        this.G = bVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        n();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.k != i2) {
            this.k = i2;
            if (i2 == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        this.A = i2;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        this.z = i2;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0294a.toolbarStyle);
    }

    public void b(Context context, int i2) {
        this.l = i2;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m();
            if (!c(this.e)) {
                a((View) this.e, true);
            }
        } else {
            ImageView imageView = this.e;
            if (imageView != null && c(imageView)) {
                removeView(this.e);
                this.E.remove(this.e);
            }
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            p();
        }
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            p();
            if (!c(this.d)) {
                a((View) this.d, true);
            }
        } else {
            ImageButton imageButton = this.d;
            if (imageButton != null && c(imageButton)) {
                removeView(this.d);
                this.E.remove(this.d);
            }
        }
        ImageButton imageButton2 = this.d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                this.c = new AppCompatTextView(context);
                this.c.setSingleLine();
                this.c.setEllipsize(TruncateAt.END);
                int i2 = this.m;
                if (i2 != 0) {
                    this.c.setTextAppearance(context, i2);
                }
                int i3 = this.A;
                if (i3 != 0) {
                    this.c.setTextColor(i3);
                }
            }
            if (!c(this.c)) {
                a((View) this.c, true);
            }
        } else {
            TextView textView = this.c;
            if (textView != null && c(textView)) {
                removeView(this.c);
                this.E.remove(this.c);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.b == null) {
                Context context = getContext();
                this.b = new AppCompatTextView(context);
                this.b.setSingleLine();
                this.b.setEllipsize(TruncateAt.END);
                int i2 = this.l;
                if (i2 != 0) {
                    this.b.setTextAppearance(context, i2);
                }
                int i3 = this.z;
                if (i3 != 0) {
                    this.b.setTextColor(i3);
                }
            }
            if (!c(this.b)) {
                a((View) this.b, true);
            }
        } else {
            TextView textView = this.b;
            if (textView != null && c(textView)) {
                removeView(this.b);
                this.E.remove(this.b);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.x = charSequence;
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.H = new oa(this);
        this.O = new pa(this);
        na a2 = na.a(getContext(), attributeSet, C1406j.Toolbar, i2, 0);
        this.l = a2.g(C1406j.Toolbar_titleTextAppearance, 0);
        this.m = a2.g(C1406j.Toolbar_subtitleTextAppearance, 0);
        this.w = a2.e(C1406j.Toolbar_android_gravity, this.w);
        this.n = a2.e(C1406j.Toolbar_buttonGravity, 48);
        int b2 = a2.b(C1406j.Toolbar_titleMargin, 0);
        if (a2.g(C1406j.Toolbar_titleMargins)) {
            b2 = a2.b(C1406j.Toolbar_titleMargins, b2);
        }
        this.s = b2;
        this.r = b2;
        this.q = b2;
        this.p = b2;
        int b3 = a2.b(C1406j.Toolbar_titleMarginStart, -1);
        if (b3 >= 0) {
            this.p = b3;
        }
        int b4 = a2.b(C1406j.Toolbar_titleMarginEnd, -1);
        if (b4 >= 0) {
            this.q = b4;
        }
        int b5 = a2.b(C1406j.Toolbar_titleMarginTop, -1);
        if (b5 >= 0) {
            this.r = b5;
        }
        int b6 = a2.b(C1406j.Toolbar_titleMarginBottom, -1);
        if (b6 >= 0) {
            this.s = b6;
        }
        this.o = a2.c(C1406j.Toolbar_maxButtonHeight, -1);
        int b7 = a2.b(C1406j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int b8 = a2.b(C1406j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int c2 = a2.c(C1406j.Toolbar_contentInsetLeft, 0);
        int c3 = a2.c(C1406j.Toolbar_contentInsetRight, 0);
        l();
        this.t.a(c2, c3);
        if (!(b7 == Integer.MIN_VALUE && b8 == Integer.MIN_VALUE)) {
            this.t.b(b7, b8);
        }
        this.u = a2.b(C1406j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.v = a2.b(C1406j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f = a2.b(C1406j.Toolbar_collapseIcon);
        this.g = a2.e(C1406j.Toolbar_collapseContentDescription);
        CharSequence e2 = a2.e(C1406j.Toolbar_title);
        if (!TextUtils.isEmpty(e2)) {
            setTitle(e2);
        }
        CharSequence e3 = a2.e(C1406j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(e3)) {
            setSubtitle(e3);
        }
        this.j = getContext();
        setPopupTheme(a2.g(C1406j.Toolbar_popupTheme, 0));
        Drawable b9 = a2.b(C1406j.Toolbar_navigationIcon);
        if (b9 != null) {
            setNavigationIcon(b9);
        }
        CharSequence e4 = a2.e(C1406j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(e4)) {
            setNavigationContentDescription(e4);
        }
        Drawable b10 = a2.b(C1406j.Toolbar_logo);
        if (b10 != null) {
            setLogo(b10);
        }
        CharSequence e5 = a2.e(C1406j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(e5)) {
            setLogoDescription(e5);
        }
        if (a2.g(C1406j.Toolbar_titleTextColor)) {
            setTitleTextColor(a2.a(C1406j.Toolbar_titleTextColor, -1));
        }
        if (a2.g(C1406j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a2.a(C1406j.Toolbar_subtitleTextColor, -1));
        }
        a2.a();
    }

    private boolean c(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    private boolean d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof androidx.appcompat.app.ActionBar.LayoutParams) {
            return new LayoutParams((androidx.appcompat.app.ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    private int b(View view, int i2, int[] iArr, int i3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i4 = layoutParams.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (measuredWidth + layoutParams.leftMargin);
    }

    private int b(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.w & 112;
    }

    private int b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public void a(Context context, int i2) {
        this.m = i2;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void a(int i2, int i3) {
        l();
        this.t.b(i2, i3);
    }

    private void a(View view, boolean z2) {
        LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.b = 1;
        if (!z2 || this.i == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.E.add(view);
    }

    private void a(View view, int i2, int i3, int i4, int i5, int i6) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private int a(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private int a(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = i3;
        int i5 = i2;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            View view = (View) list.get(i6);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i8 = layoutParams.leftMargin - i5;
            int i9 = layoutParams.rightMargin - i4;
            int max = Math.max(0, i8);
            int max2 = Math.max(0, i9);
            int max3 = Math.max(0, -i8);
            i7 += max + view.getMeasuredWidth() + max2;
            i6++;
            i4 = Math.max(0, -i9);
            i5 = max3;
        }
        return i7;
    }

    private int a(View view, int i2, int[] iArr, int i3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i4 = layoutParams.leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return max + measuredWidth + layoutParams.rightMargin;
    }

    private int a(View view, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int b2 = b(layoutParams.a);
        if (b2 == 48) {
            return getPaddingTop() - i3;
        }
        if (b2 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = layoutParams.topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = layoutParams.bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    private void a(List<View> list, int i2) {
        boolean z2 = C1778vc.l(this) == 1;
        int childCount = getChildCount();
        int a2 = C0287Zb.a(i2, C1778vc.l(this));
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.b == 0 && d(childAt) && a(layoutParams.a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.b == 0 && d(childAt2) && a(layoutParams2.a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private int a(int i2) {
        int l2 = C1778vc.l(this);
        int a2 = C0287Zb.a(i2, l2) & 7;
        if (a2 != 1) {
            int i3 = 3;
            if (!(a2 == 3 || a2 == 5)) {
                if (l2 == 1) {
                    i3 = 5;
                }
                return i3;
            }
        }
        return a2;
    }

    private int a(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return C0487bc.b(marginLayoutParams) + C0487bc.a(marginLayoutParams);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            addView((View) this.E.get(size));
        }
        this.E.clear();
    }

    public void a(androidx.appcompat.view.menu.v.a aVar, androidx.appcompat.view.menu.l.a aVar2) {
        this.L = aVar;
        this.M = aVar2;
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            actionMenuView.a(aVar, aVar2);
        }
    }
}
