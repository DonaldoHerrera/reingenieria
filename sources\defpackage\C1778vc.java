package defpackage;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: vc reason: default package and case insensitive filesystem */
/* compiled from: ViewCompat */
public class C1778vc {
    private static final AtomicInteger a = new AtomicInteger(1);
    private static Field b;
    private static boolean c;
    private static Field d;
    private static boolean e;
    private static WeakHashMap<View, String> f;
    private static WeakHashMap<View, Ec> g = null;
    private static Field h;
    private static boolean i = false;
    private static ThreadLocal<Rect> j;
    private static final int[] k = {C0230Ma.accessibility_custom_action_0, C0230Ma.accessibility_custom_action_1, C0230Ma.accessibility_custom_action_2, C0230Ma.accessibility_custom_action_3, C0230Ma.accessibility_custom_action_4, C0230Ma.accessibility_custom_action_5, C0230Ma.accessibility_custom_action_6, C0230Ma.accessibility_custom_action_7, C0230Ma.accessibility_custom_action_8, C0230Ma.accessibility_custom_action_9, C0230Ma.accessibility_custom_action_10, C0230Ma.accessibility_custom_action_11, C0230Ma.accessibility_custom_action_12, C0230Ma.accessibility_custom_action_13, C0230Ma.accessibility_custom_action_14, C0230Ma.accessibility_custom_action_15, C0230Ma.accessibility_custom_action_16, C0230Ma.accessibility_custom_action_17, C0230Ma.accessibility_custom_action_18, C0230Ma.accessibility_custom_action_19, C0230Ma.accessibility_custom_action_20, C0230Ma.accessibility_custom_action_21, C0230Ma.accessibility_custom_action_22, C0230Ma.accessibility_custom_action_23, C0230Ma.accessibility_custom_action_24, C0230Ma.accessibility_custom_action_25, C0230Ma.accessibility_custom_action_26, C0230Ma.accessibility_custom_action_27, C0230Ma.accessibility_custom_action_28, C0230Ma.accessibility_custom_action_29, C0230Ma.accessibility_custom_action_30, C0230Ma.accessibility_custom_action_31};
    private static a l = new a();

    @SuppressLint({"BanTargetApiAnnotation"})
    @TargetApi(19)
    /* renamed from: vc$a */
    /* compiled from: ViewCompat */
    static class a implements OnGlobalLayoutListener, OnAttachStateChangeListener {
        private WeakHashMap<View, Boolean> a = new WeakHashMap<>();

        a() {
        }

        private void a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    C1778vc.b(view, 16);
                }
                this.a.put(view, Boolean.valueOf(z2));
            }
        }

        public void onGlobalLayout() {
            for (Entry entry : this.a.entrySet()) {
                a((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            a(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }

        private void a(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: vc$b */
    /* compiled from: ViewCompat */
    static abstract class b<T> {
        private final int a;
        private final Class<T> b;
        private final int c;
        private final int d;

        b(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        private boolean a() {
            return VERSION.SDK_INT >= 19;
        }

        /* access modifiers changed from: 0000 */
        public abstract T a(View view);

        /* access modifiers changed from: 0000 */
        public T b(View view) {
            if (b()) {
                return a(view);
            }
            if (a()) {
                T tag = view.getTag(this.a);
                if (this.b.isInstance(tag)) {
                    return tag;
                }
            }
            return null;
        }

        b(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }

        private boolean b() {
            return VERSION.SDK_INT >= this.c;
        }
    }

    /* renamed from: vc$c */
    /* compiled from: ViewCompat */
    public interface c {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* renamed from: vc$d */
    /* compiled from: ViewCompat */
    static class d {
        private static final ArrayList<WeakReference<View>> a = new ArrayList<>();
        private WeakHashMap<View, Boolean> b = null;
        private SparseArray<WeakReference<View>> c = null;
        private WeakReference<KeyEvent> d = null;

        d() {
        }

        private SparseArray<WeakReference<View>> a() {
            if (this.c == null) {
                this.c = new SparseArray<>();
            }
            return this.c;
        }

        private View b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b2 = b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b2 != null) {
                            return b2;
                        }
                    }
                }
                if (c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private boolean c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0230Ma.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((c) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }

        static d a(View view) {
            d dVar = (d) view.getTag(C0230Ma.tag_unhandled_key_event_manager);
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d();
            view.setTag(C0230Ma.tag_unhandled_key_event_manager, dVar2);
            return dVar2;
        }

        private void b() {
            WeakHashMap<View, Boolean> weakHashMap = this.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!a.isEmpty()) {
                synchronized (a) {
                    if (this.b == null) {
                        this.b = new WeakHashMap<>();
                    }
                    for (int size = a.size() - 1; size >= 0; size--) {
                        View view = (View) ((WeakReference) a.get(size)).get();
                        if (view == null) {
                            a.remove(size);
                        } else {
                            this.b.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                b();
            }
            View b2 = b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    a().put(keyCode, new WeakReference(b2));
                }
            }
            return b2 != null;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(KeyEvent keyEvent) {
            WeakReference<KeyEvent> weakReference = this.d;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.d = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray a2 = a();
            if (keyEvent.getAction() == 1) {
                int indexOfKey = a2.indexOfKey(keyEvent.getKeyCode());
                if (indexOfKey >= 0) {
                    weakReference2 = (WeakReference) a2.valueAt(indexOfKey);
                    a2.removeAt(indexOfKey);
                }
            }
            if (weakReference2 == null) {
                weakReference2 = (WeakReference) a2.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && C1778vc.A(view)) {
                c(view, keyEvent);
            }
            return true;
        }
    }

    public static boolean A(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean B(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean C(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C1321gc) {
            return ((C1321gc) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean D(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static boolean E(View view) {
        Boolean bool = (Boolean) d().b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void F(View view) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void G(View view) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 20) {
            view.requestApplyInsets();
        } else if (i2 >= 16) {
            view.requestFitSystemWindows();
        }
    }

    public static void H(View view) {
        if (VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof C1321gc) {
            ((C1321gc) view).stopNestedScroll();
        }
    }

    private static AccessibilityDelegate I(View view) {
        if (i) {
            return null;
        }
        if (h == null) {
            try {
                h = View.class.getDeclaredField("mAccessibilityDelegate");
                h.setAccessible(true);
            } catch (Throwable unused) {
                i = true;
                return null;
            }
        }
        try {
            Object obj = h.get(view);
            if (obj instanceof AccessibilityDelegate) {
                return (AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            i = true;
            return null;
        }
    }

    private static void J(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @Deprecated
    public static boolean a(View view, int i2) {
        return view.canScrollVertically(i2);
    }

    private static Rect b() {
        if (j == null) {
            j = new ThreadLocal<>();
        }
        Rect rect = (Rect) j.get();
        if (rect == null) {
            rect = new Rect();
            j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void c(View view, int i2) {
        int i3 = VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
        } else if (i3 >= 21) {
            Rect b2 = b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            i(view, i2);
            if (z && b2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b2);
            }
        } else {
            i(view, i2);
        }
    }

    public static ColorStateList d(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        return view instanceof C1629qc ? ((C1629qc) view).getSupportBackgroundTintList() : null;
    }

    public static void e(View view, int i2) {
        if (VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i2);
        }
    }

    public static void f(View view, int i2) {
        int i3 = VERSION.SDK_INT;
        if (i3 >= 19) {
            view.setImportantForAccessibility(i2);
        } else if (i3 >= 16) {
            if (i2 == 4) {
                i2 = 2;
            }
            view.setImportantForAccessibility(i2);
        }
    }

    public static void g(View view, int i2) {
        if (VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i2);
        }
    }

    public static float h(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static boolean i(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    public static int j(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    public static int k(View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static int l(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static int m(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!e) {
            try {
                d = View.class.getDeclaredField("mMinHeight");
                d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            e = true;
        }
        Field field = d;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    public static int n(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!c) {
            try {
                b = View.class.getDeclaredField("mMinWidth");
                b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    public static int o(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    public static int p(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    public static ViewParent q(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    public static String r(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f;
        if (weakHashMap == null) {
            return null;
        }
        return (String) weakHashMap.get(view);
    }

    public static float s(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTranslationZ();
        }
        return 0.0f;
    }

    public static int t(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static float u(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static boolean v(View view) {
        return I(view) != null;
    }

    public static boolean w(View view) {
        if (VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static boolean x(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean y(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static boolean z(View view) {
        Boolean bool = (Boolean) a().b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void a(View view, Mc mc) {
        view.onInitializeAccessibilityNodeInfo(mc.z());
    }

    public static void a(View view, C0273Wb wb) {
        AccessibilityDelegate accessibilityDelegate;
        if (wb == null && (I(view) instanceof a)) {
            wb = new C0273Wb();
        }
        if (wb == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = wb.a();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static Mode e(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        return view instanceof C1629qc ? ((C1629qc) view).getSupportBackgroundTintMode() : null;
    }

    public static Display g(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (A(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static void h(View view, int i2) {
        if (view instanceof C1259ec) {
            ((C1259ec) view).a(i2);
        } else if (i2 == 0) {
            H(view);
        }
    }

    private static void i(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            J(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                J((View) parent);
            }
        }
    }

    private static void j(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            J(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                J((View) parent);
            }
        }
    }

    public static Rect f(View view) {
        if (VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static void d(View view, int i2) {
        int i3 = VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
        } else if (i3 >= 21) {
            Rect b2 = b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            j(view, i2);
            if (z && b2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b2);
            }
        } else {
            j(view, i2);
        }
    }

    public static void a(View view, int i2, int i3, int i4, int i5) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(i2, i3, i4, i5);
        } else {
            view.postInvalidate(i2, i3, i4, i5);
        }
    }

    public static void b(View view, boolean z) {
        if (VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    public static void a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static int b(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static void b(View view, int i2, int i3, int i4, int i5) {
        if (VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i2, i3, i4, i5);
        } else {
            view.setPadding(i2, i3, i4, i5);
        }
    }

    public static void a(View view, Runnable runnable, long j2) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j2);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j2);
        }
    }

    public static void b(View view, float f2) {
        if (VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f2);
        }
    }

    public static boolean a(View view, int i2, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i2, bundle);
        }
        return false;
    }

    public static Ic b(View view, Ic ic) {
        if (VERSION.SDK_INT < 21) {
            return ic;
        }
        WindowInsets windowInsets = (WindowInsets) Ic.a(ic);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!onApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return Ic.a((Object) windowInsets);
    }

    public static void a(View view, Paint paint) {
        if (VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
            return;
        }
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    public static CharSequence c(View view) {
        return (CharSequence) c().b(view);
    }

    @SuppressLint({"BanTargetApiAnnotation"})
    @TargetApi(28)
    private static b<CharSequence> c() {
        return new C1718tc(C0230Ma.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static Ec a(View view) {
        if (g == null) {
            g = new WeakHashMap<>();
        }
        Ec ec = (Ec) g.get(view);
        if (ec != null) {
            return ec;
        }
        Ec ec2 = new Ec(view);
        g.put(view, ec2);
        return ec2;
    }

    @SuppressLint({"BanTargetApiAnnotation"})
    @TargetApi(28)
    private static b<Boolean> d() {
        return new C1688sc(C0230Ma.tag_screen_reader_focusable, Boolean.class, 28);
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return d.a(view).a(keyEvent);
    }

    @SuppressLint({"BanTargetApiAnnotation"})
    @TargetApi(19)
    static void b(View view, int i2) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = c(view) != null;
            if (b(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i2);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    Log.e("ViewCompat", sb.toString(), e2);
                }
            }
        }
    }

    public static void a(View view, float f2) {
        if (VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    public static void a(View view, String str) {
        if (VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f == null) {
            f = new WeakHashMap<>();
        }
        f.put(view, str);
    }

    @Deprecated
    public static void a(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static void a(View view, C1506mc mcVar) {
        if (VERSION.SDK_INT >= 21) {
            if (mcVar == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            view.setOnApplyWindowInsetsListener(new C1658rc(mcVar));
        }
    }

    public static Ic a(View view, Ic ic) {
        if (VERSION.SDK_INT < 21) {
            return ic;
        }
        WindowInsets windowInsets = (WindowInsets) Ic.a(ic);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (!dispatchApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return Ic.a((Object) windowInsets);
    }

    public static void a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void a(View view, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C1629qc) {
            ((C1629qc) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static void a(View view, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C1629qc) {
            ((C1629qc) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static void a(View view, Rect rect) {
        if (VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    public static void a(View view, int i2, int i3) {
        if (VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static void a(View view, C1568oc ocVar) {
        if (VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (ocVar != null ? ocVar.a() : null));
        }
    }

    static boolean a(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return d.a(view).a(view, keyEvent);
    }

    @SuppressLint({"BanTargetApiAnnotation"})
    @TargetApi(28)
    private static b<Boolean> a() {
        return new C1748uc(C0230Ma.tag_accessibility_heading, Boolean.class, 28);
    }
}
