package com.soundcloud.android.features.record;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.soundcloud.android.features.record.filter.FadeFilter;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

public class PlaybackStream implements Parcelable {
    public static final Creator<PlaybackStream> CREATOR = new F();
    private final C3668u a;
    private long b;
    /* access modifiers changed from: private */
    public long c;
    /* access modifiers changed from: private */
    public long d;
    private C3671x e;
    /* access modifiers changed from: private */
    public PlaybackFilter f;
    /* access modifiers changed from: private */
    public boolean g;
    private float[] h = new float[2];

    public PlaybackStream(C3671x xVar) {
        this.e = xVar;
        this.a = xVar.w();
        s();
        this.b = -1;
    }

    public long c() {
        return this.d - this.c;
    }

    public long d() {
        if (this.d == h()) {
            return -1;
        }
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public PlaybackFilter e() {
        return this.f;
    }

    public long f() {
        return Math.max(0, this.b - this.c);
    }

    public long g() {
        return this.c;
    }

    public long h() {
        return this.e.getDuration();
    }

    public long i() {
        return h() - this.d;
    }

    public float[] j() {
        return this.h;
    }

    public void k() throws IOException {
        this.b = c(this.b);
        a(this.b);
    }

    public boolean l() {
        return this.f instanceof FadeFilter;
    }

    public boolean m() {
        return this.f != null || this.g;
    }

    public boolean n() {
        return this.b >= this.d;
    }

    public boolean o() {
        if (this.c <= 0) {
            long j = this.d;
            if (j <= 0 || j >= h()) {
                return false;
            }
        }
        return true;
    }

    public void p() {
        this.h[0] = Math.max(0.0f, ((float) this.c) / ((float) h()));
        this.h[1] = Math.min(1.0f, ((float) this.d) / ((float) h()));
    }

    public void q() throws IOException {
        this.e.b();
        long j = this.b;
        if (j >= 0) {
            this.e.h(j);
        }
        this.d = Math.min(h(), this.d);
    }

    public void r() {
        s();
        this.f = null;
        this.g = false;
    }

    public final void s() {
        this.c = 0;
        this.d = h();
        float[] fArr = this.h;
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
    }

    public void t() {
        this.b = -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaybackStream{startPos=");
        sb.append(this.c);
        sb.append(", endPos=");
        sb.append(this.d);
        sb.append(", playbackFile=");
        sb.append(this.e);
        sb.append(", filter=");
        sb.append(this.f);
        sb.append(", optimize=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.e.a().getAbsolutePath());
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeParcelable(this.f, i);
    }

    private long c(long j) {
        long j2 = this.c;
        if (j < j2) {
            return j2;
        }
        long j3 = this.d;
        return j > j3 ? j3 : j;
    }

    public C3668u b() {
        return this.a;
    }

    public ha b(float f2, long j) {
        double d2 = (double) f2;
        if (d2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d2 > 1.0d) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal start percent ");
            sb.append(f2);
            throw new IllegalArgumentException(sb.toString());
        }
        this.h[0] = f2;
        long j2 = this.c;
        this.c = (long) (f2 * ((float) h()));
        ha haVar = new ha(this, j2, this.c, j);
        return haVar;
    }

    public ha a(float f2, long j) {
        double d2 = (double) f2;
        if (d2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d2 > 1.0d) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal end percent ");
            sb.append(f2);
            throw new IllegalArgumentException(sb.toString());
        }
        this.h[1] = f2;
        long j2 = this.d;
        this.d = (long) (f2 * ((float) h()));
        ha haVar = new ha(this, j2, this.d, j);
        return haVar;
    }

    public int b(ByteBuffer byteBuffer, int i) throws IOException {
        if (this.b >= this.d) {
            return -1;
        }
        int b2 = this.e.b(byteBuffer, i);
        byteBuffer.flip();
        PlaybackFilter playbackFilter = this.f;
        if (playbackFilter != null) {
            playbackFilter.a(byteBuffer, this.a.b(this.b - this.c), this.a.b(this.d - this.c));
        }
        this.b = this.e.getPosition();
        return b2;
    }

    public int a(ByteBuffer byteBuffer, int i) throws IOException {
        int b2 = this.e.b(byteBuffer, i);
        byteBuffer.flip();
        return b2;
    }

    public void a(long j) throws IOException {
        this.e.h(j);
    }

    public void a() {
        C6698jGa.a((Closeable) this.e);
        this.e = new C3870sca();
    }

    public void a(boolean z) {
        this.f = z ? new FadeFilter(this.e.w()) : null;
    }

    public void b(long j) {
        this.b = j;
    }

    public void a(long j, long j2) {
        this.c = j;
        if (j2 == -1) {
            j2 = h();
        }
        this.d = j2;
        p();
    }
}
