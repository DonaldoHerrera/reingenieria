package com.facebook.internal;

/* compiled from: NativeProtocol */
class Y implements Runnable {
    Y() {
    }

    public void run() {
        try {
            for (e a : Z.b) {
                a.a(true);
            }
        } finally {
            Z.e.set(false);
        }
    }
}
