package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18 */
class Ea implements Fa {
    private final WindowId a;

    Ea(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Ea) && ((Ea) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
