package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: db reason: default package and case insensitive filesystem */
/* compiled from: TypefaceCompatApi21Impl */
class C1228db extends C1412jb {
    C1228db() {
    }

    private File a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0065, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0066, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006a, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x006b, code lost:
        r3 = r7;
        r7 = r5;
        r5 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0065 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x0020] */
    public Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        Throwable th;
        Throwable th2;
        FileInputStream fileInputStream;
        Throwable th3;
        Throwable th4;
        if (bVarArr.length < 1) {
            return null;
        }
        b a = a(bVarArr, i);
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(a.c(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File a2 = a(openFileDescriptor);
                if (a2 != null) {
                    if (a2.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(a2);
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                        }
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface a3 = super.a(context, (InputStream) fileInputStream);
                    fileInputStream.close();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return a3;
                } catch (Throwable th5) {
                    Throwable th6 = th5;
                    th3 = r5;
                    th4 = th6;
                }
            } catch (Throwable th7) {
            }
        } catch (IOException unused) {
            return null;
        }
        throw th4;
        if (th3 != null) {
            fileInputStream.close();
        } else {
            fileInputStream.close();
        }
        throw th4;
        if (openFileDescriptor != null) {
            if (th != null) {
                try {
                    openFileDescriptor.close();
                } catch (Throwable th8) {
                    th.addSuppressed(th8);
                }
            } else {
                openFileDescriptor.close();
            }
        }
        throw th2;
        throw th2;
    }
}
