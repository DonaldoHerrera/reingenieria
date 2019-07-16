package bo.app;

import android.app.Activity;
import bo.app.cc.a;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public class bb implements bg {
    private static final String a = Hg.a(bb.class);
    private AtomicInteger b = new AtomicInteger(0);
    private AtomicInteger c = new AtomicInteger(0);
    private volatile String d = "";
    private final bd e;
    private final bc f;
    private final r g;
    private final ab h;
    private final bh i;
    private final Bf j;
    private final ct k;
    private final dj l;
    private final ax m;
    private final String n;
    private boolean o = false;
    private boolean p = false;
    private Class<? extends Activity> q = null;

    public bb(bd bdVar, r rVar, ab abVar, bh bhVar, Bf bf, dj djVar, ax axVar, ct ctVar, String str, boolean z, boolean z2, bc bcVar) {
        this.e = bdVar;
        this.g = rVar;
        this.h = abVar;
        this.i = bhVar;
        this.j = bf;
        this.k = ctVar;
        this.o = z;
        this.p = z2;
        this.n = str;
        this.l = djVar;
        this.m = axVar;
        this.f = bcVar;
    }

    public bt a() {
        bt a2 = this.e.a();
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Completed the openSession call. Starting or continuing session ");
        sb.append(a2.a());
        Hg.c(str, sb.toString());
        return a2;
    }

    public bt b(Activity activity) {
        if (this.q != null && !activity.getClass().equals(this.q)) {
            return null;
        }
        this.f.b();
        return this.e.b();
    }

    public void c() {
        this.q = null;
        this.e.e();
    }

    public void d() {
        a(new a());
    }

    public void e() {
        if (this.i.d() == null) {
            Hg.c(a, "Advertising Id was null. Not requesting piq id.");
        } else if (this.o) {
            Hg.c(a, "Appboy network is mocked. Not requesting piq id.");
        } else if (this.p) {
            Hg.c(a, "Appboy outbound network requests are disabled. Not requesting piq id.");
        } else {
            Hg.c(a, "Advertising Id present. Will request piq id.");
            this.k.a(new ch("https://appboy.data.placeiq.com/dataex/id/", this.i.d()));
        }
    }

    public String f() {
        return this.n;
    }

    private void c(bo boVar) {
        JSONObject c2 = boVar.c();
        if (c2 != null) {
            String optString = c2.optString("cid", null);
            if (boVar.b().equals(u.PUSH_NOTIFICATION_TRACKING)) {
                this.h.a(new an(optString, boVar), an.class);
                return;
            }
            return;
        }
        Hg.e(a, "Event json was null. Not publishing push clicked trigger event.");
    }

    public bt a(Activity activity) {
        bt a2 = a();
        this.q = activity.getClass();
        this.f.a();
        return a2;
    }

    public bv b() {
        return this.e.c();
    }

    public void b(bo boVar) {
        Hg.a(a, "Posting geofence report for geofence event.");
        this.g.a((cr) new cq(this.j.f(), boVar));
    }

    public boolean a(bo boVar) {
        if (boVar != null) {
            boolean z = false;
            if (this.e.d() || this.e.c() == null) {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Not adding session id to event: ");
                sb.append(boVar.forJsonPut());
                Hg.a(str, sb.toString());
            } else {
                boVar.a(this.e.c());
                z = true;
            }
            if (!Ng.e(f())) {
                boVar.a(f());
            } else {
                String str2 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Not adding user id to event: ");
                sb2.append(boVar.forJsonPut());
                Hg.a(str2, sb2.toString());
            }
            if (u.b(boVar.b())) {
                Hg.a(a, "Publishing an internal push body clicked event for any awaiting triggers.");
                c(boVar);
            }
            this.m.a(boVar);
            if (!u.a(boVar.b()) || z) {
                this.g.a(boVar);
            } else {
                Hg.a(a, "Adding push click to dispatcher pending list");
                this.g.b(boVar);
            }
            if (boVar.b().equals(u.SESSION_START)) {
                this.g.a(boVar.f());
            }
            if (!z) {
                d();
            }
            return true;
        }
        Hg.b(a, "Appboy manager received null event.");
        throw new NullPointerException();
    }

    private boolean b(Throwable th) {
        this.b.getAndIncrement();
        if (this.d.equals(th.getMessage()) && this.c.get() > 3 && this.b.get() < 100) {
            return true;
        }
        if (this.d.equals(th.getMessage())) {
            this.c.getAndIncrement();
        } else {
            this.c.set(0);
        }
        if (this.b.get() >= 100) {
            this.b.set(0);
        }
        this.d = th.getMessage();
        return false;
    }

    public void a(Throwable th) {
        try {
            if (b(th)) {
                Hg.e(a, "Not logging duplicate error.");
            } else {
                a((bo) bx.a(th, b()));
            }
        } catch (JSONException e2) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create error event from ");
            sb.append(th);
            sb.append(".");
            Hg.b(str, sb.toString(), e2);
        } catch (Exception e3) {
            Hg.b(a, "Failed to log error.", e3);
        }
    }

    public void a(aq aqVar) {
        try {
            if (b((Throwable) aqVar)) {
                Hg.e(a, "Not logging duplicate database exception.");
            } else {
                a((bo) bx.a(aqVar, b()));
            }
        } catch (JSONException e2) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create database exception event from ");
            sb.append(aqVar);
            sb.append(".");
            Hg.b(str, sb.toString(), e2);
        } catch (Exception e3) {
            Hg.b(a, "Failed to log error.", e3);
        }
    }

    public void a(String str, String str2, boolean z) {
        if (str == null || !Og.b(str)) {
            throw new IllegalArgumentException("Reply to email address is invalid");
        } else if (!Ng.d(str2)) {
            C1872yg ygVar = new C1872yg(str2, str, z, this.i.a(), f());
            this.g.a((cr) new co(this.j.f(), ygVar));
        } else {
            throw new IllegalArgumentException("Feedback message cannot be null or blank");
        }
    }

    public void a(a aVar) {
        if (aVar == null) {
            Hg.a(a, "Cannot request data sync with null respond with object");
            return;
        }
        dj djVar = this.l;
        if (djVar != null && djVar.p()) {
            aVar.a(new ca(this.l.l()));
        }
        aVar.a(f());
        cc d2 = aVar.d();
        if (d2.c() && (d2.d() || d2.e())) {
            this.l.a(false);
        }
        this.g.a((cr) new cn(this.j.f(), d2));
    }

    public void a(bq bqVar) {
        Hg.a(a, "Posting geofence request for location.");
        this.g.a((cr) new cp(this.j.f(), bqVar));
    }

    public void a(ed edVar, fb fbVar) {
        this.g.a((cr) new cy(this.j.f(), edVar, fbVar));
    }

    public void a(fb fbVar) {
        this.h.a(new ao(fbVar), ao.class);
    }

    public void a(boolean z) {
        this.p = z;
    }
}
