package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.appcompat.widget.q reason: case insensitive filesystem */
/* compiled from: AppCompatDrawableManager */
public final class C0350q {
    private static final Mode a = Mode.SRC_IN;
    private static C0350q b;
    private static final c c = new c(6);
    private static final int[] d = {C1252e.abc_textfield_search_default_mtrl_alpha, C1252e.abc_textfield_default_mtrl_alpha, C1252e.abc_ab_share_pack_mtrl_alpha};
    private static final int[] e = {C1252e.abc_ic_commit_search_api_mtrl_alpha, C1252e.abc_seekbar_tick_mark_material, C1252e.abc_ic_menu_share_mtrl_alpha, C1252e.abc_ic_menu_copy_mtrl_am_alpha, C1252e.abc_ic_menu_cut_mtrl_alpha, C1252e.abc_ic_menu_selectall_mtrl_alpha, C1252e.abc_ic_menu_paste_mtrl_am_alpha};
    private static final int[] f = {C1252e.abc_textfield_activated_mtrl_alpha, C1252e.abc_textfield_search_activated_mtrl_alpha, C1252e.abc_cab_background_top_mtrl_alpha, C1252e.abc_text_cursor_material, C1252e.abc_text_select_handle_left_mtrl_dark, C1252e.abc_text_select_handle_middle_mtrl_dark, C1252e.abc_text_select_handle_right_mtrl_dark, C1252e.abc_text_select_handle_left_mtrl_light, C1252e.abc_text_select_handle_middle_mtrl_light, C1252e.abc_text_select_handle_right_mtrl_light};
    private static final int[] g = {C1252e.abc_popup_background_mtrl_mult, C1252e.abc_cab_background_internal_bg, C1252e.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] h = {C1252e.abc_tab_indicator_material, C1252e.abc_textfield_search_material};
    private static final int[] i = {C1252e.abc_btn_check_material, C1252e.abc_btn_radio_material};
    private WeakHashMap<Context, C0516ca<ColorStateList>> j;
    private T<String, d> k;
    private C0516ca<String> l;
    private final WeakHashMap<Context, Y<WeakReference<ConstantState>>> m = new WeakHashMap<>(0);
    private TypedValue n;
    private boolean o;

    /* renamed from: androidx.appcompat.widget.q$a */
    /* compiled from: AppCompatDrawableManager */
    static class a implements d {
        a() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C1499m.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.q$b */
    /* compiled from: AppCompatDrawableManager */
    private static class b implements d {
        b() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C1385ie.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.q$c */
    /* compiled from: AppCompatDrawableManager */
    private static class c extends Z<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }

        private static int b(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: 0000 */
        public PorterDuffColorFilter a(int i, Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(b(i, mode)));
        }

        /* access modifiers changed from: 0000 */
        public PorterDuffColorFilter a(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.q$d */
    /* compiled from: AppCompatDrawableManager */
    private interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.q$e */
    /* compiled from: AppCompatDrawableManager */
    private static class e implements d {
        e() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C1601pe.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    public static synchronized C0350q a() {
        C0350q qVar;
        synchronized (C0350q.class) {
            if (b == null) {
                b = new C0350q();
                a(b);
            }
            qVar = b;
        }
        return qVar;
    }

    private ColorStateList c(Context context) {
        return c(context, 0);
    }

    private Drawable d(Context context, int i2) {
        if (this.n == null) {
            this.n = new TypedValue();
        }
        TypedValue typedValue = this.n;
        context.getResources().getValue(i2, typedValue, true);
        long a2 = a(typedValue);
        Drawable a3 = a(context, a2);
        if (a3 != null) {
            return a3;
        }
        if (i2 == C1252e.abc_cab_background_top_material) {
            a3 = new LayerDrawable(new Drawable[]{a(context, C1252e.abc_cab_background_internal_bg), a(context, C1252e.abc_cab_background_top_mtrl_alpha)});
        }
        if (a3 != null) {
            a3.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, a2, a3);
        }
        return a3;
    }

    private ColorStateList e(Context context, int i2) {
        WeakHashMap<Context, C0516ca<ColorStateList>> weakHashMap = this.j;
        if (weakHashMap == null) {
            return null;
        }
        C0516ca caVar = (C0516ca) weakHashMap.get(context);
        if (caVar != null) {
            return (ColorStateList) caVar.b(i2);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    private Drawable f(Context context, int i2) {
        int next;
        T<String, d> t = this.k;
        if (t == null || t.isEmpty()) {
            return null;
        }
        C0516ca<String> caVar = this.l;
        String str = "appcompat_skip_skip";
        if (caVar != null) {
            String str2 = (String) caVar.b(i2);
            if (str.equals(str2) || (str2 != null && this.k.get(str2) == null)) {
                return null;
            }
        } else {
            this.l = new C0516ca<>();
        }
        if (this.n == null) {
            this.n = new TypedValue();
        }
        TypedValue typedValue = this.n;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long a2 = a(typedValue);
        Drawable a3 = a(context, a2);
        if (a3 != null) {
            return a3;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        if (next != 2) {
                            String name = xml.getName();
                            this.l.a(i2, name);
                            d dVar = (d) this.k.get(name);
                            if (dVar != null) {
                                a3 = dVar.a(context, xml, asAttributeSet, context.getTheme());
                            }
                            if (a3 != null) {
                                a3.setChangingConfigurations(typedValue.changingConfigurations);
                                a(context, a2, a3);
                            }
                        } else {
                            throw new XmlPullParserException("No start tag found");
                        }
                    }
                }
                if (next != 2) {
                }
            } catch (Exception e2) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e2);
            }
        }
        if (a3 == null) {
            this.l.a(i2, str);
        }
        return a3;
    }

    /* access modifiers changed from: 0000 */
    public synchronized ColorStateList b(Context context, int i2) {
        ColorStateList e2;
        e2 = e(context, i2);
        if (e2 == null) {
            if (i2 == C1252e.abc_edit_text_material) {
                e2 = C1437k.a(context, C0511c.abc_tint_edittext);
            } else if (i2 == C1252e.abc_switch_track_mtrl_alpha) {
                e2 = C1437k.a(context, C0511c.abc_tint_switch_track);
            } else if (i2 == C1252e.abc_switch_thumb_material) {
                e2 = f(context);
            } else if (i2 == C1252e.abc_btn_default_mtrl_shape) {
                e2 = e(context);
            } else if (i2 == C1252e.abc_btn_borderless_material) {
                e2 = c(context);
            } else if (i2 == C1252e.abc_btn_colored_material) {
                e2 = d(context);
            } else {
                if (i2 != C1252e.abc_spinner_mtrl_am_alpha) {
                    if (i2 != C1252e.abc_spinner_textfield_background_material) {
                        if (a(e, i2)) {
                            e2 = ia.c(context, C0294a.colorControlNormal);
                        } else if (a(h, i2)) {
                            e2 = C1437k.a(context, C0511c.abc_tint_default);
                        } else if (a(i, i2)) {
                            e2 = C1437k.a(context, C0511c.abc_tint_btn_checkable);
                        } else if (i2 == C1252e.abc_seekbar_thumb_material) {
                            e2 = C1437k.a(context, C0511c.abc_tint_seek_thumb);
                        }
                    }
                }
                e2 = C1437k.a(context, C0511c.abc_tint_spinner);
            }
            if (e2 != null) {
                a(context, i2, e2);
            }
        }
        return e2;
    }

    private ColorStateList c(Context context, int i2) {
        int b2 = ia.b(context, C0294a.colorControlHighlight);
        return new ColorStateList(new int[][]{ia.b, ia.e, ia.c, ia.i}, new int[]{ia.a(context, C0294a.colorButtonNormal), C0301ab.b(b2, i2), C0301ab.b(b2, i2), i2});
    }

    private ColorStateList e(Context context) {
        return c(context, ia.b(context, C0294a.colorButtonNormal));
    }

    private static void a(C0350q qVar) {
        if (VERSION.SDK_INT < 24) {
            qVar.a("vector", (d) new e());
            qVar.a("animated-vector", (d) new b());
            qVar.a("animated-selector", (d) new a());
        }
    }

    public synchronized Drawable a(Context context, int i2) {
        return a(context, i2, false);
    }

    /* access modifiers changed from: 0000 */
    public synchronized Drawable a(Context context, int i2, boolean z) {
        Drawable f2;
        b(context);
        f2 = f(context, i2);
        if (f2 == null) {
            f2 = d(context, i2);
        }
        if (f2 == null) {
            f2 = androidx.core.content.a.c(context, i2);
        }
        if (f2 != null) {
            f2 = a(context, i2, z, f2);
        }
        if (f2 != null) {
            E.b(f2);
        }
        return f2;
    }

    private ColorStateList d(Context context) {
        return c(context, ia.b(context, C0294a.colorAccent));
    }

    public synchronized void a(Context context) {
        Y y = (Y) this.m.get(context);
        if (y != null) {
            y.i();
        }
    }

    private static long a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable a(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList b2 = b(context, i2);
        if (b2 != null) {
            if (E.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable i3 = androidx.core.graphics.drawable.a.i(drawable);
            androidx.core.graphics.drawable.a.a(i3, b2);
            Mode a2 = a(i2);
            if (a2 == null) {
                return i3;
            }
            androidx.core.graphics.drawable.a.a(i3, a2);
            return i3;
        } else if (i2 == C1252e.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            a(layerDrawable.findDrawableByLayerId(16908288), ia.b(context, C0294a.colorControlNormal), a);
            a(layerDrawable.findDrawableByLayerId(16908303), ia.b(context, C0294a.colorControlNormal), a);
            a(layerDrawable.findDrawableByLayerId(16908301), ia.b(context, C0294a.colorControlActivated), a);
            return drawable;
        } else if (i2 == C1252e.abc_ratingbar_material || i2 == C1252e.abc_ratingbar_indicator_material || i2 == C1252e.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            a(layerDrawable2.findDrawableByLayerId(16908288), ia.a(context, C0294a.colorControlNormal), a);
            a(layerDrawable2.findDrawableByLayerId(16908303), ia.b(context, C0294a.colorControlActivated), a);
            a(layerDrawable2.findDrawableByLayerId(16908301), ia.b(context, C0294a.colorControlActivated), a);
            return drawable;
        } else if (a(context, i2, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    private void b(Context context) {
        if (!this.o) {
            this.o = true;
            Drawable a2 = a(context, C1252e.abc_vector_test);
            if (a2 == null || !a(a2)) {
                this.o = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private ColorStateList f(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList c2 = ia.c(context, C0294a.colorSwitchThumbNormal);
        if (c2 == null || !c2.isStateful()) {
            iArr[0] = ia.b;
            iArr2[0] = ia.a(context, C0294a.colorSwitchThumbNormal);
            iArr[1] = ia.f;
            iArr2[1] = ia.b(context, C0294a.colorControlActivated);
            iArr[2] = ia.i;
            iArr2[2] = ia.b(context, C0294a.colorSwitchThumbNormal);
        } else {
            iArr[0] = ia.b;
            iArr2[0] = c2.getColorForState(iArr[0], 0);
            iArr[1] = ia.f;
            iArr2[1] = ia.b(context, C0294a.colorControlActivated);
            iArr[2] = ia.i;
            iArr2[2] = c2.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    private synchronized Drawable a(Context context, long j2) {
        Y y = (Y) this.m.get(context);
        if (y == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) y.b(j2);
        if (weakReference != null) {
            ConstantState constantState = (ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            y.a(j2);
        }
    }

    private synchronized boolean a(Context context, long j2, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        Y y = (Y) this.m.get(context);
        if (y == null) {
            y = new Y();
            this.m.put(context, y);
        }
        y.c(j2, new WeakReference(constantState));
        return true;
    }

    /* access modifiers changed from: 0000 */
    public synchronized Drawable a(Context context, Aa aa, int i2) {
        Drawable f2 = f(context, i2);
        if (f2 == null) {
            f2 = aa.a(i2);
        }
        if (f2 == null) {
            return null;
        }
        return a(context, i2, false, f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061 A[RETURN] */
    static boolean a(Context context, int i2, Drawable drawable) {
        boolean z;
        int i3;
        Mode mode = a;
        int i4 = 16842801;
        if (a(d, i2)) {
            i4 = C0294a.colorControlNormal;
        } else if (a(f, i2)) {
            i4 = C0294a.colorControlActivated;
        } else if (a(g, i2)) {
            mode = Mode.MULTIPLY;
        } else {
            if (i2 == C1252e.abc_list_divider_mtrl_alpha) {
                i4 = 16842800;
                i3 = Math.round(40.8f);
                z = true;
            } else if (i2 != C1252e.abc_dialog_material_background) {
                z = false;
                i3 = -1;
                i4 = 0;
            }
            if (z) {
                return false;
            }
            if (E.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(a(ia.b(context, i4), mode));
            if (i3 != -1) {
                drawable.setAlpha(i3);
            }
            return true;
        }
        z = true;
        i3 = -1;
        if (z) {
        }
    }

    private void a(String str, d dVar) {
        if (this.k == null) {
            this.k = new T<>();
        }
        this.k.put(str, dVar);
    }

    private static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    static Mode a(int i2) {
        if (i2 == C1252e.abc_switch_thumb_material) {
            return Mode.MULTIPLY;
        }
        return null;
    }

    private void a(Context context, int i2, ColorStateList colorStateList) {
        if (this.j == null) {
            this.j = new WeakHashMap<>();
        }
        C0516ca caVar = (C0516ca) this.j.get(context);
        if (caVar == null) {
            caVar = new C0516ca();
            this.j.put(context, caVar);
        }
        caVar.a(i2, colorStateList);
    }

    static void a(Drawable drawable, la laVar, int[] iArr) {
        if (!E.a(drawable) || drawable.mutate() == drawable) {
            if (laVar.d || laVar.c) {
                drawable.setColorFilter(a(laVar.d ? laVar.a : null, laVar.c ? laVar.b : a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    private static PorterDuffColorFilter a(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return a(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized PorterDuffColorFilter a(int i2, Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (C0350q.class) {
            a2 = c.a(i2, mode);
            if (a2 == null) {
                a2 = new PorterDuffColorFilter(i2, mode);
                c.a(i2, mode, a2);
            }
        }
        return a2;
    }

    private static void a(Drawable drawable, int i2, Mode mode) {
        if (E.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = a;
        }
        drawable.setColorFilter(a(i2, mode));
    }

    private static boolean a(Drawable drawable) {
        if (!(drawable instanceof C1601pe)) {
            if (!"android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
                return false;
            }
        }
        return true;
    }
}
