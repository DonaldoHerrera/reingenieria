package com.google.android.gms.internal.firebase-perf;

public enum A {
    APP_START_TRACE_NAME("_as"),
    ON_CREATE_TRACE_NAME("_astui"),
    ON_START_TRACE_NAME("_astfd"),
    ON_RESUME_TRACE_NAME("_asti"),
    FOREGROUND_TRACE_NAME("_fs"),
    BACKGROUND_TRACE_NAME("_bs");
    
    private String h;

    private A(String str) {
        this.h = str;
    }

    public final String toString() {
        return this.h;
    }
}
