package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: IA reason: default package */
final class IA implements AA {
    IA() {
    }

    public static void a(ClassLoader classLoader, Set<File> set, JA ja) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File parentFile : set) {
                hashSet.add(parentFile.getParentFile());
            }
            Object a = CA.a(classLoader);
            List list = (List) XA.a(a, "nativeLibraryDirectories", List.class).a();
            hashSet.removeAll(list);
            list.addAll(hashSet);
            ArrayList arrayList = new ArrayList();
            Object[] a2 = ja.a(a, new ArrayList(hashSet), null, arrayList);
            if (!arrayList.isEmpty()) {
                C1773vA vAVar = new C1773vA("Error in makePathElements");
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    _A.a(vAVar, (IOException) obj);
                }
                throw vAVar;
            }
            XA.b(a, "nativeLibraryPathElements", Object.class).a((T[]) a2);
        }
    }

    public static boolean a(ClassLoader classLoader, File file, File file2, boolean z, String str) {
        return CA.a(classLoader, file, file2, z, new HA(), str, new EA());
    }

    /* access modifiers changed from: private */
    public static Object[] b(Object obj, List<File> list, File file, List<IOException> list2) {
        return (Object[]) XA.a(obj, "makePathElements", Object[].class, List.class, list, File.class, file, List.class, list2);
    }

    public final void a(ClassLoader classLoader, Set<File> set) {
        a(classLoader, set, new KA());
    }

    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z) {
        return a(classLoader, file, file2, z, "zip");
    }
}
