package com.zqj.mianshimiao.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 题库题目
 * @TableName question_bank_question
 */
@TableName(value ="question_bank_question")
@Data
public class QuestionBankQuestion {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 题库id
     */
    private Long questionBankId;

    /**
     * 题目id
     */
    private Long questionId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}