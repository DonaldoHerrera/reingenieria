package dagger.android.support;

import android.content.Context;
import androidx.appcompat.app.B;
import dagger.android.c;
import dagger.android.f;

/* compiled from: DaggerAppCompatDialogFragment */
public abstract class b extends B implements f {
    c<Object> a;

    public dagger.android.b<Object> oa() {
        return this.a;
    }

    public void onAttach(Context context) {
        a.a(this);
        super.onAttach(context);
    }
}
