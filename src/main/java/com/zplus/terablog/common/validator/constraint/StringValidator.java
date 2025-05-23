package com.zplus.terablog.common.validator.constraint;

import com.zplus.terablog.common.validator.annotion.NotBlank;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 不为空字符串
 *     ndy Chen
 * @date 9/30/19 1:10 PM
 */
public class StringValidator implements ConstraintValidator<NotBlank, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || StringUtils.isBlank(value)) {
            return false;
        }
        return true;
    }
}
