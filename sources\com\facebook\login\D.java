package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.B;
import com.facebook.C0566k;
import com.facebook.C0584n;
import com.facebook.C0587q;
import com.facebook.C0594t;
import com.facebook.FacebookActivity;
import com.facebook.Profile;
import com.facebook.internal.C0551l;
import com.facebook.internal.L;
import com.facebook.internal.ja;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import com.soundcloud.flippernative.BuildConfig;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: LoginManager */
public class D {
    private static final Set<String> a = c();
    private static volatile D b;
    private s c = s.NATIVE_WITH_FALLBACK;
    private C0569b d = C0569b.FRIENDS;
    private final SharedPreferences e;
    private String f = "rerequest";

    /* compiled from: LoginManager */
    private static class a implements M {
        private final Activity a;

        a(Activity activity) {
            ja.a((Object) activity, "activity");
            this.a = activity;
        }

        public Activity a() {
            return this.a;
        }

        public void startActivityForResult(Intent intent, int i) {
            this.a.startActivityForResult(intent, i);
        }
    }

    /* compiled from: LoginManager */
    private static class b implements M {
        private final L a;

        b(L l) {
            ja.a((Object) l, "fragment");
            this.a = l;
        }

        public Activity a() {
            return this.a.a();
        }

        public void startActivityForResult(Intent intent, int i) {
            this.a.a(intent, i);
        }
    }

    /* compiled from: LoginManager */
    private static class c {
        private static z a;

        /* access modifiers changed from: private */
        public static synchronized z b(Context context) {
            synchronized (c.class) {
                if (context == null) {
                    context = B.e();
                }
                if (context == null) {
                    return null;
                }
                if (a == null) {
                    a = new z(context, B.f());
                }
                z zVar = a;
                return zVar;
            }
        }
    }

    D() {
        ja.c();
        this.e = B.e().getSharedPreferences("com.facebook.loginManager", 0);
    }

    public static D a() {
        if (b == null) {
            synchronized (D.class) {
                if (b == null) {
                    b = new D();
                }
            }
        }
        return b;
    }

    private static Set<String> c() {
        return Collections.unmodifiableSet(new B());
    }

    public D b(String str) {
        this.f = str;
        return this;
    }

    public void b() {
        AccessToken.b(null);
        Profile.a(null);
        a(false);
    }

    public void b(Activity activity, Collection<String> collection) {
        b(collection);
        a(activity, collection);
    }

    private void b(Collection<String> collection) {
        if (collection != null) {
            for (String str : collection) {
                if (a(str)) {
                    throw new C0594t(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[]{str}));
                }
            }
        }
    }

    public void a(C0566k kVar, C0587q<E> qVar) {
        if (kVar instanceof C0551l) {
            ((C0551l) kVar).a(com.facebook.internal.C0551l.b.Login.a(), new A(this, qVar));
            return;
        }
        throw new C0594t("Unexpected CallbackManager, please use the provided Factory.");
    }

    private boolean b(M m, Request request) {
        Intent a2 = a(request);
        if (!a(a2)) {
            return false;
        }
        try {
            m.startActivityForResult(a2, LoginClient.h());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(int i, Intent intent) {
        return a(i, intent, null);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(int i, Intent intent, C0587q<E> qVar) {
        Map map;
        a aVar;
        boolean z;
        AccessToken accessToken;
        Request request;
        Request request2;
        Map map2;
        AccessToken accessToken2;
        int i2 = i;
        Intent intent2 = intent;
        a aVar2 = a.ERROR;
        C0594t tVar = null;
        boolean z2 = false;
        if (intent2 != null) {
            Result result = (Result) intent2.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                Request request3 = result.e;
                a aVar3 = result.a;
                if (i2 == -1) {
                    if (aVar3 == a.SUCCESS) {
                        accessToken2 = result.b;
                    } else {
                        tVar = new C0584n(result.c);
                        accessToken2 = null;
                    }
                } else if (i2 == 0) {
                    accessToken2 = null;
                    z2 = true;
                } else {
                    accessToken2 = null;
                }
                map2 = result.f;
                a aVar4 = aVar3;
                request2 = request3;
                aVar2 = aVar4;
            } else {
                accessToken2 = null;
                map2 = null;
                request2 = null;
            }
            map = map2;
            aVar = aVar2;
            z = z2;
            Request request4 = request2;
            accessToken = accessToken2;
            request = request4;
        } else if (i2 == 0) {
            aVar = a.CANCEL;
            request = null;
            accessToken = null;
            map = null;
            z = true;
        } else {
            aVar = aVar2;
            request = null;
            accessToken = null;
            map = null;
            z = false;
        }
        if (tVar == null && accessToken == null && !z) {
            tVar = new C0594t("Unexpected call to LoginManager.onActivityResult");
        }
        a(null, aVar, map, tVar, true, request);
        a(accessToken, request, tVar, z, qVar);
        return true;
    }

    public D a(s sVar) {
        this.c = sVar;
        return this;
    }

    public D a(C0569b bVar) {
        this.d = bVar;
        return this;
    }

    public void a(Fragment fragment, Collection<String> collection) {
        a(new L(fragment), collection);
    }

    public void a(android.app.Fragment fragment, Collection<String> collection) {
        a(new L(fragment), collection);
    }

    public void a(L l, Collection<String> collection) {
        a((M) new b(l), a(collection));
    }

    public void a(Activity activity, Collection<String> collection) {
        a((M) new a(activity), a(collection));
    }

    static boolean a(String str) {
        return str != null && (str.startsWith("publish") || str.startsWith("manage") || a.contains(str));
    }

    /* access modifiers changed from: protected */
    public Request a(Collection<String> collection) {
        Request request = new Request(this.c, Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet()), this.d, this.f, B.f(), UUID.randomUUID().toString());
        request.a(AccessToken.m());
        return request;
    }

    private void a(M m, Request request) throws C0594t {
        a((Context) m.a(), request);
        C0551l.b(com.facebook.internal.C0551l.b.Login.a(), new C(this));
        if (!b(m, request)) {
            C0594t tVar = new C0594t("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            a(m.a(), a.ERROR, null, tVar, false, request);
            throw tVar;
        }
    }

    private void a(Context context, Request request) {
        z a2 = c.b(context);
        if (a2 != null && request != null) {
            a2.a(request);
        }
    }

    private void a(Context context, a aVar, Map<String, String> map, Exception exc, boolean z, Request request) {
        z a2 = c.b(context);
        if (a2 != null) {
            if (request == null) {
                a2.c("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("try_login_activity", z ? "1" : BuildConfig.VERSION_NAME);
                a2.a(request.b(), hashMap, aVar, map, exc);
            }
        }
    }

    private boolean a(Intent intent) {
        if (B.e().getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Intent a(Request request) {
        Intent intent = new Intent();
        intent.setClass(B.e(), FacebookActivity.class);
        intent.setAction(request.g().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    static E a(Request request, AccessToken accessToken) {
        Set h = request.h();
        HashSet hashSet = new HashSet(accessToken.i());
        if (request.j()) {
            hashSet.retainAll(h);
        }
        HashSet hashSet2 = new HashSet(h);
        hashSet2.removeAll(hashSet);
        return new E(accessToken, hashSet, hashSet2);
    }

    private void a(AccessToken accessToken, Request request, C0594t tVar, boolean z, C0587q<E> qVar) {
        if (accessToken != null) {
            AccessToken.b(accessToken);
            Profile.b();
        }
        if (qVar != null) {
            E a2 = accessToken != null ? a(request, accessToken) : null;
            if (z || (a2 != null && a2.c().size() == 0)) {
                qVar.onCancel();
            } else if (tVar != null) {
                qVar.a(tVar);
            } else if (accessToken != null) {
                a(true);
                qVar.onSuccess(a2);
            }
        }
    }

    private void a(boolean z) {
        Editor edit = this.e.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }
}
