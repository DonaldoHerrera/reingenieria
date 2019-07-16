package defpackage;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;

/* renamed from: Lc reason: default package */
/* compiled from: AccessibilityManagerCompat */
public final class Lc {

    /* renamed from: Lc$a */
    /* compiled from: AccessibilityManagerCompat */
    public interface a {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* renamed from: Lc$b */
    /* compiled from: AccessibilityManagerCompat */
    private static class b implements TouchExplorationStateChangeListener {
        final a a;

        b(a aVar) {
            this.a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public void onTouchExplorationStateChanged(boolean z) {
            this.a.onTouchExplorationStateChanged(z);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        if (VERSION.SDK_INT < 19 || aVar == null) {
            return false;
        }
        return accessibilityManager.addTouchExplorationStateChangeListener(new b(aVar));
    }

    public static boolean b(AccessibilityManager accessibilityManager, a aVar) {
        if (VERSION.SDK_INT < 19 || aVar == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new b(aVar));
    }
}
