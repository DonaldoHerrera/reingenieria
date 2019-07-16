package com.soundcloud.flippernative.api;

public class PropertyRequiredSecureUri {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected PropertyRequiredSecureUri(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(PropertyRequiredSecureUri propertyRequiredSecureUri) {
        if (propertyRequiredSecureUri == null) {
            return 0;
        }
        return propertyRequiredSecureUri.swigCPtr;
    }

    public String const_get_value() {
        return PlayerJniJNI.PropertyRequiredSecureUri_const_get_value(this.swigCPtr, this);
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_PropertyRequiredSecureUri(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public SWIGTYPE_p_std__string get_unprotected_value() {
        return new SWIGTYPE_p_std__string(PlayerJniJNI.PropertyRequiredSecureUri_get_unprotected_value(this.swigCPtr, this), false);
    }

    public SWIGTYPE_p_std__string get_value() {
        return new SWIGTYPE_p_std__string(PlayerJniJNI.PropertyRequiredSecureUri_get_value(this.swigCPtr, this), false);
    }

    public void set_value(String str) {
        PlayerJniJNI.PropertyRequiredSecureUri_set_value(this.swigCPtr, this, str);
    }

    public PropertyRequiredSecureUri() {
        this(PlayerJniJNI.new_PropertyRequiredSecureUri(), true);
    }
}
