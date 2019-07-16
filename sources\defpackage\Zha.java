package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.main.M;
import com.soundcloud.android.main.X;
import com.soundcloud.android.main.Z;
import com.soundcloud.android.view.N;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00019B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u001a\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0015H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016J\u0012\u0010#\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010+\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010,\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010.\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0015H\u0002J\u0010\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020\u0019H\u0016J\u0010\u00106\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u000200H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/soundcloud/android/listeners/navigation/MainNavController;", "Lcom/soundcloud/lightcycle/DefaultActivityLightCycle;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ncapdevi/fragnav/FragNavController$TransactionListener;", "Lcom/soundcloud/android/main/NavController;", "navigationModel", "Lcom/soundcloud/android/main/NavigationModel;", "bottomNavigationResolver", "Lcom/soundcloud/android/listeners/navigation/BottomNavigationIntentFactory;", "fragNavControllerFactory", "Lcom/soundcloud/android/main/FragNavControllerFactory;", "(Lcom/soundcloud/android/main/NavigationModel;Lcom/soundcloud/android/listeners/navigation/BottomNavigationIntentFactory;Lcom/soundcloud/android/main/FragNavControllerFactory;)V", "fragNavController", "Lcom/ncapdevi/fragnav/FragNavController;", "transactionOptions", "Lcom/ncapdevi/fragnav/FragNavTransactionOptions;", "kotlin.jvm.PlatformType", "weakReference", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "actionBarUpClicked", "", "item", "Landroid/view/MenuItem;", "clearStack", "", "displayHomeAsUp", "supportActionBar", "Landroidx/appcompat/app/ActionBar;", "init", "activity", "savedInstanceState", "Landroid/os/Bundle;", "isRootFragment", "onBackPressed", "onDestroy", "host", "onFragmentTransaction", "fragment", "Landroidx/fragment/app/Fragment;", "transactionType", "Lcom/ncapdevi/fragnav/FragNavController$TransactionType;", "onOptionsItemSelected", "onResume", "onSaveInstanceState", "bundle", "onTabTransaction", "index", "", "popFragment", "resolveNavigation", "intent", "Landroid/content/Intent;", "scrollToTop", "setupUpAction", "switchTab", "itemPosition", "Companion", "navigation_release"}, mv = {1, 1, 15})
/* renamed from: Zha reason: default package */
/* compiled from: MainNavController.kt */
public final class Zha extends DefaultActivityLightCycle<AppCompatActivity> implements d, X {
    public static final a a = new a(null);
    private C3030hI b;
    private WeakReference<Activity> c;
    private final C3106lI d;
    private final Z e;
    private final Wha f;
    private final M g;

    /* renamed from: Zha$a */
    /* compiled from: MainNavController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Zha(Z z, Wha wha, M m) {
        C7471uYa.b(z, "navigationModel");
        C7471uYa.b(wha, "bottomNavigationResolver");
        C7471uYa.b(m, "fragNavControllerFactory");
        this.e = z;
        this.f = wha;
        this.g = m;
        defpackage.C3106lI.a a2 = C3106lI.a();
        a2.a(true);
        this.d = a2.a();
    }

    private final boolean x() {
        if (d()) {
            return false;
        }
        C3030hI hIVar = this.b;
        if (hIVar != null) {
            hIVar.b(this.d);
            return true;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* renamed from: b */
    public void onSaveInstanceState(AppCompatActivity appCompatActivity, Bundle bundle) {
        if (bundle != null) {
            C3030hI hIVar = this.b;
            if (hIVar != null) {
                hIVar.a(bundle);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public void c() {
        C3030hI hIVar = this.b;
        if (hIVar != null) {
            hIVar.a(this.d);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean d() {
        C3030hI hIVar = this.b;
        if (hIVar != null) {
            return hIVar.d();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean f() {
        C3030hI hIVar = this.b;
        if (hIVar != null) {
            Fragment b2 = hIVar.b();
            if (!(b2 instanceof C3964cja)) {
                b2 = null;
            }
            C3964cja cja = (C3964cja) b2;
            return (cja != null && cja.Sa()) || x();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void a(AppCompatActivity appCompatActivity, Bundle bundle) {
        C7471uYa.b(appCompatActivity, "activity");
        b a2 = SDb.a("MainNavController");
        StringBuilder sb = new StringBuilder();
        sb.append("init activity=");
        sb.append(appCompatActivity);
        sb.append(", weakreference=");
        WeakReference<Activity> weakReference = this.c;
        sb.append(weakReference != null ? (Activity) weakReference.get() : null);
        a2.d(sb.toString(), new Object[0]);
        this.c = new WeakReference<>(appCompatActivity);
        M m = this.g;
        C0370l supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        C7471uYa.a((Object) supportFragmentManager, "activity.supportFragmentManager");
        C3106lI lIVar = this.d;
        C7471uYa.a((Object) lIVar, "transactionOptions");
        List<com.soundcloud.android.main.Z.a> b2 = this.e.b();
        C7471uYa.a((Object) b2, "navigationModel.items");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) b2, 10));
        for (com.soundcloud.android.main.Z.a Ua : b2) {
            arrayList.add(Ua.Ua());
        }
        this.b = m.a(supportFragmentManager, bundle, this, lIVar, arrayList);
    }

    /* renamed from: b */
    public void onResume(AppCompatActivity appCompatActivity) {
        a(appCompatActivity != null ? appCompatActivity.getSupportActionBar() : null);
    }

    /* renamed from: a */
    public void onDestroy(AppCompatActivity appCompatActivity) {
        b a2 = SDb.a("MainNavController");
        StringBuilder sb = new StringBuilder();
        sb.append("onDestroy activity=");
        sb.append(appCompatActivity);
        sb.append(", weakreference=");
        WeakReference<Activity> weakReference = this.c;
        sb.append(weakReference != null ? (Activity) weakReference.get() : null);
        a2.d(sb.toString(), new Object[0]);
        WeakReference<Activity> weakReference2 = this.c;
        if (C7471uYa.a(weakReference2 != null ? (Activity) weakReference2.get() : null, (Object) appCompatActivity)) {
            this.b = null;
        }
    }

    /* renamed from: a */
    public boolean onOptionsItemSelected(AppCompatActivity appCompatActivity, MenuItem menuItem) {
        C7471uYa.b(appCompatActivity, "host");
        C7471uYa.b(menuItem, "item");
        if (!a(menuItem) || !f()) {
            return super.onOptionsItemSelected(appCompatActivity, menuItem);
        }
        return true;
    }

    public void a() {
        C3030hI hIVar = this.b;
        if (hIVar != null) {
            Fragment b2 = hIVar.b();
            if (!(b2 instanceof N)) {
                b2 = null;
            }
            N n = (N) b2;
            if (n != null) {
                n.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final boolean a(MenuItem menuItem) {
        return menuItem.getItemId() == 16908332;
    }

    public void a(Fragment fragment, int i) {
        if (fragment != null) {
            a(fragment);
        }
    }

    public void a(Fragment fragment, e eVar) {
        C7471uYa.b(fragment, "fragment");
        C7471uYa.b(eVar, "transactionType");
        a(fragment);
    }

    private final void a(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        ActionBar actionBar = null;
        if (!(activity instanceof AppCompatActivity)) {
            activity = null;
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
        if (appCompatActivity != null) {
            actionBar = appCompatActivity.getSupportActionBar();
        }
        a(actionBar);
    }

    private final void a(ActionBar actionBar) {
        if (actionBar != null) {
            actionBar.d(!d());
        }
    }

    public void a(int i) {
        C3030hI hIVar = this.b;
        if (hIVar != null) {
            hIVar.b(i, this.d);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean a(Intent intent) {
        C7471uYa.b(intent, "intent");
        if (intent.getAction() != null) {
            Fragment a2 = this.f.a(intent);
            if (a2 != null) {
                C3030hI hIVar = this.b;
                if (hIVar != null) {
                    hIVar.a(a2, this.d);
                    return true;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return false;
    }
}
