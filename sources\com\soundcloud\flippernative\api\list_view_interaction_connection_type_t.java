package com.soundcloud.flippernative.api;

public class list_view_interaction_connection_type_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected list_view_interaction_connection_type_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(list_view_interaction_connection_type_t list_view_interaction_connection_type_t) {
        if (list_view_interaction_connection_type_t == null) {
            return 0;
        }
        return list_view_interaction_connection_type_t.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_list_view_interaction_connection_type_t(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public list_view_interaction_connection_type_t_value getValue() {
        return list_view_interaction_connection_type_t_value.swigToEnum(PlayerJniJNI.list_view_interaction_connection_type_t_value_get(this.swigCPtr, this));
    }

    public list_view_interaction_connection_type_t_value get_value() {
        return list_view_interaction_connection_type_t_value.swigToEnum(PlayerJniJNI.list_view_interaction_connection_type_t_get_value(this.swigCPtr, this));
    }

    public void setValue(list_view_interaction_connection_type_t_value list_view_interaction_connection_type_t_value) {
        PlayerJniJNI.list_view_interaction_connection_type_t_value_set(this.swigCPtr, this, list_view_interaction_connection_type_t_value.swigValue());
    }

    public String toString() {
        return PlayerJniJNI.list_view_interaction_connection_type_t_toString(this.swigCPtr, this);
    }

    public list_view_interaction_connection_type_t(list_view_interaction_connection_type_t_value list_view_interaction_connection_type_t_value) {
        this(PlayerJniJNI.new_list_view_interaction_connection_type_t__SWIG_0(list_view_interaction_connection_type_t_value.swigValue()), true);
    }

    public list_view_interaction_connection_type_t() {
        this(PlayerJniJNI.new_list_view_interaction_connection_type_t__SWIG_1(), true);
    }
}
