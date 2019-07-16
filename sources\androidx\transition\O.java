package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: Scene */
public class O {
    private ViewGroup a;
    private Runnable b;

    public void a() {
        if (a(this.a) == this) {
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    static void a(View view, O o) {
        view.setTag(M.transition_current_scene, o);
    }

    static O a(View view) {
        return (O) view.getTag(M.transition_current_scene);
    }
}
