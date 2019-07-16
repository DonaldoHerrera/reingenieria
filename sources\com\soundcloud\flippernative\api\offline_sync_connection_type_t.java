package com.soundcloud.flippernative.api;

public class offline_sync_connection_type_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected offline_sync_connection_type_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(offline_sync_connection_type_t offline_sync_connection_type_t) {
        if (offline_sync_connection_type_t == null) {
            return 0;
        }
        return offline_sync_connection_type_t.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_offline_sync_connection_type_t(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public offline_sync_connection_type_t_value getValue() {
        return offline_sync_connection_type_t_value.swigToEnum(PlayerJniJNI.offline_sync_connection_type_t_value_get(this.swigCPtr, this));
    }

    public offline_sync_connection_type_t_value get_value() {
        return offline_sync_connection_type_t_value.swigToEnum(PlayerJniJNI.offline_sync_connection_type_t_get_value(this.swigCPtr, this));
    }

    public void setValue(offline_sync_connection_type_t_value offline_sync_connection_type_t_value) {
        PlayerJniJNI.offline_sync_connection_type_t_value_set(this.swigCPtr, this, offline_sync_connection_type_t_value.swigValue());
    }

    public String toString() {
        return PlayerJniJNI.offline_sync_connection_type_t_toString(this.swigCPtr, this);
    }

    public offline_sync_connection_type_t(offline_sync_connection_type_t_value offline_sync_connection_type_t_value) {
        this(PlayerJniJNI.new_offline_sync_connection_type_t__SWIG_0(offline_sync_connection_type_t_value.swigValue()), true);
    }

    public offline_sync_connection_type_t() {
        this(PlayerJniJNI.new_offline_sync_connection_type_t__SWIG_1(), true);
    }
}
