package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.view.menu.v.a;

/* compiled from: MenuPopupHelper */
public class u implements n {
    private final Context a;
    private final l b;
    private final boolean c;
    private final int d;
    private final int e;
    private View f;
    private int g;
    private boolean h;
    private a i;
    private s j;
    private OnDismissListener k;
    private final OnDismissListener l;

    public u(Context context, l lVar, View view, boolean z, int i2) {
        this(context, lVar, view, z, i2, 0);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.v, androidx.appcompat.view.menu.s] */
    /* JADX WARNING: type inference failed for: r7v0, types: [androidx.appcompat.view.menu.C] */
    /* JADX WARNING: type inference failed for: r1v12, types: [androidx.appcompat.view.menu.i] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.C] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.i] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v1, types: [androidx.appcompat.view.menu.C]
  assigns: [androidx.appcompat.view.menu.C, androidx.appcompat.view.menu.i]
  uses: [androidx.appcompat.view.menu.C, androidx.appcompat.view.menu.s, androidx.appcompat.view.menu.v, androidx.appcompat.view.menu.i]
  mth insns count: 49
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    private s g() {
        ? r0;
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        if (Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(C1222d.abc_cascading_menus_min_smallest_width)) {
            ? iVar = new i(this.a, this.f, this.d, this.e, this.c);
            r0 = iVar;
        } else {
            ? c2 = new C(this.a, this.b, this.f, this.d, this.e, this.c);
            r0 = c2;
        }
        r0.a(this.b);
        r0.a(this.l);
        r0.a(this.f);
        r0.a(this.i);
        r0.b(this.h);
        r0.a(this.g);
        return r0;
    }

    public void a(OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public s b() {
        if (this.j == null) {
            this.j = g();
        }
        return this.j;
    }

    public boolean c() {
        s sVar = this.j;
        return sVar != null && sVar.d();
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.j = null;
        OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void e() {
        if (!f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean f() {
        if (c()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    public u(Context context, l lVar, View view, boolean z, int i2, int i3) {
        this.g = 8388611;
        this.l = new t(this);
        this.a = context;
        this.b = lVar;
        this.f = view;
        this.c = z;
        this.d = i2;
        this.e = i3;
    }

    public void a(View view) {
        this.f = view;
    }

    public void a(boolean z) {
        this.h = z;
        s sVar = this.j;
        if (sVar != null) {
            sVar.b(z);
        }
    }

    public void a(int i2) {
        this.g = i2;
    }

    public boolean a(int i2, int i3) {
        if (c()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        a(i2, i3, true, true);
        return true;
    }

    private void a(int i2, int i3, boolean z, boolean z2) {
        s b2 = b();
        b2.c(z2);
        if (z) {
            if ((C0287Zb.a(this.g, C1778vc.l(this.f)) & 7) == 5) {
                i2 -= this.f.getWidth();
            }
            b2.b(i2);
            b2.c(i3);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b2.a(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        b2.c();
    }

    public void a() {
        if (c()) {
            this.j.dismiss();
        }
    }

    public void a(a aVar) {
        this.i = aVar;
        s sVar = this.j;
        if (sVar != null) {
            sVar.a(aVar);
        }
    }
}
