package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;

@KeepForSdk
public abstract class TaskApiCall<A extends AnyClient, ResultT> {
    private final Feature[] zake;
    private final boolean zakl;

    @KeepForSdk
    public static class Builder<A extends AnyClient, ResultT> {
        private Feature[] zake;
        private boolean zakl;
        /* access modifiers changed from: private */
        public RemoteCall<A, Xy<ResultT>> zakm;

        private Builder() {
            this.zakl = true;
        }

        @KeepForSdk
        public TaskApiCall<A, ResultT> build() {
            Preconditions.checkArgument(this.zakm != null, "execute parameter required");
            return new zack(this, this.zake, this.zakl);
        }

        @KeepForSdk
        @Deprecated
        public Builder<A, ResultT> execute(BiConsumer<A, Xy<ResultT>> biConsumer) {
            this.zakm = new zacj(biConsumer);
            return this;
        }

        @KeepForSdk
        public Builder<A, ResultT> run(RemoteCall<A, Xy<ResultT>> remoteCall) {
            this.zakm = remoteCall;
            return this;
        }

        @KeepForSdk
        public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z) {
            this.zakl = z;
            return this;
        }

        @KeepForSdk
        public Builder<A, ResultT> setFeatures(Feature... featureArr) {
            this.zake = featureArr;
            return this;
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.zake = null;
        this.zakl = false;
    }

    @KeepForSdk
    public static <A extends AnyClient, ResultT> Builder<A, ResultT> builder() {
        return new Builder<>();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract void doExecute(A a, Xy<ResultT> xy) throws RemoteException;

    @KeepForSdk
    public boolean shouldAutoResolveMissingFeatures() {
        return this.zakl;
    }

    public final Feature[] zabt() {
        return this.zake;
    }

    @KeepForSdk
    private TaskApiCall(Feature[] featureArr, boolean z) {
        this.zake = featureArr;
        this.zakl = z;
    }
}
