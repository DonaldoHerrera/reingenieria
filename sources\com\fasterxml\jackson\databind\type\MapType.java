package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

public final class MapType extends MapLikeType {
    private MapType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2, javaType3, obj, obj2, z);
    }

    public static MapType construct(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3) {
        MapType mapType = new MapType(cls, typeBindings, javaType, javaTypeArr, javaType2, javaType3, null, null, false);
        return mapType;
    }

    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        MapType mapType = new MapType(cls, typeBindings, javaType, javaTypeArr, this._keyType, this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
        return mapType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[map type; class ");
        sb.append(this._class.getName());
        sb.append(", ");
        sb.append(this._keyType);
        sb.append(" -> ");
        sb.append(this._valueType);
        sb.append("]");
        return sb.toString();
    }

    public JavaType withContentType(JavaType javaType) {
        if (this._valueType == javaType) {
            return this;
        }
        MapType mapType = new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, javaType, this._valueHandler, this._typeHandler, this._asStatic);
        return mapType;
    }

    public MapType withKeyType(JavaType javaType) {
        if (javaType == this._keyType) {
            return this;
        }
        MapType mapType = new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, javaType, this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
        return mapType;
    }

    public MapType withKeyValueHandler(Object obj) {
        MapType mapType = new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType.withValueHandler(obj), this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
        return mapType;
    }

    public MapType withContentTypeHandler(Object obj) {
        MapType mapType = new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType.withTypeHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
        return mapType;
    }

    public MapType withContentValueHandler(Object obj) {
        MapType mapType = new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType.withValueHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
        return mapType;
    }

    public MapType withStaticTyping() {
        if (this._asStatic) {
            return this;
        }
        MapType mapType = new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType.withStaticTyping(), this._valueType.withStaticTyping(), this._valueHandler, this._typeHandler, true);
        return mapType;
    }

    public MapType withTypeHandler(Object obj) {
        MapType mapType = new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType, this._valueHandler, obj, this._asStatic);
        return mapType;
    }

    public MapType withValueHandler(Object obj) {
        MapType mapType = new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType, obj, this._typeHandler, this._asStatic);
        return mapType;
    }
}
