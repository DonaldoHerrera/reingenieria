package bo.app;

import android.content.Context;
import bo.app.cc.a;
import com.appboy.h;
import com.appboy.i;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

public class z {
    /* access modifiers changed from: private */
    public static final String c = Hg.a(z.class);
    AtomicBoolean a = new AtomicBoolean(false);
    long b = 0;
    /* access modifiers changed from: private */
    public final bj d;
    /* access modifiers changed from: private */
    public final r e;
    /* access modifiers changed from: private */
    public final bg f;
    /* access modifiers changed from: private */
    public final Context g;
    /* access modifiers changed from: private */
    public final dl h;
    /* access modifiers changed from: private */
    public final dc i;
    /* access modifiers changed from: private */
    public final dj j;
    /* access modifiers changed from: private */
    public final fl k;
    /* access modifiers changed from: private */
    public final cg l;
    /* access modifiers changed from: private */
    public final ax m;
    /* access modifiers changed from: private */
    public final ay n;
    /* access modifiers changed from: private */
    public AtomicBoolean o = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public an p;

    public z(Context context, bj bjVar, r rVar, bb bbVar, dl dlVar, dc dcVar, dj djVar, fl flVar, cg cgVar, ax axVar, ay ayVar) {
        this.d = bjVar;
        this.e = rVar;
        this.f = bbVar;
        this.g = context;
        this.h = dlVar;
        this.i = dcVar;
        this.j = djVar;
        this.k = flVar;
        this.l = cgVar;
        this.m = axVar;
        this.n = ayVar;
    }

    /* access modifiers changed from: protected */
    public Yf<an> m() {
        return new Yf<an>() {
            /* renamed from: a */
            public void trigger(an anVar) {
                z.this.o.set(true);
                z.this.p = anVar;
                Hg.c(z.c, "Requesting trigger update due to trigger-eligible push click event");
                z.this.f.a(new a().b());
            }
        };
    }

    /* access modifiers changed from: protected */
    public Yf<ap> n() {
        return new Yf<ap>() {
            /* renamed from: a */
            public void trigger(ap apVar) {
                z.this.k.a(apVar.a());
                z.this.c();
                z.this.d();
            }
        };
    }

    /* access modifiers changed from: protected */
    public Yf<ao> o() {
        return new Yf<ao>() {
            /* renamed from: a */
            public void trigger(ao aoVar) {
                z.this.k.a(aoVar.a());
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public void p() {
        if (this.b + 5 < dn.a()) {
            this.a.set(true);
            Hg.a(c, "Requesting trigger refresh.");
            this.f.a(new a().b());
            this.b = dn.a();
        }
    }

    /* access modifiers changed from: protected */
    public Yf<aq> q() {
        return new Yf<aq>() {
            /* renamed from: a */
            public void trigger(aq aqVar) {
                try {
                    z.this.f.a(aqVar);
                } catch (Exception e) {
                    Hg.b(z.c, "Failed to log the database exception.", e);
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public Yf<ac> b() {
        return new Yf<ac>() {
            /* renamed from: a */
            public void trigger(ac acVar) {
                cr a2 = acVar.a();
                cc f = a2.f();
                if (f != null) {
                    if (f.d()) {
                        z.this.c();
                        z.this.d();
                    }
                    if (f.c()) {
                        z.this.j.a(true);
                    }
                }
                by d = a2.d();
                if (d != null) {
                    z.this.i.b(d, false);
                }
                cd e = a2.e();
                if (e != null) {
                    z.this.h.b(e, false);
                }
                bn g = a2.g();
                if (g != null) {
                    for (bo a3 : g.a()) {
                        z.this.e.a(a3);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public void c() {
        if (this.a.compareAndSet(true, false)) {
            this.k.a(new fe());
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        if (this.o.compareAndSet(true, false) && this.p.a() != null) {
            this.k.a(new fg(this.p.a(), this.p.b()));
            this.p = null;
        }
    }

    /* access modifiers changed from: protected */
    public Yf<cf> e() {
        return new Yf<cf>() {
            /* renamed from: a */
            public void trigger(cf cfVar) {
                cj a2 = cfVar.a();
                if (a2.a()) {
                    String r = z.c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received PlaceIQ id: ");
                    sb.append(a2.b());
                    Hg.c(r, sb.toString());
                    try {
                        z.this.l.a();
                        z.this.h.j(a2.b());
                    } catch (Exception e) {
                        Hg.b(z.c, "Failed to log PlaceIQ id event", e);
                    }
                } else {
                    Hg.e(z.c, "Received PlaceIQ response without PlaceIQ Id.");
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public Yf<ce> f() {
        return new Yf<ce>() {
            /* renamed from: a */
            public void trigger(ce ceVar) {
                String r = z.c;
                StringBuilder sb = new StringBuilder();
                sb.append("Place IQ dispatch failed for: ");
                sb.append(ceVar.a().c());
                Hg.c(r, sb.toString());
            }
        };
    }

    /* access modifiers changed from: protected */
    public Yf<ck> g() {
        return new Yf<ck>() {
            /* renamed from: a */
            public void trigger(ck ckVar) {
                z.this.l.b();
            }
        };
    }

    /* access modifiers changed from: protected */
    public Yf<aj> h() {
        return new Yf<aj>() {
            /* renamed from: a */
            public void trigger(aj ajVar) {
                Hg.a(z.c, "Session start event for new session received.");
                z.this.f.a((bo) bx.i());
                z.this.d.a();
                z.this.d.b();
                z.this.p();
                i.a(z.this.g, false);
            }
        };
    }

    /* access modifiers changed from: protected */
    public Yf<ag> i() {
        return new Yf<ag>() {
            /* renamed from: a */
            public void trigger(ag agVar) {
                z.this.p();
            }
        };
    }

    /* access modifiers changed from: protected */
    public Yf<ak> j() {
        return new Yf<ak>() {
            /* renamed from: a */
            public void trigger(ak akVar) {
                z.this.a(akVar);
                h.a(z.this.g).j();
            }
        };
    }

    /* access modifiers changed from: protected */
    public Yf<ai> k() {
        return new Yf<ai>() {
            /* renamed from: a */
            public void trigger(ai aiVar) {
                z.this.d.a(aiVar.a());
                z.this.n.a(aiVar.a());
            }
        };
    }

    /* access modifiers changed from: protected */
    public Yf<af> l() {
        return new Yf<af>() {
            /* renamed from: a */
            public void trigger(af afVar) {
                z.this.n.a(afVar.a());
            }
        };
    }

    public void a(aa aaVar) {
        aaVar.a(b(), ac.class);
        aaVar.a(h(), aj.class);
        aaVar.a(j(), ak.class);
        aaVar.a(m(), an.class);
        aaVar.a(k(), ai.class);
        aaVar.a(a((Semaphore) null), Throwable.class);
        aaVar.a(q(), aq.class);
        aaVar.a(n(), ap.class);
        aaVar.a(i(), ag.class);
        aaVar.a(a(), ad.class);
        aaVar.a(g(), ck.class);
        aaVar.a(e(), cf.class);
        aaVar.a(f(), ce.class);
        aaVar.a(l(), af.class);
        aaVar.a(o(), ao.class);
    }

    /* access modifiers changed from: protected */
    public Yf<ad> a() {
        return new Yf<ad>() {
            /* renamed from: a */
            public void trigger(ad adVar) {
                cr a2 = adVar.a();
                cc f = a2.f();
                if (f != null && f.c()) {
                    z.this.j.a(false);
                }
                by d = a2.d();
                if (d != null) {
                    z.this.i.b(d, true);
                }
                cd e = a2.e();
                if (e != null) {
                    z.this.h.b(e, true);
                }
                bn g = a2.g();
                if (g != null) {
                    for (bo b : g.a()) {
                        z.this.m.b(b);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public Yf<Throwable> a(final Semaphore semaphore) {
        return new Yf<Throwable>() {
            /* renamed from: a */
            public void trigger(Throwable th) {
                Semaphore semaphore;
                try {
                    z.this.f.a(th);
                    semaphore = semaphore;
                    if (semaphore == null) {
                        return;
                    }
                } catch (Exception e) {
                    Hg.b(z.c, "Failed to log error.", e);
                    semaphore = semaphore;
                    if (semaphore == null) {
                        return;
                    }
                } catch (Throwable th2) {
                    Semaphore semaphore2 = semaphore;
                    if (semaphore2 != null) {
                        semaphore2.release();
                    }
                    throw th2;
                }
                semaphore.release();
            }
        };
    }

    /* access modifiers changed from: private */
    public void a(ak akVar) {
        try {
            bt a2 = akVar.a();
            bx a3 = bx.a(a2.e());
            a3.a(a2.a());
            this.f.a((bo) a3);
        } catch (JSONException unused) {
            Hg.e(c, "Could not create session end event.");
        }
    }
}
