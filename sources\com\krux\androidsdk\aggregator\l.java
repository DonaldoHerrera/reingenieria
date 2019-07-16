package com.krux.androidsdk.aggregator;

import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

final class l implements Runnable {
    private ReentrantReadWriteLock a;
    private b b;
    final /* synthetic */ h c;

    l(h hVar, b bVar, ReentrantReadWriteLock reentrantReadWriteLock) {
        this.c = hVar;
        this.b = bVar;
        this.a = reentrantReadWriteLock;
    }

    public final void run() {
        StringBuilder sb;
        String str;
        String c2;
        String sb2;
        try {
            h hVar = this.c;
            C2462bI bIVar = this.c.s;
            bIVar.e = bIVar.a();
            String str2 = bIVar.e == null ? "-" : bIVar.e.isLimitAdTrackingEnabled() ? "OPTOUT" : bIVar.e.getId();
            hVar.g = str2;
            if (this.c.w) {
                String c3 = h.a;
                StringBuilder sb3 = new StringBuilder("Advertising Id: ");
                sb3.append(this.c.g);
                Log.d(c3, sb3.toString());
            }
            if (this.c.w) {
                String c4 = h.a;
                StringBuilder sb4 = new StringBuilder("Setting publisher config id to: ");
                sb4.append(this.c.f);
                Log.d(c4, sb4.toString());
            }
            if (this.c.b()) {
                int i = 3;
                while (i > 0 && !this.c.t) {
                    if (this.c.w) {
                        String c5 = h.a;
                        StringBuilder sb5 = new StringBuilder("Config URL is: ");
                        sb5.append(this.c.j);
                        Log.d(c5, sb5.toString());
                    }
                    if (this.c.w) {
                        String c6 = h.a;
                        StringBuilder sb6 = new StringBuilder("Network available: ");
                        sb6.append(this.c.b());
                        Log.d(c6, sb6.toString());
                    }
                    new g();
                    n a2 = g.a(new URL(this.c.j));
                    if (!((String) a2.b).isEmpty()) {
                        this.a.writeLock().lock();
                        this.c.h = C2405ZH.a(new JSONObject((String) a2.b));
                        this.a.writeLock().unlock();
                    } else if (this.c.w) {
                        String c7 = h.a;
                        StringBuilder sb7 = new StringBuilder("Error in getting Krux config from config service for config id: ");
                        sb7.append(this.c.f);
                        Log.d(c7, sb7.toString());
                    }
                    if (this.c.h != null) {
                        h.a(this.c, this.a);
                    }
                    if (this.c.h != null) {
                        this.c.t = true;
                        if (this.c.w) {
                            String c8 = h.a;
                            StringBuilder sb8 = new StringBuilder("Initialized Krux Config: ");
                            sb8.append(this.c.h);
                            Log.d(c8, sb8.toString());
                        }
                        this.c.a();
                        if (this.b != null) {
                            this.b.a(h.a(this.c.i));
                        }
                    } else {
                        if (this.c.w) {
                            Log.d(h.a, "Trying to get config and segments again...");
                        }
                        i--;
                    }
                }
                if (i == 0 && this.c.w) {
                    c2 = h.a;
                    sb2 = "Unable to initialize Krux config or segments after 3 attempts.";
                }
                h.b = false;
            }
            if (this.c.w) {
                c2 = h.a;
                StringBuilder sb9 = new StringBuilder("Network is not available. Unable to get config and segments for config id ");
                sb9.append(this.c.f);
                sb2 = sb9.toString();
            }
            h.b = false;
            Log.d(c2, sb2);
        } catch (MalformedURLException e) {
            e = e;
            str = h.a;
            sb = new StringBuilder("Config URL is malformed: ");
            sb.append(e);
            Log.e(str, sb.toString());
            h.b = false;
        } catch (JSONException e2) {
            e = e2;
            str = h.a;
            sb = new StringBuilder("Unable to parse config JSON: ");
            sb.append(e);
            Log.e(str, sb.toString());
            h.b = false;
        } catch (Exception e3) {
            e = e3;
            str = h.a;
            sb = new StringBuilder("Unable to get Krux config : ");
            sb.append(e);
            Log.e(str, sb.toString());
            h.b = false;
        }
        h.b = false;
    }
}
