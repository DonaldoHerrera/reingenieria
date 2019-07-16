package com.soundcloud.flippernative.api;

public class UriStringSanitizer {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected UriStringSanitizer(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(UriStringSanitizer uriStringSanitizer) {
        if (uriStringSanitizer == null) {
            return 0;
        }
        return uriStringSanitizer.swigCPtr;
    }

    public static String sanitize(String str) {
        return PlayerJniJNI.UriStringSanitizer_sanitize(str);
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_UriStringSanitizer(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public UriStringSanitizer() {
        this(PlayerJniJNI.new_UriStringSanitizer(), true);
    }
}
