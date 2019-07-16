package defpackage;

import com.google.android.exoplayer2.J;
import java.nio.ByteBuffer;

/* renamed from: sm reason: default package and case insensitive filesystem */
/* compiled from: AudioSink */
public interface C1698sm {

    /* renamed from: sm$a */
    /* compiled from: AudioSink */
    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }

        public a(String str) {
            super(str);
        }
    }

    /* renamed from: sm$b */
    /* compiled from: AudioSink */
    public static final class b extends Exception {
        public final int a;

        public b(int i, int i2, int i3, int i4) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed: ");
            sb.append(i);
            sb.append(", Config(");
            sb.append(i2);
            String str = ", ";
            sb.append(str);
            sb.append(i3);
            sb.append(str);
            sb.append(i4);
            sb.append(")");
            super(sb.toString());
            this.a = i;
        }
    }

    /* renamed from: sm$c */
    /* compiled from: AudioSink */
    public interface c {
        void a();

        void a(int i);

        void a(int i, long j, long j2);
    }

    /* renamed from: sm$d */
    /* compiled from: AudioSink */
    public static final class d extends Exception {
        public final int a;

        public d(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack write failed: ");
            sb.append(i);
            super(sb.toString());
            this.a = i;
        }
    }

    long a(boolean z);

    J a(J j);

    void a(float f);

    void a(int i);

    void a(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6) throws a;

    void a(C1485lm lmVar);

    void a(c cVar);

    void a(C1788vm vmVar);

    boolean a();

    boolean a(int i, int i2);

    boolean a(ByteBuffer byteBuffer, long j) throws b, d;

    J c();

    boolean d();

    void e();

    void f() throws d;

    void flush();

    void g();

    void pause();

    void play();

    void reset();
}
