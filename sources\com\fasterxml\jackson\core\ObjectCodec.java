package com.fasterxml.jackson.core;

import java.io.IOException;

public abstract class ObjectCodec extends TreeCodec implements Versioned {
    protected ObjectCodec() {
    }

    public abstract <T extends TreeNode> T readTree(JsonParser jsonParser) throws IOException;

    public abstract void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException;
}
