package com.soundcloud.flippernative.api;

public class click_connection_type_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected click_connection_type_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(click_connection_type_t click_connection_type_t) {
        if (click_connection_type_t == null) {
            return 0;
        }
        return click_connection_type_t.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_click_connection_type_t(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public click_connection_type_t_value getValue() {
        return click_connection_type_t_value.swigToEnum(PlayerJniJNI.click_connection_type_t_value_get(this.swigCPtr, this));
    }

    public click_connection_type_t_value get_value() {
        return click_connection_type_t_value.swigToEnum(PlayerJniJNI.click_connection_type_t_get_value(this.swigCPtr, this));
    }

    public void setValue(click_connection_type_t_value click_connection_type_t_value) {
        PlayerJniJNI.click_connection_type_t_value_set(this.swigCPtr, this, click_connection_type_t_value.swigValue());
    }

    public String toString() {
        return PlayerJniJNI.click_connection_type_t_toString(this.swigCPtr, this);
    }

    public click_connection_type_t(click_connection_type_t_value click_connection_type_t_value) {
        this(PlayerJniJNI.new_click_connection_type_t__SWIG_0(click_connection_type_t_value.swigValue()), true);
    }

    public click_connection_type_t() {
        this(PlayerJniJNI.new_click_connection_type_t__SWIG_1(), true);
    }
}
