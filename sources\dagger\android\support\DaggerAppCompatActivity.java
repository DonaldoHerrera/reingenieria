package dagger.android.support;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import dagger.android.a;
import dagger.android.b;
import dagger.android.c;
import dagger.android.f;

public abstract class DaggerAppCompatActivity extends AppCompatActivity implements f {
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
