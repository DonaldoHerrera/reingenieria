package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.q;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class Fragment implements ComponentCallbacks, OnCreateContextMenuListener, h, w, Sd {
    static final int ACTIVITY_CREATED = 2;
    static final int CREATED = 1;
    static final int INITIALIZING = 0;
    static final int RESUMED = 4;
    static final int STARTED = 3;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    boolean mAdded;
    a mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    C0377t mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    C0377t mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    C0369k mHost;
    boolean mInLayout;
    View mInnerView;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    LayoutInflater mLayoutInflater;
    j mLifecycleRegistry;
    boolean mMenuVisible = true;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    Rd mSavedStateRegistry = new Rd();
    Boolean mSavedUserVisibleHint;
    SparseArray<Parcelable> mSavedViewState;
    int mState = 0;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho = null;
    boolean mUserVisibleHint = true;
    View mView;
    P mViewLifecycleOwner;
    o<h> mViewLifecycleOwnerLiveData = new o<>();
    String mWho = UUID.randomUUID().toString();

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C0364f();
        final Bundle a;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.a = parcel.readBundle();
            if (classLoader != null) {
                Bundle bundle = this.a;
                if (bundle != null) {
                    bundle.setClassLoader(classLoader);
                }
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.a);
        }
    }

    static class a {
        View a;
        Animator b;
        int c;
        int d;
        int e;
        int f;
        Object g = null;
        Object h;
        Object i;
        Object j;
        Object k;
        Object l;
        Boolean m;
        Boolean n;
        q o;
        q p;
        boolean q;
        c r;
        boolean s;

        a() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.h = obj;
            this.i = null;
            this.j = obj;
            this.k = null;
            this.l = obj;
            this.o = null;
            this.p = null;
        }
    }

    public static class b extends RuntimeException {
        public b(String str, Exception exc) {
            super(str, exc);
        }
    }

    interface c {
        void a();

        void b();
    }

    public Fragment() {
        initLifecycle();
    }

    private a ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new a();
        }
        return this.mAnimationInfo;
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new j(this);
        if (VERSION.SDK_INT >= 19) {
            this.mLifecycleRegistry.a((g) new e() {
                public void a(h hVar, androidx.lifecycle.f.a aVar) {
                    if (aVar == androidx.lifecycle.f.a.ON_STOP) {
                        View view = Fragment.this.mView;
                        if (view != null) {
                            view.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    /* access modifiers changed from: 0000 */
    public void callStartTransitionListener() {
        a aVar = this.mAnimationInfo;
        c cVar = null;
        if (aVar != null) {
            aVar.q = false;
            c cVar2 = aVar.r;
            aVar.r = null;
            cVar = cVar2;
        }
        if (cVar != null) {
            cVar.b();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (getContext() != null) {
            C1260ed.a(this).a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.mChildFragmentManager != null) {
            printWriter.print(str);
            StringBuilder sb = new StringBuilder();
            sb.append("Child ");
            sb.append(this.mChildFragmentManager);
            sb.append(":");
            printWriter.println(sb.toString());
            C0377t tVar = this.mChildFragmentManager;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            tVar.a(sb2.toString(), fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null) {
            return tVar.b(str);
        }
        return null;
    }

    public final FragmentActivity getActivity() {
        C0369k kVar = this.mHost;
        if (kVar == null) {
            return null;
        }
        return (FragmentActivity) kVar.b();
    }

    public boolean getAllowEnterTransitionOverlap() {
        a aVar = this.mAnimationInfo;
        if (aVar != null) {
            Boolean bool = aVar.n;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        a aVar = this.mAnimationInfo;
        if (aVar != null) {
            Boolean bool = aVar.m;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public View getAnimatingAway() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.a;
    }

    /* access modifiers changed from: 0000 */
    public Animator getAnimator() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.b;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final Qd<Bundle> getBundleSavedStateRegistry() {
        return this.mSavedStateRegistry;
    }

    public final C0370l getChildFragmentManager() {
        if (this.mChildFragmentManager == null) {
            instantiateChildFragmentManager();
            int i = this.mState;
            if (i >= 4) {
                this.mChildFragmentManager.o();
            } else if (i >= 3) {
                this.mChildFragmentManager.p();
            } else if (i >= 2) {
                this.mChildFragmentManager.i();
            } else if (i >= 1) {
                this.mChildFragmentManager.j();
            }
        }
        return this.mChildFragmentManager;
    }

    public Context getContext() {
        C0369k kVar = this.mHost;
        if (kVar == null) {
            return null;
        }
        return kVar.c();
    }

    public Object getEnterTransition() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.g;
    }

    /* access modifiers changed from: 0000 */
    public q getEnterTransitionCallback() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.o;
    }

    public Object getExitTransition() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.i;
    }

    /* access modifiers changed from: 0000 */
    public q getExitTransitionCallback() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.p;
    }

    public final C0370l getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        C0369k kVar = this.mHost;
        if (kVar == null) {
            return null;
        }
        return kVar.e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public f getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public C1260ed getLoaderManager() {
        return C1260ed.a(this);
    }

    /* access modifiers changed from: 0000 */
    public int getNextAnim() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.d;
    }

    /* access modifiers changed from: 0000 */
    public int getNextTransition() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.e;
    }

    /* access modifiers changed from: 0000 */
    public int getNextTransitionStyle() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public Object getReenterTransition() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.j;
        if (obj == USE_DEFAULT_TRANSITION) {
            obj = getExitTransition();
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.h;
        if (obj == USE_DEFAULT_TRANSITION) {
            obj = getEnterTransition();
        }
        return obj;
    }

    public Object getSharedElementEnterTransition() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.k;
    }

    public Object getSharedElementReturnTransition() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.l;
        if (obj == USE_DEFAULT_TRANSITION) {
            obj = getSharedElementEnterTransition();
        }
        return obj;
    }

    /* access modifiers changed from: 0000 */
    public int getStateAfterAnimating() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.c;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    public final Fragment getTargetFragment() {
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        C0377t tVar = this.mFragmentManager;
        if (tVar != null) {
            String str = this.mTargetWho;
            if (str != null) {
                return (Fragment) tVar.i.get(str);
            }
        }
        return null;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public h getViewLifecycleOwner() {
        P p = this.mViewLifecycleOwner;
        if (p != null) {
            return p;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<h> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public v getViewModelStore() {
        C0377t tVar = this.mFragmentManager;
        if (tVar != null) {
            return tVar.g(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public void initState() {
        initLifecycle();
        this.mSavedStateRegistry = new Rd();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = null;
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    /* access modifiers changed from: 0000 */
    public void instantiateChildFragmentManager() {
        if (this.mHost != null) {
            this.mChildFragmentManager = new C0377t();
            this.mChildFragmentManager.a(this.mHost, (C0366h) new C0363e(this), this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    /* access modifiers changed from: 0000 */
    public boolean isHideReplaced() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return false;
        }
        return aVar.s;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    /* access modifiers changed from: 0000 */
    public boolean isPostponed() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return false;
        }
        return aVar.q;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 4;
    }

    public final boolean isStateSaved() {
        C0377t tVar = this.mFragmentManager;
        if (tVar == null) {
            return false;
        }
        return tVar.f();
    }

    public final boolean isVisible() {
        if (isAdded() && !isHidden()) {
            View view = this.mView;
            if (!(view == null || view.getWindowToken() == null || this.mView.getVisibility() != 0)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void noteStateNotSaved() {
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null) {
            tVar.v();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        C0369k kVar = this.mHost;
        Activity b2 = kVar == null ? null : kVar.b();
        if (b2 != null) {
            this.mCalled = false;
            onAttach(b2);
        }
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        this.mSavedStateRegistry.a(bundle);
        restoreChildFragmentState(bundle);
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null && !tVar.c(1)) {
            this.mChildFragmentManager.j();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        C0369k kVar = this.mHost;
        Activity b2 = kVar == null ? null : kVar.b();
        if (b2 != null) {
            this.mCalled = false;
            onInflate(b2, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    /* access modifiers changed from: 0000 */
    public C0370l peekChildFragmentManager() {
        return this.mChildFragmentManager;
    }

    /* access modifiers changed from: 0000 */
    public void performActivityCreated(Bundle bundle) {
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null) {
            tVar.v();
        }
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            C0377t tVar2 = this.mChildFragmentManager;
            if (tVar2 != null) {
                tVar2.i();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onActivityCreated()");
        throw new U(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null) {
            tVar.a(configuration);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            C0377t tVar = this.mChildFragmentManager;
            if (tVar != null && tVar.a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void performCreate(Bundle bundle) {
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null) {
            tVar.v();
        }
        this.mState = 1;
        this.mCalled = false;
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.b(androidx.lifecycle.f.a.ON_CREATE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new U(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        C0377t tVar = this.mChildFragmentManager;
        return tVar != null ? z | tVar.a(menu, menuInflater) : z;
    }

    /* access modifiers changed from: 0000 */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null) {
            tVar.v();
        }
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new P();
        this.mView = onCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a();
            this.mViewLifecycleOwnerLiveData.b(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.b()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: 0000 */
    public void performDestroy() {
        this.mLifecycleRegistry.b(androidx.lifecycle.f.a.ON_DESTROY);
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null) {
            tVar.k();
        }
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            this.mChildFragmentManager = null;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroy()");
        throw new U(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performDestroyView() {
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.f.a.ON_DESTROY);
        }
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null) {
            tVar.l();
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            C1260ed.a(this).a();
            this.mPerformedCreateView = false;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new U(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performDetach() {
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            C0377t tVar = this.mChildFragmentManager;
            if (tVar != null) {
                tVar.k();
                this.mChildFragmentManager = null;
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDetach()");
        throw new U(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        this.mLayoutInflater = onGetLayoutInflater(bundle);
        return this.mLayoutInflater;
    }

    /* access modifiers changed from: 0000 */
    public void performLowMemory() {
        onLowMemory();
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null) {
            tVar.m();
        }
    }

    /* access modifiers changed from: 0000 */
    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null) {
            tVar.b(z);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            C0377t tVar = this.mChildFragmentManager;
            if (tVar != null && tVar.b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            C0377t tVar = this.mChildFragmentManager;
            if (tVar != null) {
                tVar.a(menu);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void performPause() {
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.f.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.b(androidx.lifecycle.f.a.ON_PAUSE);
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null) {
            tVar.n();
        }
        this.mState = 3;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onPause()");
            throw new U(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null) {
            tVar.c(z);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        C0377t tVar = this.mChildFragmentManager;
        return tVar != null ? z | tVar.b(menu) : z;
    }

    /* access modifiers changed from: 0000 */
    public void performResume() {
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null) {
            tVar.v();
            this.mChildFragmentManager.s();
        }
        this.mState = 4;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            C0377t tVar2 = this.mChildFragmentManager;
            if (tVar2 != null) {
                tVar2.o();
                this.mChildFragmentManager.s();
            }
            this.mLifecycleRegistry.b(androidx.lifecycle.f.a.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.f.a.ON_RESUME);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new U(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistry.b(bundle);
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null) {
            Parcelable x = tVar.x();
            if (x != null) {
                bundle.putParcelable("android:support:fragments", x);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void performStart() {
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null) {
            tVar.v();
            this.mChildFragmentManager.s();
        }
        this.mState = 3;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            C0377t tVar2 = this.mChildFragmentManager;
            if (tVar2 != null) {
                tVar2.p();
            }
            this.mLifecycleRegistry.b(androidx.lifecycle.f.a.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.f.a.ON_START);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new U(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performStop() {
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.f.a.ON_STOP);
        }
        this.mLifecycleRegistry.b(androidx.lifecycle.f.a.ON_STOP);
        C0377t tVar = this.mChildFragmentManager;
        if (tVar != null) {
            tVar.q();
        }
        this.mState = 2;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onStop()");
            throw new U(sb.toString());
        }
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().q = true;
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public final void requestPermissions(String[] strArr, int i) {
        C0369k kVar = this.mHost;
        if (kVar != null) {
            kVar.a(this, strArr, i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    public final C0370l requireFragmentManager() {
        C0370l fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a host.");
        throw new IllegalStateException(sb.toString());
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        String str = "Fragment ";
        if (getContext() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this);
            sb.append(" is not attached to");
            sb.append(" any Fragment or host");
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this);
        sb2.append(" is not a child Fragment, it");
        sb2.append(" is directly attached to ");
        sb2.append(getContext());
        throw new IllegalStateException(sb2.toString());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from");
        sb.append(" onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void restoreChildFragmentState(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.mChildFragmentManager == null) {
                    instantiateChildFragmentManager();
                }
                this.mChildFragmentManager.a(parcelable);
                this.mChildFragmentManager.j();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mInnerView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onViewStateRestored()");
            throw new U(sb.toString());
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.f.a.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().n = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().m = Boolean.valueOf(z);
    }

    /* access modifiers changed from: 0000 */
    public void setAnimatingAway(View view) {
        ensureAnimationInfo().a = view;
    }

    /* access modifiers changed from: 0000 */
    public void setAnimator(Animator animator) {
        ensureAnimationInfo().b = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(q qVar) {
        ensureAnimationInfo().o = qVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().g = obj;
    }

    public void setExitSharedElementCallback(q qVar) {
        ensureAnimationInfo().p = qVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().i = obj;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.i();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().s = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        if (r2 != null) goto L_0x000c;
     */
    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (savedState != null) {
                bundle = savedState.a;
            }
            bundle = null;
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.i();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setNextAnim(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo().d = i;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setNextTransition(int i, int i2) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0) {
            ensureAnimationInfo();
            a aVar = this.mAnimationInfo;
            aVar.e = i;
            aVar.f = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setOnStartEnterTransitionListener(c cVar) {
        ensureAnimationInfo();
        c cVar2 = this.mAnimationInfo.r;
        if (cVar != cVar2) {
            if (cVar == null || cVar2 == null) {
                a aVar = this.mAnimationInfo;
                if (aVar.q) {
                    aVar.r = cVar;
                }
                if (cVar != null) {
                    cVar.a();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().j = obj;
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        C0377t tVar = this.mFragmentManager;
        if (tVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            tVar.a(this);
        } else {
            tVar.o(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().h = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().k = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().l = obj;
    }

    /* access modifiers changed from: 0000 */
    public void setStateAfterAnimating(int i) {
        ensureAnimationInfo().c = i;
    }

    public void setTargetFragment(Fragment fragment, int i) {
        C0370l fragmentManager = getFragmentManager();
        C0370l fragmentManager2 = fragment != null ? fragment.getFragmentManager() : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (fragment2 != this) {
                    fragment2 = fragment2.getTargetFragment();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting ");
                    sb.append(fragment);
                    sb.append(" as the target of ");
                    sb.append(this);
                    sb.append(" would create a target cycle");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (fragment == null || fragment.mFragmentManager == null) {
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
            }
            this.mTargetRequestCode = i;
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fragment ");
        sb2.append(fragment);
        sb2.append(" must share the same FragmentManager to be set as a target fragment");
        throw new IllegalArgumentException(sb2.toString());
    }

    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 3 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.m(this);
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 3 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        C0369k kVar = this.mHost;
        if (kVar != null) {
            return kVar.a(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        C0369k kVar = this.mHost;
        if (kVar != null) {
            kVar.a(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void startPostponedEnterTransition() {
        C0377t tVar = this.mFragmentManager;
        if (tVar == null || tVar.q == null) {
            ensureAnimationInfo().q = false;
        } else if (Looper.myLooper() != this.mFragmentManager.q.d().getLooper()) {
            this.mFragmentManager.q.d().postAtFrontOfQueue(new C0362d(this));
        } else {
            callStartTransitionListener();
        }
    }

    @SuppressLint({"UnknownNullness", "RestrictedApi"})
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0235Nb.a(this, sb);
        sb.append(" (");
        sb.append(this.mWho);
        sb.append(")");
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        String str2 = " empty constructor that is public";
        String str3 = ": make sure class name exists, is public, and has an";
        String str4 = "Unable to instantiate fragment ";
        try {
            Fragment fragment = (Fragment) C0368j.b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(str);
            sb.append(str3);
            sb.append(str2);
            throw new b(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(str);
            sb2.append(str3);
            sb2.append(str2);
            throw new b(sb2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            sb3.append(str);
            sb3.append(": could not find Fragment constructor");
            throw new b(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str4);
            sb4.append(str);
            sb4.append(": calling Fragment constructor caused an exception");
            throw new b(sb4.toString(), e4);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        C0369k kVar = this.mHost;
        if (kVar != null) {
            kVar.a(this, intent, -1, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        C0369k kVar = this.mHost;
        if (kVar != null) {
            kVar.a(this, intent, i, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        C0369k kVar = this.mHost;
        if (kVar != null) {
            LayoutInflater f = kVar.f();
            getChildFragmentManager();
            C0377t tVar = this.mChildFragmentManager;
            tVar.t();
            C0302ac.a(f, tVar);
            return f;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }
}
