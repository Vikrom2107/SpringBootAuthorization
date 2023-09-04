package ru.netology.springbootauthorization.exception;

public class InvalidData extends RuntimeException {
    public InvalidData(String msg) {
        super(msg);
    }
}
