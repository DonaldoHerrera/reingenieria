package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C0370l.a;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a reason: case insensitive filesystem */
/* compiled from: BackStackRecord */
final class C0359a extends A implements a, h {
    final C0377t a;
    ArrayList<C0008a> b = new ArrayList<>();
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    boolean j = true;
    String k;
    boolean l;
    int m = -1;
    int n;
    CharSequence o;
    int p;
    CharSequence q;
    ArrayList<String> r;
    ArrayList<String> s;
    boolean t = false;
    ArrayList<Runnable> u;

    /* renamed from: androidx.fragment.app.a$a reason: collision with other inner class name */
    /* compiled from: BackStackRecord */
    static final class C0008a {
        int a;
        Fragment b;
        int c;
        int d;
        int e;
        int f;

        C0008a() {
        }

        C0008a(int i, Fragment fragment) {
            this.a = i;
            this.b = fragment;
        }
    }

    public C0359a(C0377t tVar) {
        this.a = tVar;
    }

    public void a(String str, PrintWriter printWriter) {
        a(str, printWriter, true);
    }

    public A b(int i2, Fragment fragment, String str) {
        if (i2 != 0) {
            a(i2, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public A c(Fragment fragment) {
        a(new C0008a(4, fragment));
        return this;
    }

    public A d(Fragment fragment) {
        a(new C0008a(3, fragment));
        return this;
    }

    public A e(Fragment fragment) {
        a(new C0008a(5, fragment));
        return this;
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0008a aVar = (C0008a) this.b.get(i2);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.setNextTransition(this.g, this.h);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setNextAnim(aVar.c);
                    this.a.a(fragment, false);
                    break;
                case 3:
                    fragment.setNextAnim(aVar.d);
                    this.a.n(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.d);
                    this.a.h(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.c);
                    this.a.s(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.d);
                    this.a.d(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.c);
                    this.a.b(fragment);
                    break;
                case 8:
                    this.a.r(fragment);
                    break;
                case 9:
                    this.a.r(null);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(aVar.a);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.t || aVar.a == 1 || fragment == null)) {
                this.a.k(fragment);
            }
        }
        if (!this.t) {
            C0377t tVar = this.a;
            tVar.a(tVar.p, true);
        }
    }

    public String g() {
        return this.k;
    }

    /* access modifiers changed from: 0000 */
    public boolean h() {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (b((C0008a) this.b.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        ArrayList<Runnable> arrayList = this.u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Runnable) this.u.get(i2)).run();
            }
            this.u = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.m >= 0) {
            sb.append(" #");
            sb.append(this.m);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.l);
            if (this.g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (!(this.c == 0 && this.d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.d));
            }
            if (!(this.e == 0 && this.f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (!(this.n == 0 && this.o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.o);
            }
            if (!(this.p == 0 && this.q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.q);
            }
        }
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0008a aVar = (C0008a) this.b.get(i2);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("cmd=");
                        sb.append(aVar.a);
                        str2 = sb.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.b);
                if (z) {
                    if (!(aVar.c == 0 && aVar.d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.d));
                    }
                    if (aVar.e != 0 || aVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(int i2) {
        if (this.i) {
            String str = "FragmentManager";
            if (C0377t.a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i2);
                Log.v(str, sb.toString());
            }
            int size = this.b.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0008a aVar = (C0008a) this.b.get(i3);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i2;
                    if (C0377t.a) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.b);
                        sb2.append(" to ");
                        sb2.append(aVar.b.mBackStackNesting);
                        Log.v(str, sb2.toString());
                    }
                }
            }
        }
    }

    public void d() {
        e();
        this.a.b((h) this, true);
    }

    public A e() {
        if (!this.i) {
            this.j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public A b(Fragment fragment) {
        a(new C0008a(6, fragment));
        return this;
    }

    public A b(int i2) {
        this.h = i2;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public boolean d(int i2) {
        int size = this.b.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = ((C0008a) this.b.get(i3)).b;
            int i4 = fragment != null ? fragment.mContainerId : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    public A b(CharSequence charSequence) {
        this.n = 0;
        this.o = charSequence;
        return this;
    }

    public int b() {
        return a(true);
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            C0008a aVar = (C0008a) this.b.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.setNextTransition(C0377t.d(this.g), this.h);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setNextAnim(aVar.f);
                    this.a.n(fragment);
                    break;
                case 3:
                    fragment.setNextAnim(aVar.e);
                    this.a.a(fragment, false);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.e);
                    this.a.s(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f);
                    this.a.h(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.e);
                    this.a.b(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f);
                    this.a.d(fragment);
                    break;
                case 8:
                    this.a.r(null);
                    break;
                case 9:
                    this.a.r(fragment);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(aVar.a);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.t || aVar.a == 3 || fragment == null)) {
                this.a.k(fragment);
            }
        }
        if (!this.t && z) {
            C0377t tVar = this.a;
            tVar.a(tVar.p, true);
        }
    }

    public void c() {
        e();
        this.a.b((h) this, false);
    }

    /* access modifiers changed from: 0000 */
    public Fragment b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            C0008a aVar = (C0008a) this.b.get(i2);
            int i3 = aVar.a;
            if (i3 != 1) {
                if (i3 != 3) {
                    switch (i3) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.b;
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return fragment;
    }

    private static boolean b(C0008a aVar) {
        Fragment fragment = aVar.b;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    /* access modifiers changed from: 0000 */
    public void a(C0008a aVar) {
        this.b.add(aVar);
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
    }

    public A a(Fragment fragment, String str) {
        a(0, fragment, str, 1);
        return this;
    }

    public A a(int i2, Fragment fragment, String str) {
        a(i2, fragment, str, 1);
        return this;
    }

    private void a(int i2, Fragment fragment, String str, int i3) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from");
            sb.append(" instance state.");
            throw new IllegalStateException(sb.toString());
        }
        fragment.mFragmentManager = this.a;
        String str2 = " now ";
        String str3 = ": was ";
        if (str != null) {
            String str4 = fragment.mTag;
            if (str4 == null || str.equals(str4)) {
                fragment.mTag = str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(str3);
                sb2.append(fragment.mTag);
                sb2.append(str2);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = fragment.mFragmentId;
                if (i4 == 0 || i4 == i2) {
                    fragment.mFragmentId = i2;
                    fragment.mContainerId = i2;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can't change container ID of fragment ");
                    sb3.append(fragment);
                    sb3.append(str3);
                    sb3.append(fragment.mFragmentId);
                    sb3.append(str2);
                    sb3.append(i2);
                    throw new IllegalStateException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Can't add fragment ");
                sb4.append(fragment);
                sb4.append(" with tag ");
                sb4.append(str);
                sb4.append(" to container view with no id");
                throw new IllegalArgumentException(sb4.toString());
            }
        }
        a(new C0008a(i3, fragment));
    }

    public A a(int i2, Fragment fragment) {
        b(i2, fragment, null);
        return this;
    }

    public A a(Fragment fragment) {
        a(new C0008a(7, fragment));
        return this;
    }

    public A a(int i2, int i3) {
        a(i2, i3, 0, 0);
        return this;
    }

    public A a(int i2, int i3, int i4, int i5) {
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        return this;
    }

    public A a(int i2) {
        this.g = i2;
        return this;
    }

    public A a(View view, String str) {
        if (F.a()) {
            String r2 = C1778vc.r(view);
            if (r2 != null) {
                if (this.r == null) {
                    this.r = new ArrayList<>();
                    this.s = new ArrayList<>();
                } else if (this.s.contains(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("A shared element with the target name '");
                    sb.append(str);
                    sb.append("' has already been added to the transaction.");
                    throw new IllegalArgumentException(sb.toString());
                } else if (this.r.contains(r2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("A shared element with the source name '");
                    sb2.append(r2);
                    sb2.append(" has already been added to the transaction.");
                    throw new IllegalArgumentException(sb2.toString());
                }
                this.r.add(r2);
                this.s.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    public A a(String str) {
        if (this.j) {
            this.i = true;
            this.k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public A a(CharSequence charSequence) {
        this.p = 0;
        this.q = charSequence;
        return this;
    }

    public int a() {
        return a(false);
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"RestrictedApi"})
    public int a(boolean z) {
        if (!this.l) {
            if (C0377t.a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                String str = "FragmentManager";
                Log.v(str, sb.toString());
                PrintWriter printWriter = new PrintWriter(new C0239Ob(str));
                a("  ", printWriter);
                printWriter.close();
            }
            this.l = true;
            if (this.i) {
                this.m = this.a.b(this);
            } else {
                this.m = -1;
            }
            this.a.a((h) this, z);
            return this.m;
        }
        throw new IllegalStateException("commit already called");
    }

    public boolean a(ArrayList<C0359a> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0377t.a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.i) {
            this.a.a(this);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(ArrayList<C0359a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.b.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = ((C0008a) this.b.get(i5)).b;
            int i6 = fragment != null ? fragment.mContainerId : 0;
            if (!(i6 == 0 || i6 == i4)) {
                for (int i7 = i2; i7 < i3; i7++) {
                    C0359a aVar = (C0359a) arrayList.get(i7);
                    int size2 = aVar.b.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = ((C0008a) aVar.b.get(i8)).b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public Fragment a(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i2 < this.b.size()) {
            C0008a aVar = (C0008a) this.b.get(i2);
            int i3 = aVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    Fragment fragment3 = aVar.b;
                    int i4 = fragment3.mContainerId;
                    Fragment fragment4 = fragment2;
                    int i5 = i2;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList2.get(size);
                        if (fragment5.mContainerId == i4) {
                            if (fragment5 == fragment3) {
                                z = true;
                            } else {
                                if (fragment5 == fragment4) {
                                    this.b.add(i5, new C0008a(9, fragment5));
                                    i5++;
                                    fragment4 = null;
                                }
                                C0008a aVar2 = new C0008a(3, fragment5);
                                aVar2.c = aVar.c;
                                aVar2.e = aVar.e;
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                this.b.add(i5, aVar2);
                                arrayList2.remove(fragment5);
                                i5++;
                            }
                        }
                    }
                    if (z) {
                        this.b.remove(i5);
                        i5--;
                    } else {
                        aVar.a = 1;
                        arrayList2.add(fragment3);
                    }
                    i2 = i5;
                    fragment2 = fragment4;
                } else if (i3 == 3 || i3 == 6) {
                    arrayList2.remove(aVar.b);
                    Fragment fragment6 = aVar.b;
                    if (fragment6 == fragment2) {
                        this.b.add(i2, new C0008a(9, fragment6));
                        i2++;
                        fragment2 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.b.add(i2, new C0008a(9, fragment2));
                        i2++;
                        fragment2 = aVar.b;
                    }
                }
                i2++;
            }
            arrayList2.add(aVar.b);
            i2++;
        }
        return fragment2;
    }

    /* access modifiers changed from: 0000 */
    public void a(c cVar) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            C0008a aVar = (C0008a) this.b.get(i2);
            if (b(aVar)) {
                aVar.b.setOnStartEnterTransitionListener(cVar);
            }
        }
    }
}
