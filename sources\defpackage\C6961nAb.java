package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: nAb reason: default package and case insensitive filesystem */
/* compiled from: BufferedSource */
public interface C6961nAb extends HAb, ReadableByteChannel {
    int a(C7789zAb zab) throws IOException;

    long a(byte b) throws IOException;

    String a(Charset charset) throws IOException;

    boolean a(long j, C7030oAb oab) throws IOException;

    String c(long j) throws IOException;

    byte[] d(long j) throws IOException;

    void e(long j) throws IOException;

    C7030oAb f(long j) throws IOException;

    C6825lAb getBuffer();

    @Deprecated
    C6825lAb j();

    String m() throws IOException;

    short n() throws IOException;

    byte[] o() throws IOException;

    boolean p() throws IOException;

    long q() throws IOException;

    int r() throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    long s() throws IOException;

    void skip(long j) throws IOException;

    InputStream t();
}
