package defpackage;

import java.io.IOException;

/* renamed from: an reason: default package and case insensitive filesystem */
/* compiled from: ExtractorInput */
public interface C0313an {
    void a();

    void a(int i) throws IOException, InterruptedException;

    void a(byte[] bArr, int i, int i2) throws IOException, InterruptedException;

    boolean a(int i, boolean z) throws IOException, InterruptedException;

    boolean a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException;

    int b(int i) throws IOException, InterruptedException;

    long b();

    boolean b(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException;

    void c(int i) throws IOException, InterruptedException;

    long getLength();

    long getPosition();

    int read(byte[] bArr, int i, int i2) throws IOException, InterruptedException;

    void readFully(byte[] bArr, int i, int i2) throws IOException, InterruptedException;
}
