package com.soundcloud.android.features.record;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.soundcloud.android.features.record.z reason: case insensitive filesystem */
/* compiled from: BufferUtils */
public class C3673z {
    private C3673z() {
    }

    public static ByteBuffer a(int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        return allocateDirect;
    }
}
