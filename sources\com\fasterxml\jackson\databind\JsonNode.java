package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.JsonSerializable.Base;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Iterator;

public abstract class JsonNode extends Base implements TreeNode, Iterable<JsonNode> {
    protected JsonNode() {
    }

    public abstract String asText();

    public Iterator<JsonNode> elements() {
        return ClassUtil.emptyIterator();
    }

    public boolean isArray() {
        return false;
    }

    public final Iterator<JsonNode> iterator() {
        return elements();
    }

    public abstract String toString();
}
