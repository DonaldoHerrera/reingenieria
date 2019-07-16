package androidx.appcompat.widget;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: androidx.appcompat.widget.l reason: case insensitive filesystem */
/* compiled from: ActivityChooserView */
class C0345l extends AccessibilityDelegate {
    final /* synthetic */ ActivityChooserView a;

    C0345l(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Mc.a(accessibilityNodeInfo).b(true);
    }
}
