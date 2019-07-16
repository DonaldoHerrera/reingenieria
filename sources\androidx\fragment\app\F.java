package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: FragmentTransition */
class F {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};
    private static final O b = (VERSION.SDK_INT >= 21 ? new K() : null);
    private static final O c = b();

    /* compiled from: FragmentTransition */
    static class a {
        public Fragment a;
        public boolean b;
        public C0359a c;
        public Fragment d;
        public boolean e;
        public C0359a f;

        a() {
        }
    }

    static void a(C0377t tVar, ArrayList<C0359a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (tVar.p >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0359a aVar = (C0359a) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    b(aVar, sparseArray, z);
                } else {
                    a(aVar, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(tVar.q.c());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    T a2 = a(keyAt, arrayList, arrayList2, i, i2);
                    a aVar2 = (a) sparseArray.valueAt(i4);
                    if (z) {
                        b(tVar, keyAt, aVar2, view, a2);
                    } else {
                        a(tVar, keyAt, aVar2, view, a2);
                    }
                }
            }
        }
    }

    private static O b() {
        try {
            return (O) Class.forName("androidx.transition.z").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void b(C0377t tVar, int i, a aVar, View view, T<String, String> t) {
        Object obj;
        C0377t tVar2 = tVar;
        a aVar2 = aVar;
        View view2 = view;
        ViewGroup viewGroup = tVar2.r.a() ? (ViewGroup) tVar2.r.a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = aVar2.a;
            Fragment fragment2 = aVar2.d;
            O a2 = a(fragment2, fragment);
            if (a2 != null) {
                boolean z = aVar2.b;
                boolean z2 = aVar2.e;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Object a3 = a(a2, fragment, z);
                Object b2 = b(a2, fragment2, z2);
                Object obj2 = a3;
                ViewGroup viewGroup2 = viewGroup;
                ArrayList arrayList3 = arrayList2;
                Object b3 = b(a2, viewGroup, view, t, aVar, arrayList2, arrayList, a3, b2);
                Object obj3 = obj2;
                if (obj3 == null && b3 == null) {
                    obj = b2;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = b2;
                }
                ArrayList a4 = a(a2, obj, fragment2, arrayList3, view2);
                ArrayList a5 = a(a2, obj3, fragment, arrayList, view2);
                a(a5, 4);
                Fragment fragment3 = fragment;
                ArrayList arrayList4 = a4;
                Object a6 = a(a2, obj3, obj, b3, fragment3, z);
                if (a6 != null) {
                    a(a2, obj, fragment2, arrayList4);
                    ArrayList a7 = a2.a(arrayList);
                    a2.a(a6, obj3, a5, obj, arrayList4, b3, arrayList);
                    ViewGroup viewGroup3 = viewGroup2;
                    a2.a(viewGroup3, a6);
                    a2.a(viewGroup3, arrayList3, arrayList, a7, t);
                    a(a5, 0);
                    a2.b(b3, arrayList3, arrayList);
                }
            }
        }
    }

    private static T<String, String> a(int i, ArrayList<C0359a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList arrayList4;
        T<String, String> t = new T<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0359a aVar = (C0359a) arrayList.get(i4);
            if (aVar.d(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                ArrayList<String> arrayList5 = aVar.r;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar.r;
                        arrayList4 = aVar.s;
                    } else {
                        ArrayList arrayList6 = aVar.r;
                        arrayList3 = aVar.s;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) t.remove(str2);
                        if (str3 != null) {
                            t.put(str, str3);
                        } else {
                            t.put(str, str2);
                        }
                    }
                }
            }
        }
        return t;
    }

    private static Object b(O o, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReturnTransition();
        } else {
            obj = fragment.getExitTransition();
        }
        return o.b(obj);
    }

    private static Object b(O o, ViewGroup viewGroup, View view, T<String, String> t, a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        O o2 = o;
        View view3 = view;
        T<String, String> t2 = t;
        a aVar2 = aVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = aVar2.a;
        Fragment fragment2 = aVar2.d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = aVar2.b;
        if (t.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = a(o, fragment, fragment2, z);
        }
        T b2 = b(o, t2, obj3, aVar2);
        T a2 = a(o, t2, obj3, aVar2);
        if (t.isEmpty()) {
            if (b2 != null) {
                b2.clear();
            }
            if (a2 != null) {
                a2.clear();
            }
            obj4 = null;
        } else {
            a(arrayList3, b2, (Collection<String>) t.keySet());
            a(arrayList4, a2, t.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        a(fragment, fragment2, z, b2, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            o.b(obj4, view3, arrayList3);
            a(o, obj4, obj2, b2, aVar2.e, aVar2.f);
            Rect rect2 = new Rect();
            View a3 = a(a2, aVar2, obj5, z);
            if (a3 != null) {
                o.a(obj5, rect2);
            }
            rect = rect2;
            view2 = a3;
        } else {
            view2 = null;
            rect = null;
        }
        D d = new D(fragment, fragment2, z, a2, view2, o, rect);
        C1537nc.a(viewGroup, d);
        return obj4;
    }

    private static void a(O o, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            o.a(obj, fragment.getView(), arrayList);
            C1537nc.a(fragment.mContainer, new B(arrayList));
        }
    }

    private static void a(C0377t tVar, int i, a aVar, View view, T<String, String> t) {
        Object obj;
        C0377t tVar2 = tVar;
        a aVar2 = aVar;
        View view2 = view;
        T<String, String> t2 = t;
        ViewGroup viewGroup = tVar2.r.a() ? (ViewGroup) tVar2.r.a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = aVar2.a;
            Fragment fragment2 = aVar2.d;
            O a2 = a(fragment2, fragment);
            if (a2 != null) {
                boolean z = aVar2.b;
                boolean z2 = aVar2.e;
                Object a3 = a(a2, fragment, z);
                Object b2 = b(a2, fragment2, z2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = arrayList;
                Object obj2 = b2;
                Object obj3 = a3;
                O o = a2;
                Object a4 = a(a2, viewGroup, view, t, aVar, arrayList, arrayList2, a3, obj2);
                Object obj4 = obj3;
                if (obj4 == null && a4 == null) {
                    obj = obj2;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = obj2;
                }
                ArrayList a5 = a(o, obj, fragment2, arrayList3, view2);
                Object obj5 = (a5 == null || a5.isEmpty()) ? null : obj;
                o.a(obj4, view2);
                Object a6 = a(o, obj4, obj5, a4, fragment, aVar2.b);
                if (a6 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    O o2 = o;
                    o2.a(a6, obj4, arrayList4, obj5, a5, a4, arrayList2);
                    a(o2, viewGroup, fragment, view, arrayList2, obj4, arrayList4, obj5, a5);
                    ArrayList arrayList5 = arrayList2;
                    o.a((View) viewGroup, arrayList5, (Map<String, String>) t2);
                    o.a(viewGroup, a6);
                    o.a(viewGroup, arrayList5, (Map<String, String>) t2);
                }
            }
        }
    }

    private static T<String, View> b(O o, T<String, String> t, Object obj, a aVar) {
        q qVar;
        ArrayList<String> arrayList;
        if (t.isEmpty() || obj == null) {
            t.clear();
            return null;
        }
        Fragment fragment = aVar.d;
        T<String, View> t2 = new T<>();
        o.a((Map<String, View>) t2, fragment.requireView());
        C0359a aVar2 = aVar.f;
        if (aVar.e) {
            qVar = fragment.getEnterTransitionCallback();
            arrayList = aVar2.s;
        } else {
            qVar = fragment.getExitTransitionCallback();
            arrayList = aVar2.r;
        }
        t2.a(arrayList);
        if (qVar != null) {
            qVar.a((List<String>) arrayList, (Map<String, View>) t2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) t2.get(str);
                if (view == null) {
                    t.remove(str);
                } else if (!str.equals(C1778vc.r(view))) {
                    t.put(C1778vc.r(view), (String) t.remove(str));
                }
            }
        } else {
            t.a(t2.keySet());
        }
        return t2;
    }

    private static void a(O o, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        C c2 = new C(obj, o, view, fragment, arrayList, arrayList2, arrayList3, obj2);
        ViewGroup viewGroup2 = viewGroup;
        C1537nc.a(viewGroup, c2);
    }

    private static O a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        O o = b;
        if (o != null && a(o, (List<Object>) arrayList)) {
            return b;
        }
        O o2 = c;
        if (o2 != null && a(o2, (List<Object>) arrayList)) {
            return c;
        }
        if (b == null && c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static void b(C0359a aVar, SparseArray<a> sparseArray, boolean z) {
        if (aVar.a.r.a()) {
            for (int size = aVar.b.size() - 1; size >= 0; size--) {
                a(aVar, (C0008a) aVar.b.get(size), sparseArray, true, z);
            }
        }
    }

    private static boolean a(O o, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!o.a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static Object a(O o, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.getSharedElementReturnTransition();
        } else {
            obj = fragment.getSharedElementEnterTransition();
        }
        return o.c(o.b(obj));
    }

    private static Object a(O o, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReenterTransition();
        } else {
            obj = fragment.getEnterTransition();
        }
        return o.b(obj);
    }

    private static void a(ArrayList<View> arrayList, T<String, View> t, Collection<String> collection) {
        for (int size = t.size() - 1; size >= 0; size--) {
            View view = (View) t.d(size);
            if (collection.contains(C1778vc.r(view))) {
                arrayList.add(view);
            }
        }
    }

    private static Object a(O o, ViewGroup viewGroup, View view, T<String, String> t, a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        T<String, String> t2;
        Object obj3;
        Object obj4;
        Rect rect;
        O o2 = o;
        a aVar2 = aVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = aVar2.a;
        Fragment fragment2 = aVar2.d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = aVar2.b;
        if (t.isEmpty()) {
            t2 = t;
            obj3 = null;
        } else {
            obj3 = a(o2, fragment, fragment2, z);
            t2 = t;
        }
        T b2 = b(o2, t2, obj3, aVar2);
        if (t.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(b2.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        a(fragment, fragment2, z, b2, true);
        if (obj4 != null) {
            rect = new Rect();
            o2.b(obj4, view, arrayList3);
            a(o, obj4, obj2, b2, aVar2.e, aVar2.f);
            if (obj5 != null) {
                o2.a(obj5, rect);
            }
        } else {
            rect = null;
        }
        E e = r0;
        E e2 = new E(o, t, obj4, aVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        C1537nc.a(viewGroup, e);
        return obj4;
    }

    static T<String, View> a(O o, T<String, String> t, Object obj, a aVar) {
        q qVar;
        ArrayList<String> arrayList;
        Fragment fragment = aVar.a;
        View view = fragment.getView();
        if (t.isEmpty() || obj == null || view == null) {
            t.clear();
            return null;
        }
        T<String, View> t2 = new T<>();
        o.a((Map<String, View>) t2, view);
        C0359a aVar2 = aVar.c;
        if (aVar.b) {
            qVar = fragment.getExitTransitionCallback();
            arrayList = aVar2.r;
        } else {
            qVar = fragment.getEnterTransitionCallback();
            arrayList = aVar2.s;
        }
        if (arrayList != null) {
            t2.a(arrayList);
            t2.a(t.values());
        }
        if (qVar != null) {
            qVar.a((List<String>) arrayList, (Map<String, View>) t2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view2 = (View) t2.get(str);
                if (view2 == null) {
                    String a2 = a(t, str);
                    if (a2 != null) {
                        t.remove(a2);
                    }
                } else if (!str.equals(C1778vc.r(view2))) {
                    String a3 = a(t, str);
                    if (a3 != null) {
                        t.put(a3, C1778vc.r(view2));
                    }
                }
            }
        } else {
            a(t, t2);
        }
        return t2;
    }

    private static String a(T<String, String> t, String str) {
        int size = t.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(t.d(i))) {
                return (String) t.b(i);
            }
        }
        return null;
    }

    static View a(T<String, View> t, a aVar, Object obj, boolean z) {
        String str;
        C0359a aVar2 = aVar.c;
        if (!(obj == null || t == null)) {
            ArrayList<String> arrayList = aVar2.r;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (z) {
                    str = (String) aVar2.r.get(0);
                } else {
                    str = (String) aVar2.s.get(0);
                }
                return (View) t.get(str);
            }
        }
        return null;
    }

    private static void a(O o, Object obj, Object obj2, T<String, View> t, boolean z, C0359a aVar) {
        String str;
        ArrayList<String> arrayList = aVar.r;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = (String) aVar.s.get(0);
            } else {
                str = (String) aVar.r.get(0);
            }
            View view = (View) t.get(str);
            o.c(obj, view);
            if (obj2 != null) {
                o.c(obj2, view);
            }
        }
    }

    private static void a(T<String, String> t, T<String, View> t2) {
        for (int size = t.size() - 1; size >= 0; size--) {
            if (!t2.containsKey((String) t.d(size))) {
                t.c(size);
            }
        }
    }

    static void a(Fragment fragment, Fragment fragment2, boolean z, T<String, View> t, boolean z2) {
        q qVar;
        int i;
        if (z) {
            qVar = fragment2.getEnterTransitionCallback();
        } else {
            qVar = fragment.getEnterTransitionCallback();
        }
        if (qVar != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (t == null) {
                i = 0;
            } else {
                i = t.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(t.b(i2));
                arrayList.add(t.d(i2));
            }
            if (z2) {
                qVar.b(arrayList2, arrayList, null);
            } else {
                qVar.a((List<String>) arrayList2, (List<View>) arrayList, null);
            }
        }
    }

    static ArrayList<View> a(O o, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            o.a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        o.a(obj, arrayList2);
        return arrayList2;
    }

    static void a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    private static Object a(O o, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2 = (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        if (z2) {
            return o.b(obj2, obj, obj3);
        }
        return o.a(obj2, obj, obj3);
    }

    public static void a(C0359a aVar, SparseArray<a> sparseArray, boolean z) {
        int size = aVar.b.size();
        for (int i = 0; i < size; i++) {
            a(aVar, (C0008a) aVar.b.get(i), sparseArray, false, z);
        }
    }

    static boolean a() {
        return (b == null && c == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        if (r10.mAdded != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0074, code lost:
        if (r10.mPostponedAlpha >= 0.0f) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0080, code lost:
        if (r10.mHidden == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0092, code lost:
        if (r10.mHidden == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0094, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a2  */
    private static void a(C0359a aVar, C0008a aVar2, SparseArray<a> sparseArray, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        a aVar3;
        C0377t tVar;
        boolean z6;
        C0359a aVar4 = aVar;
        C0008a aVar5 = aVar2;
        SparseArray<a> sparseArray2 = sparseArray;
        boolean z7 = z;
        Fragment fragment = aVar5.b;
        if (fragment != null) {
            int i = fragment.mContainerId;
            if (i != 0) {
                int i2 = z7 ? a[aVar5.a] : aVar5.a;
                boolean z8 = false;
                if (i2 != 1) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                if (i2 != 6) {
                                    if (i2 != 7) {
                                        z5 = false;
                                        z4 = false;
                                        z3 = false;
                                        a aVar6 = (a) sparseArray2.get(i);
                                        if (z8) {
                                            aVar6 = a(aVar6, sparseArray2, i);
                                            aVar6.a = fragment;
                                            aVar6.b = z7;
                                            aVar6.c = aVar4;
                                        }
                                        aVar3 = aVar6;
                                        if (!z2 && z5) {
                                            if (aVar3 != null && aVar3.d == fragment) {
                                                aVar3.d = null;
                                            }
                                            tVar = aVar4.a;
                                            if (fragment.mState < 1 && tVar.p >= 1 && !aVar4.t) {
                                                tVar.i(fragment);
                                                tVar.a(fragment, 1, 0, 0, false);
                                            }
                                        }
                                        if (z3 && (aVar3 == null || aVar3.d == null)) {
                                            aVar3 = a(aVar3, sparseArray2, i);
                                            aVar3.d = fragment;
                                            aVar3.e = z7;
                                            aVar3.f = aVar4;
                                        }
                                        if (!z2 && z4 && aVar3 != null && aVar3.a == fragment) {
                                            aVar3.a = null;
                                        }
                                    }
                                }
                            } else if (z2) {
                                if (fragment.mHiddenChanged) {
                                    if (!fragment.mHidden) {
                                    }
                                }
                                z6 = false;
                                z8 = z6;
                                z5 = true;
                                z4 = false;
                                z3 = false;
                                a aVar62 = (a) sparseArray2.get(i);
                                if (z8) {
                                }
                                aVar3 = aVar62;
                                aVar3.d = null;
                                tVar = aVar4.a;
                                tVar.i(fragment);
                                tVar.a(fragment, 1, 0, 0, false);
                                aVar3 = a(aVar3, sparseArray2, i);
                                aVar3.d = fragment;
                                aVar3.e = z7;
                                aVar3.f = aVar4;
                                aVar3.a = null;
                            } else {
                                z6 = fragment.mHidden;
                                z8 = z6;
                                z5 = true;
                                z4 = false;
                                z3 = false;
                                a aVar622 = (a) sparseArray2.get(i);
                                if (z8) {
                                }
                                aVar3 = aVar622;
                                aVar3.d = null;
                                tVar = aVar4.a;
                                tVar.i(fragment);
                                tVar.a(fragment, 1, 0, 0, false);
                                aVar3 = a(aVar3, sparseArray2, i);
                                aVar3.d = fragment;
                                aVar3.e = z7;
                                aVar3.f = aVar4;
                                aVar3.a = null;
                            }
                        } else if (!z2) {
                            boolean z9 = false;
                            z3 = z9;
                            z5 = false;
                            z4 = true;
                            a aVar6222 = (a) sparseArray2.get(i);
                            if (z8) {
                            }
                            aVar3 = aVar6222;
                            aVar3.d = null;
                            tVar = aVar4.a;
                            tVar.i(fragment);
                            tVar.a(fragment, 1, 0, 0, false);
                            aVar3 = a(aVar3, sparseArray2, i);
                            aVar3.d = fragment;
                            aVar3.e = z7;
                            aVar3.f = aVar4;
                            aVar3.a = null;
                        } else {
                            boolean z92 = false;
                            z3 = z92;
                            z5 = false;
                            z4 = true;
                            a aVar62222 = (a) sparseArray2.get(i);
                            if (z8) {
                            }
                            aVar3 = aVar62222;
                            aVar3.d = null;
                            tVar = aVar4.a;
                            tVar.i(fragment);
                            tVar.a(fragment, 1, 0, 0, false);
                            aVar3 = a(aVar3, sparseArray2, i);
                            aVar3.d = fragment;
                            aVar3.e = z7;
                            aVar3.f = aVar4;
                            aVar3.a = null;
                        }
                    }
                    if (z2) {
                        if (!fragment.mAdded) {
                            View view = fragment.mView;
                            if (view != null) {
                                if (view.getVisibility() == 0) {
                                }
                            }
                        }
                        boolean z922 = false;
                        z3 = z922;
                        z5 = false;
                        z4 = true;
                        a aVar622222 = (a) sparseArray2.get(i);
                        if (z8) {
                        }
                        aVar3 = aVar622222;
                        aVar3.d = null;
                        tVar = aVar4.a;
                        tVar.i(fragment);
                        tVar.a(fragment, 1, 0, 0, false);
                        aVar3 = a(aVar3, sparseArray2, i);
                        aVar3.d = fragment;
                        aVar3.e = z7;
                        aVar3.f = aVar4;
                        aVar3.a = null;
                    }
                    if (fragment.mAdded) {
                    }
                    boolean z9222 = false;
                    z3 = z9222;
                    z5 = false;
                    z4 = true;
                    a aVar6222222 = (a) sparseArray2.get(i);
                    if (z8) {
                    }
                    aVar3 = aVar6222222;
                    aVar3.d = null;
                    tVar = aVar4.a;
                    tVar.i(fragment);
                    tVar.a(fragment, 1, 0, 0, false);
                    aVar3 = a(aVar3, sparseArray2, i);
                    aVar3.d = fragment;
                    aVar3.e = z7;
                    aVar3.f = aVar4;
                    aVar3.a = null;
                }
                if (z2) {
                    z6 = fragment.mIsNewlyAdded;
                    z8 = z6;
                    z5 = true;
                    z4 = false;
                    z3 = false;
                    a aVar62222222 = (a) sparseArray2.get(i);
                    if (z8) {
                    }
                    aVar3 = aVar62222222;
                    aVar3.d = null;
                    tVar = aVar4.a;
                    tVar.i(fragment);
                    tVar.a(fragment, 1, 0, 0, false);
                    aVar3 = a(aVar3, sparseArray2, i);
                    aVar3.d = fragment;
                    aVar3.e = z7;
                    aVar3.f = aVar4;
                    aVar3.a = null;
                }
                if (!fragment.mAdded) {
                }
                z6 = false;
                z8 = z6;
                z5 = true;
                z4 = false;
                z3 = false;
                a aVar622222222 = (a) sparseArray2.get(i);
                if (z8) {
                }
                aVar3 = aVar622222222;
                aVar3.d = null;
                tVar = aVar4.a;
                tVar.i(fragment);
                tVar.a(fragment, 1, 0, 0, false);
                aVar3 = a(aVar3, sparseArray2, i);
                aVar3.d = fragment;
                aVar3.e = z7;
                aVar3.f = aVar4;
                aVar3.a = null;
            }
        }
    }

    private static a a(a aVar, SparseArray<a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }
}
