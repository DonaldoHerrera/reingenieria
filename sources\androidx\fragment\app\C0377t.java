package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.t reason: case insensitive filesystem */
/* compiled from: FragmentManagerImpl */
final class C0377t extends C0370l implements Factory2 {
    static boolean a = false;
    static Field b;
    static final Interpolator c = new DecelerateInterpolator(2.5f);
    static final Interpolator d = new DecelerateInterpolator(1.5f);
    ArrayList<C0359a> A;
    ArrayList<Boolean> B;
    ArrayList<Fragment> C;
    Bundle D = null;
    SparseArray<Parcelable> E = null;
    ArrayList<j> F;
    private w G;
    Runnable H = new C0371m(this);
    ArrayList<h> e;
    boolean f;
    int g = 0;
    final ArrayList<Fragment> h = new ArrayList<>();
    final HashMap<String, Fragment> i = new HashMap<>();
    ArrayList<C0359a> j;
    ArrayList<Fragment> k;
    ArrayList<C0359a> l;
    ArrayList<Integer> m;
    ArrayList<androidx.fragment.app.C0370l.c> n;
    private final CopyOnWriteArrayList<f> o = new CopyOnWriteArrayList<>();
    int p = 0;
    C0369k q;
    C0366h r;
    Fragment s;
    Fragment t;
    C0368j u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;

    /* renamed from: androidx.fragment.app.t$a */
    /* compiled from: FragmentManagerImpl */
    private static class a extends b {
        View b;

        a(View view, AnimationListener animationListener) {
            super(animationListener);
            this.b = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (C1778vc.A(this.b) || VERSION.SDK_INT >= 24) {
                this.b.post(new C0376s(this));
            } else {
                this.b.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: androidx.fragment.app.t$b */
    /* compiled from: FragmentManagerImpl */
    private static class b implements AnimationListener {
        private final AnimationListener a;

        b(AnimationListener animationListener) {
            this.a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            AnimationListener animationListener = this.a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            AnimationListener animationListener = this.a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            AnimationListener animationListener = this.a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$c */
    /* compiled from: FragmentManagerImpl */
    private static class c {
        public final Animation a;
        public final Animator b;

        c(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        c(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$d */
    /* compiled from: FragmentManagerImpl */
    private static class d extends AnimatorListenerAdapter {
        View a;

        d(View view) {
            this.a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.setLayerType(0, null);
            animator.removeListener(this);
        }

        public void onAnimationStart(Animator animator) {
            this.a.setLayerType(2, null);
        }
    }

    /* renamed from: androidx.fragment.app.t$e */
    /* compiled from: FragmentManagerImpl */
    private static class e extends AnimationSet implements Runnable {
        private final ViewGroup a;
        private final View b;
        private boolean c;
        private boolean d;
        private boolean e = true;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.a = viewGroup;
            this.b = view;
            addAnimation(animation);
            this.a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.e = true;
            if (this.c) {
                return !this.d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.c = true;
                C1537nc.a(this.a, this);
            }
            return true;
        }

        public void run() {
            if (this.c || !this.e) {
                this.a.endViewTransition(this.b);
                this.d = true;
                return;
            }
            this.e = false;
            this.a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.e = true;
            if (this.c) {
                return !this.d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.c = true;
                C1537nc.a(this.a, this);
            }
            return true;
        }
    }

    /* renamed from: androidx.fragment.app.t$f */
    /* compiled from: FragmentManagerImpl */
    private static final class f {
        final androidx.fragment.app.C0370l.b a;
        final boolean b;
    }

    /* renamed from: androidx.fragment.app.t$g */
    /* compiled from: FragmentManagerImpl */
    static class g {
        public static final int[] a = {16842755, 16842960, 16842961};
    }

    /* renamed from: androidx.fragment.app.t$h */
    /* compiled from: FragmentManagerImpl */
    interface h {
        boolean a(ArrayList<C0359a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.t$i */
    /* compiled from: FragmentManagerImpl */
    private class i implements h {
        final String a;
        final int b;
        final int c;

        i(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public boolean a(ArrayList<C0359a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = C0377t.this.t;
            if (fragment != null && this.b < 0 && this.a == null) {
                C0370l peekChildFragmentManager = fragment.peekChildFragmentManager();
                if (peekChildFragmentManager != null && peekChildFragmentManager.h()) {
                    return false;
                }
            }
            return C0377t.this.a(arrayList, arrayList2, this.a, this.b, this.c);
        }
    }

    /* renamed from: androidx.fragment.app.t$j */
    /* compiled from: FragmentManagerImpl */
    static class j implements c {
        final boolean a;
        final C0359a b;
        private int c;

        j(C0359a aVar, boolean z) {
            this.a = z;
            this.b = aVar;
        }

        public void a() {
            this.c++;
        }

        public void b() {
            this.c--;
            if (this.c == 0) {
                this.b.a.y();
            }
        }

        public void c() {
            C0359a aVar = this.b;
            aVar.a.a(aVar, this.a, false, false);
        }

        public void d() {
            boolean z = this.c > 0;
            C0377t tVar = this.b.a;
            int size = tVar.h.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) tVar.h.get(i);
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C0359a aVar = this.b;
            aVar.a.a(aVar, this.a, !z, true);
        }

        public boolean e() {
            return this.c == 0;
        }
    }

    C0377t() {
    }

    private void A() {
        this.i.values().removeAll(Collections.singleton(null));
    }

    private void B() {
        if (f()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void C() {
        this.f = false;
        this.B.clear();
        this.A.clear();
    }

    private void D() {
        for (Fragment fragment : this.i.values()) {
            if (fragment != null) {
                if (fragment.getAnimatingAway() != null) {
                    int stateAfterAnimating = fragment.getStateAfterAnimating();
                    View animatingAway = fragment.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.setAnimatingAway(null);
                    a(fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.getAnimator() != null) {
                    fragment.getAnimator().end();
                }
            }
        }
    }

    private void E() {
        if (this.F != null) {
            while (!this.F.isEmpty()) {
                ((j) this.F.remove(0)).d();
            }
        }
    }

    static boolean a(c cVar) {
        Animation animation = cVar.a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return a(cVar.b);
        }
        List animations = ((AnimationSet) animation).getAnimations();
        for (int i2 = 0; i2 < animations.size(); i2++) {
            if (animations.get(i2) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    public static int b(int i2, boolean z2) {
        if (i2 == 4097) {
            return z2 ? 1 : 2;
        }
        if (i2 == 4099) {
            return z2 ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z2 ? 3 : 4;
    }

    public static int d(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private Fragment t(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.h.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = (Fragment) this.h.get(indexOf);
                if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public boolean b() {
        boolean s2 = s();
        E();
        return s2;
    }

    public int c() {
        ArrayList<C0359a> arrayList = this.j;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void d(Fragment fragment) {
        if (a) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (a) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                synchronized (this.h) {
                    this.h.remove(fragment);
                }
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.v = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    public List<Fragment> e() {
        List<Fragment> list;
        if (this.h.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.h) {
            list = (List) this.h.clone();
        }
        return list;
    }

    /* access modifiers changed from: 0000 */
    public w f(Fragment fragment) {
        return this.G.c(fragment);
    }

    public void g() {
        a((h) new i(null, -1, 0), false);
    }

    public boolean h() {
        B();
        return a((String) null, -1, 0);
    }

    /* access modifiers changed from: 0000 */
    public void i(Fragment fragment) {
        if (this.i.get(fragment.mWho) == null) {
            this.i.put(fragment.mWho, fragment);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    a(fragment);
                } else {
                    o(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            if (a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Added fragment to active set ");
                sb.append(fragment);
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void j(Fragment fragment) {
        if (this.i.get(fragment.mWho) != null) {
            if (a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Removed fragment from active set ");
                sb.append(fragment);
                Log.v("FragmentManager", sb.toString());
            }
            this.i.put(fragment.mWho, null);
            o(fragment);
            String str = fragment.mTargetWho;
            if (str != null) {
                fragment.mTarget = (Fragment) this.i.get(str);
            }
            fragment.initState();
        }
    }

    /* access modifiers changed from: 0000 */
    public void k(Fragment fragment) {
        if (fragment != null) {
            int i2 = this.p;
            if (fragment.mRemoving) {
                if (fragment.isInBackStack()) {
                    i2 = Math.min(i2, 1);
                } else {
                    i2 = Math.min(i2, 0);
                }
            }
            a(fragment, i2, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
            if (fragment.mView != null) {
                Fragment t2 = t(fragment);
                if (t2 != null) {
                    View view = t2.mView;
                    ViewGroup viewGroup = fragment.mContainer;
                    int indexOfChild = viewGroup.indexOfChild(view);
                    int indexOfChild2 = viewGroup.indexOfChild(fragment.mView);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup.removeViewAt(indexOfChild2);
                        viewGroup.addView(fragment.mView, indexOfChild);
                    }
                }
                if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                    float f2 = fragment.mPostponedAlpha;
                    if (f2 > 0.0f) {
                        fragment.mView.setAlpha(f2);
                    }
                    fragment.mPostponedAlpha = 0.0f;
                    fragment.mIsNewlyAdded = false;
                    c a2 = a(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
                    if (a2 != null) {
                        b(fragment.mView, a2);
                        Animation animation = a2.a;
                        if (animation != null) {
                            fragment.mView.startAnimation(animation);
                        } else {
                            a2.b.setTarget(fragment.mView);
                            a2.b.start();
                        }
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                c(fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void l(Fragment fragment) {
        a(fragment, this.p, 0, 0, false);
    }

    public void m(Fragment fragment) {
        if (fragment.mDeferStart) {
            if (this.f) {
                this.z = true;
                return;
            }
            fragment.mDeferStart = false;
            a(fragment, this.p, 0, 0, false);
        }
    }

    public void n(Fragment fragment) {
        if (a) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.mBackStackNesting);
            Log.v("FragmentManager", sb.toString());
        }
        boolean z2 = !fragment.isInBackStack();
        if (!fragment.mDetached || z2) {
            synchronized (this.h) {
                this.h.remove(fragment);
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.v = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public void o(Fragment fragment) {
        this.G.e(fragment);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment;
        AttributeSet attributeSet2 = attributeSet;
        String str2 = str;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue(null, "class");
        Context context2 = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, g.a);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str3 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str3 == null || !C0368j.a(context.getClassLoader(), str3)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(str3);
            throw new IllegalArgumentException(sb.toString());
        }
        Fragment a2 = resourceId != -1 ? a(resourceId) : null;
        if (a2 == null && string != null) {
            a2 = a(string);
        }
        if (a2 == null && i2 != -1) {
            a2 = a(i2);
        }
        if (a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCreateView: id=0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(" fname=");
            sb2.append(str3);
            sb2.append(" existing=");
            sb2.append(a2);
            Log.v("FragmentManager", sb2.toString());
        }
        if (a2 == null) {
            Fragment a3 = d().a(context.getClassLoader(), str3, null);
            a3.mFromLayout = true;
            a3.mFragmentId = resourceId != 0 ? resourceId : i2;
            a3.mContainerId = i2;
            a3.mTag = string;
            a3.mInLayout = true;
            a3.mFragmentManager = this;
            C0369k kVar = this.q;
            a3.mHost = kVar;
            a3.onInflate(kVar.c(), attributeSet2, a3.mSavedFragmentState);
            a(a3, true);
            fragment = a3;
        } else if (!a2.mInLayout) {
            a2.mInLayout = true;
            C0369k kVar2 = this.q;
            a2.mHost = kVar2;
            a2.onInflate(kVar2.c(), attributeSet2, a2.mSavedFragmentState);
            fragment = a2;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(attributeSet.getPositionDescription());
            sb3.append(": Duplicate id 0x");
            sb3.append(Integer.toHexString(resourceId));
            sb3.append(", tag ");
            sb3.append(string);
            sb3.append(", or parent id 0x");
            sb3.append(Integer.toHexString(i2));
            sb3.append(" with another fragment for ");
            sb3.append(str3);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (this.p >= 1 || !fragment.mFromLayout) {
            l(fragment);
        } else {
            a(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            return fragment.mView;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Fragment ");
        sb4.append(str3);
        sb4.append(" did not create a view.");
        throw new IllegalStateException(sb4.toString());
    }

    /* access modifiers changed from: 0000 */
    public Bundle p(Fragment fragment) {
        Bundle bundle;
        if (this.D == null) {
            this.D = new Bundle();
        }
        fragment.performSaveInstanceState(this.D);
        d(fragment, this.D, false);
        if (!this.D.isEmpty()) {
            bundle = this.D;
            this.D = null;
        } else {
            bundle = null;
        }
        if (fragment.mView != null) {
            q(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    /* access modifiers changed from: 0000 */
    public void q(Fragment fragment) {
        if (fragment.mInnerView != null) {
            SparseArray<Parcelable> sparseArray = this.E;
            if (sparseArray == null) {
                this.E = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.E);
            if (this.E.size() > 0) {
                fragment.mSavedViewState = this.E;
                this.E = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void r() {
        if (this.z) {
            this.z = false;
            z();
        }
    }

    public void s(Fragment fragment) {
        if (a) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* access modifiers changed from: 0000 */
    public Factory2 t() {
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.s;
        if (fragment != null) {
            C0235Nb.a(fragment, sb);
        } else {
            C0235Nb.a(this.q, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    public Fragment u() {
        return this.t;
    }

    public void v() {
        this.w = false;
        this.x = false;
        int size = this.h.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = (Fragment) this.h.get(i2);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void w() {
        if (this.n != null) {
            for (int i2 = 0; i2 < this.n.size(); i2++) {
                ((androidx.fragment.app.C0370l.c) this.n.get(i2)).onBackStackChanged();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public Parcelable x() {
        ArrayList<String> arrayList;
        E();
        D();
        s();
        this.w = true;
        BackStackState[] backStackStateArr = null;
        if (this.i.isEmpty()) {
            return null;
        }
        ArrayList<FragmentState> arrayList2 = new ArrayList<>(this.i.size());
        Iterator it = this.i.values().iterator();
        boolean z2 = false;
        while (true) {
            String str = ": ";
            String str2 = " was removed from the FragmentManager";
            String str3 = "Failure saving state: active ";
            String str4 = "FragmentManager";
            if (it.hasNext()) {
                Fragment fragment = (Fragment) it.next();
                if (fragment != null) {
                    if (fragment.mFragmentManager == this) {
                        FragmentState fragmentState = new FragmentState(fragment);
                        arrayList2.add(fragmentState);
                        if (fragment.mState <= 0 || fragmentState.k != null) {
                            fragmentState.k = fragment.mSavedFragmentState;
                        } else {
                            fragmentState.k = p(fragment);
                            String str5 = fragment.mTargetWho;
                            if (str5 != null) {
                                Fragment fragment2 = (Fragment) this.i.get(str5);
                                if (fragment2 != null) {
                                    if (fragmentState.k == null) {
                                        fragmentState.k = new Bundle();
                                    }
                                    a(fragmentState.k, "android:target_state", fragment2);
                                    int i2 = fragment.mTargetRequestCode;
                                    if (i2 != 0) {
                                        fragmentState.k.putInt("android:target_req_state", i2);
                                    }
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Failure saving state: ");
                                    sb.append(fragment);
                                    sb.append(" has target not in fragment manager: ");
                                    sb.append(fragment.mTargetWho);
                                    a((RuntimeException) new IllegalStateException(sb.toString()));
                                    throw null;
                                }
                            }
                        }
                        if (a) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Saved state of ");
                            sb2.append(fragment);
                            sb2.append(str);
                            sb2.append(fragmentState.k);
                            Log.v(str4, sb2.toString());
                        }
                        z2 = true;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str3);
                        sb3.append(fragment);
                        sb3.append(str2);
                        a((RuntimeException) new IllegalStateException(sb3.toString()));
                        throw null;
                    }
                }
            } else if (!z2) {
                if (a) {
                    Log.v(str4, "saveAllState: no fragments!");
                }
                return null;
            } else {
                int size = this.h.size();
                if (size > 0) {
                    arrayList = new ArrayList<>(size);
                    Iterator it2 = this.h.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment3 = (Fragment) it2.next();
                        arrayList.add(fragment3.mWho);
                        if (fragment3.mFragmentManager != this) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str3);
                            sb4.append(fragment3);
                            sb4.append(str2);
                            a((RuntimeException) new IllegalStateException(sb4.toString()));
                            throw null;
                        } else if (a) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("saveAllState: adding fragment (");
                            sb5.append(fragment3.mWho);
                            sb5.append("): ");
                            sb5.append(fragment3);
                            Log.v(str4, sb5.toString());
                        }
                    }
                } else {
                    arrayList = null;
                }
                ArrayList<C0359a> arrayList3 = this.j;
                if (arrayList3 != null) {
                    int size2 = arrayList3.size();
                    if (size2 > 0) {
                        backStackStateArr = new BackStackState[size2];
                        for (int i3 = 0; i3 < size2; i3++) {
                            backStackStateArr[i3] = new BackStackState((C0359a) this.j.get(i3));
                            if (a) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("saveAllState: adding back stack #");
                                sb6.append(i3);
                                sb6.append(str);
                                sb6.append(this.j.get(i3));
                                Log.v(str4, sb6.toString());
                            }
                        }
                    }
                }
                FragmentManagerState fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.a = arrayList2;
                fragmentManagerState.b = arrayList;
                fragmentManagerState.c = backStackStateArr;
                Fragment fragment4 = this.t;
                if (fragment4 != null) {
                    fragmentManagerState.d = fragment4.mWho;
                }
                fragmentManagerState.e = this.g;
                return fragmentManagerState;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void y() {
        synchronized (this) {
            boolean z2 = false;
            boolean z3 = this.F != null && !this.F.isEmpty();
            if (this.e != null && this.e.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.q.d().removeCallbacks(this.H);
                this.q.d().post(this.H);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void z() {
        for (Fragment fragment : this.i.values()) {
            if (fragment != null) {
                m(fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean c(int i2) {
        return this.p >= i2;
    }

    public boolean f() {
        return this.w || this.x;
    }

    /* access modifiers changed from: 0000 */
    public v g(Fragment fragment) {
        return this.G.d(fragment);
    }

    public void l() {
        e(1);
    }

    public void o() {
        this.w = false;
        this.x = false;
        e(4);
    }

    private static void b(View view, c cVar) {
        if (view != null && cVar != null && a(view, cVar)) {
            Animator animator = cVar.b;
            if (animator != null) {
                animator.addListener(new d(view));
                return;
            }
            AnimationListener a2 = a(cVar.a);
            view.setLayerType(2, null);
            cVar.a.setAnimationListener(new a(view, a2));
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(Fragment fragment) {
        if (fragment.mView != null) {
            c a2 = a(fragment, fragment.getNextTransition(), !fragment.mHidden, fragment.getNextTransitionStyle());
            if (a2 != null) {
                Animator animator = a2.b;
                if (animator != null) {
                    animator.setTarget(fragment.mView);
                    if (!fragment.mHidden) {
                        fragment.mView.setVisibility(0);
                    } else if (fragment.isHideReplaced()) {
                        fragment.setHideReplaced(false);
                    } else {
                        ViewGroup viewGroup = fragment.mContainer;
                        View view = fragment.mView;
                        viewGroup.startViewTransition(view);
                        a2.b.addListener(new C0375q(this, viewGroup, view, fragment));
                    }
                    b(fragment.mView, a2);
                    a2.b.start();
                }
            }
            if (a2 != null) {
                b(fragment.mView, a2);
                fragment.mView.startAnimation(a2.a);
                a2.a.start();
            }
            fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
            if (fragment.isHideReplaced()) {
                fragment.setHideReplaced(false);
            }
        }
        if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible) {
            this.v = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* access modifiers changed from: 0000 */
    public void f(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.s;
        if (fragment2 != null) {
            C0370l fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0377t) {
                ((C0377t) fragmentManager).f(fragment, true);
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!z2 || fVar.b) {
                fVar.a.e(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void g(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.s;
        if (fragment2 != null) {
            C0370l fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0377t) {
                ((C0377t) fragmentManager).g(fragment, true);
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!z2 || fVar.b) {
                fVar.a.f(this, fragment);
            }
        }
    }

    public void h(Fragment fragment) {
        if (a) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    public void r(Fragment fragment) {
        if (fragment == null || (this.i.get(fragment.mWho) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this))) {
            this.t = fragment;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: finally extract failed */
    public boolean s() {
        d(true);
        boolean z2 = false;
        while (b(this.A, this.B)) {
            this.f = true;
            try {
                c(this.A, this.B);
                C();
                z2 = true;
            } catch (Throwable th) {
                C();
                throw th;
            }
        }
        r();
        A();
        return z2;
    }

    /* access modifiers changed from: 0000 */
    public void e(Fragment fragment) {
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            View view = fragment.mView;
            if (view != null) {
                fragment.mInnerView = view;
                view.setSaveFromParentEnabled(false);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                a(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                return;
            }
            fragment.mInnerView = null;
        }
    }

    public void m() {
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            Fragment fragment = (Fragment) this.h.get(i2);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    static boolean a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                if (a((Animator) childAnimations.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void h(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.s;
        if (fragment2 != null) {
            C0370l fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0377t) {
                ((C0377t) fragmentManager).h(fragment, true);
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!z2 || fVar.b) {
                fVar.a.g(this, fragment);
            }
        }
    }

    public void j() {
        this.w = false;
        this.x = false;
        e(1);
    }

    public void b(Fragment fragment) {
        if (a) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            if (!this.h.contains(fragment)) {
                if (a) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                synchronized (this.h) {
                    this.h.add(fragment);
                }
                fragment.mAdded = true;
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.v = true;
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Fragment already added: ");
            sb3.append(fragment);
            throw new IllegalStateException(sb3.toString());
        }
    }

    public void i() {
        this.w = false;
        this.x = false;
        e(2);
    }

    public void q() {
        this.x = true;
        e(2);
    }

    public void n() {
        e(3);
    }

    private void d(boolean z2) {
        if (this.f) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.q == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.q.d().getLooper()) {
            if (!z2) {
                B();
            }
            if (this.A == null) {
                this.A = new ArrayList<>();
                this.B = new ArrayList<>();
            }
            this.f = true;
            try {
                a(null, null);
            } finally {
                this.f = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* JADX INFO: finally extract failed */
    private void e(int i2) {
        try {
            this.f = true;
            a(i2, false);
            this.f = false;
            s();
        } catch (Throwable th) {
            this.f = false;
            throw th;
        }
    }

    static boolean a(View view, c cVar) {
        if (view == null || cVar == null || VERSION.SDK_INT < 19 || view.getLayerType() != 0 || !C1778vc.x(view) || !a(cVar)) {
            return false;
        }
        return true;
    }

    public void p() {
        this.w = false;
        this.x = false;
        e(3);
    }

    @SuppressLint({"RestrictedApi"})
    private void a(RuntimeException runtimeException) {
        String str = "FragmentManager";
        Log.e(str, runtimeException.getMessage());
        Log.e(str, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0239Ob(str));
        C0369k kVar = this.q;
        String str2 = "Failed dumping state";
        String str3 = "  ";
        if (kVar != null) {
            try {
                kVar.a(str3, (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e(str, str2, e2);
            }
        } else {
            try {
                a(str3, (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e(str, str2, e3);
            }
        }
        throw runtimeException;
    }

    /* access modifiers changed from: 0000 */
    public void e(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.s;
        if (fragment2 != null) {
            C0370l fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0377t) {
                ((C0377t) fragmentManager).e(fragment, true);
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!z2 || fVar.b) {
                fVar.a.d(this, fragment);
            }
        }
    }

    public Fragment b(String str) {
        for (Fragment fragment : this.i.values()) {
            if (fragment != null) {
                Fragment findFragmentByWho = fragment.findFragmentByWho(str);
                if (findFragmentByWho != null) {
                    return findFragmentByWho;
                }
            }
        }
        return null;
    }

    public int b(C0359a aVar) {
        synchronized (this) {
            if (this.m != null) {
                if (this.m.size() > 0) {
                    int intValue = ((Integer) this.m.remove(this.m.size() - 1)).intValue();
                    if (a) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Adding back stack index ");
                        sb.append(intValue);
                        sb.append(" with ");
                        sb.append(aVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    this.l.set(intValue, aVar);
                    return intValue;
                }
            }
            if (this.l == null) {
                this.l = new ArrayList<>();
            }
            int size = this.l.size();
            if (a) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Setting back stack index ");
                sb2.append(size);
                sb2.append(" to ");
                sb2.append(aVar);
                Log.v("FragmentManager", sb2.toString());
            }
            this.l.add(aVar);
            return size;
        }
    }

    public C0368j d() {
        if (this.u == null) {
            Fragment fragment = this.s;
            if (fragment != null) {
                return fragment.mFragmentManager.d();
            }
            this.u = new r(this);
        }
        return this.u;
    }

    private void c(ArrayList<C0359a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            a(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!((C0359a) arrayList.get(i2)).t) {
                    if (i3 != i2) {
                        b(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                        while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((C0359a) arrayList.get(i3)).t) {
                            i3++;
                        }
                    }
                    b(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                b(arrayList, arrayList2, i3, size);
            }
        }
    }

    public A a() {
        return new C0359a(this);
    }

    public void k() {
        this.y = true;
        s();
        e(0);
        this.q = null;
        this.r = null;
        this.s = null;
    }

    public void a(String str, int i2) {
        a((h) new i(str, -1, i2), false);
    }

    /* access modifiers changed from: 0000 */
    public void d(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.s;
        if (fragment2 != null) {
            C0370l fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0377t) {
                ((C0377t) fragmentManager).d(fragment, true);
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!z2 || fVar.b) {
                fVar.a.c(this, fragment);
            }
        }
    }

    public void a(int i2, int i3) {
        if (i2 >= 0) {
            a((h) new i(null, i2, i3), false);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad id: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    private boolean a(String str, int i2, int i3) {
        s();
        d(true);
        Fragment fragment = this.t;
        if (fragment != null && i2 < 0 && str == null) {
            C0370l peekChildFragmentManager = fragment.peekChildFragmentManager();
            if (peekChildFragmentManager != null && peekChildFragmentManager.h()) {
                return true;
            }
        }
        boolean a2 = a(this.A, this.B, str, i2, i3);
        if (a2) {
            this.f = true;
            try {
                c(this.A, this.B);
            } finally {
                C();
            }
        }
        r();
        A();
        return a2;
    }

    public void b(int i2) {
        synchronized (this) {
            this.l.set(i2, null);
            if (this.m == null) {
                this.m = new ArrayList<>();
            }
            if (a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Freeing back stack index ");
                sb.append(i2);
                Log.v("FragmentManager", sb.toString());
            }
            this.m.add(Integer.valueOf(i2));
        }
    }

    /* access modifiers changed from: 0000 */
    public void d(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.s;
        if (fragment2 != null) {
            C0370l fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0377t) {
                ((C0377t) fragmentManager).d(fragment, bundle, true);
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!z2 || fVar.b) {
                fVar.a.d(this, fragment, bundle);
            }
        }
    }

    public void c(boolean z2) {
        for (int size = this.h.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.h.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z2);
            }
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public void a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not currently in the FragmentManager");
        a((RuntimeException) new IllegalStateException(sb.toString()));
        throw null;
    }

    public void b(h hVar, boolean z2) {
        if (!z2 || (this.q != null && !this.y)) {
            d(z2);
            if (hVar.a(this.A, this.B)) {
                this.f = true;
                try {
                    c(this.A, this.B);
                } finally {
                    C();
                }
            }
            r();
            A();
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.s;
        if (fragment2 != null) {
            C0370l fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0377t) {
                ((C0377t) fragmentManager).c(fragment, bundle, true);
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!z2 || fVar.b) {
                fVar.a.c(this, fragment, bundle);
            }
        }
    }

    public Fragment a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = (Fragment) this.i.get(string);
        if (fragment != null) {
            return fragment;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment no longer exists for key ");
        sb.append(str);
        sb.append(": unique id ");
        sb.append(string);
        a((RuntimeException) new IllegalStateException(sb.toString()));
        throw null;
    }

    /* access modifiers changed from: 0000 */
    public void a(Fragment fragment) {
        this.G.a(fragment);
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String sb2 = sb.toString();
        if (!this.i.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.i.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.dump(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size = this.h.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment2 = (Fragment) this.h.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.k;
        if (arrayList != null) {
            int size2 = arrayList.size();
            if (size2 > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i3 = 0; i3 < size2; i3++) {
                    Fragment fragment3 = (Fragment) this.k.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(fragment3.toString());
                }
            }
        }
        ArrayList<C0359a> arrayList2 = this.j;
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i4 = 0; i4 < size3; i4++) {
                    C0359a aVar = (C0359a) this.j.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.a(sb2, printWriter);
                }
            }
        }
        synchronized (this) {
            if (this.l != null) {
                int size4 = this.l.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        C0359a aVar2 = (C0359a) this.l.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(aVar2);
                    }
                }
            }
            if (this.m != null && this.m.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.m.toArray()));
            }
        }
        ArrayList<h> arrayList3 = this.e;
        if (arrayList3 != null) {
            int size5 = arrayList3.size();
            if (size5 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i6 = 0; i6 < size5; i6++) {
                    h hVar = (h) this.e.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(hVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.r);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.w);
        printWriter.print(" mStopped=");
        printWriter.print(this.x);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.y);
        if (this.v) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.v);
        }
    }

    private void b(ArrayList<C0359a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        ArrayList<C0359a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i5 = i2;
        int i6 = i3;
        boolean z2 = ((C0359a) arrayList3.get(i5)).t;
        ArrayList<Fragment> arrayList5 = this.C;
        if (arrayList5 == null) {
            this.C = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.C.addAll(this.h);
        Fragment u2 = u();
        boolean z3 = false;
        for (int i7 = i5; i7 < i6; i7++) {
            C0359a aVar = (C0359a) arrayList3.get(i7);
            if (!((Boolean) arrayList4.get(i7)).booleanValue()) {
                u2 = aVar.a(this.C, u2);
            } else {
                u2 = aVar.b(this.C, u2);
            }
            z3 = z3 || aVar.i;
        }
        this.C.clear();
        if (!z2) {
            F.a(this, arrayList, arrayList2, i2, i3, false);
        }
        a(arrayList, arrayList2, i2, i3);
        if (z2) {
            V v2 = new V();
            a(v2);
            int a2 = a(arrayList, arrayList2, i2, i3, v2);
            b(v2);
            i4 = a2;
        } else {
            i4 = i6;
        }
        if (i4 != i5 && z2) {
            F.a(this, arrayList, arrayList2, i2, i4, true);
            a(this.p, true);
        }
        while (i5 < i6) {
            C0359a aVar2 = (C0359a) arrayList3.get(i5);
            if (((Boolean) arrayList4.get(i5)).booleanValue()) {
                int i8 = aVar2.m;
                if (i8 >= 0) {
                    b(i8);
                    aVar2.m = -1;
                }
            }
            aVar2.i();
            i5++;
        }
        if (z3) {
            w();
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.s;
        if (fragment2 != null) {
            C0370l fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0377t) {
                ((C0377t) fragmentManager).c(fragment, true);
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!z2 || fVar.b) {
                fVar.a.b(this, fragment);
            }
        }
    }

    private void b(V<Fragment> v2) {
        int size = v2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = (Fragment) v2.n(i2);
            if (!fragment.mAdded) {
                View requireView = fragment.requireView();
                fragment.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        return false;
     */
    private boolean b(ArrayList<C0359a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.e != null) {
                if (this.e.size() != 0) {
                    boolean z2 = false;
                    for (int i2 = 0; i2 < this.e.size(); i2++) {
                        z2 |= ((h) this.e.get(i2)).a(arrayList, arrayList2);
                    }
                    this.e.clear();
                    this.q.d().removeCallbacks(this.H);
                    return z2;
                }
            }
        }
    }

    public void b(boolean z2) {
        for (int size = this.h.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.h.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z2);
            }
        }
    }

    public boolean b(Menu menu) {
        if (this.p < 1) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            Fragment fragment = (Fragment) this.h.get(i2);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public boolean b(MenuItem menuItem) {
        if (this.p < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            Fragment fragment = (Fragment) this.h.get(i2);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void b(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.s;
        if (fragment2 != null) {
            C0370l fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0377t) {
                ((C0377t) fragmentManager).b(fragment, context, true);
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!z2 || fVar.b) {
                fVar.a.b((C0370l) this, fragment, context);
            }
        }
    }

    static c a(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(c);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(d);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new c((Animation) animationSet);
    }

    /* access modifiers changed from: 0000 */
    public void b(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.s;
        if (fragment2 != null) {
            C0370l fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0377t) {
                ((C0377t) fragmentManager).b(fragment, bundle, true);
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!z2 || fVar.b) {
                fVar.a.b((C0370l) this, fragment, bundle);
            }
        }
    }

    static c a(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(d);
        alphaAnimation.setDuration(220);
        return new c((Animation) alphaAnimation);
    }

    /* access modifiers changed from: 0000 */
    public void b(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.s;
        if (fragment2 != null) {
            C0370l fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0377t) {
                ((C0377t) fragmentManager).b(fragment, true);
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!z2 || fVar.b) {
                fVar.a.a(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public c a(Fragment fragment, int i2, boolean z2, int i3) {
        int nextAnim = fragment.getNextAnim();
        Animation onCreateAnimation = fragment.onCreateAnimation(i2, z2, nextAnim);
        if (onCreateAnimation != null) {
            return new c(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(i2, z2, nextAnim);
        if (onCreateAnimator != null) {
            return new c(onCreateAnimator);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(this.q.c().getResources().getResourceTypeName(nextAnim));
            boolean z3 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.q.c(), nextAnim);
                    if (loadAnimation != null) {
                        return new c(loadAnimation);
                    }
                    z3 = true;
                } catch (NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.q.c(), nextAnim);
                    if (loadAnimator != null) {
                        return new c(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.q.c(), nextAnim);
                        if (loadAnimation2 != null) {
                            return new c(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (i2 == 0) {
            return null;
        }
        int b2 = b(i2, z2);
        if (b2 < 0) {
            return null;
        }
        switch (b2) {
            case 1:
                return a(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return a(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return a(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return a(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return a(0.0f, 1.0f);
            case 6:
                return a(1.0f, 0.0f);
            default:
                if (i3 == 0 && this.q.h()) {
                    i3 = this.q.g();
                }
                if (i3 == 0) {
                }
                return null;
        }
    }

    private static AnimationListener a(Animation animation) {
        String str = "FragmentManager";
        try {
            if (b == null) {
                b = Animation.class.getDeclaredField("mListener");
                b.setAccessible(true);
            }
            return (AnimationListener) b.get(animation);
        } catch (NoSuchFieldException e2) {
            Log.e(str, "No field with the name mListener is found in Animation class", e2);
            return null;
        } catch (IllegalAccessException e3) {
            Log.e(str, "Cannot access Animation's mListener field", e3);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [int] */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r8v6, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0072, code lost:
        if (r0 != 3) goto L_0x04db;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v3
  assigns: []
  uses: []
  mth insns count: 495
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04e0  */
    /* JADX WARNING: Unknown variable types count: 5 */
    public void a(Fragment fragment, int i2, int i3, int i4, boolean z2) {
        int i5;
        ? r8;
        ViewGroup viewGroup;
        String str;
        String str2;
        String str3;
        Fragment fragment2 = fragment;
        ? r82 = 1;
        if (!fragment2.mAdded || fragment2.mDetached) {
            i5 = i2;
            if (i5 > 1) {
                i5 = 1;
            }
        } else {
            i5 = i2;
        }
        if (fragment2.mRemoving) {
            int i6 = fragment2.mState;
            if (i5 > i6) {
                if (i6 != 0 || !fragment.isInBackStack()) {
                    i5 = fragment2.mState;
                } else {
                    i5 = 1;
                }
            }
        }
        ? r11 = (!fragment2.mDeferStart || fragment2.mState >= 3 || i5 <= 2) ? i5 : 2;
        int i7 = fragment2.mState;
        String str4 = "FragmentManager";
        if (i7 <= r11) {
            if (!fragment2.mFromLayout || fragment2.mInLayout) {
                if (!(fragment.getAnimatingAway() == null && fragment.getAnimator() == null)) {
                    fragment2.setAnimatingAway(null);
                    fragment2.setAnimator(null);
                    a(fragment, fragment.getStateAfterAnimating(), 0, 0, true);
                }
                int i8 = fragment2.mState;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                        }
                        if (r11 > 2) {
                            if (a) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("moveto STARTED: ");
                                sb.append(fragment2);
                                Log.v(str4, sb.toString());
                            }
                            fragment.performStart();
                            f(fragment2, false);
                        }
                    }
                    e(fragment);
                    if (r11 > 1) {
                        if (a) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("moveto ACTIVITY_CREATED: ");
                            sb2.append(fragment2);
                            Log.v(str4, sb2.toString());
                        }
                        if (!fragment2.mFromLayout) {
                            int i9 = fragment2.mContainerId;
                            if (i9 == 0) {
                                viewGroup = null;
                            } else if (i9 != -1) {
                                viewGroup = (ViewGroup) this.r.a(i9);
                                if (viewGroup == null && !fragment2.mRestored) {
                                    try {
                                        str = fragment.getResources().getResourceName(fragment2.mContainerId);
                                    } catch (NotFoundException unused) {
                                        str = "unknown";
                                    }
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("No view found for id 0x");
                                    sb3.append(Integer.toHexString(fragment2.mContainerId));
                                    sb3.append(" (");
                                    sb3.append(str);
                                    sb3.append(") for fragment ");
                                    sb3.append(fragment2);
                                    a((RuntimeException) new IllegalArgumentException(sb3.toString()));
                                    throw null;
                                }
                            } else {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Cannot create fragment ");
                                sb4.append(fragment2);
                                sb4.append(" for a container view with no id");
                                a((RuntimeException) new IllegalArgumentException(sb4.toString()));
                                throw null;
                            }
                            fragment2.mContainer = viewGroup;
                            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), viewGroup, fragment2.mSavedFragmentState);
                            View view = fragment2.mView;
                            if (view != null) {
                                fragment2.mInnerView = view;
                                view.setSaveFromParentEnabled(false);
                                if (viewGroup != null) {
                                    viewGroup.addView(fragment2.mView);
                                }
                                if (fragment2.mHidden) {
                                    fragment2.mView.setVisibility(8);
                                }
                                fragment2.onViewCreated(fragment2.mView, fragment2.mSavedFragmentState);
                                a(fragment2, fragment2.mView, fragment2.mSavedFragmentState, false);
                                if (fragment2.mView.getVisibility() != 0 || fragment2.mContainer == null) {
                                    r82 = 0;
                                }
                                fragment2.mIsNewlyAdded = r82;
                            } else {
                                fragment2.mInnerView = null;
                            }
                        }
                        fragment2.performActivityCreated(fragment2.mSavedFragmentState);
                        a(fragment2, fragment2.mSavedFragmentState, false);
                        if (fragment2.mView != null) {
                            fragment2.restoreViewState(fragment2.mSavedFragmentState);
                        }
                        fragment2.mSavedFragmentState = null;
                    }
                    if (r11 > 2) {
                    }
                } else {
                    if (r11 > 0) {
                        if (a) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("moveto CREATED: ");
                            sb5.append(fragment2);
                            Log.v(str4, sb5.toString());
                        }
                        Bundle bundle = fragment2.mSavedFragmentState;
                        if (bundle != null) {
                            bundle.setClassLoader(this.q.c().getClassLoader());
                            fragment2.mSavedViewState = fragment2.mSavedFragmentState.getSparseParcelableArray("android:view_state");
                            Fragment a2 = a(fragment2.mSavedFragmentState, "android:target_state");
                            fragment2.mTargetWho = a2 != null ? a2.mWho : null;
                            if (fragment2.mTargetWho != null) {
                                fragment2.mTargetRequestCode = fragment2.mSavedFragmentState.getInt("android:target_req_state", 0);
                            }
                            Boolean bool = fragment2.mSavedUserVisibleHint;
                            if (bool != null) {
                                fragment2.mUserVisibleHint = bool.booleanValue();
                                fragment2.mSavedUserVisibleHint = null;
                            } else {
                                fragment2.mUserVisibleHint = fragment2.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
                            }
                            if (!fragment2.mUserVisibleHint) {
                                fragment2.mDeferStart = true;
                                if (r11 > 2) {
                                    r11 = 2;
                                }
                            }
                        }
                        C0369k kVar = this.q;
                        fragment2.mHost = kVar;
                        Fragment fragment3 = this.s;
                        fragment2.mParentFragment = fragment3;
                        fragment2.mFragmentManager = fragment3 != null ? fragment3.mChildFragmentManager : kVar.e;
                        Fragment fragment4 = fragment2.mTarget;
                        String str5 = " that does not belong to this FragmentManager!";
                        String str6 = " declared target fragment ";
                        String str7 = "Fragment ";
                        if (fragment4 != null) {
                            Object obj = this.i.get(fragment4.mWho);
                            Fragment fragment5 = fragment2.mTarget;
                            if (obj == fragment5) {
                                if (fragment5.mState < 1) {
                                    str3 = str7;
                                    str2 = str6;
                                    a(fragment5, 1, 0, 0, true);
                                } else {
                                    str3 = str7;
                                    str2 = str6;
                                }
                                fragment2.mTargetWho = fragment2.mTarget.mWho;
                                fragment2.mTarget = null;
                            } else {
                                String str8 = str7;
                                String str9 = str6;
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(str8);
                                sb6.append(fragment2);
                                sb6.append(str9);
                                sb6.append(fragment2.mTarget);
                                sb6.append(str5);
                                throw new IllegalStateException(sb6.toString());
                            }
                        } else {
                            str3 = str7;
                            str2 = str6;
                        }
                        String str10 = fragment2.mTargetWho;
                        if (str10 != null) {
                            Fragment fragment6 = (Fragment) this.i.get(str10);
                            if (fragment6 == null) {
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(str3);
                                sb7.append(fragment2);
                                sb7.append(str2);
                                sb7.append(fragment2.mTargetWho);
                                sb7.append(str5);
                                throw new IllegalStateException(sb7.toString());
                            } else if (fragment6.mState < 1) {
                                a(fragment6, 1, 0, 0, true);
                            }
                        }
                        b(fragment2, this.q.c(), false);
                        fragment2.mCalled = false;
                        fragment2.onAttach(this.q.c());
                        if (fragment2.mCalled) {
                            Fragment fragment7 = fragment2.mParentFragment;
                            if (fragment7 == null) {
                                this.q.a(fragment2);
                            } else {
                                fragment7.onAttachFragment(fragment2);
                            }
                            a(fragment2, this.q.c(), false);
                            if (!fragment2.mIsCreated) {
                                c(fragment2, fragment2.mSavedFragmentState, false);
                                fragment2.performCreate(fragment2.mSavedFragmentState);
                                b(fragment2, fragment2.mSavedFragmentState, false);
                                r11 = r11;
                            } else {
                                fragment2.restoreChildFragmentState(fragment2.mSavedFragmentState);
                                fragment2.mState = 1;
                                r11 = r11;
                            }
                        } else {
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append(str3);
                            sb8.append(fragment2);
                            sb8.append(" did not call through to super.onAttach()");
                            throw new U(sb8.toString());
                        }
                    }
                    e(fragment);
                    if (r11 > 1) {
                    }
                    if (r11 > 2) {
                    }
                }
                if (r11 > 3) {
                    if (a) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("moveto RESUMED: ");
                        sb9.append(fragment2);
                        Log.v(str4, sb9.toString());
                    }
                    fragment.performResume();
                    e(fragment2, false);
                    fragment2.mSavedFragmentState = null;
                    fragment2.mSavedViewState = null;
                }
            } else {
                return;
            }
        } else if (i7 > r11) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 4) {
                            if (r11 < 4) {
                                if (a) {
                                    StringBuilder sb10 = new StringBuilder();
                                    sb10.append("movefrom RESUMED: ");
                                    sb10.append(fragment2);
                                    Log.v(str4, sb10.toString());
                                }
                                fragment.performPause();
                                d(fragment2, false);
                            }
                        }
                    }
                    if (r11 < 3) {
                        if (a) {
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append("movefrom STARTED: ");
                            sb11.append(fragment2);
                            Log.v(str4, sb11.toString());
                        }
                        fragment.performStop();
                        g(fragment2, false);
                    }
                }
                if (r11 < 2) {
                    if (a) {
                        StringBuilder sb12 = new StringBuilder();
                        sb12.append("movefrom ACTIVITY_CREATED: ");
                        sb12.append(fragment2);
                        Log.v(str4, sb12.toString());
                    }
                    if (fragment2.mView != null && this.q.b(fragment2) && fragment2.mSavedViewState == null) {
                        q(fragment);
                    }
                    fragment.performDestroyView();
                    h(fragment2, false);
                    View view2 = fragment2.mView;
                    if (view2 != null) {
                        ViewGroup viewGroup2 = fragment2.mContainer;
                        if (viewGroup2 != null) {
                            viewGroup2.endViewTransition(view2);
                            fragment2.mView.clearAnimation();
                            c a3 = (this.p <= 0 || this.y || fragment2.mView.getVisibility() != 0 || fragment2.mPostponedAlpha < 0.0f) ? null : a(fragment2, i3, false, i4);
                            fragment2.mPostponedAlpha = 0.0f;
                            if (a3 != null) {
                                a(fragment2, a3, r11);
                            }
                            fragment2.mContainer.removeView(fragment2.mView);
                        }
                    }
                    fragment2.mContainer = null;
                    fragment2.mView = null;
                    fragment2.mViewLifecycleOwner = null;
                    fragment2.mViewLifecycleOwnerLiveData.b(null);
                    fragment2.mInnerView = null;
                    fragment2.mInLayout = false;
                }
            }
            if (r11 < 1) {
                if (this.y) {
                    if (fragment.getAnimatingAway() != null) {
                        View animatingAway = fragment.getAnimatingAway();
                        fragment2.setAnimatingAway(null);
                        animatingAway.clearAnimation();
                    } else if (fragment.getAnimator() != null) {
                        Animator animator = fragment.getAnimator();
                        fragment2.setAnimator(null);
                        animator.cancel();
                    }
                }
                if (fragment.getAnimatingAway() == null && fragment.getAnimator() == null) {
                    if (a) {
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append("movefrom CREATED: ");
                        sb13.append(fragment2);
                        Log.v(str4, sb13.toString());
                    }
                    boolean z3 = fragment2.mRemoving && !fragment.isInBackStack();
                    if (z3 || this.G.f(fragment2)) {
                        C0369k kVar2 = this.q;
                        if (kVar2 instanceof w) {
                            r82 = this.G.c();
                        } else if (kVar2.c() instanceof Activity) {
                            r82 = true ^ ((Activity) this.q.c()).isChangingConfigurations();
                        }
                        if (z3 || r82 != 0) {
                            this.G.b(fragment2);
                        }
                        fragment.performDestroy();
                        b(fragment2, false);
                    } else {
                        fragment2.mState = 0;
                    }
                    fragment.performDetach();
                    c(fragment2, false);
                    if (!z2) {
                        if (z3 || this.G.f(fragment2)) {
                            j(fragment);
                        } else {
                            fragment2.mHost = null;
                            fragment2.mParentFragment = null;
                            fragment2.mFragmentManager = null;
                            String str11 = fragment2.mTargetWho;
                            if (str11 != null) {
                                Fragment fragment8 = (Fragment) this.i.get(str11);
                                if (fragment8 != null && fragment8.getRetainInstance()) {
                                    fragment2.mTarget = fragment8;
                                }
                            }
                        }
                    }
                } else {
                    fragment2.setStateAfterAnimating(r11);
                    r8 = r82;
                    if (fragment2.mState != r8) {
                        StringBuilder sb14 = new StringBuilder();
                        sb14.append("moveToState: Fragment state for ");
                        sb14.append(fragment2);
                        sb14.append(" not updated inline; ");
                        sb14.append("expected state ");
                        sb14.append(r8);
                        sb14.append(" found ");
                        sb14.append(fragment2.mState);
                        Log.w(str4, sb14.toString());
                        fragment2.mState = r8;
                    }
                }
            }
        }
        r8 = r11;
        if (fragment2.mState != r8) {
        }
    }

    private void a(Fragment fragment, c cVar, int i2) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i2);
        Animation animation = cVar.a;
        if (animation != null) {
            e eVar = new e(animation, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new C0373o(this, a((Animation) eVar), viewGroup, fragment));
            b(view, cVar);
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = cVar.b;
        fragment.setAnimator(animator);
        animator.addListener(new C0374p(this, viewGroup, view, fragment));
        animator.setTarget(fragment.mView);
        b(fragment.mView, cVar);
        animator.start();
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, boolean z2) {
        if (this.q == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.p) {
            this.p = i2;
            int size = this.h.size();
            for (int i3 = 0; i3 < size; i3++) {
                k((Fragment) this.h.get(i3));
            }
            for (Fragment fragment : this.i.values()) {
                if (fragment != null && ((fragment.mRemoving || fragment.mDetached) && !fragment.mIsNewlyAdded)) {
                    k(fragment);
                }
            }
            z();
            if (this.v) {
                C0369k kVar = this.q;
                if (kVar != null && this.p == 4) {
                    kVar.i();
                    this.v = false;
                }
            }
        }
    }

    public void a(Fragment fragment, boolean z2) {
        if (a) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        i(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (!this.h.contains(fragment)) {
            synchronized (this.h) {
                this.h.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.v = true;
            }
            if (z2) {
                l(fragment);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fragment already added: ");
        sb2.append(fragment);
        throw new IllegalStateException(sb2.toString());
    }

    public Fragment a(int i2) {
        for (int size = this.h.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.h.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.i.values()) {
            if (fragment2 != null && fragment2.mFragmentId == i2) {
                return fragment2;
            }
        }
        return null;
    }

    public Fragment a(String str) {
        if (str != null) {
            for (int size = this.h.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.h.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (Fragment fragment2 : this.i.values()) {
                if (fragment2 != null && str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public void a(h hVar, boolean z2) {
        if (!z2) {
            B();
        }
        synchronized (this) {
            if (!this.y) {
                if (this.q != null) {
                    if (this.e == null) {
                        this.e = new ArrayList<>();
                    }
                    this.e.add(hVar);
                    y();
                    return;
                }
            }
            if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public void a(int i2, C0359a aVar) {
        synchronized (this) {
            if (this.l == null) {
                this.l = new ArrayList<>();
            }
            int size = this.l.size();
            if (i2 < size) {
                if (a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting back stack index ");
                    sb.append(i2);
                    sb.append(" to ");
                    sb.append(aVar);
                    Log.v("FragmentManager", sb.toString());
                }
                this.l.set(i2, aVar);
            } else {
                while (size < i2) {
                    this.l.add(null);
                    if (this.m == null) {
                        this.m = new ArrayList<>();
                    }
                    if (a) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Adding available back stack index ");
                        sb2.append(size);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    this.m.add(Integer.valueOf(size));
                    size++;
                }
                if (a) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Adding back stack index ");
                    sb3.append(i2);
                    sb3.append(" with ");
                    sb3.append(aVar);
                    Log.v("FragmentManager", sb3.toString());
                }
                this.l.add(aVar);
            }
        }
    }

    private void a(ArrayList<C0359a> arrayList, ArrayList<Boolean> arrayList2) {
        ArrayList<j> arrayList3 = this.F;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            j jVar = (j) this.F.get(i2);
            if (arrayList != null && !jVar.a) {
                int indexOf = arrayList.indexOf(jVar.b);
                if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    jVar.c();
                    i2++;
                }
            }
            if (jVar.e() || (arrayList != null && jVar.b.a(arrayList, 0, arrayList.size()))) {
                this.F.remove(i2);
                i2--;
                size--;
                if (arrayList != null && !jVar.a) {
                    int indexOf2 = arrayList.indexOf(jVar.b);
                    if (indexOf2 != -1 && ((Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                        jVar.c();
                    }
                }
                jVar.d();
            }
            i2++;
        }
    }

    private int a(ArrayList<C0359a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, V<Fragment> v2) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            C0359a aVar = (C0359a) arrayList.get(i5);
            boolean booleanValue = ((Boolean) arrayList2.get(i5)).booleanValue();
            if (aVar.h() && !aVar.a(arrayList, i5 + 1, i3)) {
                if (this.F == null) {
                    this.F = new ArrayList<>();
                }
                j jVar = new j(aVar, booleanValue);
                this.F.add(jVar);
                aVar.a((c) jVar);
                if (booleanValue) {
                    aVar.f();
                } else {
                    aVar.b(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                a(v2);
            }
        }
        return i4;
    }

    /* access modifiers changed from: 0000 */
    public void a(C0359a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.b(z4);
        } else {
            aVar.f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            F.a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z4) {
            a(this.p, true);
        }
        for (Fragment fragment : this.i.values()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar.d(fragment.mContainerId)) {
                float f2 = fragment.mPostponedAlpha;
                if (f2 > 0.0f) {
                    fragment.mView.setAlpha(f2);
                }
                if (z4) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    private static void a(ArrayList<C0359a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            C0359a aVar = (C0359a) arrayList.get(i2);
            boolean z2 = true;
            if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                aVar.c(-1);
                if (i2 != i3 - 1) {
                    z2 = false;
                }
                aVar.b(z2);
            } else {
                aVar.c(1);
                aVar.f();
            }
            i2++;
        }
    }

    private void a(V<Fragment> v2) {
        int i2 = this.p;
        if (i2 >= 1) {
            int min = Math.min(i2, 3);
            int size = this.h.size();
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment = (Fragment) this.h.get(i3);
                if (fragment.mState < min) {
                    a(fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        v2.add(fragment);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(C0359a aVar) {
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        this.j.add(aVar);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(ArrayList<C0359a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<C0359a> arrayList3 = this.j;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.j.remove(size));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            if (str != null || i2 >= 0) {
                i4 = this.j.size() - 1;
                while (i4 >= 0) {
                    C0359a aVar = (C0359a) this.j.get(i4);
                    if ((str != null && str.equals(aVar.g())) || (i2 >= 0 && i2 == aVar.m)) {
                        break;
                    }
                    i4--;
                }
                if (i4 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        i4--;
                        if (i4 < 0) {
                            break;
                        }
                        C0359a aVar2 = (C0359a) this.j.get(i4);
                        if ((str == null || !str.equals(aVar2.g())) && (i2 < 0 || i2 != aVar2.m)) {
                            break;
                        }
                    }
                }
            } else {
                i4 = -1;
            }
            if (i4 == this.j.size() - 1) {
                return false;
            }
            for (int size2 = this.j.size() - 1; size2 > i4; size2--) {
                arrayList.add(this.j.remove(size2));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"RestrictedApi"})
    public void a(Parcelable parcelable) {
        FragmentState fragmentState;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.a != null) {
                for (Fragment fragment : this.G.b()) {
                    if (a) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreAllState: re-attaching retained ");
                        sb.append(fragment);
                        Log.v("FragmentManager", sb.toString());
                    }
                    Iterator it = fragmentManagerState.a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            fragmentState = null;
                            break;
                        }
                        fragmentState = (FragmentState) it.next();
                        if (fragmentState.b.equals(fragment.mWho)) {
                            break;
                        }
                    }
                    if (fragmentState != null) {
                        fragmentState.l = fragment;
                        fragment.mSavedViewState = null;
                        fragment.mBackStackNesting = 0;
                        fragment.mInLayout = false;
                        fragment.mAdded = false;
                        fragment.mTargetWho = null;
                        Bundle bundle = fragmentState.k;
                        if (bundle != null) {
                            bundle.setClassLoader(this.q.c().getClassLoader());
                            fragment.mSavedViewState = fragmentState.k.getSparseParcelableArray("android:view_state");
                            fragment.mSavedFragmentState = fragmentState.k;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Could not find active fragment with unique id ");
                        sb2.append(fragment.mWho);
                        a((RuntimeException) new IllegalStateException(sb2.toString()));
                        throw null;
                    }
                }
                this.i.clear();
                Iterator it2 = fragmentManagerState.a.iterator();
                while (it2.hasNext()) {
                    FragmentState fragmentState2 = (FragmentState) it2.next();
                    if (fragmentState2 != null) {
                        Fragment a2 = fragmentState2.a(this.q.c().getClassLoader(), d());
                        a2.mFragmentManager = this;
                        if (a) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("restoreAllState: active (");
                            sb3.append(a2.mWho);
                            sb3.append("): ");
                            sb3.append(a2);
                            Log.v("FragmentManager", sb3.toString());
                        }
                        this.i.put(a2.mWho, a2);
                        fragmentState2.l = null;
                    }
                }
                this.h.clear();
                ArrayList<String> arrayList = fragmentManagerState.b;
                if (arrayList != null) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String str = (String) it3.next();
                        Fragment fragment2 = (Fragment) this.i.get(str);
                        if (fragment2 != null) {
                            fragment2.mAdded = true;
                            if (a) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("restoreAllState: added (");
                                sb4.append(str);
                                sb4.append("): ");
                                sb4.append(fragment2);
                                Log.v("FragmentManager", sb4.toString());
                            }
                            if (!this.h.contains(fragment2)) {
                                synchronized (this.h) {
                                    this.h.add(fragment2);
                                }
                            } else {
                                throw new IllegalStateException("Already added!");
                            }
                        } else {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("No instantiated fragment for (");
                            sb5.append(str);
                            sb5.append(")");
                            a((RuntimeException) new IllegalStateException(sb5.toString()));
                            throw null;
                        }
                    }
                }
                BackStackState[] backStackStateArr = fragmentManagerState.c;
                if (backStackStateArr != null) {
                    this.j = new ArrayList<>(backStackStateArr.length);
                    int i2 = 0;
                    while (true) {
                        BackStackState[] backStackStateArr2 = fragmentManagerState.c;
                        if (i2 >= backStackStateArr2.length) {
                            break;
                        }
                        C0359a a3 = backStackStateArr2[i2].a(this);
                        if (a) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("restoreAllState: back stack #");
                            sb6.append(i2);
                            sb6.append(" (index ");
                            sb6.append(a3.m);
                            sb6.append("): ");
                            sb6.append(a3);
                            Log.v("FragmentManager", sb6.toString());
                            PrintWriter printWriter = new PrintWriter(new C0239Ob("FragmentManager"));
                            a3.a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.j.add(a3);
                        int i3 = a3.m;
                        if (i3 >= 0) {
                            a(i3, a3);
                        }
                        i2++;
                    }
                } else {
                    this.j = null;
                }
                String str2 = fragmentManagerState.d;
                if (str2 != null) {
                    this.t = (Fragment) this.i.get(str2);
                }
                this.g = fragmentManagerState.e;
            }
        }
    }

    public void a(C0369k kVar, C0366h hVar, Fragment fragment) {
        if (this.q == null) {
            this.q = kVar;
            this.r = hVar;
            this.s = fragment;
            if (fragment != null) {
                this.G = fragment.mFragmentManager.f(fragment);
            } else if (kVar instanceof w) {
                this.G = w.a(((w) kVar).getViewModelStore());
            } else {
                this.G = new w(false);
            }
        } else {
            throw new IllegalStateException("Already attached");
        }
    }

    public void a(Configuration configuration) {
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            Fragment fragment = (Fragment) this.h.get(i2);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.p < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            Fragment fragment = (Fragment) this.h.get(i2);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z2 = true;
            }
        }
        if (this.k != null) {
            for (int i3 = 0; i3 < this.k.size(); i3++) {
                Fragment fragment2 = (Fragment) this.k.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.k = arrayList;
        return z2;
    }

    public boolean a(MenuItem menuItem) {
        if (this.p < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            Fragment fragment = (Fragment) this.h.get(i2);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void a(Menu menu) {
        if (this.p >= 1) {
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                Fragment fragment = (Fragment) this.h.get(i2);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.s;
        if (fragment2 != null) {
            C0370l fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0377t) {
                ((C0377t) fragmentManager).a(fragment, context, true);
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!z2 || fVar.b) {
                fVar.a.a((C0370l) this, fragment, context);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.s;
        if (fragment2 != null) {
            C0370l fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0377t) {
                ((C0377t) fragmentManager).a(fragment, bundle, true);
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!z2 || fVar.b) {
                fVar.a.a((C0370l) this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Fragment fragment, View view, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.s;
        if (fragment2 != null) {
            C0370l fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C0377t) {
                ((C0377t) fragmentManager).a(fragment, view, bundle, true);
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!z2 || fVar.b) {
                fVar.a.a(this, fragment, view, bundle);
            }
        }
    }
}
