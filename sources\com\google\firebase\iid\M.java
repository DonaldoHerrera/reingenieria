package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

final /* synthetic */ class M implements ThreadFactory {
    static final ThreadFactory a = new M();

    private M() {
    }

    public final Thread newThread(Runnable runnable) {
        return J.a(runnable);
    }
}
