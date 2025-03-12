package com.zplus.terablog.common.validator.annotion;

import com.zplus.terablog.common.validator.Messages;
import com.zplus.terablog.common.validator.constraint.RangValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;

/**
 * 数字的范围约束
 * 
 *     ndy Chen
 * @date 9/30/19 12:33 PM
 */
@Target({TYPE, ANNOTATION_TYPE,FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {RangValidator.class})
public @interface Range {
    long min() default 0;

    long max() default Long.MAX_VALUE;

    String message() default Messages.CK_RANGE_DEFAULT;

    String value() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
