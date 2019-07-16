package com.google.firebase.remoteconfig;

public class FirebaseRemoteConfigSettings {
    private final boolean zzjq;
    private final long zzjr;
    private final long zzjs;

    public static class Builder {
        /* access modifiers changed from: private */
        public boolean zzjq = false;
        /* access modifiers changed from: private */
        public long zzjr = 5;
        /* access modifiers changed from: private */
        public long zzjs = C1587ov.a;

        public FirebaseRemoteConfigSettings build() {
            return new FirebaseRemoteConfigSettings(this);
        }

        @Deprecated
        public Builder setDeveloperModeEnabled(boolean z) {
            this.zzjq = z;
            return this;
        }

        public Builder setFetchTimeoutInSeconds(long j) throws IllegalArgumentException {
            if (j >= 0) {
                this.zzjr = j;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[]{Long.valueOf(j)}));
        }

        public Builder setMinimumFetchIntervalInSeconds(long j) {
            if (j >= 0) {
                this.zzjs = j;
                return this;
            }
            StringBuilder sb = new StringBuilder(109);
            sb.append("Minimum interval between fetches has to be a non-negative number. ");
            sb.append(j);
            sb.append(" is an invalid argument");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private FirebaseRemoteConfigSettings(Builder builder) {
        this.zzjq = builder.zzjq;
        this.zzjr = builder.zzjr;
        this.zzjs = builder.zzjs;
    }

    public long getFetchTimeoutInSeconds() {
        return this.zzjr;
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.zzjs;
    }

    @Deprecated
    public boolean isDeveloperModeEnabled() {
        return this.zzjq;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setDeveloperModeEnabled(isDeveloperModeEnabled());
        builder.setFetchTimeoutInSeconds(getFetchTimeoutInSeconds());
        builder.setMinimumFetchIntervalInSeconds(getMinimumFetchIntervalInSeconds());
        return builder;
    }
}
