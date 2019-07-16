package com.soundcloud.android.creators.record.jni;

import java.io.IOException;

public class EncoderException extends IOException {
    public EncoderException(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(VorbisConstants.getString(i));
        super(sb.toString());
    }
}
