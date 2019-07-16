package com.soundcloud.flippernative.api;

public class PropertyAnyEvent {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected PropertyAnyEvent(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(PropertyAnyEvent propertyAnyEvent) {
        if (propertyAnyEvent == null) {
            return 0;
        }
        return propertyAnyEvent.swigCPtr;
    }

    public AnyEvent const_get_value() {
        return new AnyEvent(PlayerJniJNI.PropertyAnyEvent_const_get_value(this.swigCPtr, this), false);
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_PropertyAnyEvent(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public AnyEvent get_value() {
        return new AnyEvent(PlayerJniJNI.PropertyAnyEvent_get_value(this.swigCPtr, this), false);
    }

    public boolean hasValue() {
        return PlayerJniJNI.PropertyAnyEvent_hasValue(this.swigCPtr, this);
    }

    public void set_value(AnyEvent anyEvent) {
        PlayerJniJNI.PropertyAnyEvent_set_value(this.swigCPtr, this, AnyEvent.getCPtr(anyEvent), anyEvent);
    }

    public PropertyAnyEvent() {
        this(PlayerJniJNI.new_PropertyAnyEvent(), true);
    }
}
