package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

public class AppCompatSpinner extends Spinner implements C1629qc {
    private static final int[] a = {16843505};
    private final C0348o b;
    private final Context c;
    private H d;
    private SpinnerAdapter e;
    private final boolean f;
    b g;
    int h;
    final Rect i;

    private static class a implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter a;
        private ListAdapter b;

        public a(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof ja) {
                ja jaVar = (ja) spinnerAdapter;
                if (jaVar.getDropDownViewTheme() == null) {
                    jaVar.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    private class b extends ListPopupWindow {
        private CharSequence K;
        ListAdapter L;
        private final Rect M = new Rect();

        public b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            a((View) AppCompatSpinner.this);
            a(true);
            f(0);
            a((OnItemClickListener) new C0355w(this, AppCompatSpinner.this));
        }

        /* access modifiers changed from: 0000 */
        public boolean b(View view) {
            return C1778vc.A(view) && view.getGlobalVisibleRect(this.M);
        }

        public void c() {
            boolean d = d();
            l();
            e(2);
            super.c();
            e().setChoiceMode(1);
            g(AppCompatSpinner.this.getSelectedItemPosition());
            if (!d) {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    C0356x xVar = new C0356x(this);
                    viewTreeObserver.addOnGlobalLayoutListener(xVar);
                    a((OnDismissListener) new C0357y(this, xVar));
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void l() {
            Drawable f = f();
            int i = 0;
            if (f != null) {
                f.getPadding(AppCompatSpinner.this.i);
                i = Ba.a(AppCompatSpinner.this) ? AppCompatSpinner.this.i.right : -AppCompatSpinner.this.i.left;
            } else {
                Rect rect = AppCompatSpinner.this.i;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i2 = appCompatSpinner.h;
            if (i2 == -2) {
                int a = appCompatSpinner.a((SpinnerAdapter) this.L, f());
                int i3 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.i;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (a > i4) {
                    a = i4;
                }
                b(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                b((width - paddingLeft) - paddingRight);
            } else {
                b(i2);
            }
            d(Ba.a(AppCompatSpinner.this) ? i + ((width - paddingRight) - i()) : i + paddingLeft);
        }

        public CharSequence m() {
            return this.K;
        }

        public void a(ListAdapter listAdapter) {
            super.a(listAdapter);
            this.L = listAdapter;
        }

        public void a(CharSequence charSequence) {
            this.K = charSequence;
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0294a.spinnerStyle);
    }

    /* access modifiers changed from: 0000 */
    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.i);
            Rect rect = this.i;
            i3 += rect.left + rect.right;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0348o oVar = this.b;
        if (oVar != null) {
            oVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        b bVar = this.g;
        if (bVar != null) {
            return bVar.g();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        b bVar = this.g;
        if (bVar != null) {
            return bVar.h();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.g != null) {
            return this.h;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public Drawable getPopupBackground() {
        b bVar = this.g;
        if (bVar != null) {
            return bVar.f();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        if (this.g != null) {
            return this.c;
        }
        if (VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public CharSequence getPrompt() {
        b bVar = this.g;
        return bVar != null ? bVar.m() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0348o oVar = this.b;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0348o oVar = this.b;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.g;
        if (bVar != null && bVar.d()) {
            this.g.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.g != null && MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        H h2 = this.d;
        if (h2 == null || !h2.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        b bVar = this.g;
        if (bVar == null) {
            return super.performClick();
        }
        if (!bVar.d()) {
            this.g.c();
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0348o oVar = this.b;
        if (oVar != null) {
            oVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0348o oVar = this.b;
        if (oVar != null) {
            oVar.a(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        b bVar = this.g;
        if (bVar != null) {
            bVar.d(i2);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    public void setDropDownVerticalOffset(int i2) {
        b bVar = this.g;
        if (bVar != null) {
            bVar.h(i2);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.g != null) {
            this.h = i2;
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        b bVar = this.g;
        if (bVar != null) {
            bVar.a(drawable);
        } else if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(C1437k.b(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        b bVar = this.g;
        if (bVar != null) {
            bVar.a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0348o oVar = this.b;
        if (oVar != null) {
            oVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0348o oVar = this.b;
        if (oVar != null) {
            oVar.a(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f) {
            this.e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.g != null) {
            Context context = this.c;
            if (context == null) {
                context = getContext();
            }
            this.g.a((ListAdapter) new a(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r12 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        if (r12 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2, int i3, Theme theme) {
        TypedArray typedArray;
        super(context, attributeSet, i2);
        this.i = new Rect();
        na a2 = na.a(context, attributeSet, C1406j.Spinner, i2, 0);
        this.b = new C0348o(this);
        if (theme != null) {
            this.c = new C1772v(context, theme);
        } else {
            int g2 = a2.g(C1406j.Spinner_popupTheme, 0);
            if (g2 != 0) {
                this.c = new C1772v(context, g2);
            } else {
                this.c = VERSION.SDK_INT < 23 ? context : null;
            }
        }
        if (this.c != null) {
            if (i3 == -1) {
                try {
                    typedArray = context.obtainStyledAttributes(attributeSet, a, i2, 0);
                    try {
                        if (typedArray.hasValue(0)) {
                            i3 = typedArray.getInt(0, 0);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        } catch (Throwable th) {
                            th = th;
                            if (typedArray != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    typedArray = null;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                } catch (Throwable th2) {
                    th = th2;
                    typedArray = null;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            }
            if (i3 == 1) {
                b bVar = new b(this.c, attributeSet, i2);
                na a3 = na.a(this.c, attributeSet, C1406j.Spinner, i2, 0);
                this.h = a3.f(C1406j.Spinner_android_dropDownWidth, -2);
                bVar.a(a3.b(C1406j.Spinner_android_popupBackground));
                bVar.a((CharSequence) a2.d(C1406j.Spinner_android_prompt));
                a3.a();
                this.g = bVar;
                this.d = new C0354v(this, this, bVar);
            }
        }
        CharSequence[] f2 = a2.f(C1406j.Spinner_android_entries);
        if (f2 != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, f2);
            arrayAdapter.setDropDownViewResource(C1314g.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        a2.a();
        this.f = true;
        SpinnerAdapter spinnerAdapter = this.e;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.e = null;
        }
        this.b.a(attributeSet, i2);
    }
}
