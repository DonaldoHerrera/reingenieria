package com.soundcloud.flippernative.api;

public class PlayerConfigurationBuilder {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected PlayerConfigurationBuilder(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(PlayerConfigurationBuilder playerConfigurationBuilder) {
        if (playerConfigurationBuilder == null) {
            return 0;
        }
        return playerConfigurationBuilder.swigCPtr;
    }

    public PlayerConfiguration build() {
        return new PlayerConfiguration(PlayerJniJNI.PlayerConfigurationBuilder_build(this.swigCPtr, this), true);
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_PlayerConfigurationBuilder(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public PlayerConfigurationBuilder setAndroidUseOboeSink(boolean z) {
        return new PlayerConfigurationBuilder(PlayerJniJNI.PlayerConfigurationBuilder_setAndroidUseOboeSink(this.swigCPtr, this, z), false);
    }

    public PlayerConfigurationBuilder setCacheFileName(String str) {
        return new PlayerConfigurationBuilder(PlayerJniJNI.PlayerConfigurationBuilder_setCacheFileName(this.swigCPtr, this, str), false);
    }

    public PlayerConfigurationBuilder setCacheKey(String str) {
        return new PlayerConfigurationBuilder(PlayerJniJNI.PlayerConfigurationBuilder_setCacheKey(this.swigCPtr, this, str), false);
    }

    public PlayerConfigurationBuilder setCachePath(String str) {
        return new PlayerConfigurationBuilder(PlayerJniJNI.PlayerConfigurationBuilder_setCachePath(this.swigCPtr, this, str), false);
    }

    public PlayerConfigurationBuilder setCrashOnHang(boolean z) {
        return new PlayerConfigurationBuilder(PlayerJniJNI.PlayerConfigurationBuilder_setCrashOnHang(this.swigCPtr, this, z), false);
    }

    public PlayerConfigurationBuilder setForceEncryptedHls(boolean z) {
        return new PlayerConfigurationBuilder(PlayerJniJNI.PlayerConfigurationBuilder_setForceEncryptedHls(this.swigCPtr, this, z), false);
    }

    public PlayerConfigurationBuilder setLogfilePath(String str) {
        return new PlayerConfigurationBuilder(PlayerJniJNI.PlayerConfigurationBuilder_setLogfilePath(this.swigCPtr, this, str), false);
    }

    public PlayerConfigurationBuilder setMaxCacheSize(long j) {
        return new PlayerConfigurationBuilder(PlayerJniJNI.PlayerConfigurationBuilder_setMaxCacheSize(this.swigCPtr, this, j), false);
    }

    public PlayerConfigurationBuilder setMinFreeSpacePercentage(byte b) {
        return new PlayerConfigurationBuilder(PlayerJniJNI.PlayerConfigurationBuilder_setMinFreeSpacePercentage(this.swigCPtr, this, b), false);
    }

    public PlayerConfigurationBuilder setNativeBufferSize(long j) {
        return new PlayerConfigurationBuilder(PlayerJniJNI.PlayerConfigurationBuilder_setNativeBufferSize(this.swigCPtr, this, j), false);
    }

    public PlayerConfigurationBuilder setProgressUpdateInterval(long j) {
        return new PlayerConfigurationBuilder(PlayerJniJNI.PlayerConfigurationBuilder_setProgressUpdateInterval(this.swigCPtr, this, j), false);
    }

    public PlayerConfigurationBuilder setTracerEndpoint(String str) {
        return new PlayerConfigurationBuilder(PlayerJniJNI.PlayerConfigurationBuilder_setTracerEndpoint(this.swigCPtr, this, str), false);
    }

    public PlayerConfigurationBuilder() {
        this(PlayerJniJNI.new_PlayerConfigurationBuilder(), true);
    }
}
