package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: MenuWrapperFactory */
public final class x {
    public static Menu a(Context context, C1505mb mbVar) {
        return new y(context, mbVar);
    }

    public static MenuItem a(Context context, C1536nb nbVar) {
        if (VERSION.SDK_INT >= 16) {
            return new r(context, nbVar);
        }
        return new q(context, nbVar);
    }

    public static SubMenu a(Context context, C1567ob obVar) {
        return new E(context, obVar);
    }
}
