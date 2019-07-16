package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.MenuItem;

/* renamed from: cc reason: default package and case insensitive filesystem */
/* compiled from: MenuItemCompat */
public final class C0518cc {
    public static MenuItem a(MenuItem menuItem, C0278Xb xb) {
        if (menuItem instanceof C1536nb) {
            return ((C1536nb) menuItem).a(xb);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C1536nb) {
            ((C1536nb) menuItem).setTooltipText(charSequence);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }

    public static C0278Xb a(MenuItem menuItem) {
        if (menuItem instanceof C1536nb) {
            return ((C1536nb) menuItem).a();
        }
        Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    public static void b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C1536nb) {
            ((C1536nb) menuItem).setNumericShortcut(c, i);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    public static void a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C1536nb) {
            ((C1536nb) menuItem).setContentDescription(charSequence);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C1536nb) {
            ((C1536nb) menuItem).setAlphabeticShortcut(c, i);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    public static void a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C1536nb) {
            ((C1536nb) menuItem).setIconTintList(colorStateList);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    public static void a(MenuItem menuItem, Mode mode) {
        if (menuItem instanceof C1536nb) {
            ((C1536nb) menuItem).setIconTintMode(mode);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }
}
