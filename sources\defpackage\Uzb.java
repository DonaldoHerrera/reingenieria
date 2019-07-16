package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: Uzb reason: default package */
/* compiled from: FileSystem */
class Uzb implements Vzb {
    Uzb() {
    }

    public void a(File file, File file2) throws IOException {
        g(file2);
        if (!file.renameTo(file2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed to rename ");
            sb.append(file);
            sb.append(" to ");
            sb.append(file2);
            throw new IOException(sb.toString());
        }
    }

    public boolean b(File file) {
        return file.exists();
    }

    public GAb c(File file) throws FileNotFoundException {
        try {
            return C7720yAb.a(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return C7720yAb.a(file);
        }
    }

    public long d(File file) {
        return file.length();
    }

    public HAb e(File file) throws FileNotFoundException {
        return C7720yAb.c(file);
    }

    public GAb f(File file) throws FileNotFoundException {
        try {
            return C7720yAb.b(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return C7720yAb.b(file);
        }
    }

    public void g(File file) throws IOException {
        if (!file.delete() && file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed to delete ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    public void a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("failed to delete ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("not a readable directory: ");
        sb2.append(file);
        throw new IOException(sb2.toString());
    }
}
