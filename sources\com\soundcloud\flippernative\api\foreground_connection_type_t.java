package com.soundcloud.flippernative.api;

public class foreground_connection_type_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected foreground_connection_type_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(foreground_connection_type_t foreground_connection_type_t) {
        if (foreground_connection_type_t == null) {
            return 0;
        }
        return foreground_connection_type_t.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_foreground_connection_type_t(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public foreground_connection_type_t_value getValue() {
        return foreground_connection_type_t_value.swigToEnum(PlayerJniJNI.foreground_connection_type_t_value_get(this.swigCPtr, this));
    }

    public foreground_connection_type_t_value get_value() {
        return foreground_connection_type_t_value.swigToEnum(PlayerJniJNI.foreground_connection_type_t_get_value(this.swigCPtr, this));
    }

    public void setValue(foreground_connection_type_t_value foreground_connection_type_t_value) {
        PlayerJniJNI.foreground_connection_type_t_value_set(this.swigCPtr, this, foreground_connection_type_t_value.swigValue());
    }

    public String toString() {
        return PlayerJniJNI.foreground_connection_type_t_toString(this.swigCPtr, this);
    }

    public foreground_connection_type_t(foreground_connection_type_t_value foreground_connection_type_t_value) {
        this(PlayerJniJNI.new_foreground_connection_type_t__SWIG_0(foreground_connection_type_t_value.swigValue()), true);
    }

    public foreground_connection_type_t() {
        this(PlayerJniJNI.new_foreground_connection_type_t__SWIG_1(), true);
    }
}
