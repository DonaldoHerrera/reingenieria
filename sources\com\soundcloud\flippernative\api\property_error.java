package com.soundcloud.flippernative.api;

public class property_error {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected property_error(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(property_error property_error) {
        if (property_error == null) {
            return 0;
        }
        return property_error.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_property_error(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public property_error(String str) {
        this(PlayerJniJNI.new_property_error__SWIG_0(str), true);
    }
}
