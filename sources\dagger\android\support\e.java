package dagger.android.support;

import android.content.Context;
import androidx.fragment.app.Fragment;
import dagger.android.b;
import dagger.android.c;
import dagger.android.f;

/* compiled from: DaggerFragment */
public abstract class e extends Fragment implements f {
    c<Object> a;

    public b<Object> oa() {
        return this.a;
    }

    public void onAttach(Context context) {
        a.a(this);
        super.onAttach(context);
    }
}
