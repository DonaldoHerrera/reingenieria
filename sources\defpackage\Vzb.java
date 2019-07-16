package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: Vzb reason: default package */
/* compiled from: FileSystem */
public interface Vzb {
    public static final Vzb a = new Uzb();

    void a(File file) throws IOException;

    void a(File file, File file2) throws IOException;

    boolean b(File file);

    GAb c(File file) throws FileNotFoundException;

    long d(File file);

    HAb e(File file) throws FileNotFoundException;

    GAb f(File file) throws FileNotFoundException;

    void g(File file) throws IOException;
}
