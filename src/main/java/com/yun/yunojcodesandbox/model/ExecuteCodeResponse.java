package com.yun.yunojcodesandbox.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: __yun
 * @Date: 2024/09/02/10:20
 * @Description:
 */
@Data
public class ExecuteCodeResponse {
    private List<String> output;
    private String message;
    private Integer status;
    private JudgeInfo judgeInfo;
}
