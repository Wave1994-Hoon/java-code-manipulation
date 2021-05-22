package byrecode;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Masulsa {

    public static void main(String[] args) {
//        try {
//            new ByteBuddy().redefine(Moja.class)
//                    .method(named("pullOut")).intercept(FixedValue.value("Rabbit!"))
//                    .make().saveIn(new File("/Users/kwanghun.kim/Desktop/study-space/java-manipulation-study/target/classes/"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        /* VM Option 변경 필요
        * 클래스를 로딩하는 시점에서 java agent를 거쳐서 변경된 바이트코드를 읽는다.
        * */
        System.out.println(new Moja().pullOut());
    }
}
