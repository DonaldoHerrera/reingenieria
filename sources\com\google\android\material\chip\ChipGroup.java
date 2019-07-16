package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.r;

public class ChipGroup extends FlowLayout {
    private int d;
    private int e;
    /* access modifiers changed from: private */
    public boolean f;
    private b g;
    /* access modifiers changed from: private */
    public final a h;
    private c i;
    /* access modifiers changed from: private */
    public int j;
    /* access modifiers changed from: private */
    public boolean k;

    public static class LayoutParams extends MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    private class a implements OnCheckedChangeListener {
        private a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.k) {
                int id = compoundButton.getId();
                if (z) {
                    if (!(ChipGroup.this.j == -1 || ChipGroup.this.j == id || !ChipGroup.this.f)) {
                        ChipGroup chipGroup = ChipGroup.this;
                        chipGroup.a(chipGroup.j, false);
                    }
                    ChipGroup.this.setCheckedId(id);
                } else if (ChipGroup.this.j == id) {
                    ChipGroup.this.setCheckedId(-1);
                }
            }
        }
    }

    public interface b {
        void a(ChipGroup chipGroup, int i);
    }

    private class c implements OnHierarchyChangeListener {
        /* access modifiers changed from: private */
        public OnHierarchyChangeListener a;

        private c() {
        }

        public void onChildViewAdded(View view, View view2) {
            int i;
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    if (VERSION.SDK_INT >= 17) {
                        i = View.generateViewId();
                    } else {
                        i = view2.hashCode();
                    }
                    view2.setId(i);
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.h);
            }
            OnHierarchyChangeListener onHierarchyChangeListener = this.a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            OnHierarchyChangeListener onHierarchyChangeListener = this.a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1771uz.chipGroupStyle);
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i2) {
        this.j = i2;
        b bVar = this.g;
        if (bVar != null && this.f) {
            bVar.a(this, i2);
        }
    }

    public void addView(View view, int i2, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i3 = this.j;
                if (i3 != -1 && this.f) {
                    a(i3, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i2, layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f) {
            return this.j;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.d;
    }

    public int getChipSpacingVertical() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.j;
        if (i2 != -1) {
            a(i2, true);
            setCheckedId(this.j);
        }
    }

    public void setChipSpacing(int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(int i2) {
        if (this.d != i2) {
            this.d = i2;
            setItemSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(int i2) {
        if (this.e != i2) {
            this.e = i2;
            setLineSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(b bVar) {
        this.g = bVar;
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.i.a = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    public void setSingleSelection(boolean z) {
        if (this.f != z) {
            this.f = z;
            b();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = new a();
        this.i = new c();
        this.j = -1;
        this.k = false;
        TypedArray a2 = r.a(context, attributeSet, Dz.ChipGroup, i2, Cz.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = a2.getDimensionPixelOffset(Dz.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(a2.getDimensionPixelOffset(Dz.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(a2.getDimensionPixelOffset(Dz.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(a2.getBoolean(Dz.ChipGroup_singleLine, false));
        setSingleSelection(a2.getBoolean(Dz.ChipGroup_singleSelection, false));
        int resourceId = a2.getResourceId(Dz.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.j = resourceId;
        }
        a2.recycle();
        super.setOnHierarchyChangeListener(this.i);
    }

    public void b() {
        this.k = true;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.k = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    public void a(int i2, boolean z) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof Chip) {
            this.k = true;
            ((Chip) findViewById).setChecked(z);
            this.k = false;
        }
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
