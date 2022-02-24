import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

            // System.out.println(Runtime.getRuntime().availableProcessors());
            // System.out.println(ForkJoinPool.commonPool());

            List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
            // list.stream().parallel().forEach(integer -> print(integer));


            list.stream().parallel()
                    .map(MainClass::transform)
                    .forEach(val -> print(val));

        }

        @SneakyThrows
        private static Integer transform(Integer integer)  {
            System.out.println(integer +" [transform] "+Thread.currentThread());
            Thread.sleep(1000);
            return  integer;
        }
        @SneakyThrows
        private static void print(Integer integer) {
            System.out.println(integer +" [print] "+Thread.currentThread());
        }
    }

