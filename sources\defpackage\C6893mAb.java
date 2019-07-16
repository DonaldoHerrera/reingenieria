package defpackage;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* renamed from: mAb reason: default package and case insensitive filesystem */
/* compiled from: BufferedSink */
public interface C6893mAb extends GAb, WritableByteChannel {
    long a(HAb hAb) throws IOException;

    C6893mAb a(long j) throws IOException;

    C6893mAb a(C7030oAb oab) throws IOException;

    C6893mAb b(long j) throws IOException;

    C6893mAb f(String str) throws IOException;

    void flush() throws IOException;

    C6825lAb j();

    C6893mAb l() throws IOException;

    C6893mAb write(byte[] bArr) throws IOException;

    C6893mAb write(byte[] bArr, int i, int i2) throws IOException;

    C6893mAb writeByte(int i) throws IOException;

    C6893mAb writeInt(int i) throws IOException;

    C6893mAb writeShort(int i) throws IOException;
}
