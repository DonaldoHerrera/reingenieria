package com.google.firebase.iid;

import android.os.Bundle;
import java.io.IOException;

final class V implements Py<Bundle, String> {
    private final /* synthetic */ U a;

    V(U u) {
        this.a = u;
    }

    public final /* synthetic */ Object then(Wy wy) throws Exception {
        return U.a((Bundle) wy.a(IOException.class));
    }
}
