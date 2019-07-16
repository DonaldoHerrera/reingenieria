package com.facebook.login.widget;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.facebook.AccessToken;
import com.facebook.B;
import com.facebook.C0565j;
import com.facebook.C0586p;
import com.facebook.Profile;
import com.facebook.internal.A;
import com.facebook.internal.ia;
import com.facebook.login.C0569b;
import com.facebook.login.D;
import com.facebook.login.G;
import com.facebook.login.J;
import com.facebook.login.K;
import com.facebook.login.L;
import com.facebook.login.s;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LoginButton extends C0586p {
    /* access modifiers changed from: private */
    public boolean i;
    private String j;
    private String k;
    /* access modifiers changed from: private */
    public a l = new a();
    /* access modifiers changed from: private */
    public String m = "fb_login_view_usage";
    private boolean n;
    private com.facebook.login.widget.k.b o = com.facebook.login.widget.k.b.BLUE;
    private c p;
    private long q = 6000;
    private k r;
    private C0565j s;
    private D t;

    static class a {
        private C0569b a = C0569b.FRIENDS;
        /* access modifiers changed from: private */
        public List<String> b = Collections.emptyList();
        private s c = s.NATIVE_WITH_FALLBACK;
        private String d = "rerequest";

        a() {
        }

        public C0569b b() {
            return this.a;
        }

        public s c() {
            return this.c;
        }

        /* access modifiers changed from: 0000 */
        public List<String> d() {
            return this.b;
        }

        public void a(C0569b bVar) {
            this.a = bVar;
        }

        public void a(List<String> list) {
            this.b = list;
        }

        public void a(s sVar) {
            this.c = sVar;
        }

        public String a() {
            return this.d;
        }

        public void a(String str) {
            this.d = str;
        }
    }

    protected class b implements OnClickListener {
        protected b() {
        }

        /* access modifiers changed from: protected */
        public void a(Context context) {
            String str;
            D a2 = a();
            if (LoginButton.this.i) {
                String string = LoginButton.this.getResources().getString(J.com_facebook_loginview_log_out_action);
                String string2 = LoginButton.this.getResources().getString(J.com_facebook_loginview_cancel_action);
                Profile c = Profile.c();
                if (c == null || c.d() == null) {
                    str = LoginButton.this.getResources().getString(J.com_facebook_loginview_logged_in_using_facebook);
                } else {
                    str = String.format(LoginButton.this.getResources().getString(J.com_facebook_loginview_logged_in_as), new Object[]{c.d()});
                }
                Builder builder = new Builder(context);
                builder.setMessage(str).setCancelable(true).setPositiveButton(string, new f(this, a2)).setNegativeButton(string2, null);
                builder.create().show();
                return;
            }
            a2.b();
        }

        /* access modifiers changed from: protected */
        public void b() {
            D a2 = a();
            if (LoginButton.this.getFragment() != null) {
                a2.a(LoginButton.this.getFragment(), (Collection<String>) LoginButton.this.l.b);
            } else if (LoginButton.this.getNativeFragment() != null) {
                a2.a(LoginButton.this.getNativeFragment(), (Collection<String>) LoginButton.this.l.b);
            } else {
                a2.a(LoginButton.this.getActivity(), (Collection<String>) LoginButton.this.l.b);
            }
        }

        public void onClick(View view) {
            LoginButton.this.a(view);
            AccessToken c = AccessToken.c();
            if (AccessToken.m()) {
                a(LoginButton.this.getContext());
            } else {
                b();
            }
            C1452kk kkVar = new C1452kk(LoginButton.this.getContext());
            Bundle bundle = new Bundle();
            bundle.putInt("logging_in", c != null ? 0 : 1);
            bundle.putInt("access_token_expired", AccessToken.m() ? 1 : 0);
            kkVar.b(LoginButton.this.m, bundle);
        }

        /* access modifiers changed from: protected */
        public D a() {
            D a2 = D.a();
            a2.a(LoginButton.this.getDefaultAudience());
            a2.a(LoginButton.this.getLoginBehavior());
            a2.b(LoginButton.this.getAuthType());
            return a2;
        }
    }

    public enum c {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        
        public static c d;
        private String f;
        private int g;

        static {
            c cVar;
            d = cVar;
        }

        private c(String str, int i) {
            this.f = str;
            this.g = i;
        }

        public static c a(int i) {
            c[] values;
            for (c cVar : values()) {
                if (cVar.a() == i) {
                    return cVar;
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

    public LoginButton(Context context) {
        super(context, null, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    public String getAuthType() {
        return this.l.a();
    }

    public C0569b getDefaultAudience() {
        return this.l.b();
    }

    /* access modifiers changed from: protected */
    public int getDefaultRequestCode() {
        return com.facebook.internal.C0551l.b.Login.a();
    }

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return K.com_facebook_loginview_default_style;
    }

    public s getLoginBehavior() {
        return this.l.c();
    }

    /* access modifiers changed from: 0000 */
    public D getLoginManager() {
        if (this.t == null) {
            this.t = D.a();
        }
        return this.t;
    }

    /* access modifiers changed from: protected */
    public b getNewLoginClickListener() {
        return new b();
    }

    /* access modifiers changed from: 0000 */
    public List<String> getPermissions() {
        return this.l.d();
    }

    public long getToolTipDisplayTime() {
        return this.q;
    }

    public c getToolTipMode() {
        return this.p;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0565j jVar = this.s;
        if (jVar != null && !jVar.b()) {
            this.s.c();
            c();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0565j jVar = this.s;
        if (jVar != null) {
            jVar.d();
        }
        a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.n && !isInEditMode()) {
            this.n = true;
            b();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        c();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        FontMetrics fontMetrics = getPaint().getFontMetrics();
        int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil((double) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom)))) + getCompoundPaddingBottom();
        Resources resources = getResources();
        String str = this.j;
        if (str == null) {
            str = resources.getString(J.com_facebook_loginview_log_in_button_continue);
            int c2 = c(str);
            if (Button.resolveSize(c2, i2) < c2) {
                str = resources.getString(J.com_facebook_loginview_log_in_button);
            }
        }
        int c3 = c(str);
        String str2 = this.k;
        if (str2 == null) {
            str2 = resources.getString(J.com_facebook_loginview_log_out_button);
        }
        setMeasuredDimension(Button.resolveSize(Math.max(c3, c(str2)), i2), compoundPaddingTop);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 != 0) {
            a();
        }
    }

    public void setAuthType(String str) {
        this.l.a(str);
    }

    public void setDefaultAudience(C0569b bVar) {
        this.l.a(bVar);
    }

    public void setLoginBehavior(s sVar) {
        this.l.a(sVar);
    }

    /* access modifiers changed from: 0000 */
    public void setLoginManager(D d) {
        this.t = d;
    }

    public void setLoginText(String str) {
        this.j = str;
        c();
    }

    public void setLogoutText(String str) {
        this.k = str;
        c();
    }

    public void setPermissions(List<String> list) {
        this.l.a(list);
    }

    /* access modifiers changed from: 0000 */
    public void setProperties(a aVar) {
        this.l = aVar;
    }

    public void setPublishPermissions(List<String> list) {
        this.l.a(list);
    }

    public void setReadPermissions(List<String> list) {
        this.l.a(list);
    }

    public void setToolTipDisplayTime(long j2) {
        this.q = j2;
    }

    public void setToolTipMode(c cVar) {
        this.p = cVar;
    }

    public void setToolTipStyle(com.facebook.login.widget.k.b bVar) {
        this.o = bVar;
    }

    private void b(String str) {
        this.r = new k(str, this);
        this.r.a(this.o);
        this.r.a(this.q);
        this.r.b();
    }

    private int c(String str) {
        return getCompoundPaddingLeft() + getCompoundDrawablePadding() + a(str) + getCompoundPaddingRight();
    }

    private void f(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.p = c.d;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, L.com_facebook_login_view, i2, i3);
        try {
            this.i = obtainStyledAttributes.getBoolean(L.com_facebook_login_view_com_facebook_confirm_logout, true);
            this.j = obtainStyledAttributes.getString(L.com_facebook_login_view_com_facebook_login_text);
            this.k = obtainStyledAttributes.getString(L.com_facebook_login_view_com_facebook_logout_text);
            this.p = c.a(obtainStyledAttributes.getInt(L.com_facebook_login_view_com_facebook_tooltip_mode, c.d.a()));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setPermissions(String... strArr) {
        this.l.a(Arrays.asList(strArr));
    }

    public void setPublishPermissions(String... strArr) {
        this.l.a(Arrays.asList(strArr));
    }

    public void setReadPermissions(String... strArr) {
        this.l.a(Arrays.asList(strArr));
    }

    public void a() {
        k kVar = this.r;
        if (kVar != null) {
            kVar.a();
            this.r = null;
        }
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    private void b() {
        int i2 = e.a[this.p.ordinal()];
        if (i2 == 1) {
            B.m().execute(new c(this, ia.c(getContext())));
        } else if (i2 == 2) {
            b(getResources().getString(J.com_facebook_tooltip_default));
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        Resources resources = getResources();
        if (isInEditMode() || !AccessToken.m()) {
            String str = this.j;
            if (str != null) {
                setText(str);
                return;
            }
            String string = resources.getString(J.com_facebook_loginview_log_in_button_continue);
            int width = getWidth();
            if (width != 0 && c(string) > width) {
                string = resources.getString(J.com_facebook_loginview_log_in_button);
            }
            setText(string);
            return;
        }
        String str2 = this.k;
        if (str2 == null) {
            str2 = resources.getString(J.com_facebook_loginview_log_out_button);
        }
        setText(str2);
    }

    /* access modifiers changed from: private */
    public void a(A a2) {
        if (a2 != null && a2.h() && getVisibility() == 0) {
            b(a2.g());
        }
    }

    /* access modifiers changed from: protected */
    public void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        super.a(context, attributeSet, i2, i3);
        setInternalOnClickListener(getNewLoginClickListener());
        f(context, attributeSet, i2, i3);
        if (isInEditMode()) {
            setBackgroundColor(getResources().getColor(com.facebook.common.a.com_facebook_blue));
            this.j = "Continue with Facebook";
        } else {
            this.s = new d(this);
        }
        c();
        setCompoundDrawablesWithIntrinsicBounds(C1437k.b(getContext(), G.com_facebook_button_login_logo), null, null, null);
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }
}
