package com.facebook.internal;

import com.facebook.B;
import com.facebook.O;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: FileLruCache */
public final class K {
    static final String a = "K";
    /* access modifiers changed from: private */
    public static final AtomicLong b = new AtomicLong();
    private final String c;
    private final d d;
    private final File e;
    private boolean f;
    private boolean g;
    private final Object h;
    /* access modifiers changed from: private */
    public AtomicLong i = new AtomicLong(0);

    /* compiled from: FileLruCache */
    private static class a {
        private static final FilenameFilter a = new I();
        private static final FilenameFilter b = new J();

        static void a(File file) {
            File[] listFiles = file.listFiles(b());
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }

        static FilenameFilter b() {
            return b;
        }

        static File b(File file) {
            StringBuilder sb = new StringBuilder();
            sb.append("buffer");
            sb.append(Long.valueOf(K.b.incrementAndGet()).toString());
            return new File(file, sb.toString());
        }

        static FilenameFilter a() {
            return a;
        }
    }

    /* compiled from: FileLruCache */
    private static class b extends OutputStream {
        final OutputStream a;
        final f b;

        b(OutputStream outputStream, f fVar) {
            this.a = outputStream;
            this.b = fVar;
        }

        public void close() throws IOException {
            try {
                this.a.close();
            } finally {
                this.b.onClose();
            }
        }

        public void flush() throws IOException {
            this.a.flush();
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.a.write(bArr, i, i2);
        }

        public void write(byte[] bArr) throws IOException {
            this.a.write(bArr);
        }

        public void write(int i) throws IOException {
            this.a.write(i);
        }
    }

    /* compiled from: FileLruCache */
    private static final class c extends InputStream {
        final InputStream a;
        final OutputStream b;

        c(InputStream inputStream, OutputStream outputStream) {
            this.a = inputStream;
            this.b = outputStream;
        }

        public int available() throws IOException {
            return this.a.available();
        }

        public void close() throws IOException {
            try {
                this.a.close();
            } finally {
                this.b.close();
            }
        }

        public void mark(int i) {
            throw new UnsupportedOperationException();
        }

        public boolean markSupported() {
            return false;
        }

        public int read(byte[] bArr) throws IOException {
            int read = this.a.read(bArr);
            if (read > 0) {
                this.b.write(bArr, 0, read);
            }
            return read;
        }

        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        public long skip(long j) throws IOException {
            byte[] bArr = new byte[1024];
            long j2 = 0;
            while (j2 < j) {
                int read = read(bArr, 0, (int) Math.min(j - j2, (long) bArr.length));
                if (read < 0) {
                    return j2;
                }
                j2 += (long) read;
            }
            return j2;
        }

        public int read() throws IOException {
            int read = this.a.read();
            if (read >= 0) {
                this.b.write(read);
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.a.read(bArr, i, i2);
            if (read > 0) {
                this.b.write(bArr, i, read);
            }
            return read;
        }
    }

    /* compiled from: FileLruCache */
    public static final class d {
        private int a = 1048576;
        private int b = 1024;

        /* access modifiers changed from: 0000 */
        public int a() {
            return this.a;
        }

        /* access modifiers changed from: 0000 */
        public int b() {
            return this.b;
        }
    }

    /* compiled from: FileLruCache */
    private static final class e implements Comparable<e> {
        private final File a;
        private final long b;

        e(File file) {
            this.a = file;
            this.b = file.lastModified();
        }

        /* access modifiers changed from: 0000 */
        public File a() {
            return this.a;
        }

        /* access modifiers changed from: 0000 */
        public long b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && compareTo((e) obj) == 0;
        }

        public int hashCode() {
            return ((1073 + this.a.hashCode()) * 37) + ((int) (this.b % 2147483647L));
        }

        /* renamed from: a */
        public int compareTo(e eVar) {
            if (b() < eVar.b()) {
                return -1;
            }
            if (b() > eVar.b()) {
                return 1;
            }
            return a().compareTo(eVar.a());
        }
    }

    /* compiled from: FileLruCache */
    private interface f {
        void onClose();
    }

    /* compiled from: FileLruCache */
    private static final class g {
        static void a(OutputStream outputStream, JSONObject jSONObject) throws IOException {
            byte[] bytes = jSONObject.toString().getBytes();
            outputStream.write(0);
            outputStream.write((bytes.length >> 16) & 255);
            outputStream.write((bytes.length >> 8) & 255);
            outputStream.write((bytes.length >> 0) & 255);
            outputStream.write(bytes);
        }

        static JSONObject a(InputStream inputStream) throws IOException {
            if (inputStream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int read = inputStream.read();
                if (read == -1) {
                    W.a(O.CACHE, K.a, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (read & 255);
            }
            byte[] bArr = new byte[i2];
            while (i < bArr.length) {
                int read2 = inputStream.read(bArr, i, bArr.length - i);
                if (read2 < 1) {
                    O o = O.CACHE;
                    String str = K.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("readHeader: stream.read stopped at ");
                    sb.append(Integer.valueOf(i));
                    sb.append(" when expected ");
                    sb.append(bArr.length);
                    W.a(o, str, sb.toString());
                    return null;
                }
                i += read2;
            }
            try {
                Object nextValue = new JSONTokener(new String(bArr)).nextValue();
                if (nextValue instanceof JSONObject) {
                    return (JSONObject) nextValue;
                }
                O o2 = O.CACHE;
                String str2 = K.a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("readHeader: expected JSONObject, got ");
                sb2.append(nextValue.getClass().getCanonicalName());
                W.a(o2, str2, sb2.toString());
                return null;
            } catch (JSONException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    public K(String str, d dVar) {
        this.c = str;
        this.d = dVar;
        this.e = new File(B.i(), str);
        this.h = new Object();
        if (this.e.mkdirs() || this.e.isDirectory()) {
            a.a(this.e);
        }
    }

    private void c() {
        synchronized (this.h) {
            if (!this.f) {
                this.f = true;
                B.m().execute(new H(this));
            }
        }
    }

    /* access modifiers changed from: private */
    public void d() {
        long j;
        synchronized (this.h) {
            this.f = false;
            this.g = true;
        }
        try {
            W.a(O.CACHE, a, "trim started");
            PriorityQueue priorityQueue = new PriorityQueue();
            File[] listFiles = this.e.listFiles(a.a());
            long j2 = 0;
            if (listFiles != null) {
                long j3 = 0;
                j = 0;
                for (File file : listFiles) {
                    e eVar = new e(file);
                    priorityQueue.add(eVar);
                    O o = O.CACHE;
                    String str = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("  trim considering time=");
                    sb.append(Long.valueOf(eVar.b()));
                    sb.append(" name=");
                    sb.append(eVar.a().getName());
                    W.a(o, str, sb.toString());
                    j3 += file.length();
                    j++;
                }
                j2 = j3;
            } else {
                j = 0;
            }
            while (true) {
                if (j2 > ((long) this.d.a()) || j > ((long) this.d.b())) {
                    File a2 = ((e) priorityQueue.remove()).a();
                    O o2 = O.CACHE;
                    String str2 = a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  trim removing ");
                    sb2.append(a2.getName());
                    W.a(o2, str2, sb2.toString());
                    j2 -= a2.length();
                    j--;
                    a2.delete();
                } else {
                    synchronized (this.h) {
                        this.g = false;
                        this.h.notifyAll();
                    }
                    return;
                }
            }
        } catch (Throwable th) {
            synchronized (this.h) {
                this.g = false;
                this.h.notifyAll();
                throw th;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{FileLruCache: tag:");
        sb.append(this.c);
        sb.append(" file:");
        sb.append(this.e.getName());
        sb.append("}");
        return sb.toString();
    }

    public OutputStream b(String str) throws IOException {
        return b(str, null);
    }

    public OutputStream b(String str, String str2) throws IOException {
        File b2 = a.b(this.e);
        b2.delete();
        if (b2.createNewFile()) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(b2);
                F f2 = new F(this, System.currentTimeMillis(), b2, str);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new b(fileOutputStream, f2), 8192);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", str);
                    if (!ia.b(str2)) {
                        jSONObject.put("tag", str2);
                    }
                    g.a(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (JSONException e2) {
                    O o = O.CACHE;
                    String str3 = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error creating JSON header for cache file: ");
                    sb.append(e2);
                    W.a(o, 5, str3, sb.toString());
                    throw new IOException(e2.getMessage());
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e3) {
                O o2 = O.CACHE;
                String str4 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error creating buffer output stream: ");
                sb2.append(e3);
                W.a(o2, 5, str4, sb2.toString());
                throw new IOException(e3.getMessage());
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not create file at ");
            sb3.append(b2.getAbsolutePath());
            throw new IOException(sb3.toString());
        }
    }

    public InputStream a(String str) throws IOException {
        return a(str, (String) null);
    }

    public InputStream a(String str, String str2) throws IOException {
        File file = new File(this.e, ia.c(str));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            try {
                JSONObject a2 = g.a(bufferedInputStream);
                if (a2 == null) {
                    return null;
                }
                String optString = a2.optString("key");
                if (optString != null) {
                    if (optString.equals(str)) {
                        String optString2 = a2.optString("tag", null);
                        if ((str2 != null || optString2 == null) && (str2 == null || str2.equals(optString2))) {
                            long time = new Date().getTime();
                            O o = O.CACHE;
                            String str3 = a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Setting lastModified to ");
                            sb.append(Long.valueOf(time));
                            sb.append(" for ");
                            sb.append(file.getName());
                            W.a(o, str3, sb.toString());
                            file.setLastModified(time);
                            return bufferedInputStream;
                        }
                        bufferedInputStream.close();
                        return null;
                    }
                }
                bufferedInputStream.close();
                return null;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, File file) {
        if (!file.renameTo(new File(this.e, ia.c(str)))) {
            file.delete();
        }
        c();
    }

    public void b() {
        File[] listFiles = this.e.listFiles(a.a());
        this.i.set(System.currentTimeMillis());
        if (listFiles != null) {
            B.m().execute(new G(this, listFiles));
        }
    }

    public InputStream a(String str, InputStream inputStream) throws IOException {
        return new c(inputStream, b(str));
    }
}
