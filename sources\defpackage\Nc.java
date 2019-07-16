package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Nc reason: default package */
/* compiled from: AccessibilityNodeProviderCompat */
public class Nc {
    private final Object a;

    /* renamed from: Nc$a */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class a extends AccessibilityNodeProvider {
        final Nc a;

        a(Nc nc) {
            this.a = nc;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            Mc a2 = this.a.a(i);
            if (a2 == null) {
                return null;
            }
            return a2.z();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List a2 = this.a.a(str, i);
            if (a2 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((Mc) a2.get(i2)).z());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.a(i, i2, bundle);
        }
    }

    /* renamed from: Nc$b */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class b extends a {
        b(Nc nc) {
            super(nc);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            Mc b = this.a.b(i);
            if (b == null) {
                return null;
            }
            return b.z();
        }
    }

    public Nc() {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            this.a = new b(this);
        } else if (i >= 16) {
            this.a = new a(this);
        } else {
            this.a = null;
        }
    }

    public Mc a(int i) {
        return null;
    }

    public Object a() {
        return this.a;
    }

    public List<Mc> a(String str, int i) {
        return null;
    }

    public boolean a(int i, int i2, Bundle bundle) {
        return false;
    }

    public Mc b(int i) {
        return null;
    }

    public Nc(Object obj) {
        this.a = obj;
    }
}
