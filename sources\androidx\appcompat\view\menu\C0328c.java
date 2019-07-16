package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.appcompat.view.menu.c reason: case insensitive filesystem */
/* compiled from: BaseMenuWrapper */
abstract class C0328c<T> extends C0329d<T> {
    final Context b;
    private Map<C1536nb, MenuItem> c;
    private Map<C1567ob, SubMenu> d;

    C0328c(Context context, T t) {
        super(t);
        this.b = context;
    }

    /* access modifiers changed from: 0000 */
    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof C1536nb)) {
            return menuItem;
        }
        C1536nb nbVar = (C1536nb) menuItem;
        if (this.c == null) {
            this.c = new T();
        }
        MenuItem menuItem2 = (MenuItem) this.c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem a = x.a(this.b, nbVar);
        this.c.put(nbVar, a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        Map<C1536nb, MenuItem> map = this.c;
        if (map != null) {
            map.clear();
        }
        Map<C1567ob, SubMenu> map2 = this.d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i) {
        Map<C1536nb, MenuItem> map = this.c;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i == ((MenuItem) it.next()).getItemId()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof C1567ob)) {
            return subMenu;
        }
        C1567ob obVar = (C1567ob) subMenu;
        if (this.d == null) {
            this.d = new T();
        }
        SubMenu subMenu2 = (SubMenu) this.d.get(obVar);
        if (subMenu2 == null) {
            subMenu2 = x.a(this.b, obVar);
            this.d.put(obVar, subMenu2);
        }
        return subMenu2;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i) {
        Map<C1536nb, MenuItem> map = this.c;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
    }
}
