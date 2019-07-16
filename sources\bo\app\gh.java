package bo.app;

import android.graphics.Bitmap;

final class gh implements Runnable {
    private final Bitmap a;
    private final String b;
    private final hi c;
    private final String d;
    private final he e;
    private final hl f;
    private final gl g;
    private final gu h;

    public gh(Bitmap bitmap, gm gmVar, gl glVar, gu guVar) {
        this.a = bitmap;
        this.b = gmVar.a;
        this.c = gmVar.c;
        this.d = gmVar.b;
        this.e = gmVar.e.q();
        this.f = gmVar.f;
        this.g = glVar;
        this.h = guVar;
    }

    private boolean a() {
        return !this.d.equals(this.g.a(this.c));
    }

    public void run() {
        if (this.c.e()) {
            hr.a("ImageAware was collected by GC. Task is cancelled. [%s]", this.d);
            this.f.b(this.b, this.c.d());
        } else if (a()) {
            hr.a("ImageAware is reused for another image. Task is cancelled. [%s]", this.d);
            this.f.b(this.b, this.c.d());
        } else {
            hr.a("Display image in ImageAware (loaded from %1$s) [%2$s]", this.h, this.d);
            this.e.a(this.a, this.c, this.h);
            this.g.b(this.c);
            this.f.a(this.b, this.c.d(), this.a);
        }
    }
}
