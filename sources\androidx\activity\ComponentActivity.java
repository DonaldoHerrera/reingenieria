package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.f.b;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import androidx.lifecycle.r;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements h, w, Sd {
    private final j mLifecycleRegistry = new j(this);
    final CopyOnWriteArrayList<LifecycleAwareOnBackPressedCallback> mOnBackPressedCallbacks = new CopyOnWriteArrayList<>();
    private final Rd mSavedStateRegistry = new Rd();
    private v mViewModelStore;

    private class LifecycleAwareOnBackPressedCallback implements a, e {
        private final f a;
        private final a b;

        LifecycleAwareOnBackPressedCallback(f fVar, a aVar) {
            this.a = fVar;
            this.b = aVar;
            this.a.a(this);
        }

        public boolean a() {
            if (this.a.a().a(b.STARTED)) {
                return this.b.a();
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public a b() {
            return this.b;
        }

        public void c() {
            this.a.b(this);
        }

        public void a(h hVar, androidx.lifecycle.f.a aVar) {
            if (aVar == androidx.lifecycle.f.a.ON_DESTROY) {
                synchronized (ComponentActivity.this.mOnBackPressedCallbacks) {
                    this.a.b(this);
                    ComponentActivity.this.mOnBackPressedCallbacks.remove(this);
                }
            }
        }
    }

    static final class a {
        Object a;
        v b;

        a() {
        }
    }

    public ComponentActivity() {
        if (getLifecycle() != null) {
            if (VERSION.SDK_INT >= 19) {
                getLifecycle().a(new e() {
                    public void a(h hVar, androidx.lifecycle.f.a aVar) {
                        if (aVar == androidx.lifecycle.f.a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            getLifecycle().a(new e() {
                public void a(h hVar, androidx.lifecycle.f.a aVar) {
                    if (aVar == androidx.lifecycle.f.a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().a();
                    }
                }
            });
            int i = VERSION.SDK_INT;
            if (19 <= i && i <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public void addOnBackPressedCallback(a aVar) {
        addOnBackPressedCallback(this, aVar);
    }

    public final Qd<Bundle> getBundleSavedStateRegistry() {
        return this.mSavedStateRegistry;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        a aVar = (a) getLastNonConfigurationInstance();
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    public f getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public v getViewModelStore() {
        if (getApplication() != null) {
            if (this.mViewModelStore == null) {
                a aVar = (a) getLastNonConfigurationInstance();
                if (aVar != null) {
                    this.mViewModelStore = aVar.b;
                }
                if (this.mViewModelStore == null) {
                    this.mViewModelStore = new v();
                }
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        Iterator it = this.mOnBackPressedCallbacks.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).a()) {
                return;
            }
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mSavedStateRegistry.a(bundle);
        r.a((Activity) this);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        v vVar = this.mViewModelStore;
        if (vVar == null) {
            a aVar = (a) getLastNonConfigurationInstance();
            if (aVar != null) {
                vVar = aVar.b;
            }
        }
        if (vVar == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        a aVar2 = new a();
        aVar2.a = onRetainCustomNonConfigurationInstance;
        aVar2.b = vVar;
        return aVar2;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onSaveInstanceState(Bundle bundle) {
        f lifecycle = getLifecycle();
        if (lifecycle instanceof j) {
            ((j) lifecycle).a(b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistry.b(bundle);
    }

    public void removeOnBackPressedCallback(a aVar) {
        LifecycleAwareOnBackPressedCallback lifecycleAwareOnBackPressedCallback;
        Iterator it = this.mOnBackPressedCallbacks.iterator();
        while (true) {
            if (!it.hasNext()) {
                lifecycleAwareOnBackPressedCallback = null;
                break;
            }
            lifecycleAwareOnBackPressedCallback = (LifecycleAwareOnBackPressedCallback) it.next();
            if (lifecycleAwareOnBackPressedCallback.b().equals(aVar)) {
                break;
            }
        }
        if (lifecycleAwareOnBackPressedCallback != null) {
            lifecycleAwareOnBackPressedCallback.c();
            this.mOnBackPressedCallbacks.remove(lifecycleAwareOnBackPressedCallback);
        }
    }

    public void addOnBackPressedCallback(h hVar, a aVar) {
        f lifecycle = hVar.getLifecycle();
        if (lifecycle.a() != b.DESTROYED) {
            this.mOnBackPressedCallbacks.add(0, new LifecycleAwareOnBackPressedCallback(lifecycle, aVar));
        }
    }
}
