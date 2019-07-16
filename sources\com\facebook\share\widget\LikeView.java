package com.facebook.share.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.C0594t;
import com.facebook.common.h;
import com.facebook.internal.L;
import com.facebook.internal.Z;
import com.facebook.internal.ia;
import com.facebook.share.internal.t;
import com.facebook.share.internal.v;
import com.facebook.share.internal.w;

@Deprecated
public class LikeView extends FrameLayout {
    /* access modifiers changed from: private */
    public String a;
    /* access modifiers changed from: private */
    public e b;
    private LinearLayout c;
    private w d;
    private v e;
    private TextView f;
    private t g;
    /* access modifiers changed from: private */
    public f h;
    private BroadcastReceiver i;
    /* access modifiers changed from: private */
    public c j;
    private g k = g.d;
    private b l = b.d;
    private a m = a.d;
    private int n = -1;
    private int o;
    private int p;
    private L q;
    private boolean r = true;

    @Deprecated
    public enum a {
        BOTTOM("bottom", 0),
        INLINE("inline", 1),
        TOP("top", 2);
        
        static a d;
        private String f;
        private int g;

        static {
            a aVar;
            d = aVar;
        }

        private a(String str, int i) {
            this.f = str;
            this.g = i;
        }

        public String toString() {
            return this.f;
        }

        static a a(int i) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.a() == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public int a() {
            return this.g;
        }
    }

    @Deprecated
    public enum b {
        CENTER("center", 0),
        LEFT("left", 1),
        RIGHT("right", 2);
        
        static b d;
        private String f;
        private int g;

        static {
            b bVar;
            d = bVar;
        }

        private b(String str, int i) {
            this.f = str;
            this.g = i;
        }

        public String toString() {
            return this.f;
        }

        static b a(int i) {
            b[] values;
            for (b bVar : values()) {
                if (bVar.a() == i) {
                    return bVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public int a() {
            return this.g;
        }
    }

    private class c implements com.facebook.share.internal.t.c {
        private boolean a;

        private c() {
        }

        public void a() {
            this.a = true;
        }

        /* synthetic */ c(LikeView likeView, a aVar) {
            this();
        }

        public void a(t tVar, C0594t tVar2) {
            if (!this.a) {
                if (tVar != null) {
                    if (!tVar.i()) {
                        tVar2 = new C0594t("Cannot use LikeView. The device may not be supported.");
                    }
                    LikeView.this.a(tVar);
                    LikeView.this.e();
                }
                if (!(tVar2 == null || LikeView.this.h == null)) {
                    LikeView.this.h.a(tVar2);
                }
                LikeView.this.j = null;
            }
        }
    }

    private class d extends BroadcastReceiver {
        private d() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            boolean z = true;
            if (extras != null) {
                String string = extras.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
                if (!ia.b(string) && !ia.a(LikeView.this.a, string)) {
                    z = false;
                }
            }
            if (z) {
                if ("com.facebook.sdk.LikeActionController.UPDATED".equals(action)) {
                    LikeView.this.e();
                } else if ("com.facebook.sdk.LikeActionController.DID_ERROR".equals(action)) {
                    if (LikeView.this.h != null) {
                        LikeView.this.h.a(Z.a(extras));
                    }
                } else if ("com.facebook.sdk.LikeActionController.DID_RESET".equals(action)) {
                    LikeView likeView = LikeView.this;
                    likeView.b(likeView.a, LikeView.this.b);
                    LikeView.this.e();
                }
            }
        }

        /* synthetic */ d(LikeView likeView, a aVar) {
            this();
        }
    }

    @Deprecated
    public enum e {
        UNKNOWN("unknown", 0),
        OPEN_GRAPH("open_graph", 1),
        PAGE("page", 2);
        
        public static e d;
        private String f;
        private int g;

        static {
            e eVar;
            d = eVar;
        }

        private e(String str, int i) {
            this.f = str;
            this.g = i;
        }

        public static e a(int i) {
            e[] values;
            for (e eVar : values()) {
                if (eVar.a() == i) {
                    return eVar;
                }
            }
            return null;
        }

        public String toString() {
            return this.f;
        }

        public int a() {
            return this.g;
        }
    }

    public interface f {
        void a(C0594t tVar);
    }

    @Deprecated
    public enum g {
        STANDARD("standard", 0),
        BUTTON("button", 1),
        BOX_COUNT("box_count", 2);
        
        static g d;
        private String f;
        private int g;

        static {
            g gVar;
            d = gVar;
        }

        private g(String str, int i) {
            this.f = str;
            this.g = i;
        }

        public String toString() {
            return this.f;
        }

        static g a(int i) {
            g[] values;
            for (g gVar : values()) {
                if (gVar.a() == i) {
                    return gVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public int a() {
            return this.g;
        }
    }

    @Deprecated
    public LikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
        a(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    private Activity getActivity() {
        boolean z;
        Context context = getContext();
        while (true) {
            z = context instanceof Activity;
            if (!z && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            } else if (!z) {
                return (Activity) context;
            } else {
                throw new C0594t("Unable to get Activity.");
            }
        }
        if (!z) {
        }
    }

    private Bundle getAnalyticsParameters() {
        Bundle bundle = new Bundle();
        bundle.putString("style", this.k.toString());
        bundle.putString("auxiliary_position", this.m.toString());
        bundle.putString("horizontal_alignment", this.l.toString());
        bundle.putString("object_id", ia.a(this.a, ""));
        bundle.putString("object_type", this.b.toString());
        return bundle;
    }

    @Deprecated
    public f getOnErrorListener() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        a((String) null, e.UNKNOWN);
        super.onDetachedFromWindow();
    }

    @Deprecated
    public void setAuxiliaryViewPosition(a aVar) {
        if (aVar == null) {
            aVar = a.d;
        }
        if (this.m != aVar) {
            this.m = aVar;
            d();
        }
    }

    @Deprecated
    public void setEnabled(boolean z) {
        this.r = true;
        e();
    }

    @Deprecated
    public void setForegroundColor(int i2) {
        if (this.n != i2) {
            this.f.setTextColor(i2);
        }
    }

    @Deprecated
    public void setFragment(Fragment fragment) {
        this.q = new L(fragment);
    }

    @Deprecated
    public void setHorizontalAlignment(b bVar) {
        if (bVar == null) {
            bVar = b.d;
        }
        if (this.l != bVar) {
            this.l = bVar;
            d();
        }
    }

    @Deprecated
    public void setLikeViewStyle(g gVar) {
        if (gVar == null) {
            gVar = g.d;
        }
        if (this.k != gVar) {
            this.k = gVar;
            d();
        }
    }

    @Deprecated
    public void setOnErrorListener(f fVar) {
        this.h = fVar;
    }

    private void b(Context context) {
        t tVar = this.g;
        this.d = new w(context, tVar != null && tVar.h());
        this.d.setOnClickListener(new a(this));
        this.d.setLayoutParams(new LayoutParams(-2, -2));
    }

    private void c(Context context) {
        this.e = new v(context);
        this.e.setLayoutParams(new LayoutParams(-1, -1));
    }

    private void d(Context context) {
        this.f = new TextView(context);
        this.f.setTextSize(0, getResources().getDimension(com.facebook.common.b.com_facebook_likeview_text_size));
        this.f.setMaxLines(2);
        this.f.setTextColor(this.n);
        this.f.setGravity(17);
        this.f.setLayoutParams(new LayoutParams(-2, -1));
    }

    /* access modifiers changed from: private */
    public void e() {
        boolean z = !this.r;
        t tVar = this.g;
        if (tVar == null) {
            this.d.setSelected(false);
            this.f.setText(null);
            this.e.setText(null);
        } else {
            this.d.setSelected(tVar.h());
            this.f.setText(this.g.g());
            this.e.setText(this.g.e());
            z &= this.g.i();
        }
        super.setEnabled(z);
        this.d.setEnabled(z);
        d();
    }

    @Deprecated
    public void setFragment(android.app.Fragment fragment) {
        this.q = new L(fragment);
    }

    private void c() {
        int i2 = b.a[this.m.ordinal()];
        if (i2 == 1) {
            this.e.setCaretPosition(com.facebook.share.internal.v.a.BOTTOM);
        } else if (i2 == 2) {
            this.e.setCaretPosition(com.facebook.share.internal.v.a.TOP);
        } else if (i2 == 3) {
            this.e.setCaretPosition(this.l == b.RIGHT ? com.facebook.share.internal.v.a.RIGHT : com.facebook.share.internal.v.a.LEFT);
        }
    }

    @Deprecated
    public void a(String str, e eVar) {
        String a2 = ia.a(str, (String) null);
        if (eVar == null) {
            eVar = e.d;
        }
        if (!ia.a(a2, this.a) || eVar != this.b) {
            b(a2, eVar);
            e();
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        if (this.g != null) {
            Activity activity = null;
            if (this.q == null) {
                activity = getActivity();
            }
            this.g.a(activity, this.q, getAnalyticsParameters());
        }
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null && getContext() != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.com_facebook_like_view);
            if (obtainStyledAttributes != null) {
                this.a = ia.a(obtainStyledAttributes.getString(h.com_facebook_like_view_com_facebook_object_id), (String) null);
                this.b = e.a(obtainStyledAttributes.getInt(h.com_facebook_like_view_com_facebook_object_type, e.d.a()));
                this.k = g.a(obtainStyledAttributes.getInt(h.com_facebook_like_view_com_facebook_style, g.d.a()));
                if (this.k != null) {
                    this.m = a.a(obtainStyledAttributes.getInt(h.com_facebook_like_view_com_facebook_auxiliary_view_position, a.d.a()));
                    if (this.m != null) {
                        this.l = b.a(obtainStyledAttributes.getInt(h.com_facebook_like_view_com_facebook_horizontal_alignment, b.d.a()));
                        if (this.l != null) {
                            this.n = obtainStyledAttributes.getColor(h.com_facebook_like_view_com_facebook_foreground_color, -1);
                            obtainStyledAttributes.recycle();
                            return;
                        }
                        throw new IllegalArgumentException("Unsupported value for LikeView 'horizontal_alignment'");
                    }
                    throw new IllegalArgumentException("Unsupported value for LikeView 'auxiliary_view_position'");
                }
                throw new IllegalArgumentException("Unsupported value for LikeView 'style'");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d6  */
    private void d() {
        View view;
        a aVar;
        int i2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        LayoutParams layoutParams2 = (LayoutParams) this.d.getLayoutParams();
        b bVar = this.l;
        int i3 = bVar == b.LEFT ? 3 : bVar == b.CENTER ? 1 : 5;
        layoutParams.gravity = i3 | 48;
        layoutParams2.gravity = i3;
        this.f.setVisibility(8);
        this.e.setVisibility(8);
        if (this.k == g.STANDARD) {
            t tVar = this.g;
            if (tVar != null && !ia.b(tVar.g())) {
                view = this.f;
                int i4 = 0;
                view.setVisibility(0);
                ((LayoutParams) view.getLayoutParams()).gravity = i3;
                LinearLayout linearLayout = this.c;
                if (this.m != a.INLINE) {
                    i4 = 1;
                }
                linearLayout.setOrientation(i4);
                aVar = this.m;
                if (aVar != a.TOP || (aVar == a.INLINE && this.l == b.RIGHT)) {
                    this.c.removeView(this.d);
                    this.c.addView(this.d);
                } else {
                    this.c.removeView(view);
                    this.c.addView(view);
                }
                i2 = b.a[this.m.ordinal()];
                if (i2 != 1) {
                    int i5 = this.o;
                    view.setPadding(i5, i5, i5, this.p);
                    return;
                } else if (i2 == 2) {
                    int i6 = this.o;
                    view.setPadding(i6, this.p, i6, i6);
                    return;
                } else if (i2 == 3) {
                    if (this.l == b.RIGHT) {
                        int i7 = this.o;
                        view.setPadding(i7, i7, this.p, i7);
                        return;
                    }
                    int i8 = this.p;
                    int i9 = this.o;
                    view.setPadding(i8, i9, i9, i9);
                    return;
                } else {
                    return;
                }
            }
        }
        if (this.k == g.BOX_COUNT) {
            t tVar2 = this.g;
            if (tVar2 != null && !ia.b(tVar2.e())) {
                c();
                view = this.e;
                int i42 = 0;
                view.setVisibility(0);
                ((LayoutParams) view.getLayoutParams()).gravity = i3;
                LinearLayout linearLayout2 = this.c;
                if (this.m != a.INLINE) {
                }
                linearLayout2.setOrientation(i42);
                aVar = this.m;
                if (aVar != a.TOP) {
                }
                this.c.removeView(this.d);
                this.c.addView(this.d);
                i2 = b.a[this.m.ordinal()];
                if (i2 != 1) {
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void b(String str, e eVar) {
        a();
        this.a = str;
        this.b = eVar;
        if (!ia.b(str)) {
            this.j = new c(this, null);
            if (!isInEditMode()) {
                t.b(str, eVar, (com.facebook.share.internal.t.c) this.j);
            }
        }
    }

    private void a(Context context) {
        this.o = getResources().getDimensionPixelSize(com.facebook.common.b.com_facebook_likeview_edge_padding);
        this.p = getResources().getDimensionPixelSize(com.facebook.common.b.com_facebook_likeview_internal_padding);
        if (this.n == -1) {
            this.n = getResources().getColor(com.facebook.common.a.com_facebook_likeview_text_color);
        }
        setBackgroundColor(0);
        this.c = new LinearLayout(context);
        this.c.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        b(context);
        d(context);
        c(context);
        this.c.addView(this.d);
        this.c.addView(this.f);
        this.c.addView(this.e);
        addView(this.c);
        b(this.a, this.b);
        e();
    }

    /* access modifiers changed from: private */
    public void a(t tVar) {
        this.g = tVar;
        this.i = new d(this, null);
        C1600pd a2 = C1600pd.a(getContext());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
        a2.a(this.i, intentFilter);
    }

    private void a() {
        if (this.i != null) {
            C1600pd.a(getContext()).a(this.i);
            this.i = null;
        }
        c cVar = this.j;
        if (cVar != null) {
            cVar.a();
            this.j = null;
        }
        this.g = null;
    }
}
