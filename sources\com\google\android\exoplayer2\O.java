package com.google.android.exoplayer2;

import com.google.android.exoplayer2.M.b;
import com.google.android.exoplayer2.source.x;
import java.io.IOException;

/* compiled from: Renderer */
public interface O extends b {
    void a(float f) throws C0618s;

    void a(long j) throws C0618s;

    void a(long j, long j2) throws C0618s;

    void a(Q q, Format[] formatArr, x xVar, long j, boolean z, long j2) throws C0618s;

    void a(Format[] formatArr, x xVar, long j) throws C0618s;

    boolean a();

    boolean b();

    void d();

    int e();

    boolean g();

    int getState();

    void h();

    void i() throws IOException;

    boolean j();

    P k();

    x l();

    long m();

    Kq n();

    void reset();

    void setIndex(int i);

    void start() throws C0618s;

    void stop() throws C0618s;
}
