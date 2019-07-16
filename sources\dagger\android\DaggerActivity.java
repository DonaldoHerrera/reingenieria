package dagger.android;

import android.app.Activity;
import android.os.Bundle;

public abstract class DaggerActivity extends Activity implements f {
    c<Object> a;

    public b<Object> oa() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a.a((Activity) this);
        super.onCreate(bundle);
    }
}
