package com.facebook.share.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.B;
import com.facebook.C0565j;
import com.facebook.C0594t;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.L;
import com.facebook.M;
import com.facebook.O;
import com.facebook.internal.C0550k;
import com.facebook.internal.C0551l;
import com.facebook.internal.K;
import com.facebook.internal.W;
import com.facebook.internal.ia;
import com.facebook.internal.ra;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* compiled from: LikeActionController */
public class t {
    /* access modifiers changed from: private */
    public static final String a = "t";
    /* access modifiers changed from: private */
    public static K b;
    /* access modifiers changed from: private */
    public static final ConcurrentHashMap<String, t> c = new ConcurrentHashMap<>();
    private static ra d = new ra(1);
    private static ra e = new ra(1);
    private static Handler f;
    private static String g;
    private static boolean h;
    /* access modifiers changed from: private */
    public static volatile int i;
    private static C0565j j;
    /* access modifiers changed from: private */
    public String k;
    /* access modifiers changed from: private */
    public com.facebook.share.widget.LikeView.e l;
    /* access modifiers changed from: private */
    public boolean m;
    /* access modifiers changed from: private */
    public String n;
    /* access modifiers changed from: private */
    public String o;
    /* access modifiers changed from: private */
    public String p;
    /* access modifiers changed from: private */
    public String q;
    /* access modifiers changed from: private */
    public String r;
    /* access modifiers changed from: private */
    public String s;
    /* access modifiers changed from: private */
    public boolean t;
    /* access modifiers changed from: private */
    public boolean u;
    /* access modifiers changed from: private */
    public boolean v;
    private Bundle w;
    private C1452kk x;

    /* compiled from: LikeActionController */
    private abstract class a implements n {
        private GraphRequest a;
        protected String b;
        protected com.facebook.share.widget.LikeView.e c;
        protected FacebookRequestError d;

        protected a(String str, com.facebook.share.widget.LikeView.e eVar) {
            this.b = str;
            this.c = eVar;
        }

        /* access modifiers changed from: protected */
        public abstract void a(FacebookRequestError facebookRequestError);

        public void a(com.facebook.K k) {
            k.add(this.a);
        }

        /* access modifiers changed from: protected */
        public abstract void a(L l);

        public FacebookRequestError a() {
            return this.d;
        }

        /* access modifiers changed from: protected */
        public void a(GraphRequest graphRequest) {
            this.a = graphRequest;
            graphRequest.a(B.o());
            graphRequest.a((com.facebook.GraphRequest.b) new s(this));
        }
    }

    /* compiled from: LikeActionController */
    private static class b implements Runnable {
        private String a;
        private com.facebook.share.widget.LikeView.e b;
        private c c;

        b(String str, com.facebook.share.widget.LikeView.e eVar, c cVar) {
            this.a = str;
            this.b = eVar;
            this.c = cVar;
        }

        public void run() {
            t.c(this.a, this.b, this.c);
        }
    }

    @Deprecated
    /* compiled from: LikeActionController */
    public interface c {
        void a(t tVar, C0594t tVar2);
    }

    /* compiled from: LikeActionController */
    private class d extends a {
        String f = t.this.n;
        String g = t.this.o;
        String h = t.this.p;
        String i = t.this.q;

        d(String str, com.facebook.share.widget.LikeView.e eVar) {
            super(str, eVar);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
            bundle.putString("locale", Locale.getDefault().toString());
            a(new GraphRequest(AccessToken.c(), str, bundle, M.GET));
        }

        /* access modifiers changed from: protected */
        public void a(L l) {
            JSONObject c = ia.c(l.b(), "engagement");
            if (c != null) {
                this.f = c.optString("count_string_with_like", this.f);
                this.g = c.optString("count_string_without_like", this.g);
                this.h = c.optString("social_sentence_with_like", this.h);
                this.i = c.optString("social_sentence_without_like", this.i);
            }
        }

        /* access modifiers changed from: protected */
        public void a(FacebookRequestError facebookRequestError) {
            W.a(O.REQUESTS, t.a, "Error fetching engagement for object '%s' with type '%s' : %s", this.b, this.c, facebookRequestError);
            t.this.a("get_engagement", facebookRequestError);
        }
    }

    /* compiled from: LikeActionController */
    private class e extends a {
        String f;

        e(String str, com.facebook.share.widget.LikeView.e eVar) {
            super(str, eVar);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "og_object.fields(id)");
            bundle.putString("ids", str);
            a(new GraphRequest(AccessToken.c(), "", bundle, M.GET));
        }

        /* access modifiers changed from: protected */
        public void a(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.c().contains("og_object")) {
                this.d = null;
                return;
            }
            W.a(O.REQUESTS, t.a, "Error getting the FB id for object '%s' with type '%s' : %s", this.b, this.c, facebookRequestError);
        }

        /* access modifiers changed from: protected */
        public void a(L l) {
            JSONObject c = ia.c(l.b(), this.b);
            if (c != null) {
                JSONObject optJSONObject = c.optJSONObject("og_object");
                if (optJSONObject != null) {
                    this.f = optJSONObject.optString("id");
                }
            }
        }
    }

    /* compiled from: LikeActionController */
    private class f extends a implements i {
        private boolean f = t.this.m;
        private String g;
        private final String h;
        private final com.facebook.share.widget.LikeView.e i;

        f(String str, com.facebook.share.widget.LikeView.e eVar) {
            super(str, eVar);
            this.h = str;
            this.i = eVar;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id,application");
            bundle.putString("object", this.h);
            a(new GraphRequest(AccessToken.c(), "me/og.likes", bundle, M.GET));
        }

        /* access modifiers changed from: protected */
        public void a(L l) {
            JSONArray b = ia.b(l.b(), "data");
            if (b != null) {
                for (int i2 = 0; i2 < b.length(); i2++) {
                    JSONObject optJSONObject = b.optJSONObject(i2);
                    if (optJSONObject != null) {
                        this.f = true;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("application");
                        AccessToken c = AccessToken.c();
                        if (optJSONObject2 != null && AccessToken.m()) {
                            String str = "id";
                            if (ia.a(c.b(), optJSONObject2.optString(str))) {
                                this.g = optJSONObject.optString(str);
                            }
                        }
                    }
                }
            }
        }

        public boolean b() {
            return this.f;
        }

        public String c() {
            return this.g;
        }

        /* access modifiers changed from: protected */
        public void a(FacebookRequestError facebookRequestError) {
            W.a(O.REQUESTS, t.a, "Error fetching like status for object '%s' with type '%s' : %s", this.h, this.i, facebookRequestError);
            t.this.a("get_og_object_like", facebookRequestError);
        }
    }

    /* compiled from: LikeActionController */
    private class g extends a {
        String f;
        boolean g;

        g(String str, com.facebook.share.widget.LikeView.e eVar) {
            super(str, eVar);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id");
            bundle.putString("ids", str);
            a(new GraphRequest(AccessToken.c(), "", bundle, M.GET));
        }

        /* access modifiers changed from: protected */
        public void a(L l) {
            JSONObject c = ia.c(l.b(), this.b);
            if (c != null) {
                this.f = c.optString("id");
                this.g = !ia.b(this.f);
            }
        }

        /* access modifiers changed from: protected */
        public void a(FacebookRequestError facebookRequestError) {
            W.a(O.REQUESTS, t.a, "Error getting the FB id for object '%s' with type '%s' : %s", this.b, this.c, facebookRequestError);
        }
    }

    /* compiled from: LikeActionController */
    private class h extends a implements i {
        private boolean f = t.this.m;
        private String g;

        h(String str) {
            super(str, com.facebook.share.widget.LikeView.e.PAGE);
            this.g = str;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id");
            AccessToken c = AccessToken.c();
            StringBuilder sb = new StringBuilder();
            sb.append("me/likes/");
            sb.append(str);
            a(new GraphRequest(c, sb.toString(), bundle, M.GET));
        }

        /* access modifiers changed from: protected */
        public void a(L l) {
            JSONArray b = ia.b(l.b(), "data");
            if (b != null && b.length() > 0) {
                this.f = true;
            }
        }

        public boolean b() {
            return this.f;
        }

        public String c() {
            return null;
        }

        /* access modifiers changed from: protected */
        public void a(FacebookRequestError facebookRequestError) {
            W.a(O.REQUESTS, t.a, "Error fetching like status for page id '%s': %s", this.g, facebookRequestError);
            t.this.a("get_page_like", facebookRequestError);
        }
    }

    /* compiled from: LikeActionController */
    private interface i extends n {
        boolean b();

        String c();
    }

    /* compiled from: LikeActionController */
    private static class j implements Runnable {
        private static ArrayList<String> a = new ArrayList<>();
        private String b;
        private boolean c;

        j(String str, boolean z) {
            this.b = str;
            this.c = z;
        }

        public void run() {
            String str = this.b;
            if (str != null) {
                a.remove(str);
                a.add(0, this.b);
            }
            if (this.c && a.size() >= 128) {
                while (64 < a.size()) {
                    ArrayList<String> arrayList = a;
                    t.c.remove((String) arrayList.remove(arrayList.size() - 1));
                }
            }
        }
    }

    /* compiled from: LikeActionController */
    private class k extends a {
        String f;

        k(String str, com.facebook.share.widget.LikeView.e eVar) {
            super(str, eVar);
            Bundle bundle = new Bundle();
            bundle.putString("object", str);
            a(new GraphRequest(AccessToken.c(), "me/og.likes", bundle, M.POST));
        }

        /* access modifiers changed from: protected */
        public void a(L l) {
            this.f = ia.a(l.b(), "id");
        }

        /* access modifiers changed from: protected */
        public void a(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.b() == 3501) {
                this.d = null;
                return;
            }
            W.a(O.REQUESTS, t.a, "Error liking object '%s' with type '%s' : %s", this.b, this.c, facebookRequestError);
            t.this.a("publish_like", facebookRequestError);
        }
    }

    /* compiled from: LikeActionController */
    private class l extends a {
        private String f;

        l(String str) {
            super(null, null);
            this.f = str;
            a(new GraphRequest(AccessToken.c(), str, null, M.DELETE));
        }

        /* access modifiers changed from: protected */
        public void a(FacebookRequestError facebookRequestError) {
            W.a(O.REQUESTS, t.a, "Error unliking object with unlike token '%s' : %s", this.f, facebookRequestError);
            t.this.a("publish_unlike", facebookRequestError);
        }

        /* access modifiers changed from: protected */
        public void a(L l) {
        }
    }

    /* compiled from: LikeActionController */
    private interface m {
        void onComplete();
    }

    /* compiled from: LikeActionController */
    private interface n {
        FacebookRequestError a();

        void a(com.facebook.K k);
    }

    /* compiled from: LikeActionController */
    private static class o implements Runnable {
        private String a;
        private String b;

        o(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public void run() {
            t.b(this.a, this.b);
        }
    }

    private t(String str, com.facebook.share.widget.LikeView.e eVar) {
        this.k = str;
        this.l = eVar;
    }

    private static void l(t tVar) {
        String m2 = m(tVar);
        String c2 = c(tVar.k);
        if (!ia.b(m2) && !ia.b(c2)) {
            e.a((Runnable) new o(c2, m2));
        }
    }

    private static synchronized void m() {
        synchronized (t.class) {
            if (!h) {
                f = new Handler(Looper.getMainLooper());
                i = B.e().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
                b = new K(a, new com.facebook.internal.K.d());
                p();
                C0551l.b(com.facebook.internal.C0551l.b.Like.a(), new j());
                h = true;
            }
        }
    }

    /* access modifiers changed from: private */
    public void n() {
        if (!AccessToken.m()) {
            o();
        } else {
            a((m) new r(this));
        }
    }

    private void o() {
        z zVar = new z(B.e(), B.f(), this.k);
        if (zVar.b()) {
            zVar.a((com.facebook.internal.ba.a) new C0593e(this));
        }
    }

    private static void p() {
        j = new l();
    }

    @Deprecated
    public boolean i() {
        return false;
    }

    private boolean j() {
        AccessToken c2 = AccessToken.c();
        return !this.t && this.s != null && AccessToken.m() && c2.i() != null && c2.i().contains("publish_actions");
    }

    private void k() {
        this.w = null;
        e((String) null);
    }

    @Deprecated
    public String e() {
        return this.m ? this.n : this.o;
    }

    @Deprecated
    public String f() {
        return this.k;
    }

    @Deprecated
    public String g() {
        return this.m ? this.p : this.q;
    }

    @Deprecated
    public boolean h() {
        return this.m;
    }

    private void e(Bundle bundle) {
        e(this.k);
        this.w = bundle;
        l(this);
    }

    private static t d(String str) {
        String c2 = c(str);
        t tVar = (t) c.get(c2);
        if (tVar != null) {
            d.a((Runnable) new j(c2, false));
        }
        return tVar;
    }

    @Deprecated
    public static void b(String str, com.facebook.share.widget.LikeView.e eVar, c cVar) {
        if (!h) {
            m();
        }
        t d2 = d(str);
        if (d2 != null) {
            a(d2, eVar, cVar);
        } else {
            e.a((Runnable) new b(str, eVar, cVar));
        }
    }

    /* access modifiers changed from: private */
    public static void c(String str, com.facebook.share.widget.LikeView.e eVar, c cVar) {
        t d2 = d(str);
        if (d2 != null) {
            a(d2, eVar, cVar);
            return;
        }
        t a2 = a(str);
        if (a2 == null) {
            a2 = new t(str, eVar);
            l(a2);
        }
        a(str, a2);
        f.post(new i(a2));
        a(cVar, a2, (C0594t) null);
    }

    /* access modifiers changed from: private */
    public C1452kk l() {
        if (this.x == null) {
            this.x = new C1452kk(B.e());
        }
        return this.x;
    }

    private static void e(String str) {
        g = str;
        B.e().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", g).apply();
    }

    /* access modifiers changed from: private */
    public static void d(t tVar, String str) {
        b(tVar, str, (Bundle) null);
    }

    private void d(Bundle bundle) {
        this.v = true;
        com.facebook.K k2 = new com.facebook.K();
        l lVar = new l(this.r);
        lVar.a(k2);
        k2.a((com.facebook.K.a) new p(this, lVar, bundle));
        k2.f();
    }

    /* access modifiers changed from: private */
    public static void b(String str, String str2) {
        OutputStream outputStream = null;
        try {
            outputStream = b.b(str);
            outputStream.write(str2.getBytes());
            if (outputStream == null) {
                return;
            }
        } catch (IOException e2) {
            Log.e(a, "Unable to serialize controller to disk", e2);
            if (outputStream == null) {
                return;
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                ia.a((Closeable) outputStream);
            }
            throw th;
        }
        ia.a((Closeable) outputStream);
    }

    @Deprecated
    public static boolean a(int i2, int i3, Intent intent) {
        if (ia.b(g)) {
            g = B.e().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", null);
        }
        if (ia.b(g)) {
            return false;
        }
        b(g, com.facebook.share.widget.LikeView.e.UNKNOWN, (c) new h(i2, i3, intent));
        return true;
    }

    private static String c(String str) {
        String k2 = AccessToken.m() ? AccessToken.c().k() : null;
        if (k2 != null) {
            k2 = ia.c(k2);
        }
        return String.format(Locale.ROOT, "%s|%s|com.fb.sdk.like|%d", new Object[]{str, ia.a(k2, ""), Integer.valueOf(i)});
    }

    private static String m(t tVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.facebook.share.internal.LikeActionController.version", 3);
            jSONObject.put("object_id", tVar.k);
            jSONObject.put("object_type", tVar.l.a());
            jSONObject.put("like_count_string_with_like", tVar.n);
            jSONObject.put("like_count_string_without_like", tVar.o);
            jSONObject.put("social_sentence_with_like", tVar.p);
            jSONObject.put("social_sentence_without_like", tVar.q);
            jSONObject.put("is_object_liked", tVar.m);
            jSONObject.put("unlike_token", tVar.r);
            if (tVar.w != null) {
                JSONObject a2 = C0550k.a(tVar.w);
                if (a2 != null) {
                    jSONObject.put("facebook_dialog_analytics_bundle", a2);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.e(a, "Unable to serialize controller to JSON", e2);
            return null;
        }
    }

    private static t b(String str) {
        t tVar = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("com.facebook.share.internal.LikeActionController.version", -1) != 3) {
                return null;
            }
            t tVar2 = new t(jSONObject.getString("object_id"), com.facebook.share.widget.LikeView.e.a(jSONObject.optInt("object_type", com.facebook.share.widget.LikeView.e.UNKNOWN.a())));
            tVar2.n = jSONObject.optString("like_count_string_with_like", null);
            tVar2.o = jSONObject.optString("like_count_string_without_like", null);
            tVar2.p = jSONObject.optString("social_sentence_with_like", null);
            tVar2.q = jSONObject.optString("social_sentence_without_like", null);
            tVar2.m = jSONObject.optBoolean("is_object_liked");
            tVar2.r = jSONObject.optString("unlike_token", null);
            JSONObject optJSONObject = jSONObject.optJSONObject("facebook_dialog_analytics_bundle");
            if (optJSONObject != null) {
                tVar2.w = C0550k.a(optJSONObject);
            }
            tVar = tVar2;
            return tVar;
        } catch (JSONException e2) {
            Log.e(a, "Unable to deserialize controller from JSON", e2);
        }
    }

    private static void a(t tVar, com.facebook.share.widget.LikeView.e eVar, c cVar) {
        C0594t tVar2;
        com.facebook.share.widget.LikeView.e a2 = D.a(eVar, tVar.l);
        if (a2 == null) {
            tVar2 = new C0594t("Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\"", tVar.k, tVar.l.toString(), eVar.toString());
            tVar = null;
        } else {
            tVar.l = a2;
            tVar2 = null;
        }
        a(cVar, tVar, tVar2);
    }

    private void c(Bundle bundle) {
        this.v = true;
        a((m) new o(this, bundle));
    }

    private static void a(c cVar, t tVar, C0594t tVar2) {
        if (cVar != null) {
            f.post(new k(cVar, tVar, tVar2));
        }
    }

    private static void a(String str, t tVar) {
        String c2 = c(str);
        d.a((Runnable) new j(c2, true));
        c.put(c2, tVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        com.facebook.internal.ia.a((java.io.Closeable) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r5 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r5 != null) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039  */
    private static t a(String str) {
        InputStream inputStream;
        t tVar = null;
        try {
            inputStream = b.a(c(str));
            if (inputStream != null) {
                try {
                    String a2 = ia.a(inputStream);
                    if (!ia.b(a2)) {
                        tVar = b(a2);
                    }
                } catch (IOException e2) {
                    e = e2;
                    try {
                        Log.e(a, "Unable to deserialize controller from disk", e);
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream != null) {
                            ia.a((Closeable) inputStream);
                        }
                        throw th;
                    }
                }
            }
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
            Log.e(a, "Unable to deserialize controller from disk", e);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            if (inputStream != null) {
            }
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public static void b(t tVar, String str, Bundle bundle) {
        Intent intent = new Intent(str);
        if (tVar != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", tVar.f());
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C1600pd.a(B.e()).a(intent);
    }

    @Deprecated
    public void a(Activity activity, com.facebook.internal.L l2, Bundle bundle) {
        boolean z = true;
        boolean z2 = !this.m;
        if (j()) {
            b(z2);
            if (this.v) {
                l().b("fb_like_control_did_undo_quickly", bundle);
            } else if (!a(z2, bundle)) {
                if (z2) {
                    z = false;
                }
                b(z);
                b(activity, l2, bundle);
            }
        } else {
            b(activity, l2, bundle);
        }
    }

    private void b(boolean z) {
        a(z, this.n, this.o, this.p, this.q, this.r);
    }

    private void b(Activity activity, com.facebook.internal.L l2, Bundle bundle) {
        String str;
        String str2;
        String str3 = "fb_like_control_did_present_dialog";
        if (y.a()) {
            str = str3;
        } else if (y.b()) {
            str = "fb_like_control_did_present_fallback_dialog";
        } else {
            a("present_dialog", bundle);
            ia.b(a, "Cannot show the Like Dialog on this device.");
            d((t) null, "com.facebook.sdk.LikeActionController.UPDATED");
            str = null;
        }
        if (str != null) {
            com.facebook.share.widget.LikeView.e eVar = this.l;
            if (eVar != null) {
                str2 = eVar.toString();
            } else {
                str2 = com.facebook.share.widget.LikeView.e.UNKNOWN.toString();
            }
            com.facebook.share.internal.LikeContent.a aVar = new com.facebook.share.internal.LikeContent.a();
            aVar.a(this.k);
            aVar.b(str2);
            LikeContent a2 = aVar.a();
            if (l2 != null) {
                new y(l2).a(a2);
            } else {
                new y(activity).a(a2);
            }
            e(bundle);
            l().b(str3, bundle);
        }
    }

    private boolean a(boolean z, Bundle bundle) {
        if (j()) {
            if (z) {
                c(bundle);
                return true;
            } else if (!ia.b(this.r)) {
                d(bundle);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        b(z);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action");
        b(this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
    }

    /* access modifiers changed from: private */
    public void a(boolean z, String str, String str2, String str3, String str4, String str5) {
        String a2 = ia.a(str, (String) null);
        String a3 = ia.a(str2, (String) null);
        String a4 = ia.a(str3, (String) null);
        String a5 = ia.a(str4, (String) null);
        String a6 = ia.a(str5, (String) null);
        if (z != this.m || !ia.a(a2, this.n) || !ia.a(a3, this.o) || !ia.a(a4, this.p) || !ia.a(a5, this.q) || !ia.a(a6, this.r)) {
            this.m = z;
            this.n = a2;
            this.o = a3;
            this.p = a4;
            this.q = a5;
            this.r = a6;
            l(this);
            d(this, "com.facebook.sdk.LikeActionController.UPDATED");
        }
    }

    /* access modifiers changed from: private */
    public void b(int i2, int i3, Intent intent) {
        D.a(i2, i3, intent, a(this.w));
        k();
    }

    /* access modifiers changed from: private */
    public void b(Bundle bundle) {
        boolean z = this.m;
        if (z != this.u && !a(z, bundle)) {
            a(!this.m);
        }
    }

    private B a(Bundle bundle) {
        return new m(this, null, bundle);
    }

    private void a(m mVar) {
        if (!ia.b(this.s)) {
            if (mVar != null) {
                mVar.onComplete();
            }
            return;
        }
        e eVar = new e(this.k, this.l);
        g gVar = new g(this.k, this.l);
        com.facebook.K k2 = new com.facebook.K();
        eVar.a(k2);
        gVar.a(k2);
        k2.a((com.facebook.K.a) new f(this, eVar, gVar, mVar));
        k2.f();
    }

    private void a(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("object_id", this.k);
        bundle2.putString("object_type", this.l.toString());
        bundle2.putString("current_action", str);
        l().a("fb_like_control_error", (Double) null, bundle2);
    }

    /* access modifiers changed from: private */
    public void a(String str, FacebookRequestError facebookRequestError) {
        Bundle bundle = new Bundle();
        if (facebookRequestError != null) {
            JSONObject f2 = facebookRequestError.f();
            if (f2 != null) {
                bundle.putString("error", f2.toString());
            }
        }
        a(str, bundle);
    }
}
