package com.yun.yunojcodesandbox.codesandbox.impl;

import com.yun.yunojcodesandbox.model.ExecuteCodeRequest;
import com.yun.yunojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * Java 原生代码沙箱实现（直接复用模板方法）
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {

    @Override
    public ExecuteCodeResponse execute(ExecuteCodeRequest executeCodeRequest) {
        return super.execute(executeCodeRequest);
    }
}
