package androidx.appcompat.view.menu;

import android.os.SystemClock;
import android.view.MenuItem;
import androidx.appcompat.widget.K;

/* compiled from: CascadingMenuPopup */
class h implements K {
    final /* synthetic */ i a;

    h(i iVar) {
        this.a = iVar;
    }

    public void a(l lVar, MenuItem menuItem) {
        a aVar = null;
        this.a.h.removeCallbacksAndMessages(null);
        int size = this.a.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (lVar == ((a) this.a.j.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            int i2 = i + 1;
            if (i2 < this.a.j.size()) {
                aVar = (a) this.a.j.get(i2);
            }
            this.a.h.postAtTime(new g(this, aVar, menuItem, lVar), lVar, SystemClock.uptimeMillis() + 200);
        }
    }

    public void b(l lVar, MenuItem menuItem) {
        this.a.h.removeCallbacksAndMessages(lVar);
    }
}
