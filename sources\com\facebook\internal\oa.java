package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.B;
import com.facebook.C0588s;
import com.facebook.C0594t;
import com.facebook.C0596v;
import com.facebook.D;
import com.facebook.FacebookRequestError;
import com.facebook.common.f;
import com.facebook.common.g;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;

/* compiled from: WebDialog */
public class oa extends Dialog {
    private static final int a = g.com_facebook_activity_theme;
    private static volatile int b;
    /* access modifiers changed from: private */
    public String c;
    /* access modifiers changed from: private */
    public String d;
    private c e;
    /* access modifiers changed from: private */
    public WebView f;
    /* access modifiers changed from: private */
    public ProgressDialog g;
    /* access modifiers changed from: private */
    public ImageView h;
    /* access modifiers changed from: private */
    public FrameLayout i;
    private d j;
    private boolean k;
    /* access modifiers changed from: private */
    public boolean l;
    /* access modifiers changed from: private */
    public boolean m;
    private LayoutParams n;

    /* compiled from: WebDialog */
    public static class a {
        private Context a;
        private String b;
        private String c;
        private int d;
        private c e;
        private Bundle f;
        private AccessToken g;

        public a(Context context, String str, Bundle bundle) {
            this.g = AccessToken.c();
            if (!AccessToken.m()) {
                String c2 = ia.c(context);
                if (c2 != null) {
                    this.b = c2;
                } else {
                    throw new C0594t("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            a(context, str, bundle);
        }

        public a a(c cVar) {
            this.e = cVar;
            return this;
        }

        public String b() {
            return this.b;
        }

        public Context c() {
            return this.a;
        }

        public c d() {
            return this.e;
        }

        public Bundle e() {
            return this.f;
        }

        public int f() {
            return this.d;
        }

        public oa a() {
            AccessToken accessToken = this.g;
            String str = "app_id";
            if (accessToken != null) {
                this.f.putString(str, accessToken.b());
                this.f.putString("access_token", this.g.k());
            } else {
                this.f.putString(str, this.b);
            }
            return oa.a(this.a, this.c, this.f, this.d, this.e);
        }

        public a(Context context, String str, String str2, Bundle bundle) {
            if (str == null) {
                str = ia.c(context);
            }
            ja.a(str, "applicationId");
            this.b = str;
            a(context, str2, bundle);
        }

        private void a(Context context, String str, Bundle bundle) {
            this.a = context;
            this.c = str;
            if (bundle != null) {
                this.f = bundle;
            } else {
                this.f = new Bundle();
            }
        }
    }

    /* compiled from: WebDialog */
    private class b extends WebViewClient {
        private b() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!oa.this.l) {
                oa.this.g.dismiss();
            }
            oa.this.i.setBackgroundColor(0);
            oa.this.f.setVisibility(0);
            oa.this.h.setVisibility(0);
            oa.this.m = true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            StringBuilder sb = new StringBuilder();
            sb.append("Webview loading URL: ");
            sb.append(str);
            ia.b("FacebookSDK.WebDialog", sb.toString());
            super.onPageStarted(webView, str, bitmap);
            if (!oa.this.l) {
                oa.this.g.show();
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            oa.this.a((Throwable) new C0588s(str, i, str2));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            oa.this.a((Throwable) new C0588s(null, -11, null));
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            int i;
            StringBuilder sb = new StringBuilder();
            sb.append("Redirect URL: ");
            sb.append(str);
            ia.b("FacebookSDK.WebDialog", sb.toString());
            if (str.startsWith(oa.this.d)) {
                Bundle a2 = oa.this.a(str);
                String string = a2.getString("error");
                if (string == null) {
                    string = a2.getString("error_type");
                }
                String string2 = a2.getString("error_msg");
                if (string2 == null) {
                    string2 = a2.getString("error_message");
                }
                if (string2 == null) {
                    string2 = a2.getString("error_description");
                }
                String string3 = a2.getString("error_code");
                if (!ia.b(string3)) {
                    try {
                        i = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                    }
                    if (!ia.b(string) && ia.b(string2) && i == -1) {
                        oa.this.a(a2);
                    } else if (string == null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) {
                        oa.this.cancel();
                    } else if (i != 4201) {
                        oa.this.cancel();
                    } else {
                        oa.this.a((Throwable) new D(new FacebookRequestError(i, string, string2), string2));
                    }
                    return true;
                }
                i = -1;
                if (!ia.b(string)) {
                }
                if (string == null) {
                }
                if (i != 4201) {
                }
                return true;
            } else if (str.startsWith("fbconnect://cancel")) {
                oa.this.cancel();
                return true;
            } else if (str.contains("touch")) {
                return false;
            } else {
                try {
                    oa.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                } catch (ActivityNotFoundException unused2) {
                    return false;
                }
            }
        }

        /* synthetic */ b(oa oaVar, ka kaVar) {
            this();
        }
    }

    /* compiled from: WebDialog */
    public interface c {
        void a(Bundle bundle, C0594t tVar);
    }

    /* compiled from: WebDialog */
    private class d extends AsyncTask<Void, Void, String[]> {
        private String a;
        private Bundle b;
        /* access modifiers changed from: private */
        public Exception[] c;

        d(String str, Bundle bundle) {
            this.a = str;
            this.b = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String[] doInBackground(Void... voidArr) {
            String[] stringArray = this.b.getStringArray("media");
            String[] strArr = new String[stringArray.length];
            this.c = new Exception[stringArray.length];
            CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            AccessToken c2 = AccessToken.c();
            int i = 0;
            while (i < stringArray.length) {
                try {
                    if (isCancelled()) {
                        Iterator it = concurrentLinkedQueue.iterator();
                        while (it.hasNext()) {
                            ((AsyncTask) it.next()).cancel(true);
                        }
                        return null;
                    }
                    Uri parse = Uri.parse(stringArray[i]);
                    if (ia.d(parse)) {
                        strArr[i] = parse.toString();
                        countDownLatch.countDown();
                    } else {
                        concurrentLinkedQueue.add(com.facebook.share.internal.D.a(c2, parse, (com.facebook.GraphRequest.b) new pa(this, strArr, i, countDownLatch)).c());
                    }
                    i++;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((AsyncTask) it2.next()).cancel(true);
                    }
                    return null;
                }
            }
            countDownLatch.await();
            return strArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String[] strArr) {
            Exception[] excArr;
            oa.this.g.dismiss();
            for (Exception exc : this.c) {
                if (exc != null) {
                    oa.this.a((Throwable) exc);
                    return;
                }
            }
            String str = "Failed to stage photos for web dialog";
            if (strArr == null) {
                oa.this.a((Throwable) new C0594t(str));
                return;
            }
            List asList = Arrays.asList(strArr);
            if (asList.contains(null)) {
                oa.this.a((Throwable) new C0594t(str));
                return;
            }
            ia.a(this.b, "media", (Object) new JSONArray(asList));
            String b2 = da.b();
            StringBuilder sb = new StringBuilder();
            sb.append(B.o());
            sb.append("/");
            sb.append("dialog/");
            sb.append(this.a);
            oa.this.c = ia.a(b2, sb.toString(), this.b).toString();
            oa.this.b((oa.this.h.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
    }

    protected oa(Context context, String str) {
        this(context, str, a());
    }

    private int a(int i2, float f2, int i3, int i4) {
        int i5 = (int) (((float) i2) / f2);
        double d2 = 0.5d;
        if (i5 <= i3) {
            d2 = 1.0d;
        } else if (i5 < i4) {
            d2 = 0.5d + ((((double) (i4 - i5)) / ((double) (i4 - i3))) * 0.5d);
        }
        return (int) (((double) i2) * d2);
    }

    public void cancel() {
        if (this.e != null && !this.k) {
            a((Throwable) new C0596v());
        }
    }

    public void dismiss() {
        WebView webView = this.f;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.l) {
            ProgressDialog progressDialog = this.g;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.g.dismiss();
            }
        }
        super.dismiss();
    }

    public void onAttachedToWindow() {
        this.l = false;
        if (ia.f(getContext())) {
            LayoutParams layoutParams = this.n;
            if (layoutParams != null && layoutParams.token == null) {
                layoutParams.token = getOwnerActivity().getWindow().getAttributes().token;
                StringBuilder sb = new StringBuilder();
                sb.append("Set token on onAttachedToWindow(): ");
                sb.append(this.n.token);
                ia.b("FacebookSDK.WebDialog", sb.toString());
            }
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = new ProgressDialog(getContext());
        this.g.requestWindowFeature(1);
        this.g.setMessage(getContext().getString(f.com_facebook_loading));
        this.g.setCanceledOnTouchOutside(false);
        this.g.setOnCancelListener(new ka(this));
        requestWindowFeature(1);
        this.i = new FrameLayout(getContext());
        e();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        f();
        if (this.c != null) {
            b((this.h.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.i.addView(this.h, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.i);
    }

    public void onDetachedFromWindow() {
        this.l = true;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            cancel();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        d dVar = this.j;
        if (dVar == null || dVar.getStatus() != Status.PENDING) {
            e();
            return;
        }
        this.j.execute(new Void[0]);
        this.g.show();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        d dVar = this.j;
        if (dVar != null) {
            dVar.cancel(true);
            this.g.dismiss();
        }
        super.onStop();
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.n = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    private oa(Context context, String str, int i2) {
        if (i2 == 0) {
            i2 = a();
        }
        super(context, i2);
        this.d = "fbconnect://success";
        this.k = false;
        this.l = false;
        this.m = false;
        this.c = str;
    }

    private void f() {
        this.h = new ImageView(getContext());
        this.h.setOnClickListener(new la(this));
        this.h.setImageDrawable(getContext().getResources().getDrawable(com.facebook.common.c.com_facebook_close));
        this.h.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    public void b(String str) {
        this.d = str;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        return this.k;
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return this.m;
    }

    public void e() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        if (i2 >= i3) {
            i2 = i3;
        }
        int i4 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        if (i4 < i5) {
            i4 = i5;
        }
        getWindow().setLayout(Math.min(a(i2, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(a(i4, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    /* access modifiers changed from: protected */
    public WebView b() {
        return this.f;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    public void b(int i2) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f = new ma(this, getContext());
        this.f.setVerticalScrollBarEnabled(false);
        this.f.setHorizontalScrollBarEnabled(false);
        this.f.setWebViewClient(new b(this, null));
        this.f.getSettings().setJavaScriptEnabled(true);
        this.f.loadUrl(this.c);
        this.f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f.setVisibility(4);
        this.f.getSettings().setSavePassword(false);
        this.f.getSettings().setSaveFormData(false);
        this.f.setFocusable(true);
        this.f.setFocusableInTouchMode(true);
        this.f.setOnTouchListener(new na(this));
        linearLayout.setPadding(i2, i2, i2, i2);
        linearLayout.addView(this.f);
        linearLayout.setBackgroundColor(-872415232);
        this.i.addView(linearLayout);
    }

    protected static void a(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null || b != 0)) {
                    a(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (NameNotFoundException unused) {
            }
        }
    }

    private oa(Context context, String str, Bundle bundle, int i2, c cVar) {
        if (i2 == 0) {
            i2 = a();
        }
        super(context, i2);
        String str2 = "fbconnect://success";
        this.d = str2;
        this.k = false;
        this.l = false;
        this.m = false;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (ia.e(context)) {
            str2 = "fbconnect://chrome_os_success";
        }
        this.d = str2;
        bundle.putString("redirect_uri", this.d);
        bundle.putString("display", "touch");
        bundle.putString("client_id", B.f());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{B.q()}));
        this.e = cVar;
        if (!str.equals("share") || !bundle.containsKey("media")) {
            String b2 = da.b();
            StringBuilder sb = new StringBuilder();
            sb.append(B.o());
            sb.append("/");
            sb.append("dialog/");
            sb.append(str);
            this.c = ia.a(b2, sb.toString(), bundle).toString();
            return;
        }
        this.j = new d(str, bundle);
    }

    public static oa a(Context context, String str, Bundle bundle, int i2, c cVar) {
        a(context);
        oa oaVar = new oa(context, str, bundle, i2, cVar);
        return oaVar;
    }

    public static int a() {
        ja.c();
        return b;
    }

    public static void a(int i2) {
        if (i2 == 0) {
            i2 = a;
        }
        b = i2;
    }

    public void a(c cVar) {
        this.e = cVar;
    }

    /* access modifiers changed from: protected */
    public Bundle a(String str) {
        Uri parse = Uri.parse(str);
        Bundle d2 = ia.d(parse.getQuery());
        d2.putAll(ia.d(parse.getFragment()));
        return d2;
    }

    /* access modifiers changed from: protected */
    public void a(Bundle bundle) {
        c cVar = this.e;
        if (cVar != null && !this.k) {
            this.k = true;
            cVar.a(bundle, null);
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void a(Throwable th) {
        C0594t tVar;
        if (this.e != null && !this.k) {
            this.k = true;
            if (th instanceof C0594t) {
                tVar = (C0594t) th;
            } else {
                tVar = new C0594t(th);
            }
            this.e.a(null, tVar);
            dismiss();
        }
    }
}
