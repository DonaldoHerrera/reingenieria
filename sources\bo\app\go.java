package bo.app;

import android.graphics.Bitmap;
import android.os.Handler;

final class go implements Runnable {
    private final gl a;
    private final Bitmap b;
    private final gm c;
    private final Handler d;

    public go(gl glVar, Bitmap bitmap, gm gmVar, Handler handler) {
        this.a = glVar;
        this.b = bitmap;
        this.c = gmVar;
        this.d = handler;
    }

    public void run() {
        hr.a("PostProcess image before displaying [%s]", this.c.b);
        gn.a(new gh(this.c.e.p().a(this.b), this.c, this.a, gu.MEMORY_CACHE), this.c.e.s(), this.d, this.a);
    }
}
