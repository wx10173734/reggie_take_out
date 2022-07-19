package com.lzc.common;
/**
 * @author luozouchen
 * @date 2022/7/19
 * @apiNote
 */

/**
 * 自定义业务异常
 */
public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
