package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.v;
import androidx.appcompat.widget.na;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.r;

public class BottomNavigationView extends FrameLayout {
    private final l a;
    private final BottomNavigationMenuView b;
    private final BottomNavigationPresenter c;
    private MenuInflater d;
    /* access modifiers changed from: private */
    public b e;
    /* access modifiers changed from: private */
    public a f;

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new e();
        Bundle c;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.c = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.c);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }
    }

    public interface a {
        void a(MenuItem menuItem);
    }

    public interface b {
        boolean a(MenuItem menuItem);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1771uz.bottomNavigationStyle);
    }

    private MenuInflater getMenuInflater() {
        if (this.d == null) {
            this.d = new C1862y(getContext());
        }
        return this.d;
    }

    public Drawable getItemBackground() {
        return this.b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.b.getIconTintList();
    }

    public int getItemTextAppearanceActive() {
        return this.b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.b.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.a;
    }

    public int getSelectedItemId() {
        return this.b.getSelectedItemId();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.a.b(savedState.c);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = new Bundle();
        this.a.d(savedState.c);
        return savedState;
    }

    public void setItemBackground(Drawable drawable) {
        this.b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.b.setItemBackgroundRes(i);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.b.b() != z) {
            this.b.setItemHorizontalTranslationEnabled(z);
            this.c.a(false);
        }
    }

    public void setItemIconSize(int i) {
        this.b.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.b.setIconTintList(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.b.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.b.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.b.getLabelVisibilityMode() != i) {
            this.b.setLabelVisibilityMode(i);
            this.c.a(false);
        }
    }

    public void setOnNavigationItemReselectedListener(a aVar) {
        this.f = aVar;
    }

    public void setOnNavigationItemSelectedListener(b bVar) {
        this.e = bVar;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.a.findItem(i);
        if (findItem != null && !this.a.a(findItem, (v) this.c, 0)) {
            findItem.setChecked(true);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new BottomNavigationPresenter();
        this.a = new a(context);
        this.b = new BottomNavigationMenuView(context);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.b.setLayoutParams(layoutParams);
        this.c.a(this.b);
        this.c.a(1);
        this.b.setPresenter(this.c);
        this.a.a((v) this.c);
        this.c.a(getContext(), this.a);
        na b2 = r.b(context, attributeSet, Dz.BottomNavigationView, i, Cz.Widget_Design_BottomNavigationView, Dz.BottomNavigationView_itemTextAppearanceInactive, Dz.BottomNavigationView_itemTextAppearanceActive);
        if (b2.g(Dz.BottomNavigationView_itemIconTint)) {
            this.b.setIconTintList(b2.a(Dz.BottomNavigationView_itemIconTint));
        } else {
            BottomNavigationMenuView bottomNavigationMenuView = this.b;
            bottomNavigationMenuView.setIconTintList(bottomNavigationMenuView.a(16842808));
        }
        setItemIconSize(b2.c(Dz.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(C1831wz.design_bottom_navigation_icon_size)));
        if (b2.g(Dz.BottomNavigationView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(b2.g(Dz.BottomNavigationView_itemTextAppearanceInactive, 0));
        }
        if (b2.g(Dz.BottomNavigationView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(b2.g(Dz.BottomNavigationView_itemTextAppearanceActive, 0));
        }
        if (b2.g(Dz.BottomNavigationView_itemTextColor)) {
            setItemTextColor(b2.a(Dz.BottomNavigationView_itemTextColor));
        }
        if (b2.g(Dz.BottomNavigationView_elevation)) {
            C1778vc.a((View) this, (float) b2.c(Dz.BottomNavigationView_elevation, 0));
        }
        setLabelVisibilityMode(b2.e(Dz.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(b2.a(Dz.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        this.b.setItemBackgroundRes(b2.g(Dz.BottomNavigationView_itemBackground, 0));
        if (b2.g(Dz.BottomNavigationView_menu)) {
            a(b2.g(Dz.BottomNavigationView_menu, 0));
        }
        b2.a();
        addView(this.b, layoutParams);
        if (VERSION.SDK_INT < 21) {
            a(context);
        }
        this.a.a((androidx.appcompat.view.menu.l.a) new d(this));
    }

    public void a(int i) {
        this.c.b(true);
        getMenuInflater().inflate(i, this.a);
        this.c.b(false);
        this.c.a(true);
    }

    private void a(Context context) {
        View view = new View(context);
        view.setBackgroundColor(androidx.core.content.a.a(context, C1801vz.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new LayoutParams(-1, getResources().getDimensionPixelSize(C1831wz.design_bottom_navigation_shadow_height)));
        addView(view);
    }
}
