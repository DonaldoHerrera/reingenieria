package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;

@KeepForSdk
public class RegistrationMethods<A extends AnyClient, L> {
    public final RegisterListenerMethod<A, L> zajz;
    public final UnregisterListenerMethod<A, L> zaka;

    @KeepForSdk
    public static class Builder<A extends AnyClient, L> {
        private boolean zajw;
        /* access modifiers changed from: private */
        public RemoteCall<A, Xy<Void>> zakb;
        /* access modifiers changed from: private */
        public RemoteCall<A, Xy<Boolean>> zakc;
        private ListenerHolder<L> zakd;
        private Feature[] zake;

        private Builder() {
            this.zajw = true;
        }

        @KeepForSdk
        public RegistrationMethods<A, L> build() {
            boolean z = true;
            Preconditions.checkArgument(this.zakb != null, "Must set register function");
            Preconditions.checkArgument(this.zakc != null, "Must set unregister function");
            if (this.zakd == null) {
                z = false;
            }
            Preconditions.checkArgument(z, "Must set holder");
            return new RegistrationMethods<>(new zaca(this, this.zakd, this.zake, this.zajw), new zacb(this, this.zakd.getListenerKey()));
        }

        @KeepForSdk
        @Deprecated
        public Builder<A, L> register(BiConsumer<A, Xy<Void>> biConsumer) {
            this.zakb = new zaby(biConsumer);
            return this;
        }

        @KeepForSdk
        public Builder<A, L> setAutoResolveMissingFeatures(boolean z) {
            this.zajw = z;
            return this;
        }

        @KeepForSdk
        public Builder<A, L> setFeatures(Feature[] featureArr) {
            this.zake = featureArr;
            return this;
        }

        @KeepForSdk
        @Deprecated
        public Builder<A, L> unregister(BiConsumer<A, Xy<Boolean>> biConsumer) {
            this.zakb = new zabz(this);
            return this;
        }

        @KeepForSdk
        public Builder<A, L> withHolder(ListenerHolder<L> listenerHolder) {
            this.zakd = listenerHolder;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void zaa(AnyClient anyClient, Xy xy) throws RemoteException {
            this.zakb.accept(anyClient, xy);
        }

        @KeepForSdk
        public Builder<A, L> register(RemoteCall<A, Xy<Void>> remoteCall) {
            this.zakb = remoteCall;
            return this;
        }

        @KeepForSdk
        public Builder<A, L> unregister(RemoteCall<A, Xy<Boolean>> remoteCall) {
            this.zakc = remoteCall;
            return this;
        }
    }

    private RegistrationMethods(RegisterListenerMethod<A, L> registerListenerMethod, UnregisterListenerMethod<A, L> unregisterListenerMethod) {
        this.zajz = registerListenerMethod;
        this.zaka = unregisterListenerMethod;
    }

    @KeepForSdk
    public static <A extends AnyClient, L> Builder<A, L> builder() {
        return new Builder<>();
    }
}
