package com.yun.yunojcodesandbox.codesandbox;

import com.yun.yunojcodesandbox.model.ExecuteCodeRequest;
import com.yun.yunojcodesandbox.model.ExecuteCodeResponse;

/**
 * Created with IntelliJ IDEA.
 * @Author: __yun
 * @Date: 2024/09/02/20:13
 * @Description: 
 */public interface CodeSandbox {
     ExecuteCodeResponse execute(ExecuteCodeRequest executeCodeRequest);
}
