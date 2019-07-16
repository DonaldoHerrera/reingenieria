package androidx.appcompat.app;

import android.graphics.Rect;
import androidx.appcompat.widget.G.a;

/* compiled from: AppCompatDelegateImpl */
class r implements a {
    final /* synthetic */ w a;

    r(w wVar) {
        this.a = wVar;
    }

    public void a(Rect rect) {
        rect.top = this.a.j(rect.top);
    }
}
