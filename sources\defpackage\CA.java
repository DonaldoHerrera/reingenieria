package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: CA reason: default package */
final class CA implements AA {
    CA() {
    }

    static Object a(ClassLoader classLoader) {
        return XA.a((Object) classLoader, "pathList", Object.class).a();
    }

    static boolean a(ClassLoader classLoader, File file, File file2, boolean z, GA ga, String str, DA da) {
        ArrayList arrayList = new ArrayList();
        Object a = a(classLoader);
        TA b = XA.b(a, "dexElements", Object.class);
        List<Object> asList = Arrays.asList((Object[]) b.a());
        ArrayList arrayList2 = new ArrayList();
        for (Object a2 : asList) {
            arrayList2.add((File) XA.a(a2, str, File.class).a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        String str2 = "SplitCompat";
        int i = 0;
        if (z || da.a(a, file2, file)) {
            b.a((T[]) ga.a(a, new ArrayList(Collections.singleton(file2)), file, arrayList));
            if (arrayList.isEmpty()) {
                return true;
            }
            String str3 = "DexPathList.makeDexElement failed";
            C1773vA vAVar = new C1773vA(str3);
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                IOException iOException = (IOException) obj;
                Log.e(str2, str3, iOException);
                _A.a(vAVar, iOException);
            }
            XA.b(a, "dexElementsSuppressedExceptions", IOException.class).a((Collection<T>) arrayList);
            throw vAVar;
        }
        String str4 = "Should be optimized ";
        String valueOf = String.valueOf(file2.getPath());
        Log.w(str2, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        return false;
    }

    static void b(ClassLoader classLoader, Set<File> set) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (true) {
                String str = "Splitcompat";
                if (it.hasNext()) {
                    File file = (File) it.next();
                    String str2 = "Adding native library parent directory: ";
                    String valueOf = String.valueOf(file.getParentFile().getAbsolutePath());
                    Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    hashSet.add(file.getParentFile());
                } else {
                    TA b = XA.b(a(classLoader), "nativeLibraryDirectories", File.class);
                    hashSet.removeAll(Arrays.asList((File[]) b.a()));
                    int size = hashSet.size();
                    StringBuilder sb = new StringBuilder(30);
                    sb.append("Adding directories ");
                    sb.append(size);
                    Log.d(str, sb.toString());
                    b.a((Collection<T>) hashSet);
                    return;
                }
            }
        }
    }

    public final void a(ClassLoader classLoader, Set<File> set) {
        b(classLoader, set);
    }

    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z) {
        return a(classLoader, file, file2, z, new BA(), "zip", new EA());
    }
}
