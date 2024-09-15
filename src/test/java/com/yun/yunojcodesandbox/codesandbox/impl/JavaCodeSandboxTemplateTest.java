package com.yun.yunojcodesandbox.codesandbox.impl;

import com.yun.yunojcodesandbox.model.ExecuteCodeRequest;
import com.yun.yunojcodesandbox.model.ExecuteCodeResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: __yun
 * @Date: 2024/09/03/7:21
 * @Description:
 */
@SpringBootTest
@Slf4j
class JavaCodeSandboxTemplateTest {
    @Resource
    private JavaCodeSandboxTemplate javaCodeSandboxTemplate;

    @Test
    void execute() {
        ExecuteCodeRequest executeCodeRequest = new ExecuteCodeRequest();
        executeCodeRequest.setLanguage("java");
        executeCodeRequest.setCode("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        int a = Integer.parseInt(args[0]);\n" +
                "        int b = Integer.parseInt(args[1]);\n" +
                "        System.out.println(\"结果:\" + (a + b));\n" +
                "    }\n" +
                "}\n");
        ArrayList<String> list = new ArrayList<>();
        list.add("1 2");
        executeCodeRequest.setInput(list);
        ExecuteCodeResponse execute = javaCodeSandboxTemplate.execute(executeCodeRequest);
        log.info("运行结果：{}",execute);
    }
}