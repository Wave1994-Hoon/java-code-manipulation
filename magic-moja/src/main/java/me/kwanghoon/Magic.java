package me.kwanghoon;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE) // class로 설정하는건 바이트 코드까지 남는 것이기 때문에 소스레벨 까지만 남기는 것이 맞다.
public @interface Magic {
}
