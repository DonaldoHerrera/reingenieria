package com.soundcloud.android.deeplinks;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.soundcloud.android.ia.p;

/* compiled from: ReferrerResolver */
public class f {
    f() {
    }

    private String b(Intent intent, String str) {
        Uri data = intent.getData();
        if (data == null || data.isOpaque()) {
            return null;
        }
        return data.getQueryParameter(str);
    }

    private boolean c(Intent intent, Resources resources) {
        boolean z = true;
        if (b(intent, resources)) {
            return true;
        }
        String str = "app_id";
        if (!intent.hasExtra(str)) {
            return false;
        }
        if (Long.parseLong(b(resources), 10) != intent.getLongExtra(str, -1)) {
            z = false;
        }
        return z;
    }

    private boolean d(Intent intent) {
        return intent.hasExtra("com.android.browser.headers");
    }

    private boolean e(Intent intent) {
        Uri b = b(intent);
        if ("android-app".equals(b.getScheme())) {
            if ("com.google.appcrawler".equals(b.getHost())) {
                return true;
            }
        }
        return false;
    }

    private boolean f(Intent intent) {
        String str = "com.android.browser.application_id";
        if (intent.hasExtra(str)) {
            String stringExtra = intent.getStringExtra(str);
            if (stringExtra != null && "com.google.android.apps.plus".equals(stringExtra)) {
                return true;
            }
        }
        return false;
    }

    private boolean g(Intent intent) {
        ComponentName a = a(intent);
        if (a != null) {
            if ("com.twitter.android".equals(a.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    private String h(Intent intent) {
        return C3235rM.b(c(intent));
    }

    private C3235rM i(Intent intent) {
        String b = b(intent, "origin");
        if (b != null) {
            return C3235rM.a(b);
        }
        return C3235rM.OTHER;
    }

    public String a(Intent intent, Resources resources) throws k {
        String str = "ref";
        try {
            if (a(intent, str)) {
                return b(intent, str);
            }
            if (C3235rM.c(intent)) {
                return C3235rM.b(intent).a();
            }
            if (a(intent, "origin")) {
                return i(intent).a();
            }
            if (c(intent, resources)) {
                return C3235rM.FACEBOOK.a();
            }
            if (g(intent)) {
                return C3235rM.TWITTER.a();
            }
            if (f(intent)) {
                return C3235rM.GOOGLE_PLUS.a();
            }
            if (e(intent)) {
                return C3235rM.GOOGLE_CRAWLER.a();
            }
            if (d(intent)) {
                return h(intent);
            }
            return C3235rM.OTHER.a();
        } catch (ClassCastException e) {
            SDb.a(e, "Referrer could not be extracted from intent: %s", intent);
            return C3235rM.OTHER.a();
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Referrer could not be extracted from intent: ");
            sb.append(intent);
            throw new k(sb.toString(), e2);
        }
    }

    private boolean b(Intent intent, Resources resources) {
        return a(resources).equals(intent.getAction());
    }

    private String b(Resources resources) {
        return resources.getString(p.production_facebook_app_id);
    }

    private String c(Intent intent) {
        Object obj = intent.getExtras().get("com.android.browser.headers");
        if (obj instanceof Bundle) {
            return ((Bundle) obj).getString("Referer");
        }
        return null;
    }

    private Uri b(Intent intent) {
        String str = "android.intent.extra.REFERRER";
        if (intent.hasExtra(str)) {
            return (Uri) intent.getParcelableExtra(str);
        }
        String str2 = "android.intent.extra.REFERRER_NAME";
        if (intent.hasExtra(str2)) {
            return Uri.parse(intent.getStringExtra(str2));
        }
        return Uri.EMPTY;
    }

    private boolean a(Intent intent, String str) {
        return C5206PKa.b(b(intent, str));
    }

    private ComponentName a(Intent intent) {
        String str = "intent.extra.ANCESTOR";
        if (intent.hasExtra(str)) {
            Object obj = intent.getExtras().get(str);
            if (obj instanceof Intent) {
                return ((Intent) obj).getComponent();
            }
        }
        return null;
    }

    private String a(Resources resources) {
        StringBuilder sb = new StringBuilder();
        sb.append("com.facebook.application.");
        sb.append(b(resources));
        return sb.toString();
    }
}
