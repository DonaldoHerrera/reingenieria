package defpackage;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: Kc reason: default package */
/* compiled from: AccessibilityEventCompat */
public final class Kc {
    public static void a(AccessibilityEvent accessibilityEvent, int i) {
        if (VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    public static int a(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }
}
