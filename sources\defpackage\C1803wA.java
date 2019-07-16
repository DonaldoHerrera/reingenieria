package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.play.core.splitcompat.c;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: wA reason: default package and case insensitive filesystem */
public final class C1803wA implements GB {
    private final Context a;
    private final c b;
    /* access modifiers changed from: private */
    public final C1833xA c;
    private final Executor d;
    private final JB e;

    public C1803wA(Context context, Executor executor, C1833xA xAVar, c cVar, JB jb) {
        this.a = context;
        this.b = cVar;
        this.c = xAVar;
        this.d = executor;
        this.e = jb;
    }

    private final Integer a(List<Intent> list) {
        FileChannel channel;
        FileLock fileLock;
        Integer num;
        Throwable th;
        try {
            channel = new RandomAccessFile(this.b.b(), "rw").getChannel();
            try {
                fileLock = channel.tryLock();
            } catch (OverlappingFileLockException unused) {
                fileLock = null;
            }
            if (fileLock != null) {
                num = Integer.valueOf(b(list));
                fileLock.release();
            } else {
                num = null;
            }
            if (channel != null) {
                a((Throwable) null, channel);
            }
            return num;
        } catch (Exception e2) {
            Log.e("SplitCompat", "Error locking files.", e2);
            return Integer.valueOf(-13);
        } catch (Throwable th2) {
            if (channel != null) {
                a(th, channel);
            }
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public final void a(HB hb) {
        String str = "SplitCompat";
        try {
            if (!this.e.a(this.a.getApplicationContext())) {
                Log.e(str, "Emulating splits failed.");
                hb.a(-12);
                return;
            }
            Log.i(str, "Splits installed.");
            hb.a();
        } catch (Exception e2) {
            Log.e(str, "Error emulating splits.", e2);
            hb.a(-12);
        }
    }

    private static /* synthetic */ void a(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                _A.a(th, th2);
            }
        } else {
            inputStream.close();
        }
    }

    private static /* synthetic */ void a(Throwable th, OutputStream outputStream) {
        if (th != null) {
            try {
                outputStream.close();
            } catch (Throwable th2) {
                _A.a(th, th2);
            }
        } else {
            outputStream.close();
        }
    }

    private static /* synthetic */ void a(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                _A.a(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    private final int b(List<Intent> list) {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        Throwable th3;
        String str = "SplitCompat";
        try {
            Log.i(str, "Copying splits.");
            for (Intent intent : list) {
                String stringExtra = intent.getStringExtra("split_id");
                File a2 = this.b.a(stringExtra);
                if (!a2.exists() && !this.b.b(stringExtra).exists()) {
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(this.a.getContentResolver().openFileDescriptor(intent.getData(), "r").getFileDescriptor()));
                    fileOutputStream = new FileOutputStream(a2);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = bufferedInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.close();
                        a((Throwable) null, (InputStream) bufferedInputStream);
                    } catch (Throwable th4) {
                        Throwable th5 = th4;
                        th3 = r10;
                        th2 = th5;
                    }
                }
            }
            Log.i(str, "Splits copied.");
            try {
                if (!this.c.a()) {
                    Log.e(str, "Split verification failed.");
                    return -11;
                }
                Log.i(str, "Splits verified.");
                return 0;
            } catch (Exception e2) {
                Log.e(str, "Error verifying splits.", e2);
                return -11;
            }
            a(th3, (OutputStream) fileOutputStream);
            throw th2;
        } catch (Exception e3) {
            Log.e(str, "Error copying splits.", e3);
            return -13;
        } catch (Throwable th6) {
            a(th, (InputStream) bufferedInputStream);
            throw th6;
        }
    }

    /* access modifiers changed from: private */
    public final void b(List<Intent> list, HB hb) {
        Integer a2 = a(list);
        if (a2 != null) {
            if (a2.intValue() == 0) {
                hb.b();
            } else {
                hb.a(a2.intValue());
            }
        }
    }

    public final void a(List<Intent> list, HB hb) {
        if (this.e.a()) {
            this.d.execute(new C1863yA(this, list, hb));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }
}
