package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;

/* compiled from: ScrollingTabContainerView */
public class T extends HorizontalScrollView implements OnItemSelectedListener {
    private static final Interpolator a = new DecelerateInterpolator();
    Runnable b;
    private b c;
    LinearLayoutCompat d;
    private Spinner e;
    private boolean f;
    int g;
    int h;
    private int i;
    private int j;

    /* compiled from: ScrollingTabContainerView */
    private class a extends BaseAdapter {
        a() {
        }

        public int getCount() {
            return T.this.d.getChildCount();
        }

        public Object getItem(int i) {
            return ((c) T.this.d.getChildAt(i)).a();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return T.this.a((androidx.appcompat.app.ActionBar.b) getItem(i), true);
            }
            ((c) view).a((androidx.appcompat.app.ActionBar.b) getItem(i));
            return view;
        }
    }

    /* compiled from: ScrollingTabContainerView */
    private class b implements OnClickListener {
        b() {
        }

        public void onClick(View view) {
            ((c) view).a().e();
            int childCount = T.this.d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = T.this.d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* compiled from: ScrollingTabContainerView */
    private class c extends LinearLayout {
        private final int[] a = {16842964};
        private androidx.appcompat.app.ActionBar.b b;
        private TextView c;
        private ImageView d;
        private View e;

        public c(Context context, androidx.appcompat.app.ActionBar.b bVar, boolean z) {
            super(context, null, C0294a.actionBarTabStyle);
            this.b = bVar;
            na a2 = na.a(context, null, this.a, C0294a.actionBarTabStyle, 0);
            if (a2.g(0)) {
                setBackgroundDrawable(a2.b(0));
            }
            a2.a();
            if (z) {
                setGravity(8388627);
            }
            b();
        }

        public void a(androidx.appcompat.app.ActionBar.b bVar) {
            this.b = bVar;
            b();
        }

        public void b() {
            androidx.appcompat.app.ActionBar.b bVar = this.b;
            View b2 = bVar.b();
            CharSequence charSequence = null;
            if (b2 != null) {
                ViewParent parent = b2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b2);
                    }
                    addView(b2);
                }
                this.e = b2;
                TextView textView = this.c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.e;
            if (view != null) {
                removeView(view);
                this.e = null;
            }
            Drawable c2 = bVar.c();
            CharSequence d2 = bVar.d();
            if (c2 != null) {
                if (this.d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LayoutParams layoutParams = new LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.d = appCompatImageView;
                }
                this.d.setImageDrawable(c2);
                this.d.setVisibility(0);
            } else {
                ImageView imageView2 = this.d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.d.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d2);
            if (z) {
                if (this.c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C0294a.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TruncateAt.END);
                    LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.c = appCompatTextView;
                }
                this.c.setText(d2);
                this.c.setVisibility(0);
            } else {
                TextView textView2 = this.c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.c.setText(null);
                }
            }
            ImageView imageView3 = this.d;
            if (imageView3 != null) {
                imageView3.setContentDescription(bVar.a());
            }
            if (!z) {
                charSequence = bVar.a();
            }
            va.a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(androidx.appcompat.app.ActionBar.b.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(androidx.appcompat.app.ActionBar.b.class.getName());
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (T.this.g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = T.this.g;
                if (measuredWidth > i3) {
                    super.onMeasure(MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        public androidx.appcompat.app.ActionBar.b a() {
            return this.b;
        }
    }

    private Spinner a() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C0294a.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private boolean b() {
        Spinner spinner = this.e;
        return spinner != null && spinner.getParent() == this;
    }

    private void c() {
        if (!b()) {
            if (this.e == null) {
                this.e = a();
            }
            removeView(this.d);
            addView(this.e, new ViewGroup.LayoutParams(-2, -1));
            if (this.e.getAdapter() == null) {
                this.e.setAdapter(new a());
            }
            Runnable runnable = this.b;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.b = null;
            }
            this.e.setSelection(this.j);
        }
    }

    private boolean d() {
        if (!b()) {
            return false;
        }
        removeView(this.e);
        addView(this.d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.e.getSelectedItemPosition());
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.b;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1682s a2 = C1682s.a(getContext());
        setContentHeight(a2.e());
        this.h = a2.d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((c) view).a().e();
    }

    public void onMeasure(int i2, int i3) {
        int mode = MeasureSpec.getMode(i2);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.g = -1;
        } else {
            if (childCount > 2) {
                this.g = (int) (((float) MeasureSpec.getSize(i2)) * 0.4f);
            } else {
                this.g = MeasureSpec.getSize(i2) / 2;
            }
            this.g = Math.min(this.g, this.h);
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.i, 1073741824);
        if (z2 || !this.f) {
            z = false;
        }
        if (z) {
            this.d.measure(0, makeMeasureSpec);
            if (this.d.getMeasuredWidth() > MeasureSpec.getSize(i2)) {
                c();
            } else {
                d();
            }
        } else {
            d();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.j);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f = z;
    }

    public void setContentHeight(int i2) {
        this.i = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.j = i2;
        int childCount = this.d.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.d.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.e;
        if (spinner != null && i2 >= 0) {
            spinner.setSelection(i2);
        }
    }

    public void a(int i2) {
        View childAt = this.d.getChildAt(i2);
        Runnable runnable = this.b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.b = new S(this, childAt);
        post(this.b);
    }

    /* access modifiers changed from: 0000 */
    public c a(androidx.appcompat.app.ActionBar.b bVar, boolean z) {
        c cVar = new c(getContext(), bVar, z);
        if (z) {
            cVar.setBackgroundDrawable(null);
            cVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.i));
        } else {
            cVar.setFocusable(true);
            if (this.c == null) {
                this.c = new b();
            }
            cVar.setOnClickListener(this.c);
        }
        return cVar;
    }
}
