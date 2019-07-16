package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.view.menu.z;
import androidx.core.widget.k;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.lang.reflect.Method;

public class ListPopupWindow implements z {
    private static Method a;
    private static Method b;
    private static Method c;
    final e A;
    private final d B;
    private final c C;
    private final a D;
    private Runnable E;
    final Handler F;
    private final Rect G;
    private Rect H;
    private boolean I;
    PopupWindow J;
    private Context d;
    private ListAdapter e;
    F f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private boolean q;
    private boolean r;
    int s;
    private View t;
    private int u;
    private DataSetObserver v;
    private View w;
    private Drawable x;
    private OnItemClickListener y;
    private OnItemSelectedListener z;

    private class a implements Runnable {
        a() {
        }

        public void run() {
            ListPopupWindow.this.a();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            if (ListPopupWindow.this.d()) {
                ListPopupWindow.this.c();
            }
        }

        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    private class c implements OnScrollListener {
        c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.j() && ListPopupWindow.this.J.getContentView() != null) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.F.removeCallbacks(listPopupWindow.A);
                ListPopupWindow.this.A.run();
            }
        }
    }

    private class d implements OnTouchListener {
        d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0) {
                PopupWindow popupWindow = ListPopupWindow.this.J;
                if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.J.getWidth() && y >= 0 && y < ListPopupWindow.this.J.getHeight()) {
                    ListPopupWindow listPopupWindow = ListPopupWindow.this;
                    listPopupWindow.F.postDelayed(listPopupWindow.A, 250);
                    return false;
                }
            }
            if (action == 1) {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.F.removeCallbacks(listPopupWindow2.A);
            }
            return false;
        }
    }

    private class e implements Runnable {
        e() {
        }

        public void run() {
            F f = ListPopupWindow.this.f;
            if (f != null && C1778vc.A(f) && ListPopupWindow.this.f.getCount() > ListPopupWindow.this.f.getChildCount()) {
                int childCount = ListPopupWindow.this.f.getChildCount();
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (childCount <= listPopupWindow.s) {
                    listPopupWindow.J.setInputMethodMode(2);
                    ListPopupWindow.this.c();
                }
            }
        }
    }

    static {
        String str = "ListPopupWindow";
        try {
            a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i(str, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
            Log.i(str, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException unused3) {
            Log.i(str, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, C0294a.listPopupWindowStyle);
    }

    private int l() {
        int i2;
        int i3;
        int makeMeasureSpec;
        View view;
        int i4;
        boolean z2 = true;
        if (this.f == null) {
            Context context = this.d;
            this.E = new I(this);
            this.f = a(context, !this.I);
            Drawable drawable = this.x;
            if (drawable != null) {
                this.f.setSelector(drawable);
            }
            this.f.setAdapter(this.e);
            this.f.setOnItemClickListener(this.y);
            this.f.setFocusable(true);
            this.f.setFocusableInTouchMode(true);
            this.f.setOnItemSelectedListener(new J(this));
            this.f.setOnScrollListener(this.C);
            OnItemSelectedListener onItemSelectedListener = this.z;
            if (onItemSelectedListener != null) {
                this.f.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view2 = this.f;
            View view3 = this.t;
            if (view3 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LayoutParams layoutParams = new LayoutParams(-1, 0, 1.0f);
                int i5 = this.u;
                if (i5 == 0) {
                    linearLayout.addView(view3);
                    linearLayout.addView(view2, layoutParams);
                } else if (i5 != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid hint position ");
                    sb.append(this.u);
                    Log.e("ListPopupWindow", sb.toString());
                } else {
                    linearLayout.addView(view2, layoutParams);
                    linearLayout.addView(view3);
                }
                int i6 = this.h;
                if (i6 >= 0) {
                    i4 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i4 = 0;
                }
                view3.measure(MeasureSpec.makeMeasureSpec(i6, i4), 0);
                LayoutParams layoutParams2 = (LayoutParams) view3.getLayoutParams();
                i2 = view3.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i2 = 0;
                view = view2;
            }
            this.J.setContentView(view);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.J.getContentView();
            View view4 = this.t;
            if (view4 != null) {
                LayoutParams layoutParams3 = (LayoutParams) view4.getLayoutParams();
                i2 = view4.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i2 = 0;
            }
        }
        Drawable background = this.J.getBackground();
        if (background != null) {
            background.getPadding(this.G);
            Rect rect = this.G;
            int i7 = rect.top;
            i3 = rect.bottom + i7;
            if (!this.l) {
                this.j = -i7;
            }
        } else {
            this.G.setEmpty();
            i3 = 0;
        }
        if (this.J.getInputMethodMode() != 2) {
            z2 = false;
        }
        int a2 = a(b(), this.j, z2);
        if (this.q || this.g == -1) {
            return a2 + i3;
        }
        int i8 = this.h;
        if (i8 == -2) {
            int i9 = this.d.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.G;
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i8 != -1) {
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else {
            int i10 = this.d.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.G;
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(i10 - (rect3.left + rect3.right), 1073741824);
        }
        int a3 = this.f.a(makeMeasureSpec, 0, -1, a2 - i2, -1);
        if (a3 > 0) {
            i2 += i3 + this.f.getPaddingTop() + this.f.getPaddingBottom();
        }
        return a3 + i2;
    }

    private void m() {
        View view = this.t;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.t);
            }
        }
    }

    public void a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.v;
        if (dataSetObserver == null) {
            this.v = new b();
        } else {
            ListAdapter listAdapter2 = this.e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.v);
        }
        F f2 = this.f;
        if (f2 != null) {
            f2.setAdapter(this.e);
        }
    }

    public View b() {
        return this.w;
    }

    public void c(int i2) {
        this.p = i2;
    }

    public void d(int i2) {
        this.i = i2;
    }

    public void dismiss() {
        this.J.dismiss();
        m();
        this.J.setContentView(null);
        this.f = null;
        this.F.removeCallbacks(this.A);
    }

    public void e(int i2) {
        this.J.setInputMethodMode(i2);
    }

    public void f(int i2) {
        this.u = i2;
    }

    public int g() {
        return this.i;
    }

    public int h() {
        if (!this.l) {
            return 0;
        }
        return this.j;
    }

    public int i() {
        return this.h;
    }

    public boolean j() {
        return this.J.getInputMethodMode() == 2;
    }

    public boolean k() {
        return this.I;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0294a.listPopupWindowStyle);
    }

    public void b(int i2) {
        Drawable background = this.J.getBackground();
        if (background != null) {
            background.getPadding(this.G);
            Rect rect = this.G;
            this.h = rect.left + rect.right + i2;
            return;
        }
        i(i2);
    }

    public void c() {
        int l2 = l();
        boolean j2 = j();
        k.a(this.J, this.k);
        boolean z2 = true;
        if (!this.J.isShowing()) {
            int i2 = this.h;
            if (i2 == -1) {
                i2 = -1;
            } else if (i2 == -2) {
                i2 = b().getWidth();
            }
            int i3 = this.g;
            if (i3 == -1) {
                l2 = -1;
            } else if (i3 != -2) {
                l2 = i3;
            }
            this.J.setWidth(i2);
            this.J.setHeight(l2);
            c(true);
            this.J.setOutsideTouchable(!this.r && !this.q);
            this.J.setTouchInterceptor(this.B);
            if (this.o) {
                k.a(this.J, this.n);
            }
            Method method = c;
            if (method != null) {
                try {
                    method.invoke(this.J, new Object[]{this.H});
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
            k.a(this.J, b(), this.i, this.j, this.p);
            this.f.setSelection(-1);
            if (!this.I || this.f.isInTouchMode()) {
                a();
            }
            if (!this.I) {
                this.F.post(this.D);
            }
        } else if (C1778vc.A(b())) {
            int i4 = this.h;
            if (i4 == -1) {
                i4 = -1;
            } else if (i4 == -2) {
                i4 = b().getWidth();
            }
            int i5 = this.g;
            if (i5 == -1) {
                if (!j2) {
                    l2 = -1;
                }
                if (j2) {
                    this.J.setWidth(this.h == -1 ? -1 : 0);
                    this.J.setHeight(0);
                } else {
                    this.J.setWidth(this.h == -1 ? -1 : 0);
                    this.J.setHeight(-1);
                }
            } else if (i5 != -2) {
                l2 = i5;
            }
            PopupWindow popupWindow = this.J;
            if (this.r || this.q) {
                z2 = false;
            }
            popupWindow.setOutsideTouchable(z2);
            this.J.update(b(), this.i, this.j, i4 < 0 ? -1 : i4, l2 < 0 ? -1 : l2);
        }
    }

    public boolean d() {
        return this.J.isShowing();
    }

    public ListView e() {
        return this.f;
    }

    public Drawable f() {
        return this.J.getBackground();
    }

    public void g(int i2) {
        F f2 = this.f;
        if (d() && f2 != null) {
            f2.setListSelectionHidden(false);
            f2.setSelection(i2);
            if (f2.getChoiceMode() != 0) {
                f2.setItemChecked(i2, true);
            }
        }
    }

    public void i(int i2) {
        this.h = i2;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public void h(int i2) {
        this.j = i2;
        this.l = true;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.g = -2;
        this.h = -2;
        this.k = CloseCodes.PROTOCOL_ERROR;
        this.m = true;
        this.p = 0;
        this.q = false;
        this.r = false;
        this.s = BaseClientBuilder.API_PRIORITY_OTHER;
        this.u = 0;
        this.A = new e();
        this.B = new d();
        this.C = new c();
        this.D = new a();
        this.G = new Rect();
        this.d = context;
        this.F = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1406j.ListPopupWindow, i2, i3);
        this.i = obtainStyledAttributes.getDimensionPixelOffset(C1406j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.j = obtainStyledAttributes.getDimensionPixelOffset(C1406j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.j != 0) {
            this.l = true;
        }
        obtainStyledAttributes.recycle();
        this.J = new AppCompatPopupWindow(context, attributeSet, i2, i3);
        this.J.setInputMethodMode(1);
    }

    public void b(boolean z2) {
        this.o = true;
        this.n = z2;
    }

    public void a(boolean z2) {
        this.I = z2;
        this.J.setFocusable(z2);
    }

    public void a(Drawable drawable) {
        this.J.setBackgroundDrawable(drawable);
    }

    public void a(int i2) {
        this.J.setAnimationStyle(i2);
    }

    public void a(View view) {
        this.w = view;
    }

    public void a(Rect rect) {
        this.H = rect;
    }

    public void a(OnItemClickListener onItemClickListener) {
        this.y = onItemClickListener;
    }

    public void a(OnDismissListener onDismissListener) {
        this.J.setOnDismissListener(onDismissListener);
    }

    public void a() {
        F f2 = this.f;
        if (f2 != null) {
            f2.setListSelectionHidden(true);
            f2.requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    public F a(Context context, boolean z2) {
        return new F(context, z2);
    }

    private int a(View view, int i2, boolean z2) {
        Method method = b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.J, new Object[]{view, Integer.valueOf(i2), Boolean.valueOf(z2)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.J.getMaxAvailableHeight(view, i2);
    }

    private void c(boolean z2) {
        Method method = a;
        if (method != null) {
            try {
                method.invoke(this.J, new Object[]{Boolean.valueOf(z2)});
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }
}
