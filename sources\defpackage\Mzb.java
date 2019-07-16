package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.common.base.Ascii;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: Mzb reason: default package */
/* compiled from: Http2Reader */
final class Mzb implements Closeable {
    static final Logger a = Logger.getLogger(C7856zzb.class.getName());
    private final C6961nAb b;
    private final a c = new a(this.b);
    private final boolean d;
    final a e = new a(4096, this.c);

    /* renamed from: Mzb$a */
    /* compiled from: Http2Reader */
    static final class a implements HAb {
        private final C6961nAb a;
        int b;
        byte c;
        int d;
        int e;
        short f;

        a(C6961nAb nab) {
            this.a = nab;
        }

        private void a() throws IOException {
            int i = this.d;
            int a2 = Mzb.a(this.a);
            this.e = a2;
            this.b = a2;
            byte readByte = (byte) (this.a.readByte() & 255);
            this.c = (byte) (this.a.readByte() & 255);
            if (Mzb.a.isLoggable(Level.FINE)) {
                Mzb.a.fine(C7856zzb.a(true, this.d, this.b, readByte, this.c));
            }
            this.d = this.a.readInt() & BaseClientBuilder.API_PRIORITY_OTHER;
            if (readByte != 9) {
                C7856zzb.b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                throw null;
            } else if (this.d != i) {
                C7856zzb.b("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }

        public long b(C6825lAb lab, long j) throws IOException {
            while (true) {
                int i = this.e;
                if (i == 0) {
                    this.a.skip((long) this.f);
                    this.f = 0;
                    if ((this.c & 4) != 0) {
                        return -1;
                    }
                    a();
                } else {
                    long b2 = this.a.b(lab, Math.min(j, (long) i));
                    if (b2 == -1) {
                        return -1;
                    }
                    this.e = (int) (((long) this.e) - b2);
                    return b2;
                }
            }
        }

        public void close() throws IOException {
        }

        public JAb k() {
            return this.a.k();
        }
    }

    /* renamed from: Mzb$b */
    /* compiled from: Http2Reader */
    interface b {
        void a();

        void a(int i, int i2, int i3, boolean z);

        void a(int i, int i2, List<C7718xzb> list) throws IOException;

        void a(int i, long j);

        void a(int i, C7649wzb wzb);

        void a(int i, C7649wzb wzb, C7030oAb oab);

        void a(boolean z, int i, int i2);

        void a(boolean z, int i, int i2, List<C7718xzb> list);

        void a(boolean z, int i, C6961nAb nab, int i2) throws IOException;

        void a(boolean z, Szb szb);
    }

    Mzb(C6961nAb nab, boolean z) {
        this.b = nab;
        this.d = z;
    }

    private void b(b bVar, int i, byte b2, int i2) throws IOException {
        if (i < 8) {
            C7856zzb.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.b.readInt();
            int readInt2 = this.b.readInt();
            int i3 = i - 8;
            C7649wzb a2 = C7649wzb.a(readInt2);
            if (a2 != null) {
                C7030oAb oab = C7030oAb.b;
                if (i3 > 0) {
                    oab = this.b.f((long) i3);
                }
                bVar.a(readInt, a2, oab);
                return;
            }
            C7856zzb.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            C7856zzb.b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    private void c(b bVar, int i, byte b2, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = (b2 & 1) != 0;
            if ((b2 & 8) != 0) {
                s = (short) (this.b.readByte() & 255);
            }
            if ((b2 & 32) != 0) {
                a(bVar, i2);
                i -= 5;
            }
            bVar.a(z, i2, -1, a(a(i, b2, s), s, b2, i2));
            return;
        }
        C7856zzb.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    private void d(b bVar, int i, byte b2, int i2) throws IOException {
        boolean z = false;
        if (i != 8) {
            C7856zzb.b("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.b.readInt();
            int readInt2 = this.b.readInt();
            if ((b2 & 1) != 0) {
                z = true;
            }
            bVar.a(z, readInt, readInt2);
        } else {
            C7856zzb.b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    private void e(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 5) {
            C7856zzb.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            a(bVar, i2);
        } else {
            C7856zzb.b("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void f(b bVar, int i, byte b2, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            if ((b2 & 8) != 0) {
                s = (short) (this.b.readByte() & 255);
            }
            bVar.a(i2, this.b.readInt() & BaseClientBuilder.API_PRIORITY_OTHER, a(a(i - 4, b2, s), s, b2, i2));
            return;
        }
        C7856zzb.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    private void g(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 4) {
            C7856zzb.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            int readInt = this.b.readInt();
            C7649wzb a2 = C7649wzb.a(readInt);
            if (a2 != null) {
                bVar.a(i2, a2);
                return;
            }
            C7856zzb.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        } else {
            C7856zzb.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void h(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 != 0) {
            C7856zzb.b("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        } else if ((b2 & 1) != 0) {
            if (i == 0) {
                bVar.a();
                return;
            }
            C7856zzb.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            throw null;
        } else if (i % 6 == 0) {
            Szb szb = new Szb();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short readShort = this.b.readShort() & 65535;
                int readInt = this.b.readInt();
                switch (readShort) {
                    case 2:
                        if (!(readInt == 0 || readInt == 1)) {
                            C7856zzb.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            throw null;
                        }
                    case 3:
                        readShort = 4;
                        break;
                    case 4:
                        readShort = 7;
                        if (readInt >= 0) {
                            break;
                        } else {
                            C7856zzb.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                    case 5:
                        if (readInt >= 16384 && readInt <= 16777215) {
                            break;
                        } else {
                            C7856zzb.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                            throw null;
                        }
                        break;
                }
                szb.a(readShort, readInt);
            }
            bVar.a(false, szb);
        } else {
            C7856zzb.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
    }

    private void i(b bVar, int i, byte b2, int i2) throws IOException {
        if (i == 4) {
            long readInt = ((long) this.b.readInt()) & 2147483647L;
            if (readInt != 0) {
                bVar.a(i2, readInt);
                return;
            }
            C7856zzb.b("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        C7856zzb.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        throw null;
    }

    public void a(b bVar) throws IOException {
        if (!this.d) {
            C7030oAb f = this.b.f((long) C7856zzb.a.f());
            if (a.isLoggable(Level.FINE)) {
                a.fine(Kyb.a("<< CONNECTION %s", f.b()));
            }
            if (!C7856zzb.a.equals(f)) {
                C7856zzb.b("Expected a connection header but was %s", f.v());
                throw null;
            }
        } else if (!a(true, bVar)) {
            C7856zzb.b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    public void close() throws IOException {
        this.b.close();
    }

    public boolean a(boolean z, b bVar) throws IOException {
        try {
            this.b.e(9);
            int a2 = a(this.b);
            if (a2 < 0 || a2 > 16384) {
                C7856zzb.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a2));
                throw null;
            }
            byte readByte = (byte) (this.b.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.b.readByte() & 255);
                int readInt = this.b.readInt() & BaseClientBuilder.API_PRIORITY_OTHER;
                if (a.isLoggable(Level.FINE)) {
                    a.fine(C7856zzb.a(true, readInt, a2, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        a(bVar, a2, readByte2, readInt);
                        break;
                    case 1:
                        c(bVar, a2, readByte2, readInt);
                        break;
                    case 2:
                        e(bVar, a2, readByte2, readInt);
                        break;
                    case 3:
                        g(bVar, a2, readByte2, readInt);
                        break;
                    case 4:
                        h(bVar, a2, readByte2, readInt);
                        break;
                    case 5:
                        f(bVar, a2, readByte2, readInt);
                        break;
                    case 6:
                        d(bVar, a2, readByte2, readInt);
                        break;
                    case 7:
                        b(bVar, a2, readByte2, readInt);
                        break;
                    case 8:
                        i(bVar, a2, readByte2, readInt);
                        break;
                    default:
                        this.b.skip((long) a2);
                        break;
                }
                return true;
            }
            C7856zzb.b("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            throw null;
        } catch (EOFException unused) {
            return false;
        }
    }

    private List<C7718xzb> a(int i, short s, byte b2, int i2) throws IOException {
        a aVar = this.c;
        aVar.e = i;
        aVar.b = i;
        aVar.f = s;
        aVar.c = b2;
        aVar.d = i2;
        this.e.c();
        return this.e.a();
    }

    private void a(b bVar, int i, byte b2, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = true;
            boolean z2 = (b2 & 1) != 0;
            if ((b2 & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b2 & 8) != 0) {
                    s = (short) (this.b.readByte() & 255);
                }
                bVar.a(z2, i2, this.b, a(i, b2, s));
                this.b.skip((long) s);
                return;
            }
            C7856zzb.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        C7856zzb.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        throw null;
    }

    private void a(b bVar, int i) throws IOException {
        int readInt = this.b.readInt();
        bVar.a(i, readInt & BaseClientBuilder.API_PRIORITY_OTHER, (this.b.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    static int a(C6961nAb nab) throws IOException {
        return (nab.readByte() & 255) | ((nab.readByte() & 255) << Ascii.DLE) | ((nab.readByte() & 255) << 8);
    }

    static int a(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C7856zzb.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }
}
