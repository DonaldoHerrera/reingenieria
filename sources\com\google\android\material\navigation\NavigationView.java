package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.v;
import androidx.appcompat.widget.na;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.h;
import com.google.android.material.internal.r;

public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] d = {16842912};
    private static final int[] e = {-16842910};
    private final h f;
    private final NavigationMenuPresenter g;
    a h;
    private final int i;
    private MenuInflater j;

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new b();
        public Bundle c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface a {
        boolean a(MenuItem menuItem);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1771uz.navigationViewStyle);
    }

    private ColorStateList c(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList a2 = C1437k.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0294a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = a2.getDefaultColor();
        return new ColorStateList(new int[][]{e, d, FrameLayout.EMPTY_STATE_SET}, new int[]{a2.getColorForState(e, defaultColor), i3, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.j == null) {
            this.j = new C1862y(getContext());
        }
        return this.j;
    }

    /* access modifiers changed from: protected */
    public void a(Ic ic) {
        this.g.a(ic);
    }

    public void b(int i2) {
        this.g.b(true);
        getMenuInflater().inflate(i2, this.f);
        this.g.b(false);
        this.g.a(false);
    }

    public MenuItem getCheckedItem() {
        return this.g.c();
    }

    public int getHeaderCount() {
        return this.g.d();
    }

    public Drawable getItemBackground() {
        return this.g.e();
    }

    public int getItemHorizontalPadding() {
        return this.g.f();
    }

    public int getItemIconPadding() {
        return this.g.g();
    }

    public ColorStateList getItemIconTintList() {
        return this.g.i();
    }

    public ColorStateList getItemTextColor() {
        return this.g.h();
    }

    public Menu getMenu() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int mode = MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = MeasureSpec.makeMeasureSpec(Math.min(MeasureSpec.getSize(i2), this.i), 1073741824);
        } else if (mode == 0) {
            i2 = MeasureSpec.makeMeasureSpec(this.i, 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f.b(savedState.c);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = new Bundle();
        this.f.d(savedState.c);
        return savedState;
    }

    public void setCheckedItem(int i2) {
        MenuItem findItem = this.f.findItem(i2);
        if (findItem != null) {
            this.g.a((p) findItem);
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.g.a(drawable);
    }

    public void setItemBackgroundResource(int i2) {
        setItemBackground(androidx.core.content.a.c(getContext(), i2));
    }

    public void setItemHorizontalPadding(int i2) {
        this.g.c(i2);
    }

    public void setItemHorizontalPaddingResource(int i2) {
        this.g.c(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconPadding(int i2) {
        this.g.d(i2);
    }

    public void setItemIconPaddingResource(int i2) {
        this.g.d(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.g.a(colorStateList);
    }

    public void setItemTextAppearance(int i2) {
        this.g.e(i2);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.g.b(colorStateList);
    }

    public void setNavigationItemSelectedListener(a aVar) {
        this.h = aVar;
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i2) {
        ColorStateList colorStateList;
        int i3;
        boolean z;
        super(context, attributeSet, i2);
        this.g = new NavigationMenuPresenter();
        this.f = new h(context);
        na b = r.b(context, attributeSet, Dz.NavigationView, i2, Cz.Widget_Design_NavigationView, new int[0]);
        C1778vc.a((View) this, b.b(Dz.NavigationView_android_background));
        if (b.g(Dz.NavigationView_elevation)) {
            C1778vc.a((View) this, (float) b.c(Dz.NavigationView_elevation, 0));
        }
        C1778vc.a((View) this, b.a(Dz.NavigationView_android_fitsSystemWindows, false));
        this.i = b.c(Dz.NavigationView_android_maxWidth, 0);
        if (b.g(Dz.NavigationView_itemIconTint)) {
            colorStateList = b.a(Dz.NavigationView_itemIconTint);
        } else {
            colorStateList = c(16842808);
        }
        if (b.g(Dz.NavigationView_itemTextAppearance)) {
            i3 = b.g(Dz.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            z = false;
            i3 = 0;
        }
        ColorStateList colorStateList2 = null;
        if (b.g(Dz.NavigationView_itemTextColor)) {
            colorStateList2 = b.a(Dz.NavigationView_itemTextColor);
        }
        if (!z && colorStateList2 == null) {
            colorStateList2 = c(16842806);
        }
        Drawable b2 = b.b(Dz.NavigationView_itemBackground);
        if (b.g(Dz.NavigationView_itemHorizontalPadding)) {
            this.g.c(b.c(Dz.NavigationView_itemHorizontalPadding, 0));
        }
        int c = b.c(Dz.NavigationView_itemIconPadding, 0);
        this.f.a((androidx.appcompat.view.menu.l.a) new a(this));
        this.g.b(1);
        this.g.a(context, (l) this.f);
        this.g.a(colorStateList);
        if (z) {
            this.g.e(i3);
        }
        this.g.b(colorStateList2);
        this.g.a(b2);
        this.g.d(c);
        this.f.a((v) this.g);
        addView((View) this.g.a((ViewGroup) this));
        if (b.g(Dz.NavigationView_menu)) {
            b(b.g(Dz.NavigationView_menu, 0));
        }
        if (b.g(Dz.NavigationView_headerLayout)) {
            a(b.g(Dz.NavigationView_headerLayout, 0));
        }
        b.a();
    }

    public View a(int i2) {
        return this.g.a(i2);
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.g.a((p) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
