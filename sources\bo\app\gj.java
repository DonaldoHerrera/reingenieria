package bo.app;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;

public class gj {
    public static final String a = "gj";
    private static volatile gj e;
    private gk b;
    private gl c;
    private hl d = new hn();

    protected gj() {
    }

    public static gj a() {
        if (e == null) {
            synchronized (gj.class) {
                if (e == null) {
                    e = new gj();
                }
            }
        }
        return e;
    }

    private void b() {
        if (this.b == null) {
            throw new IllegalStateException("ImageLoader must be init with configuration before using");
        }
    }

    public synchronized void a(gk gkVar) {
        if (gkVar == null) {
            throw new IllegalArgumentException("ImageLoader configuration can not be initialized with null");
        } else if (this.b == null) {
            hr.a("Initialize ImageLoader with configuration", new Object[0]);
            this.c = new gl(gkVar);
            this.b = gkVar;
        } else {
            hr.c("Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.", new Object[0]);
        }
    }

    public void a(String str, hi hiVar, gi giVar, hl hlVar, hm hmVar) {
        a(str, hiVar, giVar, null, hlVar, hmVar);
    }

    public void a(String str, hi hiVar, gi giVar, gt gtVar, hl hlVar, hm hmVar) {
        b();
        if (hiVar != null) {
            if (hlVar == null) {
                hlVar = this.d;
            }
            hl hlVar2 = hlVar;
            if (giVar == null) {
                giVar = this.b.r;
            }
            if (TextUtils.isEmpty(str)) {
                this.c.b(hiVar);
                hlVar2.a(str, hiVar.d());
                if (giVar.b()) {
                    hiVar.a(giVar.b(this.b.a));
                } else {
                    hiVar.a((Drawable) null);
                }
                hlVar2.a(str, hiVar.d(), (Bitmap) null);
                return;
            }
            if (gtVar == null) {
                gtVar = hp.a(hiVar, this.b.a());
            }
            gt gtVar2 = gtVar;
            String a2 = hs.a(str, gtVar2);
            this.c.a(hiVar, a2);
            hlVar2.a(str, hiVar.d());
            Bitmap a3 = this.b.n.a(a2);
            if (a3 == null || a3.isRecycled()) {
                if (giVar.a()) {
                    hiVar.a(giVar.a(this.b.a));
                } else if (giVar.g()) {
                    hiVar.a((Drawable) null);
                }
                gm gmVar = new gm(str, hiVar, gtVar2, a2, giVar, hlVar2, hmVar, this.c.a(str));
                gn gnVar = new gn(this.c, gmVar, a(giVar));
                if (giVar.s()) {
                    gnVar.run();
                } else {
                    this.c.a(gnVar);
                }
            } else {
                hr.a("Load image from memory cache [%s]", a2);
                if (giVar.e()) {
                    gm gmVar2 = new gm(str, hiVar, gtVar2, a2, giVar, hlVar2, hmVar, this.c.a(str));
                    go goVar = new go(this.c, a3, gmVar2, a(giVar));
                    if (giVar.s()) {
                        goVar.run();
                    } else {
                        this.c.a(goVar);
                    }
                } else {
                    giVar.q().a(a3, hiVar, gu.MEMORY_CACHE);
                    hlVar2.a(str, hiVar.d(), a3);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Wrong arguments were passed to displayImage() method (ImageView reference must not be null)");
    }

    public void a(String str, ImageView imageView, hl hlVar) {
        a(str, new hj(imageView), null, hlVar, null);
    }

    public void a(boolean z) {
        this.c.a(z);
    }

    private static Handler a(gi giVar) {
        Handler r = giVar.r();
        if (giVar.s()) {
            return null;
        }
        return (r == null && Looper.myLooper() == Looper.getMainLooper()) ? new Handler() : r;
    }
}
