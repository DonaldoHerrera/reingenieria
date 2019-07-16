package com.moat.analytics.mobile.scl;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ListView;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

class b {
    i a;
    final String b;
    final boolean c;
    boolean d;
    private WeakReference<View> e;
    private WeakReference<WebView> f;
    private final boolean g;
    private boolean h;
    private a i;
    private JSONObject j;
    private Rect k;
    private Rect l;
    private JSONObject m;
    private JSONObject n;
    private Map<String, Object> o = new HashMap();
    private String p = "{}";

    private class a {
        Rect a;
        double b;
        double c = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

        a(Rect rect, double d2) {
            this.a = rect;
            this.b = d2;
        }
    }

    b(View view, boolean z, boolean z2) {
        String str;
        n.a(3, "MoatBaseTracker", (Object) this, "Initializing.");
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("m");
            sb.append(hashCode());
            str = sb.toString();
        } else {
            str = "";
        }
        this.b = str;
        this.e = new WeakReference<>(view);
        this.g = z;
        this.c = z2;
        this.d = false;
        this.h = false;
        this.i = new a(new Rect(0, 0, 0, 0), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    private float a(View view) {
        float alpha = view.getAlpha();
        while (view != null && view.getParent() != null && ((double) alpha) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && (view.getParent() instanceof View)) {
            alpha *= ((View) view.getParent()).getAlpha();
            view = (View) view.getParent();
        }
        return alpha;
    }

    private static int a(Rect rect) {
        return rect.width() * rect.height();
    }

    static int a(Rect rect, Set<Rect> set) {
        int i2 = 0;
        if (set.isEmpty()) {
            return 0;
        }
        ArrayList<Rect> arrayList = new ArrayList<>();
        arrayList.addAll(set);
        Collections.sort(arrayList, new Comparator<Rect>() {
            /* renamed from: a */
            public int compare(Rect rect, Rect rect2) {
                return Integer.valueOf(rect.top).compareTo(Integer.valueOf(rect2.top));
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Rect rect2 : arrayList) {
            arrayList2.add(Integer.valueOf(rect2.left));
            arrayList2.add(Integer.valueOf(rect2.right));
        }
        Collections.sort(arrayList2);
        int i3 = 0;
        while (i2 < arrayList2.size() - 1) {
            int i4 = i2 + 1;
            if (!((Integer) arrayList2.get(i2)).equals(arrayList2.get(i4))) {
                Rect rect3 = new Rect(((Integer) arrayList2.get(i2)).intValue(), rect.top, ((Integer) arrayList2.get(i4)).intValue(), rect.bottom);
                int i5 = rect.top;
                for (Rect rect4 : arrayList) {
                    if (Rect.intersects(rect4, rect3)) {
                        if (rect4.bottom > i5) {
                            i3 += rect3.width() * (rect4.bottom - Math.max(i5, rect4.top));
                            i5 = rect4.bottom;
                        }
                        if (rect4.bottom == rect3.bottom) {
                            break;
                        }
                    }
                }
            }
            i2 = i4;
        }
        return i3;
    }

    private Rect a(DisplayMetrics displayMetrics) {
        return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    private a a(Rect rect, boolean z, boolean z2, boolean z3) {
        a aVar = new a(new Rect(0, 0, 0, 0), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        int a2 = a(rect);
        if (k() && z && z2 && !z3 && a2 > 0) {
            Rect rect2 = new Rect(0, 0, 0, 0);
            if (c().getGlobalVisibleRect(rect2)) {
                int a3 = a(rect2);
                HashSet hashSet = new HashSet();
                if (c().getRootView() instanceof ViewGroup) {
                    aVar.a = rect2;
                    boolean a4 = a(rect2, c(), hashSet);
                    if (a4) {
                        aVar.c = 1.0d;
                    }
                    if (!a4) {
                        int a5 = a(rect2, (Set<Rect>) hashSet);
                        if (a5 > 0) {
                            aVar.c = ((double) a5) / (((double) a3) * 1.0d);
                        }
                        aVar.b = ((double) (a3 - a5)) / (((double) a2) * 1.0d);
                    }
                }
            }
        }
        return aVar;
    }

    private Map<String, String> a(Rect rect, DisplayMetrics displayMetrics) {
        return b(b(rect, displayMetrics));
    }

    private static boolean a(Rect rect, View view, Set<Rect> set) {
        View rootView = view.getRootView();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(rootView);
        String str = "MoatBaseTracker";
        n.b(2, str, view, "starting covering rect search");
        int i2 = 0;
        boolean z = false;
        while (!arrayDeque.isEmpty() && i2 < 250) {
            i2++;
            View view2 = (View) arrayDeque.pollLast();
            if (view2.equals(view)) {
                n.b(2, str, rect, "found target");
                z = true;
            } else if (b(view2)) {
                if ((view2 instanceof ViewGroup) && !(view2 instanceof ListView)) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        arrayDeque.add(viewGroup.getChildAt(childCount));
                    }
                }
                if (VERSION.SDK_INT < 21 ? z : !(view2.getElevation() <= view.getElevation() && (!z || view2.getElevation() != view.getElevation()))) {
                    Rect c2 = c(view2);
                    if (c2.setIntersect(rect, c2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Covered by ");
                        sb.append(view2.getClass().getSimpleName());
                        sb.append("-");
                        sb.append(c2.toString());
                        n.b(2, str, view2, sb.toString());
                        set.add(c2);
                        if (c2.contains(rect)) {
                            return true;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private Rect b(Rect rect, DisplayMetrics displayMetrics) {
        float f2 = displayMetrics.density;
        if (f2 == 0.0f) {
            return rect;
        }
        return new Rect(Math.round(((float) rect.left) / f2), Math.round(((float) rect.top) / f2), Math.round(((float) rect.right) / f2), Math.round(((float) rect.bottom) / f2));
    }

    private static Map<String, String> b(Rect rect) {
        HashMap hashMap = new HashMap();
        hashMap.put("x", String.valueOf(rect.left));
        hashMap.put("y", String.valueOf(rect.top));
        hashMap.put("w", String.valueOf(rect.right - rect.left));
        hashMap.put("h", String.valueOf(rect.bottom - rect.top));
        return hashMap;
    }

    private static boolean b(View view) {
        return view.isShown() && ((double) view.getAlpha()) > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    private static Rect c(View view) {
        int[] iArr = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        return new Rect(i2, i3, view.getWidth() + i2, view.getHeight() + i3);
    }

    private void d() {
        String str;
        com.moat.analytics.mobile.scl.a.a.a.a(this.f);
        String str2 = "MoatBaseTracker";
        n.a(3, str2, (Object) this, "Attempting bridge installation.");
        if (i()) {
            if (!this.g && !this.c) {
                this.a = new i(j(), a.WEBVIEW);
            }
            boolean z = this.a.a;
            StringBuilder sb = new StringBuilder();
            sb.append("Bridge ");
            sb.append(z ? "" : "not ");
            sb.append("installed.");
            str = sb.toString();
        } else {
            this.a = null;
            str = "Bridge not installed, WebView is null.";
        }
        n.a(3, str2, (Object) this, str);
    }

    private boolean e() {
        boolean z = true;
        if (VERSION.SDK_INT >= 19) {
            if (!k() || !c().isAttachedToWindow()) {
                z = false;
            }
            return z;
        }
        if (!k() || c().getWindowToken() == null) {
            z = false;
        }
        return z;
    }

    private boolean f() {
        return k() && c().hasWindowFocus();
    }

    private boolean g() {
        return !k() || !c().isShown();
    }

    private float h() {
        if (!k()) {
            return 0.0f;
        }
        return a(c());
    }

    private boolean i() {
        return j() != null;
    }

    private WebView j() {
        return (WebView) this.f.get();
    }

    private boolean k() {
        return c() != null;
    }

    private DisplayMetrics l() {
        if (VERSION.SDK_INT >= 17) {
            WeakReference<Activity> weakReference = a.a;
            if (weakReference != null) {
                Activity activity = (Activity) weakReference.get();
                if (activity != null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                    return displayMetrics;
                }
            }
        }
        return c().getContext().getResources().getDisplayMetrics();
    }

    /* access modifiers changed from: 0000 */
    public String a() {
        HashMap hashMap = new HashMap();
        String str = "{}";
        try {
            if (!k()) {
                return str;
            }
            DisplayMetrics l2 = l();
            boolean e2 = e();
            boolean f2 = f();
            boolean g2 = g();
            float h2 = h();
            hashMap.put("dr", Float.valueOf(l2.density));
            hashMap.put("dv", Double.valueOf(p.a()));
            hashMap.put("adKey", this.b);
            boolean z = false;
            hashMap.put("isAttached", Integer.valueOf(e2 ? 1 : 0));
            hashMap.put("inFocus", Integer.valueOf(f2 ? 1 : 0));
            hashMap.put("isHidden", Integer.valueOf(g2 ? 1 : 0));
            hashMap.put("opacity", Float.valueOf(h2));
            Rect a2 = a(l2);
            Rect b2 = b();
            a a3 = a(b2, e2, f2, g2);
            if (this.j == null || a3.b != this.i.b || !a3.a.equals(this.i.a) || a3.c != this.i.c) {
                this.i = a3;
                this.j = new JSONObject(a(this.i.a, l2));
                z = true;
            }
            hashMap.put("coveredPercent", Double.valueOf(a3.c));
            if (this.n == null || !a2.equals(this.l)) {
                this.l = a2;
                this.n = new JSONObject(a(a2, l2));
                z = true;
            }
            if (this.m == null || !b2.equals(this.k)) {
                this.k = b2;
                this.m = new JSONObject(a(b2, l2));
                z = true;
            }
            if (this.o == null || !hashMap.equals(this.o)) {
                this.o = hashMap;
                z = true;
            }
            if (!z) {
                return this.p;
            }
            JSONObject jSONObject = new JSONObject(this.o);
            jSONObject.accumulate("screen", this.n);
            jSONObject.accumulate("view", this.m);
            jSONObject.accumulate("visible", this.j);
            jSONObject.accumulate("maybe", this.j);
            jSONObject.accumulate("visiblePercent", Double.valueOf(this.i.b));
            String jSONObject2 = jSONObject.toString();
            this.p = jSONObject2;
            return jSONObject2;
        } catch (Exception e3) {
            l.a(e3);
            this.p = str;
            return str;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(WebView webView) {
        if (webView != null) {
            this.f = new WeakReference<>(webView);
            if (this.a == null) {
                d();
            }
            i iVar = this.a;
            if (iVar != null && iVar.a) {
                iVar.a(this);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(i iVar) {
        this.a = iVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        this.a.a(str);
    }

    /* access modifiers changed from: 0000 */
    public Rect b() {
        int[] iArr = {BaseClientBuilder.API_PRIORITY_OTHER, BaseClientBuilder.API_PRIORITY_OTHER};
        if (!k()) {
            return new Rect(0, 0, 0, 0);
        }
        c().getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        return new Rect(i2, i3, c().getWidth() + i2, c().getHeight() + i3);
    }

    /* access modifiers changed from: 0000 */
    public View c() {
        return (View) this.e.get();
    }

    public void changeTargetView(View view) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("changing view to ");
        if (view != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(view.getClass().getSimpleName());
            sb2.append("@");
            sb2.append(view.hashCode());
            str = sb2.toString();
        } else {
            str = "null";
        }
        sb.append(str);
        n.a(3, "MoatBaseTracker", (Object) this, sb.toString());
        this.e = new WeakReference<>(view);
    }

    @Deprecated
    public void setActivity(Activity activity) {
    }

    /* access modifiers changed from: 0000 */
    public void startTracking() {
        String str = "MoatBaseTracker";
        n.a(3, str, (Object) this, "Attempting to start impression.");
        if (!this.h) {
            boolean b2 = this.a.b(this);
            StringBuilder sb = new StringBuilder();
            sb.append("Impression ");
            sb.append(b2 ? "" : "not ");
            sb.append("started.");
            n.a(3, str, (Object) this, sb.toString());
            if (b2) {
                this.d = true;
                this.h = true;
                return;
            }
            return;
        }
        n.a(3, str, (Object) this, "startTracking failed, tracker already started");
    }

    public void stopTracking() {
        String str = "MoatBaseTracker";
        n.a(3, str, (Object) this, "Attempting to stop impression.");
        this.d = false;
        boolean c2 = this.a.c(this);
        StringBuilder sb = new StringBuilder();
        sb.append("Impression tracking ");
        sb.append(c2 ? "" : "not ");
        sb.append("stopped.");
        n.a(3, str, (Object) this, sb.toString());
    }
}
