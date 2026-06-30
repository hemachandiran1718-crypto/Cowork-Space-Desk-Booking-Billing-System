package com.cowork.util;

public class SlotAlreadyBookedException extends Exception {
    public SlotAlreadyBookedException(String msg) {
        super(msg);
    }
}