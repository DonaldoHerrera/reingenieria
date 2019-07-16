package com.google.firebase;

import com.google.android.gms.common.internal.Preconditions;

public class c extends Exception {
    @Deprecated
    protected c() {
    }

    public c(String str) {
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
        super(str);
    }

    public c(String str, Throwable th) {
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
        super(str, th);
    }
}
