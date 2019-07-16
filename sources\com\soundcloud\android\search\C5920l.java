package com.soundcloud.android.search;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.soundcloud.android.C2929h;
import com.soundcloud.android.deeplinks.f;
import com.soundcloud.android.deeplinks.k;

/* renamed from: com.soundcloud.android.search.l reason: case insensitive filesystem */
/* compiled from: SearchIntentResolver */
class C5920l {
    private final a a;
    private final C4655rja b;
    private final f c;
    private final Ja d;

    /* renamed from: com.soundcloud.android.search.l$a */
    /* compiled from: SearchIntentResolver */
    interface a {
        void a(String str);
    }

    C5920l(a aVar, C4655rja rja, f fVar, Ja ja) {
        this.a = aVar;
        this.b = rja;
        this.c = fVar;
        this.d = ja;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if ("soundcloud".equals(r3.getScheme()) != false) goto L_0x001e;
     */
    private boolean b(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            if (!data.getHost().contains("soundcloud.com")) {
            }
            if (C5206PKa.b(data.getQueryParameter("q"))) {
                return true;
            }
        }
        return false;
    }

    private boolean c(Intent intent) {
        return "android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null && !intent.getData().getPath().equals("/search");
    }

    /* access modifiers changed from: 0000 */
    public void a(Activity activity, Intent intent) throws k {
        if (a(intent)) {
            a(intent.getStringExtra("query"));
        } else if (b(intent)) {
            a(intent.getData().getQueryParameter("q"));
        } else if (c(intent)) {
            b(activity, intent);
        } else {
            this.d.a();
        }
    }

    private void b(Activity activity, Intent intent) throws k {
        com.soundcloud.android.storage.provider.a a2 = com.soundcloud.android.storage.provider.a.a(intent.getData());
        if (a2 == com.soundcloud.android.storage.provider.a.SEARCH_ITEM) {
            a(Uri.decode(intent.getData().getLastPathSegment()));
        } else if (a2 != com.soundcloud.android.storage.provider.a.UNKNOWN) {
            this.b.a(C4621nja.a(intent.getDataString(), this.c.a(intent, activity.getResources())));
        }
    }

    private boolean a(Intent intent) {
        if (!"android.intent.action.SEARCH".equals(intent.getAction())) {
            if (!"android.media.action.MEDIA_PLAY_FROM_SEARCH".equals(intent.getAction()) && !C2929h.h.equals(intent.getAction())) {
                return false;
            }
        }
        return true;
    }

    private void a(String str) {
        this.a.a(str.trim());
    }
}
