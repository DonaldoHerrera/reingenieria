package com.crashlytics.android.ndk;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.TreeSet;

/* compiled from: NdkCrashFilesManager */
class g implements b {
    private static final FileFilter a = new e();
    private final C4994IOa b;

    public g(C4994IOa iOa) {
        this.b = iOa;
    }

    private File c() {
        return new File(this.b.a(), "native");
    }

    public File a() {
        File c = c();
        if (!c.isDirectory() && !c.mkdir()) {
            return null;
        }
        File file = new File(c, Long.toString(new C5118MNa().a()));
        if (!file.mkdir()) {
            file = null;
        }
        return file;
    }

    public TreeSet<File> b() {
        return a(c());
    }

    private static TreeSet<File> a(File file) {
        if (file == null || !file.isDirectory()) {
            return new TreeSet<>();
        }
        File[] listFiles = file.listFiles(a);
        TreeSet<File> treeSet = new TreeSet<>(new f());
        treeSet.addAll(Arrays.asList(listFiles));
        return treeSet;
    }
}
