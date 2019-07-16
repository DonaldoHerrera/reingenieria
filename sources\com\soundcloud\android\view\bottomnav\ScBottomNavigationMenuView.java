package com.soundcloud.android.view.bottomnav;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.v;
import androidx.appcompat.view.menu.w;
import androidx.transition.AutoTransition;
import androidx.transition.C0444da;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.google.android.material.internal.q;
import com.soundcloud.android.ia.g;

@SuppressLint({"RestrictedApi"})
public class ScBottomNavigationMenuView extends ViewGroup implements w {
    private final TransitionSet a;
    private final int b;
    private final int c;
    private final OnClickListener d;
    private final C0251Rb<b> e;
    private b[] f;
    private int g;
    private int h;
    private int[] i;
    private ScBottomNavigationPresenter j;
    private l k;

    public ScBottomNavigationMenuView(Context context) {
        this(context, null);
    }

    private b getNewItem() {
        b bVar = (b) this.e.a();
        return bVar == null ? new b(getContext()) : bVar;
    }

    public /* synthetic */ void a(View view) {
        p itemData = ((b) view).getItemData();
        if (!this.k.a((MenuItem) itemData, (v) this.j, 0)) {
            itemData.setChecked(true);
        }
    }

    public void b() {
        int size = this.k.size();
        if (size != this.f.length) {
            a();
            return;
        }
        int i2 = this.g;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = this.k.getItem(i3);
            if (item.isChecked()) {
                this.g = item.getItemId();
                this.h = i3;
            }
        }
        if (i2 != this.g) {
            C0444da.a(this, this.a);
        }
        for (int i4 = 0; i4 < size; i4++) {
            this.j.b(true);
            this.f[i4].a((p) this.k.getItem(i4), 0);
            this.j.b(false);
        }
    }

    public int getSelectedItemId() {
        return this.g;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                if (C1778vc.l(this) == 1) {
                    int i10 = i6 - i8;
                    childAt.layout(i10 - childAt.getMeasuredWidth(), 0, i10, i7);
                } else {
                    childAt.layout(i8, 0, childAt.getMeasuredWidth() + i8, i7);
                }
                i8 += childAt.getMeasuredWidth();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int size = MeasureSpec.getSize(i2);
        int childCount = getChildCount();
        int[] iArr = this.i;
        if (iArr == null || iArr.length != childCount) {
            this.i = new int[childCount];
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.c, 1073741824);
        int min = Math.min(size / (childCount == 0 ? 1 : childCount), this.b);
        int i4 = size - (min * childCount);
        for (int i5 = 0; i5 < childCount; i5++) {
            int[] iArr2 = this.i;
            iArr2[i5] = min;
            if (i4 > 0) {
                iArr2[i5] = iArr2[i5] + 1;
                i4--;
            }
        }
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                childAt.measure(MeasureSpec.makeMeasureSpec(this.i[i7], 1073741824), makeMeasureSpec);
                childAt.getLayoutParams().width = childAt.getMeasuredWidth();
                i6 += childAt.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i6, MeasureSpec.makeMeasureSpec(i6, 1073741824), 0), View.resolveSizeAndState(this.c, makeMeasureSpec, 0));
    }

    public void setPresenter(ScBottomNavigationPresenter scBottomNavigationPresenter) {
        this.j = scBottomNavigationPresenter;
    }

    public ScBottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new C0259Tb(5);
        this.g = 0;
        this.h = 0;
        Resources resources = getResources();
        this.b = resources.getDimensionPixelSize(g.bottom_navigation_active_item_max_width);
        this.c = resources.getDimensionPixelSize(g.bottom_navigation_height);
        this.a = new AutoTransition();
        this.a.b(0);
        this.a.a(115);
        this.a.a((TimeInterpolator) new C0488bd());
        this.a.a((Transition) new q());
        this.d = new a(this);
    }

    public void a(l lVar) {
        this.k = lVar;
    }

    public void a() {
        removeAllViews();
        b[] bVarArr = this.f;
        if (bVarArr != null) {
            for (b a2 : bVarArr) {
                this.e.a(a2);
            }
        }
        if (this.k.size() == 0) {
            this.g = 0;
            this.h = 0;
            this.f = null;
            return;
        }
        this.f = new b[this.k.size()];
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            this.j.b(true);
            this.k.getItem(i2).setCheckable(true);
            this.j.b(false);
            b newItem = getNewItem();
            this.f[i2] = newItem;
            newItem.a((p) this.k.getItem(i2), 0);
            newItem.setOnClickListener(this.d);
            addView(newItem);
        }
        this.h = Math.min(this.k.size() - 1, this.h);
        this.k.getItem(this.h).setChecked(true);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        int size = this.k.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = this.k.getItem(i3);
            if (i2 == item.getItemId()) {
                this.g = i2;
                this.h = i3;
                item.setChecked(true);
                return;
            }
        }
    }
}
