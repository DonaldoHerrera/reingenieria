package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import com.facebook.B;
import com.facebook.C0594t;
import java.lang.ref.WeakReference;

/* renamed from: rk reason: default package and case insensitive filesystem */
/* compiled from: CodelessLoggingEventListener */
public class C1666rk {
    /* access modifiers changed from: private */
    public static final String a = "rk";

    /* renamed from: rk$a */
    /* compiled from: CodelessLoggingEventListener */
    public static class a extends AccessibilityDelegate {
        private Ck a;
        private WeakReference<View> b;
        private WeakReference<View> c;
        private int d;
        private AccessibilityDelegate e;
        private boolean f = false;
        protected boolean g = false;

        public a() {
        }

        private void b() {
            String b2 = this.a.b();
            Bundle a2 = C1726tk.a(this.a, (View) this.c.get(), (View) this.b.get());
            String str = "_valueToSum";
            if (a2.containsKey(str)) {
                a2.putDouble(str, Qk.a(a2.getString(str)));
            }
            a2.putString("_is_fb_codeless", "1");
            B.m().execute(new C1637qk(this, b2, a2));
        }

        public boolean a() {
            return this.f;
        }

        public void sendAccessibilityEvent(View view, int i) {
            if (i == -1) {
                Log.e(C1666rk.a, "Unsupported action type");
            }
            if (i == this.d) {
                AccessibilityDelegate accessibilityDelegate = this.e;
                if (accessibilityDelegate != null && !(accessibilityDelegate instanceof a)) {
                    accessibilityDelegate.sendAccessibilityEvent(view, i);
                }
                b();
            }
        }

        public a(Ck ck, View view, View view2) {
            if (ck != null && view != null && view2 != null) {
                this.e = Hk.d(view2);
                this.a = ck;
                this.b = new WeakReference<>(view2);
                this.c = new WeakReference<>(view);
                defpackage.Ck.a c2 = ck.c();
                int i = C1607pk.a[ck.c().ordinal()];
                if (i == 1) {
                    this.d = 1;
                } else if (i == 2) {
                    this.d = 4;
                } else if (i == 3) {
                    this.d = 16;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported action type: ");
                    sb.append(c2.toString());
                    throw new C0594t(sb.toString());
                }
                this.f = true;
            }
        }
    }

    public static a a(Ck ck, View view, View view2) {
        return new a(ck, view, view2);
    }
}
