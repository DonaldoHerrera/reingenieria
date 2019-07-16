package com.soundcloud.flippernative.api;

public class PropertyString {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected PropertyString(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(PropertyString propertyString) {
        if (propertyString == null) {
            return 0;
        }
        return propertyString.swigCPtr;
    }

    public String const_get_value() {
        return PlayerJniJNI.PropertyString_const_get_value(this.swigCPtr, this);
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_PropertyString(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public SWIGTYPE_p_std__string get_value() {
        return new SWIGTYPE_p_std__string(PlayerJniJNI.PropertyString_get_value(this.swigCPtr, this), false);
    }

    public boolean hasValue() {
        return PlayerJniJNI.PropertyString_hasValue(this.swigCPtr, this);
    }

    public void set_value(String str) {
        PlayerJniJNI.PropertyString_set_value(this.swigCPtr, this, str);
    }

    public PropertyString() {
        this(PlayerJniJNI.new_PropertyString(), true);
    }
}
