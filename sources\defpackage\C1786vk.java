package defpackage;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.B;
import java.lang.ref.WeakReference;

/* renamed from: vk reason: default package and case insensitive filesystem */
/* compiled from: RCTCodelessLoggingEventListener */
public class C1786vk {

    /* renamed from: vk$a */
    /* compiled from: RCTCodelessLoggingEventListener */
    public static class a implements OnTouchListener {
        private Ck a;
        private WeakReference<View> b;
        private WeakReference<View> c;
        private OnTouchListener d;
        private boolean e = false;

        public a(Ck ck, View view, View view2) {
            if (ck != null && view != null && view2 != null) {
                this.d = Hk.e(view2);
                this.a = ck;
                this.b = new WeakReference<>(view2);
                this.c = new WeakReference<>(view);
                this.e = true;
            }
        }

        private void b() {
            Ck ck = this.a;
            if (ck != null) {
                String b2 = ck.b();
                Bundle a2 = C1726tk.a(this.a, (View) this.c.get(), (View) this.b.get());
                String str = "_valueToSum";
                if (a2.containsKey(str)) {
                    a2.putDouble(str, Qk.a(a2.getString(str)));
                }
                a2.putString("_is_fb_codeless", "1");
                B.m().execute(new C1756uk(this, b2, a2));
            }
        }

        public boolean a() {
            return this.e;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                b();
            }
            OnTouchListener onTouchListener = this.d;
            if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
                return false;
            }
            return true;
        }
    }

    public static a a(Ck ck, View view, View view2) {
        return new a(ck, view, view2);
    }
}
