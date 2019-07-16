package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.widget.h;
import java.lang.reflect.Field;

/* compiled from: DropDownListView */
class F extends ListView {
    private final Rect a = new Rect();
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f;
    private Field g;
    private a h;
    private boolean i;
    private boolean j;
    private boolean k;
    private Ec l;
    private h m;
    b n;

    /* compiled from: DropDownListView */
    private static class a extends C1592p {
        private boolean b = true;

        a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: 0000 */
        public void a(boolean z) {
            this.b = z;
        }

        public void draw(Canvas canvas) {
            if (this.b) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.b) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.b) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* compiled from: DropDownListView */
    private class b implements Runnable {
        b() {
        }

        public void a() {
            F f = F.this;
            f.n = null;
            f.removeCallbacks(this);
        }

        public void b() {
            F.this.post(this);
        }

        public void run() {
            F f = F.this;
            f.n = null;
            f.drawableStateChanged();
        }
    }

    F(Context context, boolean z) {
        super(context, null, C0294a.dropDownListViewStyle);
        this.j = z;
        setCacheColorHint(0);
        try {
            this.g = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.g.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void b(int i2, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i2 == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        a(i2, view);
        if (z2) {
            Rect rect = this.a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            androidx.core.graphics.drawable.a.a(selector, exactCenterX, exactCenterY);
        }
    }

    private void c() {
        Drawable selector = getSelector();
        if (selector != null && b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    public int a(int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i8 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i9 = i8;
        View view = null;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            if (i13 > 0) {
                i7 = MeasureSpec.makeMeasureSpec(i13, 1073741824);
            } else {
                i7 = MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i2, i7);
            view.forceLayout();
            if (i12 > 0) {
                i9 += dividerHeight;
            }
            i9 += view.getMeasuredHeight();
            if (i9 >= i5) {
                if (i6 >= 0 && i12 > i6 && i11 > 0 && i9 != i5) {
                    i5 = i11;
                }
                return i5;
            }
            if (i6 >= 0 && i12 >= i6) {
                i11 = i9;
            }
        }
        return i9;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        a(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.n == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            c();
        }
    }

    public boolean hasFocus() {
        return this.j || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.j || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.j || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.j && this.i) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.n = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.n == null) {
            this.n = new b();
            this.n.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.n;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    public void setListSelectionHidden(boolean z) {
        this.i = z;
    }

    public void setSelector(Drawable drawable) {
        this.h = drawable != null ? new a(drawable) : null;
        super.setSelector(this.h);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.b = rect.left;
        this.c = rect.top;
        this.d = rect.right;
        this.e = rect.bottom;
    }

    private boolean b() {
        return this.k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    public boolean a(MotionEvent motionEvent, int i2) {
        boolean z;
        boolean z2;
        int findPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z2 = false;
            findPointerIndex = motionEvent.findPointerIndex(i2);
            if (findPointerIndex >= 0) {
            }
            z = false;
            z2 = false;
            a();
            if (!z2) {
            }
            return z2;
        } else if (actionMasked == 2) {
            z2 = true;
            findPointerIndex = motionEvent.findPointerIndex(i2);
            if (findPointerIndex >= 0) {
                int x = (int) motionEvent.getX(findPointerIndex);
                int y = (int) motionEvent.getY(findPointerIndex);
                int pointToPosition = pointToPosition(x, y);
                if (pointToPosition == -1) {
                    z = true;
                    if (!z2 || z) {
                        a();
                    }
                    if (!z2) {
                        if (this.m == null) {
                            this.m = new h(this);
                        }
                        this.m.a(true);
                        this.m.onTouch(this, motionEvent);
                    } else {
                        h hVar = this.m;
                        if (hVar != null) {
                            hVar.a(false);
                        }
                    }
                    return z2;
                }
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                a(childAt, pointToPosition, (float) x, (float) y);
                if (actionMasked == 1) {
                    a(childAt, pointToPosition);
                }
            }
            z = false;
            z2 = false;
            a();
            if (!z2) {
            }
            return z2;
        }
        z = false;
        z2 = true;
        a();
        if (!z2) {
        }
        return z2;
    }

    private void a(View view, int i2) {
        performItemClick(view, i2, getItemIdAtPosition(i2));
    }

    private void a(Canvas canvas) {
        if (!this.a.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.a);
                selector.draw(canvas);
            }
        }
    }

    private void a(int i2, View view, float f2, float f3) {
        b(i2, view);
        Drawable selector = getSelector();
        if (selector != null && i2 != -1) {
            androidx.core.graphics.drawable.a.a(selector, f2, f3);
        }
    }

    private void a(int i2, View view) {
        Rect rect = this.a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.b;
        rect.top -= this.c;
        rect.right += this.d;
        rect.bottom += this.e;
        try {
            boolean z = this.g.getBoolean(this);
            if (view.isEnabled() != z) {
                this.g.set(this, Boolean.valueOf(!z));
                if (i2 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    private void a() {
        this.k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        Ec ec = this.l;
        if (ec != null) {
            ec.a();
            this.l = null;
        }
    }

    private void a(View view, int i2, float f2, float f3) {
        this.k = true;
        if (VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f2, f3);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f;
        if (i3 != -1) {
            View childAt = getChildAt(i3 - getFirstVisiblePosition());
            if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                childAt.setPressed(false);
            }
        }
        this.f = i2;
        float left = f2 - ((float) view.getLeft());
        float top = f3 - ((float) view.getTop());
        if (VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        a(i2, view, f2, f3);
        setSelectorEnabled(false);
        refreshDrawableState();
    }
}
