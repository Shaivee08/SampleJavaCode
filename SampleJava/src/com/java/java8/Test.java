package com.java.java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {


    Predicate<String> ps = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return false;
        }
    };

    Consumer<String> cs = new Consumer<String>() {
        @Override
        public void accept(String s) {

        }
    };

    Supplier<String> sp = new Supplier<String>() {
        @Override
        public String get() {
            return null;
        }
    };

    Function<String,String> fs = new Function<String, String>() {
        @Override
        public String apply(String s) {
            return null;
        }
    };

    public static void main(String[] args) {




    }



}
