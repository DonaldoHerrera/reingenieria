package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

/* compiled from: MenuItemWrapperJB */
class r extends q {

    /* compiled from: MenuItemWrapperJB */
    class a extends a implements VisibilityListener {
        b f;

        public a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public View a(MenuItem menuItem) {
            return this.d.onCreateActionView(menuItem);
        }

        public boolean c() {
            return this.d.isVisible();
        }

        public boolean f() {
            return this.d.overridesItemVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            b bVar = this.f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }

        public void a(b bVar) {
            this.f = bVar;
            this.d.setVisibilityListener(bVar != null ? this : null);
        }
    }

    r(Context context, C1536nb nbVar) {
        super(context, nbVar);
    }

    /* access modifiers changed from: 0000 */
    public a a(ActionProvider actionProvider) {
        return new a(this.b, actionProvider);
    }
}
