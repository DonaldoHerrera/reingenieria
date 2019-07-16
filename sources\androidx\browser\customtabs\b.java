package androidx.browser.customtabs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.f;
import java.util.ArrayList;

/* compiled from: CustomTabsIntent */
public final class b {
    public final Intent a;
    public final Bundle b;

    /* compiled from: CustomTabsIntent */
    public static final class a {
        private final Intent a;
        private ArrayList<Bundle> b;
        private Bundle c;
        private ArrayList<Bundle> d;
        private boolean e;

        public a() {
            this(null);
        }

        public a a(int i) {
            this.a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i);
            return this;
        }

        public a(e eVar) {
            this.a = new Intent("android.intent.action.VIEW");
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = true;
            if (eVar == null) {
                Bundle bundle = new Bundle();
                if (eVar == null) {
                    f.a(bundle, "android.support.customtabs.extra.SESSION", null);
                    this.a.putExtras(bundle);
                    return;
                }
                eVar.a();
                throw null;
            }
            Intent intent = this.a;
            eVar.b();
            throw null;
        }

        public b a() {
            ArrayList<Bundle> arrayList = this.b;
            if (arrayList != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.d;
            if (arrayList2 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.e);
            return new b(this.a, this.c);
        }
    }

    b(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.a.setData(uri);
        androidx.core.content.a.a(context, this.a, this.b);
    }
}
