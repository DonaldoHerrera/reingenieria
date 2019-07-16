package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: xj reason: default package and case insensitive filesystem */
/* compiled from: Utils */
final class C1845xj {
    private static final FilenameFilter a = new C1815wj();

    static int a(File file, int i, Comparator<File> comparator) {
        return a(file, a, i, comparator);
    }

    static int a(File file, FilenameFilter filenameFilter, int i, Comparator<File> comparator) {
        File[] listFiles = file.listFiles(filenameFilter);
        if (listFiles == null) {
            return 0;
        }
        int length = listFiles.length;
        Arrays.sort(listFiles, comparator);
        for (File file2 : listFiles) {
            if (length <= i) {
                return length;
            }
            file2.delete();
            length--;
        }
        return length;
    }
}
