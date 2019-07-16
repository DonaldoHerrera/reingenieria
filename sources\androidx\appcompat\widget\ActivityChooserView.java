package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.google.android.gms.common.api.Api.BaseClientBuilder;

public class ActivityChooserView extends ViewGroup implements androidx.appcompat.widget.C0342i.a {
    final a a;
    private final b b;
    private final View c;
    private final Drawable d;
    final FrameLayout e;
    private final ImageView f;
    final FrameLayout g;
    private final ImageView h;
    private final int i;
    C0278Xb j;
    final DataSetObserver k;
    private final OnGlobalLayoutListener l;
    private ListPopupWindow m;
    OnDismissListener n;
    boolean o;
    int p;
    private boolean q;
    private int r;

    public static class InnerLayout extends LinearLayout {
        private static final int[] a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            na a2 = na.a(context, attributeSet, a);
            setBackgroundDrawable(a2.b(0));
            a2.a();
        }
    }

    private class a extends BaseAdapter {
        private C0342i a;
        private int b = 4;
        private boolean c;
        private boolean d;
        private boolean e;

        a() {
        }

        public void a(C0342i iVar) {
            C0342i b2 = ActivityChooserView.this.a.b();
            if (b2 != null && ActivityChooserView.this.isShown()) {
                b2.unregisterObserver(ActivityChooserView.this.k);
            }
            this.a = iVar;
            if (iVar != null && ActivityChooserView.this.isShown()) {
                iVar.registerObserver(ActivityChooserView.this.k);
            }
            notifyDataSetChanged();
        }

        public C0342i b() {
            return this.a;
        }

        public ResolveInfo c() {
            return this.a.b();
        }

        public int d() {
            return this.a.c();
        }

        public boolean e() {
            return this.c;
        }

        public int f() {
            int i = this.b;
            this.b = BaseClientBuilder.API_PRIORITY_OTHER;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.b = i;
            return i2;
        }

        public int getCount() {
            int a2 = this.a.a();
            if (!this.c && this.a.b() != null) {
                a2--;
            }
            int min = Math.min(a2, this.b);
            return this.e ? min + 1 : min;
        }

        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (!this.c && this.a.b() != null) {
                    i++;
                }
                return this.a.b(i);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return (!this.e || i != getCount() - 1) ? 0 : 1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != C1283f.list_item) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C1314g.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(C1283f.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(C1283f.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.c || i != 0 || !this.d) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType == 1) {
                if (view == null || view.getId() != 1) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C1314g.abc_activity_chooser_view_list_item, viewGroup, false);
                    view.setId(1);
                    ((TextView) view.findViewById(C1283f.title)).setText(ActivityChooserView.this.getContext().getString(C1345h.abc_activity_chooser_view_see_all));
                }
                return view;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public int getViewTypeCount() {
            return 3;
        }

        public void a(int i) {
            if (this.b != i) {
                this.b = i;
                notifyDataSetChanged();
            }
        }

        public void a(boolean z) {
            if (this.e != z) {
                this.e = z;
                notifyDataSetChanged();
            }
        }

        public int a() {
            return this.a.a();
        }

        public void a(boolean z, boolean z2) {
            if (this.c != z || this.d != z2) {
                this.c = z;
                this.d = z2;
                notifyDataSetChanged();
            }
        }
    }

    private class b implements OnItemClickListener, OnClickListener, OnLongClickListener, OnDismissListener {
        b() {
        }

        private void a() {
            OnDismissListener onDismissListener = ActivityChooserView.this.n;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.g) {
                activityChooserView.a();
                Intent a2 = ActivityChooserView.this.a.b().a(ActivityChooserView.this.a.b().a(ActivityChooserView.this.a.c()));
                if (a2 != null) {
                    a2.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(a2);
                }
            } else if (view == activityChooserView.e) {
                activityChooserView.o = false;
                activityChooserView.a(activityChooserView.p);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            a();
            C0278Xb xb = ActivityChooserView.this.j;
            if (xb != null) {
                xb.a(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((a) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                ActivityChooserView.this.a();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!activityChooserView.o) {
                    if (!activityChooserView.a.e()) {
                        i++;
                    }
                    Intent a2 = ActivityChooserView.this.a.b().a(i);
                    if (a2 != null) {
                        a2.addFlags(524288);
                        ActivityChooserView.this.getContext().startActivity(a2);
                    }
                } else if (i > 0) {
                    activityChooserView.a.b().c(i);
                }
            } else if (itemViewType == 1) {
                ActivityChooserView.this.a(BaseClientBuilder.API_PRIORITY_OTHER);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.g) {
                if (activityChooserView.a.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.o = true;
                    activityChooserView2.a(activityChooserView2.p);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        if (this.a.b() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.l);
            boolean z = this.g.getVisibility() == 0;
            int a2 = this.a.a();
            if (i2 == Integer.MAX_VALUE || a2 <= i2 + (z ? 1 : 0)) {
                this.a.a(false);
                this.a.a(i2);
            } else {
                this.a.a(true);
                this.a.a(i2 - 1);
            }
            ListPopupWindow listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.d()) {
                if (this.o || !z) {
                    this.a.a(true, z);
                } else {
                    this.a.a(false, false);
                }
                listPopupWindow.b(Math.min(this.a.f(), this.i));
                listPopupWindow.c();
                C0278Xb xb = this.j;
                if (xb != null) {
                    xb.a(true);
                }
                listPopupWindow.e().setContentDescription(getContext().getString(C1345h.abc_activitychooserview_choose_application));
                listPopupWindow.e().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    public boolean b() {
        return getListPopupWindow().d();
    }

    public boolean c() {
        if (b() || !this.q) {
            return false;
        }
        this.o = false;
        a(this.p);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        if (this.a.getCount() > 0) {
            this.e.setEnabled(true);
        } else {
            this.e.setEnabled(false);
        }
        int a2 = this.a.a();
        int d2 = this.a.d();
        if (a2 == 1 || (a2 > 1 && d2 > 0)) {
            this.g.setVisibility(0);
            ResolveInfo c2 = this.a.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.h.setImageDrawable(c2.loadIcon(packageManager));
            if (this.r != 0) {
                CharSequence loadLabel = c2.loadLabel(packageManager);
                this.g.setContentDescription(getContext().getString(this.r, new Object[]{loadLabel}));
            }
        } else {
            this.g.setVisibility(8);
        }
        if (this.g.getVisibility() == 0) {
            this.c.setBackgroundDrawable(this.d);
        } else {
            this.c.setBackgroundDrawable(null);
        }
    }

    public C0342i getDataModel() {
        return this.a.b();
    }

    /* access modifiers changed from: 0000 */
    public ListPopupWindow getListPopupWindow() {
        if (this.m == null) {
            this.m = new ListPopupWindow(getContext());
            this.m.a((ListAdapter) this.a);
            this.m.a((View) this);
            this.m.a(true);
            this.m.a((OnItemClickListener) this.b);
            this.m.a((OnDismissListener) this.b);
        }
        return this.m;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0342i b2 = this.a.b();
        if (b2 != null) {
            b2.registerObserver(this.k);
        }
        this.q = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0342i b2 = this.a.b();
        if (b2 != null) {
            b2.unregisterObserver(this.k);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.l);
        }
        if (b()) {
            a();
        }
        this.q = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.c.layout(0, 0, i4 - i2, i5 - i3);
        if (!b()) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        View view = this.c;
        if (this.g.getVisibility() != 0) {
            i3 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3), 1073741824);
        }
        measureChild(view, i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C0342i iVar) {
        this.a.a(iVar);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i2) {
        this.r = i2;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i2) {
        this.f.setContentDescription(getContext().getString(i2));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i2) {
        this.p = i2;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.n = onDismissListener;
    }

    public void setProvider(C0278Xb xb) {
        this.j = xb;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k = new C0343j(this);
        this.l = new C0344k(this);
        this.p = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1406j.ActivityChooserView, i2, 0);
        this.p = obtainStyledAttributes.getInt(C1406j.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C1406j.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C1314g.abc_activity_chooser_view, this, true);
        this.b = new b();
        this.c = findViewById(C1283f.activity_chooser_view_content);
        this.d = this.c.getBackground();
        this.g = (FrameLayout) findViewById(C1283f.default_activity_button);
        this.g.setOnClickListener(this.b);
        this.g.setOnLongClickListener(this.b);
        this.h = (ImageView) this.g.findViewById(C1283f.image);
        FrameLayout frameLayout = (FrameLayout) findViewById(C1283f.expand_activities_button);
        frameLayout.setOnClickListener(this.b);
        frameLayout.setAccessibilityDelegate(new C0345l(this));
        frameLayout.setOnTouchListener(new C0346m(this, frameLayout));
        this.e = frameLayout;
        this.f = (ImageView) frameLayout.findViewById(C1283f.image);
        this.f.setImageDrawable(drawable);
        this.a = new a();
        this.a.registerDataSetObserver(new C0347n(this));
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1222d.abc_config_prefDialogWidth));
    }

    public boolean a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.l);
            }
        }
        return true;
    }
}
