package com.google.firebase.iid;

import java.util.concurrent.Executor;

final /* synthetic */ class L implements Executor {
    static final Executor a = new L();

    private L() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
