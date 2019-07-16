package defpackage;

import java.io.File;
import java.util.Iterator;

/* renamed from: LXa reason: default package */
/* compiled from: Utils.kt */
class LXa extends KXa {
    public static boolean b(File file) {
        C7471uYa.b(file, "$this$deleteRecursively");
        Iterator it = KXa.a(file).iterator();
        while (true) {
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                File file2 = (File) it.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    public static String c(File file) {
        C7471uYa.b(file, "$this$extension");
        String name = file.getName();
        C7471uYa.a((Object) name, "name");
        return Hxb.b(name, '.', "");
    }

    public static String d(File file) {
        C7471uYa.b(file, "$this$nameWithoutExtension");
        String name = file.getName();
        C7471uYa.a((Object) name, "name");
        return Hxb.c(name, ".", (String) null, 2, (Object) null);
    }
}
