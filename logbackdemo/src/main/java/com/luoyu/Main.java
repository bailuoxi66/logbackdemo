package com.luoyu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/7/17 1:56 上午
 * @description
 */

public class Main {

    //logback默认已经实现了slf4j这个门面
    static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        LOGGER.info("logback demo");
    }
}
