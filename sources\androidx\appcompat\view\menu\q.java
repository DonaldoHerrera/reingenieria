package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* compiled from: MenuItemWrapperICS */
public class q extends C0328c<C1536nb> implements MenuItem {
    private Method e;

    /* compiled from: MenuItemWrapperICS */
    class a extends C0278Xb {
        final ActionProvider d;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.d = actionProvider;
        }

        public void a(SubMenu subMenu) {
            this.d.onPrepareSubMenu(q.this.a(subMenu));
        }

        public boolean b() {
            return this.d.hasSubMenu();
        }

        public View d() {
            return this.d.onCreateActionView();
        }

        public boolean e() {
            return this.d.onPerformDefaultAction();
        }
    }

    /* compiled from: MenuItemWrapperICS */
    static class b extends FrameLayout implements C1742u {
        final CollapsibleActionView a;

        b(View view) {
            super(view.getContext());
            this.a = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: 0000 */
        public View a() {
            return (View) this.a;
        }

        public void onActionViewCollapsed() {
            this.a.onActionViewCollapsed();
        }

        public void onActionViewExpanded() {
            this.a.onActionViewExpanded();
        }
    }

    /* compiled from: MenuItemWrapperICS */
    private class c extends C0329d<OnActionExpandListener> implements OnActionExpandListener {
        c(OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((OnActionExpandListener) this.a).onMenuItemActionCollapse(q.this.a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((OnActionExpandListener) this.a).onMenuItemActionExpand(q.this.a(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS */
    private class d extends C0329d<OnMenuItemClickListener> implements OnMenuItemClickListener {
        d(OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((OnMenuItemClickListener) this.a).onMenuItemClick(q.this.a(menuItem));
        }
    }

    q(Context context, C1536nb nbVar) {
        super(context, nbVar);
    }

    public void a(boolean z) {
        try {
            if (this.e == null) {
                this.e = ((C1536nb) this.a).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.e.invoke(this.a, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    public boolean collapseActionView() {
        return ((C1536nb) this.a).collapseActionView();
    }

    public boolean expandActionView() {
        return ((C1536nb) this.a).expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0278Xb a2 = ((C1536nb) this.a).a();
        if (a2 instanceof a) {
            return ((a) a2).d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = ((C1536nb) this.a).getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return ((C1536nb) this.a).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((C1536nb) this.a).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((C1536nb) this.a).getContentDescription();
    }

    public int getGroupId() {
        return ((C1536nb) this.a).getGroupId();
    }

    public Drawable getIcon() {
        return ((C1536nb) this.a).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((C1536nb) this.a).getIconTintList();
    }

    public Mode getIconTintMode() {
        return ((C1536nb) this.a).getIconTintMode();
    }

    public Intent getIntent() {
        return ((C1536nb) this.a).getIntent();
    }

    public int getItemId() {
        return ((C1536nb) this.a).getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return ((C1536nb) this.a).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((C1536nb) this.a).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((C1536nb) this.a).getNumericShortcut();
    }

    public int getOrder() {
        return ((C1536nb) this.a).getOrder();
    }

    public SubMenu getSubMenu() {
        return a(((C1536nb) this.a).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C1536nb) this.a).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C1536nb) this.a).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((C1536nb) this.a).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((C1536nb) this.a).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C1536nb) this.a).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C1536nb) this.a).isCheckable();
    }

    public boolean isChecked() {
        return ((C1536nb) this.a).isChecked();
    }

    public boolean isEnabled() {
        return ((C1536nb) this.a).isEnabled();
    }

    public boolean isVisible() {
        return ((C1536nb) this.a).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C1536nb) this.a).a(actionProvider != null ? a(actionProvider) : null);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        ((C1536nb) this.a).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        ((C1536nb) this.a).setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C1536nb) this.a).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C1536nb) this.a).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C1536nb) this.a).setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C1536nb) this.a).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C1536nb) this.a).setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C1536nb) this.a).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        ((C1536nb) this.a).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C1536nb) this.a).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        ((C1536nb) this.a).setNumericShortcut(c2);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        ((C1536nb) this.a).setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        ((C1536nb) this.a).setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        ((C1536nb) this.a).setShortcut(c2, c3);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C1536nb) this.a).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C1536nb) this.a).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C1536nb) this.a).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C1536nb) this.a).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C1536nb) this.a).setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C1536nb) this.a).setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c2, int i) {
        ((C1536nb) this.a).setAlphabeticShortcut(c2, i);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C1536nb) this.a).setIcon(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i) {
        ((C1536nb) this.a).setNumericShortcut(c2, i);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        ((C1536nb) this.a).setShortcut(c2, c3, i, i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C1536nb) this.a).setTitle(i);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C1536nb) this.a).setActionView(i);
        View actionView = ((C1536nb) this.a).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C1536nb) this.a).setActionView((View) new b(actionView));
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    public a a(ActionProvider actionProvider) {
        return new a(this.b, actionProvider);
    }
}
