package com.soundcloud.flippernative.api;

public class item_interaction_link_type_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected item_interaction_link_type_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(item_interaction_link_type_t item_interaction_link_type_t) {
        if (item_interaction_link_type_t == null) {
            return 0;
        }
        return item_interaction_link_type_t.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_item_interaction_link_type_t(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public item_interaction_link_type_t_value getValue() {
        return item_interaction_link_type_t_value.swigToEnum(PlayerJniJNI.item_interaction_link_type_t_value_get(this.swigCPtr, this));
    }

    public item_interaction_link_type_t_value get_value() {
        return item_interaction_link_type_t_value.swigToEnum(PlayerJniJNI.item_interaction_link_type_t_get_value(this.swigCPtr, this));
    }

    public void setValue(item_interaction_link_type_t_value item_interaction_link_type_t_value) {
        PlayerJniJNI.item_interaction_link_type_t_value_set(this.swigCPtr, this, item_interaction_link_type_t_value.swigValue());
    }

    public String toString() {
        return PlayerJniJNI.item_interaction_link_type_t_toString(this.swigCPtr, this);
    }

    public item_interaction_link_type_t(item_interaction_link_type_t_value item_interaction_link_type_t_value) {
        this(PlayerJniJNI.new_item_interaction_link_type_t__SWIG_0(item_interaction_link_type_t_value.swigValue()), true);
    }

    public item_interaction_link_type_t() {
        this(PlayerJniJNI.new_item_interaction_link_type_t__SWIG_1(), true);
    }
}
