package com.soundcloud.flippernative.api;

public class PlayerConfiguration {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected PlayerConfiguration(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(PlayerConfiguration playerConfiguration) {
        if (playerConfiguration == null) {
            return 0;
        }
        return playerConfiguration.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_PlayerConfiguration(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public boolean getAndroidUseOboeSink() {
        return PlayerJniJNI.PlayerConfiguration_androidUseOboeSink_get(this.swigCPtr, this);
    }

    public String getCacheFileName() {
        return PlayerJniJNI.PlayerConfiguration_cacheFileName_get(this.swigCPtr, this);
    }

    public String getCacheKey() {
        return PlayerJniJNI.PlayerConfiguration_cacheKey_get(this.swigCPtr, this);
    }

    public String getCachePath() {
        return PlayerJniJNI.PlayerConfiguration_cachePath_get(this.swigCPtr, this);
    }

    public boolean getCrashOnHang() {
        return PlayerJniJNI.PlayerConfiguration_crashOnHang_get(this.swigCPtr, this);
    }

    public boolean getForceEncryptedHls() {
        return PlayerJniJNI.PlayerConfiguration_forceEncryptedHls_get(this.swigCPtr, this);
    }

    public String getLogfilePath() {
        return PlayerJniJNI.PlayerConfiguration_logfilePath_get(this.swigCPtr, this);
    }

    public long getMaxCacheSize() {
        return PlayerJniJNI.PlayerConfiguration_maxCacheSize_get(this.swigCPtr, this);
    }

    public byte getMinFreeSpacePercentage() {
        return PlayerJniJNI.PlayerConfiguration_minFreeSpacePercentage_get(this.swigCPtr, this);
    }

    public long getNativeBufferSize() {
        return PlayerJniJNI.PlayerConfiguration_nativeBufferSize_get(this.swigCPtr, this);
    }

    public long getProgressUpdateInterval() {
        return PlayerJniJNI.PlayerConfiguration_progressUpdateInterval_get(this.swigCPtr, this);
    }

    public String getTracerEndpoint() {
        return PlayerJniJNI.PlayerConfiguration_tracerEndpoint_get(this.swigCPtr, this);
    }

    public void setAndroidUseOboeSink(boolean z) {
        PlayerJniJNI.PlayerConfiguration_androidUseOboeSink_set(this.swigCPtr, this, z);
    }

    public void setCacheFileName(String str) {
        PlayerJniJNI.PlayerConfiguration_cacheFileName_set(this.swigCPtr, this, str);
    }

    public void setCacheKey(String str) {
        PlayerJniJNI.PlayerConfiguration_cacheKey_set(this.swigCPtr, this, str);
    }

    public void setCachePath(String str) {
        PlayerJniJNI.PlayerConfiguration_cachePath_set(this.swigCPtr, this, str);
    }

    public void setCrashOnHang(boolean z) {
        PlayerJniJNI.PlayerConfiguration_crashOnHang_set(this.swigCPtr, this, z);
    }

    public void setForceEncryptedHls(boolean z) {
        PlayerJniJNI.PlayerConfiguration_forceEncryptedHls_set(this.swigCPtr, this, z);
    }

    public void setLogfilePath(String str) {
        PlayerJniJNI.PlayerConfiguration_logfilePath_set(this.swigCPtr, this, str);
    }

    public void setMaxCacheSize(long j) {
        PlayerJniJNI.PlayerConfiguration_maxCacheSize_set(this.swigCPtr, this, j);
    }

    public void setMinFreeSpacePercentage(byte b) {
        PlayerJniJNI.PlayerConfiguration_minFreeSpacePercentage_set(this.swigCPtr, this, b);
    }

    public void setNativeBufferSize(long j) {
        PlayerJniJNI.PlayerConfiguration_nativeBufferSize_set(this.swigCPtr, this, j);
    }

    public void setProgressUpdateInterval(long j) {
        PlayerJniJNI.PlayerConfiguration_progressUpdateInterval_set(this.swigCPtr, this, j);
    }

    public void setTracerEndpoint(String str) {
        PlayerJniJNI.PlayerConfiguration_tracerEndpoint_set(this.swigCPtr, this, str);
    }

    public PlayerConfiguration(String str, String str2, long j, byte b, long j2, boolean z, String str3) {
        this(PlayerJniJNI.new_PlayerConfiguration__SWIG_0(str, str2, j, b, j2, z, str3), true);
    }

    public PlayerConfiguration(String str, String str2, long j, byte b, long j2, boolean z) {
        this(PlayerJniJNI.new_PlayerConfiguration__SWIG_1(str, str2, j, b, j2, z), true);
    }

    public PlayerConfiguration(String str, String str2, long j, byte b, long j2) {
        this(PlayerJniJNI.new_PlayerConfiguration__SWIG_2(str, str2, j, b, j2), true);
    }

    public PlayerConfiguration(String str, String str2, long j, byte b, long j2, boolean z, String str3, boolean z2, boolean z3) {
        this(PlayerJniJNI.new_PlayerConfiguration__SWIG_3(str, str2, j, b, j2, z, str3, z2, z3), true);
    }

    public PlayerConfiguration() {
        this(PlayerJniJNI.new_PlayerConfiguration__SWIG_4(), true);
    }
}
