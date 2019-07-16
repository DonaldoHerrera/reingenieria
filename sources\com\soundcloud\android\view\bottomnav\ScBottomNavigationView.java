package com.soundcloud.android.view.bottomnav;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.v;
import androidx.customview.view.AbsSavedState;
import com.soundcloud.android.ia.g;

public class ScBottomNavigationView extends FrameLayout {
    private final l a;
    private final ScBottomNavigationMenuView b;
    private final ScBottomNavigationPresenter c;
    /* access modifiers changed from: private */
    public b d;
    /* access modifiers changed from: private */
    public a e;

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new f();
        Bundle c;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.c = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.c);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
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

    public ScBottomNavigationView(Context context) {
        this(context, null);
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

    public void setOnNavigationItemReselectedListener(a aVar) {
        this.e = aVar;
    }

    public void setOnNavigationItemSelectedListener(b bVar) {
        this.d = bVar;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.a.findItem(i);
        if (findItem != null && !this.a.a(findItem, (v) this.c, 0)) {
            findItem.setChecked(true);
        }
    }

    public ScBottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScBottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new ScBottomNavigationPresenter();
        this.a = new c(context);
        this.b = new ScBottomNavigationMenuView(context);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.b.setLayoutParams(layoutParams);
        this.c.a(this.b);
        this.c.a(1);
        this.b.setPresenter(this.c);
        this.a.a((v) this.c);
        this.c.a(getContext(), this.a);
        C1778vc.a((View) this, (float) getResources().getDimensionPixelSize(g.bottom_navigation_elevation));
        addView(this.b, layoutParams);
        this.a.a((androidx.appcompat.view.menu.l.a) new e(this));
    }
}
