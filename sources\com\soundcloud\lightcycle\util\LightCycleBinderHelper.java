package com.soundcloud.lightcycle.util;

import com.soundcloud.lightcycle.LightCycleDispatcher;
import com.soundcloud.lightcycle.LightCycles;

public class LightCycleBinderHelper {
    private final LightCycleDispatcher<?> dispatcher;
    private boolean isBound = false;

    public LightCycleBinderHelper(LightCycleDispatcher<?> lightCycleDispatcher) {
        this.dispatcher = lightCycleDispatcher;
    }

    public void bindIfNecessary() {
        if (!this.isBound) {
            LightCycles.bind(this.dispatcher);
            this.isBound = true;
        }
    }
}
