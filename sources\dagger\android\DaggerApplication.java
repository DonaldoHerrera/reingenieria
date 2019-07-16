package dagger.android;

import android.app.Application;
import com.google.errorprone.annotations.ForOverride;

public abstract class DaggerApplication extends Application implements f {
    volatile c<Object> a;

    private void b() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    a().a(this);
                    if (this.a == null) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @ForOverride
    public abstract b<? extends DaggerApplication> a();

    public b<Object> oa() {
        b();
        return this.a;
    }

    public void onCreate() {
        super.onCreate();
        b();
    }
}
