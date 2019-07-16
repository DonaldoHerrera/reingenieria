package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.Rb;
import java.io.IOException;

public class Rb<M extends Rb<M>> extends Wb {
    protected Tb b;

    public void a(Pb pb) throws IOException {
        if (this.b != null) {
            for (int i = 0; i < this.b.j(); i++) {
                this.b.a(i).a(pb);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int j() {
        if (this.b != null) {
            for (int i = 0; i < this.b.j(); i++) {
                this.b.a(i).i();
            }
        }
        return 0;
    }

    public /* synthetic */ Wb k() throws CloneNotSupportedException {
        return (Rb) clone();
    }

    /* renamed from: l */
    public M clone() throws CloneNotSupportedException {
        M m = (Rb) super.clone();
        Vb.a(this, (Rb) m);
        return m;
    }
}
