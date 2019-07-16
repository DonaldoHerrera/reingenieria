package defpackage;

import java.lang.Exception;

/* renamed from: Om reason: default package */
/* compiled from: Decoder */
public interface Om<I, O, E extends Exception> {
    O a() throws Exception;

    void a(I i) throws Exception;

    I b() throws Exception;

    void flush();

    void release();
}
