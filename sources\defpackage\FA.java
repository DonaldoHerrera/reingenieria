package defpackage;

import java.io.File;
import java.util.Set;

/* renamed from: FA reason: default package */
final class FA implements AA {
    FA() {
    }

    public final void a(ClassLoader classLoader, Set<File> set) {
        CA.b(classLoader, set);
    }

    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z) {
        return CA.a(classLoader, file, file2, z, new BA(), "zip", new EA());
    }
}
