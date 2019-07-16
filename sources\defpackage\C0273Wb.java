package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: Wb reason: default package and case insensitive filesystem */
/* compiled from: AccessibilityDelegateCompat */
public class C0273Wb {
    private static final AccessibilityDelegate a = new AccessibilityDelegate();
    private final AccessibilityDelegate b;
    private final AccessibilityDelegate c;

    /* renamed from: Wb$a */
    /* compiled from: AccessibilityDelegateCompat */
    static final class a extends AccessibilityDelegate {
        final C0273Wb a;

        a(C0273Wb wb) {
            this.a = wb;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            Nc a2 = this.a.a(view);
            if (a2 != null) {
                return (AccessibilityNodeProvider) a2.a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Mc a2 = Mc.a(accessibilityNodeInfo);
            a2.m(C1778vc.E(view));
            a2.k(C1778vc.z(view));
            a2.g(C1778vc.c(view));
            this.a.a(view, a2);
            a2.a(accessibilityNodeInfo.getText(), view);
            List b = C0273Wb.b(view);
            for (int i = 0; i < b.size(); i++) {
                a2.a((defpackage.Mc.a) b.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.a.a(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.a.a(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.d(view, accessibilityEvent);
        }
    }

    public C0273Wb() {
        this(a);
    }

    /* access modifiers changed from: 0000 */
    public AccessibilityDelegate a() {
        return this.c;
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0273Wb(AccessibilityDelegate accessibilityDelegate) {
        this.b = accessibilityDelegate;
        this.c = new a(this);
    }

    static List<defpackage.Mc.a> b(View view) {
        List<defpackage.Mc.a> list = (List) view.getTag(C0230Ma.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    public void a(View view, int i) {
        this.b.sendAccessibilityEvent(view, i);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(View view, Mc mc) {
        this.b.onInitializeAccessibilityNodeInfo(view, mc.z());
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public Nc a(View view) {
        if (VERSION.SDK_INT >= 16) {
            AccessibilityNodeProvider accessibilityNodeProvider = this.b.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new Nc(accessibilityNodeProvider);
            }
        }
        return null;
    }

    public boolean a(View view, int i, Bundle bundle) {
        List b2 = b(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= b2.size()) {
                break;
            }
            defpackage.Mc.a aVar = (defpackage.Mc.a) b2.get(i2);
            if (aVar.a() == i) {
                z = aVar.a(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && VERSION.SDK_INT >= 16) {
            z = this.b.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != C0230Ma.accessibility_action_clickable_span) ? z : a(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    private boolean a(int i, View view) {
        SparseArray sparseArray = (SparseArray) view.getTag(C0230Ma.tag_accessibility_clickable_spans);
        if (sparseArray != null) {
            WeakReference weakReference = (WeakReference) sparseArray.get(i);
            if (weakReference != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (a(clickableSpan, view)) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] a2 = Mc.a(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (a2 != null && i < a2.length) {
                if (clickableSpan.equals(a2[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
