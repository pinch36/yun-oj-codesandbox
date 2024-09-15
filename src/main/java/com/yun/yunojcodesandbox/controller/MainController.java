package com.yun.yunojcodesandbox.controller;

import com.yun.yunojcodesandbox.codesandbox.CodeSandbox;
import com.yun.yunojcodesandbox.model.ExecuteCodeRequest;
import com.yun.yunojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: __yun
 * @Date: 2024/09/03/7:14
 * @Description:
 */
@RestController
public class MainController {
    @Resource
    private CodeSandbox javaNativeCodeSandbox;
    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    @PostMapping("/execute")
    ExecuteCodeResponse execute(@RequestBody ExecuteCodeRequest executeCodeRequest, HttpServletRequest request,
                                    HttpServletResponse response) {
        if (executeCodeRequest == null) {
            throw new RuntimeException("请求参数为空");
        }
        return javaNativeCodeSandbox.execute(executeCodeRequest);
    }
}
