package com.krux.androidsdk.aggregator;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class h {
    /* access modifiers changed from: private */
    public static final String a = "h";
    protected static volatile boolean b = false;
    protected final String c = "https://cdn.krxd.net/controltag/config/";
    protected final int d = 3;
    protected Context e = null;
    protected String f = null;
    protected String g = null;
    protected C2424_H h = null;
    protected String i = null;
    protected String j = null;
    protected List k;
    protected List l;
    protected List m;
    protected EventPublisherServiceResultReceiver n = null;
    protected String o = null;
    protected String p = null;
    protected String q = null;
    protected C2992fI r = null;
    protected C2462bI s = null;
    protected boolean t = false;
    protected ReentrantReadWriteLock u = null;
    protected b v;
    protected boolean w = false;
    protected CountDownLatch x = new CountDownLatch(1);
    protected String y = null;

    h() {
    }

    private Intent a(Intent intent) {
        String action = intent.getAction();
        Intent intent2 = new Intent(this.e, EventPublisherService.class);
        intent2.setAction(action);
        intent2.putExtra("receiver_tag", this.n);
        if (intent.getExtras() != null) {
            intent2.putExtras(intent.getExtras());
        }
        return intent2;
    }

    protected static String a(String str) {
        StringBuilder sb;
        String str2;
        String str3 = "";
        try {
            JSONArray a2 = C2443aI.a(new JSONObject(str));
            if (a2 == null) {
                return str3;
            }
            String jSONArray = a2.toString();
            int length = a2.toString().length();
            String substring = length >= 2 ? jSONArray.substring(1, length - 1) : jSONArray;
            try {
                return substring.replace("\"", str3);
            } catch (JSONException e2) {
                Object obj = e2;
                str3 = substring;
                e = obj;
                str2 = a;
                sb = new StringBuilder("Error in formatting Krux segment JSON: ");
                sb.append(e);
                Log.e(str2, sb.toString());
                return str3;
            } catch (Exception e3) {
                Object obj2 = e3;
                str3 = substring;
                e = obj2;
                str2 = a;
                sb = new StringBuilder("Error in formatting segments: ");
                sb.append(e);
                Log.e(str2, sb.toString());
                return str3;
            }
        } catch (JSONException e4) {
            e = e4;
            str2 = a;
            sb = new StringBuilder("Error in formatting Krux segment JSON: ");
            sb.append(e);
            Log.e(str2, sb.toString());
            return str3;
        } catch (Exception e5) {
            e = e5;
            str2 = a;
            sb = new StringBuilder("Error in formatting segments: ");
            sb.append(e);
            Log.e(str2, sb.toString());
            return str3;
        }
    }

    static /* synthetic */ void a(h hVar, ReentrantReadWriteLock reentrantReadWriteLock) {
        String str;
        StringBuilder sb;
        new g();
        try {
            String c2 = hVar.c(hVar.h.e);
            if (hVar.w) {
                String str2 = a;
                StringBuilder sb2 = new StringBuilder("Krux Segment URL: ");
                sb2.append(c2);
                Log.d(str2, sb2.toString());
            }
            n a2 = g.a(new URL(c2));
            if (hVar.w) {
                String str3 = a;
                StringBuilder sb3 = new StringBuilder("Krux segment JSON string: ");
                sb3.append((String) a2.b);
                Log.d(str3, sb3.toString());
            }
            reentrantReadWriteLock.writeLock().lock();
            hVar.i = (String) a2.b;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (MalformedURLException e2) {
            e = e2;
            str = a;
            sb = new StringBuilder("Segment URL is malformed: ");
            sb.append(e);
            Log.e(str, sb.toString());
        } catch (Exception e3) {
            e = e3;
            str = a;
            sb = new StringBuilder("Unable to get Krux segments : ");
            sb.append(e);
            Log.e(str, sb.toString());
        }
    }

    private void a(j jVar) {
        jVar.b.putString("event_uid", jVar.a);
        Intent intent = new Intent(this.e, EventPublisherService.class);
        intent.setAction("fireevent");
        intent.putExtra("event_attributes", jVar.b);
        intent.putExtra("advertising_id", this.g);
        this.u.readLock().lock();
        intent.putExtra("publisher_uuid", this.h.a);
        intent.putExtra("event", this.h.c);
        this.u.readLock().unlock();
        this.e.startService(a(intent));
    }

    private void a(m mVar) {
        Intent intent = new Intent(this.e, EventPublisherService.class);
        intent.setAction("trackpageview");
        intent.putExtra("page_attributes_bundle", mVar.b);
        intent.putExtra("user_attributes_bundle", mVar.c);
        intent.putExtra("page_url", mVar.a);
        intent.putExtra("advertising_id", this.g);
        this.u.readLock().lock();
        intent.putExtra("site", this.h.d);
        intent.putExtra("pixel", this.h.b);
        intent.putExtra("publisher_uuid", this.h.a);
        intent.putExtra("is_location_service", this.h.f);
        this.u.readLock().unlock();
        this.e.startService(a(intent));
    }

    private void b(String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("mobile", "1");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f);
            this.j = C2481cI.a(sb.toString(), bundle);
        } catch (Exception e2) {
            String str2 = a;
            StringBuilder sb2 = new StringBuilder("Unable to parse attributes to construct Config url: ");
            sb2.append(e2);
            Log.e(str2, sb2.toString());
        }
    }

    private String c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("_kpid", this.h.a);
        bundle.putString("_kuid", this.g);
        try {
            return C2481cI.a(str, bundle);
        } catch (Exception e2) {
            String str2 = a;
            StringBuilder sb = new StringBuilder("Unable to parse attributes to construct Segment url: ");
            sb.append(e2);
            Log.e(str2, sb.toString());
            return "";
        }
    }

    private void d() {
        new Thread(new l(this, this.v, this.u)).start();
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            for (m a2 : this.k) {
                a(a2);
            }
            this.k.clear();
            for (j a3 : this.l) {
                a(a3);
            }
            this.l.clear();
            for (k kVar : this.m) {
                Intent intent = new Intent(this.e, EventPublisherService.class);
                intent.setAction("genericevent");
                intent.putExtra("event_attributes", kVar.a);
                intent.putExtra("advertising_id", this.g);
                this.u.readLock().lock();
                intent.putExtra("publisher_uuid", this.h.a);
                intent.putExtra("event", this.h.c);
                this.u.readLock().unlock();
                this.e.startService(a(intent));
            }
            this.m.clear();
        } catch (Exception e2) {
            String str = a;
            StringBuilder sb = new StringBuilder("Exception when sending queued requests: ");
            sb.append(e2);
            Log.e(str, sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, String str, b bVar, boolean z) {
        if (context == null) {
            Log.e(a, "Application Context is null. Can't initialize Krux SDK.");
        } else if (!C2954dI.a(str)) {
            Log.e(a, "Config id format is not valid. It must be between 8-10 characters in length  and can contain lowercase or uppercase letters, digits, underscores, and dashes.");
        } else {
            this.w = z;
            this.k = new CopyOnWriteArrayList();
            this.l = new CopyOnWriteArrayList();
            this.m = new CopyOnWriteArrayList();
            this.e = context;
            this.f = str;
            this.v = bVar;
            this.r = new C2992fI();
            this.s = new C2462bI(context);
            this.u = new ReentrantReadWriteLock();
            String str2 = this.y;
            if (str2 == null) {
                str2 = "https://cdn.krxd.net/controltag/config/";
            }
            b(str2);
            this.n = new EventPublisherServiceResultReceiver(new Handler());
            this.n.a = new i(this);
            b = true;
            d();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.e.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
