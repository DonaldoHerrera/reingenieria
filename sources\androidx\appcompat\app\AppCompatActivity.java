package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import androidx.appcompat.widget.Aa;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.b;
import androidx.core.app.i;
import androidx.core.app.r;
import androidx.core.app.r.a;
import androidx.fragment.app.FragmentActivity;

public class AppCompatActivity extends FragmentActivity implements m, a, C0315b {
    private n mDelegate;
    private Resources mResources;
    private int mThemeId = 0;

    private boolean performMenuItemShortcut(int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            Window window = getWindow();
            if (!(window == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent))) {
                return true;
            }
        }
        return false;
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        getDelegate().a(view, layoutParams);
    }

    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.e()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return getDelegate().a(i);
    }

    public n getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = n.a((Activity) this, (m) this);
        }
        return this.mDelegate;
    }

    public C0314a getDrawerToggleDelegate() {
        return getDelegate().c();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().d();
    }

    public Resources getResources() {
        if (this.mResources == null && Aa.b()) {
            this.mResources = new Aa(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().e();
    }

    public Intent getSupportParentActivityIntent() {
        return i.a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().g();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().a(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        n delegate = getDelegate();
        delegate.f();
        delegate.a(bundle);
        if (delegate.a()) {
            int i = this.mThemeId;
            if (i != 0) {
                if (VERSION.SDK_INT >= 23) {
                    onApplyThemeResource(getTheme(), this.mThemeId, false);
                } else {
                    setTheme(i);
                }
            }
        }
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(r rVar) {
        rVar.a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        getDelegate().h();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.g() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        getDelegate().i();
    }

    public void onPrepareSupportNavigateUpTaskStack(r rVar) {
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().c(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        getDelegate().j();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getDelegate().k();
    }

    public void onSupportActionModeFinished(C1712t tVar) {
    }

    public void onSupportActionModeStarted(C1712t tVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            r a = r.a((Context) this);
            onCreateSupportNavigateUpTaskStack(a);
            onPrepareSupportNavigateUpTaskStack(a);
            a.f();
            try {
                b.a(this);
            } catch (IllegalStateException unused) {
                finish();
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().a(charSequence);
    }

    public C1712t onWindowStartingSupportActionMode(a aVar) {
        return null;
    }

    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.k()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        getDelegate().c(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().a(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.mThemeId = i;
    }

    public C1712t startSupportActionMode(a aVar) {
        return getDelegate().a(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().g();
    }

    public void supportNavigateUpTo(Intent intent) {
        i.a((Activity) this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().b(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return i.b((Activity) this, intent);
    }

    public void setContentView(View view) {
        getDelegate().a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        getDelegate().b(view, layoutParams);
    }
}
