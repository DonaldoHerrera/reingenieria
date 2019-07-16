package com.soundcloud.flippernative.api;

public class CustomLogger {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected CustomLogger(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(CustomLogger customLogger) {
        if (customLogger == null) {
            return 0;
        }
        return customLogger.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_CustomLogger(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public void log(LoggingLevel loggingLevel, String str) {
        PlayerJniJNI.CustomLogger_log(this.swigCPtr, this, loggingLevel.swigValue(), str);
    }

    /* access modifiers changed from: protected */
    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        PlayerJniJNI.CustomLogger_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        PlayerJniJNI.CustomLogger_change_ownership(this, this.swigCPtr, true);
    }

    public CustomLogger() {
        this(PlayerJniJNI.new_CustomLogger(), true);
        PlayerJniJNI.CustomLogger_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }
}
