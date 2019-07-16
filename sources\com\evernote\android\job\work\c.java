package com.evernote.android.job.work;

import android.os.Bundle;
import android.util.SparseArray;

/* compiled from: TransientBundleHolder */
final class c {
    private static SparseArray<Bundle> a = new SparseArray<>();

    public static synchronized void a(int i, Bundle bundle) {
        synchronized (c.class) {
            a.put(i, bundle);
        }
    }

    public static synchronized Bundle b(int i) {
        Bundle bundle;
        synchronized (c.class) {
            bundle = (Bundle) a.get(i);
        }
        return bundle;
    }

    public static synchronized void a(int i) {
        synchronized (c.class) {
            a.remove(i);
        }
    }
}
