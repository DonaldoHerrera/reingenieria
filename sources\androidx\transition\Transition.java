package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.xmlpull.v1.XmlPullParser;

public abstract class Transition implements Cloneable {
    private static final int[] a = {2, 1, 3, 4};
    private static final PathMotion b = new Y();
    private static ThreadLocal<T<Animator, a>> c = new ThreadLocal<>();
    ArrayList<Animator> A = new ArrayList<>();
    private int B = 0;
    private boolean C = false;
    private boolean D = false;
    private ArrayList<c> E = null;
    private ArrayList<Animator> F = new ArrayList<>();
    C0446ea G;
    private b H;
    private T<String, String> I;
    private PathMotion J = b;
    private String d = getClass().getName();
    private long e = -1;
    long f = -1;
    private TimeInterpolator g = null;
    ArrayList<Integer> h = new ArrayList<>();
    ArrayList<View> i = new ArrayList<>();
    private ArrayList<String> j = null;
    private ArrayList<Class> k = null;
    private ArrayList<Integer> l = null;
    private ArrayList<View> m = null;
    private ArrayList<Class> n = null;
    private ArrayList<String> o = null;
    private ArrayList<Integer> p = null;
    private ArrayList<View> q = null;
    private ArrayList<Class> r = null;
    private ia s = new ia();
    private ia t = new ia();
    TransitionSet u = null;
    private int[] v = a;
    private ArrayList<ha> w;
    private ArrayList<ha> x;
    private ViewGroup y = null;
    boolean z = false;

    private static class a {
        View a;
        String b;
        ha c;
        Fa d;
        Transition e;

        a(View view, String str, Transition transition, Fa fa, ha haVar) {
            this.a = view;
            this.b = str;
            this.c = haVar;
            this.d = fa;
            this.e = transition;
        }
    }

    public static abstract class b {
        public abstract Rect a(Transition transition);
    }

    public interface c {
        void a(Transition transition);

        void b(Transition transition);

        void c(Transition transition);

        void d(Transition transition);
    }

    public Transition() {
    }

    private static T<Animator, a> D() {
        T<Animator, a> t2 = (T) c.get();
        if (t2 != null) {
            return t2;
        }
        T<Animator, a> t3 = new T<>();
        c.set(t3);
        return t3;
    }

    private static boolean a(int i2) {
        return i2 >= 1 && i2 <= 4;
    }

    private static int[] b(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i2] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i2] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i2] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i2] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                i2--;
                iArr = iArr2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown match type in matchOrder: '");
                sb.append(trim);
                sb.append("'");
                throw new InflateException(sb.toString());
            }
            i2++;
        }
        return iArr;
    }

    private void c(View view, boolean z2) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.l;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.m;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.n;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            if (!((Class) this.n.get(i2)).isInstance(view)) {
                                i2++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ha haVar = new ha();
                        haVar.b = view;
                        if (z2) {
                            c(haVar);
                        } else {
                            a(haVar);
                        }
                        haVar.c.add(this);
                        b(haVar);
                        if (z2) {
                            a(this.s, view, haVar);
                        } else {
                            a(this.t, view, haVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.p;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.q;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.r;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i3 = 0;
                                    while (i3 < size2) {
                                        if (!((Class) this.r.get(i3)).isInstance(view)) {
                                            i3++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                    c(viewGroup.getChildAt(i4), z2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public String[] A() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void B() {
        C();
        T D2 = D();
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (D2.containsKey(animator)) {
                C();
                a(animator, D2);
            }
        }
        this.F.clear();
        i();
    }

    /* access modifiers changed from: protected */
    public void C() {
        if (this.B == 0) {
            ArrayList<c> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((c) arrayList2.get(i2)).b(this);
                }
            }
            this.D = false;
        }
        this.B++;
    }

    public Animator a(ViewGroup viewGroup, ha haVar, ha haVar2) {
        return null;
    }

    public Transition a(long j2) {
        this.f = j2;
        return this;
    }

    public abstract void a(ha haVar);

    public abstract void c(ha haVar);

    public Transition d(View view) {
        this.i.remove(view);
        return this;
    }

    public void e(View view) {
        if (this.C) {
            if (!this.D) {
                T D2 = D();
                int size = D2.size();
                Fa d2 = wa.d(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    a aVar = (a) D2.d(i2);
                    if (aVar.a != null && d2.equals(aVar.d)) {
                        C0437a.b((Animator) D2.b(i2));
                    }
                }
                ArrayList<c> arrayList = this.E;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.E.clone();
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((c) arrayList2.get(i3)).a(this);
                    }
                }
            }
            this.C = false;
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        this.B--;
        if (this.B == 0) {
            ArrayList<c> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((c) arrayList2.get(i2)).d(this);
                }
            }
            for (int i3 = 0; i3 < this.s.c.j(); i3++) {
                View view = (View) this.s.c.c(i3);
                if (view != null) {
                    C1778vc.b(view, false);
                }
            }
            for (int i4 = 0; i4 < this.t.c.j(); i4++) {
                View view2 = (View) this.t.c.c(i4);
                if (view2 != null) {
                    C1778vc.b(view2, false);
                }
            }
            this.D = true;
        }
    }

    public long j() {
        return this.f;
    }

    public Rect k() {
        b bVar = this.H;
        if (bVar == null) {
            return null;
        }
        return bVar.a(this);
    }

    public b l() {
        return this.H;
    }

    public TimeInterpolator m() {
        return this.g;
    }

    public String n() {
        return this.d;
    }

    public PathMotion o() {
        return this.J;
    }

    public C0446ea p() {
        return this.G;
    }

    public long q() {
        return this.e;
    }

    public List<Integer> r() {
        return this.h;
    }

    public List<String> s() {
        return this.j;
    }

    public List<Class> t() {
        return this.k;
    }

    public String toString() {
        return a("");
    }

    public List<View> z() {
        return this.i;
    }

    public Transition a(TimeInterpolator timeInterpolator) {
        this.g = timeInterpolator;
        return this;
    }

    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.F = new ArrayList<>();
            transition.s = new ia();
            transition.t = new ia();
            transition.w = null;
            transition.x = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void a(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.v = a;
            return;
        }
        int i2 = 0;
        while (i2 < iArr.length) {
            if (!a(iArr[i2])) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (!a(iArr, i2)) {
                i2++;
            } else {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.v = (int[]) iArr.clone();
    }

    private static boolean a(int[] iArr, int i2) {
        int i3 = iArr[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            if (iArr[i4] == i3) {
                return true;
            }
        }
        return false;
    }

    private void a(T<View, ha> t2, T<View, ha> t3, Y<View> y2, Y<View> y3) {
        int j2 = y2.j();
        for (int i2 = 0; i2 < j2; i2++) {
            View view = (View) y2.c(i2);
            if (view != null && b(view)) {
                View view2 = (View) y3.b(y2.a(i2));
                if (view2 != null && b(view2)) {
                    ha haVar = (ha) t2.get(view);
                    ha haVar2 = (ha) t3.get(view2);
                    if (!(haVar == null || haVar2 == null)) {
                        this.w.add(haVar);
                        this.x.add(haVar2);
                        t2.remove(view);
                        t3.remove(view2);
                    }
                }
            }
        }
    }

    public Transition b(long j2) {
        this.e = j2;
        return this;
    }

    private void b(T<View, ha> t2, T<View, ha> t3) {
        for (int size = t2.size() - 1; size >= 0; size--) {
            View view = (View) t2.b(size);
            if (view != null && b(view)) {
                ha haVar = (ha) t3.remove(view);
                if (haVar != null) {
                    View view2 = haVar.b;
                    if (view2 != null && b(view2)) {
                        this.w.add((ha) t2.c(size));
                        this.x.add(haVar);
                    }
                }
            }
        }
    }

    private void a(T<View, ha> t2, T<View, ha> t3, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) sparseArray.valueAt(i2);
            if (view != null && b(view)) {
                View view2 = (View) sparseArray2.get(sparseArray.keyAt(i2));
                if (view2 != null && b(view2)) {
                    ha haVar = (ha) t2.get(view);
                    ha haVar2 = (ha) t3.get(view2);
                    if (!(haVar == null || haVar2 == null)) {
                        this.w.add(haVar);
                        this.x.add(haVar2);
                        t2.remove(view);
                        t3.remove(view2);
                    }
                }
            }
        }
    }

    public void c(View view) {
        if (!this.D) {
            T D2 = D();
            int size = D2.size();
            Fa d2 = wa.d(view);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                a aVar = (a) D2.d(i2);
                if (aVar.a != null && d2.equals(aVar.d)) {
                    C0437a.a((Animator) D2.b(i2));
                }
            }
            ArrayList<c> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((c) arrayList2.get(i3)).c(this);
                }
            }
            this.C = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean b(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.l;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList2 = this.m;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList3 = this.n;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((Class) this.n.get(i2)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.o != null && C1778vc.r(view) != null && this.o.contains(C1778vc.r(view))) {
            return false;
        }
        if (this.h.size() == 0 && this.i.size() == 0) {
            ArrayList<Class> arrayList4 = this.k;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                ArrayList<String> arrayList5 = this.j;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    return true;
                }
            }
        }
        if (this.h.contains(Integer.valueOf(id)) || this.i.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.j;
        if (arrayList6 != null && arrayList6.contains(C1778vc.r(view))) {
            return true;
        }
        if (this.k != null) {
            for (int i3 = 0; i3 < this.k.size(); i3++) {
                if (((Class) this.k.get(i3)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long b2 = (long) C0286Za.b(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (b2 >= 0) {
            a(b2);
        }
        long b3 = (long) C0286Za.b(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (b3 > 0) {
            b(b3);
        }
        int c2 = C0286Za.c(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (c2 > 0) {
            a((TimeInterpolator) AnimationUtils.loadInterpolator(context, c2));
        }
        String a2 = C0286Za.a(obtainStyledAttributes, (XmlPullParser) xmlResourceParser, "matchOrder", 3);
        if (a2 != null) {
            a(b(a2));
        }
        obtainStyledAttributes.recycle();
    }

    private void a(T<View, ha> t2, T<View, ha> t3, T<String, View> t4, T<String, View> t5) {
        int size = t4.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) t4.d(i2);
            if (view != null && b(view)) {
                View view2 = (View) t5.get(t4.b(i2));
                if (view2 != null && b(view2)) {
                    ha haVar = (ha) t2.get(view);
                    ha haVar2 = (ha) t3.get(view2);
                    if (!(haVar == null || haVar2 == null)) {
                        this.w.add(haVar);
                        this.x.add(haVar2);
                        t2.remove(view);
                        t3.remove(view2);
                    }
                }
            }
        }
    }

    public ha b(View view, boolean z2) {
        TransitionSet transitionSet = this.u;
        if (transitionSet != null) {
            return transitionSet.b(view, z2);
        }
        return (ha) (z2 ? this.s : this.t).a.get(view);
    }

    private void a(T<View, ha> t2, T<View, ha> t3) {
        for (int i2 = 0; i2 < t2.size(); i2++) {
            ha haVar = (ha) t2.d(i2);
            if (b(haVar.b)) {
                this.w.add(haVar);
                this.x.add(null);
            }
        }
        for (int i3 = 0; i3 < t3.size(); i3++) {
            ha haVar2 = (ha) t3.d(i3);
            if (b(haVar2.b)) {
                this.x.add(haVar2);
                this.w.add(null);
            }
        }
    }

    public Transition b(c cVar) {
        ArrayList<c> arrayList = this.E;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(cVar);
        if (this.E.size() == 0) {
            this.E = null;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    public void b(ha haVar) {
        if (this.G != null && !haVar.a.isEmpty()) {
            String[] a2 = this.G.a();
            if (a2 != null) {
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= a2.length) {
                        z2 = true;
                        break;
                    } else if (!haVar.a.containsKey(a2[i2])) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z2) {
                    this.G.a(haVar);
                }
            }
        }
    }

    private void a(ia iaVar, ia iaVar2) {
        T t2 = new T((C0485ba) iaVar.a);
        T t3 = new T((C0485ba) iaVar2.a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.v;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 == 1) {
                    b(t2, t3);
                } else if (i3 == 2) {
                    a(t2, t3, iaVar.d, iaVar2.d);
                } else if (i3 == 3) {
                    a(t2, t3, iaVar.b, iaVar2.b);
                } else if (i3 == 4) {
                    a(t2, t3, iaVar.c, iaVar2.c);
                }
                i2++;
            } else {
                a(t2, t3);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(ViewGroup viewGroup, ia iaVar, ia iaVar2, ArrayList<ha> arrayList, ArrayList<ha> arrayList2) {
        int i2;
        int i3;
        View view;
        Animator animator;
        ha haVar;
        ha haVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        T D2 = D();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            ha haVar3 = (ha) arrayList.get(i4);
            ha haVar4 = (ha) arrayList2.get(i4);
            if (haVar3 != null && !haVar3.c.contains(this)) {
                haVar3 = null;
            }
            if (haVar4 != null && !haVar4.c.contains(this)) {
                haVar4 = null;
            }
            if (!(haVar3 == null && haVar4 == null)) {
                if (haVar3 == null || haVar4 == null || a(haVar3, haVar4)) {
                    Animator a2 = a(viewGroup2, haVar3, haVar4);
                    if (a2 != null) {
                        if (haVar4 != null) {
                            view = haVar4.b;
                            String[] A2 = A();
                            if (view != null && A2 != null && A2.length > 0) {
                                haVar2 = new ha();
                                haVar2.b = view;
                                Animator animator3 = a2;
                                i3 = size;
                                ha haVar5 = (ha) iaVar2.a.get(view);
                                if (haVar5 != null) {
                                    int i5 = 0;
                                    while (i5 < A2.length) {
                                        int i6 = i4;
                                        ha haVar6 = haVar5;
                                        haVar2.a.put(A2[i5], haVar5.a.get(A2[i5]));
                                        i5++;
                                        ArrayList<ha> arrayList3 = arrayList2;
                                        i4 = i6;
                                        haVar5 = haVar6;
                                    }
                                }
                                i2 = i4;
                                int size2 = D2.size();
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    a aVar = (a) D2.get((Animator) D2.b(i7));
                                    if (aVar.c != null && aVar.a == view && aVar.b.equals(n()) && aVar.c.equals(haVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i7++;
                                }
                            } else {
                                i3 = size;
                                i2 = i4;
                                animator2 = a2;
                                haVar2 = null;
                            }
                            animator = animator2;
                            haVar = haVar2;
                        } else {
                            Animator animator4 = a2;
                            i3 = size;
                            i2 = i4;
                            view = haVar3.b;
                            animator = animator4;
                            haVar = null;
                        }
                        if (animator != null) {
                            C0446ea eaVar = this.G;
                            if (eaVar != null) {
                                long a3 = eaVar.a(viewGroup2, this, haVar3, haVar4);
                                sparseIntArray.put(this.F.size(), (int) a3);
                                j2 = Math.min(a3, j2);
                            }
                            long j3 = j2;
                            a aVar2 = new a(view, n(), this, wa.d(viewGroup), haVar);
                            D2.put(animator, aVar2);
                            this.F.add(animator);
                            j2 = j3;
                        }
                        i4 = i2 + 1;
                        size = i3;
                    }
                }
            }
            i3 = size;
            i2 = i4;
            i4 = i2 + 1;
            size = i3;
        }
        if (j2 != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                Animator animator5 = (Animator) this.F.get(sparseIntArray.keyAt(i8));
                animator5.setStartDelay((((long) sparseIntArray.valueAt(i8)) - j2) + animator5.getStartDelay());
            }
        }
    }

    private void a(Animator animator, T<Animator, a> t2) {
        if (animator != null) {
            animator.addListener(new Z(this, t2));
            a(animator);
        }
    }

    public Transition a(View view) {
        this.i.add(view);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    public void a(ViewGroup viewGroup, boolean z2) {
        a(z2);
        if (this.h.size() > 0 || this.i.size() > 0) {
            ArrayList<String> arrayList = this.j;
            if (arrayList == null || arrayList.isEmpty()) {
                ArrayList<Class> arrayList2 = this.k;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    for (int i2 = 0; i2 < this.h.size(); i2++) {
                        View findViewById = viewGroup.findViewById(((Integer) this.h.get(i2)).intValue());
                        if (findViewById != null) {
                            ha haVar = new ha();
                            haVar.b = findViewById;
                            if (z2) {
                                c(haVar);
                            } else {
                                a(haVar);
                            }
                            haVar.c.add(this);
                            b(haVar);
                            if (z2) {
                                a(this.s, findViewById, haVar);
                            } else {
                                a(this.t, findViewById, haVar);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < this.i.size(); i3++) {
                        View view = (View) this.i.get(i3);
                        ha haVar2 = new ha();
                        haVar2.b = view;
                        if (z2) {
                            c(haVar2);
                        } else {
                            a(haVar2);
                        }
                        haVar2.c.add(this);
                        b(haVar2);
                        if (z2) {
                            a(this.s, view, haVar2);
                        } else {
                            a(this.t, view, haVar2);
                        }
                    }
                    if (z2) {
                        T<String, String> t2 = this.I;
                        if (t2 != null) {
                            int size = t2.size();
                            ArrayList arrayList3 = new ArrayList(size);
                            for (int i4 = 0; i4 < size; i4++) {
                                arrayList3.add(this.s.d.remove((String) this.I.b(i4)));
                            }
                            for (int i5 = 0; i5 < size; i5++) {
                                View view2 = (View) arrayList3.get(i5);
                                if (view2 != null) {
                                    this.s.d.put((String) this.I.d(i5), view2);
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        c(viewGroup, z2);
        if (z2) {
        }
    }

    private static void a(ia iaVar, View view, ha haVar) {
        iaVar.a.put(view, haVar);
        int id = view.getId();
        if (id >= 0) {
            if (iaVar.b.indexOfKey(id) >= 0) {
                iaVar.b.put(id, null);
            } else {
                iaVar.b.put(id, view);
            }
        }
        String r2 = C1778vc.r(view);
        if (r2 != null) {
            if (iaVar.d.containsKey(r2)) {
                iaVar.d.put(r2, null);
            } else {
                iaVar.d.put(r2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (iaVar.c.c(itemIdAtPosition) >= 0) {
                    View view2 = (View) iaVar.c.b(itemIdAtPosition);
                    if (view2 != null) {
                        C1778vc.b(view2, false);
                        iaVar.c.c(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C1778vc.b(view, true);
                iaVar.c.c(itemIdAtPosition, view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z2) {
        if (z2) {
            this.s.a.clear();
            this.s.b.clear();
            this.s.c.i();
            return;
        }
        this.t.a.clear();
        this.t.b.clear();
        this.t.c.i();
    }

    /* access modifiers changed from: 0000 */
    public ha a(View view, boolean z2) {
        TransitionSet transitionSet = this.u;
        if (transitionSet != null) {
            return transitionSet.a(view, z2);
        }
        ArrayList<ha> arrayList = z2 ? this.w : this.x;
        ha haVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            ha haVar2 = (ha) arrayList.get(i3);
            if (haVar2 == null) {
                return null;
            }
            if (haVar2.b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 >= 0) {
            haVar = (ha) (z2 ? this.x : this.w).get(i2);
        }
        return haVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(ViewGroup viewGroup) {
        this.w = new ArrayList<>();
        this.x = new ArrayList<>();
        a(this.s, this.t);
        T D2 = D();
        int size = D2.size();
        Fa d2 = wa.d(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = (Animator) D2.b(i2);
            if (animator != null) {
                a aVar = (a) D2.get(animator);
                if (!(aVar == null || aVar.a == null || !d2.equals(aVar.d))) {
                    ha haVar = aVar.c;
                    View view = aVar.a;
                    ha b2 = b(view, true);
                    ha a2 = a(view, true);
                    if (!(b2 == null && a2 == null) && aVar.e.a(haVar, a2)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            D2.remove(animator);
                        }
                    }
                }
            }
        }
        a(viewGroup, this.s, this.t, this.w, this.x);
        B();
    }

    public boolean a(ha haVar, ha haVar2) {
        if (haVar == null || haVar2 == null) {
            return false;
        }
        String[] A2 = A();
        if (A2 != null) {
            int length = A2.length;
            int i2 = 0;
            while (i2 < length) {
                if (!a(haVar, haVar2, A2[i2])) {
                    i2++;
                }
            }
            return false;
        }
        for (String a2 : haVar.a.keySet()) {
            if (a(haVar, haVar2, a2)) {
            }
        }
        return false;
        return true;
    }

    private static boolean a(ha haVar, ha haVar2, String str) {
        Object obj = haVar.a.get(str);
        Object obj2 = haVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* access modifiers changed from: protected */
    public void a(Animator animator) {
        if (animator == null) {
            i();
            return;
        }
        if (j() >= 0) {
            animator.setDuration(j());
        }
        if (q() >= 0) {
            animator.setStartDelay(q());
        }
        if (m() != null) {
            animator.setInterpolator(m());
        }
        animator.addListener(new C0438aa(this));
        animator.start();
    }

    public Transition a(c cVar) {
        if (this.E == null) {
            this.E = new ArrayList<>();
        }
        this.E.add(cVar);
        return this;
    }

    public void a(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.J = b;
        } else {
            this.J = pathMotion;
        }
    }

    public void a(b bVar) {
        this.H = bVar;
    }

    public void a(C0446ea eaVar) {
        this.G = eaVar;
    }

    /* access modifiers changed from: 0000 */
    public String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String sb2 = sb.toString();
        String str2 = ") ";
        if (this.f != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("dur(");
            sb3.append(this.f);
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        if (this.e != -1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("dly(");
            sb4.append(this.e);
            sb4.append(str2);
            sb2 = sb4.toString();
        }
        if (this.g != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append("interp(");
            sb5.append(this.g);
            sb5.append(str2);
            sb2 = sb5.toString();
        }
        if (this.h.size() <= 0 && this.i.size() <= 0) {
            return sb2;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb2);
        sb6.append("tgts(");
        String sb7 = sb6.toString();
        String str3 = ", ";
        if (this.h.size() > 0) {
            String str4 = sb7;
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str4);
                    sb8.append(str3);
                    str4 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str4);
                sb9.append(this.h.get(i2));
                str4 = sb9.toString();
            }
            sb7 = str4;
        }
        if (this.i.size() > 0) {
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                if (i3 > 0) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(sb7);
                    sb10.append(str3);
                    sb7 = sb10.toString();
                }
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb7);
                sb11.append(this.i.get(i3));
                sb7 = sb11.toString();
            }
        }
        StringBuilder sb12 = new StringBuilder();
        sb12.append(sb7);
        sb12.append(")");
        return sb12.toString();
    }
}
