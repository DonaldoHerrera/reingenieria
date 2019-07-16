package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* compiled from: AppCompatDialog */
public class A extends Dialog implements m {
    private n a;
    private final a b = new z(this);

    public A(Context context, int i) {
        super(context, a(context, i));
        a().a((Bundle) null);
        a().a();
    }

    public boolean a(int i) {
        return a().b(i);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0291_b.a(this.b, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return a().a(i);
    }

    public void invalidateOptionsMenu() {
        a().g();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a().f();
        super.onCreate(bundle);
        a().a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        a().k();
    }

    public void onSupportActionModeFinished(C1712t tVar) {
    }

    public void onSupportActionModeStarted(C1712t tVar) {
    }

    public C1712t onWindowStartingSupportActionMode(a aVar) {
        return null;
    }

    public void setContentView(int i) {
        a().c(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }

    public n a() {
        if (this.a == null) {
            this.a = n.a((Dialog) this, (m) this);
        }
        return this.a;
    }

    public void setContentView(View view) {
        a().a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        a().a((CharSequence) getContext().getString(i));
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0294a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
