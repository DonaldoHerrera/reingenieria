package defpackage;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Mc reason: default package */
/* compiled from: AccessibilityNodeInfoCompat */
public class Mc {
    private static int a;
    private final AccessibilityNodeInfo b;
    public int c = -1;

    /* renamed from: Mc$a */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a a = new a(1, null);
        public static final a b = new a(2, null);
        public static final a c = new a(4, null);
        public static final a d = new a(8, null);
        public static final a e = new a(16, null);
        public static final a f = new a(32, null);
        public static final a g = new a(64, null);
        public static final a h = new a(128, null);
        public static final a i = new a(256, null, defpackage.Pc.b.class);
        public static final a j = new a(512, null, defpackage.Pc.b.class);
        public static final a k = new a(1024, null, defpackage.Pc.c.class);
        public static final a l = new a(2048, null, defpackage.Pc.c.class);
        public static final a m = new a(4096, null);
        public static final a n = new a(8192, null);
        public static final a o = new a(16384, null);
        public static final a p = new a(32768, null);
        public static final a q = new a(65536, null);
        public static final a r = new a(131072, null, g.class);
        public static final a s = new a(262144, null);
        public static final a t = new a(524288, null);
        public static final a u = new a(1048576, null);
        public static final a v = new a(2097152, null, h.class);
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;
        final Object H;
        private final int I;
        private final CharSequence J;
        private final Class<? extends defpackage.Pc.a> K;
        protected final Pc L;

        static {
            AccessibilityAction accessibilityAction = null;
            a aVar = new a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            w = aVar;
            a aVar2 = new a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, e.class);
            x = aVar2;
            a aVar3 = new a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            y = aVar3;
            a aVar4 = new a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            z = aVar4;
            a aVar5 = new a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            A = aVar5;
            a aVar6 = new a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            B = aVar6;
            a aVar7 = new a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            C = aVar7;
            a aVar8 = new a(VERSION.SDK_INT >= 24 ? AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, f.class);
            D = aVar8;
            a aVar9 = new a(VERSION.SDK_INT >= 26 ? AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, d.class);
            E = aVar9;
            a aVar10 = new a(VERSION.SDK_INT >= 28 ? AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            F = aVar10;
            if (VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            a aVar11 = new a(accessibilityAction, 16908357, null, null, null);
            G = aVar11;
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public int a() {
            if (VERSION.SDK_INT >= 21) {
                return ((AccessibilityAction) this.H).getId();
            }
            return 0;
        }

        public CharSequence b() {
            if (VERSION.SDK_INT >= 21) {
                return ((AccessibilityAction) this.H).getLabel();
            }
            return null;
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends defpackage.Pc.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        public boolean a(View view, Bundle bundle) {
            Class<? extends defpackage.Pc.a> cls;
            String str;
            if (this.L == null) {
                return false;
            }
            defpackage.Pc.a aVar = null;
            Class<? extends defpackage.Pc.a> cls2 = this.K;
            if (cls2 != null) {
                try {
                    defpackage.Pc.a aVar2 = (defpackage.Pc.a) cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        aVar2.a(bundle);
                        aVar = aVar2;
                    } catch (Exception e2) {
                        e = e2;
                        aVar = aVar2;
                        cls = this.K;
                        if (cls != null) {
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to execute command with argument class ViewCommandArgument: ");
                        sb.append(str);
                        Log.e("A11yActionCompat", sb.toString(), e);
                        return this.L.a(view, aVar);
                    }
                } catch (Exception e3) {
                    e = e3;
                    cls = this.K;
                    if (cls != null) {
                        str = "null";
                    } else {
                        str = cls.getName();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to execute command with argument class ViewCommandArgument: ");
                    sb2.append(str);
                    Log.e("A11yActionCompat", sb2.toString(), e);
                    return this.L.a(view, aVar);
                }
            }
            return this.L.a(view, aVar);
        }

        a(Object obj, int i2, CharSequence charSequence, Pc pc, Class<? extends defpackage.Pc.a> cls) {
            this.I = i2;
            this.J = charSequence;
            this.L = pc;
            if (VERSION.SDK_INT < 21 || obj != null) {
                this.H = obj;
            } else {
                this.H = new AccessibilityAction(i2, charSequence);
            }
            this.K = cls;
        }
    }

    /* renamed from: Mc$b */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class b {
        final Object a;

        b(Object obj) {
            this.a = obj;
        }

        public static b a(int i, int i2, boolean z, int i3) {
            int i4 = VERSION.SDK_INT;
            if (i4 >= 21) {
                return new b(CollectionInfo.obtain(i, i2, z, i3));
            }
            if (i4 >= 19) {
                return new b(CollectionInfo.obtain(i, i2, z));
            }
            return new b(null);
        }
    }

    /* renamed from: Mc$c */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class c {
        final Object a;

        c(Object obj) {
            this.a = obj;
        }

        public static c a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = VERSION.SDK_INT;
            if (i5 >= 21) {
                return new c(CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (i5 >= 19) {
                return new c(CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new c(null);
        }

        public int b() {
            if (VERSION.SDK_INT >= 19) {
                return ((CollectionItemInfo) this.a).getColumnSpan();
            }
            return 0;
        }

        public int c() {
            if (VERSION.SDK_INT >= 19) {
                return ((CollectionItemInfo) this.a).getRowIndex();
            }
            return 0;
        }

        public int d() {
            if (VERSION.SDK_INT >= 19) {
                return ((CollectionItemInfo) this.a).getRowSpan();
            }
            return 0;
        }

        public boolean e() {
            if (VERSION.SDK_INT >= 21) {
                return ((CollectionItemInfo) this.a).isSelected();
            }
            return false;
        }

        public int a() {
            if (VERSION.SDK_INT >= 19) {
                return ((CollectionItemInfo) this.a).getColumnIndex();
            }
            return 0;
        }
    }

    private Mc(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.b = accessibilityNodeInfo;
    }

    private void A() {
        if (VERSION.SDK_INT >= 19) {
            this.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private boolean B() {
        return !a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public static Mc a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new Mc(accessibilityNodeInfo);
    }

    public static Mc b(View view) {
        return a(AccessibilityNodeInfo.obtain(view));
    }

    private static String c(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    private void g(View view) {
        SparseArray f = f(view);
        if (f != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < f.size(); i++) {
                if (((WeakReference) f.valueAt(i)).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                f.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    public static Mc x() {
        return a(AccessibilityNodeInfo.obtain());
    }

    public void c(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            this.b.setSource(view, i);
        }
    }

    public void d(View view) {
        this.b.setSource(view);
    }

    @Deprecated
    public void e(boolean z) {
        this.b.setClickable(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Mc.class != obj.getClass()) {
            return false;
        }
        Mc mc = (Mc) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        if (accessibilityNodeInfo == null) {
            if (mc.b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(mc.b)) {
            return false;
        }
        return true;
    }

    public void f(CharSequence charSequence) {
        this.b.setPackageName(charSequence);
    }

    public int h() {
        if (VERSION.SDK_INT >= 16) {
            return this.b.getMovementGranularities();
        }
        return 0;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    public void i(boolean z) {
        this.b.setFocusable(z);
    }

    public void j(boolean z) {
        this.b.setFocused(z);
    }

    public String k() {
        if (VERSION.SDK_INT >= 18) {
            return this.b.getViewIdResourceName();
        }
        return null;
    }

    public boolean l() {
        if (VERSION.SDK_INT >= 16) {
            return this.b.isAccessibilityFocused();
        }
        return false;
    }

    public boolean m() {
        return this.b.isCheckable();
    }

    public boolean n() {
        return this.b.isChecked();
    }

    public void o(boolean z) {
        this.b.setSelected(z);
    }

    public boolean p() {
        return this.b.isEnabled();
    }

    public boolean q() {
        return this.b.isFocusable();
    }

    public boolean r() {
        return this.b.isFocused();
    }

    public boolean s() {
        return this.b.isLongClickable();
    }

    public boolean t() {
        return this.b.isPassword();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        b(rect);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(i());
        sb.append("; className: ");
        sb.append(d());
        sb.append("; text: ");
        sb.append(j());
        sb.append("; contentDescription: ");
        sb.append(f());
        sb.append("; viewId: ");
        sb.append(k());
        sb.append("; checkable: ");
        sb.append(m());
        sb.append("; checked: ");
        sb.append(n());
        sb.append("; focusable: ");
        sb.append(q());
        sb.append("; focused: ");
        sb.append(r());
        sb.append("; selected: ");
        sb.append(v());
        sb.append("; clickable: ");
        sb.append(o());
        sb.append("; longClickable: ");
        sb.append(s());
        sb.append("; enabled: ");
        sb.append(p());
        sb.append("; password: ");
        sb.append(t());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("; scrollable: ");
        sb4.append(u());
        sb.append(sb4.toString());
        sb.append("; [");
        int b2 = b();
        while (b2 != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b2);
            b2 &= ~numberOfTrailingZeros;
            sb.append(c(numberOfTrailingZeros));
            if (b2 != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean u() {
        return this.b.isScrollable();
    }

    public boolean v() {
        return this.b.isSelected();
    }

    public boolean w() {
        if (VERSION.SDK_INT >= 16) {
            return this.b.isVisibleToUser();
        }
        return false;
    }

    public void y() {
        this.b.recycle();
    }

    public AccessibilityNodeInfo z() {
        return this.b;
    }

    public static Mc a(Mc mc) {
        return a(AccessibilityNodeInfo.obtain(mc.b));
    }

    private SparseArray<WeakReference<ClickableSpan>> e(View view) {
        SparseArray<WeakReference<ClickableSpan>> f = f(view);
        if (f != null) {
            return f;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C0230Ma.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> f(View view) {
        return (SparseArray) view.getTag(C0230Ma.tag_accessibility_clickable_spans);
    }

    public int b() {
        return this.b.getActions();
    }

    public void d(Rect rect) {
        this.b.setBoundsInScreen(rect);
    }

    public CharSequence i() {
        return this.b.getPackageName();
    }

    public CharSequence j() {
        if (!B()) {
            return this.b.getText();
        }
        List a2 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List a3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List a4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List a5 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.b.getText(), 0, this.b.getText().length()));
        for (int i = 0; i < a2.size(); i++) {
            spannableString.setSpan(new Jc(((Integer) a5.get(i)).intValue(), this, g().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) a2.get(i)).intValue(), ((Integer) a3.get(i)).intValue(), ((Integer) a4.get(i)).intValue());
        }
        return spannableString;
    }

    public void m(boolean z) {
        if (VERSION.SDK_INT >= 28) {
            this.b.setScreenReaderFocusable(z);
        } else {
            a(1, z);
        }
    }

    @Deprecated
    public void n(boolean z) {
        this.b.setScrollable(z);
    }

    public boolean o() {
        return this.b.isClickable();
    }

    public void p(boolean z) {
        if (VERSION.SDK_INT >= 26) {
            this.b.setShowingHintText(z);
        } else {
            a(4, z);
        }
    }

    public void q(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.b.setVisibleToUser(z);
        }
    }

    public void a(View view) {
        this.b.addChild(view);
    }

    public boolean b(a aVar) {
        if (VERSION.SDK_INT >= 21) {
            return this.b.removeAction((AccessibilityAction) aVar.H);
        }
        return false;
    }

    public int c() {
        return this.b.getChildCount();
    }

    public void d(boolean z) {
        this.b.setChecked(z);
    }

    public CharSequence f() {
        return this.b.getContentDescription();
    }

    public void h(boolean z) {
        this.b.setEnabled(z);
    }

    public void k(boolean z) {
        if (VERSION.SDK_INT >= 28) {
            this.b.setHeading(z);
        } else {
            a(2, z);
        }
    }

    @Deprecated
    public void l(boolean z) {
        this.b.setLongClickable(z);
    }

    public void a(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            this.b.addChild(view, i);
        }
    }

    public void c(View view) {
        this.b.setParent(view);
    }

    public CharSequence d() {
        return this.b.getClassName();
    }

    public void f(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.b.setContentInvalid(z);
        }
    }

    public void h(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void b(int i) {
        if (VERSION.SDK_INT >= 16) {
            this.b.setMovementGranularities(i);
        }
    }

    public void c(Rect rect) {
        this.b.setBoundsInParent(rect);
    }

    public void d(CharSequence charSequence) {
        if (VERSION.SDK_INT >= 21) {
            this.b.setError(charSequence);
        }
    }

    public c e() {
        if (VERSION.SDK_INT >= 19) {
            CollectionItemInfo collectionItemInfo = this.b.getCollectionItemInfo();
            if (collectionItemInfo != null) {
                return new c(collectionItemInfo);
            }
        }
        return null;
    }

    public void a(int i) {
        this.b.addAction(i);
    }

    public void c(boolean z) {
        this.b.setCheckable(z);
    }

    private List<Integer> a(String str) {
        if (VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList integerArrayList = this.b.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            integerArrayList = new ArrayList();
            this.b.getExtras().putIntegerArrayList(str, integerArrayList);
        }
        return integerArrayList;
    }

    public void b(View view, int i) {
        this.c = i;
        if (VERSION.SDK_INT >= 16) {
            this.b.setParent(view, i);
        }
    }

    public void c(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public void e(CharSequence charSequence) {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            this.b.setHintText(charSequence);
        } else if (i >= 19) {
            this.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public Bundle g() {
        if (VERSION.SDK_INT >= 19) {
            return this.b.getExtras();
        }
        return new Bundle();
    }

    public void b(Rect rect) {
        this.b.getBoundsInScreen(rect);
    }

    public void b(CharSequence charSequence) {
        this.b.setClassName(charSequence);
    }

    public void g(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.b.setDismissable(z);
        }
    }

    public void b(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.b.setCollectionItemInfo(obj == null ? null : (CollectionItemInfo) ((c) obj).a);
        }
    }

    public void a(a aVar) {
        if (VERSION.SDK_INT >= 21) {
            this.b.addAction((AccessibilityAction) aVar.H);
        }
    }

    public void g(CharSequence charSequence) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            this.b.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void b(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.b.setCanOpenPopup(z);
        }
    }

    public boolean a(int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return this.b.performAction(i, bundle);
        }
        return false;
    }

    public void a(Rect rect) {
        this.b.getBoundsInParent(rect);
    }

    public void a(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.b.setAccessibilityFocused(z);
        }
    }

    public void a(CharSequence charSequence, View view) {
        int i = VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            A();
            g(view);
            ClickableSpan[] a2 = a(charSequence);
            if (a2 != null && a2.length > 0) {
                g().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C0230Ma.accessibility_action_clickable_span);
                SparseArray e = e(view);
                int i2 = 0;
                while (a2 != null && i2 < a2.length) {
                    int a3 = a(a2[i2], e);
                    e.put(a3, new WeakReference(a2[i2]));
                    a(a2[i2], (Spanned) charSequence, a3);
                    i2++;
                }
            }
        }
    }

    public static ClickableSpan[] a(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private int a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i)).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = a;
        a = i2 + 1;
        return i2;
    }

    private void a(ClickableSpan clickableSpan, Spanned spanned, int i) {
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    public void a(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.b.setCollectionInfo(obj == null ? null : (CollectionInfo) ((b) obj).a);
        }
    }

    public List<a> a() {
        List actionList = VERSION.SDK_INT >= 21 ? this.b.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new a(actionList.get(i)));
        }
        return arrayList;
    }

    private void a(int i, boolean z) {
        Bundle g = g();
        if (g != null) {
            String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
            int i2 = g.getInt(str, 0) & (~i);
            if (!z) {
                i = 0;
            }
            g.putInt(str, i | i2);
        }
    }
}
