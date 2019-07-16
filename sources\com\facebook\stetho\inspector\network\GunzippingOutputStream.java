package com.facebook.stetho.inspector.network;

import com.facebook.stetho.common.Util;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.zip.GZIPInputStream;

class GunzippingOutputStream extends FilterOutputStream {
    private static final ExecutorService sExecutor = Executors.newCachedThreadPool();
    private final Future<Void> mCopyFuture;

    private static class GunzippingCallable implements Callable<Void> {
        private final InputStream mIn;
        private final OutputStream mOut;

        public GunzippingCallable(InputStream inputStream, OutputStream outputStream) {
            this.mIn = inputStream;
            this.mOut = outputStream;
        }

        /* JADX INFO: finally extract failed */
        public Void call() throws IOException {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(this.mIn);
            try {
                Util.copy(gZIPInputStream, this.mOut, new byte[1024]);
                gZIPInputStream.close();
                this.mOut.close();
                return null;
            } catch (Throwable th) {
                gZIPInputStream.close();
                this.mOut.close();
                throw th;
            }
        }
    }

    private GunzippingOutputStream(OutputStream outputStream, Future<Void> future) throws IOException {
        super(outputStream);
        this.mCopyFuture = future;
    }

    public static GunzippingOutputStream create(OutputStream outputStream) throws IOException {
        PipedInputStream pipedInputStream = new PipedInputStream();
        return new GunzippingOutputStream(new PipedOutputStream(pipedInputStream), sExecutor.submit(new GunzippingCallable(pipedInputStream, outputStream)));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:0|1|2) */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r1 = r1.getCause();
        com.facebook.stetho.common.ExceptionUtil.propagateIfInstanceOf(r1, java.io.IOException.class);
        com.facebook.stetho.common.ExceptionUtil.propagate(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        throw null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[SYNTHETIC, Splitter:B:0:0x0000] */
    private static <T> T getAndRethrow(Future<T> future) throws IOException {
        return future.get();
    }

    public void close() throws IOException {
        try {
            super.close();
            try {
            } catch (IOException e) {
                throw e;
            }
        } finally {
            try {
                getAndRethrow(this.mCopyFuture);
            } catch (IOException unused) {
            }
        }
    }
}
