package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: Wp reason: default package */
/* compiled from: ContentDataSource */
public final class Wp extends Vp {
    private final ContentResolver e;
    private Uri f;
    private AssetFileDescriptor g;
    private FileInputStream h;
    private long i;
    private boolean j;

    /* renamed from: Wp$a */
    /* compiled from: ContentDataSource */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public Wp(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    public long a(C0470aq aqVar) throws a {
        try {
            this.f = aqVar.a;
            b(aqVar);
            this.g = this.e.openAssetFileDescriptor(this.f, "r");
            if (this.g != null) {
                this.h = new FileInputStream(this.g.getFileDescriptor());
                long startOffset = this.g.getStartOffset();
                long skip = this.h.skip(aqVar.f + startOffset) - startOffset;
                if (skip == aqVar.f) {
                    long j2 = -1;
                    if (aqVar.g != -1) {
                        this.i = aqVar.g;
                    } else {
                        long length = this.g.getLength();
                        if (length == -1) {
                            FileChannel channel = this.h.getChannel();
                            long size = channel.size();
                            if (size != 0) {
                                j2 = size - channel.position();
                            }
                            this.i = j2;
                        } else {
                            this.i = length - skip;
                        }
                    }
                    this.j = true;
                    c(aqVar);
                    return this.i;
                }
                throw new EOFException();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not open file descriptor for: ");
            sb.append(this.f);
            throw new FileNotFoundException(sb.toString());
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    public void close() throws a {
        this.f = null;
        try {
            if (this.h != null) {
                this.h.close();
            }
            this.h = null;
            try {
                if (this.g != null) {
                    this.g.close();
                }
                this.g = null;
                if (this.j) {
                    this.j = false;
                    b();
                }
            } catch (IOException e2) {
                throw new a(e2);
            } catch (Throwable th) {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    b();
                }
                throw th;
            }
        } catch (IOException e3) {
            throw new a(e3);
        } catch (Throwable th2) {
            this.h = null;
            try {
                if (this.g != null) {
                    this.g.close();
                }
                this.g = null;
                if (this.j) {
                    this.j = false;
                    b();
                }
                throw th2;
            } catch (IOException e4) {
                throw new a(e4);
            } catch (Throwable th3) {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    b();
                }
                throw th3;
            }
        }
    }

    public Uri getUri() {
        return this.f;
    }

    public int read(byte[] bArr, int i2, int i3) throws a {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.i;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, (long) i3);
            } catch (IOException e2) {
                throw new a(e2);
            }
        }
        int read = this.h.read(bArr, i2, i3);
        if (read != -1) {
            long j3 = this.i;
            if (j3 != -1) {
                this.i = j3 - ((long) read);
            }
            a(read);
            return read;
        } else if (this.i == -1) {
            return -1;
        } else {
            throw new a(new EOFException());
        }
    }
}
