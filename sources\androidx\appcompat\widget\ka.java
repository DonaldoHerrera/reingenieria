package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper */
public class ka extends ContextWrapper {
    private static final Object a = new Object();
    private static ArrayList<WeakReference<ka>> b;
    private final Resources c;
    private final Theme d;

    private ka(Context context) {
        super(context);
        if (Aa.b()) {
            this.c = new Aa(this, context.getResources());
            this.d = this.c.newTheme();
            this.d.setTo(context.getTheme());
            return;
        }
        this.c = new ma(this, context.getResources());
        this.d = null;
    }

    public static Context a(Context context) {
        if (!b(context)) {
            return context;
        }
        synchronized (a) {
            if (b == null) {
                b = new ArrayList<>();
            } else {
                for (int size = b.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        b.remove(size);
                    }
                }
                for (int size2 = b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) b.get(size2);
                    ka kaVar = weakReference2 != null ? (ka) weakReference2.get() : null;
                    if (kaVar != null && kaVar.getBaseContext() == context) {
                        return kaVar;
                    }
                }
            }
            ka kaVar2 = new ka(context);
            b.add(new WeakReference(kaVar2));
            return kaVar2;
        }
    }

    private static boolean b(Context context) {
        if ((context instanceof ka) || (context.getResources() instanceof ma) || (context.getResources() instanceof Aa)) {
            return false;
        }
        if (VERSION.SDK_INT < 21 || Aa.b()) {
            return true;
        }
        return false;
    }

    public AssetManager getAssets() {
        return this.c.getAssets();
    }

    public Resources getResources() {
        return this.c;
    }

    public Theme getTheme() {
        Theme theme = this.d;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Theme theme = this.d;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
