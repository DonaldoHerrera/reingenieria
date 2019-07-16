package com.soundcloud.flippernative.api;

public class AnyEvent extends BaseAnyEvent {
    private transient long swigCPtr;

    protected AnyEvent(long j, boolean z) {
        super(PlayerJniJNI.AnyEvent_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    protected static long getCPtr(AnyEvent anyEvent) {
        if (anyEvent == null) {
            return 0;
        }
        return anyEvent.swigCPtr;
    }

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                PlayerJniJNI.delete_AnyEvent(this.swigCPtr);
            }
            this.swigCPtr = 0;
        }
        super.delete();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public AnyEvent() {
        this(PlayerJniJNI.new_AnyEvent__SWIG_0(), true);
    }

    public AnyEvent(AnyEvent anyEvent) {
        this(PlayerJniJNI.new_AnyEvent__SWIG_1(getCPtr(anyEvent), anyEvent), true);
    }
}
