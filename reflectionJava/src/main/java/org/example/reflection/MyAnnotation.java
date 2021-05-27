package org.example.reflection;

import java.lang.annotation.*;

/*
 * 애노테이션은 기본적으로 주석과 같다, 물론 기능이 좀 더 있지만
 * 근복저으로는 주석이랑 같은 취급을 받음
 * 정보가 소스에도 남고 클래스에도 남는다
 * 바이트코드를 로딩했을 때 메모리에는 남지 않는다.
 * 런타임에 메모리에 남기려면 @Retention(RetentionPolicy.RUNTIME) 옵션을 부여하면 된다.
 * */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD}) // 애노테이션을 사용할 수 있는 위치 지정
@Inherited // 상속이되는 애노테이션임
public @interface MyAnnotation {

    String name() default "hoon";

    int number() default 100;
}
