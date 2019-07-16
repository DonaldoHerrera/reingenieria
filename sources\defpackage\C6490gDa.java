package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.node.ObjectNode;

/* renamed from: gDa reason: default package and case insensitive filesystem */
/* compiled from: ApiTrackMediaDeserializer.kt */
public final class C6490gDa extends JsonDeserializer<Zda> {
    public Zda deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        C7471uYa.b(jsonParser, "jsonParser");
        C7471uYa.b(deserializationContext, "deserializationContext");
        TreeNode readTree = jsonParser.getCodec().readTree(jsonParser);
        C7471uYa.a((Object) readTree, "jsonParser.codec.readTree<JsonNode>(jsonParser)");
        if (readTree instanceof ObjectNode) {
            String objectNode = ((ObjectNode) readTree).toString();
            C7471uYa.a((Object) objectNode, "jsonNode.toString()");
            return new Zda(objectNode);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(readTree);
        sb.append(" not of type ");
        sb.append(ObjectNode.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }
}
