package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.Fragment;
import androidx.preference.internal.AbstractMultiSelectListPreference;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;

/* compiled from: PreferenceFragmentCompat */
public abstract class s extends Fragment implements androidx.preference.z.c, androidx.preference.z.a, androidx.preference.z.b, androidx.preference.DialogPreference.a {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private final a mDividerDecoration = new a();
    private Handler mHandler = new p(this);
    private boolean mHavePrefs;
    private boolean mInitDone;
    private int mLayoutResId = G.preference_list_fragment;
    RecyclerView mList;
    private z mPreferenceManager;
    private final Runnable mRequestFocus = new q(this);
    private Runnable mSelectPreferenceRunnable;
    private Context mStyledContext;

    /* compiled from: PreferenceFragmentCompat */
    private class a extends h {
        private Drawable a;
        private int b;
        private boolean c = true;

        a() {
        }

        public void a(Rect rect, View view, RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.s sVar) {
            if (a(view, recyclerView)) {
                rect.bottom = this.b;
            }
        }

        public void b(Canvas canvas, RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.s sVar) {
            if (this.a != null) {
                int childCount = recyclerView.getChildCount();
                int width = recyclerView.getWidth();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    if (a(childAt, recyclerView)) {
                        int y = ((int) childAt.getY()) + childAt.getHeight();
                        this.a.setBounds(0, y, width, this.b + y);
                        this.a.draw(canvas);
                    }
                }
            }
        }

        private boolean a(View view, RecyclerView recyclerView) {
            ViewHolder h = recyclerView.h(view);
            if (!((h instanceof C) && ((C) h).c())) {
                return false;
            }
            boolean z = this.c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild < recyclerView.getChildCount() - 1) {
                ViewHolder h2 = recyclerView.h(recyclerView.getChildAt(indexOfChild + 1));
                z = (h2 instanceof C) && ((C) h2).b();
            }
            return z;
        }

        public void b(boolean z) {
            this.c = z;
        }

        public void a(Drawable drawable) {
            if (drawable != null) {
                this.b = drawable.getIntrinsicHeight();
            } else {
                this.b = 0;
            }
            this.a = drawable;
            s.this.mList.m();
        }

        public void a(int i) {
            this.b = i;
            s.this.mList.m();
        }
    }

    /* compiled from: PreferenceFragmentCompat */
    public interface b {
        boolean a(s sVar, Preference preference);
    }

    /* compiled from: PreferenceFragmentCompat */
    public interface c {
        boolean a(s sVar, Preference preference);
    }

    /* compiled from: PreferenceFragmentCompat */
    public interface d {
        boolean a(s sVar, PreferenceScreen preferenceScreen);
    }

    /* compiled from: PreferenceFragmentCompat */
    private static class e extends androidx.recyclerview.widget.RecyclerView.c {
        private final androidx.recyclerview.widget.RecyclerView.a a;
        private final RecyclerView b;
        private final Preference c;
        private final String d;

        public e(androidx.recyclerview.widget.RecyclerView.a aVar, RecyclerView recyclerView, Preference preference, String str) {
            this.a = aVar;
            this.b = recyclerView;
            this.c = preference;
            this.d = str;
        }

        private void b() {
            int i;
            this.a.b((androidx.recyclerview.widget.RecyclerView.c) this);
            Preference preference = this.c;
            if (preference != null) {
                i = ((androidx.preference.PreferenceGroup.b) this.a).a(preference);
            } else {
                i = ((androidx.preference.PreferenceGroup.b) this.a).a(this.d);
            }
            if (i != -1) {
                this.b.i(i);
            }
        }

        public void a() {
            b();
        }

        public void c(int i, int i2) {
            b();
        }

        public void a(int i, int i2) {
            b();
        }

        public void a(int i, int i2, Object obj) {
            b();
        }

        public void a(int i, int i2, int i3) {
            b();
        }

        public void b(int i, int i2) {
            b();
        }
    }

    private void postBindPreferences() {
        if (!this.mHandler.hasMessages(1)) {
            this.mHandler.obtainMessage(1).sendToTarget();
        }
    }

    private void requirePreferenceManager() {
        if (this.mPreferenceManager == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void scrollToPreferenceInternal(Preference preference, String str) {
        r rVar = new r(this, preference, str);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = rVar;
        } else {
            rVar.run();
        }
    }

    private void unbindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.V();
        }
        onUnbindPreferences();
    }

    public void addPreferencesFromResource(int i) {
        requirePreferenceManager();
        setPreferenceScreen(this.mPreferenceManager.a(this.mStyledContext, i, getPreferenceScreen()));
    }

    /* access modifiers changed from: 0000 */
    public void bindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.T();
        }
        onBindPreferences();
    }

    public Preference findPreference(CharSequence charSequence) {
        z zVar = this.mPreferenceManager;
        if (zVar == null) {
            return null;
        }
        return zVar.a(charSequence);
    }

    public Fragment getCallbackFragment() {
        return null;
    }

    public final RecyclerView getListView() {
        return this.mList;
    }

    public z getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.g();
    }

    /* access modifiers changed from: protected */
    public void onBindPreferences() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(D.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = I.PreferenceThemeOverlay;
        }
        this.mStyledContext = new ContextThemeWrapper(getActivity(), i);
        this.mPreferenceManager = new z(this.mStyledContext);
        this.mPreferenceManager.a((androidx.preference.z.b) this);
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString(ARG_PREFERENCE_ROOT) : null);
    }

    /* access modifiers changed from: protected */
    public androidx.recyclerview.widget.RecyclerView.a onCreateAdapter(PreferenceScreen preferenceScreen) {
        return new x(preferenceScreen);
    }

    public i onCreateLayoutManager() {
        return new LinearLayoutManager(getActivity());
    }

    public abstract void onCreatePreferences(Bundle bundle, String str);

    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.mStyledContext.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(F.recycler_view);
            if (recyclerView != null) {
                return recyclerView;
            }
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(G.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new B(recyclerView2));
        return recyclerView2;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = this.mStyledContext.obtainStyledAttributes(null, J.PreferenceFragmentCompat, D.preferenceFragmentCompatStyle, 0);
        this.mLayoutResId = obtainStyledAttributes.getResourceId(J.PreferenceFragmentCompat_android_layout, this.mLayoutResId);
        Drawable drawable = obtainStyledAttributes.getDrawable(J.PreferenceFragmentCompat_android_divider);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(J.PreferenceFragmentCompat_android_dividerHeight, -1);
        boolean z = obtainStyledAttributes.getBoolean(J.PreferenceFragmentCompat_allowDividerAfterLastItem, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.mStyledContext);
        View inflate = cloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView onCreateRecyclerView = onCreateRecyclerView(cloneInContext, viewGroup2, bundle);
            if (onCreateRecyclerView != null) {
                this.mList = onCreateRecyclerView;
                onCreateRecyclerView.a((h) this.mDividerDecoration);
                setDivider(drawable);
                if (dimensionPixelSize != -1) {
                    setDividerHeight(dimensionPixelSize);
                }
                this.mDividerDecoration.b(z);
                if (this.mList.getParent() == null) {
                    viewGroup2.addView(this.mList);
                }
                this.mHandler.post(this.mRequestFocus);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mHandler.removeMessages(1);
        if (this.mHavePrefs) {
            unbindPreferences();
        }
        this.mList = null;
        super.onDestroyView();
    }

    public void onDisplayPreferenceDialog(Preference preference) {
        C0361c cVar;
        boolean a2 = getCallbackFragment() instanceof b ? ((b) getCallbackFragment()).a(this, preference) : false;
        if (!a2 && (getActivity() instanceof b)) {
            a2 = ((b) getActivity()).a(this, preference);
        }
        if (!a2) {
            C0370l fragmentManager = getFragmentManager();
            String str = DIALOG_FRAGMENT_TAG;
            if (fragmentManager.a(str) == null) {
                if (preference instanceof EditTextPreference) {
                    cVar = C0397e.c(preference.g());
                } else if (preference instanceof ListPreference) {
                    cVar = C0400h.c(preference.g());
                } else if (preference instanceof AbstractMultiSelectListPreference) {
                    cVar = C0403k.c(preference.g());
                } else {
                    throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
                }
                cVar.setTargetFragment(this, 0);
                cVar.show(getFragmentManager(), str);
            }
        }
    }

    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        if (!(getCallbackFragment() instanceof d ? ((d) getCallbackFragment()).a(this, preferenceScreen) : false) && (getActivity() instanceof d)) {
            ((d) getActivity()).a(this, preferenceScreen);
        }
    }

    public boolean onPreferenceTreeClick(Preference preference) {
        boolean z = false;
        if (preference.e() == null) {
            return false;
        }
        if (getCallbackFragment() instanceof c) {
            z = ((c) getCallbackFragment()).a(this, preference);
        }
        return (z || !(getActivity() instanceof c)) ? z : ((c) getActivity()).a(this, preference);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.d(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    public void onStart() {
        super.onStart();
        this.mPreferenceManager.a((androidx.preference.z.c) this);
        this.mPreferenceManager.a((androidx.preference.z.a) this);
    }

    public void onStop() {
        super.onStop();
        this.mPreferenceManager.a((androidx.preference.z.c) null);
        this.mPreferenceManager.a((androidx.preference.z.a) null);
    }

    /* access modifiers changed from: protected */
    public void onUnbindPreferences() {
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle(PREFERENCES_TAG);
            if (bundle2 != null) {
                PreferenceScreen preferenceScreen = getPreferenceScreen();
                if (preferenceScreen != null) {
                    preferenceScreen.c(bundle2);
                }
            }
        }
        if (this.mHavePrefs) {
            bindPreferences();
            Runnable runnable = this.mSelectPreferenceRunnable;
            if (runnable != null) {
                runnable.run();
                this.mSelectPreferenceRunnable = null;
            }
        }
        this.mInitDone = true;
    }

    public void scrollToPreference(String str) {
        scrollToPreferenceInternal(null, str);
    }

    public void setDivider(Drawable drawable) {
        this.mDividerDecoration.a(drawable);
    }

    public void setDividerHeight(int i) {
        this.mDividerDecoration.a(i);
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        if (this.mPreferenceManager.a(preferenceScreen) && preferenceScreen != null) {
            onUnbindPreferences();
            this.mHavePrefs = true;
            if (this.mInitDone) {
                postBindPreferences();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [androidx.preference.PreferenceGroup, androidx.preference.PreferenceScreen] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v4, types: [androidx.preference.Preference] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v1, types: [androidx.preference.PreferenceGroup, androidx.preference.PreferenceScreen]
  assigns: [androidx.preference.PreferenceScreen, androidx.preference.Preference]
  uses: [androidx.preference.PreferenceGroup, ?[OBJECT, ARRAY]]
  mth insns count: 20
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
    /* JADX WARNING: Unknown variable types count: 1 */
    public void setPreferencesFromResource(int i, String str) {
        requirePreferenceManager();
        ? a2 = this.mPreferenceManager.a(this.mStyledContext, i, null);
        if (str != null) {
            a2 = a2.c((CharSequence) str);
            if (!(a2 instanceof PreferenceScreen)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Preference object with key ");
                sb.append(str);
                sb.append(" is not a PreferenceScreen");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        setPreferenceScreen((PreferenceScreen) a2);
    }

    public void scrollToPreference(Preference preference) {
        scrollToPreferenceInternal(preference, null);
    }
}
