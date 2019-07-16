package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.v;
import androidx.appcompat.widget.Aa;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.Ba;
import androidx.appcompat.widget.C;
import androidx.appcompat.widget.C0350q;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.G;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.na;
import androidx.core.app.i;
import androidx.core.widget.k;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AppCompatDelegateImpl */
class w extends n implements androidx.appcompat.view.menu.l.a, Factory2 {
    private static final boolean b = (VERSION.SDK_INT < 21);
    private static final int[] c = {16842836};
    private static boolean d = true;
    private boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    private boolean G;
    private g[] H;
    private g I;
    private boolean J;
    boolean K;
    private int L = -100;
    private boolean M;
    private e N;
    boolean O;
    int P;
    private final Runnable Q = new p(this);
    private boolean R;
    private Rect S;
    private Rect T;
    private AppCompatViewInflater U;
    final Context e;
    final Window f;
    final Callback g;
    final Callback h;
    final m i;
    ActionBar j;
    MenuInflater k;
    private CharSequence l;
    private C m;
    private b n;
    private h o;
    C1712t p;
    ActionBarContextView q;
    PopupWindow r;
    Runnable s;
    Ec t = null;
    private boolean u = true;
    private boolean v;
    private ViewGroup w;
    private TextView x;
    private View y;
    private boolean z;

    /* compiled from: AppCompatDelegateImpl */
    private class a implements C0314a {
        a() {
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private final class b implements androidx.appcompat.view.menu.v.a {
        b() {
        }

        public boolean a(l lVar) {
            Callback p = w.this.p();
            if (p != null) {
                p.onMenuOpened(108, lVar);
            }
            return true;
        }

        public void a(l lVar, boolean z) {
            w.this.b(lVar);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class c implements defpackage.C1712t.a {
        private defpackage.C1712t.a a;

        public c(defpackage.C1712t.a aVar) {
            this.a = aVar;
        }

        public boolean a(C1712t tVar, Menu menu) {
            return this.a.a(tVar, menu);
        }

        public boolean b(C1712t tVar, Menu menu) {
            return this.a.b(tVar, menu);
        }

        public boolean a(C1712t tVar, MenuItem menuItem) {
            return this.a.a(tVar, menuItem);
        }

        public void a(C1712t tVar) {
            this.a.a(tVar);
            w wVar = w.this;
            if (wVar.r != null) {
                wVar.f.getDecorView().removeCallbacks(w.this.s);
            }
            w wVar2 = w.this;
            if (wVar2.q != null) {
                wVar2.m();
                w wVar3 = w.this;
                Ec a2 = C1778vc.a(wVar3.q);
                a2.a(0.0f);
                wVar3.t = a2;
                w.this.t.a((Fc) new x(this));
            }
            w wVar4 = w.this;
            m mVar = wVar4.i;
            if (mVar != null) {
                mVar.onSupportActionModeFinished(wVar4.p);
            }
            w.this.p = null;
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class d extends B {
        d(Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: 0000 */
        public final ActionMode a(ActionMode.Callback callback) {
            defpackage.C1832x.a aVar = new defpackage.C1832x.a(w.this.e, callback);
            C1712t a = w.this.a((defpackage.C1712t.a) aVar);
            if (a != null) {
                return aVar.b(a);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return w.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || w.this.b(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof l)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            w.this.h(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            w.this.i(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            l lVar = menu instanceof l ? (l) menu : null;
            if (i == 0 && lVar == null) {
                return false;
            }
            if (lVar != null) {
                lVar.c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (lVar != null) {
                lVar.c(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            g a = w.this.a(0, true);
            if (a != null) {
                l lVar = a.j;
                if (lVar != null) {
                    super.onProvideKeyboardShortcuts(list, lVar, i);
                    return;
                }
            }
            super.onProvideKeyboardShortcuts(list, menu, i);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (VERSION.SDK_INT >= 23) {
                return null;
            }
            if (w.this.q()) {
                return a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!w.this.q() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return a(callback);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    final class e {
        private H a;
        private boolean b;
        private BroadcastReceiver c;
        private IntentFilter d;

        e(H h) {
            this.a = h;
            this.b = h.a();
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.c;
            if (broadcastReceiver != null) {
                w.this.e.unregisterReceiver(broadcastReceiver);
                this.c = null;
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            boolean a2 = this.a.a();
            if (a2 != this.b) {
                this.b = a2;
                w.this.a();
            }
        }

        /* access modifiers changed from: 0000 */
        public int c() {
            this.b = this.a.a();
            return this.b ? 2 : 1;
        }

        /* access modifiers changed from: 0000 */
        public void d() {
            a();
            if (this.c == null) {
                this.c = new y(this);
            }
            if (this.d == null) {
                this.d = new IntentFilter();
                this.d.addAction("android.intent.action.TIME_SET");
                this.d.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.d.addAction("android.intent.action.TIME_TICK");
            }
            w.this.e.registerReceiver(this.c, this.d);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private class f extends ContentFrameLayout {
        public f(Context context) {
            super(context);
        }

        private boolean a(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return w.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            w.this.e(0);
            return true;
        }

        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(C1437k.b(getContext(), i2));
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    protected static final class g {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        l j;
        j k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        g(int i2) {
            this.a = i2;
        }

        public boolean a() {
            boolean z = false;
            if (this.h == null) {
                return false;
            }
            if (this.i != null) {
                return true;
            }
            if (this.k.c().getCount() > 0) {
                z = true;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        public void a(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0294a.actionBarPopupTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            }
            newTheme.resolveAttribute(C0294a.panelMenuListTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                newTheme.applyStyle(i3, true);
            } else {
                newTheme.applyStyle(C1376i.Theme_AppCompat_CompactMenu, true);
            }
            C1772v vVar = new C1772v(context, 0);
            vVar.getTheme().setTo(newTheme);
            this.l = vVar;
            TypedArray obtainStyledAttributes = vVar.obtainStyledAttributes(C1406j.AppCompatTheme);
            this.b = obtainStyledAttributes.getResourceId(C1406j.AppCompatTheme_panelBackground, 0);
            this.f = obtainStyledAttributes.getResourceId(C1406j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        public void a(l lVar) {
            l lVar2 = this.j;
            if (lVar != lVar2) {
                if (lVar2 != null) {
                    lVar2.b((v) this.k);
                }
                this.j = lVar;
                if (lVar != null) {
                    j jVar = this.k;
                    if (jVar != null) {
                        lVar.a((v) jVar);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public androidx.appcompat.view.menu.w a(androidx.appcompat.view.menu.v.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                this.k = new j(this.l, C1314g.abc_list_menu_item_layout);
                this.k.a(aVar);
                this.j.a((v) this.k);
            }
            return this.k.a(this.g);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private final class h implements androidx.appcompat.view.menu.v.a {
        h() {
        }

        public void a(l lVar, boolean z) {
            l m = lVar.m();
            boolean z2 = m != lVar;
            w wVar = w.this;
            if (z2) {
                lVar = m;
            }
            g a2 = wVar.a((Menu) lVar);
            if (a2 == null) {
                return;
            }
            if (z2) {
                w.this.a(a2.a, a2, m);
                w.this.a(a2, true);
                return;
            }
            w.this.a(a2, z);
        }

        public boolean a(l lVar) {
            if (lVar == null) {
                w wVar = w.this;
                if (wVar.B) {
                    Callback p = wVar.p();
                    if (p != null && !w.this.K) {
                        p.onMenuOpened(108, lVar);
                    }
                }
            }
            return true;
        }
    }

    static {
        if (b && !d) {
            Thread.setDefaultUncaughtExceptionHandler(new o(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    w(Context context, Window window, m mVar) {
        this.e = context;
        this.f = window;
        this.i = mVar;
        this.g = this.f.getCallback();
        Callback callback = this.g;
        if (!(callback instanceof d)) {
            this.h = new d(callback);
            this.f.setCallback(this.h);
            na a2 = na.a(context, (AttributeSet) null, c);
            Drawable c2 = a2.c(0);
            if (c2 != null) {
                this.f.setBackgroundDrawable(c2);
            }
            a2.a();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private boolean A() {
        boolean z2 = false;
        if (this.M) {
            Context context = this.e;
            if (context instanceof Activity) {
                try {
                    if ((context.getPackageManager().getActivityInfo(new ComponentName(this.e, this.e.getClass()), 0).configChanges & 512) == 0) {
                        z2 = true;
                    }
                    return z2;
                } catch (NameNotFoundException e2) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                    return true;
                }
            }
        }
        return false;
    }

    private void B() {
        if (this.v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private int l(int i2) {
        String str = "AppCompatDelegate";
        if (i2 == 8) {
            Log.i(str, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i2 == 9) {
            Log.i(str, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        return i2;
    }

    private void u() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.w.findViewById(16908290);
        View decorView = this.f.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.e.obtainStyledAttributes(C1406j.AppCompatTheme);
        obtainStyledAttributes.getValue(C1406j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C1406j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C1406j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C1406j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C1406j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C1406j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C1406j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C1406j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C1406j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C1406j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private ViewGroup v() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.e.obtainStyledAttributes(C1406j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C1406j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C1406j.AppCompatTheme_windowNoTitle, false)) {
                b(1);
            } else if (obtainStyledAttributes.getBoolean(C1406j.AppCompatTheme_windowActionBar, false)) {
                b(108);
            }
            if (obtainStyledAttributes.getBoolean(C1406j.AppCompatTheme_windowActionBarOverlay, false)) {
                b(109);
            }
            if (obtainStyledAttributes.getBoolean(C1406j.AppCompatTheme_windowActionModeOverlay, false)) {
                b(10);
            }
            this.E = obtainStyledAttributes.getBoolean(C1406j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            this.f.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.e);
            if (this.F) {
                if (this.D) {
                    viewGroup = (ViewGroup) from.inflate(C1314g.abc_screen_simple_overlay_action_mode, null);
                } else {
                    viewGroup = (ViewGroup) from.inflate(C1314g.abc_screen_simple, null);
                }
                if (VERSION.SDK_INT >= 21) {
                    C1778vc.a((View) viewGroup, (C1506mc) new q(this));
                } else {
                    ((G) viewGroup).setOnFitSystemWindowsListener(new r(this));
                }
            } else if (this.E) {
                viewGroup = (ViewGroup) from.inflate(C1314g.abc_dialog_title_material, null);
                this.C = false;
                this.B = false;
            } else if (this.B) {
                TypedValue typedValue = new TypedValue();
                this.e.getTheme().resolveAttribute(C0294a.actionBarTheme, typedValue, true);
                int i2 = typedValue.resourceId;
                if (i2 != 0) {
                    context = new C1772v(this.e, i2);
                } else {
                    context = this.e;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C1314g.abc_screen_toolbar, null);
                this.m = (C) viewGroup.findViewById(C1283f.decor_content_parent);
                this.m.setWindowCallback(p());
                if (this.C) {
                    this.m.a(109);
                }
                if (this.z) {
                    this.m.a(2);
                }
                if (this.A) {
                    this.m.a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.m == null) {
                    this.x = (TextView) viewGroup.findViewById(C1283f.title);
                }
                Ba.b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C1283f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new s(this));
                return viewGroup;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.B);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.C);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.E);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.D);
            sb.append(", windowNoTitle: ");
            sb.append(this.F);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void w() {
        if (this.N == null) {
            this.N = new e(H.a(this.e));
        }
    }

    private void x() {
        if (!this.v) {
            this.w = v();
            CharSequence o2 = o();
            if (!TextUtils.isEmpty(o2)) {
                C c2 = this.m;
                if (c2 != null) {
                    c2.setWindowTitle(o2);
                } else if (s() != null) {
                    s().c(o2);
                } else {
                    TextView textView = this.x;
                    if (textView != null) {
                        textView.setText(o2);
                    }
                }
            }
            u();
            a(this.w);
            this.v = true;
            g a2 = a(0, false);
            if (this.K) {
                return;
            }
            if (a2 == null || a2.j == null) {
                k(108);
            }
        }
    }

    private int y() {
        int i2 = this.L;
        return i2 != -100 ? i2 : n.b();
    }

    private void z() {
        x();
        if (this.B && this.j == null) {
            Callback callback = this.g;
            if (callback instanceof Activity) {
                this.j = new L((Activity) callback, this.C);
            } else if (callback instanceof Dialog) {
                this.j = new L((Dialog) callback);
            }
            ActionBar actionBar = this.j;
            if (actionBar != null) {
                actionBar.c(this.R);
            }
        }
    }

    public void a(Bundle bundle) {
        Callback callback = this.g;
        if (callback instanceof Activity) {
            String str = null;
            try {
                str = i.b((Activity) callback);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar s2 = s();
                if (s2 == null) {
                    this.R = true;
                } else {
                    s2.c(true);
                }
            }
        }
        if (bundle != null && this.L == -100) {
            this.L = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(ViewGroup viewGroup) {
    }

    public void b(Bundle bundle) {
        x();
    }

    public void c(int i2) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.e).inflate(i2, viewGroup);
        this.g.onContentChanged();
    }

    public MenuInflater d() {
        if (this.k == null) {
            z();
            ActionBar actionBar = this.j;
            this.k = new C1862y(actionBar != null ? actionBar.h() : this.e);
        }
        return this.k;
    }

    public ActionBar e() {
        z();
        return this.j;
    }

    public void f() {
        LayoutInflater from = LayoutInflater.from(this.e);
        if (from.getFactory() == null) {
            C0302ac.a(from, this);
        } else if (!(from.getFactory2() instanceof w)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void g() {
        ActionBar e2 = e();
        if (e2 == null || !e2.i()) {
            k(0);
        }
    }

    public void h() {
        if (this.O) {
            this.f.getDecorView().removeCallbacks(this.Q);
        }
        this.K = true;
        ActionBar actionBar = this.j;
        if (actionBar != null) {
            actionBar.j();
        }
        e eVar = this.N;
        if (eVar != null) {
            eVar.a();
        }
    }

    public void i() {
        ActionBar e2 = e();
        if (e2 != null) {
            e2.f(true);
        }
    }

    public void j() {
        a();
    }

    public void k() {
        ActionBar e2 = e();
        if (e2 != null) {
            e2.f(false);
        }
        e eVar = this.N;
        if (eVar != null) {
            eVar.a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void m() {
        Ec ec = this.t;
        if (ec != null) {
            ec.a();
        }
    }

    /* access modifiers changed from: 0000 */
    public final Context n() {
        ActionBar e2 = e();
        Context h2 = e2 != null ? e2.h() : null;
        return h2 == null ? this.e : h2;
    }

    /* access modifiers changed from: 0000 */
    public final CharSequence o() {
        Callback callback = this.g;
        if (callback instanceof Activity) {
            return ((Activity) callback).getTitle();
        }
        return this.l;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return a(view, str, context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    public final Callback p() {
        return this.f.getCallback();
    }

    public boolean q() {
        return this.u;
    }

    /* access modifiers changed from: 0000 */
    public boolean r() {
        C1712t tVar = this.p;
        if (tVar != null) {
            tVar.a();
            return true;
        }
        ActionBar e2 = e();
        if (e2 == null || !e2.f()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final ActionBar s() {
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public final boolean t() {
        if (this.v) {
            ViewGroup viewGroup = this.w;
            if (viewGroup != null && C1778vc.B(viewGroup)) {
                return true;
            }
        }
        return false;
    }

    public void b(View view, LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.g.onContentChanged();
    }

    /* access modifiers changed from: 0000 */
    public int j(int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        ActionBarContextView actionBarContextView = this.q;
        int i3 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof MarginLayoutParams)) {
            z2 = false;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.q.getLayoutParams();
            z2 = true;
            if (this.q.isShown()) {
                if (this.S == null) {
                    this.S = new Rect();
                    this.T = new Rect();
                }
                Rect rect = this.S;
                Rect rect2 = this.T;
                rect.set(0, i2, 0, 0);
                Ba.a(this.w, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.y;
                    if (view == null) {
                        this.y = new View(this.e);
                        this.y.setBackgroundColor(this.e.getResources().getColor(C0511c.abc_input_method_navigation_guard));
                        this.w.addView(this.y, -1, new LayoutParams(-1, i2));
                    } else {
                        LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.y.setLayoutParams(layoutParams);
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.y == null) {
                    z2 = false;
                }
                if (!this.D && z2) {
                    i2 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z4 = true;
                } else {
                    z4 = false;
                }
                z2 = false;
            }
            if (z3) {
                this.q.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.y;
        if (view2 != null) {
            if (!z2) {
                i3 = 8;
            }
            view2.setVisibility(i3);
        }
        return i2;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private boolean m(int i2) {
        Resources resources = this.e.getResources();
        Configuration configuration = resources.getConfiguration();
        int i3 = configuration.uiMode & 48;
        int i4 = i2 == 2 ? 32 : 16;
        if (i3 == i4) {
            return false;
        }
        if (A()) {
            ((Activity) this.e).recreate();
        } else {
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i4 | (configuration2.uiMode & -49);
            resources.updateConfiguration(configuration2, displayMetrics);
            if (VERSION.SDK_INT < 26) {
                C.a(resources);
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void e(int i2) {
        a(a(i2, true), true);
    }

    /* access modifiers changed from: 0000 */
    public void i(int i2) {
        if (i2 == 108) {
            ActionBar e2 = e();
            if (e2 != null) {
                e2.b(false);
            }
        } else if (i2 == 0) {
            g a2 = a(i2, true);
            if (a2.o) {
                a(a2, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void l() {
        C c2 = this.m;
        if (c2 != null) {
            c2.g();
        }
        if (this.r != null) {
            this.f.getDecorView().removeCallbacks(this.s);
            if (this.r.isShowing()) {
                try {
                    this.r.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.r = null;
        }
        m();
        g a2 = a(0, false);
        if (a2 != null) {
            l lVar = a2.j;
            if (lVar != null) {
                lVar.close();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    private boolean e(int i2, KeyEvent keyEvent) {
        boolean z2;
        boolean z3;
        if (this.p != null) {
            return false;
        }
        g a2 = a(i2, true);
        if (i2 == 0) {
            C c2 = this.m;
            if (c2 != null && c2.a() && !ViewConfiguration.get(this.e).hasPermanentMenuKey()) {
                if (!this.m.d()) {
                    if (!this.K && b(a2, keyEvent)) {
                        z2 = this.m.c();
                    }
                    z2 = false;
                } else {
                    z2 = this.m.b();
                }
                if (z2) {
                    AudioManager audioManager = (AudioManager) this.e.getSystemService("audio");
                    if (audioManager != null) {
                        audioManager.playSoundEffect(0);
                    } else {
                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                    }
                }
                return z2;
            }
        }
        if (a2.o || a2.n) {
            z2 = a2.o;
            a(a2, true);
            if (z2) {
            }
            return z2;
        }
        if (a2.m) {
            if (a2.r) {
                a2.m = false;
                z3 = b(a2, keyEvent);
            } else {
                z3 = true;
            }
            if (z3) {
                a(a2, keyEvent);
                z2 = true;
                if (z2) {
                }
                return z2;
            }
        }
        z2 = false;
        if (z2) {
        }
        return z2;
    }

    /* access modifiers changed from: 0000 */
    public int g(int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != 0) {
            return i2;
        }
        if (VERSION.SDK_INT >= 23 && ((UiModeManager) this.e.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        w();
        return this.N.c();
    }

    private void k(int i2) {
        this.P = (1 << i2) | this.P;
        if (!this.O) {
            C1778vc.a(this.f.getDecorView(), this.Q);
            this.O = true;
        }
    }

    private boolean d(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            g a2 = a(i2, true);
            if (!a2.o) {
                return b(a2, keyEvent);
            }
        }
        return false;
    }

    public void c(Bundle bundle) {
        int i2 = this.L;
        if (i2 != -100) {
            bundle.putInt("appcompat:local_night_mode", i2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void f(int i2) {
        g a2 = a(i2, true);
        if (a2.j != null) {
            Bundle bundle = new Bundle();
            a2.j.c(bundle);
            if (bundle.size() > 0) {
                a2.s = bundle;
            }
            a2.j.s();
            a2.j.clear();
        }
        a2.r = true;
        a2.q = true;
        if ((i2 == 108 || i2 == 0) && this.m != null) {
            g a3 = a(0, false);
            if (a3 != null) {
                a3.m = false;
                b(a3, (KeyEvent) null);
            }
        }
    }

    public boolean b(int i2) {
        int l2 = l(i2);
        if (this.F && l2 == 108) {
            return false;
        }
        if (this.B && l2 == 1) {
            this.B = false;
        }
        if (l2 == 1) {
            B();
            this.F = true;
            return true;
        } else if (l2 == 2) {
            B();
            this.z = true;
            return true;
        } else if (l2 == 5) {
            B();
            this.A = true;
            return true;
        } else if (l2 == 10) {
            B();
            this.D = true;
            return true;
        } else if (l2 == 108) {
            B();
            this.B = true;
            return true;
        } else if (l2 != 109) {
            return this.f.requestFeature(l2);
        } else {
            B();
            this.C = true;
            return true;
        }
    }

    public void a(Toolbar toolbar) {
        if (this.g instanceof Activity) {
            ActionBar e2 = e();
            if (!(e2 instanceof L)) {
                this.k = null;
                if (e2 != null) {
                    e2.j();
                }
                if (toolbar != null) {
                    F f2 = new F(toolbar, ((Activity) this.g).getTitle(), this.h);
                    this.j = f2;
                    this.f.setCallback(f2.l());
                } else {
                    this.j = null;
                    this.f.setCallback(this.h);
                }
                g();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean c(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z2 = this.J;
            this.J = false;
            g a2 = a(0, false);
            if (a2 != null && a2.o) {
                if (!z2) {
                    a(a2, true);
                }
                return true;
            } else if (r()) {
                return true;
            }
        } else if (i2 == 82) {
            e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void h(int i2) {
        if (i2 == 108) {
            ActionBar e2 = e();
            if (e2 != null) {
                e2.b(true);
            }
        }
    }

    private boolean c(g gVar) {
        Context context = this.e;
        int i2 = gVar.a;
        if ((i2 == 0 || i2 == 108) && this.m != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(C0294a.actionBarTheme, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0294a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0294a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C1772v vVar = new C1772v(context, 0);
                vVar.getTheme().setTo(theme2);
                context = vVar;
            }
        }
        l lVar = new l(context);
        lVar.a((androidx.appcompat.view.menu.l.a) this);
        gVar.a(lVar);
        return true;
    }

    public <T extends View> T a(int i2) {
        x();
        return this.f.findViewById(i2);
    }

    public void a(Configuration configuration) {
        if (this.B && this.v) {
            ActionBar e2 = e();
            if (e2 != null) {
                e2.a(configuration);
            }
        }
        C0350q.a().a(this.e);
        a();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0169  */
    public C1712t b(defpackage.C1712t.a aVar) {
        C1712t tVar;
        C1712t tVar2;
        Context context;
        m();
        C1712t tVar3 = this.p;
        if (tVar3 != null) {
            tVar3.a();
        }
        if (!(aVar instanceof c)) {
            aVar = new c(aVar);
        }
        m mVar = this.i;
        if (mVar != null && !this.K) {
            try {
                tVar = mVar.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
            }
            if (tVar == null) {
                this.p = tVar;
            } else {
                boolean z2 = true;
                if (this.q == null) {
                    if (this.E) {
                        TypedValue typedValue = new TypedValue();
                        Theme theme = this.e.getTheme();
                        theme.resolveAttribute(C0294a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Theme newTheme = this.e.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            C1772v vVar = new C1772v(this.e, 0);
                            vVar.getTheme().setTo(newTheme);
                            context = vVar;
                        } else {
                            context = this.e;
                        }
                        this.q = new ActionBarContextView(context);
                        this.r = new PopupWindow(context, null, C0294a.actionModePopupWindowStyle);
                        k.a(this.r, 2);
                        this.r.setContentView(this.q);
                        this.r.setWidth(-1);
                        context.getTheme().resolveAttribute(C0294a.actionBarSize, typedValue, true);
                        this.q.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.r.setHeight(-2);
                        this.s = new u(this);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.w.findViewById(C1283f.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(n()));
                            this.q = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.q != null) {
                    m();
                    this.q.c();
                    Context context2 = this.q.getContext();
                    ActionBarContextView actionBarContextView = this.q;
                    if (this.r != null) {
                        z2 = false;
                    }
                    C1802w wVar = new C1802w(context2, actionBarContextView, aVar, z2);
                    if (aVar.a((C1712t) wVar, wVar.c())) {
                        wVar.i();
                        this.q.a(wVar);
                        this.p = wVar;
                        if (t()) {
                            this.q.setAlpha(0.0f);
                            Ec a2 = C1778vc.a(this.q);
                            a2.a(1.0f);
                            this.t = a2;
                            this.t.a((Fc) new v(this));
                        } else {
                            this.q.setAlpha(1.0f);
                            this.q.setVisibility(0);
                            this.q.sendAccessibilityEvent(32);
                            if (this.q.getParent() instanceof View) {
                                C1778vc.G((View) this.q.getParent());
                            }
                        }
                        if (this.r != null) {
                            this.f.getDecorView().post(this.s);
                        }
                    } else {
                        this.p = null;
                    }
                }
            }
            tVar2 = this.p;
            if (tVar2 != null) {
                m mVar2 = this.i;
                if (mVar2 != null) {
                    mVar2.onSupportActionModeStarted(tVar2);
                }
            }
            return this.p;
        }
        tVar = null;
        if (tVar == null) {
        }
        tVar2 = this.p;
        if (tVar2 != null) {
        }
        return this.p;
    }

    public void a(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.g.onContentChanged();
    }

    public void a(View view, LayoutParams layoutParams) {
        x();
        ((ViewGroup) this.w.findViewById(16908290)).addView(view, layoutParams);
        this.g.onContentChanged();
    }

    public final C0314a c() {
        return new a();
    }

    public final void a(CharSequence charSequence) {
        this.l = charSequence;
        C c2 = this.m;
        if (c2 != null) {
            c2.setWindowTitle(charSequence);
        } else if (s() != null) {
            s().c(charSequence);
        } else {
            TextView textView = this.x;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public boolean a(l lVar, MenuItem menuItem) {
        Callback p2 = p();
        if (p2 != null && !this.K) {
            g a2 = a((Menu) lVar.m());
            if (a2 != null) {
                return p2.onMenuItemSelected(a2.a, menuItem);
            }
        }
        return false;
    }

    public void a(l lVar) {
        a(lVar, true);
    }

    public C1712t a(defpackage.C1712t.a aVar) {
        if (aVar != null) {
            C1712t tVar = this.p;
            if (tVar != null) {
                tVar.a();
            }
            c cVar = new c(aVar);
            ActionBar e2 = e();
            if (e2 != null) {
                this.p = e2.a((defpackage.C1712t.a) cVar);
                C1712t tVar2 = this.p;
                if (tVar2 != null) {
                    m mVar = this.i;
                    if (mVar != null) {
                        mVar.onSupportActionModeStarted(tVar2);
                    }
                }
            }
            if (this.p == null) {
                this.p = b((defpackage.C1712t.a) cVar);
            }
            return this.p;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: 0000 */
    public boolean a(KeyEvent keyEvent) {
        Callback callback = this.g;
        boolean z2 = true;
        if ((callback instanceof defpackage.C0291_b.a) || (callback instanceof A)) {
            View decorView = this.f.getDecorView();
            if (decorView != null && C0291_b.a(decorView, keyEvent)) {
                return true;
            }
        }
        if (keyEvent.getKeyCode() == 82 && this.g.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z2 = false;
        }
        return z2 ? a(keyCode, keyEvent) : c(keyCode, keyEvent);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(int i2, KeyEvent keyEvent) {
        boolean z2 = true;
        if (i2 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z2 = false;
            }
            this.J = z2;
        } else if (i2 == 82) {
            d(0, keyEvent);
            return true;
        }
        return false;
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        boolean z3 = false;
        if (this.U == null) {
            String string = this.e.obtainStyledAttributes(C1406j.AppCompatTheme).getString(C1406j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.U = new AppCompatViewInflater();
            } else {
                try {
                    this.U = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    Log.i("AppCompatDelegate", sb.toString(), th);
                    this.U = new AppCompatViewInflater();
                }
            }
        }
        if (b) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z3 = a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z3 = true;
            }
            z2 = z3;
        } else {
            z2 = false;
        }
        return this.U.createView(view, str, context, attributeSet, z2, b, true, Aa.b());
    }

    /* access modifiers changed from: 0000 */
    public boolean b(int i2, KeyEvent keyEvent) {
        ActionBar e2 = e();
        if (e2 != null && e2.a(i2, keyEvent)) {
            return true;
        }
        g gVar = this.I;
        if (gVar == null || !a(gVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.I == null) {
                g a2 = a(0, true);
                b(a2, keyEvent);
                boolean a3 = a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        }
        g gVar2 = this.I;
        if (gVar2 != null) {
            gVar2.n = true;
        }
        return true;
    }

    private boolean a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C1778vc.A((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private void a(g gVar, KeyEvent keyEvent) {
        int i2;
        if (!gVar.o && !this.K) {
            if (gVar.a == 0) {
                if ((this.e.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Callback p2 = p();
            if (p2 == null || p2.onMenuOpened(gVar.a, gVar.j)) {
                WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
                if (windowManager != null && b(gVar, keyEvent)) {
                    if (gVar.g == null || gVar.q) {
                        ViewGroup viewGroup = gVar.g;
                        if (viewGroup == null) {
                            if (!b(gVar) || gVar.g == null) {
                                return;
                            }
                        } else if (gVar.q && viewGroup.getChildCount() > 0) {
                            gVar.g.removeAllViews();
                        }
                        if (a(gVar) && gVar.a()) {
                            LayoutParams layoutParams = gVar.h.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new LayoutParams(-2, -2);
                            }
                            gVar.g.setBackgroundResource(gVar.b);
                            ViewParent parent = gVar.h.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(gVar.h);
                            }
                            gVar.g.addView(gVar.h, layoutParams);
                            if (!gVar.h.hasFocus()) {
                                gVar.h.requestFocus();
                            }
                        }
                    } else {
                        View view = gVar.i;
                        if (view != null) {
                            LayoutParams layoutParams2 = view.getLayoutParams();
                            if (layoutParams2 != null && layoutParams2.width == -1) {
                                i2 = -1;
                                gVar.n = false;
                                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, gVar.d, gVar.e, CloseCodes.PROTOCOL_ERROR, 8519680, -3);
                                layoutParams3.gravity = gVar.c;
                                layoutParams3.windowAnimations = gVar.f;
                                windowManager.addView(gVar.g, layoutParams3);
                                gVar.o = true;
                            }
                        }
                    }
                    i2 = -2;
                    gVar.n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, gVar.d, gVar.e, CloseCodes.PROTOCOL_ERROR, 8519680, -3);
                    layoutParams32.gravity = gVar.c;
                    layoutParams32.windowAnimations = gVar.f;
                    windowManager.addView(gVar.g, layoutParams32);
                    gVar.o = true;
                }
            } else {
                a(gVar, true);
            }
        }
    }

    private boolean b(g gVar) {
        gVar.a(n());
        gVar.g = new f(gVar.l);
        gVar.c = 81;
        return true;
    }

    private boolean b(g gVar, KeyEvent keyEvent) {
        if (this.K) {
            return false;
        }
        if (gVar.m) {
            return true;
        }
        g gVar2 = this.I;
        if (!(gVar2 == null || gVar2 == gVar)) {
            a(gVar2, false);
        }
        Callback p2 = p();
        if (p2 != null) {
            gVar.i = p2.onCreatePanelView(gVar.a);
        }
        int i2 = gVar.a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2) {
            C c2 = this.m;
            if (c2 != null) {
                c2.e();
            }
        }
        if (gVar.i == null && (!z2 || !(s() instanceof F))) {
            if (gVar.j == null || gVar.r) {
                if (gVar.j == null && (!c(gVar) || gVar.j == null)) {
                    return false;
                }
                if (z2 && this.m != null) {
                    if (this.n == null) {
                        this.n = new b();
                    }
                    this.m.a(gVar.j, this.n);
                }
                gVar.j.s();
                if (!p2.onCreatePanelMenu(gVar.a, gVar.j)) {
                    gVar.a((l) null);
                    if (z2) {
                        C c3 = this.m;
                        if (c3 != null) {
                            c3.a(null, this.n);
                        }
                    }
                    return false;
                }
                gVar.r = false;
            }
            gVar.j.s();
            Bundle bundle = gVar.s;
            if (bundle != null) {
                gVar.j.a(bundle);
                gVar.s = null;
            }
            if (!p2.onPreparePanel(0, gVar.i, gVar.j)) {
                if (z2) {
                    C c4 = this.m;
                    if (c4 != null) {
                        c4.a(null, this.n);
                    }
                }
                gVar.j.r();
                return false;
            }
            gVar.p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            gVar.j.setQwertyMode(gVar.p);
            gVar.j.r();
        }
        gVar.m = true;
        gVar.n = false;
        this.I = gVar;
        return true;
    }

    private void a(l lVar, boolean z2) {
        C c2 = this.m;
        if (c2 == null || !c2.a() || (ViewConfiguration.get(this.e).hasPermanentMenuKey() && !this.m.f())) {
            g a2 = a(0, true);
            a2.q = true;
            a(a2, false);
            a(a2, (KeyEvent) null);
            return;
        }
        Callback p2 = p();
        if (this.m.d() && z2) {
            this.m.b();
            if (!this.K) {
                p2.onPanelClosed(108, a(0, true).j);
            }
        } else if (p2 != null && !this.K) {
            if (this.O && (this.P & 1) != 0) {
                this.f.getDecorView().removeCallbacks(this.Q);
                this.Q.run();
            }
            g a3 = a(0, true);
            l lVar2 = a3.j;
            if (lVar2 != null && !a3.r && p2.onPreparePanel(0, a3.i, lVar2)) {
                p2.onMenuOpened(108, a3.j);
                this.m.c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(l lVar) {
        if (!this.G) {
            this.G = true;
            this.m.g();
            Callback p2 = p();
            if (p2 != null && !this.K) {
                p2.onPanelClosed(108, lVar);
            }
            this.G = false;
        }
    }

    private boolean a(g gVar) {
        View view = gVar.i;
        boolean z2 = true;
        if (view != null) {
            gVar.h = view;
            return true;
        } else if (gVar.j == null) {
            return false;
        } else {
            if (this.o == null) {
                this.o = new h();
            }
            gVar.h = (View) gVar.a((androidx.appcompat.view.menu.v.a) this.o);
            if (gVar.h == null) {
                z2 = false;
            }
            return z2;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(g gVar, boolean z2) {
        if (z2 && gVar.a == 0) {
            C c2 = this.m;
            if (c2 != null && c2.d()) {
                b(gVar.j);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && gVar.o) {
            ViewGroup viewGroup = gVar.g;
            if (viewGroup != null) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    a(gVar.a, gVar, null);
                }
            }
        }
        gVar.m = false;
        gVar.n = false;
        gVar.o = false;
        gVar.h = null;
        gVar.q = true;
        if (this.I == gVar) {
            this.I = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, g gVar, Menu menu) {
        if (menu == null) {
            if (gVar == null && i2 >= 0) {
                g[] gVarArr = this.H;
                if (i2 < gVarArr.length) {
                    gVar = gVarArr[i2];
                }
            }
            if (gVar != null) {
                menu = gVar.j;
            }
        }
        if ((gVar == null || gVar.o) && !this.K) {
            this.g.onPanelClosed(i2, menu);
        }
    }

    /* access modifiers changed from: 0000 */
    public g a(Menu menu) {
        g[] gVarArr = this.H;
        int length = gVarArr != null ? gVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            g gVar = gVarArr[i2];
            if (gVar != null && gVar.j == menu) {
                return gVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public g a(int i2, boolean z2) {
        g[] gVarArr = this.H;
        if (gVarArr == null || gVarArr.length <= i2) {
            g[] gVarArr2 = new g[(i2 + 1)];
            if (gVarArr != null) {
                System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
            }
            this.H = gVarArr2;
            gVarArr = gVarArr2;
        }
        g gVar = gVarArr[i2];
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(i2);
        gVarArr[i2] = gVar2;
        return gVar2;
    }

    private boolean a(g gVar, int i2, KeyEvent keyEvent, int i3) {
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if (gVar.m || b(gVar, keyEvent)) {
            l lVar = gVar.j;
            if (lVar != null) {
                z2 = lVar.performShortcut(i2, keyEvent, i3);
            }
        }
        if (z2 && (i3 & 1) == 0 && this.m == null) {
            a(gVar, true);
        }
        return z2;
    }

    public boolean a() {
        int y2 = y();
        int g2 = g(y2);
        boolean m2 = g2 != -1 ? m(g2) : false;
        if (y2 == 0) {
            w();
            this.N.d();
        }
        this.M = true;
        return m2;
    }
}
