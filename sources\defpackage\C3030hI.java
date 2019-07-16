package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.A;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.json.JSONArray;

/* renamed from: hI reason: default package and case insensitive filesystem */
/* compiled from: FragNavController */
public class C3030hI {
    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private final int e;
    private final List<Stack<Fragment>> f;
    private final C0370l g;
    private final C3106lI h;
    private int i;
    private int j;
    private Fragment k;
    private C0361c l;
    private c m;
    private d n;
    private C3192pI o;
    private final int p;

    /* renamed from: hI$a */
    /* compiled from: FragNavController */
    public static final class a {
        /* access modifiers changed from: private */
        public final int a;
        /* access modifiers changed from: private */
        public C0370l b;
        /* access modifiers changed from: private */
        public c c;
        /* access modifiers changed from: private */
        public int d = 0;
        /* access modifiers changed from: private */
        public d e;
        /* access modifiers changed from: private */
        public C3106lI f;
        /* access modifiers changed from: private */
        public int g = 0;
        /* access modifiers changed from: private */
        public int h = 0;
        /* access modifiers changed from: private */
        public List<Fragment> i;
        private Bundle j;
        /* access modifiers changed from: private */
        public C3068jI k;

        public a(Bundle bundle, C0370l lVar, int i2) {
            this.j = bundle;
            this.b = lVar;
            this.a = i2;
        }

        public a a(List<Fragment> list) {
            this.i = list;
            this.g = list.size();
            if (this.g <= 20) {
                return this;
            }
            throw new IllegalArgumentException("Number of root fragments cannot be greater than 20");
        }

        public a a(C3106lI lIVar) {
            this.f = lIVar;
            return this;
        }

        public a a(d dVar) {
            this.e = dVar;
            return this;
        }

        public C3030hI a() {
            if (this.c == null && this.i == null) {
                throw new IndexOutOfBoundsException("Either a root fragment(s) needs to be set, or a fragment listener");
            }
            int i2 = this.h;
            if ((i2 != 1 && i2 != 2) || this.k != null) {
                return new C3030hI(this, this.j);
            }
            throw new IllegalStateException("Switch handler needs to be set for unique or unlimited tab history strategy");
        }
    }

    /* renamed from: hI$b */
    /* compiled from: FragNavController */
    public class b implements C3049iI {
        public b() {
        }

        public int a(int i, C3106lI lIVar) throws UnsupportedOperationException {
            return C3030hI.this.d(i, lIVar);
        }
    }

    /* renamed from: hI$c */
    /* compiled from: FragNavController */
    public interface c {
        Fragment a(int i);
    }

    /* renamed from: hI$d */
    /* compiled from: FragNavController */
    public interface d {
        void a(Fragment fragment, int i);

        void a(Fragment fragment, e eVar);
    }

    /* renamed from: hI$e */
    /* compiled from: FragNavController */
    public enum e {
        PUSH,
        POP,
        REPLACE
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C3030hI.class.getName());
        sb.append(":EXTRA_TAG_COUNT");
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C3030hI.class.getName());
        sb2.append(":EXTRA_SELECTED_TAB_INDEX");
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C3030hI.class.getName());
        sb3.append(":EXTRA_CURRENT_FRAGMENT");
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C3030hI.class.getName());
        sb4.append(":EXTRA_FRAGMENT_STACK");
        d = sb4.toString();
    }

    private void c(int i2, C3106lI lIVar) throws IndexOutOfBoundsException {
        if (i2 >= this.f.size()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't switch to a tab that hasn't been initialized, Index : ");
            sb.append(i2);
            sb.append(", current stack size : ");
            sb.append(this.f.size());
            sb.append(". Make sure to create all of the tabs you need in the Constructor or provide a way for them to be created via RootFragmentListener.");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (this.i != i2) {
            this.i = i2;
            this.o.a(i2);
            A a2 = a(lIVar, false);
            a(a2);
            Fragment fragment = null;
            if (i2 == -1) {
                a(a2, lIVar);
            } else {
                fragment = b(a2);
                if (fragment != null) {
                    a(a2, lIVar);
                } else {
                    fragment = d(this.i);
                    a2.a(this.e, fragment, a(fragment));
                    a(a2, lIVar);
                }
            }
            this.k = fragment;
            d dVar = this.n;
            if (dVar != null) {
                dVar.a(b(), this.i);
            }
        }
    }

    /* access modifiers changed from: private */
    public int d(int i2, C3106lI lIVar) throws UnsupportedOperationException {
        if (this.p == 0 && d()) {
            throw new UnsupportedOperationException("You can not popFragment the rootFragment. If you need to change this fragment, use replaceFragment(fragment)");
        } else if (i2 >= 1) {
            int i3 = this.i;
            if (i3 != -1) {
                int size = ((Stack) this.f.get(i3)).size() - 1;
                if (i2 >= size) {
                    a(lIVar);
                    return size;
                }
                A a2 = a(lIVar, true);
                boolean z = false;
                for (int i4 = 0; i4 < i2; i4++) {
                    Fragment a3 = this.g.a(((Fragment) ((Stack) this.f.get(this.i)).pop()).getTag());
                    if (a3 != null) {
                        a2.d(a3);
                    }
                }
                Fragment b2 = b(a2);
                if (b2 != null) {
                    a(a2, lIVar);
                } else if (!((Stack) this.f.get(this.i)).isEmpty()) {
                    b2 = (Fragment) ((Stack) this.f.get(this.i)).peek();
                    a2.a(this.e, b2, b2.getTag());
                    a(a2, lIVar);
                } else {
                    b2 = d(this.i);
                    a2.a(this.e, b2, a(b2));
                    a(a2, lIVar);
                    z = true;
                }
                if (z) {
                    ((Stack) this.f.get(this.i)).push(b2);
                }
                this.k = b2;
                d dVar = this.n;
                if (dVar != null) {
                    dVar.a(b(), e.POP);
                }
                return i2;
            }
            throw new UnsupportedOperationException("You can not pop fragments when no tab is selected");
        } else {
            throw new UnsupportedOperationException("popFragments parameter needs to be greater than 0");
        }
    }

    private void e() {
        if (this.g.e() != null) {
            A a2 = a((C3106lI) null, false);
            for (Fragment fragment : this.g.e()) {
                if (fragment != null) {
                    a2.d(fragment);
                }
            }
            a(a2, (C3106lI) null);
        }
    }

    public void b(int i2) {
        this.i = i2;
        if (this.i <= this.f.size()) {
            this.i = i2;
            e();
            a();
            if (i2 != -1) {
                A a2 = a((C3106lI) null, false);
                Fragment d2 = d(i2);
                a2.a(this.e, d2, a(d2));
                a(a2, (C3106lI) null);
                this.k = d2;
                d dVar = this.n;
                if (dVar != null) {
                    dVar.a(b(), this.i);
                }
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException("Starting index cannot be larger than the number of stacks");
    }

    private C3030hI(a aVar, Bundle bundle) {
        this.g = aVar.b;
        this.e = aVar.a;
        this.f = new ArrayList(aVar.g);
        this.m = aVar.c;
        this.n = aVar.e;
        this.h = aVar.f;
        this.i = aVar.d;
        this.p = aVar.h;
        b bVar = new b();
        int i2 = this.p;
        if (i2 == 0) {
            this.o = new C3173oI(bVar);
        } else if (i2 == 1) {
            this.o = new C3211qI(bVar, aVar.k);
        } else if (i2 == 2) {
            this.o = new C3231rI(bVar, aVar.k);
        }
        this.o.a(this.i);
        if (!a(bundle, aVar.i)) {
            for (int i3 = 0; i3 < aVar.g; i3++) {
                Stack stack = new Stack();
                if (aVar.i != null) {
                    stack.add(aVar.i.get(i3));
                }
                this.f.add(stack);
            }
            b(aVar.d);
            return;
        }
        this.o.a(bundle);
    }

    public static a a(Bundle bundle, C0370l lVar, int i2) {
        return new a(bundle, lVar, i2);
    }

    public void a(Fragment fragment, C3106lI lIVar) {
        if (fragment != null && this.i != -1) {
            A a2 = a(lIVar, false);
            a(a2);
            a2.a(this.e, fragment, a(fragment));
            a(a2, lIVar);
            ((Stack) this.f.get(this.i)).push(fragment);
            this.k = fragment;
            d dVar = this.n;
            if (dVar != null) {
                dVar.a(b(), e.PUSH);
            }
        }
    }

    public boolean a(int i2, C3106lI lIVar) throws UnsupportedOperationException {
        return this.o.a(i2, lIVar);
    }

    public void a(C3106lI lIVar) {
        int i2 = this.i;
        if (i2 != -1) {
            Stack stack = (Stack) this.f.get(i2);
            if (stack.size() > 1) {
                A a2 = a(lIVar, true);
                while (stack.size() > 1) {
                    Fragment a3 = this.g.a(((Fragment) stack.pop()).getTag());
                    if (a3 != null) {
                        a2.d(a3);
                    }
                }
                Fragment b2 = b(a2);
                boolean z = false;
                if (b2 != null) {
                    a(a2, lIVar);
                } else if (!stack.isEmpty()) {
                    b2 = (Fragment) stack.peek();
                    a2.a(this.e, b2, b2.getTag());
                    a(a2, lIVar);
                } else {
                    b2 = d(this.i);
                    a2.a(this.e, b2, a(b2));
                    a(a2, lIVar);
                    z = true;
                }
                if (z) {
                    ((Stack) this.f.get(this.i)).push(b2);
                }
                this.f.set(this.i, stack);
                this.k = b2;
                d dVar = this.n;
                if (dVar != null) {
                    dVar.a(b(), e.POP);
                }
            }
        }
    }

    public void b(int i2, C3106lI lIVar) throws IndexOutOfBoundsException {
        c(i2, lIVar);
    }

    public boolean b(C3106lI lIVar) throws UnsupportedOperationException {
        return a(1, lIVar);
    }

    private Fragment b(A a2) {
        Stack stack = (Stack) this.f.get(this.i);
        if (stack.isEmpty()) {
            return null;
        }
        Fragment a3 = this.g.a(((Fragment) stack.peek()).getTag());
        if (a3 == null) {
            return a3;
        }
        a2.a(a3);
        return a3;
    }

    public void c(int i2) throws IndexOutOfBoundsException {
        b(i2, null);
    }

    public Stack<Fragment> c() {
        return a(this.i);
    }

    public Fragment b() {
        Fragment fragment = this.k;
        if (fragment != null && fragment.isAdded() && !this.k.isDetached()) {
            return this.k;
        }
        int i2 = this.i;
        if (i2 == -1) {
            return null;
        }
        if (!((Stack) this.f.get(i2)).isEmpty()) {
            Fragment a2 = this.g.a(((Fragment) ((Stack) this.f.get(this.i)).peek()).getTag());
            if (a2 != null) {
                this.k = a2;
            }
        }
        return this.k;
    }

    private Fragment d(int i2) throws IllegalStateException {
        Fragment fragment;
        if (!((Stack) this.f.get(i2)).isEmpty()) {
            fragment = (Fragment) ((Stack) this.f.get(i2)).peek();
        } else {
            c cVar = this.m;
            if (cVar != null) {
                fragment = cVar.a(i2);
                int i3 = this.i;
                if (i3 != -1) {
                    ((Stack) this.f.get(i3)).push(fragment);
                }
            } else {
                fragment = null;
            }
        }
        if (fragment != null) {
            return fragment;
        }
        throw new IllegalStateException("Either you haven't past in a fragment at this index in your constructor, or you haven't provided a way to create it while via your RootFragmentListener.getRootFragment(index)");
    }

    public boolean d() {
        Stack c2 = c();
        if (c2 == null || c2.size() == 1) {
            return true;
        }
        return false;
    }

    public void a() {
        C0370l lVar;
        C0361c cVar = this.l;
        if (cVar != null) {
            cVar.dismiss();
            this.l = null;
            return;
        }
        Fragment b2 = b();
        if (b2 != null) {
            lVar = b2.getChildFragmentManager();
        } else {
            lVar = this.g;
        }
        if (lVar.e() != null) {
            for (Fragment fragment : lVar.e()) {
                if (fragment instanceof C0361c) {
                    ((C0361c) fragment).dismiss();
                }
            }
        }
    }

    private void a(A a2) {
        Fragment b2 = b();
        if (b2 != null) {
            a2.b(b2);
        }
    }

    private String a(Fragment fragment) {
        StringBuilder sb = new StringBuilder();
        sb.append(fragment.getClass().getName());
        int i2 = this.j + 1;
        this.j = i2;
        sb.append(i2);
        return sb.toString();
    }

    private A a(C3106lI lIVar, boolean z) {
        A a2 = this.g.a();
        if (lIVar == null) {
            lIVar = this.h;
        }
        if (lIVar != null) {
            if (z) {
                a2.a(lIVar.e, lIVar.f);
            } else {
                a2.a(lIVar.c, lIVar.d);
            }
            a2.b(lIVar.g);
            a2.a(lIVar.b);
            List<C0247Qb<View, String>> list = lIVar.a;
            if (list != null) {
                for (C0247Qb qb : list) {
                    a2.a((View) qb.a, (String) qb.b);
                }
            }
            String str = lIVar.h;
            if (str != null) {
                a2.b((CharSequence) str);
            }
            String str2 = lIVar.i;
            if (str2 != null) {
                a2.a((CharSequence) str2);
            }
        }
        return a2;
    }

    private void a(A a2, C3106lI lIVar) {
        if (lIVar == null || !lIVar.j) {
            a2.a();
        } else {
            a2.b();
        }
    }

    public Stack<Fragment> a(int i2) {
        if (i2 == -1) {
            return null;
        }
        if (i2 < this.f.size()) {
            return (Stack) ((Stack) this.f.get(i2)).clone();
        }
        throw new IndexOutOfBoundsException("Can't get an index that's larger than we've setup");
    }

    public void a(Bundle bundle) {
        bundle.putInt(a, this.j);
        bundle.putInt(b, this.i);
        Fragment b2 = b();
        if (b2 != null) {
            bundle.putString(c, b2.getTag());
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (Stack stack : this.f) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it = stack.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Fragment) it.next()).getTag());
                }
                jSONArray.put(jSONArray2);
            }
            bundle.putString(d, jSONArray.toString());
        } catch (Throwable unused) {
        }
        this.o.b(bundle);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061 A[Catch:{ Throwable -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0086 A[SYNTHETIC] */
    private boolean a(Bundle bundle, List<Fragment> list) {
        Fragment fragment;
        if (bundle == null) {
            return false;
        }
        this.j = bundle.getInt(a, 0);
        this.k = this.g.a(bundle.getString(c));
        try {
            JSONArray jSONArray = new JSONArray(bundle.getString(d));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
                Stack stack = new Stack();
                String str = "null";
                if (jSONArray2.length() == 1) {
                    String string = jSONArray2.getString(0);
                    if (string != null) {
                        if (!str.equalsIgnoreCase(string)) {
                            fragment = this.g.a(string);
                            if (fragment == null) {
                                stack.add(fragment);
                            }
                        }
                    }
                    if (list != null) {
                        fragment = (Fragment) list.get(i2);
                    } else {
                        fragment = d(i2);
                    }
                    if (fragment == null) {
                    }
                } else {
                    for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                        String string2 = jSONArray2.getString(i3);
                        if (string2 != null && !str.equalsIgnoreCase(string2)) {
                            Fragment a2 = this.g.a(string2);
                            if (a2 != null) {
                                stack.add(a2);
                            }
                        }
                    }
                }
                this.f.add(stack);
            }
            int i4 = bundle.getInt(b);
            if (i4 >= 0 && i4 < 20) {
                c(i4);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
