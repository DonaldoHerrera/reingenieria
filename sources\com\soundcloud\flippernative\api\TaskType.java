package com.soundcloud.flippernative.api;

public final class TaskType {
    public static final TaskType Normal = new TaskType("Normal", PlayerJniJNI.Normal_get());
    public static final TaskType Sticky = new TaskType("Sticky");
    private static int swigNext = 0;
    private static TaskType[] swigValues = {Normal, Sticky};
    private final String swigName;
    private final int swigValue;

    private TaskType(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static TaskType swigToEnum(int i) {
        TaskType[] taskTypeArr = swigValues;
        if (i < taskTypeArr.length && i >= 0 && taskTypeArr[i].swigValue == i) {
            return taskTypeArr[i];
        }
        int i2 = 0;
        while (true) {
            TaskType[] taskTypeArr2 = swigValues;
            if (i2 >= taskTypeArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(TaskType.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (taskTypeArr2[i2].swigValue == i) {
                return taskTypeArr2[i2];
            } else {
                i2++;
            }
        }
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    private TaskType(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private TaskType(String str, TaskType taskType) {
        this.swigName = str;
        this.swigValue = taskType.swigValue;
        swigNext = this.swigValue + 1;
    }
}
