package com.soundcloud.flippernative.api;

public class impression_connection_type_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected impression_connection_type_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(impression_connection_type_t impression_connection_type_t) {
        if (impression_connection_type_t == null) {
            return 0;
        }
        return impression_connection_type_t.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_impression_connection_type_t(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public impression_connection_type_t_value getValue() {
        return impression_connection_type_t_value.swigToEnum(PlayerJniJNI.impression_connection_type_t_value_get(this.swigCPtr, this));
    }

    public impression_connection_type_t_value get_value() {
        return impression_connection_type_t_value.swigToEnum(PlayerJniJNI.impression_connection_type_t_get_value(this.swigCPtr, this));
    }

    public void setValue(impression_connection_type_t_value impression_connection_type_t_value) {
        PlayerJniJNI.impression_connection_type_t_value_set(this.swigCPtr, this, impression_connection_type_t_value.swigValue());
    }

    public String toString() {
        return PlayerJniJNI.impression_connection_type_t_toString(this.swigCPtr, this);
    }

    public impression_connection_type_t(impression_connection_type_t_value impression_connection_type_t_value) {
        this(PlayerJniJNI.new_impression_connection_type_t__SWIG_0(impression_connection_type_t_value.swigValue()), true);
    }

    public impression_connection_type_t() {
        this(PlayerJniJNI.new_impression_connection_type_t__SWIG_1(), true);
    }
}
