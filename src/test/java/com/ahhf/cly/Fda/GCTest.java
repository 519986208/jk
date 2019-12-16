package com.ahhf.cly.Fda;

import java.util.ArrayList;
import java.util.List;

public class GCTest {

    public static void main(String[] args) {
        final int _1mb = 1024 * 1024;
        List<Object> list = new ArrayList<Object>();
        while (true) {
            list.add(new byte[_1mb]);
        }
    }

}