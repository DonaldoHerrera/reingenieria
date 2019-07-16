package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.common.api.Api.BaseClientBuilder;

/* compiled from: TooltipCompatHandler */
class ya implements OnLongClickListener, OnHoverListener, OnAttachStateChangeListener {
    private static ya a;
    private static ya b;
    private final View c;
    private final CharSequence d;
    private final int e;
    private final Runnable f = new wa(this);
    private final Runnable g = new xa(this);
    private int h;
    private int i;
    private za j;
    private boolean k;

    private ya(View view, CharSequence charSequence) {
        this.c = view;
        this.d = charSequence;
        this.e = C1808wc.a(ViewConfiguration.get(this.c.getContext()));
        c();
        this.c.setOnLongClickListener(this);
        this.c.setOnHoverListener(this);
    }

    public static void a(View view, CharSequence charSequence) {
        ya yaVar = a;
        if (yaVar != null && yaVar.c == view) {
            a((ya) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            ya yaVar2 = b;
            if (yaVar2 != null && yaVar2.c == view) {
                yaVar2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ya(view, charSequence);
    }

    private void b() {
        this.c.removeCallbacks(this.f);
    }

    private void c() {
        this.h = BaseClientBuilder.API_PRIORITY_OTHER;
        this.i = BaseClientBuilder.API_PRIORITY_OTHER;
    }

    private void d() {
        this.c.postDelayed(this.f, (long) ViewConfiguration.getLongPressTimeout());
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.j != null && this.k) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.c.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                a();
            }
        } else if (this.c.isEnabled() && this.j == null && a(motionEvent)) {
            a(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.h = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        a();
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        long j2;
        int i2;
        long j3;
        if (C1778vc.A(this.c)) {
            a((ya) null);
            ya yaVar = b;
            if (yaVar != null) {
                yaVar.a();
            }
            b = this;
            this.k = z;
            this.j = new za(this.c.getContext());
            this.j.a(this.c, this.h, this.i, this.k, this.d);
            this.c.addOnAttachStateChangeListener(this);
            if (this.k) {
                j2 = 2500;
            } else {
                if ((C1778vc.t(this.c) & 1) == 1) {
                    j3 = 3000;
                    i2 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j3 = 15000;
                    i2 = ViewConfiguration.getLongPressTimeout();
                }
                j2 = j3 - ((long) i2);
            }
            this.c.removeCallbacks(this.g);
            this.c.postDelayed(this.g, j2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (b == this) {
            b = null;
            za zaVar = this.j;
            if (zaVar != null) {
                zaVar.a();
                this.j = null;
                c();
                this.c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (a == this) {
            a((ya) null);
        }
        this.c.removeCallbacks(this.g);
    }

    private static void a(ya yaVar) {
        ya yaVar2 = a;
        if (yaVar2 != null) {
            yaVar2.b();
        }
        a = yaVar;
        ya yaVar3 = a;
        if (yaVar3 != null) {
            yaVar3.d();
        }
    }

    private boolean a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.h) <= this.e && Math.abs(y - this.i) <= this.e) {
            return false;
        }
        this.h = x;
        this.i = y;
        return true;
    }
}
