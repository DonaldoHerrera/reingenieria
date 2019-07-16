package dagger.android.support;

import android.content.Context;
import androidx.fragment.app.C0361c;
import dagger.android.b;
import dagger.android.c;
import dagger.android.f;

/* compiled from: DaggerDialogFragment */
public abstract class d extends C0361c implements f {
    c<Object> a;

    public b<Object> oa() {
        return this.a;
    }

    public void onAttach(Context context) {
        a.a(this);
        super.onAttach(context);
    }
}
