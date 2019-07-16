package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;

/* renamed from: v reason: default package and case insensitive filesystem */
/* compiled from: ContextThemeWrapper */
public class C1772v extends ContextWrapper {
    private int a;
    private Theme b;
    private LayoutInflater c;
    private Configuration d;
    private Resources e;

    public C1772v() {
        super(null);
    }

    private Resources b() {
        if (this.e == null) {
            Configuration configuration = this.d;
            if (configuration == null) {
                this.e = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                this.e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.e;
    }

    private void c() {
        boolean z = this.b == null;
        if (z) {
            this.b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        a(this.b, this.a, z);
    }

    public int a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    public Theme getTheme() {
        Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = C1376i.Theme_AppCompat_Light;
        }
        c();
        return this.b;
    }

    public void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            c();
        }
    }

    public C1772v(Context context, int i) {
        super(context);
        this.a = i;
    }

    /* access modifiers changed from: protected */
    public void a(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public C1772v(Context context, Theme theme) {
        super(context);
        this.b = theme;
    }
}
