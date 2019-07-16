package defpackage;

import java.io.File;
import java.util.Map;

/* renamed from: mj reason: default package and case insensitive filesystem */
/* compiled from: Report */
interface C1513mj {

    /* renamed from: mj$a */
    /* compiled from: Report */
    public enum a {
        JAVA,
        NATIVE
    }

    Map<String, String> a();

    String b();

    File c();

    File[] d();

    String getFileName();

    a getType();

    void remove();
}
