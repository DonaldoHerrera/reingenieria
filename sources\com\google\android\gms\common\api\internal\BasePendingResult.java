package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
@KeepForSdk
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    static final ThreadLocal<Boolean> zadn = new zap();
    @KeepName
    private zaa mResultGuardian;
    private Status mStatus;
    /* access modifiers changed from: private */
    public R zacj;
    private final Object zado;
    private final CallbackHandler<R> zadp;
    private final WeakReference<GoogleApiClient> zadq;
    private final CountDownLatch zadr;
    private final ArrayList<StatusListener> zads;
    private ResultCallback<? super R> zadt;
    private final AtomicReference<zacs> zadu;
    private volatile boolean zadv;
    private boolean zadw;
    private boolean zadx;
    private ICancelToken zady;
    private volatile zacm<R> zadz;
    private boolean zaea;

    @VisibleForTesting
    public static class CallbackHandler<R extends Result> extends C1764us {
        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                ResultCallback resultCallback = (ResultCallback) pair.first;
                Result result = (Result) pair.second;
                try {
                    resultCallback.onResult(result);
                } catch (RuntimeException e) {
                    BasePendingResult.zab(result);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).zab(Status.RESULT_TIMEOUT);
            }
        }

        public final void zaa(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }
    }

    private final class zaa {
        private zaa() {
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            BasePendingResult.zab(BasePendingResult.this.zacj);
            super.finalize();
        }

        /* synthetic */ zaa(BasePendingResult basePendingResult, zap zap) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.zado = new Object();
        this.zadr = new CountDownLatch(1);
        this.zads = new ArrayList<>();
        this.zadu = new AtomicReference<>();
        this.zaea = false;
        this.zadp = new CallbackHandler<>(Looper.getMainLooper());
        this.zadq = new WeakReference<>(null);
    }

    private final R get() {
        R r;
        synchronized (this.zado) {
            Preconditions.checkState(!this.zadv, "Result has already been consumed.");
            Preconditions.checkState(isReady(), "Result is not ready.");
            r = this.zacj;
            this.zacj = null;
            this.zadt = null;
            this.zadv = true;
        }
        zacs zacs = (zacs) this.zadu.getAndSet(null);
        if (zacs != null) {
            zacs.zac(this);
        }
        return r;
    }

    public final void addStatusListener(StatusListener statusListener) {
        Preconditions.checkArgument(statusListener != null, "Callback cannot be null.");
        synchronized (this.zado) {
            if (isReady()) {
                statusListener.onComplete(this.mStatus);
            } else {
                this.zads.add(statusListener);
            }
        }
    }

    public final R await() {
        Preconditions.checkNotMainThread("await must not be called on the UI thread");
        boolean z = true;
        Preconditions.checkState(!this.zadv, "Result has already been consumed");
        if (this.zadz != null) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            this.zadr.await();
        } catch (InterruptedException unused) {
            zab(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return get();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    @KeepForSdk
    public void cancel() {
        synchronized (this.zado) {
            if (!this.zadw) {
                if (!this.zadv) {
                    if (this.zady != null) {
                        this.zady.cancel();
                    }
                    zab((Result) this.zacj);
                    this.zadw = true;
                    zaa((R) createFailedResult(Status.RESULT_CANCELED));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract R createFailedResult(Status status);

    public boolean isCanceled() {
        boolean z;
        synchronized (this.zado) {
            z = this.zadw;
        }
        return z;
    }

    @KeepForSdk
    public final boolean isReady() {
        return this.zadr.getCount() == 0;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public final void setCancelToken(ICancelToken iCancelToken) {
        synchronized (this.zado) {
            this.zady = iCancelToken;
        }
    }

    @KeepForSdk
    public final void setResult(R r) {
        synchronized (this.zado) {
            if (this.zadx || this.zadw) {
                zab((Result) r);
                return;
            }
            isReady();
            boolean z = true;
            Preconditions.checkState(!isReady(), "Results have already been set");
            if (this.zadv) {
                z = false;
            }
            Preconditions.checkState(z, "Result has already been consumed");
            zaa(r);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return;
     */
    @KeepForSdk
    public final void setResultCallback(ResultCallback<? super R> resultCallback) {
        synchronized (this.zado) {
            if (resultCallback == null) {
                this.zadt = null;
                return;
            }
            boolean z = true;
            Preconditions.checkState(!this.zadv, "Result has already been consumed.");
            if (this.zadz != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
            if (!isCanceled()) {
                if (isReady()) {
                    this.zadp.zaa(resultCallback, get());
                } else {
                    this.zadt = resultCallback;
                }
            }
        }
    }

    public <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> resultTransform) {
        TransformedResult<S> then;
        Preconditions.checkState(!this.zadv, "Result has already been consumed.");
        synchronized (this.zado) {
            boolean z = false;
            Preconditions.checkState(this.zadz == null, "Cannot call then() twice.");
            Preconditions.checkState(this.zadt == null, "Cannot call then() if callbacks are set.");
            if (!this.zadw) {
                z = true;
            }
            Preconditions.checkState(z, "Cannot call then() if result was canceled.");
            this.zaea = true;
            this.zadz = new zacm<>(this.zadq);
            then = this.zadz.then(resultTransform);
            if (isReady()) {
                this.zadp.zaa(this.zadz, get());
            } else {
                this.zadt = this.zadz;
            }
        }
        return then;
    }

    public final void zaa(zacs zacs) {
        this.zadu.set(zacs);
    }

    public final void zab(Status status) {
        synchronized (this.zado) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zadx = true;
            }
        }
    }

    public final Integer zam() {
        return null;
    }

    public final boolean zat() {
        boolean isCanceled;
        synchronized (this.zado) {
            if (((GoogleApiClient) this.zadq.get()) == null || !this.zaea) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public final void zau() {
        this.zaea = this.zaea || ((Boolean) zadn.get()).booleanValue();
    }

    private final void zaa(R r) {
        this.zacj = r;
        this.zady = null;
        this.zadr.countDown();
        this.mStatus = this.zacj.getStatus();
        if (this.zadw) {
            this.zadt = null;
        } else if (this.zadt != null) {
            this.zadp.removeMessages(2);
            this.zadp.zaa(this.zadt, get());
        } else if (this.zacj instanceof Releasable) {
            this.mResultGuardian = new zaa(this, null);
        }
        ArrayList<StatusListener> arrayList = this.zads;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((StatusListener) obj).onComplete(this.mStatus);
        }
        this.zads.clear();
    }

    public static void zab(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    public final R await(long j, TimeUnit timeUnit) {
        if (j > 0) {
            Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        Preconditions.checkState(!this.zadv, "Result has already been consumed.");
        if (this.zadz != null) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            if (!this.zadr.await(j, timeUnit)) {
                zab(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            zab(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return get();
    }

    @KeepForSdk
    protected BasePendingResult(GoogleApiClient googleApiClient) {
        this.zado = new Object();
        this.zadr = new CountDownLatch(1);
        this.zads = new ArrayList<>();
        this.zadu = new AtomicReference<>();
        this.zaea = false;
        this.zadp = new CallbackHandler<>(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.zadq = new WeakReference<>(googleApiClient);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        return;
     */
    @KeepForSdk
    public final void setResultCallback(ResultCallback<? super R> resultCallback, long j, TimeUnit timeUnit) {
        synchronized (this.zado) {
            if (resultCallback == null) {
                this.zadt = null;
                return;
            }
            boolean z = true;
            Preconditions.checkState(!this.zadv, "Result has already been consumed.");
            if (this.zadz != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
            if (!isCanceled()) {
                if (isReady()) {
                    this.zadp.zaa(resultCallback, get());
                } else {
                    this.zadt = resultCallback;
                    CallbackHandler<R> callbackHandler = this.zadp;
                    callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            }
        }
    }

    @KeepForSdk
    @Deprecated
    protected BasePendingResult(Looper looper) {
        this.zado = new Object();
        this.zadr = new CountDownLatch(1);
        this.zads = new ArrayList<>();
        this.zadu = new AtomicReference<>();
        this.zaea = false;
        this.zadp = new CallbackHandler<>(looper);
        this.zadq = new WeakReference<>(null);
    }

    @KeepForSdk
    @VisibleForTesting
    protected BasePendingResult(CallbackHandler<R> callbackHandler) {
        this.zado = new Object();
        this.zadr = new CountDownLatch(1);
        this.zads = new ArrayList<>();
        this.zadu = new AtomicReference<>();
        this.zaea = false;
        Preconditions.checkNotNull(callbackHandler, "CallbackHandler must not be null");
        this.zadp = callbackHandler;
        this.zadq = new WeakReference<>(null);
    }
}
