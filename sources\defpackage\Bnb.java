package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: Bnb reason: default package */
/* compiled from: AbstractMessageLite */
public abstract class Bnb implements Wnb {
    protected int a = 0;

    /* renamed from: Bnb$a */
    /* compiled from: AbstractMessageLite */
    public static abstract class a<BuilderType extends a> implements defpackage.Wnb.a {

        /* renamed from: Bnb$a$a reason: collision with other inner class name */
        /* compiled from: AbstractMessageLite */
        static final class C0139a extends FilterInputStream {
            private int a;

            C0139a(InputStream inputStream, int i) {
                super(inputStream);
                this.a = i;
            }

            public int available() throws IOException {
                return Math.min(super.available(), this.a);
            }

            public int read() throws IOException {
                if (this.a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.a--;
                }
                return read;
            }

            public long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, (long) this.a));
                if (skip >= 0) {
                    this.a = (int) (((long) this.a) - skip);
                }
                return skip;
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.a;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.a -= read;
                }
                return read;
            }
        }

        public abstract BuilderType a(Gnb gnb, Inb inb) throws IOException;

        protected static C6461fob a(Wnb wnb) {
            return new C6461fob(wnb);
        }
    }

    public void a(OutputStream outputStream) throws IOException {
        int c = c();
        Hnb a2 = Hnb.a(outputStream, Hnb.d(Hnb.e(c) + c));
        a2.p(c);
        a(a2);
        a2.a();
    }

    /* access modifiers changed from: 0000 */
    public C6461fob f() {
        return new C6461fob(this);
    }
}
