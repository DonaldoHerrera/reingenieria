package com.soundcloud.android.crop;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: CropUtil */
class l {

    /* compiled from: CropUtil */
    private static class a extends com.soundcloud.android.crop.q.a implements Runnable {
        /* access modifiers changed from: private */
        public final q a;
        /* access modifiers changed from: private */
        public final ProgressDialog b;
        private final Runnable c;
        private final Handler d;
        private final Runnable e = new k(this);

        public a(q qVar, Runnable runnable, ProgressDialog progressDialog, Handler handler) {
            this.a = qVar;
            this.b = progressDialog;
            this.c = runnable;
            this.a.a(this);
            this.d = handler;
        }

        public void c(q qVar) {
            this.b.show();
        }

        public void d(q qVar) {
            this.b.hide();
        }

        public void run() {
            try {
                this.c.run();
            } finally {
                this.d.post(this.e);
            }
        }

        public void b(q qVar) {
            this.e.run();
            this.d.removeCallbacks(this.e);
        }
    }

    l() {
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    private static File b(Context context, ContentResolver contentResolver, Uri uri) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        String a2;
        FileOutputStream fileOutputStream2 = null;
        if (uri == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(contentResolver.openFileDescriptor(uri, "r").getFileDescriptor());
            try {
                a2 = a(context);
                fileOutputStream = new FileOutputStream(a2);
            } catch (IOException unused) {
                fileOutputStream = null;
                a((Closeable) fileInputStream);
                a((Closeable) fileOutputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                a((Closeable) fileInputStream);
                a((Closeable) fileOutputStream2);
                throw th;
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        File file = new File(a2);
                        a((Closeable) fileInputStream);
                        a((Closeable) fileOutputStream);
                        return file;
                    }
                }
            } catch (IOException unused2) {
                a((Closeable) fileInputStream);
                a((Closeable) fileOutputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                a((Closeable) fileInputStream);
                a((Closeable) fileOutputStream2);
                throw th;
            }
        } catch (IOException unused3) {
            fileOutputStream = null;
            fileInputStream = null;
            a((Closeable) fileInputStream);
            a((Closeable) fileOutputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            a((Closeable) fileInputStream);
            a((Closeable) fileOutputStream2);
            throw th;
        }
    }

    public static int a(File file) {
        if (file == null) {
            return 0;
        }
        try {
            int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException e) {
            p.a("Error getting Exif data", e);
            return 0;
        }
    }

    public static boolean a(File file, File file2) {
        String str = "Orientation";
        if (!(file == null || file2 == null)) {
            try {
                ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                ExifInterface exifInterface2 = new ExifInterface(file2.getAbsolutePath());
                exifInterface2.setAttribute(str, exifInterface.getAttribute(str));
                exifInterface2.saveAttributes();
                return true;
            } catch (IOException e) {
                p.a("Error copying Exif data", e);
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r3 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0079, code lost:
        if (r3 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        r3.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x007f */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    public static File a(Context context, ContentResolver contentResolver, Uri uri) {
        Cursor cursor;
        Cursor cursor2;
        int i;
        cursor = null;
        if (uri == null) {
            return null;
        }
        if ("file".equals(uri.getScheme())) {
            return new File(uri.getPath());
        }
        if ("content".equals(uri.getScheme())) {
            String str = "_display_name";
            String str2 = "_data";
            try {
                cursor2 = contentResolver.query(uri, new String[]{str2, str}, null, null, null);
                if (cursor2 != null) {
                    try {
                        if (cursor2.moveToFirst()) {
                            if (uri.toString().startsWith("content://com.google.android.gallery3d")) {
                                i = cursor2.getColumnIndex(str);
                            } else {
                                i = cursor2.getColumnIndex(str2);
                            }
                            if (i != -1) {
                                String string = cursor2.getString(i);
                                if (!TextUtils.isEmpty(string)) {
                                    File file = new File(string);
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    return file;
                                }
                            }
                        }
                    } catch (IllegalArgumentException unused) {
                        cursor = cursor2;
                        try {
                            File b = b(context, contentResolver, uri);
                            if (cursor != null) {
                            }
                            return b;
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (SecurityException unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor2 != null) {
                        }
                        throw th;
                    }
                }
            } catch (IllegalArgumentException ) {
                File b2 = b(context, contentResolver, uri);
                if (cursor != null) {
                    cursor.close();
                }
                return b2;
            } catch (SecurityException unused3) {
                cursor2 = null;
            }
        }
        return null;
    }

    private static String a(Context context) throws IOException {
        return File.createTempFile("image", "tmp", context.getCacheDir()).getAbsolutePath();
    }

    public static void a(q qVar, String str, String str2, Runnable runnable, Handler handler) {
        new Thread(new a(qVar, runnable, ProgressDialog.show(qVar, str, str2, true, false), handler)).start();
    }
}
