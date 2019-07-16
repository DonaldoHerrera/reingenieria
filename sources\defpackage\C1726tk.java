package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.facebook.B;
import com.facebook.C0594t;
import com.facebook.internal.A;
import com.facebook.internal.E;
import com.facebook.internal.T;
import com.facebook.internal.ia;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: tk reason: default package and case insensitive filesystem */
/* compiled from: CodelessMatcher */
public class C1726tk {
    /* access modifiers changed from: private */
    public static final String a = "tk";
    private final Handler b = new Handler(Looper.getMainLooper());
    private Set<Activity> c = new HashSet();
    private Set<b> d = new HashSet();
    private HashMap<String, String> e = new HashMap<>();

    /* renamed from: tk$a */
    /* compiled from: CodelessMatcher */
    public static class a {
        private WeakReference<View> a;
        private String b;

        public a(View view, String str) {
            this.a = new WeakReference<>(view);
            this.b = str;
        }

        public View a() {
            WeakReference<View> weakReference = this.a;
            if (weakReference == null) {
                return null;
            }
            return (View) weakReference.get();
        }

        public String b() {
            return this.b;
        }
    }

    /* renamed from: tk$b */
    /* compiled from: CodelessMatcher */
    protected static class b implements OnGlobalLayoutListener, OnScrollChangedListener, Runnable {
        private WeakReference<View> a;
        private List<Ck> b;
        private final Handler c;
        private HashMap<String, String> d;
        private final String e;

        public b(View view, Handler handler, HashMap<String, String> hashMap, String str) {
            this.a = new WeakReference<>(view);
            this.c = handler;
            this.d = hashMap;
            this.e = str;
            this.c.postDelayed(this, 200);
        }

        private void a() {
            if (this.b != null && this.a.get() != null) {
                for (int i = 0; i < this.b.size(); i++) {
                    a((Ck) this.b.get(i), (View) this.a.get());
                }
            }
        }

        public void onGlobalLayout() {
            a();
        }

        public void onScrollChanged() {
            a();
        }

        public void run() {
            A b2 = E.b(B.f());
            if (b2 != null && b2.b()) {
                this.b = Ck.a(b2.e());
                if (this.b != null) {
                    View view = (View) this.a.get();
                    if (view != null) {
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        a();
                    }
                }
            }
        }

        public void a(Ck ck, View view) {
            if (ck != null && view != null && (TextUtils.isEmpty(ck.a()) || ck.a().equals(this.e))) {
                List e2 = ck.e();
                if (e2.size() <= 25) {
                    for (a a2 : a(ck, view, e2, 0, -1, this.e)) {
                        a(a2, view, ck);
                    }
                }
            }
        }

        public static List<a> a(Ck ck, View view, List<Ek> list, int i, int i2, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = ".";
            sb.append(str2);
            sb.append(String.valueOf(i2));
            String sb2 = sb.toString();
            ArrayList arrayList = new ArrayList();
            if (view == null) {
                return arrayList;
            }
            if (i >= list.size()) {
                arrayList.add(new a(view, sb2));
            } else {
                Ek ek = (Ek) list.get(i);
                if (ek.a.equals("..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        List a2 = a((ViewGroup) parent);
                        int size = a2.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.addAll(a(ck, (View) a2.get(i3), list, i + 1, i3, sb2));
                        }
                    }
                    return arrayList;
                } else if (ek.a.equals(str2)) {
                    arrayList.add(new a(view, sb2));
                    return arrayList;
                } else if (!a(view, ek, i2)) {
                    return arrayList;
                } else {
                    if (i == list.size() - 1) {
                        arrayList.add(new a(view, sb2));
                    }
                }
            }
            if (view instanceof ViewGroup) {
                List a3 = a((ViewGroup) view);
                int size2 = a3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.addAll(a(ck, (View) a3.get(i4), list, i + 1, i4, sb2));
                }
            }
            return arrayList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
            if (r5.getClass().getSimpleName().equals(r7[r7.length - 1]) == false) goto L_0x0041;
         */
        private static boolean a(View view, Ek ek, int i) {
            String str;
            String str2;
            int i2 = ek.b;
            if (i2 != -1 && i != i2) {
                return false;
            }
            if (!view.getClass().getCanonicalName().equals(ek.a)) {
                if (ek.a.matches(".*android\\..*")) {
                    String[] split = ek.a.split("\\.");
                    if (split.length > 0) {
                    }
                }
                return false;
            }
            if ((ek.h & defpackage.Ek.a.ID.a()) > 0 && ek.c != view.getId()) {
                return false;
            }
            String str3 = "";
            if ((ek.h & defpackage.Ek.a.TEXT.a()) > 0) {
                String str4 = ek.d;
                String g = Hk.g(view);
                String a2 = ia.a(ia.e(g), str3);
                if (!str4.equals(g) && !str4.equals(a2)) {
                    return false;
                }
            }
            if ((ek.h & defpackage.Ek.a.DESCRIPTION.a()) > 0) {
                String str5 = ek.f;
                if (view.getContentDescription() == null) {
                    str2 = str3;
                } else {
                    str2 = String.valueOf(view.getContentDescription());
                }
                String a3 = ia.a(ia.e(str2), str3);
                if (!str5.equals(str2) && !str5.equals(a3)) {
                    return false;
                }
            }
            if ((ek.h & defpackage.Ek.a.HINT.a()) > 0) {
                String str6 = ek.g;
                String f = Hk.f(view);
                String a4 = ia.a(ia.e(f), str3);
                if (!str6.equals(f) && !str6.equals(a4)) {
                    return false;
                }
            }
            if ((ek.h & defpackage.Ek.a.TAG.a()) > 0) {
                String str7 = ek.e;
                if (view.getTag() == null) {
                    str = str3;
                } else {
                    str = String.valueOf(view.getTag());
                }
                String a5 = ia.a(ia.e(str), str3);
                if (str7.equals(str) || str7.equals(a5)) {
                    return true;
                }
                return false;
            }
            return true;
        }

        private static List<View> a(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        private void a(a aVar, View view, Ck ck) {
            if (ck != null) {
                try {
                    View a2 = aVar.a();
                    if (a2 != null) {
                        View a3 = Hk.a(a2);
                        if (a3 != null && Hk.a(a2, a3)) {
                            a(aVar, view, a3, ck);
                        } else if (!a2.getClass().getName().startsWith("com.facebook.react")) {
                            String b2 = aVar.b();
                            AccessibilityDelegate d2 = Hk.d(a2);
                            boolean z = true;
                            boolean z2 = d2 != null;
                            boolean z3 = z2 && (d2 instanceof defpackage.C1666rk.a);
                            if (!z3 || !((defpackage.C1666rk.a) d2).a()) {
                                z = false;
                            }
                            if (!this.d.containsKey(b2) && (!z2 || !z3 || !z)) {
                                a2.setAccessibilityDelegate(C1666rk.a(ck, view, a2));
                                this.d.put(b2, ck.b());
                            }
                        }
                    }
                } catch (C0594t e2) {
                    Log.e(C1726tk.a, "Failed to attach auto logging event listener.", e2);
                }
            }
        }

        private void a(a aVar, View view, View view2, Ck ck) {
            if (ck != null) {
                View a2 = aVar.a();
                if (a2 != null && Hk.a(a2, view2)) {
                    String b2 = aVar.b();
                    OnTouchListener e2 = Hk.e(a2);
                    boolean z = true;
                    boolean z2 = e2 != null;
                    boolean z3 = z2 && (e2 instanceof defpackage.C1786vk.a);
                    if (!z3 || !((defpackage.C1786vk.a) e2).a()) {
                        z = false;
                    }
                    if (!this.d.containsKey(b2) && (!z2 || !z3 || !z)) {
                        a2.setOnTouchListener(C1786vk.a(ck, view, a2));
                        this.d.put(b2, ck.b());
                    }
                }
            }
        }
    }

    private void c() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            b();
        } else {
            this.b.post(new C1696sk(this));
        }
    }

    public void b(Activity activity) {
        if (!T.b()) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.c.remove(activity);
                this.d.clear();
                this.e.clear();
                return;
            }
            throw new C0594t("Can't remove activity from CodelessMatcher on non-UI thread");
        }
    }

    public void a(Activity activity) {
        if (!T.b()) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.c.add(activity);
                this.e.clear();
                c();
                return;
            }
            throw new C0594t("Can't add activity to CodelessMatcher on non-UI thread");
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        for (Activity activity : this.c) {
            this.d.add(new b(activity.getWindow().getDecorView().getRootView(), this.b, this.e, activity.getClass().getSimpleName()));
        }
    }

    public static Bundle a(Ck ck, View view, View view2) {
        List list;
        Bundle bundle = new Bundle();
        if (ck == null) {
            return bundle;
        }
        List<Dk> d2 = ck.d();
        if (d2 != null) {
            for (Dk dk : d2) {
                String str = dk.b;
                if (str == null || str.length() <= 0) {
                    if (dk.c.size() > 0) {
                        if (dk.d.equals("relative")) {
                            list = b.a(ck, view2, dk.c, 0, -1, view2.getClass().getSimpleName());
                        } else {
                            list = b.a(ck, view, dk.c, 0, -1, view.getClass().getSimpleName());
                        }
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            a aVar = (a) it.next();
                            if (aVar.a() != null) {
                                String g = Hk.g(aVar.a());
                                if (g.length() > 0) {
                                    bundle.putString(dk.a, g);
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    bundle.putString(dk.a, dk.b);
                }
            }
        }
        return bundle;
    }
}
