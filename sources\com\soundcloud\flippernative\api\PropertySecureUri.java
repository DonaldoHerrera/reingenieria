package com.soundcloud.flippernative.api;

public class PropertySecureUri extends PropertyString {
    private transient long swigCPtr;

    protected PropertySecureUri(long j, boolean z) {
        super(PlayerJniJNI.PropertySecureUri_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    protected static long getCPtr(PropertySecureUri propertySecureUri) {
        if (propertySecureUri == null) {
            return 0;
        }
        return propertySecureUri.swigCPtr;
    }

    public String const_get_value() {
        return PlayerJniJNI.PropertySecureUri_const_get_value(this.swigCPtr, this);
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_PropertySecureUri(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
        super.delete();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public SWIGTYPE_p_std__string get_unprotected_value() {
        return new SWIGTYPE_p_std__string(PlayerJniJNI.PropertySecureUri_get_unprotected_value(this.swigCPtr, this), false);
    }

    public SWIGTYPE_p_std__string get_value() {
        return new SWIGTYPE_p_std__string(PlayerJniJNI.PropertySecureUri_get_value(this.swigCPtr, this), false);
    }

    public void set_value(String str) {
        PlayerJniJNI.PropertySecureUri_set_value(this.swigCPtr, this, str);
    }

    public PropertySecureUri() {
        this(PlayerJniJNI.new_PropertySecureUri(), true);
    }
}
